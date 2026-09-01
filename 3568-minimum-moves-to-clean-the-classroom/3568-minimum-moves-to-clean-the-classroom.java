class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length, n = classroom[0].length();
        int[][] litterIndex = new int[m][n];
        int sx = 0, sy = 0, litterCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = classroom[i].charAt(j);
                if (c == 'S') {
                    sx = i; sy = j;
                } else if (c == 'L') {
                    litterIndex[i][j] = litterCount;
                    litterCount++;
                }
            }
        }

        if (litterCount == 0) return 0; // nothing to collect

        int fullMask = (1 << litterCount) - 1;
        // visited[row][col][energy][mask]
        boolean[][][][] visited = new boolean[m][n][energy + 1][1 << litterCount];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sx, sy, energy, fullMask});
        visited[sx][sy][energy][fullMask] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int s = 0; s < size; s++) {
                int[] state = queue.poll();
                int x = state[0], y = state[1], eng = state[2], mask = state[3];

                if (mask == 0) return moves; // all litter collected

                if (eng <= 0) continue; // stuck unless already on R (handled by refill logic below)

                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d], ny = y + dy[d];
                    if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                    char c = classroom[nx].charAt(ny);
                    if (c == 'X') continue;

                    int nEnergy = (c == 'R') ? energy : eng - 1;
                    int nMask = mask;
                    if (c == 'L') {
                        nMask &= ~(1 << litterIndex[nx][ny]); // clear that litter's bit
                    }

                    if (!visited[nx][ny][nEnergy][nMask]) {
                        visited[nx][ny][nEnergy][nMask] = true;
                        queue.offer(new int[]{nx, ny, nEnergy, nMask});
                    }
                }
            }
            moves++;
        }

        return -1; // never collected all litter
    }
    }

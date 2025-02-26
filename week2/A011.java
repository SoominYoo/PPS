package week3;

import java.util.*;

class A011 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        // 스테이지별 도달한 플레이어 수를 저장하는 배열
        int[] totalPlayers = new int[N + 1];
        // 스테이지별 클리어하지 못한 플레이어 수를 저장하는 배열
        int[] failedPlayers = new int[N + 1];

        // 스테이지별 도달한 플레이어 수 계산
        for (int stage : stages) {
            for (int i = 1; i <= stage; i++) {
                totalPlayers[i]++;
            }
        }

        // 스테이지별 클리어하지 못한 플레이어 수 계산
        for (int stage : stages) {
            failedPlayers[stage]++;
        }

        // 실패율을 계산하여 리스트에 저장
        List<Stage> failRates = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            double failRate = (double) failedPlayers[i] / totalPlayers[i];
            if (totalPlayers[i] == 0) {
                failRate = 0;
            }
            failRates.add(new Stage(i, failRate));
        }

        // 실패율을 기준으로 내림차순 정렬
        Collections.sort(failRates, (a, b) -> Double.compare(b.failRate, a.failRate));

        // 정렬된 스테이지 번호를 배열에 저장
        for (int i = 0; i < failRates.size(); i++) {
            answer[i] = failRates.get(i).stageNumber;
        }

        return answer;
    }

    // 스테이지 정보를 담는 클래스
    class Stage {
        int stageNumber;
        double failRate;

        public Stage(int stageNumber, double failRate) {
            this.stageNumber = stageNumber;
            this.failRate = failRate;
        }
    }

    public static void main(String[] args) {
        A011 solution = new A011();

        // 예시 1
        int N1 = 5;
        int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution.solution(N1, stages1))); // 출력: [3,4,2,1,5]

        // 예시 2
        int N2 = 4;
        int[] stages2 = {4, 4, 4, 4, 4};
        System.out.println(Arrays.toString(solution.solution(N2, stages2))); // 출력: [4,1,2,3]
    }
}

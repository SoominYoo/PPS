import java.util.Scanner;

public class A005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String skill;
        skill = sc.next();
        int n = sc.nextInt(); // 스킬트리 개수 입력
        String[] skill_trees = new String[n];

        for (int i = 0; i < n; i++) {
            skill_trees[i] = sc.next();
        }

        int result = solution(skill, skill_trees);
        System.out.println(result);
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            String filteredSkillTree = skill_trees[i].replaceAll("[^" + skill + "]", "");

            boolean flag = false;

            for (int j = 0; j < filteredSkillTree.length(); j++) {
                if (skill.charAt(j) != filteredSkillTree.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                answer++;
            }
        }
        return answer;
    }
}

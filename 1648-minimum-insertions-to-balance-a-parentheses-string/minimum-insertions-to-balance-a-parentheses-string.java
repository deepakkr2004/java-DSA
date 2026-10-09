// class Solution {
//     public int minInsertions(String s) {
//         int n = s.length();
//         int result = 0;
//         int count = 0;
//         for(int i=0; i<n; i++){
//             char ch = s.charAt(i);
//             if(ch == '('){
//                 count++;
//                 i++;
//             }else{
//                 if(count > 0){
//                     count--;
//                 }else{
//                     result++;
//                 }
//                 if(i+1 < n && s.charAt(i+1) == ')'){
//                     i += 2;
//                 }else{
//                     result++;
//                     i++;
//                 }
//             }
//         }
//         return result + count*2;
//     }
// }


class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int result = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                count++;
            } else {
                if (i + 1 < n && s.charAt(i + 1) == ')') {
                    i++; // consume the second ')'
                } else {
                    result++; // insert a missing ')'
                }

                if (count > 0) {
                    count--;
                } else {
                    result++; // insert a missing '('
                }
            }
        }

        return result + count * 2;
    }
}

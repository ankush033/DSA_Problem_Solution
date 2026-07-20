class Solution {
    public boolean isPalindrome(String s) {
  int i=0;
  int j=s.length()-1;
  while(i<j){
    while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
        i++;
    }
    while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
        j--;
    }
    if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
        return false;
    }
    i++;
    j--;
  }
  return true;
    }











    }

//       int left=0;int right=s.length()-1;
//       while(left<right){
//         while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
//             left++;
//         }
//         while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
//             right--;
//         }

//         if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
//             return false;
//         }
//         left++;
//         right--;
//       }
//       return true;
//     }
// }









//          String clean ="";
//          for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             if(Character.isLetterOrDigit(ch)){
//                 clean+=Character.toLowerCase(ch);
//             }
//          }

//         for(int i=0;i<clean.length()/2;i++){
//             if(clean.charAt(i)!=clean.charAt(clean.length()-i-1)){
//                 return false;
//             }
//         }
//         return true;
//     }
// } // o(n) : tc and sc : O(n)
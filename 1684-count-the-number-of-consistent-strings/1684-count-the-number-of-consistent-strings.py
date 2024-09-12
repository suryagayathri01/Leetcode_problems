class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        res=0
        for i in words:
            flag=0
            for j in range(len(i)):
                if i[j] not in allowed:
                    flag=1
                if flag==1:
                    break
            if flag==0:
                res+=1
        return res

        
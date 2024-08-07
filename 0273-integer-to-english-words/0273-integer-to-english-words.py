class Solution:
    def numberToWords(self, num: int) -> str:
        digit=[int(i) for i in str(num)]
        number={0:'', 1:'One', 2:'Two', 3:'Three', 4:'Four', 5:'Five', 6:'Six', 7:'Seven', 8:'Eight', 9:'Nine', 10:'Ten', 11:'Eleven', 12:'Twelve', 13:'Thirteen', 14:'Fourteen', 15:'Fifteen', 16:'Sixteen', 17:'Seventeen', 18:'Eighteen', 19:'Nineteen'}
        tens={0:'', 1:'', 2:'Twenty', 3:'Thirty', 4:'Forty', 5:'Fifty', 6:'Sixty', 7:'Seventy', 8:'Eighty', 9:'Ninety'}
        if num==0:
            return 'Zero'
        if len(digit)<2:
            return number[num]
        if len(digit)==2:
            if digit[0]==1:
                return number[num]
            elif digit[1]!=0:
                return (tens[digit[0]]+' '+number[digit[1]])
            else:
                return tens[digit[0]]
        
        def words(n):
            if n<20:
                return number[n]
            elif n<100:
                return tens[n//10]+('' if n%10==0 else ' '+number[n%10])
            else:
                return number[n//100]+' Hundred'+('' if n%100==0 else ' '+words(n%100))

        if len(digit)==3:
            words(num)
        nums=num
        billion,num = divmod(num,1000000000)
        million,num = divmod(num,1000000)
        thousand,num = divmod(num,1000)

        result=[]
        if billion:
            result.append(words(billion)+' Billion'+('' if nums%1000000000==0 else ' '))
        if million:
            result.append(words(million)+' Million'+('' if nums%1000000==0 else ' '))
        if thousand:
            result.append(words(thousand)+' Thousand'+('' if num==0 else ' '))        
        if num:
            result.append(words(num))

        res=''
        return res.join(result)

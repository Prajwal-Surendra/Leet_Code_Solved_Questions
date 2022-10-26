class Solution:
    def romanToInt(self, s: str) -> int:
        Roman = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        s= s.replace('IV','IIII').replace('IX','VIIII')
        s= s.replace('XL','XXXX').replace('XC','LXXXX')
        s= s.replace('CD','CCCC').replace('CM','DCCCC')
        res=0
        for i in s:
            res+=Roman[i]
        return res   
        
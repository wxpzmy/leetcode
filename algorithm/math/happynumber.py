class HappyNumber:
    # @param {integer} n
    # @return {boolean}
    def isHappy(self, n):
        if not n:
            return False;
        buffer = set()
        while n != 1:
            if n in buffer:
                return False;
            buffer.add(n)
            sum = 0
            while n:
                sum += ((n % 10)**2)
                n //= 10
            n = sum
            
        return True

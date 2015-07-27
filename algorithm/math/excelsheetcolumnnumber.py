class ExcelSheetColumnNumber:
    # @param {string} s
    # @return {integer}
    def titleToNumber(self, s):
        num = 0
        base = ord('A')
        for each in s:
           num = num * 26 + ord(each) - base + 1
        return num

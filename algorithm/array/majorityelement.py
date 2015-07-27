class MajorityElement:
    # @param {integer[]} nums
    # @return {integer}
    def majorityElement(self, nums):
        """
        Boyer-Moore majority voting algorithm
        """
        cand = None
        count = 0
        for i in range(len(nums)):
            if count == 0:
                cand = nums[i]
                count = 1
            else:
                if nums[i] == cand:
                    count = count + 1
                else:
                    count = count - 1
                    
        return cand

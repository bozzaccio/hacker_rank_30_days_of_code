def minimum_index(seq):
    if len(seq) == 0:
        raise ValueError("Cannot get the minimum value index from an empty sequence")
    min_idx = 0
    for i in range(1, len(seq)):
        if seq[i] < seq[min_idx]:
            min_idx = i
    return min_idx

class AbstractTest():    
    
    @staticmethod
    def get_array():
        pass
    
    @staticmethod
    def get_expected_result():
        return 0
        
        
class TestDataEmptyArray(AbstractTest):
    
    @staticmethod
    def get_array():
        return []
        
class TestDataUniqueValues(AbstractTest):
    
    @staticmethod
    def get_array():
        return[1,2,3,4]
    

class TestDataExactlyTwoDifferentMinimums(AbstractTest):
    
    @staticmethod
    def get_array():
        return[0,0,1]
    

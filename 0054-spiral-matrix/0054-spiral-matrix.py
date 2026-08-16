class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        spiral = []

        minr = 0
        minc = 0
        maxr = len(matrix)-1
        maxc = len(matrix[0])-1
        
        count = 0
        total = len(matrix) * len(matrix[0])
        
        while count < total:
            
            #Top wall
            for i in range(minc,maxc+1):
                spiral.append(matrix[minr][i])
                count+=1
            
            minr+=1


            # right wall
            for i in range(minr,maxr+1):
                spiral.append(matrix[i][maxc])
                count+=1
            
            maxc -= 1

            #bottom wall
            if minr <= maxr:

                for i in range(maxc,minc-1,-1):
                    spiral.append(matrix[maxr][i])
                    count+=1
                maxr -= 1

            #left wall
            if minc <= maxc:
                for i in range(maxr,minr-1,-1):
                    spiral.append(matrix[i][minc])
                    count+=1
            
                minc += 1
        
        return spiral
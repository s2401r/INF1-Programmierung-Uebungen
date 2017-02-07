module MatrixOperationen where
  import Data.Array
  import Data.Tuple
  import Matrix

  transpose :: Matrix -> Matrix
  transpose a = array (fst(bounds(a)), swap(snd(bounds(a)))) [((y,x),z) | ((x,y),z) <-  [x | x <- assocs(a)]]

  --view (create 3 3 (^))     view (transpose (create 3 3 (^)))
  --[1, 2, 3]                 [1, 1, 1]
  --[1, 4, 9]                 [2, 4, 8]
  --[1, 8, 27]                [3, 9, 27]

  --view (create 3 2 (+))     view (transpose (create 3 2 (+)))
  --[2, 3, 4]                 [2, 3]
  --[3, 4, 5]                 [3, 4]
  --                          [4, 5]

  -- ///////////////////////////////////////////////////////////////
  -- ///////////////////////////////////////////////////////////////

  --mult :: Matrix -> Matrix -> Matrix
  --mult a b = array ((1,1) , (snd (snd (bounds (a))),fst (snd (bounds (b)))))

  --view (create 2 3 (^))     view (create 4 2 (+))
  --[1, 2]                    [2, 3, 4, 5]
  --[1, 4]                    [3, 4, 5, 6]
  --[1, 8]

  --view ( mult (create 2 3 (^)) (create 4 2 (+))))
  --[ 8, 11, 14, 17]
  --[14, 19, 24, 29]
  --[26, 35, 44, 53]

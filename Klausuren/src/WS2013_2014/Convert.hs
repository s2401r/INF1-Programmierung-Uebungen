odule Convert where
  import Data.Char

  convert :: Int -> Int -> String
  convert 1 _ = "1"
  convert a b = intToDigit(mod a b) : convert (div a b) b 

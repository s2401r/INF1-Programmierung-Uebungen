module Convert where
  import Data.Char

  convert :: Int -> Int -> String
  convert a b = convert (div a b) b : intToDigit(mod a b)

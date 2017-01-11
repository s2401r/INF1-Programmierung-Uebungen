module Verzahnen where
  verzahnen :: [a] -> [a] -> [a]
  verzahnen a     []     = a
  verzahnen []     b     = b
  verzahnen (x:a) (y:b) = x : y : verzahnen a b

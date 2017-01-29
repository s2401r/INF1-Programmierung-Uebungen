module Telefonbuch where
  import Data
  import Data.List

  leeresTelefonbuch :: Telefonbuch
  leeresTelefonbuch = []

  eintragen :: String -> String -> Telefonbuch -> Telefonbuch
  eintragen a b c = (a, b) : c

  suche :: String -> Telefonbuch -> String
  suche x lis =  head [ j | (i,j) <- lis, i == x ]

  sucheMuster :: String -> Telefonbuch -> Telefonbuch
  sucheMuster x lis = filter (\(_,a) -> isInfixOf x a) lis

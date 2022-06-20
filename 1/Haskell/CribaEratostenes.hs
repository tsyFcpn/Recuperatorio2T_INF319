eratos :: Integer -> Integer
eratos i n = do
    if n > 1 then
        if i < n then
            if (n % i == 0) then
                putStrLn(eratos (i + 1) n)
                return ()
        else
            putStrLn(eratos 2 (n - 1))
            return n
    else 
        putStrLn(2)
        return ()

main = do
    putStrLn "Criba Recursiva"
    input <- getLine
    let temp = (read input :: Int)
    eratos 2 temp
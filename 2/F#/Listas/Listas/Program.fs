// Más información acerca de F# en http://fsharp.net
// Vea el proyecto "Tutorial de F#" para obtener más ayuda.
open System
let Listas (list:int []) n =
    let mutable key = true
    for i in list do
        if (n = list.[i]) then  
            if (key) then
                printfn"%i" (i + 1)
                key <- false
    printfn"0"

[<EntryPoint>]
let main argv = 
    let list : int[] = [|1; 5; 3; 5; 6; 5; 3; 4|]
    printfn"%A" list
    printfn "%A" "Buscar n elemento: "
    let n = Console.ReadLine()|> int
    let temp = Listas (list) n

    let n = Console.ReadKey()
    0 // devolver un código de salida entero

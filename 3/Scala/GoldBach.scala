object GoldBach {
    def GoldBach() {
        var choice = true
        for (i <- 4 to 100) {
            if (choice) {
                choice = false;
                var temp = i;
                var a = 0;
                var b = 0;
                while (temp > 1) {
                    var esprimo_1 = true;
                    var loop = true;
                    for (j <- 2 to temp) {
                        if (loop) {
                            if (temp % j == 0) { 
                                esprimo_1 = false;
                                loop = false;
                            }
                            if (esprimo_1) {
                                a = temp;
                                loop = false;
                            }
                        }
                    }
                    var temp_2 = temp; 
                    while (temp_2 > 1) {
                        var esprimo_2 = true;
                        loop = true;
                        for (k <- 2 to temp_2) {
                            if (loop) {
                                if (temp_2 % k == 0) {
                                    esprimo_2 = false;
                                    loop = false;
                                }
                                if (esprimo_2) {
                                    b = temp_2;
                                    if (a + b == i) {
                                        print (a + " + " + b + " = " + i + "\n");
                                        loop = false;
                                    }
                                }
                            }
                        }
                        temp_2 = temp_2 - 1
                    }
                    temp = temp - 1
                }
            } else {
                choice = true;
            }
            
        }
    }
    def main(args: Array[String]):Unit = {
        GoldBach()
    }
}
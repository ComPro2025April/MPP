## a. For each lambda expression below, name the parameters and the free variables.

### i. 

    Runnable r = () →
    {
        int[][] products = new int[s][t];
        for (int i = 0; i < s; i++) {
            for(int j = i + 1; j < t; j++) {
                products[i][j] = i * j;
            }
        }
    }

parameters: none

free variables: s, t, products, i, j

### ii.

    Comparator<String> comp = (s, t) →
    {
        if(ignoreCase == true) {
            return s.compareToIgnoreCase(t);
        } else {
            return s.compareTo(t);
        }
    }

parameters: s, t

free variables: ignoreCase
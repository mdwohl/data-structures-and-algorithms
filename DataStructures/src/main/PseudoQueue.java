package main;

public int deQueue () throws Exception {
        if (s2.isEmpty()){
        if (s1.isEmpty()) {
        throw new Exception("EMPTY");
        }
        while (!s1.isEmpty()){
        int p = s1.pop();
        s2.push(p);
        }
        }
        return s2.pop();
        }
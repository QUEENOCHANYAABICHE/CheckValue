package org.app;

/*   You will be given an array a and a value x. All you need to do is check
     whether the provided array contains the value.Array can contain numbers
     or strings. X can be either.Return true if the array contains the value,
      false if not.
*/

import java.util.*;
public class Main {

    public static boolean check(Object[] a, Object x) {
        int size = a.length;
        List<Object> hold = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            hold.add(a[i]);
        }
        for (int i = 0; i < size; i++) {
            if (hold.get(i).equals(x)) {
                return true;
            } else {
            }
        }
        return false;

    }
}
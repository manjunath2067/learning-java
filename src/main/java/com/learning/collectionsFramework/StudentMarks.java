package com.learning.collectionsFramework;

public record StudentMarks(Integer maths, Integer physics) {


//    @Override
//    public int compareTo(StudentMarks o) {
//
//        /*
//            Current object < other object
//                return -1; [any negative number]
//            current object > other object
//                return 1; [any positive number]
//            current object == other object
//                return 0;
//         */
//
////        if (this.maths < 0.maths)
////            return -1;
////        if (this.maths >o.maths)
////            return 1;
////        if (this.maths == o.maths)
////            return 0;
//
//        System.out.println("Comparable compareTo() is called");
//
//        return o.maths - this.maths; // the above 3 lines can be used as one line
//
//
//    }
//
//
}

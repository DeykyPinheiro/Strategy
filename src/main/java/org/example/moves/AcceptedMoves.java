package org.example.moves;

import java.lang.reflect.InvocationTargetException;

public enum AcceptedMoves {

    W {
        @Override
        public Move action() {
            return new Up();
        }
    },
    A {
        @Override
        public Move action() {
            return new Left();
        }
    },
    S {
        @Override
        public Move action() {
            return new Down();
        }
    },
    D {
        @Override
        public Move action() {
            return new Right();
        }
    },
    ;

    public abstract Move action();

}

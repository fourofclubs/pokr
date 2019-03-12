package foc.ca.pokr;

import ca.foc.pokr.Hand;
import fj.F2W;
import fj.data.Option;

import static fj.data.Option.parseInt;

final class Parsers {
    private Parsers() {
        throw new AssertionError();
    }

    static final Option<Hand> parseTwoPair(final String s) {
        final String[] ss = s.split("/+");
        if (ss.length != 2) {
            return Option.none();
        }
        parseInt.f(ss[0]).bind(parseInt.f(ss[1]), new F2W<Integer, Integer, Option<Hand>>() {
            @Override
            public Option<Hand> f(final Integer n1, final Integer n2) {
                return null;
            }
        }.curry());
    }
}

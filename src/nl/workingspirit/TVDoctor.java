package nl.workingspirit;

import nl.workingspirit.model.Television;

public class TVDoctor {

    public static void testTvs(Television[] tvs) {

        for (Television tv : tvs) {
            tv.on();
        }

    }
}

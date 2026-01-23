package com.mux.stats.sdk.core.util;

import java.util.Random;

/* loaded from: classes27.dex */
public class UUID {
    public static String generateUUID() {
        StringBuilder sb;
        String hexString;
        Random random = new Random();
        String string2 = "";
        for (int i = 0; i < 36; i++) {
            int iNextInt = random.nextInt(16);
            char cCharAt = "xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx".charAt(i);
            if (cCharAt == 'x') {
                sb = new StringBuilder();
                sb.append(string2);
                hexString = Integer.toHexString(iNextInt);
            } else if (cCharAt == 'y') {
                sb = new StringBuilder();
                sb.append(string2);
                hexString = Integer.toHexString((iNextInt & 3) | 8);
            } else {
                string2 = string2 + cCharAt;
            }
            sb.append(hexString);
            string2 = sb.toString();
        }
        return string2;
    }
}

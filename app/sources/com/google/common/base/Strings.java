package com.google.common.base;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes27.dex */
public final class Strings {
    public static String lenientFormat(String template, Object... args) {
        int iIndexOf;
        String strValueOf = String.valueOf(template);
        int i = 0;
        if (args == null) {
            args = new Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < args.length; i2++) {
                args[i2] = lenientToString(args[i2]);
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (args.length * 16));
        int i3 = 0;
        while (i < args.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(args[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < args.length) {
            sb.append(" [");
            sb.append(args[i]);
            for (int i4 = i + 1; i4 < args.length; i4++) {
                sb.append(", ");
                sb.append(args[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String lenientToString(Object o) {
        if (o == null) {
            return "null";
        }
        try {
            return o.toString();
        } catch (Exception e) {
            String str = o.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(o));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e);
            return "<" + str + " threw " + e.getClass().getName() + ">";
        }
    }
}

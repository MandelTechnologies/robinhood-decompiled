package com.ionspin.kotlin.bignum.integer.util;

import kotlin.Metadata;

/* compiled from: DigitUtil.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, m3636d2 = {"toDigit", "", "", "base", "bignum"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.ionspin.kotlin.bignum.integer.util.DigitUtilKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class DigitUtil {
    public static final int toDigit(char c, int i) {
        int i2;
        int i3;
        if ('0' <= c && c < ':') {
            i3 = (char) (c - '0');
        } else if ('a' <= c && c < '{') {
            i3 = c - 87;
        } else if ('A' > c || c >= '[') {
            if (65313 <= c && c < 65339) {
                i2 = 65323;
            } else {
                if (65345 > c || c >= 65371) {
                    if (c == '.') {
                        throw new NumberFormatException("Invalid digit for radix " + c + " (Possibly a decimal value, which is not supported by BigInteger parser");
                    }
                    throw new NumberFormatException("Invalid digit for radix " + c);
                }
                i2 = 65355;
            }
            i3 = c - i2;
        } else {
            i3 = c - 55;
        }
        if (i3 >= 0 && i3 < i) {
            return i3;
        }
        throw new NumberFormatException(c + " is not a valid digit for number system with base " + i);
    }
}

package com.google.crypto.tink.subtle;

import com.plaid.internal.EnumC7081g;
import java.util.Arrays;

/* loaded from: classes27.dex */
class AesUtil {
    static byte[] dbl(final byte[] value) {
        if (value.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = (byte) ((value[i] << 1) & EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            bArr[i] = b;
            if (i < 15) {
                bArr[i] = (byte) (((byte) ((value[i + 1] >> 7) & 1)) | b);
            }
        }
        bArr[15] = (byte) (((byte) ((value[0] >> 7) & EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE)) ^ bArr[15]);
        return bArr;
    }

    static byte[] cmacPad(final byte[] x) {
        if (x.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(x, 16);
        bArrCopyOf[x.length] = -128;
        return bArrCopyOf;
    }
}

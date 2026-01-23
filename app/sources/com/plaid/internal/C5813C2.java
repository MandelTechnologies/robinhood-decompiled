package com.plaid.internal;

import com.plaid.link.configuration.LinkLogLevel;

/* renamed from: com.plaid.internal.C2 */
/* loaded from: classes16.dex */
public final /* synthetic */ class C5813C2 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f1298a;

    static {
        int[] iArr = new int[LinkLogLevel.values().length];
        try {
            iArr[LinkLogLevel.ASSERT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LinkLogLevel.DEBUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LinkLogLevel.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LinkLogLevel.INFO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LinkLogLevel.VERBOSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[LinkLogLevel.WARN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f1298a = iArr;
    }
}

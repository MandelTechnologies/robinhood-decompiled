package com.robinhood.utils.extensions;

import kotlin.Metadata;

/* compiled from: Doubles.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"round", "", "precision", "", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.DoublesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Doubles2 {
    public static final double round(double d, int i) {
        return Math.round(d * r0) / ((int) Math.pow(10.0d, i));
    }
}

package com.stripe.android.core.networking;

import kotlin.Metadata;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: NetworkConstants.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"", "", "DEFAULT_RETRY_CODES", "Ljava/lang/Iterable;", "getDEFAULT_RETRY_CODES", "()Ljava/lang/Iterable;", "stripe-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.core.networking.NetworkConstantsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class NetworkConstants2 {
    private static final Iterable<Integer> DEFAULT_RETRY_CODES = new PrimitiveRanges2(429, 429);

    public static final Iterable<Integer> getDEFAULT_RETRY_CODES() {
        return DEFAULT_RETRY_CODES;
    }
}

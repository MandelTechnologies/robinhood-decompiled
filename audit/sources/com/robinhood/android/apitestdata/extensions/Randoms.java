package com.robinhood.android.apitestdata.extensions;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.Random2;

/* compiled from: Randoms.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\b\u0010\u0004\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, m3636d2 = {"nextUsername", "", "Lkotlin/random/Random;", "nextEmail", "randomString", "lib-api-fixtures_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.apitestdata.extensions.RandomsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Randoms {
    public static final String nextUsername(Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return "Android-" + randomString();
    }

    public static final String nextEmail(Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return randomString() + "@robinhood.com";
    }

    private static final String randomString() {
        String strEncodeToString = Base64.encodeToString(Random2.Random(System.currentTimeMillis()).nextBytes(16), 11);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}

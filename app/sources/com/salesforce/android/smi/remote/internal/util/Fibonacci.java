package com.salesforce.android.smi.remote.internal.util;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;

/* compiled from: Fibonacci.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0081\u0010¨\u0006\u0005"}, m3636d2 = {"fibonacci", "", Constants.RequestParamsKeys.APP_NAME_KEY, Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "remote_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.salesforce.android.smi.remote.internal.util.FibonacciKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Fibonacci {
    @JvmOverloads
    public static final int fibonacci(int i, int i2, int i3) {
        while (i != 0) {
            if (i == 1) {
                return i3;
            }
            i--;
            int i4 = i3;
            i3 = i2 + i3;
            i2 = i4;
        }
        return i2;
    }

    public static /* synthetic */ int fibonacci$default(int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return fibonacci(i, i2, i3);
    }
}

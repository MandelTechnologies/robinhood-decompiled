package com.robinhood.shared.crypto.staking.staking.utils;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorHandlingUtils.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"throwIfCancellation", "", "", "feature-crypto-staking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.utils.ErrorHandlingUtilsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ErrorHandlingUtils {
    public static final void throwIfCancellation(Throwable th) throws Throwable {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof CancellationException) {
            throw th;
        }
    }
}

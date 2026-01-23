package com.robinhood.android.regiongate.p237ui.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnsupportedScreenRegionGateException.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/regiongate/ui/lifecycle/UnsupportedScreenRegionGateException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "<init>", "(Ljava/lang/String;)V", "lib-region-gate-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class UnsupportedScreenRegionGateException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedScreenRegionGateException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}

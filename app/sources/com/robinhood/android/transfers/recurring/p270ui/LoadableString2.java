package com.robinhood.android.transfers.recurring.p270ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadableString.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, m3636d2 = {"loadingString", "Lcom/robinhood/android/transfers/recurring/ui/LoadableString;", "", "loadedString", "feature-recurring-deposits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.LoadableStringKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class LoadableString2 {
    public static final LoadableString loadingString(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new LoadableString(true, str);
    }

    public static final LoadableString loadedString(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new LoadableString(false, str);
    }
}

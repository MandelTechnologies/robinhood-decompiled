package com.robinhood.android.futures.detail.p140ui.duxo;

import kotlin.Metadata;

/* compiled from: FtuxProgressState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m3636d2 = {"isInProgress", "", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.detail.ui.duxo.FtuxProgressStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FtuxProgressState2 {
    public static final boolean isInProgress(FtuxProgressState ftuxProgressState) {
        return (ftuxProgressState == null || ftuxProgressState.getIsDone()) ? false : true;
    }
}

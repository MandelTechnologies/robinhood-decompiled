package com.robinhood.android.equityscreener.crud.delete;

import com.robinhood.android.equityscreener.crud.delete.DeleteScreenerViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.equityscreener.models.p294db.Screener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeleteScreenerViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerDataState;", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerViewState;", "<init>", "()V", "reduce", "dataState", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.crud.delete.DeleteScreenerStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class DeleteScreenerViewState2 implements StateProvider<DeleteScreenerDataState, DeleteScreenerViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public DeleteScreenerViewState reduce(DeleteScreenerDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Screener screener = dataState.getScreener();
        if (screener != null) {
            return new DeleteScreenerViewState.Ready(screener.getDisplayName(), dataState.isDeleting(), dataState.isDeleted());
        }
        return DeleteScreenerViewState.Loading.INSTANCE;
    }
}

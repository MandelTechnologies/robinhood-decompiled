package com.robinhood.android.equities.equityscreener.crud.create;

import com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.equityscreener.models.p294db.Screener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreateScreenerViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerDataState;", "Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerViewState;", "<init>", "()V", "reduce", "dataState", "lib-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class CreateScreenerViewState2 implements StateProvider<CreateScreenerDataState, CreateScreenerViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CreateScreenerViewState reduce(CreateScreenerDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<Screener> presets = dataState.getPresets();
        if (presets != null) {
            if (presets.isEmpty()) {
                presets = null;
            }
            if (presets != null) {
                return new CreateScreenerViewState.Ready(presets);
            }
        }
        return CreateScreenerViewState.Loading.INSTANCE;
    }
}

package com.robinhood.android.equitydetail.p123ui.similarinstruments;

import com.robinhood.android.equitydetail.p123ui.similarinstruments.SimilarInstrumentsV2Duxo2;
import com.robinhood.android.equitydetail.p123ui.similarinstruments.SimilarInstrumentsV2Duxo4;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SimilarInstrumentsV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2StateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2DataState;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2ViewState;", "<init>", "()V", "reduce", "dataState", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2StateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class SimilarInstrumentsV2Duxo3 implements StateProvider<SimilarInstrumentsV2Duxo2, SimilarInstrumentsV2Duxo4> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SimilarInstrumentsV2Duxo4 reduce(SimilarInstrumentsV2Duxo2 dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState instanceof SimilarInstrumentsV2Duxo2.Loading) {
            return SimilarInstrumentsV2Duxo4.Loading.INSTANCE;
        }
        if (!(dataState instanceof SimilarInstrumentsV2Duxo2.Loaded)) {
            throw new NoWhenBranchMatchedException();
        }
        SimilarInstrumentsV2Duxo2.Loaded loaded = (SimilarInstrumentsV2Duxo2.Loaded) dataState;
        return new SimilarInstrumentsV2Duxo4.Loaded(loaded.getInstrument().getSymbol(), extensions2.toPersistentList(loaded.getSimilarInstrumentUuids()));
    }
}

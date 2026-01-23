package com.robinhood.android.equitydetail.p123ui.similarinstruments;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimilarInstrumentsV2CardDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardDataState;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardViewState;", "<init>", "()V", "reduce", "dataState", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2CardStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class SimilarInstrumentsV2CardDuxo3 implements StateProvider<SimilarInstrumentsV2CardDataState, SimilarInstrumentsV2CardViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SimilarInstrumentsV2CardViewState reduce(SimilarInstrumentsV2CardDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UUID parentInstrumentUuid = dataState.getParentInstrumentUuid();
        UUID instrumentUuid = dataState.getInstrumentUuid();
        String instrumentName = dataState.getInstrumentName();
        String instrumentSymbol = dataState.getInstrumentSymbol();
        BigDecimal instrumentPercentChange = dataState.getInstrumentPercentChange();
        String str = instrumentPercentChange != null ? Formats.getPercentDeltaFormat().format(instrumentPercentChange) : null;
        BigDecimal instrumentPercentChange2 = dataState.getInstrumentPercentChange();
        return new SimilarInstrumentsV2CardViewState(parentInstrumentUuid, instrumentUuid, instrumentName, instrumentSymbol, str, instrumentPercentChange2 != null ? Boolean.valueOf(BigDecimals7.gte(instrumentPercentChange2, BigDecimal.ZERO)) : null);
    }
}

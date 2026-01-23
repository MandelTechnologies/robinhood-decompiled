package com.robinhood.android.futures.history.p142ui.correction;

import com.robinhood.android.futures.history.p142ui.correction.RhdCashCorrectionDetailDuxo4;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhdCashCorrectionDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionDataState;", "Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class RhdCashCorrectionDetailDuxo3 implements StateProvider<RhdCashCorrectionDataState, RhdCashCorrectionDetailDuxo4> {
    public static final int $stable = 0;
    public static final RhdCashCorrectionDetailDuxo3 INSTANCE = new RhdCashCorrectionDetailDuxo3();

    private RhdCashCorrectionDetailDuxo3() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public RhdCashCorrectionDetailDuxo4 reduce(RhdCashCorrectionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getCashCorrection() == null) {
            return RhdCashCorrectionDetailDuxo4.Loading.INSTANCE;
        }
        return new RhdCashCorrectionDetailDuxo4.Loaded(dataState.getCashCorrection());
    }
}

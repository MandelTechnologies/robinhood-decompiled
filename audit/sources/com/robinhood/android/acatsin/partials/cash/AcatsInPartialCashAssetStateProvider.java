package com.robinhood.android.acatsin.partials.cash;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPartialCashAssetStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetDataState;", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetViewState;", "<init>", "()V", "reduce", "dataState", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInPartialCashAssetStateProvider implements StateProvider<AcatsInPartialCashAssetDataState, AcatsInPartialCashAssetViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r0
      0x002e: PHI (r0v2 com.robinhood.android.acatsin.partials.UiAcatsAsset$CashAsset$CashType) = 
      (r0v1 com.robinhood.android.acatsin.partials.UiAcatsAsset$CashAsset$CashType)
      (r0v5 com.robinhood.android.acatsin.partials.UiAcatsAsset$CashAsset$CashType)
      (r0v8 com.robinhood.android.acatsin.partials.UiAcatsAsset$CashAsset$CashType)
     binds: [B:3:0x000f, B:8:0x001e, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AcatsInPartialCashAssetViewState reduce(AcatsInPartialCashAssetDataState dataState) {
        UiAcatsAsset.CashAsset.CashType cashType;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        boolean zIsMarginSupported = dataState.isMarginSupported();
        UiAcatsAsset.CashAsset.CashType cashType2 = dataState.getCashType();
        if (cashType2 == null) {
            UiAcatsAsset.CashAsset cashAsset = dataState.getCashAsset();
            cashType = null;
            cashType2 = cashAsset != null ? cashAsset.getCashType() : null;
            if (cashType2 != null) {
                cashType = cashType2;
            } else if (dataState.isMarginSupported() && dataState.isMarginPreselected()) {
                cashType2 = UiAcatsAsset.CashAsset.CashType.MARGIN;
                cashType = cashType2;
            }
        }
        return new AcatsInPartialCashAssetViewState(zIsMarginSupported, cashType, dataState.isEntireBalance(), dataState.getAmountEntered(), dataState.isMarginInvestingEnabled());
    }
}

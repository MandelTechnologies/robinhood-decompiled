package com.robinhood.android.crypto.p094ui.detail.p095v2.topbar;

import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailTopBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarDataState;", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarViewState;", "<init>", "()V", "reduce", "dataState", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detail.v2.topbar.CryptoDetailTopBarStateProvider, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoDetailTopBarDuxo3 implements StateProvider<CryptoDetailTopBarDataState, CryptoDetailTopBarViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoDetailTopBarViewState reduce(CryptoDetailTopBarDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new CryptoDetailTopBarViewState(dataState.getCurrencyPair(), dataState.getTitle(), dataState.getSubtitle(), dataState.getShowBackButton(), dataState.getTopBarActions());
    }
}

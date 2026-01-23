package com.robinhood.android.assethomes;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.util.Money3;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetHomeTopAppBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeTopAppBarStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/assethomes/AssetHomeTopAppBarDataState;", "Lcom/robinhood/android/assethomes/AssetHomeTopAppBarViewState;", "<init>", "()V", "reduce", "dataState", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.assethomes.AssetHomeTopAppBarStateProvider, reason: use source file name */
/* loaded from: classes7.dex */
public final class AssetHomeTopAppBarDuxo3 implements StateProvider<AssetHomeTopAppBarDataState, AssetHomeTopAppBarViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AssetHomeTopAppBarViewState reduce(AssetHomeTopAppBarDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        BigDecimal accountValue = dataState.getAccountValue();
        return new AssetHomeTopAppBarViewState(Money3.format$default(accountValue != null ? Money3.toMoney$default(accountValue, null, 1, null) : null, null, 1, null));
    }
}

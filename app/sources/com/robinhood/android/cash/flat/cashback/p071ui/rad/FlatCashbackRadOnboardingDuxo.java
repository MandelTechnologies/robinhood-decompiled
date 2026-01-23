package com.robinhood.android.cash.flat.cashback.p071ui.rad;

import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackDataState;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.staticcontent.store.productmarketing.RealProductMarketingStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlatCashbackRadOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingDuxo;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackDuxo;", "", "Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingViewState;", "realProductMarketingStore", "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;", "stateProvider", "Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class FlatCashbackRadOnboardingDuxo extends BaseFlatCashbackDuxo<Unit, FlatCashbackRadOnboardingViewState> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlatCashbackRadOnboardingDuxo(RealProductMarketingStore realProductMarketingStore, FlatCashbackRadOnboardingStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(realProductMarketingStore, stateProvider, duxoBundle, new BaseFlatCashbackDataState(null, null, Unit.INSTANCE, 3, null));
        Intrinsics.checkNotNullParameter(realProductMarketingStore, "realProductMarketingStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
    }
}

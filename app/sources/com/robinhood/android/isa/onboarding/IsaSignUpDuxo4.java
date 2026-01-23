package com.robinhood.android.isa.onboarding;

import com.robinhood.android.isa.models.isa.p163db.entity.IsaPromotion;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.remote.assets.LottieUrl;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: IsaSignUpDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/isa/onboarding/IsaSignUpStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/isa/onboarding/IsaSignUpDataState;", "Lcom/robinhood/android/isa/onboarding/IsaSignUpViewState;", "<init>", "()V", "reduce", "dataState", "lib-isa-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpStateProvider, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaSignUpDuxo4 implements StateProvider<IsaSignUpDataState, IsaSignUpViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public IsaSignUpViewState reduce(IsaSignUpDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        IsaPromotion promotion = dataState.getPromotion();
        boolean zIsActive = promotion != null ? promotion.isActive() : false;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (zIsActive) {
            listCreateListBuilder.add(new PageConfig(LottieUrl.ISA_ONBOARDING_TWO_PERCENT_CASH_BACK_LIGHT, LottieUrl.ISA_ONBOARDING_TWO_PERCENT_CASH_BACK_DARK, C19966R.string.two_percent_cash_back_header, C19966R.string.two_percent_cash_back_subtitle, C19966R.string.two_percent_cash_back_disclosure));
        }
        listCreateListBuilder.add(new PageConfig(LottieUrl.ISA_ONBOARDING_TAX_FREE_INVESTING_LIGHT, LottieUrl.ISA_ONBOARDING_TAX_FREE_INVESTING_DARK, C19966R.string.tax_free_investing_header, C19966R.string.tax_free_investing_subtitle, C19966R.string.tax_free_investing_disclosure));
        listCreateListBuilder.add(new PageConfig(LottieUrl.ISA_ONBOARDING_ZERO_ACCOUNT_FEE_LIGHT, LottieUrl.ISA_ONBOARDING_ZERO_ACCOUNT_FEE_DARK, C19966R.string.zero_account_fee_header, C19966R.string.zero_account_fee_subtitle, C19966R.string.zero_account_fee_disclosure));
        listCreateListBuilder.add(new PageConfig(LottieUrl.ISA_ONBOARDING_SAFETY_LIGHT, LottieUrl.ISA_ONBOARDING_SAFETY_DARK, C19966R.string.safety_header, C19966R.string.safety_subtitle, C19966R.string.safety_disclosure));
        if (!zIsActive) {
            listCreateListBuilder.add(new PageConfig(LottieUrl.ISA_ONBOARDING_TRANSFER_YOUR_ISA_LIGHT, LottieUrl.ISA_ONBOARDING_TRANSFER_YOUR_ISA_DARK, C19966R.string.transfer_your_isa_header, C19966R.string.transfer_your_isa_subtitle, C19966R.string.transfer_your_isa_disclosure));
        }
        return new IsaSignUpViewState(dataState.isCtaLoading(), extensions2.toPersistentList(CollectionsKt.build(listCreateListBuilder)));
    }
}

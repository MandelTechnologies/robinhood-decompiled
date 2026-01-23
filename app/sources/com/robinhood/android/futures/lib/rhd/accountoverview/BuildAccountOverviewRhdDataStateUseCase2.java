package com.robinhood.android.futures.lib.rhd.accountoverview;

import com.robinhood.android.futures.lib.rhd.accountoverview.RhdAccountDataState;
import com.robinhood.ceres.p284v1.AccountFuturesEligibilityStatusDto;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.futures.mib.MiBFuturesState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildAccountOverviewRhdDataStateUseCase.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"buildRhdAccountDataState", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", "activeAccountNumber", "", "mibFuturesState", "Lcom/robinhood/store/futures/mib/MiBFuturesState;", "futuresAllowedAccountEligibilityStatus", "Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatusDto;", "lib-rhd-account-overview_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.lib.rhd.accountoverview.BuildAccountOverviewRhdDataStateUseCaseKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildAccountOverviewRhdDataStateUseCase2 {

    /* compiled from: BuildAccountOverviewRhdDataStateUseCase.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.lib.rhd.accountoverview.BuildAccountOverviewRhdDataStateUseCaseKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountFuturesEligibilityStatusDto.values().length];
            try {
                iArr[AccountFuturesEligibilityStatusDto.ACCOUNT_FUTURES_ELIGIBILITY_STATUS_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.ELIGIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.INELIGIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.ALREADY_HAS_ACCOUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.IN_MANUAL_REVIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final RhdAccountDataState buildRhdAccountDataState(String str, MiBFuturesState mibFuturesState, AccountFuturesEligibilityStatusDto futuresAllowedAccountEligibilityStatus) {
        int i;
        Intrinsics.checkNotNullParameter(mibFuturesState, "mibFuturesState");
        Intrinsics.checkNotNullParameter(futuresAllowedAccountEligibilityStatus, "futuresAllowedAccountEligibilityStatus");
        if (str == null) {
            return null;
        }
        Account futuresAllowedRhsAccount = mibFuturesState.getFuturesAllowedRhsAccount();
        if (!Intrinsics.areEqual(futuresAllowedRhsAccount != null ? futuresAllowedRhsAccount.getAccountNumber() : null, str)) {
            if (!mibFuturesState.isInMiBFuturesExperiment() || (i = WhenMappings.$EnumSwitchMapping$0[futuresAllowedAccountEligibilityStatus.ordinal()]) == 1) {
                return null;
            }
            if (i == 2) {
                if (futuresAllowedRhsAccount == null) {
                    return null;
                }
                return new RhdAccountDataState.EligibleOrInReviewInAnotherAccount(futuresAllowedRhsAccount);
            }
            if (i == 3) {
                return RhdAccountDataState.Ineligible.INSTANCE;
            }
            if (i == 4) {
                if (futuresAllowedRhsAccount == null) {
                    return null;
                }
                return new RhdAccountDataState.AlreadyHasAccountInAnotherAccount(futuresAllowedRhsAccount);
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (futuresAllowedRhsAccount == null) {
                return null;
            }
            return new RhdAccountDataState.EligibleOrInReviewInAnotherAccount(futuresAllowedRhsAccount);
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[futuresAllowedAccountEligibilityStatus.ordinal()];
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return RhdAccountDataState.Eligible.INSTANCE;
        }
        if (i2 == 3) {
            return RhdAccountDataState.Ineligible.INSTANCE;
        }
        if (i2 == 4) {
            return new RhdAccountDataState.AlreadyHasAccount(futuresAllowedRhsAccount);
        }
        if (i2 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return RhdAccountDataState.InManualReview.INSTANCE;
    }
}

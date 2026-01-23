package com.robinhood.android.futures.onboarding.p145ui.result;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.futures.onboarding.p145ui.result.FuturesAccountResultDuxo4;
import com.robinhood.android.futures.onboarding.p145ui.result.FuturesAccountResultFragment;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.futures.mib.MiBFuturesState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAccountResultDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultDataState;", "Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState;", "<init>", "()V", "reduce", "dataState", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final /* data */ class FuturesAccountResultDuxo3 implements StateProvider<FuturesAccountResultDataState, FuturesAccountResultDuxo4> {
    public static final int $stable = 0;
    public static final FuturesAccountResultDuxo3 INSTANCE = new FuturesAccountResultDuxo3();

    /* compiled from: FuturesAccountResultDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultStateProvider$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesAccountResultFragment.ApplicationResult.values().length];
            try {
                iArr[FuturesAccountResultFragment.ApplicationResult.REJECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesAccountResultFragment.ApplicationResult.INELIGIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesAccountResultFragment.ApplicationResult.MANUAL_REVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FuturesAccountResultFragment.ApplicationResult.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FuturesAccountResultFragment.ApplicationResult.ALREADY_EXISTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof FuturesAccountResultDuxo3);
    }

    public int hashCode() {
        return 623350608;
    }

    public String toString() {
        return "FuturesAccountResultStateProvider";
    }

    private FuturesAccountResultDuxo3() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public FuturesAccountResultDuxo4 reduce(FuturesAccountResultDataState dataState) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Account futuresAllowedRhsAccount;
        DisplayName displayName;
        DisplayName.Variants withAccount;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        int i = WhenMappings.$EnumSwitchMapping$0[dataState.getResult().ordinal()];
        if (i == 1 || i == 2) {
            return new FuturesAccountResultDuxo4.Ineligible(dataState.isEventsContracts());
        }
        if (i == 3) {
            return FuturesAccountResultDuxo4.ManualReview.INSTANCE;
        }
        if (i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z5 = true;
        boolean zIsEventsContracts = dataState.isEventsContracts();
        FuturesAccount futuresAccount = dataState.getFuturesAccount();
        if (futuresAccount == null || !futuresAccount.getAccountReady()) {
            z = true;
            z5 = false;
        } else {
            z = true;
        }
        FuturesAccount swapsAccount = dataState.getSwapsAccount();
        if (swapsAccount == null || swapsAccount.getAccountReady() != z) {
            z2 = z;
            z = false;
            z3 = false;
        } else {
            z2 = z;
            z3 = false;
        }
        String rhdAccountNumber = dataState.getRhdAccountNumber();
        MiBFuturesState miBFuturesState = dataState.getMiBFuturesState();
        if (miBFuturesState == null || miBFuturesState.isInMiBFuturesExperiment() != z2) {
            z4 = z2;
            z2 = z3;
        } else {
            z4 = z2;
        }
        MiBFuturesState miBFuturesState2 = dataState.getMiBFuturesState();
        if (miBFuturesState2 != null && miBFuturesState2.getHasMultipleRhsAccounts() == z4) {
            z3 = z4;
        }
        MiBFuturesState miBFuturesState3 = dataState.getMiBFuturesState();
        return new FuturesAccountResultDuxo4.Approved(zIsEventsContracts, z5, z, rhdAccountNumber, z2, z3, (miBFuturesState3 == null || (futuresAllowedRhsAccount = miBFuturesState3.getFuturesAllowedRhsAccount()) == null || (displayName = AccountDisplayNames.getDisplayName(futuresAllowedRhsAccount)) == null || (withAccount = displayName.getWithAccount()) == null) ? null : withAccount.getInSentence(), dataState.isInAcqStreamlinedTradeFlowExperiment(), dataState.getStreamlineToTradeFlow());
    }
}

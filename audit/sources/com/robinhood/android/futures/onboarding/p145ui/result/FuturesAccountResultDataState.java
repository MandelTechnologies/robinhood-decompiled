package com.robinhood.android.futures.onboarding.p145ui.result;

import com.robinhood.android.futures.onboarding.p145ui.result.FuturesAccountResultFragment;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.store.futures.mib.MiBFuturesState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAccountResultDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003JU\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0011R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultDataState;", "", "result", "Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultFragment$ApplicationResult;", "isEventsContracts", "", "streamlineToTradeFlow", "miBFuturesState", "Lcom/robinhood/store/futures/mib/MiBFuturesState;", "swapsAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "futuresAccount", "isInAcqStreamlinedTradeFlowExperiment", "<init>", "(Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultFragment$ApplicationResult;ZZLcom/robinhood/store/futures/mib/MiBFuturesState;Lcom/robinhood/android/models/futures/db/FuturesAccount;Lcom/robinhood/android/models/futures/db/FuturesAccount;Z)V", "getResult", "()Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultFragment$ApplicationResult;", "()Z", "getStreamlineToTradeFlow", "getMiBFuturesState", "()Lcom/robinhood/store/futures/mib/MiBFuturesState;", "getSwapsAccount", "()Lcom/robinhood/android/models/futures/db/FuturesAccount;", "getFuturesAccount", "rhdAccountNumber", "", "getRhdAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesAccountResultDataState {
    public static final int $stable = 8;
    private final FuturesAccount futuresAccount;
    private final boolean isEventsContracts;
    private final boolean isInAcqStreamlinedTradeFlowExperiment;
    private final MiBFuturesState miBFuturesState;
    private final FuturesAccountResultFragment.ApplicationResult result;
    private final boolean streamlineToTradeFlow;
    private final FuturesAccount swapsAccount;

    public static /* synthetic */ FuturesAccountResultDataState copy$default(FuturesAccountResultDataState futuresAccountResultDataState, FuturesAccountResultFragment.ApplicationResult applicationResult, boolean z, boolean z2, MiBFuturesState miBFuturesState, FuturesAccount futuresAccount, FuturesAccount futuresAccount2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            applicationResult = futuresAccountResultDataState.result;
        }
        if ((i & 2) != 0) {
            z = futuresAccountResultDataState.isEventsContracts;
        }
        if ((i & 4) != 0) {
            z2 = futuresAccountResultDataState.streamlineToTradeFlow;
        }
        if ((i & 8) != 0) {
            miBFuturesState = futuresAccountResultDataState.miBFuturesState;
        }
        if ((i & 16) != 0) {
            futuresAccount = futuresAccountResultDataState.swapsAccount;
        }
        if ((i & 32) != 0) {
            futuresAccount2 = futuresAccountResultDataState.futuresAccount;
        }
        if ((i & 64) != 0) {
            z3 = futuresAccountResultDataState.isInAcqStreamlinedTradeFlowExperiment;
        }
        FuturesAccount futuresAccount3 = futuresAccount2;
        boolean z4 = z3;
        FuturesAccount futuresAccount4 = futuresAccount;
        boolean z5 = z2;
        return futuresAccountResultDataState.copy(applicationResult, z, z5, miBFuturesState, futuresAccount4, futuresAccount3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final FuturesAccountResultFragment.ApplicationResult getResult() {
        return this.result;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEventsContracts() {
        return this.isEventsContracts;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getStreamlineToTradeFlow() {
        return this.streamlineToTradeFlow;
    }

    /* renamed from: component4, reason: from getter */
    public final MiBFuturesState getMiBFuturesState() {
        return this.miBFuturesState;
    }

    /* renamed from: component5, reason: from getter */
    public final FuturesAccount getSwapsAccount() {
        return this.swapsAccount;
    }

    /* renamed from: component6, reason: from getter */
    public final FuturesAccount getFuturesAccount() {
        return this.futuresAccount;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsInAcqStreamlinedTradeFlowExperiment() {
        return this.isInAcqStreamlinedTradeFlowExperiment;
    }

    public final FuturesAccountResultDataState copy(FuturesAccountResultFragment.ApplicationResult result, boolean isEventsContracts, boolean streamlineToTradeFlow, MiBFuturesState miBFuturesState, FuturesAccount swapsAccount, FuturesAccount futuresAccount, boolean isInAcqStreamlinedTradeFlowExperiment) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new FuturesAccountResultDataState(result, isEventsContracts, streamlineToTradeFlow, miBFuturesState, swapsAccount, futuresAccount, isInAcqStreamlinedTradeFlowExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesAccountResultDataState)) {
            return false;
        }
        FuturesAccountResultDataState futuresAccountResultDataState = (FuturesAccountResultDataState) other;
        return this.result == futuresAccountResultDataState.result && this.isEventsContracts == futuresAccountResultDataState.isEventsContracts && this.streamlineToTradeFlow == futuresAccountResultDataState.streamlineToTradeFlow && Intrinsics.areEqual(this.miBFuturesState, futuresAccountResultDataState.miBFuturesState) && Intrinsics.areEqual(this.swapsAccount, futuresAccountResultDataState.swapsAccount) && Intrinsics.areEqual(this.futuresAccount, futuresAccountResultDataState.futuresAccount) && this.isInAcqStreamlinedTradeFlowExperiment == futuresAccountResultDataState.isInAcqStreamlinedTradeFlowExperiment;
    }

    public int hashCode() {
        int iHashCode = ((((this.result.hashCode() * 31) + Boolean.hashCode(this.isEventsContracts)) * 31) + Boolean.hashCode(this.streamlineToTradeFlow)) * 31;
        MiBFuturesState miBFuturesState = this.miBFuturesState;
        int iHashCode2 = (iHashCode + (miBFuturesState == null ? 0 : miBFuturesState.hashCode())) * 31;
        FuturesAccount futuresAccount = this.swapsAccount;
        int iHashCode3 = (iHashCode2 + (futuresAccount == null ? 0 : futuresAccount.hashCode())) * 31;
        FuturesAccount futuresAccount2 = this.futuresAccount;
        return ((iHashCode3 + (futuresAccount2 != null ? futuresAccount2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInAcqStreamlinedTradeFlowExperiment);
    }

    public String toString() {
        return "FuturesAccountResultDataState(result=" + this.result + ", isEventsContracts=" + this.isEventsContracts + ", streamlineToTradeFlow=" + this.streamlineToTradeFlow + ", miBFuturesState=" + this.miBFuturesState + ", swapsAccount=" + this.swapsAccount + ", futuresAccount=" + this.futuresAccount + ", isInAcqStreamlinedTradeFlowExperiment=" + this.isInAcqStreamlinedTradeFlowExperiment + ")";
    }

    public FuturesAccountResultDataState(FuturesAccountResultFragment.ApplicationResult result, boolean z, boolean z2, MiBFuturesState miBFuturesState, FuturesAccount futuresAccount, FuturesAccount futuresAccount2, boolean z3) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.isEventsContracts = z;
        this.streamlineToTradeFlow = z2;
        this.miBFuturesState = miBFuturesState;
        this.swapsAccount = futuresAccount;
        this.futuresAccount = futuresAccount2;
        this.isInAcqStreamlinedTradeFlowExperiment = z3;
    }

    public /* synthetic */ FuturesAccountResultDataState(FuturesAccountResultFragment.ApplicationResult applicationResult, boolean z, boolean z2, MiBFuturesState miBFuturesState, FuturesAccount futuresAccount, FuturesAccount futuresAccount2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(applicationResult, z, z2, (i & 8) != 0 ? null : miBFuturesState, (i & 16) != 0 ? null : futuresAccount, (i & 32) != 0 ? null : futuresAccount2, (i & 64) != 0 ? false : z3);
    }

    public final FuturesAccountResultFragment.ApplicationResult getResult() {
        return this.result;
    }

    public final boolean isEventsContracts() {
        return this.isEventsContracts;
    }

    public final boolean getStreamlineToTradeFlow() {
        return this.streamlineToTradeFlow;
    }

    public final MiBFuturesState getMiBFuturesState() {
        return this.miBFuturesState;
    }

    public final FuturesAccount getSwapsAccount() {
        return this.swapsAccount;
    }

    public final FuturesAccount getFuturesAccount() {
        return this.futuresAccount;
    }

    public final boolean isInAcqStreamlinedTradeFlowExperiment() {
        return this.isInAcqStreamlinedTradeFlowExperiment;
    }

    public final String getRhdAccountNumber() {
        String rhdAccountNumber;
        FuturesAccount futuresAccount = this.futuresAccount;
        if (futuresAccount != null && (rhdAccountNumber = futuresAccount.getRhdAccountNumber()) != null) {
            return rhdAccountNumber;
        }
        FuturesAccount futuresAccount2 = this.swapsAccount;
        if (futuresAccount2 != null) {
            return futuresAccount2.getRhdAccountNumber();
        }
        return null;
    }
}

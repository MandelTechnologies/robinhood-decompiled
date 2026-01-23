package com.robinhood.android.retirement.onboarding.agreements;

import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.store.AsyncResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementAgreementsDataState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementsDataState;", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "flow", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow;", "error", "", "slipCheckboxStates", "", "Lcom/robinhood/android/retirement/onboarding/agreements/SlipCheckboxState;", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow;Ljava/lang/Throwable;Ljava/util/List;)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getFlow", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow;", "getError", "()Ljava/lang/Throwable;", "getSlipCheckboxStates", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementAgreementsDataState {
    private final BrokerageAccountType accountType;
    private final Throwable error;
    private final ApiRetirementSignUpFlow flow;
    private final List<SlipCheckboxState> slipCheckboxStates;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final StateProvider<RetirementAgreementsDataState, AsyncResult<RetirementAgreementsViewState>> StateProvider = new StateProvider() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementAgreementsDataState$Companion$StateProvider$1
        @Override // com.robinhood.android.udf.StateProvider
        public final AsyncResult<RetirementAgreementsViewState> reduce(RetirementAgreementsDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            Throwable error = dataState.getError();
            AsyncResult<RetirementAgreementsViewState> failure = error != null ? new AsyncResult.Failure(error) : AsyncResult.Loading.INSTANCE;
            ApiRetirementSignUpFlow flow = dataState.getFlow();
            if (flow == null) {
                return failure;
            }
            return new AsyncResult.Success(new RetirementAgreementsViewState(dataState.getAccountType(), flow.getClosing_text(), flow.getAccount_agreement_view_model(), flow.getSlip_agreements(), flow.getGold_summary_section(), RetirementAgreementsDataState3.toSignedAgreements(flow, dataState.getSlipCheckboxStates())));
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RetirementAgreementsDataState copy$default(RetirementAgreementsDataState retirementAgreementsDataState, BrokerageAccountType brokerageAccountType, ApiRetirementSignUpFlow apiRetirementSignUpFlow, Throwable th, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = retirementAgreementsDataState.accountType;
        }
        if ((i & 2) != 0) {
            apiRetirementSignUpFlow = retirementAgreementsDataState.flow;
        }
        if ((i & 4) != 0) {
            th = retirementAgreementsDataState.error;
        }
        if ((i & 8) != 0) {
            list = retirementAgreementsDataState.slipCheckboxStates;
        }
        return retirementAgreementsDataState.copy(brokerageAccountType, apiRetirementSignUpFlow, th, list);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiRetirementSignUpFlow getFlow() {
        return this.flow;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final List<SlipCheckboxState> component4() {
        return this.slipCheckboxStates;
    }

    public final RetirementAgreementsDataState copy(BrokerageAccountType accountType, ApiRetirementSignUpFlow flow, Throwable error, List<SlipCheckboxState> slipCheckboxStates) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(slipCheckboxStates, "slipCheckboxStates");
        return new RetirementAgreementsDataState(accountType, flow, error, slipCheckboxStates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementAgreementsDataState)) {
            return false;
        }
        RetirementAgreementsDataState retirementAgreementsDataState = (RetirementAgreementsDataState) other;
        return this.accountType == retirementAgreementsDataState.accountType && Intrinsics.areEqual(this.flow, retirementAgreementsDataState.flow) && Intrinsics.areEqual(this.error, retirementAgreementsDataState.error) && Intrinsics.areEqual(this.slipCheckboxStates, retirementAgreementsDataState.slipCheckboxStates);
    }

    public int hashCode() {
        int iHashCode = this.accountType.hashCode() * 31;
        ApiRetirementSignUpFlow apiRetirementSignUpFlow = this.flow;
        int iHashCode2 = (iHashCode + (apiRetirementSignUpFlow == null ? 0 : apiRetirementSignUpFlow.hashCode())) * 31;
        Throwable th = this.error;
        return ((iHashCode2 + (th != null ? th.hashCode() : 0)) * 31) + this.slipCheckboxStates.hashCode();
    }

    public String toString() {
        return "RetirementAgreementsDataState(accountType=" + this.accountType + ", flow=" + this.flow + ", error=" + this.error + ", slipCheckboxStates=" + this.slipCheckboxStates + ")";
    }

    public RetirementAgreementsDataState(BrokerageAccountType accountType, ApiRetirementSignUpFlow apiRetirementSignUpFlow, Throwable th, List<SlipCheckboxState> slipCheckboxStates) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(slipCheckboxStates, "slipCheckboxStates");
        this.accountType = accountType;
        this.flow = apiRetirementSignUpFlow;
        this.error = th;
        this.slipCheckboxStates = slipCheckboxStates;
    }

    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public final ApiRetirementSignUpFlow getFlow() {
        return this.flow;
    }

    public final Throwable getError() {
        return this.error;
    }

    public /* synthetic */ RetirementAgreementsDataState(BrokerageAccountType brokerageAccountType, ApiRetirementSignUpFlow apiRetirementSignUpFlow, Throwable th, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(brokerageAccountType, (i & 2) != 0 ? null : apiRetirementSignUpFlow, (i & 4) != 0 ? null : th, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<SlipCheckboxState> getSlipCheckboxStates() {
        return this.slipCheckboxStates;
    }

    /* compiled from: RetirementAgreementsDataState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementsDataState$Companion;", "", "<init>", "()V", "StateProvider", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementsDataState;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementsViewState;", "getStateProvider", "()Lcom/robinhood/android/udf/StateProvider;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StateProvider<RetirementAgreementsDataState, AsyncResult<RetirementAgreementsViewState>> getStateProvider() {
            return RetirementAgreementsDataState.StateProvider;
        }
    }
}

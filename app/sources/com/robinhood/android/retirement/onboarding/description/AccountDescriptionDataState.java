package com.robinhood.android.retirement.onboarding.description;

import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.retirement.onboarding.description.AccountDescriptionViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountDescriptionDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionDataState;", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "flow", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow;", "error", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow;Ljava/lang/Throwable;)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getFlow", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AccountDescriptionDataState {
    private final BrokerageAccountType accountType;
    private final Throwable error;
    private final ApiRetirementSignUpFlow flow;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final StateProvider<AccountDescriptionDataState, AccountDescriptionViewState> StateProvider = new StateProvider() { // from class: com.robinhood.android.retirement.onboarding.description.AccountDescriptionDataState$Companion$StateProvider$1
        @Override // com.robinhood.android.udf.StateProvider
        public final AccountDescriptionViewState reduce(AccountDescriptionDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getFlow() != null) {
                return new AccountDescriptionViewState.Loaded(dataState.getFlow().getAccount_description_view_model(), dataState.getFlow().getDisclosure(), dataState.getAccountType());
            }
            return dataState.getError() != null ? new AccountDescriptionViewState.Failure(dataState.getError()) : AccountDescriptionViewState.Loading.INSTANCE;
        }
    };

    public static /* synthetic */ AccountDescriptionDataState copy$default(AccountDescriptionDataState accountDescriptionDataState, BrokerageAccountType brokerageAccountType, ApiRetirementSignUpFlow apiRetirementSignUpFlow, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = accountDescriptionDataState.accountType;
        }
        if ((i & 2) != 0) {
            apiRetirementSignUpFlow = accountDescriptionDataState.flow;
        }
        if ((i & 4) != 0) {
            th = accountDescriptionDataState.error;
        }
        return accountDescriptionDataState.copy(brokerageAccountType, apiRetirementSignUpFlow, th);
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

    public final AccountDescriptionDataState copy(BrokerageAccountType accountType, ApiRetirementSignUpFlow flow, Throwable error) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return new AccountDescriptionDataState(accountType, flow, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountDescriptionDataState)) {
            return false;
        }
        AccountDescriptionDataState accountDescriptionDataState = (AccountDescriptionDataState) other;
        return this.accountType == accountDescriptionDataState.accountType && Intrinsics.areEqual(this.flow, accountDescriptionDataState.flow) && Intrinsics.areEqual(this.error, accountDescriptionDataState.error);
    }

    public int hashCode() {
        int iHashCode = this.accountType.hashCode() * 31;
        ApiRetirementSignUpFlow apiRetirementSignUpFlow = this.flow;
        int iHashCode2 = (iHashCode + (apiRetirementSignUpFlow == null ? 0 : apiRetirementSignUpFlow.hashCode())) * 31;
        Throwable th = this.error;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "AccountDescriptionDataState(accountType=" + this.accountType + ", flow=" + this.flow + ", error=" + this.error + ")";
    }

    public AccountDescriptionDataState(BrokerageAccountType accountType, ApiRetirementSignUpFlow apiRetirementSignUpFlow, Throwable th) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.accountType = accountType;
        this.flow = apiRetirementSignUpFlow;
        this.error = th;
    }

    public /* synthetic */ AccountDescriptionDataState(BrokerageAccountType brokerageAccountType, ApiRetirementSignUpFlow apiRetirementSignUpFlow, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(brokerageAccountType, (i & 2) != 0 ? null : apiRetirementSignUpFlow, (i & 4) != 0 ? null : th);
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

    /* compiled from: AccountDescriptionDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionDataState$Companion;", "", "<init>", "()V", "StateProvider", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionDataState;", "Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState;", "getStateProvider", "()Lcom/robinhood/android/udf/StateProvider;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StateProvider<AccountDescriptionDataState, AccountDescriptionViewState> getStateProvider() {
            return AccountDescriptionDataState.StateProvider;
        }
    }
}

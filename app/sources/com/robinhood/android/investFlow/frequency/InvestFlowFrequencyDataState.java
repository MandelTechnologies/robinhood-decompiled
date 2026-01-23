package com.robinhood.android.investFlow.frequency;

import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: InvestFlowFrequencyDataState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!J\\\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b\u0003\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001aR#\u0010\t\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b4\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010!¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDataState;", "", "", "isCrypto", "Lcom/robinhood/android/investFlow/frequency/Frequency;", "selectedFrequency", "Lcom/robinhood/udf/UiEvent;", "Ljava/lang/Error;", "Lkotlin/Error;", "error", "j$/time/LocalDate", "nextInvestmentDate", "recurringOnly", "Lcom/robinhood/models/db/Account;", "account", "<init>", "(ZLcom/robinhood/android/investFlow/frequency/Frequency;Lcom/robinhood/udf/UiEvent;Lj$/time/LocalDate;ZLcom/robinhood/models/db/Account;)V", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "frequency", "mutateFromInvestFlowFrequency", "(Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;)Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDataState;", "mutateFrequency", "(Lcom/robinhood/android/investFlow/frequency/Frequency;)Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDataState;", "component1", "()Z", "component2", "()Lcom/robinhood/android/investFlow/frequency/Frequency;", "component3", "()Lcom/robinhood/udf/UiEvent;", "component4", "()Lj$/time/LocalDate;", "component5", "component6", "()Lcom/robinhood/models/db/Account;", "copy", "(ZLcom/robinhood/android/investFlow/frequency/Frequency;Lcom/robinhood/udf/UiEvent;Lj$/time/LocalDate;ZLcom/robinhood/models/db/Account;)Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lcom/robinhood/android/investFlow/frequency/Frequency;", "getSelectedFrequency", "Lcom/robinhood/udf/UiEvent;", "getError", "Lj$/time/LocalDate;", "getNextInvestmentDate", "getRecurringOnly", "Lcom/robinhood/models/db/Account;", "getAccount", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowFrequencyDataState {
    private final Account account;
    private final UiEvent<Error> error;
    private final boolean isCrypto;
    private final LocalDate nextInvestmentDate;
    private final boolean recurringOnly;
    private final Frequency selectedFrequency;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final StateProvider<InvestFlowFrequencyDataState, FrequencyViewState> StateProvider = new StateProvider() { // from class: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDataState$Companion$StateProvider$1

        /* compiled from: InvestFlowFrequencyDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDataState$Companion$StateProvider$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Frequency.values().length];
                try {
                    iArr[Frequency.ONCE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // com.robinhood.android.udf.StateProvider
        public final FrequencyViewState reduce(InvestFlowFrequencyDataState dataState) {
            int i;
            InvestFlowFrequency recurring;
            Account account;
            BrokerageAccountType brokerageAccountType;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            Frequency selectedFrequency = dataState.getSelectedFrequency();
            LocalDate nextInvestmentDate = dataState.getNextInvestmentDate();
            boolean z = (dataState.getSelectedFrequency() == null || (account = dataState.getAccount()) == null || (brokerageAccountType = account.getBrokerageAccountType()) == null || !brokerageAccountType.isRetirement()) ? false : true;
            Frequency[] frequencyArrValues = Frequency.values();
            ArrayList arrayList = new ArrayList();
            for (Frequency frequency : frequencyArrValues) {
                boolean z2 = (dataState.getRecurringOnly() && frequency.getApiFrequency() == null) ? false : true;
                boolean showForCrypto = dataState.isCrypto() ? frequency.getShowForCrypto() : frequency.getShowForEquity();
                if (z2 && showForCrypto) {
                    arrayList.add(frequency);
                }
            }
            boolean z3 = dataState.getSelectedFrequency() != null;
            Frequency selectedFrequency2 = dataState.getSelectedFrequency();
            int i2 = selectedFrequency2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[selectedFrequency2.ordinal()];
            if (i2 == -1) {
                i = C19349R.string.invest_flow_recurring_disclaimer;
            } else if (i2 == 1) {
                i = C19349R.string.invest_flow_once_disclaimer;
            } else {
                i = C19349R.string.invest_flow_frequency_disclaimer;
            }
            int i3 = i;
            boolean z4 = dataState.getSelectedFrequency() != Frequency.ONCE;
            Frequency selectedFrequency3 = dataState.getSelectedFrequency();
            int i4 = selectedFrequency3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[selectedFrequency3.ordinal()];
            if (i4 == -1) {
                recurring = null;
            } else if (i4 == 1) {
                recurring = InvestFlowFrequency.Once.INSTANCE;
            } else {
                ApiInvestmentSchedule.Frequency apiFrequency = dataState.getSelectedFrequency().getApiFrequency();
                if (apiFrequency != null) {
                    recurring = new InvestFlowFrequency.Recurring(apiFrequency, dataState.getNextInvestmentDate());
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return new FrequencyViewState(selectedFrequency, recurring, nextInvestmentDate, arrayList, z, z3, z4, i3);
        }
    };

    /* compiled from: InvestFlowFrequencyDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Frequency.values().length];
            try {
                iArr[Frequency.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InvestFlowFrequencyDataState() {
        this(false, null, null, null, false, null, 63, null);
    }

    public static /* synthetic */ InvestFlowFrequencyDataState copy$default(InvestFlowFrequencyDataState investFlowFrequencyDataState, boolean z, Frequency frequency, UiEvent uiEvent, LocalDate localDate, boolean z2, Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            z = investFlowFrequencyDataState.isCrypto;
        }
        if ((i & 2) != 0) {
            frequency = investFlowFrequencyDataState.selectedFrequency;
        }
        if ((i & 4) != 0) {
            uiEvent = investFlowFrequencyDataState.error;
        }
        if ((i & 8) != 0) {
            localDate = investFlowFrequencyDataState.nextInvestmentDate;
        }
        if ((i & 16) != 0) {
            z2 = investFlowFrequencyDataState.recurringOnly;
        }
        if ((i & 32) != 0) {
            account = investFlowFrequencyDataState.account;
        }
        boolean z3 = z2;
        Account account2 = account;
        return investFlowFrequencyDataState.copy(z, frequency, uiEvent, localDate, z3, account2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    /* renamed from: component2, reason: from getter */
    public final Frequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final UiEvent<Error> component3() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final LocalDate getNextInvestmentDate() {
        return this.nextInvestmentDate;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getRecurringOnly() {
        return this.recurringOnly;
    }

    /* renamed from: component6, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    public final InvestFlowFrequencyDataState copy(boolean isCrypto, Frequency selectedFrequency, UiEvent<Error> error, LocalDate nextInvestmentDate, boolean recurringOnly, Account account) {
        Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
        return new InvestFlowFrequencyDataState(isCrypto, selectedFrequency, error, nextInvestmentDate, recurringOnly, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowFrequencyDataState)) {
            return false;
        }
        InvestFlowFrequencyDataState investFlowFrequencyDataState = (InvestFlowFrequencyDataState) other;
        return this.isCrypto == investFlowFrequencyDataState.isCrypto && this.selectedFrequency == investFlowFrequencyDataState.selectedFrequency && Intrinsics.areEqual(this.error, investFlowFrequencyDataState.error) && Intrinsics.areEqual(this.nextInvestmentDate, investFlowFrequencyDataState.nextInvestmentDate) && this.recurringOnly == investFlowFrequencyDataState.recurringOnly && Intrinsics.areEqual(this.account, investFlowFrequencyDataState.account);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isCrypto) * 31;
        Frequency frequency = this.selectedFrequency;
        int iHashCode2 = (iHashCode + (frequency == null ? 0 : frequency.hashCode())) * 31;
        UiEvent<Error> uiEvent = this.error;
        int iHashCode3 = (((((iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + this.nextInvestmentDate.hashCode()) * 31) + Boolean.hashCode(this.recurringOnly)) * 31;
        Account account = this.account;
        return iHashCode3 + (account != null ? account.hashCode() : 0);
    }

    public String toString() {
        return "InvestFlowFrequencyDataState(isCrypto=" + this.isCrypto + ", selectedFrequency=" + this.selectedFrequency + ", error=" + this.error + ", nextInvestmentDate=" + this.nextInvestmentDate + ", recurringOnly=" + this.recurringOnly + ", account=" + this.account + ")";
    }

    public InvestFlowFrequencyDataState(boolean z, Frequency frequency, UiEvent<Error> uiEvent, LocalDate nextInvestmentDate, boolean z2, Account account) {
        Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
        this.isCrypto = z;
        this.selectedFrequency = frequency;
        this.error = uiEvent;
        this.nextInvestmentDate = nextInvestmentDate;
        this.recurringOnly = z2;
        this.account = account;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public final Frequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final UiEvent<Error> getError() {
        return this.error;
    }

    public /* synthetic */ InvestFlowFrequencyDataState(boolean z, Frequency frequency, UiEvent uiEvent, LocalDate localDate, boolean z2, Account account, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : frequency, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? InvestFlowFrequency.Companion.defaultInvestmentStartDate$default(InvestFlowFrequency.INSTANCE, null, 1, null) : localDate, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : account);
    }

    public final LocalDate getNextInvestmentDate() {
        return this.nextInvestmentDate;
    }

    public final boolean getRecurringOnly() {
        return this.recurringOnly;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final InvestFlowFrequencyDataState mutateFromInvestFlowFrequency(InvestFlowFrequency frequency) {
        return copy$default(this, false, Frequency.INSTANCE.from(frequency, this.isCrypto), null, frequency instanceof InvestFlowFrequency.Recurring ? ((InvestFlowFrequency.Recurring) frequency).getStartDate() : this.nextInvestmentDate, false, null, 53, null);
    }

    public final InvestFlowFrequencyDataState mutateFrequency(Frequency frequency) {
        LocalDate localDateDefaultInvestmentStartDate$default;
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        if (WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()] == 1) {
            localDateDefaultInvestmentStartDate$default = InvestFlowFrequency.Companion.defaultInvestmentStartDate$default(InvestFlowFrequency.INSTANCE, null, 1, null);
        } else {
            localDateDefaultInvestmentStartDate$default = this.nextInvestmentDate;
        }
        return copy$default(this, false, frequency, null, localDateDefaultInvestmentStartDate$default, false, null, 53, null);
    }

    /* compiled from: InvestFlowFrequencyDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDataState$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDataState;", "args", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyArgs;", "StateProvider", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/investFlow/frequency/FrequencyViewState;", "getStateProvider", "()Lcom/robinhood/android/udf/StateProvider;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InvestFlowFrequencyDataState from(InvestFlowFrequencyArgs args) {
            Intrinsics.checkNotNullParameter(args, "args");
            Frequency frequencyFrom = Frequency.INSTANCE.from(args.getSelectedFrequency(), args.isCrypto());
            boolean zIsCrypto = args.isCrypto();
            boolean recurringOnly = args.getRecurringOnly();
            InvestFlowFrequency selectedFrequency = args.getSelectedFrequency();
            return new InvestFlowFrequencyDataState(zIsCrypto, frequencyFrom, null, selectedFrequency instanceof InvestFlowFrequency.Recurring ? ((InvestFlowFrequency.Recurring) selectedFrequency).getStartDate() : InvestFlowFrequency.Companion.defaultInvestmentStartDate$default(InvestFlowFrequency.INSTANCE, null, 1, null), recurringOnly, null, 36, null);
        }

        public final StateProvider<InvestFlowFrequencyDataState, FrequencyViewState> getStateProvider() {
            return InvestFlowFrequencyDataState.StateProvider;
        }
    }
}

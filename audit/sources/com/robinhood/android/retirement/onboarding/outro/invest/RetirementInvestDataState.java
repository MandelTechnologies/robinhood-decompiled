package com.robinhood.android.retirement.onboarding.outro.invest;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.android.retirement.onboarding.outro.invest.RetirementInvestEvent;
import com.robinhood.android.retirement.onboarding.outro.invest.RetirementInvestViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.retirement.RecommendationsState2;
import com.robinhood.rosetta.converters.retirement.RetirementAccountState2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RecsRetirementContext;
import com.robinhood.rosetta.eventlogging.RetirementContext;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementInvestDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0013\u0010\u0019\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestDataState;", "", "source", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "viewModel", "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestEvent;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;Lcom/robinhood/udf/UiEvent;)V", "getSource", "()Ljava/lang/String;", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getViewModel", "()Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "mutateViewModel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementInvestDataState {
    private final BrokerageAccountType accountType;
    private final UiEvent<? extends RetirementInvestEvent> event;
    private final String source;
    private final RetirementUninvestedViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final StateProvider<RetirementInvestDataState, RetirementInvestViewState> StateProvider = new StateProvider() { // from class: com.robinhood.android.retirement.onboarding.outro.invest.RetirementInvestDataState$Companion$StateProvider$1
        @Override // com.robinhood.android.udf.StateProvider
        public final RetirementInvestViewState reduce(RetirementInvestDataState dataState) {
            String serverValue;
            String serverValue2;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getViewModel() != null) {
                RetirementUninvestedViewModel.MobileCta cta = RetirementInvestDataState.INSTANCE.getCta(dataState.getViewModel());
                if (cta instanceof RetirementUninvestedViewModel.MobileCta.Modal) {
                    RetirementUninvestedViewModel.Modal data = ((RetirementUninvestedViewModel.MobileCta.Modal) cta).getData();
                    UiEvent<? extends RetirementInvestEvent> event = dataState.getEvent();
                    BrokerageAccountType accountType = dataState.getAccountType();
                    if (accountType == null || (serverValue = accountType.getServerValue()) == null) {
                        serverValue = "";
                    }
                    RetirementContext retirementContext = new RetirementContext(serverValue, RetirementAccountState2.toProtoBuf(dataState.getViewModel().getAccountState()), null, 4, null);
                    BrokerageAccountType accountType2 = dataState.getAccountType();
                    return new RetirementInvestViewState.Success(data, event, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RecsRetirementContext("organic", null, (accountType2 == null || (serverValue2 = accountType2.getServerValue()) == null) ? "" : serverValue2, RecommendationsState2.toProtoBuf(dataState.getViewModel().getRecsState()), null, 18, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, retirementContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -134217729, -32769, -1, -1, 16383, null));
                }
                return new RetirementInvestViewState.Loading(dataState.getEvent());
            }
            return new RetirementInvestViewState.Loading(dataState.getEvent());
        }
    };

    public RetirementInvestDataState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RetirementInvestDataState copy$default(RetirementInvestDataState retirementInvestDataState, String str, BrokerageAccountType brokerageAccountType, RetirementUninvestedViewModel retirementUninvestedViewModel, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retirementInvestDataState.source;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = retirementInvestDataState.accountType;
        }
        if ((i & 4) != 0) {
            retirementUninvestedViewModel = retirementInvestDataState.viewModel;
        }
        if ((i & 8) != 0) {
            uiEvent = retirementInvestDataState.event;
        }
        return retirementInvestDataState.copy(str, brokerageAccountType, retirementUninvestedViewModel, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component3, reason: from getter */
    public final RetirementUninvestedViewModel getViewModel() {
        return this.viewModel;
    }

    public final UiEvent<? extends RetirementInvestEvent> component4() {
        return this.event;
    }

    public final RetirementInvestDataState copy(String source, BrokerageAccountType accountType, RetirementUninvestedViewModel viewModel, UiEvent<? extends RetirementInvestEvent> event) {
        return new RetirementInvestDataState(source, accountType, viewModel, event);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementInvestDataState)) {
            return false;
        }
        RetirementInvestDataState retirementInvestDataState = (RetirementInvestDataState) other;
        return Intrinsics.areEqual(this.source, retirementInvestDataState.source) && this.accountType == retirementInvestDataState.accountType && Intrinsics.areEqual(this.viewModel, retirementInvestDataState.viewModel) && Intrinsics.areEqual(this.event, retirementInvestDataState.event);
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BrokerageAccountType brokerageAccountType = this.accountType;
        int iHashCode2 = (iHashCode + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
        RetirementUninvestedViewModel retirementUninvestedViewModel = this.viewModel;
        int iHashCode3 = (iHashCode2 + (retirementUninvestedViewModel == null ? 0 : retirementUninvestedViewModel.hashCode())) * 31;
        UiEvent<? extends RetirementInvestEvent> uiEvent = this.event;
        return iHashCode3 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "RetirementInvestDataState(source=" + this.source + ", accountType=" + this.accountType + ", viewModel=" + this.viewModel + ", event=" + this.event + ")";
    }

    public RetirementInvestDataState(String str, BrokerageAccountType brokerageAccountType, RetirementUninvestedViewModel retirementUninvestedViewModel, UiEvent<? extends RetirementInvestEvent> uiEvent) {
        this.source = str;
        this.accountType = brokerageAccountType;
        this.viewModel = retirementUninvestedViewModel;
        this.event = uiEvent;
    }

    public /* synthetic */ RetirementInvestDataState(String str, BrokerageAccountType brokerageAccountType, RetirementUninvestedViewModel retirementUninvestedViewModel, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : brokerageAccountType, (i & 4) != 0 ? null : retirementUninvestedViewModel, (i & 8) != 0 ? null : uiEvent);
    }

    public final String getSource() {
        return this.source;
    }

    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public final RetirementUninvestedViewModel getViewModel() {
        return this.viewModel;
    }

    public final UiEvent<? extends RetirementInvestEvent> getEvent() {
        return this.event;
    }

    public final RetirementInvestDataState mutateViewModel(RetirementUninvestedViewModel viewModel) {
        UiEvent<? extends RetirementInvestEvent> uiEvent;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        RetirementUninvestedViewModel.MobileCta cta = INSTANCE.getCta(viewModel);
        if (cta == null) {
            uiEvent = new UiEvent<>(RetirementInvestEvent.Exit.INSTANCE);
        } else if (cta instanceof RetirementUninvestedViewModel.MobileCta.Deeplink) {
            uiEvent = new UiEvent<>(new RetirementInvestEvent.Redirect(((RetirementUninvestedViewModel.MobileCta.Deeplink) cta).getData()));
        } else {
            if (!(cta instanceof RetirementUninvestedViewModel.MobileCta.Modal)) {
                throw new NoWhenBranchMatchedException();
            }
            uiEvent = null;
        }
        UiEvent<? extends RetirementInvestEvent> uiEvent2 = this.event;
        return copy$default(this, null, null, viewModel, uiEvent2 == null ? uiEvent : uiEvent2, 3, null);
    }

    /* compiled from: RetirementInvestDataState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestDataState$Companion;", "", "<init>", "()V", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$MobileCta;", "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;", "getCta", "(Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;)Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$MobileCta;", "StateProvider", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestDataState;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestViewState;", "getStateProvider", "()Lcom/robinhood/android/udf/StateProvider;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final RetirementUninvestedViewModel.MobileCta getCta(RetirementUninvestedViewModel retirementUninvestedViewModel) {
            RetirementUninvestedViewModel.MobileCta cta;
            RetirementUninvestedViewModel.MobileContent mobileContent = retirementUninvestedViewModel.getMobileContent();
            return (mobileContent == null || (cta = mobileContent.getCta()) == null) ? retirementUninvestedViewModel.getMobileReorderCta() : cta;
        }

        public final StateProvider<RetirementInvestDataState, RetirementInvestViewState> getStateProvider() {
            return RetirementInvestDataState.StateProvider;
        }
    }
}

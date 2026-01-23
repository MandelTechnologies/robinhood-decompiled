package com.robinhood.android.investFlow.recurring;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.utils.RecurringLoggingUtils;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.investFlow.InvestFlowExtensions;
import com.robinhood.android.investFlow.core.InvestFlowPaymentMethod;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.api.ApiRecurringHookStartDate;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.api.ApiNextInvestmentDate;
import com.robinhood.rosetta.eventlogging.Basket;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Some;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: InvestFlowRecurringDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00011B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010'\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "investmentScheduleStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/analytics/EventLogger;Landroidx/lifecycle/SavedStateHandle;)V", "", "onCreate", "()V", "onResume", "onClickReviewBtn", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "onFrequencySelected", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "primaryPaymentMethod", "backupPaymentMethod", "onPaymentMethodsUpdated", "(Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;)V", "j$/time/LocalDate", InquiryField.DateField.TYPE, "selectStartDate", "(Lj$/time/LocalDate;)V", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "action", "state", "logRowTap", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringViewState;)V", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "Lcom/robinhood/analytics/EventLogger;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowRecurringDuxo extends OldBaseDuxo<InvestFlowRecurringViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final EventLogger eventLogger;
    private final InstrumentStore instrumentStore;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final SavedStateHandle savedStateHandle;
    private final UnifiedAccountStore unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID onResume$lambda$7(UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InvestFlowRecurringDuxo(AccountProvider accountProvider, UnifiedAccountStore unifiedAccountStore, InstrumentStore instrumentStore, TraderInvestmentScheduleStore investmentScheduleStore, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new InvestFlowRecurringViewState(((InvestFlowRecurringArgs) companion.getArgs(savedStateHandle)).getTotalAmount(), ((InvestFlowRecurringArgs) companion.getArgs(savedStateHandle)).getFrequency(), ((InvestFlowRecurringArgs) companion.getArgs(savedStateHandle)).getStartDate(), ((InvestFlowRecurringArgs) companion.getArgs(savedStateHandle)).getPrimaryPaymentMethod(), ((InvestFlowRecurringArgs) companion.getArgs(savedStateHandle)).getBackupPaymentMethod(), false, null, null, ((InvestFlowRecurringArgs) companion.getArgs(savedStateHandle)).getAssetAllocations(), null, null, ((InvestFlowRecurringArgs) companion.getArgs(savedStateHandle)).isRecurringUpsell(), ((InvestFlowRecurringArgs) companion.getArgs(savedStateHandle)).getAccountNumber(), null, 9824, null), null, 2, null);
        this.accountProvider = accountProvider;
        this.unifiedAccountStore = unifiedAccountStore;
        this.instrumentStore = instrumentStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        Single map;
        super.onCreate();
        Companion companion = INSTANCE;
        if (((InvestFlowRecurringArgs) companion.getArgs((HasSavedState) this)).getStartDate() == null) {
            ApiAssetType apiAssetType = ((InvestFlowRecurringArgs) companion.getArgs((HasSavedState) this)).isCrypto() ? ApiAssetType.CRYPTO : ApiAssetType.EQUITY;
            if (((InvestFlowRecurringArgs) companion.getArgs((HasSavedState) this)).isRecurringUpsell()) {
                map = this.investmentScheduleStore.getRecurringHookStartDate(apiAssetType, ((InvestFlowRecurringArgs) companion.getArgs((HasSavedState) this)).getFrequency()).map(new Function() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$onCreate$nextInvestDateObs$1
                    @Override // io.reactivex.functions.Function
                    public final LocalDate apply(ApiRecurringHookStartDate it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.getRecurring_hook_start_date();
                    }
                });
            } else {
                map = this.investmentScheduleStore.getNextInvestmentDate(apiAssetType, InvestFlowFrequency.Companion.defaultInvestmentStartDate$default(InvestFlowFrequency.INSTANCE, null, 1, null), ((InvestFlowRecurringArgs) companion.getArgs((HasSavedState) this)).getFrequency()).map(new Function() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$onCreate$nextInvestDateObs$2
                    @Override // io.reactivex.functions.Function
                    public final LocalDate apply(ApiNextInvestmentDate it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.getNext_investment_date();
                    }
                });
            }
            Intrinsics.checkNotNull(map);
            LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestFlowRecurringDuxo.onCreate$lambda$1(this.f$0, (LocalDate) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(InvestFlowRecurringDuxo investFlowRecurringDuxo, final LocalDate localDate) {
        investFlowRecurringDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringDuxo.onCreate$lambda$1$lambda$0(localDate, (InvestFlowRecurringViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowRecurringViewState onCreate$lambda$1$lambda$0(LocalDate localDate, InvestFlowRecurringViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((15359 & 1) != 0 ? applyMutation.totalAmount : null, (15359 & 2) != 0 ? applyMutation.frequency : null, (15359 & 4) != 0 ? applyMutation.startDate : localDate, (15359 & 8) != 0 ? applyMutation.primaryPaymentMethod : null, (15359 & 16) != 0 ? applyMutation.backupPaymentMethod : null, (15359 & 32) != 0 ? applyMutation.isCrypto : false, (15359 & 64) != 0 ? applyMutation.instruments : null, (15359 & 128) != 0 ? applyMutation.brokerageAccountType : null, (15359 & 256) != 0 ? applyMutation.assetAllocations : null, (15359 & 512) != 0 ? applyMutation.accountBuyingPower : null, (15359 & 1024) != 0 ? applyMutation.onReviewEvent : null, (15359 & 2048) != 0 ? applyMutation.isRecurringUpsell : false, (15359 & 4096) != 0 ? applyMutation.accountNumber : null, (15359 & 8192) != 0 ? applyMutation.account : null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        AccountProvider accountProvider = this.accountProvider;
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, accountProvider.streamAccount(((InvestFlowRecurringArgs) companion.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringDuxo.onResume$lambda$3(this.f$0, (Account) obj);
            }
        });
        Observable<R> map = this.unifiedAccountStore.streamAccount(((InvestFlowRecurringArgs) companion.getArgs((HasSavedState) this)).getAccountNumber()).map(new Function() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo.onResume.2
            @Override // io.reactivex.functions.Function
            public final Optional<Money> apply(Optional<UnifiedAccountV2> account) {
                Intrinsics.checkNotNullParameter(account, "account");
                if (account instanceof Some) {
                    return Optional.INSTANCE.m2972of(((UnifiedAccountV2) ((Some) account).getValue()).getAccountBuyingPower());
                }
                if (account instanceof Optional2) {
                    return Optional2.INSTANCE;
                }
                throw new NoWhenBranchMatchedException();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringDuxo.onResume$lambda$5(this.f$0, (Optional) obj);
            }
        });
        List<ApiAssetAllocation> assetAllocations = ((InvestFlowRecurringArgs) companion.getArgs((HasSavedState) this)).getAssetAllocations();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = assetAllocations.iterator();
        while (it.hasNext()) {
            UUID asset_id = ((ApiAssetAllocation) it.next()).getAsset().getAsset_id();
            if (asset_id != null) {
                arrayList.add(asset_id);
            }
        }
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentStore.getInstruments(arrayList, new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringDuxo.onResume$lambda$7((UUID) obj);
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringDuxo.onResume$lambda$9(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(InvestFlowRecurringDuxo investFlowRecurringDuxo, final Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        investFlowRecurringDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringDuxo.onResume$lambda$3$lambda$2(account, (InvestFlowRecurringViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowRecurringViewState onResume$lambda$3$lambda$2(Account account, InvestFlowRecurringViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((15359 & 1) != 0 ? applyMutation.totalAmount : null, (15359 & 2) != 0 ? applyMutation.frequency : null, (15359 & 4) != 0 ? applyMutation.startDate : null, (15359 & 8) != 0 ? applyMutation.primaryPaymentMethod : null, (15359 & 16) != 0 ? applyMutation.backupPaymentMethod : null, (15359 & 32) != 0 ? applyMutation.isCrypto : false, (15359 & 64) != 0 ? applyMutation.instruments : null, (15359 & 128) != 0 ? applyMutation.brokerageAccountType : account.getBrokerageAccountType(), (15359 & 256) != 0 ? applyMutation.assetAllocations : null, (15359 & 512) != 0 ? applyMutation.accountBuyingPower : null, (15359 & 1024) != 0 ? applyMutation.onReviewEvent : null, (15359 & 2048) != 0 ? applyMutation.isRecurringUpsell : false, (15359 & 4096) != 0 ? applyMutation.accountNumber : null, (15359 & 8192) != 0 ? applyMutation.account : account);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(InvestFlowRecurringDuxo investFlowRecurringDuxo, Optional optional) {
        final Money money = (Money) optional.component1();
        investFlowRecurringDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringDuxo.onResume$lambda$5$lambda$4(money, (InvestFlowRecurringViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowRecurringViewState onResume$lambda$5$lambda$4(Money money, InvestFlowRecurringViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((15359 & 1) != 0 ? applyMutation.totalAmount : null, (15359 & 2) != 0 ? applyMutation.frequency : null, (15359 & 4) != 0 ? applyMutation.startDate : null, (15359 & 8) != 0 ? applyMutation.primaryPaymentMethod : null, (15359 & 16) != 0 ? applyMutation.backupPaymentMethod : null, (15359 & 32) != 0 ? applyMutation.isCrypto : false, (15359 & 64) != 0 ? applyMutation.instruments : null, (15359 & 128) != 0 ? applyMutation.brokerageAccountType : null, (15359 & 256) != 0 ? applyMutation.assetAllocations : null, (15359 & 512) != 0 ? applyMutation.accountBuyingPower : money, (15359 & 1024) != 0 ? applyMutation.onReviewEvent : null, (15359 & 2048) != 0 ? applyMutation.isRecurringUpsell : false, (15359 & 4096) != 0 ? applyMutation.accountNumber : null, (15359 & 8192) != 0 ? applyMutation.account : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(InvestFlowRecurringDuxo investFlowRecurringDuxo, final List instruments) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        investFlowRecurringDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringDuxo.onResume$lambda$9$lambda$8(instruments, (InvestFlowRecurringViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowRecurringViewState onResume$lambda$9$lambda$8(List list, InvestFlowRecurringViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((15359 & 1) != 0 ? applyMutation.totalAmount : null, (15359 & 2) != 0 ? applyMutation.frequency : null, (15359 & 4) != 0 ? applyMutation.startDate : null, (15359 & 8) != 0 ? applyMutation.primaryPaymentMethod : null, (15359 & 16) != 0 ? applyMutation.backupPaymentMethod : null, (15359 & 32) != 0 ? applyMutation.isCrypto : false, (15359 & 64) != 0 ? applyMutation.instruments : list, (15359 & 128) != 0 ? applyMutation.brokerageAccountType : null, (15359 & 256) != 0 ? applyMutation.assetAllocations : null, (15359 & 512) != 0 ? applyMutation.accountBuyingPower : null, (15359 & 1024) != 0 ? applyMutation.onReviewEvent : null, (15359 & 2048) != 0 ? applyMutation.isRecurringUpsell : false, (15359 & 4096) != 0 ? applyMutation.accountNumber : null, (15359 & 8192) != 0 ? applyMutation.account : null);
    }

    public final void onClickReviewBtn() {
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringDuxo.onClickReviewBtn$lambda$10((InvestFlowRecurringViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowRecurringViewState onClickReviewBtn$lambda$10(InvestFlowRecurringViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation.getStartDate() != null) {
            return applyMutation.copy((15359 & 1) != 0 ? applyMutation.totalAmount : null, (15359 & 2) != 0 ? applyMutation.frequency : null, (15359 & 4) != 0 ? applyMutation.startDate : null, (15359 & 8) != 0 ? applyMutation.primaryPaymentMethod : null, (15359 & 16) != 0 ? applyMutation.backupPaymentMethod : null, (15359 & 32) != 0 ? applyMutation.isCrypto : false, (15359 & 64) != 0 ? applyMutation.instruments : null, (15359 & 128) != 0 ? applyMutation.brokerageAccountType : null, (15359 & 256) != 0 ? applyMutation.assetAllocations : null, (15359 & 512) != 0 ? applyMutation.accountBuyingPower : null, (15359 & 1024) != 0 ? applyMutation.onReviewEvent : new UiEvent(applyMutation.getStartDate()), (15359 & 2048) != 0 ? applyMutation.isRecurringUpsell : false, (15359 & 4096) != 0 ? applyMutation.accountNumber : null, (15359 & 8192) != 0 ? applyMutation.account : null);
        }
        return applyMutation.copy((15359 & 1) != 0 ? applyMutation.totalAmount : null, (15359 & 2) != 0 ? applyMutation.frequency : null, (15359 & 4) != 0 ? applyMutation.startDate : null, (15359 & 8) != 0 ? applyMutation.primaryPaymentMethod : null, (15359 & 16) != 0 ? applyMutation.backupPaymentMethod : null, (15359 & 32) != 0 ? applyMutation.isCrypto : false, (15359 & 64) != 0 ? applyMutation.instruments : null, (15359 & 128) != 0 ? applyMutation.brokerageAccountType : null, (15359 & 256) != 0 ? applyMutation.assetAllocations : null, (15359 & 512) != 0 ? applyMutation.accountBuyingPower : null, (15359 & 1024) != 0 ? applyMutation.onReviewEvent : null, (15359 & 2048) != 0 ? applyMutation.isRecurringUpsell : false, (15359 & 4096) != 0 ? applyMutation.accountNumber : null, (15359 & 8192) != 0 ? applyMutation.account : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowRecurringViewState onFrequencySelected$lambda$11(ApiInvestmentSchedule.Frequency frequency, InvestFlowRecurringViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((15359 & 1) != 0 ? applyMutation.totalAmount : null, (15359 & 2) != 0 ? applyMutation.frequency : frequency, (15359 & 4) != 0 ? applyMutation.startDate : null, (15359 & 8) != 0 ? applyMutation.primaryPaymentMethod : null, (15359 & 16) != 0 ? applyMutation.backupPaymentMethod : null, (15359 & 32) != 0 ? applyMutation.isCrypto : false, (15359 & 64) != 0 ? applyMutation.instruments : null, (15359 & 128) != 0 ? applyMutation.brokerageAccountType : null, (15359 & 256) != 0 ? applyMutation.assetAllocations : null, (15359 & 512) != 0 ? applyMutation.accountBuyingPower : null, (15359 & 1024) != 0 ? applyMutation.onReviewEvent : null, (15359 & 2048) != 0 ? applyMutation.isRecurringUpsell : false, (15359 & 4096) != 0 ? applyMutation.accountNumber : null, (15359 & 8192) != 0 ? applyMutation.account : null);
    }

    public final void onFrequencySelected(final ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringDuxo.onFrequencySelected$lambda$11(frequency, (InvestFlowRecurringViewState) obj);
            }
        });
    }

    public final void onPaymentMethodsUpdated(final InvestFlowPaymentMethod primaryPaymentMethod, final InvestFlowPaymentMethod backupPaymentMethod) {
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringDuxo.onPaymentMethodsUpdated$lambda$12(primaryPaymentMethod, backupPaymentMethod, (InvestFlowRecurringViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowRecurringViewState onPaymentMethodsUpdated$lambda$12(InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowPaymentMethod investFlowPaymentMethod2, InvestFlowRecurringViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((15359 & 1) != 0 ? applyMutation.totalAmount : null, (15359 & 2) != 0 ? applyMutation.frequency : null, (15359 & 4) != 0 ? applyMutation.startDate : null, (15359 & 8) != 0 ? applyMutation.primaryPaymentMethod : investFlowPaymentMethod, (15359 & 16) != 0 ? applyMutation.backupPaymentMethod : investFlowPaymentMethod2, (15359 & 32) != 0 ? applyMutation.isCrypto : false, (15359 & 64) != 0 ? applyMutation.instruments : null, (15359 & 128) != 0 ? applyMutation.brokerageAccountType : null, (15359 & 256) != 0 ? applyMutation.assetAllocations : null, (15359 & 512) != 0 ? applyMutation.accountBuyingPower : null, (15359 & 1024) != 0 ? applyMutation.onReviewEvent : null, (15359 & 2048) != 0 ? applyMutation.isRecurringUpsell : false, (15359 & 4096) != 0 ? applyMutation.accountNumber : null, (15359 & 8192) != 0 ? applyMutation.account : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowRecurringViewState selectStartDate$lambda$13(LocalDate localDate, InvestFlowRecurringViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((15359 & 1) != 0 ? applyMutation.totalAmount : null, (15359 & 2) != 0 ? applyMutation.frequency : null, (15359 & 4) != 0 ? applyMutation.startDate : localDate, (15359 & 8) != 0 ? applyMutation.primaryPaymentMethod : null, (15359 & 16) != 0 ? applyMutation.backupPaymentMethod : null, (15359 & 32) != 0 ? applyMutation.isCrypto : false, (15359 & 64) != 0 ? applyMutation.instruments : null, (15359 & 128) != 0 ? applyMutation.brokerageAccountType : null, (15359 & 256) != 0 ? applyMutation.assetAllocations : null, (15359 & 512) != 0 ? applyMutation.accountBuyingPower : null, (15359 & 1024) != 0 ? applyMutation.onReviewEvent : null, (15359 & 2048) != 0 ? applyMutation.isRecurringUpsell : false, (15359 & 4096) != 0 ? applyMutation.accountNumber : null, (15359 & 8192) != 0 ? applyMutation.account : null);
    }

    public final void selectStartDate(final LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringDuxo.selectStartDate$lambda$13(date, (InvestFlowRecurringViewState) obj);
            }
        });
    }

    public final void logRowTap(UserInteractionEventData.Action action, InvestFlowRecurringViewState state) {
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(state, "state");
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.INVEST_FLOW_ORDER_PREVIEW;
        if (((InvestFlowRecurringArgs) INSTANCE.getArgs((HasSavedState) this)).isCrypto()) {
            str = InvestFlowConstants.Logging.CRYPTOS;
        } else {
            str = InvestFlowConstants.Logging.STOCKS_AND_ETFS;
        }
        Screen screen = new Screen(name, str, null, null, 12, null);
        Component component = new Component(Component.ComponentType.ROW, null, null, 6, null);
        Basket basket = new Basket(state.getNumInstruments(), InvestFlowExtensions.toInvestFlowLoggingString(state.getAssetAllocations()), null, 4, null);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        Context.ProductTag productTag = null;
        int i4 = 0;
        String str4 = null;
        String str5 = null;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new Context(i, i2, i3, null, str2, null, str3, productTag, i4, null, str4, str5, null, null, null, null, null, null, null, null, null, null, null, new RecurringContext(null, null, null, RecurringLoggingUtils.toRecurringContextScheduleFrequency(state.getFrequency()), null, state.getTotalAmount().getDecimalValue().doubleValue(), null, null, 0.0d, null, null, 2007, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, basket, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -262145, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* compiled from: InvestFlowRecurringDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringDuxo;", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringArgs;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InvestFlowRecurringDuxo, InvestFlowRecurringArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowRecurringArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InvestFlowRecurringArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowRecurringArgs getArgs(InvestFlowRecurringDuxo investFlowRecurringDuxo) {
            return (InvestFlowRecurringArgs) DuxoCompanion.DefaultImpls.getArgs(this, investFlowRecurringDuxo);
        }
    }
}

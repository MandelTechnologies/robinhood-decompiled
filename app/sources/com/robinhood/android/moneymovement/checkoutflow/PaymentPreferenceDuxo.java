package com.robinhood.android.moneymovement.checkoutflow;

import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.CreateOrUpdatePaymentPreferenceRequestDto;
import bff_money_movement.service.p019v1.GetSubscriptionPaymentMethodRequestDto;
import bff_money_movement.service.p019v1.GetSubscriptionPaymentMethodResponseDto;
import bff_money_movement.service.p019v1.InstrumentRequestDto;
import bff_money_movement.service.p019v1.PaymentInstrumentTypeDto;
import bff_money_movement.service.p019v1.SubscriptionTypeDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.experiments.SimpleVariant;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.lib.transfers.contracts.TransferAccountsService;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.transfers.accounts.contracts.AccountSelectionConfigurationService;
import com.robinhood.transfers.accounts.contracts.AccountSelectionResolver;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountSelectionLoadConfiguration;
import com.robinhood.utils.logging.CrashReporter;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.service.ManagedServiceExtension2;

/* compiled from: PaymentPreferenceDuxo.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 42\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00014BA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\u001a\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u001cH\u0002J\f\u0010&\u001a\u00020'*\u00020$H\u0002J\f\u0010(\u001a\u00020$*\u00020\tH\u0002J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0002J\u0006\u0010+\u001a\u00020\u001eJ\u001c\u0010,\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010\u001c2\b\u0010.\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010/\u001a\u0004\u0018\u00010\u001cH\u0082@¢\u0006\u0002\u00100J\f\u00101\u001a\u000202*\u000203H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDataState;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceViewState;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lbff_money_movement/service/v1/BffMoneyMovementService;Lcom/robinhood/android/microgramsdui/MicrogramManager;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "source", "Lmicrogram/android/RemoteMicrogramApplication;", "appearanceSet", "", "", "onCreate", "", "onStart", "onResume", "onStop", "loadPreselectedAccount", "instance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "accountToPreselect", "loadConfigService", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService;", "accountSectionInstance", "setupDataListeners", "setupMicrogramActions", "onCtaClicked", "createOrUpdatePaymentPreference", "primaryAccountId", "backupAccountId", "getCurrentBillingState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "Lbff_money_movement/service/v1/PaymentInstrumentTypeDto;", "Companion", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class PaymentPreferenceDuxo extends BaseDuxo3<PaymentPreferenceDataState, PaymentPreferenceViewState, PaymentPreferenceEvent> implements HasSavedState {
    public static final int PRIORITY_BACKUP = 2;
    public static final int PRIORITY_PRIMARY = 1;
    private final Set<String> appearanceSet;
    private final BffMoneyMovementService bffMoneyMovementService;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final MicrogramManager microgramManager;
    private final SavedStateHandle savedStateHandle;
    private final RemoteMicrogramApplication source;
    private final TransferAccountStore transferAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PaymentPreferenceDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentInstrumentTypeDto.values().length];
            try {
                iArr[PaymentInstrumentTypeDto.INSTRUMENT_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentInstrumentTypeDto.DEBIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentInstrumentTypeDto.BANK_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentInstrumentTypeDto.RHS_BROKERAGE_CASH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PaymentPreferenceDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {413}, m3647m = "getCurrentBillingState")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$getCurrentBillingState$1 */
    static final class C221871 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C221871(Continuation<? super C221871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentPreferenceDuxo.this.getCurrentBillingState(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentPreferenceDuxo(BffMoneyMovementService bffMoneyMovementService, MicrogramManager microgramManager, SavedStateHandle savedStateHandle, TransferAccountStore transferAccountStore, ExperimentsStore experimentsStore, EventLogger eventLogger, DuxoBundle duxoBundle) {
        super(new PaymentPreferenceDataState(false, null, false, null, null, false, 0, null, null, null, null, null, 4092, null), new PaymentPreferenceStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.microgramManager = microgramManager;
        this.savedStateHandle = savedStateHandle;
        this.transferAccountStore = transferAccountStore;
        this.experimentsStore = experimentsStore;
        this.eventLogger = eventLogger;
        this.source = new RemoteMicrogramApplication(MicrogramConstants.PAYMENT_PREFERENCE_MICROGRAM_APP, null, 2, null);
        this.appearanceSet = new LinkedHashSet();
    }

    /* compiled from: PaymentPreferenceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$onCreate$1", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$onCreate$1 */
    static final class C221911 extends ContinuationImpl7 implements Function2<PaymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C221911(Continuation<? super C221911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C221911 c221911 = PaymentPreferenceDuxo.this.new C221911(continuation);
            c221911.L$0 = obj;
            return c221911;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentPreferenceDataState paymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState> continuation) {
            return ((C221911) create(paymentPreferenceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PaymentPreferenceDataState.copy$default((PaymentPreferenceDataState) this.L$0, false, PaymentPreferenceDuxo.this.source, false, null, null, true, 0, null, null, null, null, null, 4061, null);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        applyMutation(new C221911(null));
        MicrogramManager2 microgramManager2AccountSectionInstance = accountSectionInstance(this.microgramManager);
        setupMicrogramActions(microgramManager2AccountSectionInstance);
        setupDataListeners(microgramManager2AccountSectionInstance);
        loadPreselectedAccount(microgramManager2AccountSectionInstance, ((PaymentPreferenceFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAccountToPreselect());
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Companion.BackupYGExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentPreferenceDuxo.onCreate$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(PaymentPreferenceDuxo paymentPreferenceDuxo, boolean z) {
        paymentPreferenceDuxo.applyMutation(new PaymentPreferenceDuxo$onCreate$2$1(z, null));
        if (z) {
            Companion companion = INSTANCE;
            if (!((PaymentPreferenceFragmentKey) companion.getArgs((HasSavedState) paymentPreferenceDuxo)).getAutoProceed()) {
                BuildersKt__Builders_commonKt.launch$default(paymentPreferenceDuxo.getLifecycleScope(), null, null, new PaymentPreferenceDuxo$onCreate$2$2(paymentPreferenceDuxo, null), 3, null);
            } else {
                paymentPreferenceDuxo.createOrUpdatePaymentPreference(((PaymentPreferenceFragmentKey) companion.getArgs((HasSavedState) paymentPreferenceDuxo)).getAccountToPreselect(), ((PaymentPreferenceFragmentKey) companion.getArgs((HasSavedState) paymentPreferenceDuxo)).getBackUpAccountId());
            }
        } else if (((PaymentPreferenceFragmentKey) INSTANCE.getArgs((HasSavedState) paymentPreferenceDuxo)).getAutoProceed()) {
            paymentPreferenceDuxo.submit(PaymentPreferenceEvent.CloseScreen.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.GOLD_BILLING_PAYMENT_PREFERENCE, null, null, null, 14, null), null, null, null, 29, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        this.transferAccountStore.refresh(true);
        setupDataListeners(accountSectionInstance(this.microgramManager));
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logScreenDisappear$default(this.eventLogger, null, new Screen(Screen.Name.GOLD_BILLING_PAYMENT_PREFERENCE, null, null, null, 14, null), null, null, null, 29, null);
    }

    /* compiled from: PaymentPreferenceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$loadPreselectedAccount$1", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$loadPreselectedAccount$1 */
    static final class C221901 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountToPreselect;
        final /* synthetic */ MicrogramManager2 $instance;
        int label;
        final /* synthetic */ PaymentPreferenceDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C221901(String str, PaymentPreferenceDuxo paymentPreferenceDuxo, MicrogramManager2 microgramManager2, Continuation<? super C221901> continuation) {
            super(2, continuation);
            this.$accountToPreselect = str;
            this.this$0 = paymentPreferenceDuxo;
            this.$instance = microgramManager2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C221901(this.$accountToPreselect, this.this$0, this.$instance, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C221901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$accountToPreselect;
                if (str != null && str.length() != 0) {
                    AccountSelectionConfigurationService accountSelectionConfigurationServiceLoadConfigService = this.this$0.loadConfigService(this.$instance);
                    TransferAccountSelectionLoadConfiguration transferAccountSelectionLoadConfiguration = new TransferAccountSelectionLoadConfiguration(this.$accountToPreselect, null);
                    this.label = 1;
                    if (accountSelectionConfigurationServiceLoadConfigService.setOnLoadConfiguration(transferAccountSelectionLoadConfiguration, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.applyMutation(new AnonymousClass1(this.$accountToPreselect, null));
            return Unit.INSTANCE;
        }

        /* compiled from: PaymentPreferenceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$loadPreselectedAccount$1$1", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$loadPreselectedAccount$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PaymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState>, Object> {
            final /* synthetic */ String $accountToPreselect;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$accountToPreselect = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountToPreselect, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PaymentPreferenceDataState paymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState> continuation) {
                return ((AnonymousClass1) create(paymentPreferenceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PaymentPreferenceDataState.copy$default((PaymentPreferenceDataState) this.L$0, false, null, false, this.$accountToPreselect, ApiTransferAccount.TransferAccountType.UNKNOWN, false, 0, null, null, null, null, null, 4071, null);
            }
        }
    }

    private final void loadPreselectedAccount(MicrogramManager2 instance, String accountToPreselect) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C221901(accountToPreselect, this, instance, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountSelectionConfigurationService loadConfigService(MicrogramManager2 microgramManager2) {
        return (AccountSelectionConfigurationService) microgramManager2.getComponent().getServiceLocator().getClient(AccountSelectionConfigurationService.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MicrogramManager2 accountSectionInstance(MicrogramManager microgramManager) {
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        MicrogramLaunchId microgramLaunchId = new MicrogramLaunchId(this.source, null, 2, null);
        microgramLaunchId.setExtensions(MapsKt.mapOf(ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(TransferAccountsService.class), new TransferAccountServiceImpl(this.transferAccountStore))));
        Unit unit = Unit.INSTANCE;
        return MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, lifecycleScope, microgramLaunchId, null, 4, null);
    }

    private final void setupDataListeners(final MicrogramManager2 instance) {
        LifecycleHost.DefaultImpls.bind$default(this, this.transferAccountStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentPreferenceDuxo.setupDataListeners$lambda$2(this.f$0, instance, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupDataListeners$lambda$2(PaymentPreferenceDuxo paymentPreferenceDuxo, MicrogramManager2 microgramManager2, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(paymentPreferenceDuxo.getLifecycleScope(), null, null, new PaymentPreferenceDuxo$setupDataListeners$1$1(paymentPreferenceDuxo, microgramManager2, null), 3, null);
        return Unit.INSTANCE;
    }

    private final void setupMicrogramActions(MicrogramManager2 instance) {
        Object hostImplementation = instance.getComponent().getServiceLocator().getHostImplementation(AccountSelectionResolver.class);
        Intrinsics.checkNotNull(hostImplementation, "null cannot be cast to non-null type com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceAccountSelectionResolverImpl");
        PaymentPreferenceAccountSelectionResolverImpl paymentPreferenceAccountSelectionResolverImpl = (PaymentPreferenceAccountSelectionResolverImpl) hostImplementation;
        paymentPreferenceAccountSelectionResolverImpl.setAddNewAccountSelectedCallback(new Function0() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentPreferenceDuxo.setupMicrogramActions$lambda$3(this.f$0);
            }
        });
        paymentPreferenceAccountSelectionResolverImpl.setAccountSelectedCallback(new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentPreferenceDuxo.setupMicrogramActions$lambda$4(this.f$0, (String) obj);
            }
        });
        paymentPreferenceAccountSelectionResolverImpl.setAccountRowAppearCallback(new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentPreferenceDuxo.setupMicrogramActions$lambda$5(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupMicrogramActions$lambda$3(PaymentPreferenceDuxo paymentPreferenceDuxo) {
        EventLogger eventLogger = paymentPreferenceDuxo.eventLogger;
        Screen screen = new Screen(Screen.Name.GOLD_BILLING_PAYMENT_PREFERENCE, null, null, null, 14, null);
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.ADD_ACCOUNT, screen, new Component(Component.ComponentType.ADD_ACCOUNT, null, null, 6, null), null, null, false, 56, null);
        paymentPreferenceDuxo.submit(PaymentPreferenceEvent.NavigateToAddAccount.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupMicrogramActions$lambda$4(PaymentPreferenceDuxo paymentPreferenceDuxo, String selectedId) {
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        BuildersKt__Builders_commonKt.launch$default(paymentPreferenceDuxo.getLifecycleScope(), null, null, new PaymentPreferenceDuxo$setupMicrogramActions$2$1(paymentPreferenceDuxo, selectedId, null), 3, null);
        paymentPreferenceDuxo.applyMutation(new PaymentPreferenceDuxo$setupMicrogramActions$2$2(selectedId, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupMicrogramActions$lambda$5(PaymentPreferenceDuxo paymentPreferenceDuxo, String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        BuildersKt__Builders_commonKt.launch$default(paymentPreferenceDuxo.getLifecycleScope(), null, null, new PaymentPreferenceDuxo$setupMicrogramActions$3$1(paymentPreferenceDuxo, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(paymentPreferenceDuxo.getLifecycleScope(), null, null, new PaymentPreferenceDuxo$setupMicrogramActions$3$2(paymentPreferenceDuxo, accountId, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: PaymentPreferenceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$onCtaClicked$1", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$onCtaClicked$1 */
    static final class C221921 extends ContinuationImpl7 implements Function2<PaymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C221921(Continuation<? super C221921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C221921 c221921 = new C221921(continuation);
            c221921.L$0 = obj;
            return c221921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentPreferenceDataState paymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState> continuation) {
            return ((C221921) create(paymentPreferenceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PaymentPreferenceDataState.copy$default((PaymentPreferenceDataState) this.L$0, true, null, false, null, null, false, 0, null, null, null, null, null, 4094, null);
        }
    }

    public final void onCtaClicked() {
        applyMutation(new C221921(null));
        withDataState(new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentPreferenceDuxo.onCtaClicked$lambda$6(this.f$0, (PaymentPreferenceDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onCtaClicked$lambda$6(PaymentPreferenceDuxo paymentPreferenceDuxo, PaymentPreferenceDataState dataState) {
        boolean z;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getPriority() == 1) {
            ApiTransferAccount.TransferAccountType currentlySelectedType = dataState.getCurrentlySelectedType();
            ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.RHS;
            z = currentlySelectedType == transferAccountType || Intrinsics.areEqual(dataState.getCurrentlySelectedId(), ServerConstants.BROKERAGE_INDICATOR) || (Intrinsics.areEqual(dataState.getCurrentlySelectedId(), dataState.getPreviousPrimaryId()) && dataState.getPreviousPrimaryType() == transferAccountType);
        }
        if (dataState.isBackupYGExperiment() && dataState.getPreviousBackupId() != null && z) {
            Screen screen = new Screen(Screen.Name.GOLD_BILLING_PAYMENT_PREFERENCE, null, null, null, 14, null);
            EventLogger.DefaultImpls.logTap$default(paymentPreferenceDuxo.eventLogger, UserInteractionEventData.Action.CONTINUE, screen, new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, null, false, 56, null);
            BuildersKt__Builders_commonKt.launch$default(paymentPreferenceDuxo.getLifecycleScope(), null, null, new PaymentPreferenceDuxo$onCtaClicked$2$1(paymentPreferenceDuxo, dataState, dataState.getCurrentlySelectedId(), null), 3, null);
        } else {
            if (dataState.getPreviousBackupId() != null && dataState.getPriority() == 1 && dataState.getCurrentlySelectedType() != ApiTransferAccount.TransferAccountType.RHS) {
                paymentPreferenceDuxo.createOrUpdatePaymentPreference(dataState.getCurrentlySelectedId(), ServerConstants.BROKERAGE_INDICATOR);
            } else if (dataState.getPriority() == 2) {
                paymentPreferenceDuxo.createOrUpdatePaymentPreference(dataState.getSelectedPrimaryId(), dataState.getCurrentlySelectedId());
            } else {
                paymentPreferenceDuxo.createOrUpdatePaymentPreference(dataState.getCurrentlySelectedId(), null);
            }
            Screen screen2 = new Screen(Screen.Name.GOLD_BILLING_PAYMENT_PREFERENCE, null, null, null, 14, null);
            EventLogger.DefaultImpls.logTap$default(paymentPreferenceDuxo.eventLogger, UserInteractionEventData.Action.DONE, screen2, new Component(Component.ComponentType.DONE_BUTTON, null, null, 6, null), null, null, false, 56, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PaymentPreferenceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$createOrUpdatePaymentPreference$1", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$createOrUpdatePaymentPreference$1 */
    static final class C221851 extends ContinuationImpl7 implements Function2<PaymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C221851(Continuation<? super C221851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C221851 c221851 = new C221851(continuation);
            c221851.L$0 = obj;
            return c221851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentPreferenceDataState paymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState> continuation) {
            return ((C221851) create(paymentPreferenceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PaymentPreferenceDataState.copy$default((PaymentPreferenceDataState) this.L$0, true, null, false, null, null, false, 0, null, null, null, null, null, 4094, null);
        }
    }

    private final void createOrUpdatePaymentPreference(String primaryAccountId, String backupAccountId) {
        applyMutation(new C221851(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C221862(primaryAccountId, backupAccountId, null), 3, null);
    }

    /* compiled from: PaymentPreferenceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$createOrUpdatePaymentPreference$2", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$createOrUpdatePaymentPreference$2 */
    static final class C221862 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $backupAccountId;
        final /* synthetic */ String $primaryAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C221862(String str, String str2, Continuation<? super C221862> continuation) {
            super(2, continuation);
            this.$primaryAccountId = str;
            this.$backupAccountId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentPreferenceDuxo.this.new C221862(this.$primaryAccountId, this.$backupAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C221862) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PaymentPreferenceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$createOrUpdatePaymentPreference$2$1", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {367, 386}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$createOrUpdatePaymentPreference$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PaymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState>, Object> {
            final /* synthetic */ String $backupAccountId;
            final /* synthetic */ String $primaryAccountId;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PaymentPreferenceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, String str2, PaymentPreferenceDuxo paymentPreferenceDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$primaryAccountId = str;
                this.$backupAccountId = str2;
                this.this$0 = paymentPreferenceDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$primaryAccountId, this.$backupAccountId, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PaymentPreferenceDataState paymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState> continuation) {
                return ((AnonymousClass1) create(paymentPreferenceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
            
                if (r3.CreateOrUpdatePaymentPreference(r6, r17) == r0) goto L30;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                PaymentPreferenceDuxo paymentPreferenceDuxo;
                C503011 c503011;
                Object obj2;
                PaymentPreferenceDataState paymentPreferenceDataState;
                PaymentPreferenceDataState paymentPreferenceDataState2;
                PaymentPreferenceDataState paymentPreferenceDataState3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                int i2 = 2;
                List list = null;
                boolean z = false;
                try {
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            PaymentPreferenceDataState paymentPreferenceDataState4 = (PaymentPreferenceDataState) this.L$0;
                            String str = this.$primaryAccountId;
                            if (str != null && this.$backupAccountId != null) {
                                BffMoneyMovementService bffMoneyMovementService = this.this$0.bffMoneyMovementService;
                                Request<CreateOrUpdatePaymentPreferenceRequestDto> request = new Request<>(new CreateOrUpdatePaymentPreferenceRequestDto(this.$primaryAccountId, (List<InstrumentRequestDto>) CollectionsKt.listOf((Object[]) new InstrumentRequestDto[]{new InstrumentRequestDto(this.$primaryAccountId, null, 1, 2, null), new InstrumentRequestDto(this.$backupAccountId, null, 2, 2, null)})), null, 2, null);
                                this.L$0 = paymentPreferenceDataState4;
                                this.label = 1;
                                paymentPreferenceDataState = paymentPreferenceDataState4;
                                if (bffMoneyMovementService.CreateOrUpdatePaymentPreference(request, this) == coroutine_suspended) {
                                }
                                this.this$0.submit(PaymentPreferenceEvent.Succeed.INSTANCE);
                                paymentPreferenceDataState2 = paymentPreferenceDataState;
                            } else if (str != null) {
                                BffMoneyMovementService bffMoneyMovementService2 = this.this$0.bffMoneyMovementService;
                                Request<CreateOrUpdatePaymentPreferenceRequestDto> request2 = new Request<>(new CreateOrUpdatePaymentPreferenceRequestDto(this.$primaryAccountId, list, i2, z ? 1 : 0), null, 2, null);
                                this.L$0 = paymentPreferenceDataState4;
                                this.label = 2;
                                paymentPreferenceDataState3 = paymentPreferenceDataState4;
                            } else {
                                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception("No account selection id set"), false, null, 4, null);
                                this.this$0.submit(PaymentPreferenceEvent.Error.INSTANCE);
                                paymentPreferenceDataState2 = paymentPreferenceDataState4;
                            }
                            return coroutine_suspended;
                        }
                        if (i == 1) {
                            PaymentPreferenceDataState paymentPreferenceDataState5 = (PaymentPreferenceDataState) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            paymentPreferenceDataState = paymentPreferenceDataState5;
                            this.this$0.submit(PaymentPreferenceEvent.Succeed.INSTANCE);
                            paymentPreferenceDataState2 = paymentPreferenceDataState;
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            PaymentPreferenceDataState paymentPreferenceDataState6 = (PaymentPreferenceDataState) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            paymentPreferenceDataState3 = paymentPreferenceDataState6;
                            this.this$0.submit(PaymentPreferenceEvent.Succeed.INSTANCE);
                            paymentPreferenceDataState2 = paymentPreferenceDataState3;
                        }
                        paymentPreferenceDuxo = this.this$0;
                        c503011 = new C503011(null);
                        obj2 = paymentPreferenceDataState2;
                    } catch (Exception e) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
                        this.this$0.submit(PaymentPreferenceEvent.Error.INSTANCE);
                        paymentPreferenceDuxo = this.this$0;
                        c503011 = new C503011(null);
                        obj2 = i;
                    }
                    paymentPreferenceDuxo.applyMutation(c503011);
                    return obj2;
                } catch (Throwable th) {
                    this.this$0.applyMutation(new C503011(null));
                    throw th;
                }
            }

            /* compiled from: PaymentPreferenceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$createOrUpdatePaymentPreference$2$1$1", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$createOrUpdatePaymentPreference$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503011 extends ContinuationImpl7 implements Function2<PaymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C503011(Continuation<? super C503011> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503011 c503011 = new C503011(continuation);
                    c503011.L$0 = obj;
                    return c503011;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PaymentPreferenceDataState paymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState> continuation) {
                    return ((C503011) create(paymentPreferenceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PaymentPreferenceDataState.copy$default((PaymentPreferenceDataState) this.L$0, false, null, false, null, null, false, 0, null, null, null, null, null, 4094, null);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PaymentPreferenceDuxo paymentPreferenceDuxo = PaymentPreferenceDuxo.this;
            paymentPreferenceDuxo.applyMutation(new AnonymousClass1(this.$primaryAccountId, this.$backupAccountId, paymentPreferenceDuxo, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCurrentBillingState(Continuation<? super String> continuation) {
        C221871 c221871;
        Response response;
        List<InstrumentRequestDto> listEmptyList;
        GetSubscriptionPaymentMethodResponseDto getSubscriptionPaymentMethodResponseDto;
        if (continuation instanceof C221871) {
            c221871 = (C221871) continuation;
            int i = c221871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c221871.label = i - Integer.MIN_VALUE;
            } else {
                c221871 = new C221871(continuation);
            }
        }
        Object objGetSubscriptionPaymentMethod = c221871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c221871.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetSubscriptionPaymentMethod);
                BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService;
                Request<GetSubscriptionPaymentMethodRequestDto> request = new Request<>(new GetSubscriptionPaymentMethodRequestDto(SubscriptionTypeDto.SUBSCRIPTION_TYPE_GOLD_MEMBERSHIP), null, 2, null);
                c221871.label = 1;
                objGetSubscriptionPaymentMethod = bffMoneyMovementService.GetSubscriptionPaymentMethod(request, c221871);
                if (objGetSubscriptionPaymentMethod == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetSubscriptionPaymentMethod);
            }
            response = (Response) objGetSubscriptionPaymentMethod;
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
            response = null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (response == null || (getSubscriptionPaymentMethodResponseDto = (GetSubscriptionPaymentMethodResponseDto) response.getData()) == null || (listEmptyList = getSubscriptionPaymentMethodResponseDto.getInstruments()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        for (InstrumentRequestDto instrumentRequestDto : listEmptyList) {
            if (instrumentRequestDto.getPriority() == 1) {
                objectRef.element = instrumentRequestDto.getInstrument_id();
                applyMutation(new C221882(objectRef, this, instrumentRequestDto, null));
            }
            if (instrumentRequestDto.getPriority() == 2) {
                applyMutation(new C221893(instrumentRequestDto, this, null));
            }
        }
        return objectRef.element;
    }

    /* compiled from: PaymentPreferenceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$getCurrentBillingState$2", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$getCurrentBillingState$2 */
    static final class C221882 extends ContinuationImpl7 implements Function2<PaymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState>, Object> {
        final /* synthetic */ InstrumentRequestDto $instrument;
        final /* synthetic */ Ref.ObjectRef<String> $primaryAccountId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PaymentPreferenceDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C221882(Ref.ObjectRef<String> objectRef, PaymentPreferenceDuxo paymentPreferenceDuxo, InstrumentRequestDto instrumentRequestDto, Continuation<? super C221882> continuation) {
            super(2, continuation);
            this.$primaryAccountId = objectRef;
            this.this$0 = paymentPreferenceDuxo;
            this.$instrument = instrumentRequestDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C221882 c221882 = new C221882(this.$primaryAccountId, this.this$0, this.$instrument, continuation);
            c221882.L$0 = obj;
            return c221882;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentPreferenceDataState paymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState> continuation) {
            return ((C221882) create(paymentPreferenceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PaymentPreferenceDataState.copy$default((PaymentPreferenceDataState) this.L$0, false, null, false, null, null, false, 0, null, this.$primaryAccountId.element, this.this$0.toAccountType(this.$instrument.getInstrument_type()), null, null, 3327, null);
        }
    }

    /* compiled from: PaymentPreferenceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$getCurrentBillingState$3", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$getCurrentBillingState$3 */
    static final class C221893 extends ContinuationImpl7 implements Function2<PaymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState>, Object> {
        final /* synthetic */ InstrumentRequestDto $instrument;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PaymentPreferenceDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C221893(InstrumentRequestDto instrumentRequestDto, PaymentPreferenceDuxo paymentPreferenceDuxo, Continuation<? super C221893> continuation) {
            super(2, continuation);
            this.$instrument = instrumentRequestDto;
            this.this$0 = paymentPreferenceDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C221893 c221893 = new C221893(this.$instrument, this.this$0, continuation);
            c221893.L$0 = obj;
            return c221893;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentPreferenceDataState paymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState> continuation) {
            return ((C221893) create(paymentPreferenceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PaymentPreferenceDataState.copy$default((PaymentPreferenceDataState) this.L$0, false, null, false, null, null, false, 0, null, null, null, this.$instrument.getInstrument_id(), this.this$0.toAccountType(this.$instrument.getInstrument_type()), 1023, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiTransferAccount.TransferAccountType toAccountType(PaymentInstrumentTypeDto paymentInstrumentTypeDto) {
        int i = WhenMappings.$EnumSwitchMapping$0[paymentInstrumentTypeDto.ordinal()];
        if (i == 1) {
            return ApiTransferAccount.TransferAccountType.UNKNOWN;
        }
        if (i == 2) {
            return ApiTransferAccount.TransferAccountType.DEBIT_CARD;
        }
        if (i == 3) {
            return ApiTransferAccount.TransferAccountType.ACH;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return ApiTransferAccount.TransferAccountType.RHS;
    }

    /* compiled from: PaymentPreferenceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDuxo;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceFragmentKey;", "<init>", "()V", "PRIORITY_PRIMARY", "", "PRIORITY_BACKUP", "BackupYGExperiment", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PaymentPreferenceDuxo, PaymentPreferenceFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PaymentPreferenceFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (PaymentPreferenceFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PaymentPreferenceFragmentKey getArgs(PaymentPreferenceDuxo paymentPreferenceDuxo) {
            return (PaymentPreferenceFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, paymentPreferenceDuxo);
        }

        /* compiled from: PaymentPreferenceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDuxo$Companion$BackupYGExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes17.dex */
        public static final class BackupYGExperiment extends Experiment<SimpleVariant> {
            public static final BackupYGExperiment INSTANCE = new BackupYGExperiment();
            public static final int $stable = 8;

            private BackupYGExperiment() {
                super("gold-backup-billing-yg", null, 2, null);
            }
        }
    }
}

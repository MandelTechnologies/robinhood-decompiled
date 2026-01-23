package com.robinhood.android.advisory.onboarding.firstdeposit.transfertype;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFirstDepositTransferTypeSelectionFragment;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsEvent;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsViewState;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel2;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel3;
import com.robinhood.models.advisory.api.contribution.TransferAccountInfo;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.extensions.Format2;
import com.robinhood.models.util.Money;
import com.robinhood.store.advisory.AdvisoryFirstDepositConfig;
import com.robinhood.store.advisory.AdvisoryOnboardingStore;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdvisoryFundingMethodsDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001eB!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0006\u0010\u0014\u001a\u00020\u0011J(\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsDataState;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsViewState;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "advisoryOnboardingStore", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "fetchViewModel", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "onSelection", "selection", "Lcom/robinhood/models/advisory/api/contribution/FirstTimeTransferType;", "viewModel", "Lcom/robinhood/models/advisory/api/contribution/ApiAdvisoryFirstTimeContributionViewModel;", "rowLoggingIdentifier", "", "sourceTransferAccountInfo", "Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisoryFundingMethodsDuxo extends BaseDuxo3<AdvisoryFundingMethodsDataState, AdvisoryFundingMethodsViewState, AdvisoryFundingMethodsEvent> implements HasSavedState {
    private final AdvisoryOnboardingStore advisoryOnboardingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AdvisoryFundingMethodsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAdvisoryFirstTimeContributionViewModel3.values().length];
            try {
                iArr[ApiAdvisoryFirstTimeContributionViewModel3.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAdvisoryFirstTimeContributionViewModel3.IRA_TO_IRA_DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAdvisoryFirstTimeContributionViewModel3.ACAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAdvisoryFirstTimeContributionViewModel3.ROLLOVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiAdvisoryFirstTimeContributionViewModel3.INTERNAL_ASSET_TRANSFER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiAdvisoryFirstTimeContributionViewModel3.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AdvisoryFundingMethodsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsDuxo", m3645f = "AdvisoryFundingMethodsDuxo.kt", m3646l = {33}, m3647m = "fetchViewModel")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsDuxo$fetchViewModel$1 */
    static final class C88501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C88501(Continuation<? super C88501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdvisoryFundingMethodsDuxo.this.fetchViewModel(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryFundingMethodsDuxo(AdvisoryOnboardingStore advisoryOnboardingStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AdvisoryFundingMethodsDataState(null, null, 3, null), AdvisoryFundingMethodsDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(advisoryOnboardingStore, "advisoryOnboardingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.advisoryOnboardingStore = advisoryOnboardingStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchViewModel(Continuation<? super Unit> continuation) {
        C88501 c88501;
        if (continuation instanceof C88501) {
            c88501 = (C88501) continuation;
            int i = c88501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c88501.label = i - Integer.MIN_VALUE;
            } else {
                c88501 = new C88501(continuation);
            }
        }
        Object objStreamFirstTimeContributionViewModel = c88501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c88501.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objStreamFirstTimeContributionViewModel);
                AdvisoryOnboardingStore advisoryOnboardingStore = this.advisoryOnboardingStore;
                BrokerageAccountType brokerageAccountType = ((AdvisoryFirstDepositTransferTypeSelectionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getBrokerageAccountType();
                c88501.label = 1;
                objStreamFirstTimeContributionViewModel = advisoryOnboardingStore.streamFirstTimeContributionViewModel(brokerageAccountType, c88501);
                if (objStreamFirstTimeContributionViewModel == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objStreamFirstTimeContributionViewModel);
            }
            applyMutation(new C88512((ApiAdvisoryFirstTimeContributionViewModel) objStreamFirstTimeContributionViewModel, null));
        } catch (Exception e) {
            applyMutation(new C88523(e, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AdvisoryFundingMethodsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsDuxo$fetchViewModel$2", m3645f = "AdvisoryFundingMethodsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsDuxo$fetchViewModel$2 */
    static final class C88512 extends ContinuationImpl7 implements Function2<AdvisoryFundingMethodsDataState, Continuation<? super AdvisoryFundingMethodsDataState>, Object> {
        final /* synthetic */ ApiAdvisoryFirstTimeContributionViewModel $viewModel;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C88512(ApiAdvisoryFirstTimeContributionViewModel apiAdvisoryFirstTimeContributionViewModel, Continuation<? super C88512> continuation) {
            super(2, continuation);
            this.$viewModel = apiAdvisoryFirstTimeContributionViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C88512 c88512 = new C88512(this.$viewModel, continuation);
            c88512.L$0 = obj;
            return c88512;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryFundingMethodsDataState advisoryFundingMethodsDataState, Continuation<? super AdvisoryFundingMethodsDataState> continuation) {
            return ((C88512) create(advisoryFundingMethodsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdvisoryFundingMethodsDataState.copy$default((AdvisoryFundingMethodsDataState) this.L$0, this.$viewModel, null, 2, null);
        }
    }

    /* compiled from: AdvisoryFundingMethodsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsDuxo$fetchViewModel$3", m3645f = "AdvisoryFundingMethodsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsDuxo$fetchViewModel$3 */
    static final class C88523 extends ContinuationImpl7 implements Function2<AdvisoryFundingMethodsDataState, Continuation<? super AdvisoryFundingMethodsDataState>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Exception f3912$e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C88523(Exception exc, Continuation<? super C88523> continuation) {
            super(2, continuation);
            this.f3912$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C88523 c88523 = new C88523(this.f3912$e, continuation);
            c88523.L$0 = obj;
            return c88523;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryFundingMethodsDataState advisoryFundingMethodsDataState, Continuation<? super AdvisoryFundingMethodsDataState> continuation) {
            return ((C88523) create(advisoryFundingMethodsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdvisoryFundingMethodsDataState.copy$default((AdvisoryFundingMethodsDataState) this.L$0, null, this.f3912$e, 1, null);
        }
    }

    /* compiled from: AdvisoryFundingMethodsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsDuxo$onStart$1", m3645f = "AdvisoryFundingMethodsDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsDuxo$onStart$1 */
    static final class C88531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C88531(Continuation<? super C88531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvisoryFundingMethodsDuxo.this.new C88531(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C88531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!(AdvisoryFundingMethodsDuxo.this.getStateFlow().getValue() instanceof AdvisoryFundingMethodsViewState.Loaded)) {
                    AdvisoryFundingMethodsDuxo advisoryFundingMethodsDuxo = AdvisoryFundingMethodsDuxo.this;
                    this.label = 1;
                    if (advisoryFundingMethodsDuxo.fetchViewModel(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C88531(null));
    }

    /* compiled from: AdvisoryFundingMethodsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsDuxo$retry$1", m3645f = "AdvisoryFundingMethodsDuxo.kt", m3646l = {56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsDuxo$retry$1 */
    static final class C88541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C88541(Continuation<? super C88541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvisoryFundingMethodsDuxo.this.new C88541(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C88541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvisoryFundingMethodsDuxo advisoryFundingMethodsDuxo = AdvisoryFundingMethodsDuxo.this;
                this.label = 1;
                if (advisoryFundingMethodsDuxo.fetchViewModel(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void retry() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C88541(null), 3, null);
    }

    public final void onSelection(ApiAdvisoryFirstTimeContributionViewModel3 selection, ApiAdvisoryFirstTimeContributionViewModel viewModel, String rowLoggingIdentifier, TransferAccountInfo sourceTransferAccountInfo) {
        Object retirementContribution;
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(rowLoggingIdentifier, "rowLoggingIdentifier");
        Money money = Format2.toMoney(viewModel.getMinimum_contribution());
        AdvisoryOnboardingStore advisoryOnboardingStore = this.advisoryOnboardingStore;
        Companion companion = INSTANCE;
        advisoryOnboardingStore.setFundingMethodContext(((AdvisoryFirstDepositTransferTypeSelectionFragment.Args) companion.getArgs((HasSavedState) this)).getApplicationId(), ((AdvisoryFirstDepositTransferTypeSelectionFragment.Args) companion.getArgs((HasSavedState) this)).getBrokerageAccountType(), rowLoggingIdentifier);
        switch (WhenMappings.$EnumSwitchMapping$0[selection.ordinal()]) {
            case 1:
                ApiAdvisoryFirstTimeContributionViewModel2 contribution_view_model = viewModel.getContribution_view_model();
                if (contribution_view_model instanceof ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransfer) {
                    retirementContribution = new AdvisoryFundingMethodsEvent.Deposit(money, ((ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransfer) contribution_view_model).getData(), sourceTransferAccountInfo);
                } else {
                    if (!(contribution_view_model instanceof ApiAdvisoryFirstTimeContributionViewModel2.Retirement)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    retirementContribution = new AdvisoryFundingMethodsEvent.RetirementContribution(((ApiAdvisoryFirstTimeContributionViewModel2.Retirement) contribution_view_model).getData().getContribution_years(), money);
                }
                submit(retirementContribution);
                return;
            case 2:
                submit(new AdvisoryFundingMethodsEvent.Deposit(money, viewModel.getIndividual_contribution_view_model(), sourceTransferAccountInfo));
                return;
            case 3:
                this.advisoryOnboardingStore.setFirstDepositConfig(((AdvisoryFirstDepositTransferTypeSelectionFragment.Args) companion.getArgs((HasSavedState) this)).getApplicationId(), AdvisoryFirstDepositConfig.Acat.INSTANCE);
                submit(new AdvisoryFundingMethodsEvent.AssetTransferTimeline(viewModel.getTimeline(), rowLoggingIdentifier));
                return;
            case 4:
                this.advisoryOnboardingStore.setFirstDepositConfig(((AdvisoryFirstDepositTransferTypeSelectionFragment.Args) companion.getArgs((HasSavedState) this)).getApplicationId(), AdvisoryFirstDepositConfig.Rollover.INSTANCE);
                submit(AdvisoryFundingMethodsEvent.ShowAgreements.INSTANCE);
                return;
            case 5:
                this.advisoryOnboardingStore.setFirstDepositConfig(((AdvisoryFirstDepositTransferTypeSelectionFragment.Args) companion.getArgs((HasSavedState) this)).getApplicationId(), new AdvisoryFirstDepositConfig.InternalAssetTransfer(money));
                submit(new AdvisoryFundingMethodsEvent.AssetTransferTimeline(viewModel.getTimeline(), rowLoggingIdentifier));
                return;
            case 6:
                throw new IllegalStateException("Unknown transfer type for advisory first deposit");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: AdvisoryFundingMethodsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsDuxo;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFirstDepositTransferTypeSelectionFragment$Args;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvisoryFundingMethodsDuxo, AdvisoryFirstDepositTransferTypeSelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryFirstDepositTransferTypeSelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AdvisoryFirstDepositTransferTypeSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryFirstDepositTransferTypeSelectionFragment.Args getArgs(AdvisoryFundingMethodsDuxo advisoryFundingMethodsDuxo) {
            return (AdvisoryFirstDepositTransferTypeSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, advisoryFundingMethodsDuxo);
        }
    }
}

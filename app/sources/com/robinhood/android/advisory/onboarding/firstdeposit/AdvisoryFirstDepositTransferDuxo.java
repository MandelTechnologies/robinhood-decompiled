package com.robinhood.android.advisory.onboarding.firstdeposit;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDataState;
import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferEvent;
import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferFragment;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.duxo.DuxoComposableCompanion;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel2;
import com.robinhood.models.advisory.api.contribution.TransferAccountInfo;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryResponse;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.store.AsyncResult;
import com.robinhood.store.advisory.AdvisoryFirstDepositConfig;
import com.robinhood.store.advisory.AdvisoryOnboardingStore;
import com.robinhood.utils.extensions.KeyEvents2;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001$B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bJ\u0006\u0010\u001c\u001a\u00020\u0017J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferViewState;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "onboardingStore", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onKeyPress", "event", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "resetShake", "onSelectTransferAccount", "accountId", "", "onQuickAmountSelected", "amount", "Ljava/math/BigDecimal;", "onContinueCtaClicked", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisoryFirstDepositTransferDuxo extends BaseDuxo3<AdvisoryFirstDepositTransferDataState, AdvisoryFirstDepositTransferViewState, AdvisoryFirstDepositTransferEvent> implements HasSavedState {
    private final ExperimentsStore experimentsStore;
    private final AdvisoryOnboardingStore onboardingStore;
    private final SavedStateHandle savedStateHandle;
    private final TransferAccountStore transferAccountStore;
    private final TransfersBonfireApi transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvisoryFirstDepositTransferDataState.Mode.values().length];
            try {
                iArr[AdvisoryFirstDepositTransferDataState.Mode.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvisoryFirstDepositTransferDataState.Mode.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdvisoryFirstDepositTransferDuxo(ExperimentsStore experimentsStore, TransferAccountStore transferAccountStore, AdvisoryOnboardingStore onboardingStore, TransfersBonfireApi transfersBonfireApi, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(onboardingStore, "onboardingStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel viewModel = ((AdvisoryFirstDepositTransferFragment.Args) companion.getArgs(savedStateHandle)).getViewModel();
        Money minimumDeposit = ((AdvisoryFirstDepositTransferFragment.Args) companion.getArgs(savedStateHandle)).getMinimumDeposit();
        BrokerageAccountType brokerageAccountType = ((AdvisoryFirstDepositTransferFragment.Args) companion.getArgs(savedStateHandle)).getBrokerageAccountType();
        TransferAccountInfo sourceTransferAccountInfo = ((AdvisoryFirstDepositTransferFragment.Args) companion.getArgs(savedStateHandle)).getSourceTransferAccountInfo();
        String source = ((AdvisoryFirstDepositTransferFragment.Args) companion.getArgs(savedStateHandle)).getSource();
        super(new AdvisoryFirstDepositTransferDataState(minimumDeposit, viewModel, sourceTransferAccountInfo, source == null ? "" : source, null, false, false, null, brokerageAccountType, null, null, false, null, 7920, null), AdvisoryFirstDepositTransferDataState.INSTANCE, duxoBundle);
        this.experimentsStore = experimentsStore;
        this.transferAccountStore = transferAccountStore;
        this.onboardingStore = onboardingStore;
        this.transfersBonfireApi = transfersBonfireApi;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1 */
    static final class C88311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C88311(Continuation<? super C88311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C88311 c88311 = AdvisoryFirstDepositTransferDuxo.this.new C88311(continuation);
            c88311.L$0 = obj;
            return c88311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C88311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                TransferAccountStore.refresh$default(AdvisoryFirstDepositTransferDuxo.this.transferAccountStore, false, 1, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AdvisoryFirstDepositTransferDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(AdvisoryFirstDepositTransferDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(AdvisoryFirstDepositTransferDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$1", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {64}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvisoryFirstDepositTransferDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advisoryFirstDepositTransferDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<List<TransferAccount>> flowStreamFlow = this.this$0.transferAccountStore.streamFlow();
                    C495781 c495781 = new C495781(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamFlow, c495781, this) == coroutine_suspended) {
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

            /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "transferAccounts", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$1$1", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495781 extends ContinuationImpl7 implements Function2<List<? extends TransferAccount>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdvisoryFirstDepositTransferDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495781(AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo, Continuation<? super C495781> continuation) {
                    super(2, continuation);
                    this.this$0 = advisoryFirstDepositTransferDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495781 c495781 = new C495781(this.this$0, continuation);
                    c495781.L$0 = obj;
                    return c495781;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends TransferAccount> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<TransferAccount>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<TransferAccount> list, Continuation<? super Unit> continuation) {
                    return ((C495781) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$1$1$1", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495791 extends ContinuationImpl7 implements Function2<AdvisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState>, Object> {
                    final /* synthetic */ List<TransferAccount> $transferAccounts;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495791(List<TransferAccount> list, Continuation<? super C495791> continuation) {
                        super(2, continuation);
                        this.$transferAccounts = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495791 c495791 = new C495791(this.$transferAccounts, continuation);
                        c495791.L$0 = obj;
                        return c495791;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AdvisoryFirstDepositTransferDataState advisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState> continuation) {
                        return ((C495791) create(advisoryFirstDepositTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AdvisoryFirstDepositTransferDataState.copy$default((AdvisoryFirstDepositTransferDataState) this.L$0, null, null, null, null, null, false, false, null, null, extensions2.toPersistentList(this.$transferAccounts), null, false, null, 7679, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495791((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$2", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {73}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvisoryFirstDepositTransferDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = advisoryFirstDepositTransferDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{FundingV3Experiment.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inFundingV3Experiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$2$1", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ AdvisoryFirstDepositTransferDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = advisoryFirstDepositTransferDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$2$1$1", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495801 extends ContinuationImpl7 implements Function2<AdvisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState>, Object> {
                    final /* synthetic */ boolean $inFundingV3Experiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495801(boolean z, Continuation<? super C495801> continuation) {
                        super(2, continuation);
                        this.$inFundingV3Experiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495801 c495801 = new C495801(this.$inFundingV3Experiment, continuation);
                        c495801.L$0 = obj;
                        return c495801;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AdvisoryFirstDepositTransferDataState advisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState> continuation) {
                        return ((C495801) create(advisoryFirstDepositTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AdvisoryFirstDepositTransferDataState.copy$default((AdvisoryFirstDepositTransferDataState) this.L$0, null, null, null, null, null, false, false, null, null, null, null, this.$inFundingV3Experiment, null, 6143, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495801(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {90}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvisoryFirstDepositTransferDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = advisoryFirstDepositTransferDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<AdvisoryFirstDepositTransferViewState> stateFlow = this.this$0.getStateFlow();
                    final Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<ApiTransferSummaryRequest>() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    ApiTransferSummaryRequest summaryRequest = ((AdvisoryFirstDepositTransferViewState) obj).getSummaryRequest();
                                    if (summaryRequest != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(summaryRequest, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super ApiTransferSummaryRequest> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }), new C8828xfea7ca7d(null, this.this$0));
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<ApiTransferSummaryResponse>() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$2

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$2$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$2$2", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$2$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    AsyncResult asyncResult = (AsyncResult) obj;
                                    AsyncResult.Success success = asyncResult instanceof AsyncResult.Success ? (AsyncResult.Success) asyncResult : null;
                                    ApiTransferSummaryResponse apiTransferSummaryResponse = success != null ? (ApiTransferSummaryResponse) success.getValue() : null;
                                    if (apiTransferSummaryResponse != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(apiTransferSummaryResponse, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super ApiTransferSummaryResponse> flowCollector, Continuation continuation) {
                            Object objCollect = flowTransformLatest.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    });
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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

            /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "summaryResponse", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3$4", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<ApiTransferSummaryResponse, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdvisoryFirstDepositTransferDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = advisoryFirstDepositTransferDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ApiTransferSummaryResponse apiTransferSummaryResponse, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(apiTransferSummaryResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3$4$1", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onCreate$1$3$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AdvisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState>, Object> {
                    final /* synthetic */ ApiTransferSummaryResponse $summaryResponse;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(ApiTransferSummaryResponse apiTransferSummaryResponse, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$summaryResponse = apiTransferSummaryResponse;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$summaryResponse, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AdvisoryFirstDepositTransferDataState advisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState> continuation) {
                        return ((AnonymousClass1) create(advisoryFirstDepositTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AdvisoryFirstDepositTransferDataState.copy$default((AdvisoryFirstDepositTransferDataState) this.L$0, null, null, null, null, null, false, false, null, null, null, null, false, this.$summaryResponse, 4095, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((ApiTransferSummaryResponse) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C88311(null));
    }

    /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onKeyPress$1", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onKeyPress$1 */
    static final class C88321 extends ContinuationImpl7 implements Function2<AdvisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState>, Object> {
        final /* synthetic */ KeyEvent $event;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AdvisoryFirstDepositTransferDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C88321(KeyEvent keyEvent, AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo, Continuation<? super C88321> continuation) {
            super(2, continuation);
            this.$event = keyEvent;
            this.this$0 = advisoryFirstDepositTransferDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C88321 c88321 = new C88321(this.$event, this.this$0, continuation);
            c88321.L$0 = obj;
            return c88321;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryFirstDepositTransferDataState advisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState> continuation) {
            return ((C88321) create(advisoryFirstDepositTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvisoryFirstDepositTransferDataState advisoryFirstDepositTransferDataState = (AdvisoryFirstDepositTransferDataState) this.L$0;
            if (KeyEvents2.isDelete(this.$event)) {
                return advisoryFirstDepositTransferDataState.getAmountString().length() == 1 ? AdvisoryFirstDepositTransferDataState.copy$default(advisoryFirstDepositTransferDataState, null, null, null, null, "", false, false, null, null, null, null, false, null, 8175, null) : advisoryFirstDepositTransferDataState.getAmountString().length() > 0 ? AdvisoryFirstDepositTransferDataState.copy$default(advisoryFirstDepositTransferDataState, null, null, null, null, StringsKt.dropLast(advisoryFirstDepositTransferDataState.getAmountString(), 1), false, false, null, null, null, null, false, null, 8175, null) : advisoryFirstDepositTransferDataState;
            }
            if (KeyEvents2.isDot(this.$event)) {
                if (advisoryFirstDepositTransferDataState.getAmount().compareTo(((AdvisoryFirstDepositTransferFragment.Args) AdvisoryFirstDepositTransferDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getMinimumDeposit().getDecimalValue()) < 0) {
                    return AdvisoryFirstDepositTransferDataState.copy$default(advisoryFirstDepositTransferDataState, null, null, null, null, null, false, true, null, null, null, null, false, null, 8127, null);
                }
                return AdvisoryFirstDepositTransferDataState.copy$default(advisoryFirstDepositTransferDataState, null, null, null, null, advisoryFirstDepositTransferDataState.getAmountString() + ".", false, false, null, null, null, null, false, null, 8175, null);
            }
            if (!KeyEvents2.isDigit(this.$event) || (advisoryFirstDepositTransferDataState.getAmountString().length() == 0 && this.$event.getNumber() == '0')) {
                return advisoryFirstDepositTransferDataState;
            }
            if (advisoryFirstDepositTransferDataState.getAmount().scale() == 2) {
                return AdvisoryFirstDepositTransferDataState.copy$default(advisoryFirstDepositTransferDataState, null, null, null, null, null, true, false, null, null, null, null, false, null, 8159, null);
            }
            return AdvisoryFirstDepositTransferDataState.copy$default(advisoryFirstDepositTransferDataState, null, null, null, null, advisoryFirstDepositTransferDataState.getAmountString() + this.$event.getNumber(), false, false, null, null, null, null, false, null, 8175, null);
        }
    }

    public final void onKeyPress(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        applyMutation(new C88321(event, this, null));
    }

    /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$resetShake$1", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$resetShake$1 */
    static final class C88351 extends ContinuationImpl7 implements Function2<AdvisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C88351(Continuation<? super C88351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C88351 c88351 = new C88351(continuation);
            c88351.L$0 = obj;
            return c88351;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryFirstDepositTransferDataState advisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState> continuation) {
            return ((C88351) create(advisoryFirstDepositTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdvisoryFirstDepositTransferDataState.copy$default((AdvisoryFirstDepositTransferDataState) this.L$0, null, null, null, null, null, false, false, null, null, null, null, false, null, 8095, null);
        }
    }

    public final void resetShake() {
        applyMutation(new C88351(null));
    }

    /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onSelectTransferAccount$1", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onSelectTransferAccount$1 */
    static final class C88341 extends ContinuationImpl7 implements Function2<AdvisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState>, Object> {
        final /* synthetic */ String $accountId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C88341(String str, Continuation<? super C88341> continuation) {
            super(2, continuation);
            this.$accountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C88341 c88341 = new C88341(this.$accountId, continuation);
            c88341.L$0 = obj;
            return c88341;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryFirstDepositTransferDataState advisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState> continuation) {
            return ((C88341) create(advisoryFirstDepositTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdvisoryFirstDepositTransferDataState.copy$default((AdvisoryFirstDepositTransferDataState) this.L$0, null, null, null, null, null, false, false, null, null, null, this.$accountId, false, null, 7167, null);
        }
    }

    public final void onSelectTransferAccount(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        applyMutation(new C88341(accountId, null));
    }

    /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onQuickAmountSelected$1", m3645f = "AdvisoryFirstDepositTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$onQuickAmountSelected$1 */
    static final class C88331 extends ContinuationImpl7 implements Function2<AdvisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState>, Object> {
        final /* synthetic */ BigDecimal $amount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C88331(BigDecimal bigDecimal, Continuation<? super C88331> continuation) {
            super(2, continuation);
            this.$amount = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C88331 c88331 = new C88331(this.$amount, continuation);
            c88331.L$0 = obj;
            return c88331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryFirstDepositTransferDataState advisoryFirstDepositTransferDataState, Continuation<? super AdvisoryFirstDepositTransferDataState> continuation) {
            return ((C88331) create(advisoryFirstDepositTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvisoryFirstDepositTransferDataState advisoryFirstDepositTransferDataState = (AdvisoryFirstDepositTransferDataState) this.L$0;
            String string2 = this.$amount.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return AdvisoryFirstDepositTransferDataState.copy$default(advisoryFirstDepositTransferDataState, null, null, null, null, string2, false, false, AdvisoryFirstDepositTransferDataState.Mode.REVIEW, null, null, null, false, null, 8047, null);
        }
    }

    public final void onQuickAmountSelected(BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        applyMutation(new C88331(amount, null));
    }

    public final void onContinueCtaClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryFirstDepositTransferDuxo.onContinueCtaClicked$lambda$0(this.f$0, (AdvisoryFirstDepositTransferDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinueCtaClicked$lambda$0(AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo, AdvisoryFirstDepositTransferDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        int i = WhenMappings.$EnumSwitchMapping$0[dataState.getMode().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            TransferAccount sourceTransferAccount = dataState.getSourceTransferAccount();
            if (sourceTransferAccount == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            advisoryFirstDepositTransferDuxo.onboardingStore.setFirstDepositConfig(((AdvisoryFirstDepositTransferFragment.Args) INSTANCE.getArgs((HasSavedState) advisoryFirstDepositTransferDuxo)).getApplicationId(), new AdvisoryFirstDepositConfig.Transfer.Deposit(new Money(Currencies.USD, dataState.getAmount()), sourceTransferAccount));
            advisoryFirstDepositTransferDuxo.submit(AdvisoryFirstDepositTransferEvent.SignAgreements.INSTANCE);
        } else if (dataState.getAmount().compareTo(((AdvisoryFirstDepositTransferFragment.Args) INSTANCE.getArgs((HasSavedState) advisoryFirstDepositTransferDuxo)).getMinimumDeposit().getDecimalValue()) >= 0) {
            advisoryFirstDepositTransferDuxo.applyMutation(new AdvisoryFirstDepositTransferDuxo2(null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AdvisoryFirstDepositTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDuxo$Companion;", "Lcom/robinhood/compose/duxo/DuxoComposableCompanion;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDuxo;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferFragment$Args;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoComposableCompanion<AdvisoryFirstDepositTransferDuxo, AdvisoryFirstDepositTransferFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public AdvisoryFirstDepositTransferFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AdvisoryFirstDepositTransferFragment.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public AdvisoryFirstDepositTransferFragment.Args getArgs(AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo) {
            return (AdvisoryFirstDepositTransferFragment.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, advisoryFirstDepositTransferDuxo);
        }
    }
}

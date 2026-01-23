package com.robinhood.android.internalassettransfers.typeselection;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import bonfire.proto.idl.margin.p036v1.MultiAccountEligibilityContextDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionEvent;
import com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityChecker;
import com.robinhood.android.lib.accounts.MultipleIndividualAccountsExperiment;
import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.utils.extensions.Throwables;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001bB9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionDataState;", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionViewState;", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "stateProvider", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "marginEligibilityStore", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "accountFeatureParityChecker", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityChecker;", "<init>", "(Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/lib/margin/MarginEligibilityStore;Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityChecker;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onTransferAllAssets", "onContinueWithoutMargin", "onTransferPartialAssets", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InternalAssetTransferTypeSelectionDuxo extends BaseDuxo3<InternalAssetTransferTypeSelectionDataState, InternalAssetTransferTypeSelectionViewState, InternalAssetTransferTypeSelectionEvent> implements HasSavedState {
    private final AccountFeatureParityChecker accountFeatureParityChecker;
    private final ExperimentsStore experimentsStore;
    private final MarginEligibilityStore marginEligibilityStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InternalAssetTransferTypeSelectionDuxo(InternalAssetTransferTypeSelectionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, ExperimentsStore experimentsStore, MarginEligibilityStore marginEligibilityStore, AccountFeatureParityChecker accountFeatureParityChecker) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
        Intrinsics.checkNotNullParameter(accountFeatureParityChecker, "accountFeatureParityChecker");
        Companion companion = INSTANCE;
        super(new InternalAssetTransferTypeSelectionDataState(((InternalAssetTransferTypeSelectionFragment.Args) companion.getArgs(savedStateHandle)).getEligibleAssets(), ((InternalAssetTransferTypeSelectionFragment.Args) companion.getArgs(savedStateHandle)).getSourceAccount(), ((InternalAssetTransferTypeSelectionFragment.Args) companion.getArgs(savedStateHandle)).getSinkAccount(), false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.experimentsStore = experimentsStore;
        this.marginEligibilityStore = marginEligibilityStore;
        this.accountFeatureParityChecker = accountFeatureParityChecker;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C193161(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C193172(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C193183(null));
    }

    /* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$1", m3645f = "InternalAssetTransferTypeSelectionDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$1 */
    static final class C193161 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C193161(Continuation<? super C193161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferTypeSelectionDuxo.this.new C193161(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C193161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(InternalAssetTransferTypeSelectionDuxo.this.experimentsStore, new Experiment[]{MultipleIndividualAccountsExperiment.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InternalAssetTransferTypeSelectionDuxo.this, null);
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

        /* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$1$1", m3645f = "InternalAssetTransferTypeSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ InternalAssetTransferTypeSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InternalAssetTransferTypeSelectionDuxo internalAssetTransferTypeSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = internalAssetTransferTypeSelectionDuxo;
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

            /* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$1$1$1", m3645f = "InternalAssetTransferTypeSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502261 extends ContinuationImpl7 implements Function2<InternalAssetTransferTypeSelectionDataState, Continuation<? super InternalAssetTransferTypeSelectionDataState>, Object> {
                final /* synthetic */ boolean $inExperiment;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502261(boolean z, Continuation<? super C502261> continuation) {
                    super(2, continuation);
                    this.$inExperiment = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502261 c502261 = new C502261(this.$inExperiment, continuation);
                    c502261.L$0 = obj;
                    return c502261;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternalAssetTransferTypeSelectionDataState internalAssetTransferTypeSelectionDataState, Continuation<? super InternalAssetTransferTypeSelectionDataState> continuation) {
                    return ((C502261) create(internalAssetTransferTypeSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternalAssetTransferTypeSelectionDataState.copy$default((InternalAssetTransferTypeSelectionDataState) this.L$0, null, null, null, this.$inExperiment, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502261(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$2", m3645f = "InternalAssetTransferTypeSelectionDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$2 */
    static final class C193172 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C193172(Continuation<? super C193172> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferTypeSelectionDuxo.this.new C193172(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C193172) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowMapLatest = FlowKt.mapLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(InternalAssetTransferTypeSelectionDuxo.this.experimentsStore, new Experiment[]{MultipleIndividualAccountsExperiment.INSTANCE}, false, null, 6, null), new AnonymousClass1(InternalAssetTransferTypeSelectionDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(InternalAssetTransferTypeSelectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowMapLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$2$1", m3645f = "InternalAssetTransferTypeSelectionDuxo.kt", m3646l = {66}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super GetMultiAccountEligibilityResponseDto>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ InternalAssetTransferTypeSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InternalAssetTransferTypeSelectionDuxo internalAssetTransferTypeSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = internalAssetTransferTypeSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super GetMultiAccountEligibilityResponseDto> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super GetMultiAccountEligibilityResponseDto> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM28550constructorimpl;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!this.Z$0) {
                            return null;
                        }
                        InternalAssetTransferTypeSelectionDuxo internalAssetTransferTypeSelectionDuxo = this.this$0;
                        Result.Companion companion = Result.INSTANCE;
                        MarginEligibilityStore marginEligibilityStore = internalAssetTransferTypeSelectionDuxo.marginEligibilityStore;
                        String rhsAccountNumber = ((InternalAssetTransferTypeSelectionFragment.Args) InternalAssetTransferTypeSelectionDuxo.INSTANCE.getArgs((HasSavedState) internalAssetTransferTypeSelectionDuxo)).getSourceAccount().getRhsAccountNumber();
                        MultiAccountEligibilityContextDto multiAccountEligibilityContextDto = MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT;
                        this.label = 1;
                        obj = marginEligibilityStore.getMultiAccountMarginEligibility(rhsAccountNumber, multiAccountEligibilityContextDto, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    objM28550constructorimpl = Result.m28550constructorimpl((GetMultiAccountEligibilityResponseDto) obj);
                } catch (Throwable th) {
                    Throwables.rethrowIfNotNetworkRelated(th);
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                return (GetMultiAccountEligibilityResponseDto) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
            }
        }

        /* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "sourceEligibility", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$2$2", m3645f = "InternalAssetTransferTypeSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GetMultiAccountEligibilityResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternalAssetTransferTypeSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InternalAssetTransferTypeSelectionDuxo internalAssetTransferTypeSelectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = internalAssetTransferTypeSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(getMultiAccountEligibilityResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$2$2$1", m3645f = "InternalAssetTransferTypeSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InternalAssetTransferTypeSelectionDataState, Continuation<? super InternalAssetTransferTypeSelectionDataState>, Object> {
                final /* synthetic */ GetMultiAccountEligibilityResponseDto $sourceEligibility;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$sourceEligibility = getMultiAccountEligibilityResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sourceEligibility, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternalAssetTransferTypeSelectionDataState internalAssetTransferTypeSelectionDataState, Continuation<? super InternalAssetTransferTypeSelectionDataState> continuation) {
                    return ((AnonymousClass1) create(internalAssetTransferTypeSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternalAssetTransferTypeSelectionDataState.copy$default((InternalAssetTransferTypeSelectionDataState) this.L$0, null, null, null, false, null, null, this.$sourceEligibility, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((GetMultiAccountEligibilityResponseDto) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$3", m3645f = "InternalAssetTransferTypeSelectionDuxo.kt", m3646l = {96}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$3 */
    static final class C193183 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C193183(Continuation<? super C193183> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferTypeSelectionDuxo.this.new C193183(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C193183) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowMapLatest = FlowKt.mapLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(InternalAssetTransferTypeSelectionDuxo.this.experimentsStore, new Experiment[]{MultipleIndividualAccountsExperiment.INSTANCE}, false, null, 6, null), new AnonymousClass1(InternalAssetTransferTypeSelectionDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(InternalAssetTransferTypeSelectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowMapLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$3$1", m3645f = "InternalAssetTransferTypeSelectionDuxo.kt", m3646l = {87}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super GetMultiAccountEligibilityResponseDto>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ InternalAssetTransferTypeSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InternalAssetTransferTypeSelectionDuxo internalAssetTransferTypeSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = internalAssetTransferTypeSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super GetMultiAccountEligibilityResponseDto> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super GetMultiAccountEligibilityResponseDto> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM28550constructorimpl;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!this.Z$0) {
                            return null;
                        }
                        InternalAssetTransferTypeSelectionDuxo internalAssetTransferTypeSelectionDuxo = this.this$0;
                        Result.Companion companion = Result.INSTANCE;
                        MarginEligibilityStore marginEligibilityStore = internalAssetTransferTypeSelectionDuxo.marginEligibilityStore;
                        String rhsAccountNumber = ((InternalAssetTransferTypeSelectionFragment.Args) InternalAssetTransferTypeSelectionDuxo.INSTANCE.getArgs((HasSavedState) internalAssetTransferTypeSelectionDuxo)).getSinkAccount().getRhsAccountNumber();
                        MultiAccountEligibilityContextDto multiAccountEligibilityContextDto = MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT;
                        this.label = 1;
                        obj = marginEligibilityStore.getMultiAccountMarginEligibility(rhsAccountNumber, multiAccountEligibilityContextDto, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    objM28550constructorimpl = Result.m28550constructorimpl((GetMultiAccountEligibilityResponseDto) obj);
                } catch (Throwable th) {
                    Throwables.rethrowIfNotNetworkRelated(th);
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                return (GetMultiAccountEligibilityResponseDto) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
            }
        }

        /* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "sinkEligibility", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$3$2", m3645f = "InternalAssetTransferTypeSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GetMultiAccountEligibilityResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternalAssetTransferTypeSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InternalAssetTransferTypeSelectionDuxo internalAssetTransferTypeSelectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = internalAssetTransferTypeSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(getMultiAccountEligibilityResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$3$2$1", m3645f = "InternalAssetTransferTypeSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onCreate$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InternalAssetTransferTypeSelectionDataState, Continuation<? super InternalAssetTransferTypeSelectionDataState>, Object> {
                final /* synthetic */ GetMultiAccountEligibilityResponseDto $sinkEligibility;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$sinkEligibility = getMultiAccountEligibilityResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sinkEligibility, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternalAssetTransferTypeSelectionDataState internalAssetTransferTypeSelectionDataState, Continuation<? super InternalAssetTransferTypeSelectionDataState> continuation) {
                    return ((AnonymousClass1) create(internalAssetTransferTypeSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternalAssetTransferTypeSelectionDataState.copy$default((InternalAssetTransferTypeSelectionDataState) this.L$0, null, null, null, false, null, this.$sinkEligibility, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((GetMultiAccountEligibilityResponseDto) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void onTransferAllAssets() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferTypeSelectionDuxo.onTransferAllAssets$lambda$0(this.f$0, (InternalAssetTransferTypeSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransferAllAssets$lambda$0(InternalAssetTransferTypeSelectionDuxo internalAssetTransferTypeSelectionDuxo, InternalAssetTransferTypeSelectionDataState data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.getEligibleAssets().getAvailableCash().compareTo(BigDecimal.ZERO) < 0) {
            BuildersKt__Builders_commonKt.launch$default(internalAssetTransferTypeSelectionDuxo.getLifecycleScope(), null, null, new InternalAssetTransferTypeSelectionDuxo2(internalAssetTransferTypeSelectionDuxo, data, null), 3, null);
            return Unit.INSTANCE;
        }
        internalAssetTransferTypeSelectionDuxo.submit(InternalAssetTransferTypeSelectionEvent.TransferAllAssets.INSTANCE);
        return Unit.INSTANCE;
    }

    /* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onContinueWithoutMargin$1", m3645f = "InternalAssetTransferTypeSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onContinueWithoutMargin$1 */
    static final class C193151 extends ContinuationImpl7 implements Function2<InternalAssetTransferTypeSelectionDataState, Continuation<? super InternalAssetTransferTypeSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C193151(Continuation<? super C193151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C193151 c193151 = new C193151(continuation);
            c193151.L$0 = obj;
            return c193151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferTypeSelectionDataState internalAssetTransferTypeSelectionDataState, Continuation<? super InternalAssetTransferTypeSelectionDataState> continuation) {
            return ((C193151) create(internalAssetTransferTypeSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferTypeSelectionDataState.copy$default((InternalAssetTransferTypeSelectionDataState) this.L$0, null, null, null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }
    }

    public final void onContinueWithoutMargin() {
        applyMutation(new C193151(null));
        submit(InternalAssetTransferTypeSelectionEvent.TransferAllAssets.INSTANCE);
    }

    public final void onTransferPartialAssets() {
        submit(InternalAssetTransferTypeSelectionEvent.TransferPartialAssets.INSTANCE);
    }

    /* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionDuxo;", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InternalAssetTransferTypeSelectionDuxo, InternalAssetTransferTypeSelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalAssetTransferTypeSelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (InternalAssetTransferTypeSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalAssetTransferTypeSelectionFragment.Args getArgs(InternalAssetTransferTypeSelectionDuxo internalAssetTransferTypeSelectionDuxo) {
            return (InternalAssetTransferTypeSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, internalAssetTransferTypeSelectionDuxo);
        }
    }
}

package com.robinhood.android.internalassettransfers.customselection;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import bonfire.proto.idl.margin.p036v1.MarginInvestingStateDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.internalassettransfers.AssetSelection;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionEvent;
import com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment;
import com.robinhood.android.internalassettransfers.customselection.equity.ShareSelection;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetData;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityChecker;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityWarning;
import com.robinhood.android.lib.accounts.MultipleIndividualAccountsExperiment;
import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAsset;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.RetryOnError;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: InternalAssetTransferCustomSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 62\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00016B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001aJ\u001c\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"J\u001c\u0010$\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"J\u0006\u0010%\u001a\u00020\u0017J\u0006\u0010&\u001a\u00020\u0017J\u000e\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020 J\u0012\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/H\u0002J\u0012\u00100\u001a\u0004\u0018\u00010-2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020-H\u0002J\u0006\u00104\u001a\u00020\u0017J\u0006\u00105\u001a\u00020\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDataState;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionViewState;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "stateProvider", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "accountFeatureParityChecker", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityChecker;", "marginEligibilityStore", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityChecker;Lcom/robinhood/android/lib/margin/MarginEligibilityStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onEquityCheckClicked", "instrumentId", "", "onEquityRowClicked", "searchValueChanged", "searchTextValue", "clearSelections", "isCashVisible", "", "instrumentIds", "", "Ljava/util/UUID;", "selectAssets", "cashBalanceChecked", "cashBalanceClicked", "onAssetSelectionChanged", "assetSelection", "Lcom/robinhood/android/internalassettransfers/AssetSelection;", "onContinueClicked", "skipMargin", "buildBottomSheetForEligibility", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;", "eligibility", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "buildBottomSheetForParityWarning", "warning", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityWarning;", "makeEnableMarginSheet", "navigateToAgreementsScreen", "onInfoBannerLinkClicked", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternalAssetTransferCustomSelectionDuxo extends BaseDuxo3<InternalAssetTransferCustomSelectionDataState, InternalAssetTransferCustomSelectionViewState, InternalAssetTransferCustomSelectionEvent> implements HasSavedState {
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
    public InternalAssetTransferCustomSelectionDuxo(InternalAssetTransferCustomSelectionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AccountFeatureParityChecker accountFeatureParityChecker, MarginEligibilityStore marginEligibilityStore, ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(accountFeatureParityChecker, "accountFeatureParityChecker");
        Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Companion companion = INSTANCE;
        super(new InternalAssetTransferCustomSelectionDataState(((InternalAssetTransferCustomSelectionFragment.Args) companion.getArgs(savedStateHandle)).getEligibleAssets(), ((InternalAssetTransferCustomSelectionFragment.Args) companion.getArgs(savedStateHandle)).getAssetSelection(), ((InternalAssetTransferCustomSelectionFragment.Args) companion.getArgs(savedStateHandle)).getAccountSelection(), null, false, ((InternalAssetTransferCustomSelectionFragment.Args) companion.getArgs(savedStateHandle)).getShouldAbortIatFlow(), false, null, null, 472, null), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.accountFeatureParityChecker = accountFeatureParityChecker;
        this.marginEligibilityStore = marginEligibilityStore;
        this.experimentsStore = experimentsStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C191171(null));
    }

    /* compiled from: InternalAssetTransferCustomSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1", m3645f = "InternalAssetTransferCustomSelectionDuxo.kt", m3646l = {78}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1 */
    static final class C191171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C191171(Continuation<? super C191171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferCustomSelectionDuxo.this.new C191171(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C191171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(InternalAssetTransferCustomSelectionDuxo.this.experimentsStore, new Experiment[]{MultipleIndividualAccountsExperiment.INSTANCE}, false, null, 6, null);
                final InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo = InternalAssetTransferCustomSelectionDuxo.this;
                Flow<GetMultiAccountEligibilityResponseDto> flow = new Flow<GetMultiAccountEligibilityResponseDto>() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ InternalAssetTransferCustomSelectionDuxo this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "InternalAssetTransferCustomSelectionDuxo.kt", m3646l = {56, 50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = internalAssetTransferCustomSelectionDuxo;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
                        
                            if (r9.emit(r8, r0) != r1) goto L27;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            Object obj2;
                            FlowCollector flowCollector;
                            FlowCollector flowCollector2;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj3 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj3);
                                FlowCollector flowCollector3 = this.$this_unsafeFlow;
                                if (((Boolean) obj).booleanValue()) {
                                    this.this$0.applyMutation(new InternalAssetTransferCustomSelectionDuxo3(null));
                                    InternalAssetTransferCustomSelectionDuxo4 internalAssetTransferCustomSelectionDuxo4 = new InternalAssetTransferCustomSelectionDuxo4(this.this$0, null);
                                    anonymousClass1.L$0 = flowCollector3;
                                    anonymousClass1.label = 1;
                                    Object objRunCatchingNetworkExceptionsWithRetryExponential = RetryOnError.runCatchingNetworkExceptionsWithRetryExponential(2, internalAssetTransferCustomSelectionDuxo4, anonymousClass1);
                                    if (objRunCatchingNetworkExceptionsWithRetryExponential != coroutine_suspended) {
                                        obj3 = objRunCatchingNetworkExceptionsWithRetryExponential;
                                        flowCollector = flowCollector3;
                                    }
                                    return coroutine_suspended;
                                }
                                obj2 = null;
                                flowCollector2 = flowCollector3;
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                            } else {
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj3);
                                    return Unit.INSTANCE;
                                }
                                flowCollector = (FlowCollector) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj3);
                            }
                            Object obj4 = obj3;
                            flowCollector2 = flowCollector;
                            obj2 = obj4;
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super GetMultiAccountEligibilityResponseDto> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamStateFlow$default.collect(new AnonymousClass2(flowCollector, internalAssetTransferCustomSelectionDuxo), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(InternalAssetTransferCustomSelectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: InternalAssetTransferCustomSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "sinkEligibility", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1$2", m3645f = "InternalAssetTransferCustomSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GetMultiAccountEligibilityResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternalAssetTransferCustomSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = internalAssetTransferCustomSelectionDuxo;
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

            /* compiled from: InternalAssetTransferCustomSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1$2$1", m3645f = "InternalAssetTransferCustomSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InternalAssetTransferCustomSelectionDataState, Continuation<? super InternalAssetTransferCustomSelectionDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternalAssetTransferCustomSelectionDataState internalAssetTransferCustomSelectionDataState, Continuation<? super InternalAssetTransferCustomSelectionDataState> continuation) {
                    return ((AnonymousClass1) create(internalAssetTransferCustomSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternalAssetTransferCustomSelectionDataState.copy$default((InternalAssetTransferCustomSelectionDataState) this.L$0, null, null, null, null, false, false, false, null, null, 495, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto = (GetMultiAccountEligibilityResponseDto) this.L$0;
                    this.this$0.applyMutation(new AnonymousClass1(null));
                    boolean z = false;
                    boolean z2 = ((InternalAssetTransferCustomSelectionFragment.Args) InternalAssetTransferCustomSelectionDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getAssetSelection().getCash().compareTo(BigDecimal.ZERO) < 0;
                    if (getMultiAccountEligibilityResponseDto != null && z2 && !getMultiAccountEligibilityResponseDto.is_eligible() && getMultiAccountEligibilityResponseDto.getMargin_investing_state() != MarginInvestingStateDto.MARGIN_INVESTING_STATE_ENABLED) {
                        z = true;
                    }
                    if (z2 && z) {
                        this.this$0.submit(InternalAssetTransferCustomSelectionEvent.UnselectCashSelection.INSTANCE);
                        this.this$0.applyMutation(new C502192(getMultiAccountEligibilityResponseDto, null));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* compiled from: InternalAssetTransferCustomSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1$2$2", m3645f = "InternalAssetTransferCustomSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C502192 extends ContinuationImpl7 implements Function2<InternalAssetTransferCustomSelectionDataState, Continuation<? super InternalAssetTransferCustomSelectionDataState>, Object> {
                final /* synthetic */ GetMultiAccountEligibilityResponseDto $sinkEligibility;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502192(GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, Continuation<? super C502192> continuation) {
                    super(2, continuation);
                    this.$sinkEligibility = getMultiAccountEligibilityResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502192 c502192 = new C502192(this.$sinkEligibility, continuation);
                    c502192.L$0 = obj;
                    return c502192;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternalAssetTransferCustomSelectionDataState internalAssetTransferCustomSelectionDataState, Continuation<? super InternalAssetTransferCustomSelectionDataState> continuation) {
                    return ((C502192) create(internalAssetTransferCustomSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternalAssetTransferCustomSelectionDataState.copy$default((InternalAssetTransferCustomSelectionDataState) this.L$0, null, null, null, null, false, false, true, null, this.$sinkEligibility, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
                }
            }
        }
    }

    public final void onEquityCheckClicked(final String instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferCustomSelectionDuxo.onEquityCheckClicked$lambda$1(instrumentId, this, (InternalAssetTransferCustomSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEquityCheckClicked$lambda$1(String str, InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo, InternalAssetTransferCustomSelectionDataState it) {
        Object next;
        Intrinsics.checkNotNullParameter(it, "it");
        Iterator<T> it2 = it.getEligibleAssets().getEquityPositions().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.areEqual(((EligibleAsset) next).getInstrumentId(), str)) {
                break;
            }
        }
        EligibleAsset eligibleAsset = (EligibleAsset) next;
        if (eligibleAsset == null) {
            return Unit.INSTANCE;
        }
        BigDecimal bigDecimal = it.getAssetSelection().getEquities().get(StringsKt.toUuid(str));
        if (bigDecimal == null || !Intrinsics.areEqual(bigDecimal, eligibleAsset.getAvailableShares())) {
            internalAssetTransferCustomSelectionDuxo.submit(new InternalAssetTransferCustomSelectionEvent.SelectEquity(StringsKt.toUuid(str)));
        } else {
            internalAssetTransferCustomSelectionDuxo.submit(new InternalAssetTransferCustomSelectionEvent.UnselectEquity(StringsKt.toUuid(str)));
        }
        return Unit.INSTANCE;
    }

    public final void onEquityRowClicked(final String instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferCustomSelectionDuxo.onEquityRowClicked$lambda$4(instrumentId, this, (InternalAssetTransferCustomSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEquityRowClicked$lambda$4(String str, final InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo, InternalAssetTransferCustomSelectionDataState it) {
        Object next;
        final ShareSelection specificShares;
        Intrinsics.checkNotNullParameter(it, "it");
        Iterator<T> it2 = it.getEligibleAssets().getEquityPositions().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.areEqual(((EligibleAsset) next).getInstrumentId(), str)) {
                break;
            }
        }
        final EligibleAsset eligibleAsset = (EligibleAsset) next;
        if (eligibleAsset == null) {
            return Unit.INSTANCE;
        }
        BigDecimal bigDecimal = it.getAssetSelection().getEquities().get(StringsKt.toUuid(str));
        if (bigDecimal == null || Intrinsics.areEqual(bigDecimal, BigDecimal.ZERO) || Intrinsics.areEqual(bigDecimal, eligibleAsset.getAvailableShares())) {
            specificShares = ShareSelection.AllShares.INSTANCE;
        } else {
            specificShares = new ShareSelection.SpecificShares(bigDecimal);
        }
        internalAssetTransferCustomSelectionDuxo.withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferCustomSelectionDuxo.onEquityRowClicked$lambda$4$lambda$3(this.f$0, eligibleAsset, specificShares, (InternalAssetTransferCustomSelectionDataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEquityRowClicked$lambda$4$lambda$3(InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo, EligibleAsset eligibleAsset, ShareSelection shareSelection, InternalAssetTransferCustomSelectionDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        internalAssetTransferCustomSelectionDuxo.submit(new InternalAssetTransferCustomSelectionEvent.EditEquitySelection(eligibleAsset, shareSelection));
        return Unit.INSTANCE;
    }

    /* compiled from: InternalAssetTransferCustomSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$searchValueChanged$1", m3645f = "InternalAssetTransferCustomSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$searchValueChanged$1 */
    static final class C191181 extends ContinuationImpl7 implements Function2<InternalAssetTransferCustomSelectionDataState, Continuation<? super InternalAssetTransferCustomSelectionDataState>, Object> {
        final /* synthetic */ String $searchTextValue;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C191181(String str, Continuation<? super C191181> continuation) {
            super(2, continuation);
            this.$searchTextValue = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C191181 c191181 = new C191181(this.$searchTextValue, continuation);
            c191181.L$0 = obj;
            return c191181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferCustomSelectionDataState internalAssetTransferCustomSelectionDataState, Continuation<? super InternalAssetTransferCustomSelectionDataState> continuation) {
            return ((C191181) create(internalAssetTransferCustomSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferCustomSelectionDataState.copy$default((InternalAssetTransferCustomSelectionDataState) this.L$0, null, null, null, kotlin.text.StringsKt.trim(this.$searchTextValue).toString(), false, false, false, null, null, 503, null);
        }
    }

    public final void searchValueChanged(String searchTextValue) {
        Intrinsics.checkNotNullParameter(searchTextValue, "searchTextValue");
        applyMutation(new C191181(searchTextValue, null));
    }

    public final void clearSelections(boolean isCashVisible, List<UUID> instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        submit(new InternalAssetTransferCustomSelectionEvent.ClearAssetSelection(isCashVisible, instrumentIds));
    }

    public final void selectAssets(boolean isCashVisible, List<UUID> instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        submit(new InternalAssetTransferCustomSelectionEvent.SelectAssets(isCashVisible, instrumentIds));
    }

    public final void cashBalanceChecked() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferCustomSelectionDuxo.cashBalanceChecked$lambda$5(this.f$0, (InternalAssetTransferCustomSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cashBalanceChecked$lambda$5(InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo, InternalAssetTransferCustomSelectionDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getAssetSelection().getCash(), it.getEligibleAssets().getAvailableCash())) {
            internalAssetTransferCustomSelectionDuxo.submit(InternalAssetTransferCustomSelectionEvent.UnselectCashSelection.INSTANCE);
        } else {
            internalAssetTransferCustomSelectionDuxo.submit(InternalAssetTransferCustomSelectionEvent.SelectCashSelection.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    public final void cashBalanceClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferCustomSelectionDuxo.cashBalanceClicked$lambda$6(this.f$0, (InternalAssetTransferCustomSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cashBalanceClicked$lambda$6(InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo, InternalAssetTransferCustomSelectionDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        internalAssetTransferCustomSelectionDuxo.submit(new InternalAssetTransferCustomSelectionEvent.NavigateToCashSelectionScreen(it.getEligibleAssets()));
        return Unit.INSTANCE;
    }

    /* compiled from: InternalAssetTransferCustomSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onAssetSelectionChanged$1", m3645f = "InternalAssetTransferCustomSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onAssetSelectionChanged$1 */
    static final class C191161 extends ContinuationImpl7 implements Function2<InternalAssetTransferCustomSelectionDataState, Continuation<? super InternalAssetTransferCustomSelectionDataState>, Object> {
        final /* synthetic */ AssetSelection $assetSelection;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C191161(AssetSelection assetSelection, Continuation<? super C191161> continuation) {
            super(2, continuation);
            this.$assetSelection = assetSelection;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C191161 c191161 = new C191161(this.$assetSelection, continuation);
            c191161.L$0 = obj;
            return c191161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferCustomSelectionDataState internalAssetTransferCustomSelectionDataState, Continuation<? super InternalAssetTransferCustomSelectionDataState> continuation) {
            return ((C191161) create(internalAssetTransferCustomSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferCustomSelectionDataState.copy$default((InternalAssetTransferCustomSelectionDataState) this.L$0, null, this.$assetSelection, null, null, false, false, false, null, null, 509, null);
        }
    }

    public final void onAssetSelectionChanged(AssetSelection assetSelection) {
        Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
        applyMutation(new C191161(assetSelection, null));
    }

    public static /* synthetic */ void onContinueClicked$default(InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        internalAssetTransferCustomSelectionDuxo.onContinueClicked(z);
    }

    public final void onContinueClicked(final boolean skipMargin) {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferCustomSelectionDuxo.onContinueClicked$lambda$7(this.f$0, skipMargin, (InternalAssetTransferCustomSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinueClicked$lambda$7(InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo, boolean z, InternalAssetTransferCustomSelectionDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getShouldAbortIatFlow()) {
            internalAssetTransferCustomSelectionDuxo.submit(InternalAssetTransferCustomSelectionEvent.NavigateBackToReviewScreen.INSTANCE);
            return Unit.INSTANCE;
        }
        if (state.getAssetSelection().getCash().compareTo(BigDecimal.ZERO) < 0) {
            BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(internalAssetTransferCustomSelectionDuxo), null, null, new InternalAssetTransferCustomSelectionDuxo2(z, state, internalAssetTransferCustomSelectionDuxo, null), 3, null);
            return Unit.INSTANCE;
        }
        internalAssetTransferCustomSelectionDuxo.navigateToAgreementsScreen();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountFeatureParityBottomSheetData buildBottomSheetForEligibility(GetMultiAccountEligibilityResponseDto eligibility) {
        boolean zIs_eligible = eligibility.is_eligible();
        boolean z = eligibility.getMargin_investing_state() == MarginInvestingStateDto.MARGIN_INVESTING_STATE_ENABLED;
        if (!zIs_eligible || z) {
            return null;
        }
        return makeEnableMarginSheet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountFeatureParityBottomSheetData buildBottomSheetForParityWarning(AccountFeatureParityWarning warning) {
        if (warning == AccountFeatureParityWarning.SOURCE_HAS_MARGIN_SINK_DOES_NOT) {
            return makeEnableMarginSheet();
        }
        return null;
    }

    private final AccountFeatureParityBottomSheetData makeEnableMarginSheet() {
        StringResource.Companion companion = StringResource.INSTANCE;
        return new AccountFeatureParityBottomSheetData(companion.invoke(C18977R.string.enable_margin_title, new Object[0]), companion.invoke(C18977R.string.enable_margin_subtitle, new Object[0]), companion.invoke(C18977R.string.enabled_margin_cta, new Object[0]), companion.invoke(C18977R.string.enable_margin_secondary_button, new Object[0]), Integer.valueOf(C20690R.drawable.pict_mono_rds_margin));
    }

    public final void navigateToAgreementsScreen() {
        submit(InternalAssetTransferCustomSelectionEvent.NavigateToAgreementsScreen.INSTANCE);
    }

    public final void onInfoBannerLinkClicked() {
        submit(InternalAssetTransferCustomSelectionEvent.NavigateToNonTransferableAssetsScreen.INSTANCE);
    }

    /* compiled from: InternalAssetTransferCustomSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDuxo;", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InternalAssetTransferCustomSelectionDuxo, InternalAssetTransferCustomSelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalAssetTransferCustomSelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (InternalAssetTransferCustomSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalAssetTransferCustomSelectionFragment.Args getArgs(InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo) {
            return (InternalAssetTransferCustomSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, internalAssetTransferCustomSelectionDuxo);
        }
    }
}

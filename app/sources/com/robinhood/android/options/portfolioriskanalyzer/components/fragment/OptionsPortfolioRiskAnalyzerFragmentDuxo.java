package com.robinhood.android.options.portfolioriskanalyzer.components.fragment;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.options.contracts.OptionsPortfolioRiskAnalyzer;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p320db.Account;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OptionsPortfolioRiskAnalyzerFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/fragment/OptionsPortfolioRiskAnalyzerFragmentDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/fragment/OptionsPortfolioRiskAnalyzerFragmentViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerFragmentDuxo extends BaseDuxo4<OptionsPortfolioRiskAnalyzerFragmentViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final ExperimentsStore experimentsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OptionsPortfolioRiskAnalyzerFragmentDuxo(AccountProvider accountProvider, ExperimentsStore experimentsStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Parcelable args = INSTANCE.getArgs(savedStateHandle);
        super(new OptionsPortfolioRiskAnalyzerFragmentViewState(args instanceof OptionsPortfolioRiskAnalyzer.WithAccountNumber ? (OptionsPortfolioRiskAnalyzer.WithAccountNumber) args : null, false, 2, null), duxoBundle);
        this.accountProvider = accountProvider;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C235121(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C235132(null));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$1", m3645f = "OptionsPortfolioRiskAnalyzerFragmentDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$1 */
    static final class C235121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C235121(Continuation<? super C235121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsPortfolioRiskAnalyzerFragmentDuxo.this.new C235121(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C235121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final OptionsPortfolioRiskAnalyzer optionsPortfolioRiskAnalyzer = (OptionsPortfolioRiskAnalyzer) OptionsPortfolioRiskAnalyzerFragmentDuxo.INSTANCE.getArgs((HasSavedState) OptionsPortfolioRiskAnalyzerFragmentDuxo.this);
                if (optionsPortfolioRiskAnalyzer instanceof OptionsPortfolioRiskAnalyzer.WithAccountNumber) {
                    OptionsPortfolioRiskAnalyzerFragmentDuxo.this.applyMutation(new AnonymousClass1(optionsPortfolioRiskAnalyzer, null));
                } else {
                    if (!(optionsPortfolioRiskAnalyzer instanceof OptionsPortfolioRiskAnalyzer.WithAccountType)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Observable<List<Account>> observableDistinctUntilChanged = OptionsPortfolioRiskAnalyzerFragmentDuxo.this.accountProvider.streamAllAccounts().distinctUntilChanged();
                    Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                    final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
                    Flow<String> flow = new Flow<String>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ OptionsPortfolioRiskAnalyzer $localArgs$inlined;
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsPortfolioRiskAnalyzerFragmentDuxo.kt", m3646l = {58}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                            public AnonymousClass2(FlowCollector flowCollector, OptionsPortfolioRiskAnalyzer optionsPortfolioRiskAnalyzer) {
                                this.$this_unsafeFlow = flowCollector;
                                this.$localArgs$inlined = optionsPortfolioRiskAnalyzer;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                T next;
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
                                    List list = (List) obj;
                                    Intrinsics.checkNotNull(list);
                                    Iterator<T> it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = (T) null;
                                            break;
                                        }
                                        next = it.next();
                                        if (((Account) next).getBrokerageAccountType() == ((OptionsPortfolioRiskAnalyzer.WithAccountType) this.$localArgs$inlined).getAccountType()) {
                                            break;
                                        }
                                    }
                                    Account account = next;
                                    if (account == null) {
                                        account = (Account) CollectionsKt.firstOrNull(list);
                                    }
                                    String accountNumber = account != null ? account.getAccountNumber() : null;
                                    if (accountNumber != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector, optionsPortfolioRiskAnalyzer), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsPortfolioRiskAnalyzerFragmentDuxo.this, optionsPortfolioRiskAnalyzer, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: OptionsPortfolioRiskAnalyzerFragmentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/fragment/OptionsPortfolioRiskAnalyzerFragmentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$1$1", m3645f = "OptionsPortfolioRiskAnalyzerFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerFragmentViewState, Continuation<? super OptionsPortfolioRiskAnalyzerFragmentViewState>, Object> {
            final /* synthetic */ OptionsPortfolioRiskAnalyzer $localArgs;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsPortfolioRiskAnalyzer optionsPortfolioRiskAnalyzer, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$localArgs = optionsPortfolioRiskAnalyzer;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$localArgs, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsPortfolioRiskAnalyzerFragmentViewState optionsPortfolioRiskAnalyzerFragmentViewState, Continuation<? super OptionsPortfolioRiskAnalyzerFragmentViewState> continuation) {
                return ((AnonymousClass1) create(optionsPortfolioRiskAnalyzerFragmentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionsPortfolioRiskAnalyzerFragmentViewState.copy$default((OptionsPortfolioRiskAnalyzerFragmentViewState) this.L$0, (OptionsPortfolioRiskAnalyzer.WithAccountNumber) this.$localArgs, false, 2, null);
            }
        }

        /* compiled from: OptionsPortfolioRiskAnalyzerFragmentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$1$3", m3645f = "OptionsPortfolioRiskAnalyzerFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            final /* synthetic */ OptionsPortfolioRiskAnalyzer $localArgs;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsPortfolioRiskAnalyzerFragmentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionsPortfolioRiskAnalyzerFragmentDuxo optionsPortfolioRiskAnalyzerFragmentDuxo, OptionsPortfolioRiskAnalyzer optionsPortfolioRiskAnalyzer, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionsPortfolioRiskAnalyzerFragmentDuxo;
                this.$localArgs = optionsPortfolioRiskAnalyzer;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$localArgs, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsPortfolioRiskAnalyzerFragmentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/fragment/OptionsPortfolioRiskAnalyzerFragmentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$1$3$1", m3645f = "OptionsPortfolioRiskAnalyzerFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerFragmentViewState, Continuation<? super OptionsPortfolioRiskAnalyzerFragmentViewState>, Object> {
                final /* synthetic */ String $accountNumber;
                final /* synthetic */ OptionsPortfolioRiskAnalyzer $localArgs;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(String str, OptionsPortfolioRiskAnalyzer optionsPortfolioRiskAnalyzer, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$accountNumber = str;
                    this.$localArgs = optionsPortfolioRiskAnalyzer;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountNumber, this.$localArgs, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsPortfolioRiskAnalyzerFragmentViewState optionsPortfolioRiskAnalyzerFragmentViewState, Continuation<? super OptionsPortfolioRiskAnalyzerFragmentViewState> continuation) {
                    return ((AnonymousClass1) create(optionsPortfolioRiskAnalyzerFragmentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsPortfolioRiskAnalyzerFragmentViewState.copy$default((OptionsPortfolioRiskAnalyzerFragmentViewState) this.L$0, new OptionsPortfolioRiskAnalyzer.WithAccountNumber(this.$accountNumber, ((OptionsPortfolioRiskAnalyzer.WithAccountType) this.$localArgs).getInitialUnderlyingId()), false, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((String) this.L$0, this.$localArgs, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$2", m3645f = "OptionsPortfolioRiskAnalyzerFragmentDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$2 */
    static final class C235132 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C235132(Continuation<? super C235132> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsPortfolioRiskAnalyzerFragmentDuxo.this.new C235132(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C235132) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(OptionsPortfolioRiskAnalyzerFragmentDuxo.this.experimentsStore, new Experiment[]{Experiments.OptionsPortfolioRiskAnalyzer.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsPortfolioRiskAnalyzerFragmentDuxo.this, null);
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

        /* compiled from: OptionsPortfolioRiskAnalyzerFragmentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$2$1", m3645f = "OptionsPortfolioRiskAnalyzerFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionsPortfolioRiskAnalyzerFragmentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsPortfolioRiskAnalyzerFragmentDuxo optionsPortfolioRiskAnalyzerFragmentDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsPortfolioRiskAnalyzerFragmentDuxo;
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

            /* compiled from: OptionsPortfolioRiskAnalyzerFragmentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/fragment/OptionsPortfolioRiskAnalyzerFragmentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$2$1$1", m3645f = "OptionsPortfolioRiskAnalyzerFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragmentDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503361 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerFragmentViewState, Continuation<? super OptionsPortfolioRiskAnalyzerFragmentViewState>, Object> {
                final /* synthetic */ boolean $inExperiment;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503361(boolean z, Continuation<? super C503361> continuation) {
                    super(2, continuation);
                    this.$inExperiment = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503361 c503361 = new C503361(this.$inExperiment, continuation);
                    c503361.L$0 = obj;
                    return c503361;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsPortfolioRiskAnalyzerFragmentViewState optionsPortfolioRiskAnalyzerFragmentViewState, Continuation<? super OptionsPortfolioRiskAnalyzerFragmentViewState> continuation) {
                    return ((C503361) create(optionsPortfolioRiskAnalyzerFragmentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsPortfolioRiskAnalyzerFragmentViewState.copy$default((OptionsPortfolioRiskAnalyzerFragmentViewState) this.L$0, null, this.$inExperiment, 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503361(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/fragment/OptionsPortfolioRiskAnalyzerFragmentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/fragment/OptionsPortfolioRiskAnalyzerFragmentDuxo;", "Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer;", "<init>", "()V", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionsPortfolioRiskAnalyzerFragmentDuxo, OptionsPortfolioRiskAnalyzer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionsPortfolioRiskAnalyzer getArgs(SavedStateHandle savedStateHandle) {
            return (OptionsPortfolioRiskAnalyzer) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionsPortfolioRiskAnalyzer getArgs(OptionsPortfolioRiskAnalyzerFragmentDuxo optionsPortfolioRiskAnalyzerFragmentDuxo) {
            return (OptionsPortfolioRiskAnalyzer) DuxoCompanion.DefaultImpls.getArgs(this, optionsPortfolioRiskAnalyzerFragmentDuxo);
        }
    }
}

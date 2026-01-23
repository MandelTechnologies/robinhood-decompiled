package com.robinhood.android.event.trade.explainer;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: PriceExplainerDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/event/trade/explainer/PriceExplainerDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerDataState;", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/contentful/StaticContentStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "argsFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerDuxo$Args;", "onCreate", "", "setArgs", "eventContractId", "Ljava/util/UUID;", "exchangeSource", "Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "Args", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PriceExplainerDuxo extends BaseDuxo<PriceExplainerDataState, PriceExplainerDuxo4> implements HasSavedState {
    public static final int $stable = 8;
    private final StateFlow2<Args> argsFlow;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceExplainerDuxo(StaticContentStore staticContentStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new PriceExplainerDataState(null, null, 3, null), PriceExplainerDuxo3.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.staticContentStore = staticContentStore;
        this.savedStateHandle = savedStateHandle;
        this.argsFlow = StateFlow4.MutableStateFlow(null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C164661(null));
    }

    /* compiled from: PriceExplainerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.trade.explainer.PriceExplainerDuxo$onCreate$1", m3645f = "PriceExplainerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.trade.explainer.PriceExplainerDuxo$onCreate$1 */
    static final class C164661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C164661(Continuation<? super C164661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164661 c164661 = PriceExplainerDuxo.this.new C164661(continuation);
            c164661.L$0 = obj;
            return c164661;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C164661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PriceExplainerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.explainer.PriceExplainerDuxo$onCreate$1$1", m3645f = "PriceExplainerDuxo.kt", m3646l = {50}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.trade.explainer.PriceExplainerDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PriceExplainerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PriceExplainerDuxo priceExplainerDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = priceExplainerDuxo;
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
                    Flow flowMapLatest = FlowKt.mapLatest(FlowKt.filterNotNull(this.this$0.argsFlow), new C500631(this.this$0, null));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
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

            /* compiled from: PriceExplainerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "args", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerDuxo$Args;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.explainer.PriceExplainerDuxo$onCreate$1$1$1", m3645f = "PriceExplainerDuxo.kt", m3646l = {47}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.event.trade.explainer.PriceExplainerDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C500631 extends ContinuationImpl7 implements Function2<Args, Continuation<? super Result<? extends OtherMarkdown>>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ PriceExplainerDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C500631(PriceExplainerDuxo priceExplainerDuxo, Continuation<? super C500631> continuation) {
                    super(2, continuation);
                    this.this$0 = priceExplainerDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C500631 c500631 = new C500631(this.this$0, continuation);
                    c500631.L$0 = obj;
                    return c500631;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Args args, Continuation<? super Result<OtherMarkdown>> continuation) {
                    return ((C500631) create(args, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Args args, Continuation<? super Result<? extends OtherMarkdown>> continuation) {
                    return invoke2(args, (Continuation<? super Result<OtherMarkdown>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM28550constructorimpl;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Args args = (Args) this.L$0;
                            PriceExplainerDuxo priceExplainerDuxo = this.this$0;
                            Result.Companion companion = Result.INSTANCE;
                            StaticContentStore staticContentStore = priceExplainerDuxo.staticContentStore;
                            String contentfulId = args.getContentfulId();
                            this.label = 1;
                            obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, contentfulId, null, this, 2, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        objM28550constructorimpl = Result.m28550constructorimpl((OtherMarkdown) ((EntryResource) obj).getValue());
                    } catch (Throwable th) {
                        Throwables.rethrowIfNotNetworkRelated(th);
                        Result.Companion companion2 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    }
                    return Result.m28549boximpl(objM28550constructorimpl);
                }
            }

            /* compiled from: PriceExplainerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lkotlin/Result;", "Lcom/robinhood/staticcontent/model/OtherMarkdown;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.trade.explainer.PriceExplainerDuxo$onCreate$1$1$2", m3645f = "PriceExplainerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.trade.explainer.PriceExplainerDuxo$onCreate$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Result<? extends OtherMarkdown>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ PriceExplainerDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(PriceExplainerDuxo priceExplainerDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = priceExplainerDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Result<? extends OtherMarkdown> result, Continuation<? super Unit> continuation) {
                    return invoke(result.getValue(), continuation);
                }

                public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(Result.m28549boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: PriceExplainerDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.trade.explainer.PriceExplainerDuxo$onCreate$1$1$2$1", m3645f = "PriceExplainerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.trade.explainer.PriceExplainerDuxo$onCreate$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C500641 extends ContinuationImpl7 implements Function2<PriceExplainerDataState, Continuation<? super PriceExplainerDataState>, Object> {
                    final /* synthetic */ Object $result;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500641(Object obj, Continuation<? super C500641> continuation) {
                        super(2, continuation);
                        this.$result = obj;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500641 c500641 = new C500641(this.$result, continuation);
                        c500641.L$0 = obj;
                        return c500641;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PriceExplainerDataState priceExplainerDataState, Continuation<? super PriceExplainerDataState> continuation) {
                        return ((C500641) create(priceExplainerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return PriceExplainerDataState.copy$default((PriceExplainerDataState) this.L$0, Result.m28549boximpl(this.$result), null, 2, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500641(((Result) this.L$0).getValue(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(PriceExplainerDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void setArgs(UUID eventContractId, ExchangeSource exchangeSource) {
        Intrinsics.checkNotNullParameter(eventContractId, "eventContractId");
        StateFlow2<Args> stateFlow2 = this.argsFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), new Args(eventContractId, exchangeSource))) {
        }
        applyMutation(new C164672(exchangeSource, null));
    }

    /* compiled from: PriceExplainerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.trade.explainer.PriceExplainerDuxo$setArgs$2", m3645f = "PriceExplainerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.trade.explainer.PriceExplainerDuxo$setArgs$2 */
    static final class C164672 extends ContinuationImpl7 implements Function2<PriceExplainerDataState, Continuation<? super PriceExplainerDataState>, Object> {
        final /* synthetic */ ExchangeSource $exchangeSource;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C164672(ExchangeSource exchangeSource, Continuation<? super C164672> continuation) {
            super(2, continuation);
            this.$exchangeSource = exchangeSource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164672 c164672 = new C164672(this.$exchangeSource, continuation);
            c164672.L$0 = obj;
            return c164672;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PriceExplainerDataState priceExplainerDataState, Continuation<? super PriceExplainerDataState> continuation) {
            return ((C164672) create(priceExplainerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PriceExplainerDataState.copy$default((PriceExplainerDataState) this.L$0, null, this.$exchangeSource, 1, null);
        }
    }

    /* compiled from: PriceExplainerDuxo.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/event/trade/explainer/PriceExplainerDuxo$Args;", "", "eventContractId", "Ljava/util/UUID;", "exchangeSource", "Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;)V", "getEventContractId", "()Ljava/util/UUID;", "getExchangeSource", "()Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "contentfulId", "", "getContentfulId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args {
        public static final int $stable = 8;
        private final String contentfulId;
        private final UUID eventContractId;
        private final ExchangeSource exchangeSource;

        /* compiled from: PriceExplainerDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ExchangeSource.values().length];
                try {
                    iArr[ExchangeSource.KALSHI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ExchangeSource.FORECAST_EX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ExchangeSource.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, ExchangeSource exchangeSource, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.eventContractId;
            }
            if ((i & 2) != 0) {
                exchangeSource = args.exchangeSource;
            }
            return args.copy(uuid, exchangeSource);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getEventContractId() {
            return this.eventContractId;
        }

        /* renamed from: component2, reason: from getter */
        public final ExchangeSource getExchangeSource() {
            return this.exchangeSource;
        }

        public final Args copy(UUID eventContractId, ExchangeSource exchangeSource) {
            Intrinsics.checkNotNullParameter(eventContractId, "eventContractId");
            return new Args(eventContractId, exchangeSource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.eventContractId, args.eventContractId) && this.exchangeSource == args.exchangeSource;
        }

        public int hashCode() {
            int iHashCode = this.eventContractId.hashCode() * 31;
            ExchangeSource exchangeSource = this.exchangeSource;
            return iHashCode + (exchangeSource == null ? 0 : exchangeSource.hashCode());
        }

        public String toString() {
            return "Args(eventContractId=" + this.eventContractId + ", exchangeSource=" + this.exchangeSource + ")";
        }

        public Args(UUID eventContractId, ExchangeSource exchangeSource) {
            String str;
            Intrinsics.checkNotNullParameter(eventContractId, "eventContractId");
            this.eventContractId = eventContractId;
            this.exchangeSource = exchangeSource;
            int i = exchangeSource == null ? -1 : WhenMappings.$EnumSwitchMapping$0[exchangeSource.ordinal()];
            if (i == -1) {
                str = "";
            } else if (i == 1) {
                str = "4bE9JMgXyLUZokWhCjfzOm";
            } else if (i == 2) {
                str = "5Rr9rE64qyLJkxPvXKRzdV";
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "";
            }
            this.contentfulId = str;
        }

        public final UUID getEventContractId() {
            return this.eventContractId;
        }

        public final ExchangeSource getExchangeSource() {
            return this.exchangeSource;
        }

        public final String getContentfulId() {
            return this.contentfulId;
        }
    }
}

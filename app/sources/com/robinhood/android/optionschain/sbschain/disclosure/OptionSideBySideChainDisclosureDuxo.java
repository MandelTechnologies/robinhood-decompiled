package com.robinhood.android.optionschain.sbschain.disclosure;

import android.text.Spanned;
import android.text.SpannedString;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionSideBySideChainDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/disclosure/OptionSideBySideChainDisclosureDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/optionschain/sbschain/disclosure/OptionSideBySideChainDisclosureViewState;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "markwon", "Lio/noties/markwon/Markwon;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;Lio/noties/markwon/Markwon;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "bindLaunchMode", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionSideBySideChainDisclosureDuxo extends BaseDuxo4<OptionSideBySideChainDisclosureViewState> {
    public static final int $stable = 8;
    private final BrokerageResourceManager brokerageResourceManager;
    private final Markwon markwon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionSideBySideChainDisclosureDuxo(BrokerageResourceManager brokerageResourceManager, Markwon markwon, DuxoBundle duxoBundle) {
        super(new OptionSideBySideChainDisclosureViewState(null, SpannedString.valueOf("")), duxoBundle);
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.brokerageResourceManager = brokerageResourceManager;
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C244791(null));
    }

    /* compiled from: OptionSideBySideChainDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureDuxo$onCreate$1", m3645f = "OptionSideBySideChainDisclosureDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureDuxo$onCreate$1 */
    static final class C244791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C244791(Continuation<? super C244791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainDisclosureDuxo.this.new C244791(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionSideBySideChainDisclosureViewState> stateFlow = OptionSideBySideChainDisclosureDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<OptionChainLaunchMode>() { // from class: com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "OptionSideBySideChainDisclosureDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                OptionChainLaunchMode launchMode = ((OptionSideBySideChainDisclosureViewState) obj).getLaunchMode();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(launchMode, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
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
                    public Object collect(FlowCollector<? super OptionChainLaunchMode> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }), new C24475x80f184ce(null, OptionSideBySideChainDisclosureDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionSideBySideChainDisclosureDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: OptionSideBySideChainDisclosureDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "content", "Landroid/text/Spanned;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureDuxo$onCreate$1$3", m3645f = "OptionSideBySideChainDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Spanned, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainDisclosureDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionSideBySideChainDisclosureDuxo optionSideBySideChainDisclosureDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainDisclosureDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Spanned spanned, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(spanned, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainDisclosureDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/disclosure/OptionSideBySideChainDisclosureViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureDuxo$onCreate$1$3$1", m3645f = "OptionSideBySideChainDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDisclosureViewState, Continuation<? super OptionSideBySideChainDisclosureViewState>, Object> {
                final /* synthetic */ Spanned $content;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Spanned spanned, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$content = spanned;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$content, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainDisclosureViewState optionSideBySideChainDisclosureViewState, Continuation<? super OptionSideBySideChainDisclosureViewState> continuation) {
                    return ((AnonymousClass1) create(optionSideBySideChainDisclosureViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainDisclosureViewState.copy$default((OptionSideBySideChainDisclosureViewState) this.L$0, null, this.$content, 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Spanned) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionSideBySideChainDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/disclosure/OptionSideBySideChainDisclosureViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureDuxo$bindLaunchMode$1", m3645f = "OptionSideBySideChainDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureDuxo$bindLaunchMode$1 */
    static final class C244781 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDisclosureViewState, Continuation<? super OptionSideBySideChainDisclosureViewState>, Object> {
        final /* synthetic */ OptionChainLaunchMode $launchMode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C244781(OptionChainLaunchMode optionChainLaunchMode, Continuation<? super C244781> continuation) {
            super(2, continuation);
            this.$launchMode = optionChainLaunchMode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C244781 c244781 = new C244781(this.$launchMode, continuation);
            c244781.L$0 = obj;
            return c244781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionSideBySideChainDisclosureViewState optionSideBySideChainDisclosureViewState, Continuation<? super OptionSideBySideChainDisclosureViewState> continuation) {
            return ((C244781) create(optionSideBySideChainDisclosureViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionSideBySideChainDisclosureViewState.copy$default((OptionSideBySideChainDisclosureViewState) this.L$0, this.$launchMode, null, 2, null);
        }
    }

    public final void bindLaunchMode(OptionChainLaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        applyMutation(new C244781(launchMode, null));
    }
}

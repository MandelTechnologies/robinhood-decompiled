package com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal;

import com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal.LimitRevealDuxo2;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse2;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlValidationType;
import com.robinhood.android.models.creditcard.api.graphql.PutPremiumCreditLimitResponse;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import timber.log.Timber;

/* compiled from: LimitRevealDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u001c\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealState;", "Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealEvent;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;Lkotlinx/coroutines/CoroutineDispatcher;)V", "onStart", "", "onPremiumSelected", "onStandardSelected", "onPremiumContinue", "confirmPremiumLimit", "depositMicro", "", "onSuccess", "Lkotlin/Function0;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class LimitRevealDuxo extends BaseDuxo5<LimitRevealState, LimitRevealDuxo2> {
    public static final int $stable = 8;
    private final CreditCardStore creditCardStore;
    private final CoroutineDispatcher defaultDispatcher;
    private final ExperimentsStore experimentsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitRevealDuxo(CreditCardStore creditCardStore, ExperimentsStore experimentsStore, DuxoBundle duxoBundle, @DefaultDispatcher CoroutineDispatcher defaultDispatcher) {
        super(new LimitRevealState(false, false, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.creditCardStore = creditCardStore;
        this.experimentsStore = experimentsStore;
        this.defaultDispatcher = defaultDispatcher;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().launchWhenStarted(new C124851(null));
    }

    /* compiled from: LimitRevealDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealDuxo$onStart$1", m3645f = "LimitRevealDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealDuxo$onStart$1 */
    static final class C124851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C124851(Continuation<? super C124851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LimitRevealDuxo.this.new C124851(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C124851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: LimitRevealDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealDuxo$onStart$1$1", m3645f = "LimitRevealDuxo.kt", m3646l = {97}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ LimitRevealDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LimitRevealDuxo limitRevealDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = limitRevealDuxo;
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
                    Observable observableStreamVariant = this.this$0.experimentsStore.streamVariant(PremiumCreditLimitExperiment.INSTANCE, PremiumCreditLimitExperimentVariant.CONTROL, false);
                    this.label = 1;
                    obj = RxAwait3.awaitFirstOrNull(observableStreamVariant, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.applyMutation(new C497221((PremiumCreditLimitExperimentVariant) obj, null));
                return Unit.INSTANCE;
            }

            /* compiled from: LimitRevealDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealDuxo$onStart$1$1$1", m3645f = "LimitRevealDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497221 extends ContinuationImpl7 implements Function2<LimitRevealState, Continuation<? super LimitRevealState>, Object> {
                final /* synthetic */ PremiumCreditLimitExperimentVariant $inPremiumCreditLimitExperiment;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497221(PremiumCreditLimitExperimentVariant premiumCreditLimitExperimentVariant, Continuation<? super C497221> continuation) {
                    super(2, continuation);
                    this.$inPremiumCreditLimitExperiment = premiumCreditLimitExperimentVariant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497221 c497221 = new C497221(this.$inPremiumCreditLimitExperiment, continuation);
                    c497221.L$0 = obj;
                    return c497221;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(LimitRevealState limitRevealState, Continuation<? super LimitRevealState> continuation) {
                    return ((C497221) create(limitRevealState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    LimitRevealState limitRevealState = (LimitRevealState) this.L$0;
                    PremiumCreditLimitExperimentVariant premiumCreditLimitExperimentVariant = this.$inPremiumCreditLimitExperiment;
                    return LimitRevealState.copy$default(limitRevealState, premiumCreditLimitExperimentVariant != null ? premiumCreditLimitExperimentVariant.isInExperiment() : false, false, 2, null);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher coroutineDispatcher = LimitRevealDuxo.this.defaultDispatcher;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(LimitRevealDuxo.this, null);
                this.label = 1;
                if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: LimitRevealDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealDuxo$onPremiumSelected$1", m3645f = "LimitRevealDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealDuxo$onPremiumSelected$1 */
    static final class C124831 extends ContinuationImpl7 implements Function2<LimitRevealState, Continuation<? super LimitRevealState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C124831(Continuation<? super C124831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C124831 c124831 = new C124831(continuation);
            c124831.L$0 = obj;
            return c124831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LimitRevealState limitRevealState, Continuation<? super LimitRevealState> continuation) {
            return ((C124831) create(limitRevealState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return LimitRevealState.copy$default((LimitRevealState) this.L$0, false, true, 1, null);
        }
    }

    public final void onPremiumSelected() {
        applyMutation(new C124831(null));
    }

    /* compiled from: LimitRevealDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealDuxo$onStandardSelected$1", m3645f = "LimitRevealDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealDuxo$onStandardSelected$1 */
    static final class C124841 extends ContinuationImpl7 implements Function2<LimitRevealState, Continuation<? super LimitRevealState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C124841(Continuation<? super C124841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C124841 c124841 = new C124841(continuation);
            c124841.L$0 = obj;
            return c124841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LimitRevealState limitRevealState, Continuation<? super LimitRevealState> continuation) {
            return ((C124841) create(limitRevealState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return LimitRevealState.copy$default((LimitRevealState) this.L$0, false, false, 1, null);
        }
    }

    public final void onStandardSelected() {
        applyMutation(new C124841(null));
    }

    public final void onPremiumContinue() {
        submit(LimitRevealDuxo2.ChoosePremiumLimit.INSTANCE);
    }

    /* compiled from: LimitRevealDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealDuxo$confirmPremiumLimit$1", m3645f = "LimitRevealDuxo.kt", m3646l = {64}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealDuxo$confirmPremiumLimit$1 */
    static final class C124821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $depositMicro;
        final /* synthetic */ Function0<Unit> $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C124821(long j, Function0<Unit> function0, Continuation<? super C124821> continuation) {
            super(2, continuation);
            this.$depositMicro = j;
            this.$onSuccess = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LimitRevealDuxo.this.new C124821(this.$depositMicro, this.$onSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C124821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0067 A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:5:0x000e, B:15:0x0031, B:17:0x0036, B:19:0x003c, B:21:0x0040, B:35:0x0067, B:37:0x0073, B:39:0x0079, B:40:0x007d, B:24:0x0048, B:26:0x0050, B:28:0x0056, B:30:0x005c, B:32:0x0060, B:12:0x0020), top: B:45:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PutPremiumCreditLimitResponse putPremiumCreditLimitResponse;
            GraphqlValidationType<PutPremiumCreditLimitResponse.Response> putPremiumCreditLimitChoice;
            GraphqlValidationType<PutPremiumCreditLimitResponse.Response> putPremiumCreditLimitChoice2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CreditCardStore creditCardStore = LimitRevealDuxo.this.creditCardStore;
                    long j = this.$depositMicro;
                    this.label = 1;
                    obj = creditCardStore.putPremiumCreditLimitChoice(j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                GraphqlQueryResponse graphqlQueryResponse = (GraphqlQueryResponse) obj;
                List<String> errors = null;
                List<GraphqlQueryResponse2> errors2 = graphqlQueryResponse != null ? graphqlQueryResponse.getErrors() : null;
                if (errors2 == null || errors2.isEmpty()) {
                    List<String> errors3 = (graphqlQueryResponse == null || (putPremiumCreditLimitResponse = (PutPremiumCreditLimitResponse) graphqlQueryResponse.getData()) == null || (putPremiumCreditLimitChoice = putPremiumCreditLimitResponse.getPutPremiumCreditLimitChoice()) == null) ? null : putPremiumCreditLimitChoice.getErrors();
                    if (errors3 != null && !errors3.isEmpty()) {
                        Timber.Companion companion = Timber.INSTANCE;
                        long j2 = this.$depositMicro;
                        PutPremiumCreditLimitResponse putPremiumCreditLimitResponse2 = (PutPremiumCreditLimitResponse) graphqlQueryResponse.getData();
                        if (putPremiumCreditLimitResponse2 != null && (putPremiumCreditLimitChoice2 = putPremiumCreditLimitResponse2.getPutPremiumCreditLimitChoice()) != null) {
                            errors = putPremiumCreditLimitChoice2.getErrors();
                        }
                        companion.mo3353e("Error calling putPremiumCreditMutation with deposit amount " + j2 + " and errors: " + errors, new Object[0]);
                    }
                }
            } catch (Exception e) {
                Timber.INSTANCE.mo3353e("Error calling putPremiumCreditMutation with deposit amount " + this.$depositMicro + " and error: " + e, new Object[0]);
            }
            this.$onSuccess.invoke();
            return Unit.INSTANCE;
        }
    }

    public final void confirmPremiumLimit(long depositMicro, Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), this.defaultDispatcher, null, new C124821(depositMicro, onSuccess, null), 2, null);
    }
}

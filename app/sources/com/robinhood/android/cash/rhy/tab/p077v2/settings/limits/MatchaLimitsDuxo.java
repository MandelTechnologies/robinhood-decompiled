package com.robinhood.android.cash.rhy.tab.p077v2.settings.limits;

import com.robinhood.android.models.matcha.api.ApiUserLimits;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.matcha.MatchaApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchaLimitsDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsDataState;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsViewState;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsStateProvider;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsStateProvider;)V", "onCreate", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class MatchaLimitsDuxo extends BaseDuxo<MatchaLimitsDataState, MatchaLimitsViewState> {
    public static final int $stable = 8;
    private final MatchaApi matchaApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaLimitsDuxo(MatchaApi matchaApi, DuxoBundle duxoBundle, MatchaLimitsStateProvider stateProvider) {
        super(new MatchaLimitsDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.matchaApi = matchaApi;
    }

    /* compiled from: MatchaLimitsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.settings.limits.MatchaLimitsDuxo$onCreate$1", m3645f = "MatchaLimitsDuxo.kt", m3646l = {24}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.limits.MatchaLimitsDuxo$onCreate$1 */
    static final class C103471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C103471(Continuation<? super C103471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaLimitsDuxo.this.new C103471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C103471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MatchaApi matchaApi = MatchaLimitsDuxo.this.matchaApi;
                    this.label = 1;
                    obj = matchaApi.getLimits(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                MatchaLimitsDuxo.this.applyMutation(new AnonymousClass1((ApiUserLimits) obj, null));
            } catch (Throwable th) {
                MatchaLimitsDuxo.this.applyMutation(new AnonymousClass2(th, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: MatchaLimitsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.settings.limits.MatchaLimitsDuxo$onCreate$1$1", m3645f = "MatchaLimitsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.limits.MatchaLimitsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchaLimitsDataState, Continuation<? super MatchaLimitsDataState>, Object> {
            final /* synthetic */ ApiUserLimits $limits;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiUserLimits apiUserLimits, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$limits = apiUserLimits;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$limits, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MatchaLimitsDataState matchaLimitsDataState, Continuation<? super MatchaLimitsDataState> continuation) {
                return ((AnonymousClass1) create(matchaLimitsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MatchaLimitsDataState.copy$default((MatchaLimitsDataState) this.L$0, this.$limits, null, 2, null);
            }
        }

        /* compiled from: MatchaLimitsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/limits/MatchaLimitsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.settings.limits.MatchaLimitsDuxo$onCreate$1$2", m3645f = "MatchaLimitsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.limits.MatchaLimitsDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MatchaLimitsDataState, Continuation<? super MatchaLimitsDataState>, Object> {

            /* renamed from: $t */
            final /* synthetic */ Throwable f3941$t;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Throwable th, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f3941$t = th;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f3941$t, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MatchaLimitsDataState matchaLimitsDataState, Continuation<? super MatchaLimitsDataState> continuation) {
                return ((AnonymousClass2) create(matchaLimitsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MatchaLimitsDataState.copy$default((MatchaLimitsDataState) this.L$0, null, this.f3941$t, 1, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().launchWhenCreated(new C103471(null));
    }
}

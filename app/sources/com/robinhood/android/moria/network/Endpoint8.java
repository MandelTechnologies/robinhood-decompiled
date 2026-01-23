package com.robinhood.android.moria.network;

import com.plaid.internal.EnumC7081g;
import com.robinhood.coroutines.flow.ErrorHandling3;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.http.Polling3;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: Endpoint.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001aV\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022*\b\u0002\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0086@¢\u0006\u0004\b\t\u0010\n\u001aX\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022*\b\u0002\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\n\u001a\u0094\u0001\u0010\u000b\u001a\u0004\u0018\u00018\u0002\"\b\b\u0000\u0010\f*\u00020\u0000\"\b\b\u0001\u0010\r*\u00020\u0000\"\b\b\u0002\u0010\u0001*\u00020\u0000*\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0004\u0012\u00028\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u000126\b\u0002\u0010\b\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\u0011\u001ac\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00122*\b\u0002\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006¢\u0006\u0004\b\u0015\u0010\u0016\u001a]\u0010\u001a\u001a\u00020\u0019\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172*\b\u0002\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006¢\u0006\u0004\b\u001a\u0010\u001b\u001au\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014\"\u0004\b\u0000\u0010\u001c\"\f\b\u0001\u0010\u0001*\u0006\u0012\u0002\b\u00030\u001d*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u001e\u001a\u00028\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122*\b\u0002\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"", "T", "Lcom/robinhood/android/moria/network/Endpoint;", "", ResourceTypes.RAW, "(Lcom/robinhood/android/moria/network/Endpoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "saveAction", "forceFetch", "(Lcom/robinhood/android/moria/network/Endpoint;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetch", "P1", "P2", "Lkotlin/Pair;", "p1", "p2", "(Lcom/robinhood/android/moria/network/Endpoint;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j$/time/Duration", "duration", "Lkotlinx/coroutines/flow/Flow;", "poll", "(Lcom/robinhood/android/moria/network/Endpoint;Lj$/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "", "force", "Lkotlinx/coroutines/Job;", "refresh", "(Lcom/robinhood/android/moria/network/Endpoint;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", "P", "Lretrofit2/Response;", "params", "backendPoll", "(Lcom/robinhood/android/moria/network/Endpoint;Ljava/lang/Object;Lj$/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "lib-moria"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.moria.network.EndpointKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Endpoint8 {
    public static final <T> Object raw(Endpoint<Unit, T> endpoint, Continuation<? super T> continuation) {
        return endpoint.raw(Unit.INSTANCE, continuation);
    }

    public static /* synthetic */ Object forceFetch$default(Endpoint endpoint, Function3 function3, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function3 = endpoint.getDefaultSaveAction();
        }
        return forceFetch(endpoint, function3, continuation);
    }

    public static final <T> Object forceFetch(Endpoint<Unit, T> endpoint, Function3<? super Unit, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super T> continuation) {
        return endpoint.forceFetch(Unit.INSTANCE, function3, continuation);
    }

    public static /* synthetic */ Object fetch$default(Endpoint endpoint, Function3 function3, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function3 = endpoint.getDefaultSaveAction();
        }
        return fetch(endpoint, function3, continuation);
    }

    public static final <T> Object fetch(Endpoint<Unit, T> endpoint, Function3<? super Unit, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super T> continuation) {
        return endpoint.fetch(Unit.INSTANCE, function3, continuation);
    }

    public static /* synthetic */ Object fetch$default(Endpoint endpoint, Object obj, Object obj2, Function3 function3, Continuation continuation, int i, Object obj3) {
        if ((i & 4) != 0) {
            function3 = endpoint.getDefaultSaveAction();
        }
        return fetch(endpoint, obj, obj2, function3, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <P1, P2, T> Object fetch(Endpoint<Tuples2<P1, P2>, T> endpoint, P1 p1, P2 p2, Function3<? super Tuples2<? extends P1, ? extends P2>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super T> continuation) {
        return endpoint.fetch(Tuples4.m3642to(p1, p2), function3, continuation);
    }

    public static /* synthetic */ Flow poll$default(Endpoint endpoint, Duration duration, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            duration = Duration.ofSeconds(5L);
        }
        if ((i & 2) != 0) {
            function3 = endpoint.getDefaultSaveAction();
        }
        return poll(endpoint, duration, function3);
    }

    public static final <T> Flow<T> poll(Endpoint<Unit, T> endpoint, Duration duration, Function3<? super Unit, ? super T, ? super Continuation<? super Unit>, ? extends Object> saveAction) {
        Intrinsics.checkNotNullParameter(endpoint, "<this>");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        return endpoint.poll(Unit.INSTANCE, duration, saveAction);
    }

    public static /* synthetic */ Job refresh$default(Endpoint endpoint, boolean z, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            function3 = endpoint.getDefaultSaveAction();
        }
        return refresh(endpoint, z, function3);
    }

    public static final <T> Job refresh(Endpoint<Unit, T> endpoint, boolean z, Function3<? super Unit, ? super T, ? super Continuation<? super Unit>, ? extends Object> saveAction) {
        Intrinsics.checkNotNullParameter(endpoint, "<this>");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        return endpoint.refresh(Unit.INSTANCE, z, saveAction);
    }

    public static /* synthetic */ Flow backendPoll$default(Endpoint endpoint, Object obj, Duration duration, Function3 function3, int i, Object obj2) {
        if ((i & 2) != 0) {
            duration = Duration.ofSeconds(5L);
        }
        if ((i & 4) != 0) {
            function3 = endpoint.getDefaultSaveAction();
        }
        return backendPoll(endpoint, obj, duration, function3);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Endpoint.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "T", "Lretrofit2/Response;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.network.EndpointKt$backendPoll$1", m3645f = "Endpoint.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moria.network.EndpointKt$backendPoll$1 */
    static final class C222201<T> extends ContinuationImpl7 implements Function1<Continuation<? super T>, Object> {
        final /* synthetic */ P $params;
        final /* synthetic */ Function3<P, T, Continuation<? super Unit>, Object> $saveAction;
        final /* synthetic */ Endpoint<P, T> $this_backendPoll;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C222201(Endpoint<P, T> endpoint, P p, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C222201> continuation) {
            super(1, continuation);
            this.$this_backendPoll = endpoint;
            this.$params = p;
            this.$saveAction = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C222201(this.$this_backendPoll, this.$params, this.$saveAction, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super T> continuation) {
            return ((C222201) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Endpoint<P, T> endpoint = this.$this_backendPoll;
            P p = this.$params;
            Function function = this.$saveAction;
            this.label = 1;
            Object objForceFetch = endpoint.forceFetch(p, function, this);
            return objForceFetch == coroutine_suspended ? coroutine_suspended : objForceFetch;
        }
    }

    public static final <P, T extends Response<?>> Flow<T> backendPoll(Endpoint<P, T> endpoint, P p, Duration duration, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> saveAction) {
        Intrinsics.checkNotNullParameter(endpoint, "<this>");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        return FlowKt.filterNotNull(ErrorHandling3.ignoreNetworkExceptions(Polling3.networkPollWithBackendInterval$default(duration, false, new C222201(endpoint, p, saveAction, null), 2, null), duration));
    }
}

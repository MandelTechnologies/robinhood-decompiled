package com.robinhood.android.moria.network;

import com.robinhood.coroutines.flow.ErrorHandling3;
import com.robinhood.coroutines.flow.Polling2;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: PostEndpoint.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BU\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012(\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJB\u0010\u000f\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u00002(\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010JO\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112(\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015Je\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00132\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112(\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R<\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/moria/network/RealPostEndpoint;", "P", "", "T", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "networkCall", "Lkotlin/Function3;", "", "defaultSaveAction", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "params", "saveAction", "post", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j$/time/Duration", "duration", "Lkotlinx/coroutines/flow/Flow;", "poll", "(Ljava/lang/Object;Lj$/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function1;", "pollWithDynamicParams", "(Lkotlin/jvm/functions/Function1;Lj$/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function3;", "getDefaultSaveAction", "()Lkotlin/jvm/functions/Function3;", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.moria.network.RealPostEndpoint, reason: use source file name */
/* loaded from: classes17.dex */
final class PostEndpoint3<P, T> implements PostEndpoint<P, T> {
    private final Function3<P, T, Continuation<? super Unit>, Object> defaultSaveAction;
    private final Function2<P, Continuation<? super T>, Object> networkCall;

    /* compiled from: PostEndpoint.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.network.RealPostEndpoint", m3645f = "PostEndpoint.kt", m3646l = {85, 85}, m3647m = "post")
    /* renamed from: com.robinhood.android.moria.network.RealPostEndpoint$post$1 */
    /* loaded from: classes8.dex */
    static final class C222241 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PostEndpoint3<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C222241(PostEndpoint3<P, T> postEndpoint3, Continuation<? super C222241> continuation) {
            super(continuation);
            this.this$0 = postEndpoint3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.post(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PostEndpoint3(Function2<? super P, ? super Continuation<? super T>, ? extends Object> networkCall, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> defaultSaveAction) {
        Intrinsics.checkNotNullParameter(networkCall, "networkCall");
        Intrinsics.checkNotNullParameter(defaultSaveAction, "defaultSaveAction");
        this.networkCall = networkCall;
        this.defaultSaveAction = new PostEndpoint4(defaultSaveAction, null);
    }

    @Override // com.robinhood.android.moria.network.PostEndpoint
    public Function3<P, T, Continuation<? super Unit>, Object> getDefaultSaveAction() {
        return this.defaultSaveAction;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.moria.network.PostEndpoint
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object post(P p, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super T> continuation) {
        C222241 c222241;
        if (continuation instanceof C222241) {
            c222241 = (C222241) continuation;
            int i = c222241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c222241.label = i - Integer.MIN_VALUE;
            } else {
                c222241 = new C222241(this, continuation);
            }
        }
        Object objInvoke = c222241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c222241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function2<P, Continuation<? super T>, Object> function2 = this.networkCall;
            c222241.L$0 = p;
            c222241.L$1 = function3;
            c222241.label = 1;
            objInvoke = function2.invoke(p, c222241);
            if (objInvoke != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = c222241.L$0;
            ResultKt.throwOnFailure(objInvoke);
            return obj;
        }
        function3 = (Function3) c222241.L$1;
        p = (Object) c222241.L$0;
        ResultKt.throwOnFailure(objInvoke);
        c222241.L$0 = objInvoke;
        c222241.L$1 = null;
        c222241.label = 2;
        return function3.invoke(p, objInvoke, c222241) == coroutine_suspended ? coroutine_suspended : objInvoke;
    }

    /* compiled from: PostEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, m3636d2 = {"<anonymous>", "P"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.network.RealPostEndpoint$poll$1", m3645f = "PostEndpoint.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moria.network.RealPostEndpoint$poll$1 */
    /* loaded from: classes8.dex */
    static final class C222221 extends ContinuationImpl7 implements Function1<Continuation<? super P>, Object> {
        final /* synthetic */ P $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C222221(P p, Continuation<? super C222221> continuation) {
            super(1, continuation);
            this.$params = p;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C222221(this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super P> continuation) {
            return ((C222221) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.$params;
        }
    }

    @Override // com.robinhood.android.moria.network.PostEndpoint
    public Flow<T> poll(P params, Duration duration, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> saveAction) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        return pollWithDynamicParams(new C222221(params, null), duration, saveAction);
    }

    /* compiled from: PostEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "T", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.network.RealPostEndpoint$pollWithDynamicParams$1", m3645f = "PostEndpoint.kt", m3646l = {101, 101}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moria.network.RealPostEndpoint$pollWithDynamicParams$1 */
    /* loaded from: classes8.dex */
    static final class C222231 extends ContinuationImpl7 implements Function1<Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super P>, Object> $params;
        final /* synthetic */ Function3<P, T, Continuation<? super Unit>, Object> $saveAction;
        Object L$0;
        int label;
        final /* synthetic */ PostEndpoint3<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C222231(PostEndpoint3<P, T> postEndpoint3, Function1<? super Continuation<? super P>, ? extends Object> function1, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C222231> continuation) {
            super(1, continuation);
            this.this$0 = postEndpoint3;
            this.$params = function1;
            this.$saveAction = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C222231(this.this$0, this.$params, this.$saveAction, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super T> continuation) {
            return ((C222231) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [com.robinhood.android.moria.network.RealPostEndpoint] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ?? r1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint3<P, T> postEndpoint3 = this.this$0;
                Function1<Continuation<? super P>, Object> function1 = this.$params;
                this.L$0 = postEndpoint3;
                this.label = 1;
                obj = function1.invoke(this);
                r1 = postEndpoint3;
                if (obj != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            boolean z = (PostEndpoint3<P, T>) ((PostEndpoint3) this.L$0);
            ResultKt.throwOnFailure(obj);
            r1 = z;
            Function3<P, T, Continuation<? super Unit>, Object> function3 = this.$saveAction;
            this.L$0 = null;
            this.label = 2;
            Object objPost = r1.post(obj, function3, this);
            return objPost == coroutine_suspended ? coroutine_suspended : objPost;
        }
    }

    @Override // com.robinhood.android.moria.network.PostEndpoint
    public Flow<T> pollWithDynamicParams(Function1<? super Continuation<? super P>, ? extends Object> params, Duration duration, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> saveAction) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        return FlowKt.filterNotNull(ErrorHandling3.ignoreNetworkExceptions(Polling2.networkPoll(duration, new C222231(this, params, saveAction, null)), duration));
    }
}

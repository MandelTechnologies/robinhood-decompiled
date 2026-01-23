package com.robinhood.android.moria.p196db;

import com.robinhood.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: QueryTracker.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00050\u0004B1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/moria/db/QueryTracker;", "P", "", "T", "Lkotlin/Function1;", "Lkotlinx/coroutines/flow/Flow;", "activeSubscriptions", "Lcom/robinhood/android/moria/db/ActiveSubscriptions;", "params", "name", "", "enableDebugLogging", "", "<init>", "(Lcom/robinhood/android/moria/db/ActiveSubscriptions;Ljava/lang/Object;Ljava/lang/String;Z)V", "getParams", "()Ljava/lang/Object;", "Ljava/lang/Object;", "invoke", "upstream", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class QueryTracker<P, T> implements Function1<Flow<? extends T>, Flow<? extends T>> {
    private final ActiveSubscriptions<P> activeSubscriptions;
    private final boolean enableDebugLogging;
    private final String name;
    private final P params;

    public QueryTracker(ActiveSubscriptions<P> activeSubscriptions, P params, String name, boolean z) {
        Intrinsics.checkNotNullParameter(activeSubscriptions, "activeSubscriptions");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(name, "name");
        this.activeSubscriptions = activeSubscriptions;
        this.params = params;
        this.name = name;
        this.enableDebugLogging = z;
    }

    public final P getParams() {
        return this.params;
    }

    public /* synthetic */ QueryTracker(ActiveSubscriptions activeSubscriptions, Object obj, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activeSubscriptions, obj, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z);
    }

    /* compiled from: QueryTracker.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.db.QueryTracker$invoke$1", m3645f = "QueryTracker.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moria.db.QueryTracker$invoke$1 */
    static final class C222121 extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ QueryTracker<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C222121(QueryTracker<P, T> queryTracker, Continuation<? super C222121> continuation) {
            super(2, continuation);
            this.this$0 = queryTracker;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C222121(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C222121) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (((QueryTracker) this.this$0).enableDebugLogging) {
                    Logger.INSTANCE.mo1683i(((QueryTracker) this.this$0).name + " subscribe: " + this.this$0.getParams(), new Object[0]);
                }
                ((QueryTracker) this.this$0).activeSubscriptions.onSubscribe$lib_moria(this.this$0.getParams());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public Flow<T> invoke(Flow<? extends T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return FlowKt.onCompletion(FlowKt.onStart(upstream, new C222121(this, null)), new C222132(this, null));
    }

    /* compiled from: QueryTracker.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.db.QueryTracker$invoke$2", m3645f = "QueryTracker.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moria.db.QueryTracker$invoke$2 */
    static final class C222132 extends ContinuationImpl7 implements Function3<FlowCollector<? super T>, Throwable, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ QueryTracker<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C222132(QueryTracker<P, T> queryTracker, Continuation<? super C222132> continuation) {
            super(3, continuation);
            this.this$0 = queryTracker;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return new C222132(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (((QueryTracker) this.this$0).enableDebugLogging) {
                    Logger.INSTANCE.mo1683i(((QueryTracker) this.this$0).name + " unsubscribe: " + this.this$0.getParams(), new Object[0]);
                }
                ((QueryTracker) this.this$0).activeSubscriptions.onDispose$lib_moria(this.this$0.getParams());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

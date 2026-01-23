package com.robinhood.android.moria.p196db;

import com.plaid.internal.EnumC7081g;
import com.squareup.moshi.JsonDataException;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: Query.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u001a\b\u0004\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00070\u0006H\u0086\bø\u0001\u0000\u001a&\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0007\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00030\u0001\u001a[\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0007\"\b\b\u0000\u0010\u000b*\u00020\u0004\"\b\b\u0001\u0010\f*\u00020\u0004\"\b\b\u0002\u0010\n*\u00020\u0004*\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\f0\r\u0012\u0004\u0012\u0002H\n0\u00012\u0006\u0010\u000e\u001a\u0002H\u000b2\u0006\u0010\u000f\u001a\u0002H\f¢\u0006\u0002\u0010\u0010\u001a&\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0012\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00030\u0001\u001a[\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\n0\u0012\"\b\b\u0000\u0010\u000b*\u00020\u0004\"\b\b\u0001\u0010\f*\u00020\u0004\"\b\b\u0002\u0010\n*\u00020\u0004*\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\f0\r\u0012\u0004\u0012\u0002H\n0\u00012\u0006\u0010\u000e\u001a\u0002H\u000b2\u0006\u0010\u000f\u001a\u0002H\f¢\u0006\u0002\u0010\u0013\u001a_\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0007\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010\u0015\u001a\u0002H\u00022\u000e\b\b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001ae\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0012\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010\u0015\u001a\u0002H\u00022\u001c\u0010\u0016\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0019¢\u0006\u0002\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, m3636d2 = {"Query", "Lcom/robinhood/android/moria/db/Query;", "P", "T", "", "function", "Lkotlin/Function1;", "Lio/reactivex/Observable;", "asObservable", "", "R", "P1", "P2", "Lkotlin/Pair;", "param1", "param2", "(Lcom/robinhood/android/moria/db/Query;Ljava/lang/Object;Ljava/lang/Object;)Lio/reactivex/Observable;", "asFlow", "Lkotlinx/coroutines/flow/Flow;", "(Lcom/robinhood/android/moria/db/Query;Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "deleteAllOnRoomJsonException", "params", "deleteAll", "Lkotlin/Function0;", "autoRetry", "", "(Lcom/robinhood/android/moria/db/Query;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Z)Lio/reactivex/Observable;", "deleteAllOnRoomJsonExceptionFlow", "Lkotlin/coroutines/Continuation;", "autoRetryOnce", "(Lcom/robinhood/android/moria/db/Query;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/flow/Flow;", "lib-moria"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class QueryKt {
    public static final <P, T> Query<P, T> Query(final Function1<? super P, ? extends Observable<T>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new Query<P, T>() { // from class: com.robinhood.android.moria.db.QueryKt.Query.1
            @Override // com.robinhood.android.moria.p196db.Query
            public Observable<T> asObservable(P params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return function.invoke(params);
            }

            @Override // com.robinhood.android.moria.p196db.Query
            public Flow<T> asFlow(P params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return Context7.buffer$default(RxConvert.asFlow(asObservable(params)), Integer.MAX_VALUE, null, 2, null);
            }
        };
    }

    public static final <T> Observable<T> asObservable(Query<? super Unit, T> query) {
        Intrinsics.checkNotNullParameter(query, "<this>");
        return query.asObservable(Unit.INSTANCE);
    }

    public static final <P1, P2, R> Observable<R> asObservable(Query<? super Tuples2<? extends P1, ? extends P2>, R> query, P1 param1, P2 param2) {
        Intrinsics.checkNotNullParameter(query, "<this>");
        Intrinsics.checkNotNullParameter(param1, "param1");
        Intrinsics.checkNotNullParameter(param2, "param2");
        return query.asObservable(new Tuples2(param1, param2));
    }

    public static final <T> Flow<T> asFlow(Query<? super Unit, T> query) {
        Intrinsics.checkNotNullParameter(query, "<this>");
        return query.asFlow(Unit.INSTANCE);
    }

    public static final <P1, P2, R> Flow<R> asFlow(Query<? super Tuples2<? extends P1, ? extends P2>, R> query, P1 param1, P2 param2) {
        Intrinsics.checkNotNullParameter(query, "<this>");
        Intrinsics.checkNotNullParameter(param1, "param1");
        Intrinsics.checkNotNullParameter(param2, "param2");
        return query.asFlow(new Tuples2(param1, param2));
    }

    public static /* synthetic */ Observable deleteAllOnRoomJsonException$default(Query query, Object params, Function0 deleteAll, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        Intrinsics.checkNotNullParameter(query, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(deleteAll, "deleteAll");
        Observable observableOnErrorResumeNext = query.asObservable(params).onErrorResumeNext(new C222101(z, query, params, deleteAll));
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        return observableOnErrorResumeNext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static final /* synthetic */ <P, T> Observable<T> deleteAllOnRoomJsonException(Query<? super P, T> query, P params, Function0<Unit> deleteAll, boolean z) {
        Intrinsics.checkNotNullParameter(query, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(deleteAll, "deleteAll");
        Observable<T> observableOnErrorResumeNext = query.asObservable(params).onErrorResumeNext(new C222101(z, query, params, deleteAll));
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        return observableOnErrorResumeNext;
    }

    /* compiled from: Query.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.android.moria.db.QueryKt$deleteAllOnRoomJsonException$1 */
    public static final class C222101<T, R> implements Function {
        final /* synthetic */ boolean $autoRetry;
        final /* synthetic */ Function0<Unit> $deleteAll;
        final /* synthetic */ P $params;
        final /* synthetic */ Query<P, T> $this_deleteAllOnRoomJsonException;

        /* JADX WARN: Multi-variable type inference failed */
        public C222101(boolean z, Query<? super P, T> query, P p, Function0<Unit> function0) {
            this.$autoRetry = z;
            this.$this_deleteAllOnRoomJsonException = query;
            this.$params = p;
            this.$deleteAll = function0;
        }

        @Override // io.reactivex.functions.Function
        public final ObservableSource<? extends T> apply(Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            if (t instanceof JsonDataException) {
                final Function0<Unit> function0 = this.$deleteAll;
                Completable completableFromCallable = Completable.fromCallable(new Callable() { // from class: com.robinhood.android.moria.db.QueryKt$deleteAllOnRoomJsonException$1$completable$1
                    @Override // java.util.concurrent.Callable
                    public /* bridge */ /* synthetic */ Object call() {
                        call();
                        return Unit.INSTANCE;
                    }

                    @Override // java.util.concurrent.Callable
                    public final void call() {
                        function0.invoke();
                    }
                });
                Intrinsics.checkNotNullExpressionValue(completableFromCallable, "fromCallable(...)");
                if (this.$autoRetry) {
                    return completableFromCallable.andThen(this.$this_deleteAllOnRoomJsonException.asObservable(this.$params));
                }
                return completableFromCallable.toObservable();
            }
            return Observable.error(t);
        }
    }

    public static /* synthetic */ Flow deleteAllOnRoomJsonExceptionFlow$default(Query query, Object obj, Function1 function1, boolean z, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = true;
        }
        return deleteAllOnRoomJsonExceptionFlow(query, obj, function1, z);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Query.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/flow/FlowCollector;", "throwable", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moria.db.QueryKt$deleteAllOnRoomJsonExceptionFlow$1", m3645f = "Query.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moria.db.QueryKt$deleteAllOnRoomJsonExceptionFlow$1 */
    static final class C222111<T> extends ContinuationImpl7 implements Function3<FlowCollector<? super T>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $autoRetryOnce;
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $deleteAll;
        final /* synthetic */ P $params;
        final /* synthetic */ Query<P, T> $this_deleteAllOnRoomJsonExceptionFlow;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C222111(Function1<? super Continuation<? super Unit>, ? extends Object> function1, boolean z, Query<? super P, T> query, P p, Continuation<? super C222111> continuation) {
            super(3, continuation);
            this.$deleteAll = function1;
            this.$autoRetryOnce = z;
            this.$this_deleteAllOnRoomJsonExceptionFlow = query;
            this.$params = p;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C222111 c222111 = new C222111(this.$deleteAll, this.$autoRetryOnce, this.$this_deleteAllOnRoomJsonExceptionFlow, this.$params, continuation);
            c222111.L$0 = flowCollector;
            c222111.L$1 = th;
            return c222111.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r7, r6) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                Throwable th = (Throwable) this.L$1;
                if (th instanceof JsonDataException) {
                    Function1<Continuation<? super Unit>, Object> function1 = this.$deleteAll;
                    this.L$0 = flowCollector;
                    this.label = 1;
                    if (function1.invoke(this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                throw th;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (this.$autoRetryOnce) {
                Flow flowDeleteAllOnRoomJsonExceptionFlow = QueryKt.deleteAllOnRoomJsonExceptionFlow(this.$this_deleteAllOnRoomJsonExceptionFlow, this.$params, this.$deleteAll, false);
                this.L$0 = null;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <P, T> Flow<T> deleteAllOnRoomJsonExceptionFlow(Query<? super P, T> query, P params, Function1<? super Continuation<? super Unit>, ? extends Object> deleteAll, boolean z) {
        Intrinsics.checkNotNullParameter(query, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(deleteAll, "deleteAll");
        return FlowKt.m28818catch(query.asFlow(params), new C222111(deleteAll, z, query, params, null));
    }
}

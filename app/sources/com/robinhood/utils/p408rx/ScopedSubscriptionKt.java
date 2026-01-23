package com.robinhood.utils.p408rx;

import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.p408rx.error.RxErrorCheckpoint;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: ScopedSubscription.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00022)\b\u0004\u0010\u0003\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0004H\u0082\b\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r\u001a\"\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u0002\u001a6\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u00060\u0004\u001a\\\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\"\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00172\u0006\u0010\u0012\u001a\u00020\u0002\u001a6\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u00060\u0004\u001a\\\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\"\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00182\u0006\u0010\u0012\u001a\u00020\u0002\u001a6\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00182\u0006\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u00060\u0004\u001aL\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00182\u0006\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u0004\u001a\"\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u001a2\u0006\u0010\u0012\u001a\u00020\u0002\u001a6\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u001a2\u0006\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u00060\u0004\u001a\\\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u001a2\u0006\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0002\u001a \u0010\u000e\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a4\u0010\u000e\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006\u001c"}, m3636d2 = {"launchSubscription", "Lio/reactivex/disposables/Disposable;", "Lkotlinx/coroutines/CoroutineScope;", "subscribe", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "finally", "asDisposable", "Lkotlinx/coroutines/Job;", "message", "", "subscribeIn", "T", "", "Lio/reactivex/Observable;", "scope", "onNext", "onError", "", "onComplete", "Lio/reactivex/Flowable;", "Lio/reactivex/Single;", "onSuccess", "Lio/reactivex/Maybe;", "Lio/reactivex/Completable;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class ScopedSubscriptionKt {

    /* compiled from: ScopedSubscription.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.rx.ScopedSubscriptionKt$launchSubscription$1", m3645f = "ScopedSubscription.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.utils.rx.ScopedSubscriptionKt$launchSubscription$1 */
    /* loaded from: classes12.dex */
    public static final class C419891 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Function0<Unit>, Disposable> $subscribe;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C419891(Function1<? super Function0<Unit>, ? extends Disposable> function1, Continuation<? super C419891> continuation) {
            super(2, continuation);
            this.$subscribe = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C419891(this.$subscribe, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C419891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Function0<Unit>, Disposable> function1 = this.$subscribe;
                this.L$0 = function1;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                cancellableContinuationImpl.invokeOnCancellation(new ScopedSubscriptionKt$launchSubscription$1$1$1(function1.invoke(new ScopedSubscriptionKt$launchSubscription$1$1$disposable$1(cancellableContinuationImpl))));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbes.probeCoroutineSuspended(this);
                }
                if (result == coroutine_suspended) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            Function1<Function0<Unit>, Disposable> function1 = this.$subscribe;
            InlineMarker.mark(0);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            cancellableContinuationImpl.invokeOnCancellation(new ScopedSubscriptionKt$launchSubscription$1$1$1(function1.invoke(new ScopedSubscriptionKt$launchSubscription$1$1$disposable$1(cancellableContinuationImpl))));
            Unit unit = Unit.INSTANCE;
            if (cancellableContinuationImpl.getResult() == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(this);
            }
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    private static final Disposable launchSubscription(CoroutineScope coroutineScope, Function1<? super Function0<Unit>, ? extends Disposable> function1) {
        return asDisposable$default(BuildersKt__Builders_commonKt.launch$default(coroutineScope, new CoroutineName("Rx Subscription"), null, new C419891(function1, null), 2, null), null, 1, null);
    }

    public static final Disposable asDisposable(Job job, String message) {
        Intrinsics.checkNotNullParameter(job, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        return new JobDisposable(job, message);
    }

    public static /* synthetic */ Disposable asDisposable$default(Job job, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "Disposed";
        }
        return asDisposable(job, str);
    }

    public static final <T> Disposable subscribeIn(Observable<T> observable, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return subscribeIn(observable, scope, new Function1() { // from class: com.robinhood.utils.rx.ScopedSubscriptionKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScopedSubscriptionKt.subscribeIn$lambda$0(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeIn$lambda$0(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final <T> Disposable subscribeIn(Observable<T> observable, CoroutineScope scope, Function1<? super T, Unit> onNext) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        return subscribeIn$default(observable, scope, onNext, RxErrorCheckpoint.HANDLER_UNHANDLED, (Function0) null, 8, (Object) null);
    }

    public static /* synthetic */ Disposable subscribeIn$default(Observable observable, CoroutineScope coroutineScope, Function1 function1, Function1 function12, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function12 = RxErrorCheckpoint.HANDLER_UNHANDLED;
        }
        if ((i & 8) != 0) {
            function0 = new Function0() { // from class: com.robinhood.utils.rx.ScopedSubscriptionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return subscribeIn(observable, coroutineScope, function1, (Function1<? super Throwable, Unit>) function12, (Function0<Unit>) function0);
    }

    public static final <T> Disposable subscribeIn(Observable<T> observable, CoroutineScope scope, Function1<? super T, Unit> onNext, Function1<? super Throwable, Unit> onError, Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        return asDisposable$default(BuildersKt__Builders_commonKt.launch$default(scope, new CoroutineName("Rx Subscription"), null, new ScopedSubscriptionKt$subscribeIn$$inlined$launchSubscription$1(null, observable, onNext, new RxErrorCheckpoint(onError), onComplete), 2, null), null, 1, null);
    }

    public static final <T> Disposable subscribeIn(Flowable<T> flowable, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(flowable, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return subscribeIn(flowable, scope, new Function1() { // from class: com.robinhood.utils.rx.ScopedSubscriptionKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScopedSubscriptionKt.subscribeIn$lambda$3(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeIn$lambda$3(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final <T> Disposable subscribeIn(Flowable<T> flowable, CoroutineScope scope, Function1<? super T, Unit> onNext) {
        Intrinsics.checkNotNullParameter(flowable, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        return subscribeIn$default(flowable, scope, onNext, RxErrorCheckpoint.HANDLER_UNHANDLED, (Function0) null, 8, (Object) null);
    }

    public static /* synthetic */ Disposable subscribeIn$default(Flowable flowable, CoroutineScope coroutineScope, Function1 function1, Function1 function12, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function12 = RxErrorCheckpoint.HANDLER_UNHANDLED;
        }
        if ((i & 8) != 0) {
            function0 = new Function0() { // from class: com.robinhood.utils.rx.ScopedSubscriptionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return subscribeIn(flowable, coroutineScope, function1, (Function1<? super Throwable, Unit>) function12, (Function0<Unit>) function0);
    }

    public static final <T> Disposable subscribeIn(Flowable<T> flowable, CoroutineScope scope, Function1<? super T, Unit> onNext, Function1<? super Throwable, Unit> onError, Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(flowable, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        return asDisposable$default(BuildersKt__Builders_commonKt.launch$default(scope, new CoroutineName("Rx Subscription"), null, new ScopedSubscriptionKt$subscribeIn$$inlined$launchSubscription$2(null, flowable, onNext, new RxErrorCheckpoint(onError), onComplete), 2, null), null, 1, null);
    }

    public static final <T> Disposable subscribeIn(Single<T> single, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return subscribeIn(single, scope, new Function1() { // from class: com.robinhood.utils.rx.ScopedSubscriptionKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScopedSubscriptionKt.subscribeIn$lambda$6(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeIn$lambda$6(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final <T> Disposable subscribeIn(Single<T> single, CoroutineScope scope, Function1<? super T, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        return subscribeIn(single, scope, onSuccess, RxErrorCheckpoint.HANDLER_UNHANDLED);
    }

    public static /* synthetic */ Disposable subscribeIn$default(Single single, CoroutineScope coroutineScope, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 4) != 0) {
            function12 = RxErrorCheckpoint.HANDLER_UNHANDLED;
        }
        return subscribeIn(single, coroutineScope, function1, (Function1<? super Throwable, Unit>) function12);
    }

    public static final <T> Disposable subscribeIn(Single<T> single, CoroutineScope scope, Function1<? super T, Unit> onSuccess, Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return asDisposable$default(BuildersKt__Builders_commonKt.launch$default(scope, new CoroutineName("Rx Subscription"), null, new ScopedSubscriptionKt$subscribeIn$$inlined$launchSubscription$3(null, single, onSuccess, new RxErrorCheckpoint(onError)), 2, null), null, 1, null);
    }

    public static final <T> Disposable subscribeIn(Maybe<T> maybe, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(maybe, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return subscribeIn(maybe, scope, new Function1() { // from class: com.robinhood.utils.rx.ScopedSubscriptionKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScopedSubscriptionKt.subscribeIn$lambda$8(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeIn$lambda$8(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final <T> Disposable subscribeIn(Maybe<T> maybe, CoroutineScope scope, Function1<? super T, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(maybe, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        return subscribeIn$default(maybe, scope, onSuccess, RxErrorCheckpoint.HANDLER_UNHANDLED, (Function0) null, 8, (Object) null);
    }

    public static /* synthetic */ Disposable subscribeIn$default(Maybe maybe, CoroutineScope coroutineScope, Function1 function1, Function1 function12, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function12 = RxErrorCheckpoint.HANDLER_UNHANDLED;
        }
        if ((i & 8) != 0) {
            function0 = new Function0() { // from class: com.robinhood.utils.rx.ScopedSubscriptionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return subscribeIn(maybe, coroutineScope, function1, (Function1<? super Throwable, Unit>) function12, (Function0<Unit>) function0);
    }

    public static final <T> Disposable subscribeIn(Maybe<T> maybe, CoroutineScope scope, Function1<? super T, Unit> onSuccess, Function1<? super Throwable, Unit> onError, Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(maybe, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        return asDisposable$default(BuildersKt__Builders_commonKt.launch$default(scope, new CoroutineName("Rx Subscription"), null, new ScopedSubscriptionKt$subscribeIn$$inlined$launchSubscription$4(null, maybe, onSuccess, new RxErrorCheckpoint(onError), onComplete), 2, null), null, 1, null);
    }

    public static final Disposable subscribeIn(Completable completable, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return subscribeIn(completable, scope, (Function0<Unit>) new Function0() { // from class: com.robinhood.utils.rx.ScopedSubscriptionKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
    }

    public static final Disposable subscribeIn(Completable completable, CoroutineScope scope, Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        return subscribeIn(completable, scope, onComplete, RxErrorCheckpoint.HANDLER_UNHANDLED);
    }

    public static final Disposable subscribeIn(Completable completable, CoroutineScope scope, Function0<Unit> onComplete, Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return asDisposable$default(BuildersKt__Builders_commonKt.launch$default(scope, new CoroutineName("Rx Subscription"), null, new ScopedSubscriptionKt$subscribeIn$$inlined$launchSubscription$5(null, completable, onComplete, new RxErrorCheckpoint(onError)), 2, null), null, 1, null);
    }
}

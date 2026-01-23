package com.robinhood.android.lib.trade.submission;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.p408rx.Poll;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.robinhood.utils.p408rx.error.RxErrorCheckpoint;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: OrderSubmissionManager.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0001DB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012J\u001e\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u001a0\u0014J+\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00028\u00012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010 J\u0015\u0010!\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u0001H&¢\u0006\u0002\u0010\"J/\u0010#\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00028\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0002\u0010&J5\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150)0(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010%\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010+J7\u0010,\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00152\u0006\u0010%\u001a\u00028\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0002\u0010.J\u0018\u0010/\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u00100\u001a\u000201H\u0002J\u001b\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010%\u001a\u00028\u0000H\u0014¢\u0006\u0002\u00103J\u0015\u00104\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00028\u0001H&¢\u0006\u0002\u00105J\u0015\u00106\u001a\u00020\u00122\u0006\u0010%\u001a\u00028\u0000H&¢\u0006\u0002\u00105J\u001b\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000082\u0006\u0010\u001d\u001a\u00028\u0001H&¢\u0006\u0002\u00109J\u0015\u0010:\u001a\u00020\u00152\u0006\u0010;\u001a\u00028\u0000H&¢\u0006\u0002\u0010\"J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00028\u0000082\u0006\u0010=\u001a\u00020\u0012H&J\u0015\u0010>\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010?J\b\u0010@\u001a\u00020\u001cH\u0016J\u001f\u0010A\u001a\u00020\u001c2\u0006\u0010%\u001a\u00028\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010BJ\b\u0010C\u001a\u00020\u001cH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR4\u0010\n\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \r*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00150\u00150\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0016¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "DATA", "", "REQUEST", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "stateSubject", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result;", "kotlin.jvm.PlatformType", "submitting", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "lastSeenUuid", "Ljava/util/UUID;", "isSwipeAnimationRunningSubject", "Lio/reactivex/Observable;", "", "()Lio/reactivex/Observable;", "orderStateChanges", "uuid", "orderStateChangesAfterSwipeAnimation", "Lcom/robinhood/utils/Optional;", "submit", "", "request", "passthrough", "allowMultipleOrderSubmissionInParallel", "(Ljava/lang/Object;Ljava/lang/Object;Z)V", "getShouldTriggerConfirmationInstantly", "(Ljava/lang/Object;)Z", "startPolling", "shouldTriggerConfirmationInstantly", WebsocketGatewayConstants.DATA_KEY, "(Ljava/util/UUID;ZLjava/lang/Object;Ljava/lang/Object;)V", "publishPollingObservable", "Lio/reactivex/ObservableSource;", "Lkotlin/Pair;", "upstream", "(Lio/reactivex/Observable;Ljava/lang/Object;)Lio/reactivex/ObservableSource;", "notifyUpdate", "isLast", "(Ljava/util/UUID;ZZLjava/lang/Object;Ljava/lang/Object;)V", "notifyError", "throwable", "", "getPollingObservable", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "getUuid", "(Ljava/lang/Object;)Ljava/util/UUID;", "getId", "getSubmissionObservable", "Lio/reactivex/Single;", "(Ljava/lang/Object;)Lio/reactivex/Single;", "isFinal", Card.Icon.ORDER, "fetchOrder", "orderId", "onSubmitting", "(Ljava/lang/Object;)V", "onSubmitted", "onUpdate", "(Ljava/lang/Object;Ljava/lang/Object;)V", "onError", "Result", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public abstract class OrderSubmissionManager<DATA, REQUEST> {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private final Observable<Boolean> isSwipeAnimationRunningSubject;
    private UUID lastSeenUuid;
    private final Object lock;
    private final BehaviorRelay<Result<DATA, REQUEST>> stateSubject;
    private final AtomicBoolean submitting;

    public abstract Single<DATA> fetchOrder(UUID orderId);

    public abstract UUID getId(DATA data);

    public abstract boolean getShouldTriggerConfirmationInstantly(REQUEST request);

    public abstract Single<DATA> getSubmissionObservable(REQUEST request);

    public abstract UUID getUuid(REQUEST request);

    public abstract boolean isFinal(DATA order);

    public void onError() {
    }

    public void onSubmitted() {
    }

    public void onSubmitting(REQUEST request) {
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void onUpdate(DATA data, Object passthrough) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @JvmOverloads
    public final void submit(REQUEST request) {
        Intrinsics.checkNotNullParameter(request, "request");
        submit$default(this, request, null, false, 6, null);
    }

    @JvmOverloads
    public final void submit(REQUEST request, Object obj) {
        Intrinsics.checkNotNullParameter(request, "request");
        submit$default(this, request, obj, false, 4, null);
    }

    public OrderSubmissionManager(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        BehaviorRelay<Result<DATA, REQUEST>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.stateSubject = behaviorRelayCreate;
        this.submitting = new AtomicBoolean(false);
        this.lock = new Object();
        Observable<Boolean> observableJust = Observable.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        this.isSwipeAnimationRunningSubject = observableJust;
    }

    protected final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public Observable<Boolean> isSwipeAnimationRunningSubject() {
        return this.isSwipeAnimationRunningSubject;
    }

    public static /* synthetic */ Observable orderStateChanges$default(OrderSubmissionManager orderSubmissionManager, UUID uuid, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: orderStateChanges");
        }
        if ((i & 1) != 0) {
            uuid = null;
        }
        return orderSubmissionManager.orderStateChanges(uuid);
    }

    public final Observable<Result<DATA, REQUEST>> orderStateChanges(final UUID uuid) {
        if (uuid != null) {
            Observable<Result<DATA, REQUEST>> observableFilter = this.stateSubject.filter(new Predicate() { // from class: com.robinhood.android.lib.trade.submission.OrderSubmissionManager.orderStateChanges.1
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Result<? extends DATA, ? extends REQUEST> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Intrinsics.areEqual(it.getUuid(), uuid);
                }
            });
            Intrinsics.checkNotNull(observableFilter);
            return observableFilter;
        }
        return this.stateSubject;
    }

    public final Observable<Optional<Result<DATA, REQUEST>>> orderStateChangesAfterSwipeAnimation() {
        Observable<Optional<Result<DATA, REQUEST>>> observableCombineLatest = Observable.combineLatest(isSwipeAnimationRunningSubject(), orderStateChanges$default(this, null, 1, null), new BiFunction() { // from class: com.robinhood.android.lib.trade.submission.OrderSubmissionManager.orderStateChangesAfterSwipeAnimation.1
            @Override // io.reactivex.functions.BiFunction
            public final Optional<Result<DATA, REQUEST>> apply(Boolean isSwipeAnimationRunning, Result<? extends DATA, ? extends REQUEST> state) {
                Intrinsics.checkNotNullParameter(isSwipeAnimationRunning, "isSwipeAnimationRunning");
                Intrinsics.checkNotNullParameter(state, "state");
                return isSwipeAnimationRunning.booleanValue() ? Optional2.INSTANCE : Optional3.asOptional(state);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        return observableCombineLatest;
    }

    public static /* synthetic */ void submit$default(OrderSubmissionManager orderSubmissionManager, Object obj, Object obj2, boolean z, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submit");
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        orderSubmissionManager.submit(obj, obj2, z);
    }

    @JvmOverloads
    public final void submit(REQUEST request, final Object passthrough, boolean allowMultipleOrderSubmissionInParallel) {
        Intrinsics.checkNotNullParameter(request, "request");
        synchronized (this.lock) {
            try {
                final UUID uuid = getUuid(request);
                if (Intrinsics.areEqual(uuid, this.lastSeenUuid)) {
                    throw new OrderSubmissionManager3("Duplicate uuids detected!");
                }
                if (!this.submitting.compareAndSet(false, true) && !allowMultipleOrderSubmissionInParallel) {
                    throw new OrderSubmissionManager2("Already submitting an order!");
                }
                onSubmitting(request);
                Timber.INSTANCE.mo3350d("Submitting " + request, new Object[0]);
                this.lastSeenUuid = uuid;
                this.stateSubject.accept(new Result.Sending(uuid, request));
                final boolean shouldTriggerConfirmationInstantly = getShouldTriggerConfirmationInstantly(request);
                Single singleDoAfterTerminate = SinglesKt.recoverFromRefIdConflict(getSubmissionObservable(request), new OrderSubmissionManager4(this)).doAfterTerminate(new Action(this) { // from class: com.robinhood.android.lib.trade.submission.OrderSubmissionManager$submit$1$2
                    final /* synthetic */ OrderSubmissionManager<DATA, REQUEST> this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        ((OrderSubmissionManager) this.this$0).submitting.set(false);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(singleDoAfterTerminate, "doAfterTerminate(...)");
                ScopedSubscriptionKt.subscribeIn(singleDoAfterTerminate, this.coroutineScope, new Function1() { // from class: com.robinhood.android.lib.trade.submission.OrderSubmissionManager$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OrderSubmissionManager.submit$lambda$2$lambda$0(this.f$0, uuid, shouldTriggerConfirmationInstantly, passthrough, obj);
                    }
                }, (Function1<? super Throwable, Unit>) new Function1() { // from class: com.robinhood.android.lib.trade.submission.OrderSubmissionManager$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OrderSubmissionManager.submit$lambda$2$lambda$1(this.f$0, uuid, (Throwable) obj);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submit$lambda$2$lambda$0(OrderSubmissionManager orderSubmissionManager, UUID uuid, boolean z, Object obj, Object obj2) {
        Intrinsics.checkNotNull(obj2);
        orderSubmissionManager.startPolling(uuid, z, obj2, obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submit$lambda$2$lambda$1(OrderSubmissionManager orderSubmissionManager, UUID uuid, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        orderSubmissionManager.notifyError(uuid, it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startPolling(final UUID uuid, final boolean shouldTriggerConfirmationInstantly, final DATA data, final Object passthrough) {
        onSubmitted();
        this.stateSubject.accept(new Result.Submitted(uuid, shouldTriggerConfirmationInstantly, false, data, passthrough));
        Observable<R> observablePublish = getPollingObservable(data).publish(new Function(this) { // from class: com.robinhood.android.lib.trade.submission.OrderSubmissionManager.startPolling.1
            final /* synthetic */ OrderSubmissionManager<DATA, REQUEST> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<Tuples2<DATA, Boolean>> apply(Observable<DATA> upstream) {
                Intrinsics.checkNotNullParameter(upstream, "upstream");
                return this.this$0.publishPollingObservable(upstream, data);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observablePublish, "publish(...)");
        ScopedSubscriptionKt.subscribeIn$default(observablePublish, this.coroutineScope, new Function1() { // from class: com.robinhood.android.lib.trade.submission.OrderSubmissionManager$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderSubmissionManager.startPolling$lambda$3(this.f$0, uuid, shouldTriggerConfirmationInstantly, passthrough, (Tuples2) obj);
            }
        }, new RxErrorCheckpoint(null, 1, 0 == true ? 1 : 0), (Function0) null, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startPolling$lambda$3(OrderSubmissionManager orderSubmissionManager, UUID uuid, boolean z, Object obj, Tuples2 tuples2) {
        orderSubmissionManager.notifyUpdate(uuid, z, ((Boolean) tuples2.component2()).booleanValue(), tuples2.component1(), obj);
        return Unit.INSTANCE;
    }

    protected ObservableSource<Tuples2<DATA, Boolean>> publishPollingObservable(Observable<DATA> upstream, DATA data) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(data, "data");
        Observable observableMergeWith = upstream.skipLast(1).map(new Function() { // from class: com.robinhood.android.lib.trade.submission.OrderSubmissionManager.publishPollingObservable.1
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C206551<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final Tuples2<DATA, Boolean> apply(DATA it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Tuples4.m3642to(it, Boolean.FALSE);
            }
        }).mergeWith((SingleSource<? extends R>) upstream.last(data).map(new Function() { // from class: com.robinhood.android.lib.trade.submission.OrderSubmissionManager.publishPollingObservable.2
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C206562<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final Tuples2<DATA, Boolean> apply(DATA it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Tuples4.m3642to(it, Boolean.TRUE);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(observableMergeWith, "mergeWith(...)");
        return observableMergeWith;
    }

    private final void notifyUpdate(UUID uuid, boolean shouldTriggerConfirmationInstantly, boolean isLast, DATA data, Object passthrough) {
        this.stateSubject.accept(new Result.Submitted(uuid, !shouldTriggerConfirmationInstantly && isLast, shouldTriggerConfirmationInstantly, data, passthrough));
        onUpdate(data, passthrough);
    }

    private final void notifyError(UUID uuid, Throwable throwable) {
        this.stateSubject.accept(new Result.Failure(uuid, throwable));
        this.lastSeenUuid = null;
        onError();
    }

    protected Observable<DATA> getPollingObservable(DATA data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Single<DATA> singleFetchOrder = fetchOrder(getId(data));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Observable<DATA> observable = singleFetchOrder.toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable<R> observableCompose = observable.compose(new Poll(1L, timeUnit, false));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        Observable<DATA> observableOnErrorResumeNext = observableCompose.take(5L, timeUnit).takeUntil(new Predicate(this) { // from class: com.robinhood.android.lib.trade.submission.OrderSubmissionManager.getPollingObservable.1
            final /* synthetic */ OrderSubmissionManager<DATA, REQUEST> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Predicate
            public final boolean test(DATA it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.isFinal(it);
            }
        }).onErrorResumeNext(Observable.empty());
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        return observableOnErrorResumeNext;
    }

    /* compiled from: OrderSubmissionManager.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\n\b\u0002\u0010\u0001 \u0001*\u00020\u0002*\n\b\u0003\u0010\u0003 \u0001*\u00020\u00022\u00020\u0002:\u0003\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result;", "DATA", "", "REQUEST", "<init>", "()V", "uuid", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "finished", "", "getFinished", "()Z", "Sending", "Submitted", "Failure", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Failure;", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Sending;", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Submitted;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Result<DATA, REQUEST> {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract UUID getUuid();

        private Result() {
        }

        public final boolean getFinished() {
            if ((this instanceof Failure) || (this instanceof Submitted)) {
                return true;
            }
            if (this instanceof Sending) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* compiled from: OrderSubmissionManager.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\n\b\u0004\u0010\u0001 \u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0004¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\u000e\u0010\u0010\u001a\u00028\u0004HÆ\u0003¢\u0006\u0002\u0010\rJ(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00040\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u0004HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u00028\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Sending;", "REQUEST", "", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result;", "", "uuid", "Ljava/util/UUID;", "request", "<init>", "(Ljava/util/UUID;Ljava/lang/Object;)V", "getUuid", "()Ljava/util/UUID;", "getRequest", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/util/UUID;Ljava/lang/Object;)Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Sending;", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Sending<REQUEST> extends Result {
            public static final int $stable = 8;
            private final REQUEST request;
            private final UUID uuid;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Sending copy$default(Sending sending, UUID uuid, Object obj, int i, Object obj2) {
                if ((i & 1) != 0) {
                    uuid = sending.uuid;
                }
                if ((i & 2) != 0) {
                    obj = sending.request;
                }
                return sending.copy(uuid, obj);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getUuid() {
                return this.uuid;
            }

            public final REQUEST component2() {
                return this.request;
            }

            public final Sending<REQUEST> copy(UUID uuid, REQUEST request) {
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                Intrinsics.checkNotNullParameter(request, "request");
                return new Sending<>(uuid, request);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Sending)) {
                    return false;
                }
                Sending sending = (Sending) other;
                return Intrinsics.areEqual(this.uuid, sending.uuid) && Intrinsics.areEqual(this.request, sending.request);
            }

            public int hashCode() {
                return (this.uuid.hashCode() * 31) + this.request.hashCode();
            }

            public String toString() {
                return "Sending(uuid=" + this.uuid + ", request=" + this.request + ")";
            }

            @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager.Result
            public UUID getUuid() {
                return this.uuid;
            }

            public final REQUEST getRequest() {
                return this.request;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Sending(UUID uuid, REQUEST request) {
                super(null);
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                Intrinsics.checkNotNullParameter(request, "request");
                this.uuid = uuid;
                this.request = request;
            }
        }

        /* compiled from: OrderSubmissionManager.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\n\b\u0004\u0010\u0001 \u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00028\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000e\u0010\u001a\u001a\u00028\u0004HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003JH\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00040\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00028\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\n\u001a\u00028\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Submitted;", "DATA", "", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result;", "", "uuid", "Ljava/util/UUID;", "triggersConfirmation", "", "hasTriggeredConfirmation", WebsocketGatewayConstants.DATA_KEY, "passthrough", "<init>", "(Ljava/util/UUID;ZZLjava/lang/Object;Ljava/lang/Object;)V", "getUuid", "()Ljava/util/UUID;", "getTriggersConfirmation", "()Z", "getHasTriggeredConfirmation", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getPassthrough", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/UUID;ZZLjava/lang/Object;Ljava/lang/Object;)Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Submitted;", "equals", "other", "hashCode", "", "toString", "", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Submitted<DATA> extends Result {
            public static final int $stable = 8;
            private final DATA data;
            private final boolean hasTriggeredConfirmation;
            private final Object passthrough;
            private final boolean triggersConfirmation;
            private final UUID uuid;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Submitted copy$default(Submitted submitted, UUID uuid, boolean z, boolean z2, Object obj, Object obj2, int i, Object obj3) {
                if ((i & 1) != 0) {
                    uuid = submitted.uuid;
                }
                if ((i & 2) != 0) {
                    z = submitted.triggersConfirmation;
                }
                if ((i & 4) != 0) {
                    z2 = submitted.hasTriggeredConfirmation;
                }
                DATA data = obj;
                if ((i & 8) != 0) {
                    data = submitted.data;
                }
                if ((i & 16) != 0) {
                    obj2 = submitted.passthrough;
                }
                Object obj4 = obj2;
                boolean z3 = z2;
                return submitted.copy(uuid, z, z3, data, obj4);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getUuid() {
                return this.uuid;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getTriggersConfirmation() {
                return this.triggersConfirmation;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getHasTriggeredConfirmation() {
                return this.hasTriggeredConfirmation;
            }

            public final DATA component4() {
                return this.data;
            }

            /* renamed from: component5, reason: from getter */
            public final Object getPassthrough() {
                return this.passthrough;
            }

            public final Submitted<DATA> copy(UUID uuid, boolean triggersConfirmation, boolean hasTriggeredConfirmation, DATA data, Object passthrough) {
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                Intrinsics.checkNotNullParameter(data, "data");
                return new Submitted<>(uuid, triggersConfirmation, hasTriggeredConfirmation, data, passthrough);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Submitted)) {
                    return false;
                }
                Submitted submitted = (Submitted) other;
                return Intrinsics.areEqual(this.uuid, submitted.uuid) && this.triggersConfirmation == submitted.triggersConfirmation && this.hasTriggeredConfirmation == submitted.hasTriggeredConfirmation && Intrinsics.areEqual(this.data, submitted.data) && Intrinsics.areEqual(this.passthrough, submitted.passthrough);
            }

            public int hashCode() {
                int iHashCode = ((((((this.uuid.hashCode() * 31) + Boolean.hashCode(this.triggersConfirmation)) * 31) + Boolean.hashCode(this.hasTriggeredConfirmation)) * 31) + this.data.hashCode()) * 31;
                Object obj = this.passthrough;
                return iHashCode + (obj == null ? 0 : obj.hashCode());
            }

            public String toString() {
                return "Submitted(uuid=" + this.uuid + ", triggersConfirmation=" + this.triggersConfirmation + ", hasTriggeredConfirmation=" + this.hasTriggeredConfirmation + ", data=" + this.data + ", passthrough=" + this.passthrough + ")";
            }

            @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager.Result
            public UUID getUuid() {
                return this.uuid;
            }

            public final boolean getTriggersConfirmation() {
                return this.triggersConfirmation;
            }

            public final boolean getHasTriggeredConfirmation() {
                return this.hasTriggeredConfirmation;
            }

            public final DATA getData() {
                return this.data;
            }

            public final Object getPassthrough() {
                return this.passthrough;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Submitted(UUID uuid, boolean z, boolean z2, DATA data, Object obj) {
                super(null);
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                Intrinsics.checkNotNullParameter(data, "data");
                this.uuid = uuid;
                this.triggersConfirmation = z;
                this.hasTriggeredConfirmation = z2;
                this.data = data;
                this.passthrough = obj;
            }
        }

        /* compiled from: OrderSubmissionManager.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Failure;", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result;", "", "uuid", "Ljava/util/UUID;", "throwable", "", "<init>", "(Ljava/util/UUID;Ljava/lang/Throwable;)V", "getUuid", "()Ljava/util/UUID;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Failure extends Result {
            public static final int $stable = 8;
            private final Throwable throwable;
            private final UUID uuid;

            public static /* synthetic */ Failure copy$default(Failure failure, UUID uuid, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = failure.uuid;
                }
                if ((i & 2) != 0) {
                    th = failure.throwable;
                }
                return failure.copy(uuid, th);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getUuid() {
                return this.uuid;
            }

            /* renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Failure copy(UUID uuid, Throwable throwable) {
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new Failure(uuid, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) other;
                return Intrinsics.areEqual(this.uuid, failure.uuid) && Intrinsics.areEqual(this.throwable, failure.throwable);
            }

            public int hashCode() {
                return (this.uuid.hashCode() * 31) + this.throwable.hashCode();
            }

            public String toString() {
                return "Failure(uuid=" + this.uuid + ", throwable=" + this.throwable + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(UUID uuid, Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.uuid = uuid;
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            @Override // com.robinhood.android.lib.trade.submission.OrderSubmissionManager.Result
            public UUID getUuid() {
                return this.uuid;
            }
        }
    }
}

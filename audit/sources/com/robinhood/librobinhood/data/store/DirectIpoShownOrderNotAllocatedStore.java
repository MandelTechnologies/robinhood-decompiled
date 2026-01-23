package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.robinhood.directipo.models.p292db.DirectIpoShownOrderNotAllocated;
import com.robinhood.models.api.ApiOrder;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.DirectIpoShownOrderNotAllocatedDao;
import com.robinhood.models.p320db.Order;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.LocalDateTime;
import timber.log.Timber;

/* compiled from: DirectIpoShownOrderNotAllocatedStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DirectIpoShownOrderNotAllocatedStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/DirectIpoShownOrderNotAllocatedDao;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/DirectIpoShownOrderNotAllocatedDao;)V", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/directipo/models/db/DirectIpoShownOrderNotAllocated;", "", "add", "orderId", "Ljava/util/UUID;", "getShouldShowExplanation", "Lio/reactivex/Observable;", "", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "Companion", "lib-store-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class DirectIpoShownOrderNotAllocatedStore extends Store {
    public static final long MAX_DAYS_AFTER_IPO_DISPLAY_EXPLANATION = 30;
    private final DirectIpoShownOrderNotAllocatedDao dao;
    private final Function1<DirectIpoShownOrderNotAllocated, Unit> saveAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectIpoShownOrderNotAllocatedStore(StoreBundle storeBundle, DirectIpoShownOrderNotAllocatedDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<DirectIpoShownOrderNotAllocated, Unit>() { // from class: com.robinhood.librobinhood.data.store.DirectIpoShownOrderNotAllocatedStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DirectIpoShownOrderNotAllocated directIpoShownOrderNotAllocated) {
                m22639invoke(directIpoShownOrderNotAllocated);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22639invoke(DirectIpoShownOrderNotAllocated directIpoShownOrderNotAllocated) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        this.dao.insert((DirectIpoShownOrderNotAllocatedDao) directIpoShownOrderNotAllocated);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
    }

    public final void add(final UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Observable observableSubscribeOn = Observable.fromCallable(new Callable() { // from class: com.robinhood.librobinhood.data.store.DirectIpoShownOrderNotAllocatedStore.add.1
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Object call() {
                call();
                return Unit.INSTANCE;
            }

            @Override // java.util.concurrent.Callable
            public final void call() {
                DirectIpoShownOrderNotAllocatedStore.this.saveAction.invoke(new DirectIpoShownOrderNotAllocated(orderId));
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        ScopedSubscriptionKt.subscribeIn(observableSubscribeOn, getStoreScope());
    }

    public final Observable<Boolean> getShouldShowExplanation(Order order) {
        Intrinsics.checkNotNullParameter(order, "order");
        LocalDateTime localDateTimeMinusDays = LocalDateTime.now().minusDays(30L);
        ApiOrder.IpoAccessCancellationReason ipoAccessCancellationReason = order.getIpoAccessCancellationReason();
        if (ipoAccessCancellationReason != null && ipoAccessCancellationReason.getShouldShowExplanation() && localDateTimeMinusDays.isBefore(Instants.toLocalDateTime$default(order.getUpdatedAt(), null, 1, null))) {
            final Flow flowFilterNotNull = FlowKt.filterNotNull(this.dao.getHasShownExplanationBefore(order.getId()));
            return asObservable(takeWhileLoggedIn(new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.DirectIpoShownOrderNotAllocatedStore$getShouldShowExplanation$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.DirectIpoShownOrderNotAllocatedStore$getShouldShowExplanation$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DirectIpoShownOrderNotAllocatedStore$getShouldShowExplanation$$inlined$map$1$2", m3645f = "DirectIpoShownOrderNotAllocatedStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.DirectIpoShownOrderNotAllocatedStore$getShouldShowExplanation$$inlined$map$1$2$1, reason: invalid class name */
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
                            Boolean boolBoxBoolean = boxing.boxBoolean(!((Boolean) obj).booleanValue());
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                    Object objCollect = flowFilterNotNull.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }));
        }
        Observable<Boolean> observableJust = Observable.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }
}

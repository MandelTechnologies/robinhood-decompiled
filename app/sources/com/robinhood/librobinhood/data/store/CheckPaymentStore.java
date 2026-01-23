package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.minerva.ApiCheckPaymentDetails;
import com.robinhood.models.dao.CheckPaymentDao;
import com.robinhood.models.p320db.mcduckling.CheckPayeeDetails;
import com.robinhood.models.p320db.mcduckling.p321ui.UiCheckPaymentDetails;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.CheckPaymentTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Completable;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: CheckPaymentStore.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00172\u0006\u0010\u0018\u001a\u00020\fJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u0018\u001a\u00020\fJ\u000e\u0010\n\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0014R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CheckPaymentStore;", "Lcom/robinhood/store/Store;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "checkPaymentDao", "Lcom/robinhood/models/dao/CheckPaymentDao;", "<init>", "(Lcom/robinhood/api/retrofit/Minerva;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/CheckPaymentDao;)V", "cancelCheck", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/minerva/ApiCheckPaymentDetails;", "getCheckDetails", "Lcom/robinhood/android/moria/network/Endpoint;", "streamCheckDetails", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/mcduckling/ui/UiCheckPaymentDetails;", "getStreamCheckDetails$annotations", "()V", "streamCheckDetailsWithLongerInterval", "getStreamCheckDetailsWithLongerInterval$annotations", "Lio/reactivex/Observable;", "checkId", "getCheckDetailsForHistoryItem", "Lkotlinx/coroutines/flow/Flow;", "Lio/reactivex/Completable;", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-store-cash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CheckPaymentStore extends Store {
    private final PostEndpoint<UUID, ApiCheckPaymentDetails> cancelCheck;
    private final CheckPaymentDao checkPaymentDao;
    private final Endpoint<UUID, ApiCheckPaymentDetails> getCheckDetails;
    private final Minerva minerva;
    private final Query<UUID, UiCheckPaymentDetails> streamCheckDetails;
    private final Query<UUID, UiCheckPaymentDetails> streamCheckDetailsWithLongerInterval;
    private final HistoryTransactionLoader transactionLoader;

    private static /* synthetic */ void getStreamCheckDetails$annotations() {
    }

    private static /* synthetic */ void getStreamCheckDetailsWithLongerInterval$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPaymentStore(Minerva minerva, StoreBundle storeBundle, CheckPaymentDao checkPaymentDao) {
        super(storeBundle, CheckPayeeDetails.INSTANCE);
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(checkPaymentDao, "checkPaymentDao");
        this.minerva = minerva;
        this.checkPaymentDao = checkPaymentDao;
        this.cancelCheck = PostEndpoint.INSTANCE.create(new C336431(minerva), new C336442(null));
        this.getCheckDetails = Endpoint.Companion.create$default(Endpoint.INSTANCE, new C336461(null), getLogoutKillswitch(), new C336472(null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion = Query.INSTANCE;
        this.streamCheckDetails = Store.create$default(this, companion, CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.CheckPaymentStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckPaymentStore.streamCheckDetails$lambda$0(this.f$0, (UUID) obj);
            }
        })), new CheckPaymentStore2(checkPaymentDao), false, 4, null);
        this.streamCheckDetailsWithLongerInterval = Store.create$default(this, companion, CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.CheckPaymentStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckPaymentStore.streamCheckDetailsWithLongerInterval$lambda$1(this.f$0, (UUID) obj);
            }
        })), new CheckPaymentStore3(checkPaymentDao), false, 4, null);
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.CheckPaymentStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                throw new IllegalStateException("Check payment transactions require the event to be loaded");
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(final HistoryEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                TransactionReference transactionReference = event.getTransactionReference();
                HistoryTransactionLoader3.validateEquals(transactionReference.getSourceType(), HistoryTransactionType.CHECK_PAYMENT);
                final Flow<UiCheckPaymentDetails> checkDetailsForHistoryItem = this.this$0.getCheckDetailsForHistoryItem(transactionReference.getSourceId());
                return new Flow<CheckPaymentTransaction>() { // from class: com.robinhood.librobinhood.data.store.CheckPaymentStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.CheckPaymentStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C336422<T> implements FlowCollector {
                        final /* synthetic */ HistoryEvent $event$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CheckPaymentStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "CheckPaymentStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.CheckPaymentStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C336422.this.emit(null, this);
                            }
                        }

                        public C336422(FlowCollector flowCollector, HistoryEvent historyEvent) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$event$inlined = historyEvent;
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
                                CheckPaymentTransaction checkPaymentTransaction = new CheckPaymentTransaction(this.$event$inlined, (UiCheckPaymentDetails) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(checkPaymentTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super CheckPaymentTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = checkDetailsForHistoryItem.collect(new C336422(flowCollector, event), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
    }

    /* compiled from: CheckPaymentStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.CheckPaymentStore$cancelCheck$1 */
    /* synthetic */ class C336431 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiCheckPaymentDetails>, Object>, ContinuationImpl6 {
        C336431(Object obj) {
            super(2, obj, Minerva.class, "cancelCheck", "cancelCheck(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super ApiCheckPaymentDetails> continuation) {
            return ((Minerva) this.receiver).cancelCheck(uuid, continuation);
        }
    }

    /* compiled from: CheckPaymentStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/minerva/ApiCheckPaymentDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CheckPaymentStore$cancelCheck$2", m3645f = "CheckPaymentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CheckPaymentStore$cancelCheck$2 */
    static final class C336442 extends ContinuationImpl7 implements Function2<ApiCheckPaymentDetails, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C336442(Continuation<? super C336442> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C336442 c336442 = CheckPaymentStore.this.new C336442(continuation);
            c336442.L$0 = obj;
            return c336442;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiCheckPaymentDetails apiCheckPaymentDetails, Continuation<? super Unit> continuation) {
            return ((C336442) create(apiCheckPaymentDetails, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CheckPaymentStore.this.checkPaymentDao.insertCheckPaymentDetails((ApiCheckPaymentDetails) this.L$0);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CheckPaymentStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/minerva/ApiCheckPaymentDetails;", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CheckPaymentStore$getCheckDetails$1", m3645f = "CheckPaymentStore.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CheckPaymentStore$getCheckDetails$1 */
    static final class C336461 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiCheckPaymentDetails>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C336461(Continuation<? super C336461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C336461 c336461 = CheckPaymentStore.this.new C336461(continuation);
            c336461.L$0 = obj;
            return c336461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super ApiCheckPaymentDetails> continuation) {
            return ((C336461) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
            UUID uuid = (UUID) this.L$0;
            Minerva minerva = CheckPaymentStore.this.minerva;
            this.label = 1;
            Object checkDetails = minerva.getCheckDetails(uuid, this);
            return checkDetails == coroutine_suspended ? coroutine_suspended : checkDetails;
        }
    }

    /* compiled from: CheckPaymentStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/minerva/ApiCheckPaymentDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CheckPaymentStore$getCheckDetails$2", m3645f = "CheckPaymentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CheckPaymentStore$getCheckDetails$2 */
    static final class C336472 extends ContinuationImpl7 implements Function2<ApiCheckPaymentDetails, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C336472(Continuation<? super C336472> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C336472 c336472 = CheckPaymentStore.this.new C336472(continuation);
            c336472.L$0 = obj;
            return c336472;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiCheckPaymentDetails apiCheckPaymentDetails, Continuation<? super Unit> continuation) {
            return ((C336472) create(apiCheckPaymentDetails, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CheckPaymentStore.this.checkPaymentDao.insertCheckPaymentDetails((ApiCheckPaymentDetails) this.L$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamCheckDetails$lambda$0(CheckPaymentStore checkPaymentStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(checkPaymentStore.getCheckDetails, it, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamCheckDetailsWithLongerInterval$lambda$1(CheckPaymentStore checkPaymentStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<UUID, ApiCheckPaymentDetails> endpoint = checkPaymentStore.getCheckDetails;
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, it, durationOfSeconds, null, 4, null);
    }

    public final Observable<? extends UiCheckPaymentDetails> getCheckDetails(UUID checkId) {
        Intrinsics.checkNotNullParameter(checkId, "checkId");
        Observable<UiCheckPaymentDetails> observableDistinctUntilChanged = this.streamCheckDetails.asObservable(checkId).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public final Flow<UiCheckPaymentDetails> getCheckDetailsForHistoryItem(UUID checkId) {
        Intrinsics.checkNotNullParameter(checkId, "checkId");
        return FlowKt.distinctUntilChanged(this.streamCheckDetailsWithLongerInterval.asFlow(checkId));
    }

    /* compiled from: CheckPaymentStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CheckPaymentStore$cancelCheck$3", m3645f = "CheckPaymentStore.kt", m3646l = {80}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CheckPaymentStore$cancelCheck$3 */
    static final class C336453 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $checkId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C336453(UUID uuid, Continuation<? super C336453> continuation) {
            super(2, continuation);
            this.$checkId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CheckPaymentStore.this.new C336453(this.$checkId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C336453) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = CheckPaymentStore.this.cancelCheck;
                UUID uuid = this.$checkId;
                this.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, uuid, null, this, 2, null) == coroutine_suspended) {
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

    public final Completable cancelCheck(UUID checkId) {
        Intrinsics.checkNotNullParameter(checkId, "checkId");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C336453(checkId, null), 1, null);
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }
}

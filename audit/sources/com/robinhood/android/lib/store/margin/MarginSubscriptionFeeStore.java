package com.robinhood.android.lib.store.margin;

import androidx.room.RoomDatabase;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiMarginSubscriptionFee;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.dao.MarginSubscriptionFeeDao;
import com.robinhood.models.p320db.MarginSubscriptionFee;
import com.robinhood.models.p320db.MarginSubscriptionFeeRefund;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MarginSubscriptionFeeRefundTransaction;
import com.robinhood.shared.models.history.MarginSubscriptionFeeTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Single;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import timber.log.Timber;

/* compiled from: MarginSubscriptionFeeStore.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0016\"\u0004\b\u0000\u0010\u0017*\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u0002H\u00172\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u00160\u001eH\u0002¢\u0006\u0002\u0010\u001fJ\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00162\u0006\u0010&\u001a\u00020'J\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u00162\u0006\u0010.\u001a\u00020'J\u000e\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u000201R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010(\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0014R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020+0!¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/lib/store/margin/MarginSubscriptionFeeStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/MarginSubscriptionFeeDao;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/MarginSubscriptionFeeDao;)V", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiMarginSubscriptionFee;", "", "feesTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getFeesTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "flowIfNotManaged", "Lkotlinx/coroutines/flow/Flow;", "T", "Lcom/robinhood/shared/history/HistoryLoader$Filter;", "supportedBrokerageAccountTypes", "", "Lcom/robinhood/models/api/BrokerageAccountType;", "defaultValue", "block", "Lkotlin/Function0;", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;Ljava/util/Set;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;", "feesHistoryLoaderCallback", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/models/db/MarginSubscriptionFee;", "getFeesHistoryLoaderCallback", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getMarginSubscriptionFee", "subscriptionFeeId", "Ljava/util/UUID;", "refundsTransactionLoader", "getRefundsTransactionLoader", "refundsHistoryLoaderCallback", "Lcom/robinhood/models/db/MarginSubscriptionFeeRefund;", "getRefundsHistoryLoaderCallback", "getMarginSubscriptionFeeRefund", "id", "refresh", "force", "", "lib-store-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginSubscriptionFeeStore extends Store {
    private final AccountProvider accountProvider;
    private final Brokeback brokeback;
    private final MarginSubscriptionFeeDao dao;
    private final HistoryLoader.Callbacks<MarginSubscriptionFee> feesHistoryLoaderCallback;
    private final HistoryTransactionLoader feesTransactionLoader;
    private final HistoryLoader.Callbacks<MarginSubscriptionFeeRefund> refundsHistoryLoaderCallback;
    private final HistoryTransactionLoader refundsTransactionLoader;
    private final Function1<PaginatedResult<ApiMarginSubscriptionFee>, Unit> saveAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginSubscriptionFeeStore(AccountProvider accountProvider, Brokeback brokeback, StoreBundle storeBundle, final MarginSubscriptionFeeDao dao) {
        super(storeBundle, MarginSubscriptionFee.INSTANCE);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.accountProvider = accountProvider;
        this.brokeback = brokeback;
        this.dao = dao;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<PaginatedResult<? extends ApiMarginSubscriptionFee>, Unit>() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaginatedResult<? extends ApiMarginSubscriptionFee> paginatedResult) {
                m15904invoke(paginatedResult);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m15904invoke(PaginatedResult<? extends ApiMarginSubscriptionFee> paginatedResult) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(paginatedResult);
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
        this.feesTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$feesTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.MARGIN_SUBSCRIPTION_FEE);
                final Flow<MarginSubscriptionFee> marginSubscriptionFee = this.this$0.getMarginSubscriptionFee(reference.getSourceId());
                return new Flow<MarginSubscriptionFeeTransaction>() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$feesTransactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$feesTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$feesTransactionLoader$1$load$$inlined$map$1$2", m3645f = "MarginSubscriptionFeeStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$feesTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                MarginSubscriptionFeeTransaction marginSubscriptionFeeTransaction = new MarginSubscriptionFeeTransaction((MarginSubscriptionFee) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(marginSubscriptionFeeTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super MarginSubscriptionFeeTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = marginSubscriptionFee.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.feesHistoryLoaderCallback = new MarginSubscriptionFeeStore2(this);
        this.refundsTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$refundsTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.MARGIN_SUBSCRIPTION_FEE_REFUND);
                final Flow<MarginSubscriptionFeeRefund> marginSubscriptionFeeRefund = this.this$0.getMarginSubscriptionFeeRefund(reference.getSourceId());
                return new Flow<MarginSubscriptionFeeRefundTransaction>() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$refundsTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super MarginSubscriptionFeeRefundTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = marginSubscriptionFeeRefund.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$refundsTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$refundsTransactionLoader$1$load$$inlined$map$1$2", m3645f = "MarginSubscriptionFeeStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$refundsTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                MarginSubscriptionFeeRefundTransaction marginSubscriptionFeeRefundTransaction = new MarginSubscriptionFeeRefundTransaction((MarginSubscriptionFeeRefund) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(marginSubscriptionFeeRefundTransaction, anonymousClass1) == coroutine_suspended) {
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
                };
            }
        };
        this.refundsHistoryLoaderCallback = new MarginSubscriptionFeeStore5(this);
    }

    public final HistoryTransactionLoader getFeesTransactionLoader() {
        return this.feesTransactionLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Flow<T> flowIfNotManaged(HistoryLoader.Filter filter, Set<? extends BrokerageAccountType> set, T t, Function0<? extends Flow<? extends T>> function0) {
        if (!filter.isFilteringByAccountNumber(set)) {
            return function0.invoke();
        }
        return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAllAccounts()), Integer.MAX_VALUE, null, 2, null), new C20595xb0811aa9(null, function0, t, filter.getSupportedAccountNumbers(set)));
    }

    public final HistoryLoader.Callbacks<MarginSubscriptionFee> getFeesHistoryLoaderCallback() {
        return this.feesHistoryLoaderCallback;
    }

    public final Flow<MarginSubscriptionFee> getMarginSubscriptionFee(UUID subscriptionFeeId) {
        Intrinsics.checkNotNullParameter(subscriptionFeeId, "subscriptionFeeId");
        return FlowKt.filterNotNull(this.dao.getMarginSubscriptionFee(subscriptionFeeId));
    }

    public final HistoryTransactionLoader getRefundsTransactionLoader() {
        return this.refundsTransactionLoader;
    }

    public final HistoryLoader.Callbacks<MarginSubscriptionFeeRefund> getRefundsHistoryLoaderCallback() {
        return this.refundsHistoryLoaderCallback;
    }

    public final Flow<MarginSubscriptionFeeRefund> getMarginSubscriptionFeeRefund(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return FlowKt.filterNotNull(this.dao.getMarginSubscriptionFeeRefund(id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single refresh$lambda$2(MarginSubscriptionFeeStore marginSubscriptionFeeStore, String str) {
        return RxFactory.DefaultImpls.rxSingle$default(marginSubscriptionFeeStore, null, new MarginSubscriptionFeeStore4(marginSubscriptionFeeStore, str, null), 1, null);
    }

    public final void refresh(boolean force) {
        ScopedSubscriptionKt.subscribeIn(refreshPaginated(new Function1() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginSubscriptionFeeStore.refresh$lambda$2(this.f$0, (String) obj);
            }
        }).saveAction(this.saveAction).force(force).toMaybe(getNetworkWrapper()), getStoreScope());
    }
}

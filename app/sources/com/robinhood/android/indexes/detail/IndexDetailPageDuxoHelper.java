package com.robinhood.android.indexes.detail;

import androidx.paging.PagedList;
import com.robinhood.android.indexes.store.IndexAccountSwitcherStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: IndexDetailPageDuxoHelper.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u001aF\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006\u0016"}, m3636d2 = {"getCurrentAccountNumberFlow", "Lkotlinx/coroutines/flow/Flow;", "", "indexAccountSwitcherStore", "Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;", "getCurrentAccountFlow", "Lcom/robinhood/models/db/Account;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getIndexDetailPageHistoryFlow", "", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "pendingOnly", "", "indexId", "Ljava/util/UUID;", "limit", "", "currentAccountFlow", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "feature-index-detail-page_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageDuxoHelperKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IndexDetailPageDuxoHelper {
    public static final Flow<String> getCurrentAccountNumberFlow(IndexAccountSwitcherStore indexAccountSwitcherStore) {
        Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
        Observable<R> map = indexAccountSwitcherStore.streamActiveAccountNumber().map(new Function() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageDuxoHelperKt$getCurrentAccountNumberFlow$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional((String) ((Optional) it).getOrNull());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C18804x597bec32<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
    }

    public static final Flow<Account> getCurrentAccountFlow(IndexAccountSwitcherStore indexAccountSwitcherStore, AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        return FlowKt.transformLatest(getCurrentAccountNumberFlow(indexAccountSwitcherStore), new C18803x1f8f8d99(null, accountProvider));
    }

    public static final Flow<List<StatefulHistoryEvent<HistoryEvent>>> getIndexDetailPageHistoryFlow(boolean z, final UUID indexId, final int i, final Flow<Account> currentAccountFlow, HistoryStore historyStore) {
        Observable observableJust;
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Intrinsics.checkNotNullParameter(currentAccountFlow, "currentAccountFlow");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        if (z) {
            observableJust = Observable.just(Optional.INSTANCE.m2972of(HistoryEvent.State.PENDING));
            Intrinsics.checkNotNull(observableJust);
        } else {
            observableJust = Observable.just(Optional2.INSTANCE);
            Intrinsics.checkNotNull(observableJust);
        }
        Observable observable = observableJust;
        final Flow flowTransformLatest = FlowKt.transformLatest(new Flow<HistoryStaticFilter>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageDuxoHelperKt$getIndexDetailPageHistoryFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageDuxoHelperKt$getIndexDetailPageHistoryFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ UUID $indexId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.IndexDetailPageDuxoHelperKt$getIndexDetailPageHistoryFlow$$inlined$map$1$2", m3645f = "IndexDetailPageDuxoHelper.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageDuxoHelperKt$getIndexDetailPageHistoryFlow$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$indexId$inlined = uuid;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
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
                        Account account = (Account) obj;
                        HistoryStaticFilter historyStaticFilter = new HistoryStaticFilter(new HistoryStaticFilter.InstrumentFilter(this.$indexId$inlined, HistoryStaticFilter.InstrumentFilterType.INDEX), new HistoryStaticFilter.RhsAccountContext(account.getAccountNumber(), account.getBrokerageAccountType()), null, null, null, null, null, null, boxing.boxBoolean(true), null, 764, null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(historyStaticFilter, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super HistoryStaticFilter> flowCollector, Continuation continuation) {
                Object objCollect = currentAccountFlow.collect(new AnonymousClass2(flowCollector, indexId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new C18805xf71b328b(null, historyStore, observable, SetsKt.setOf((Object[]) new HistoryTransactionType[]{HistoryTransactionType.OPTION_ORDER, HistoryTransactionType.OPTION_EVENT}), i));
        return FlowKt.distinctUntilChanged(new Flow<List<? extends StatefulHistoryEvent<? extends HistoryEvent>>>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageDuxoHelperKt$getIndexDetailPageHistoryFlow$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageDuxoHelperKt$getIndexDetailPageHistoryFlow$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ int $limit$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.IndexDetailPageDuxoHelperKt$getIndexDetailPageHistoryFlow$$inlined$map$2$2", m3645f = "IndexDetailPageDuxoHelper.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageDuxoHelperKt$getIndexDetailPageHistoryFlow$$inlined$map$2$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, int i) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$limit$inlined = i;
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
                        PagedList pagedList = (PagedList) obj;
                        List<T> listSubList = pagedList.subList(0, Math.min(pagedList.size(), this.$limit$inlined));
                        Intrinsics.checkNotNullExpressionValue(listSubList, "subList(...)");
                        List listFilterNotNull = CollectionsKt.filterNotNull(listSubList);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(listFilterNotNull, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super List<? extends StatefulHistoryEvent<? extends HistoryEvent>>> flowCollector, Continuation continuation) {
                Object objCollect = flowTransformLatest.collect(new AnonymousClass2(flowCollector, i), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }
}

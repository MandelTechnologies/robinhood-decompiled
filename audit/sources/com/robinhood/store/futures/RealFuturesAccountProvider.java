package com.robinhood.store.futures;

import com.robinhood.android.lib.account.futures.FuturesAccountProvider;
import com.robinhood.android.lib.account.futures.RhdSubAccountIds;
import com.robinhood.android.models.futures.api.account.FuturesAccountType;
import com.robinhood.android.models.futures.dao.FuturesAccountDao;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RealFuturesAccountProvider.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/store/futures/RealFuturesAccountProvider;", "Lcom/robinhood/android/lib/account/futures/FuturesAccountProvider;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresAccountDao", "Lcom/robinhood/android/models/futures/dao/FuturesAccountDao;", "<init>", "(Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/android/models/futures/dao/FuturesAccountDao;)V", "streamRhsNumberToRhdSubAccountIdMap", "Lkotlinx/coroutines/flow/Flow;", "", "", "Lcom/robinhood/android/lib/account/futures/RhdSubAccountIds;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class RealFuturesAccountProvider implements FuturesAccountProvider {
    private final FuturesAccountDao futuresAccountDao;
    private final FuturesAccountStore futuresAccountStore;

    public RealFuturesAccountProvider(FuturesAccountStore futuresAccountStore, FuturesAccountDao futuresAccountDao) {
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresAccountDao, "futuresAccountDao");
        this.futuresAccountStore = futuresAccountStore;
        this.futuresAccountDao = futuresAccountDao;
    }

    @Override // com.robinhood.android.lib.account.futures.FuturesAccountProvider
    public Flow<Map<String, RhdSubAccountIds>> streamRhsNumberToRhdSubAccountIdMap() {
        this.futuresAccountStore.refreshAllAccounts();
        final Flow<List<FuturesAccount>> accounts2 = this.futuresAccountDao.getAccounts(null);
        return FlowKt.distinctUntilChanged(new Flow<Map<String, ? extends RhdSubAccountIds>>() { // from class: com.robinhood.store.futures.RealFuturesAccountProvider$streamRhsNumberToRhdSubAccountIdMap$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.RealFuturesAccountProvider$streamRhsNumberToRhdSubAccountIdMap$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.RealFuturesAccountProvider$streamRhsNumberToRhdSubAccountIdMap$$inlined$map$1$2", m3645f = "RealFuturesAccountProvider.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.RealFuturesAccountProvider$streamRhsNumberToRhdSubAccountIdMap$$inlined$map$1$2$1, reason: invalid class name */
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
                    Tuples2 tuples2M3642to;
                    T next;
                    T next2;
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
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (T t : (List) obj) {
                            String rhsAccountNumber = ((FuturesAccount) t).getRhsAccountNumber();
                            Object arrayList = linkedHashMap.get(rhsAccountNumber);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(rhsAccountNumber, arrayList);
                            }
                            ((List) arrayList).add(t);
                        }
                        ArrayList<Tuples2> arrayList2 = new ArrayList();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            String str = (String) entry.getKey();
                            List list = (List) entry.getValue();
                            Iterator<T> it = list.iterator();
                            while (true) {
                                tuples2M3642to = null;
                                if (!it.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it.next();
                                if (((FuturesAccount) next).getAccountType() == FuturesAccountType.FUTURES) {
                                    break;
                                }
                            }
                            FuturesAccount futuresAccount = next;
                            Iterator<T> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next2 = (T) null;
                                    break;
                                }
                                next2 = it2.next();
                                if (((FuturesAccount) next2).getAccountType() == FuturesAccountType.EVENT_CONTRACT_SWAPS) {
                                    break;
                                }
                            }
                            FuturesAccount futuresAccount2 = next2;
                            if (futuresAccount != null && futuresAccount2 != null) {
                                tuples2M3642to = Tuples4.m3642to(str, new RhdSubAccountIds(futuresAccount.getId(), futuresAccount2.getId()));
                            }
                            if (tuples2M3642to != null) {
                                arrayList2.add(tuples2M3642to);
                            }
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
                        for (Tuples2 tuples2 : arrayList2) {
                            linkedHashMap2.put(tuples2.getFirst(), tuples2.getSecond());
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(linkedHashMap2, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Map<String, ? extends RhdSubAccountIds>> flowCollector, Continuation continuation) {
                Object objCollect = accounts2.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }
}

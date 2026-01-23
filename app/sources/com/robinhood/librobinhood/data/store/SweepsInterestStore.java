package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.android.sweep.api.SweepApi;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.models.api.ApiSweepsInterest;
import com.robinhood.models.dao.SweepsInterestDao;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: SweepsInterestStore.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u0015J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\f0\u0015J\u0010\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u001bJJ\u0010\u001e\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u001f*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f0\f \u001f*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u001f*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f0\f\u0018\u00010\u00150\u00152\u0006\u0010\u001d\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\n\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000f0\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "Lcom/robinhood/store/Store;", "sweepApi", "Lcom/robinhood/android/sweep/api/SweepApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/SweepsInterestDao;", "<init>", "(Lcom/robinhood/android/sweep/api/SweepApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/SweepsInterestDao;)V", "sweepsInterestEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/utils/Optional;", "", "Lkotlin/Pair;", "Lcom/robinhood/models/api/ApiSweepsInterest;", "sweepsQuery", "Lcom/robinhood/android/moria/db/Query;", "", "Lcom/robinhood/models/db/mcduckling/SweepsInterest;", "streamNoAccountNumber", "Lio/reactivex/Observable;", "streamInterestNoAccountNumber", "Ljava/math/BigDecimal;", "refreshNoAccountNumber", "Lkotlinx/coroutines/Job;", "force", "", "refresh", "accountNumber", "stream", "kotlin.jvm.PlatformType", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class SweepsInterestStore extends Store {
    private final SweepsInterestDao dao;
    private final SweepApi sweepApi;
    private final Endpoint<Optional<String>, Tuples2<Optional<String>, ApiSweepsInterest>> sweepsInterestEndpoint;
    private final Query<Optional<String>, List<SweepsInterest>> sweepsQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SweepsInterestStore(SweepApi sweepApi, StoreBundle storeBundle, SweepsInterestDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(sweepApi, "sweepApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.sweepApi = sweepApi;
        this.dao = dao;
        Endpoint<Optional<String>, Tuples2<Optional<String>, ApiSweepsInterest>> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new SweepsInterestStore2(this, null), getLogoutKillswitch(), new SweepsInterestStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.sweepsInterestEndpoint = endpointCreate$default;
        this.sweepsQuery = Store.create$default(this, Query.INSTANCE, "sweepsQuery", CollectionsKt.listOf(new RefreshEach(new SweepsInterestStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.SweepsInterestStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepsInterestStore.sweepsQuery$lambda$0(this.f$0, (Optional) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow sweepsQuery$lambda$0(SweepsInterestStore sweepsInterestStore, Optional accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        SweepsInterestDao sweepsInterestDao = sweepsInterestStore.dao;
        String str = (String) accountNumber.getOrNull();
        if (str == null) {
            str = "";
        }
        return sweepsInterestDao.getInterests(str);
    }

    public final Observable<Optional<SweepsInterest>> streamNoAccountNumber() {
        final Flow interests$default = SweepsInterestDao.getInterests$default(this.dao, null, 1, null);
        return asObservable(takeWhileLoggedIn(Operators.toOptionals(new Flow<SweepsInterest>() { // from class: com.robinhood.librobinhood.data.store.SweepsInterestStore$streamNoAccountNumber$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.SweepsInterestStore$streamNoAccountNumber$$inlined$map$1$2 */
            public static final class C343552<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SweepsInterestStore$streamNoAccountNumber$$inlined$map$1$2", m3645f = "SweepsInterestStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.SweepsInterestStore$streamNoAccountNumber$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C343552.this.emit(null, this);
                    }
                }

                public C343552(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(objFirstOrNull, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super SweepsInterest> flowCollector, Continuation continuation) {
                Object objCollect = interests$default.collect(new C343552(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        })));
    }

    public final Observable<Optional<BigDecimal>> streamInterestNoAccountNumber() {
        Observable map = streamNoAccountNumber().map(new Function() { // from class: com.robinhood.librobinhood.data.store.SweepsInterestStore.streamInterestNoAccountNumber.1
            @Override // io.reactivex.functions.Function
            public final Optional<BigDecimal> apply(Optional<SweepsInterest> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                SweepsInterest sweepsInterestComponent1 = optional.component1();
                return Optional3.asOptional(sweepsInterestComponent1 != null ? sweepsInterestComponent1.getInterestRate() : null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static /* synthetic */ Job refreshNoAccountNumber$default(SweepsInterestStore sweepsInterestStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return sweepsInterestStore.refreshNoAccountNumber(z);
    }

    public final Job refreshNoAccountNumber(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.sweepsInterestEndpoint, Optional2.INSTANCE, force, null, 4, null);
    }

    public static /* synthetic */ Job refresh$default(SweepsInterestStore sweepsInterestStore, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return sweepsInterestStore.refresh(str, z);
    }

    public final Job refresh(String accountNumber, boolean force) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.refresh$default(this.sweepsInterestEndpoint, Optional3.asOptional(accountNumber), force, null, 4, null);
    }

    public final Observable<Optional<SweepsInterest>> stream(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return ObservablesKt.mapFirstOptional(asObservable(this.sweepsQuery.asFlow(Optional3.asOptional(accountNumber)))).takeUntil(getLogoutKillswitch().getKillswitchObservable());
    }
}

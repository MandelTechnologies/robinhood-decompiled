package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.api.bonfire.rhy.ApiCashCushionSetting;
import com.robinhood.models.dao.CashCushionStatusDao;
import com.robinhood.models.p320db.bonfire.CashCushionStatus;
import com.robinhood.models.p320db.bonfire.CashCushionStatus2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
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
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CashCushionStatusStore.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0018J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;", "Lcom/robinhood/store/Store;", "rhyBonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "dao", "Lcom/robinhood/models/dao/CashCushionStatusDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/rhy/RhyBonfireApi;Lcom/robinhood/models/dao/CashCushionStatusDao;Lcom/robinhood/store/StoreBundle;)V", "getStatusEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/bonfire/rhy/ApiCashCushionSetting;", "setStatusEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/bonfire/CashCushionStatus;", "update", "enabled", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forceFetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stream", "Lkotlinx/coroutines/flow/Flow;", "refresh", "Lkotlinx/coroutines/Job;", "force", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CashCushionStatusStore extends Store {
    private final CashCushionStatusDao dao;
    private final Endpoint<Unit, ApiCashCushionSetting> getStatusEndpoint;
    private final Query<Unit, CashCushionStatus> query;
    private final RhyBonfireApi rhyBonfireApi;
    private final PostEndpoint<ApiCashCushionSetting, Unit> setStatusEndpoint;

    /* compiled from: CashCushionStatusStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.CashCushionStatusStore", m3645f = "CashCushionStatusStore.kt", m3646l = {57}, m3647m = "forceFetch")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.CashCushionStatusStore$forceFetch$1 */
    static final class C344851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C344851(Continuation<? super C344851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CashCushionStatusStore.this.forceFetch(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashCushionStatusStore(RhyBonfireApi rhyBonfireApi, CashCushionStatusDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(rhyBonfireApi, "rhyBonfireApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.rhyBonfireApi = rhyBonfireApi;
        this.dao = dao;
        this.getStatusEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CashCushionStatusStore2(this, null), getLogoutKillswitch(), new CashCushionStatusStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.setStatusEndpoint = PostEndpoint.INSTANCE.create(new CashCushionStatusStore4(rhyBonfireApi), new CashCushionStatusStore5(null));
        this.query = Store.create$default(this, Query.INSTANCE, "streamCashCushionStatus", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.CashCushionStatusStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CashCushionStatusStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.CashCushionStatusStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CashCushionStatusStore.query$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(CashCushionStatusStore cashCushionStatusStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(cashCushionStatusStore.getStatusEndpoint, Unit.INSTANCE, CashCushionStatus.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(CashCushionStatusStore cashCushionStatusStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cashCushionStatusStore.dao.getStatus();
    }

    public final Object update(boolean z, Continuation<? super Unit> continuation) {
        Object objPost$default = PostEndpoint.DefaultImpls.post$default(this.setStatusEndpoint, new ApiCashCushionSetting(z), null, continuation, 2, null);
        return objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPost$default : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object forceFetch(Continuation<? super CashCushionStatus> continuation) {
        C344851 c344851;
        if (continuation instanceof C344851) {
            c344851 = (C344851) continuation;
            int i = c344851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c344851.label = i - Integer.MIN_VALUE;
            } else {
                c344851 = new C344851(continuation);
            }
        }
        C344851 c3448512 = c344851;
        Object objForceFetch$default = c3448512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3448512.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<Unit, ApiCashCushionSetting> endpoint = this.getStatusEndpoint;
            Unit unit = Unit.INSTANCE;
            c3448512.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, c3448512, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return CashCushionStatus2.toDbModel((ApiCashCushionSetting) objForceFetch$default);
    }

    public final Flow<CashCushionStatus> stream() {
        return Context7.buffer$default(RxConvert.asFlow(this.query.asObservable(Unit.INSTANCE)), Integer.MAX_VALUE, null, 2, null);
    }

    public final Job refresh(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.getStatusEndpoint, Unit.INSTANCE, force, null, 4, null);
    }
}

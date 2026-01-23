package com.robinhood.librobinhood.data.store.bonfire.daytrades.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.librobinhood.data.store.bonfire.daytrades.api.DayTradeApi;
import com.robinhood.models.api.ApiClientComponentAlert;
import com.robinhood.models.api.ApiSessionAlert;
import com.robinhood.models.p320db.ClientComponentAlert;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DayTradeWarningsStore.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0013R&\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/store/DayTradeWarningsStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/api/DayTradeApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/api/DayTradeApi;Lcom/robinhood/store/StoreBundle;)V", "equitiesWarningEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Ljava/util/UUID;", "", "Lcom/robinhood/models/api/ApiSessionAlert;", "optionsWarningEndpoint", "getEquitiesWarning", "Lcom/robinhood/models/db/ClientComponentAlert;", "orderId", "accountNumber", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOptionsWarning", "lib-store-day-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class DayTradeWarningsStore extends Store {
    private final Endpoint<Tuples2<UUID, String>, ApiSessionAlert> equitiesWarningEndpoint;
    private final Endpoint<Tuples2<UUID, String>, ApiSessionAlert> optionsWarningEndpoint;

    /* compiled from: DayTradeWarningsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.daytrades.store.DayTradeWarningsStore", m3645f = "DayTradeWarningsStore.kt", m3646l = {39}, m3647m = "getEquitiesWarning")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.daytrades.store.DayTradeWarningsStore$getEquitiesWarning$1 */
    static final class C346331 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C346331(Continuation<? super C346331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DayTradeWarningsStore.this.getEquitiesWarning(null, null, this);
        }
    }

    /* compiled from: DayTradeWarningsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.daytrades.store.DayTradeWarningsStore", m3645f = "DayTradeWarningsStore.kt", m3646l = {42}, m3647m = "getOptionsWarning")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.daytrades.store.DayTradeWarningsStore$getOptionsWarning$1 */
    static final class C346341 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C346341(Continuation<? super C346341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DayTradeWarningsStore.this.getOptionsWarning(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DayTradeWarningsStore(DayTradeApi bonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.equitiesWarningEndpoint = Endpoint.Companion.create$default(companion, new DayTradeWarningsStore2(bonfireApi, null), getLogoutKillswitch(), new DayTradeWarningsStore3(null), storeBundle.getClock(), null, 16, null);
        this.optionsWarningEndpoint = Endpoint.Companion.create$default(companion, new DayTradeWarningsStore4(bonfireApi, null), getLogoutKillswitch(), new DayTradeWarningsStore5(null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getEquitiesWarning(UUID uuid, String str, Continuation<? super ClientComponentAlert> continuation) {
        C346331 c346331;
        ApiClientComponentAlert alert;
        if (continuation instanceof C346331) {
            c346331 = (C346331) continuation;
            int i = c346331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c346331.label = i - Integer.MIN_VALUE;
            } else {
                c346331 = new C346331(continuation);
            }
        }
        C346331 c3463312 = c346331;
        Object objFetch$default = c3463312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3463312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetch$default);
            Endpoint<Tuples2<UUID, String>, ApiSessionAlert> endpoint = this.equitiesWarningEndpoint;
            Tuples2 tuples2M3642to = Tuples4.m3642to(uuid, str);
            c3463312.label = 1;
            objFetch$default = Endpoint.DefaultImpls.fetch$default(endpoint, tuples2M3642to, null, c3463312, 2, null);
            if (objFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetch$default);
        }
        ApiSessionAlert apiSessionAlert = (ApiSessionAlert) objFetch$default;
        if (apiSessionAlert == null || (alert = apiSessionAlert.getAlert()) == null) {
            return null;
        }
        return alert.toDbModel();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOptionsWarning(UUID uuid, String str, Continuation<? super ClientComponentAlert> continuation) {
        C346341 c346341;
        ApiClientComponentAlert alert;
        if (continuation instanceof C346341) {
            c346341 = (C346341) continuation;
            int i = c346341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c346341.label = i - Integer.MIN_VALUE;
            } else {
                c346341 = new C346341(continuation);
            }
        }
        C346341 c3463412 = c346341;
        Object objFetch$default = c3463412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3463412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetch$default);
            Endpoint<Tuples2<UUID, String>, ApiSessionAlert> endpoint = this.optionsWarningEndpoint;
            Tuples2 tuples2M3642to = Tuples4.m3642to(uuid, str);
            c3463412.label = 1;
            objFetch$default = Endpoint.DefaultImpls.fetch$default(endpoint, tuples2M3642to, null, c3463412, 2, null);
            if (objFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetch$default);
        }
        ApiSessionAlert apiSessionAlert = (ApiSessionAlert) objFetch$default;
        if (apiSessionAlert == null || (alert = apiSessionAlert.getAlert()) == null) {
            return null;
        }
        return alert.toDbModel();
    }
}

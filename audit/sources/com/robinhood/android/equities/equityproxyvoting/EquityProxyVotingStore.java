package com.robinhood.android.equities.equityproxyvoting;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.api.equity.EquitiesSay;
import com.robinhood.models.api.ApiProxyCommunication;
import com.robinhood.models.dao.ProxyCommunicationDao;
import com.robinhood.models.p320db.ProxyCommunication;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import retrofit2.Response;

/* compiled from: EquityProxyVotingStore.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingStore;", "Lcom/robinhood/store/Store;", "equitiesSay", "Lcom/robinhood/api/equity/EquitiesSay;", "proxyCommunicationDao", "Lcom/robinhood/models/dao/ProxyCommunicationDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/equity/EquitiesSay;Lcom/robinhood/models/dao/ProxyCommunicationDao;Lcom/robinhood/store/StoreBundle;)V", "proxyCommunicationEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiProxyCommunication;", "getInstrumentProxyCommunication", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/ProxyCommunication;", "instrumentId", "force", "", "(Ljava/util/UUID;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-equity-proxy-voting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityProxyVotingStore extends Store {
    public static final int $stable = 8;
    private final EquitiesSay equitiesSay;
    private final ProxyCommunicationDao proxyCommunicationDao;
    private final Endpoint<UUID, Response<ApiProxyCommunication>> proxyCommunicationEndpoint;

    /* compiled from: EquityProxyVotingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingStore", m3645f = "EquityProxyVotingStore.kt", m3646l = {46, 48}, m3647m = "getInstrumentProxyCommunication")
    /* renamed from: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingStore$getInstrumentProxyCommunication$1 */
    static final class C146661 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C146661(Continuation<? super C146661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityProxyVotingStore.this.getInstrumentProxyCommunication(null, false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityProxyVotingStore(EquitiesSay equitiesSay, ProxyCommunicationDao proxyCommunicationDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(equitiesSay, "equitiesSay");
        Intrinsics.checkNotNullParameter(proxyCommunicationDao, "proxyCommunicationDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.equitiesSay = equitiesSay;
        this.proxyCommunicationDao = proxyCommunicationDao;
        this.proxyCommunicationEndpoint = Endpoint.INSTANCE.createWithParams(new EquityProxyVotingStore2(equitiesSay), getLogoutKillswitch(), new EquityProxyVotingStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.FIVE_MINUTES, storeBundle.getClock()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r10 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getInstrumentProxyCommunication(UUID uuid, boolean z, Continuation<? super Flow<ProxyCommunication>> continuation) {
        C146661 c146661;
        if (continuation instanceof C146661) {
            c146661 = (C146661) continuation;
            int i = c146661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c146661.label = i - Integer.MIN_VALUE;
            } else {
                c146661 = new C146661(continuation);
            }
        }
        C146661 c1466612 = c146661;
        Object objFetch$default = c1466612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1466612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetch$default);
            if (z) {
                Endpoint<UUID, Response<ApiProxyCommunication>> endpoint = this.proxyCommunicationEndpoint;
                c1466612.L$0 = uuid;
                c1466612.label = 1;
                objFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, c1466612, 2, null);
            } else {
                Endpoint<UUID, Response<ApiProxyCommunication>> endpoint2 = this.proxyCommunicationEndpoint;
                c1466612.L$0 = uuid;
                c1466612.label = 2;
                objFetch$default = Endpoint.DefaultImpls.fetch$default(endpoint2, uuid, null, c1466612, 2, null);
                if (objFetch$default != coroutine_suspended) {
                    uuid = uuid;
                }
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            uuid = (UUID) c1466612.L$0;
            ResultKt.throwOnFailure(objFetch$default);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuid = (UUID) c1466612.L$0;
            ResultKt.throwOnFailure(objFetch$default);
        }
        return this.proxyCommunicationDao.streamProxyCommunication(uuid);
    }
}

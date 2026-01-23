package com.robinhood.librobinhood.adtcreative.store;

import com.robinhood.android.api.alldaytrading.AllDayTradingApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.alldaytrading.api.ApiAdtInstrumentInfo;
import com.robinhood.models.alldaytrading.p305db.AdtInstrumentInfo;
import com.robinhood.models.alldaytrading.p305db.AdtInstrumentInfo2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdtInstrumentInfoStore.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/adtcreative/store/AdtInstrumentInfoStore;", "Lcom/robinhood/store/Store;", "allDayTradingApi", "Lcom/robinhood/android/api/alldaytrading/AllDayTradingApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/alldaytrading/AllDayTradingApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/alldaytrading/api/ApiAdtInstrumentInfo;", "getInstrumentInfo", "Lio/reactivex/Single;", "Lcom/robinhood/models/alldaytrading/db/AdtInstrumentInfo;", "instrumentId", "lib-store-all-day-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class AdtInstrumentInfoStore extends Store {
    private final AllDayTradingApi allDayTradingApi;
    private final Endpoint<UUID, ApiAdtInstrumentInfo> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdtInstrumentInfoStore(AllDayTradingApi allDayTradingApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(allDayTradingApi, "allDayTradingApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.allDayTradingApi = allDayTradingApi;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new AdtInstrumentInfoStore2(allDayTradingApi), getLogoutKillswitch(), new AdtInstrumentInfoStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: AdtInstrumentInfoStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/alldaytrading/db/AdtInstrumentInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.adtcreative.store.AdtInstrumentInfoStore$getInstrumentInfo$1", m3645f = "AdtInstrumentInfoStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.adtcreative.store.AdtInstrumentInfoStore$getInstrumentInfo$1 */
    static final class C334281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AdtInstrumentInfo>, Object> {
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C334281(UUID uuid, Continuation<? super C334281> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdtInstrumentInfoStore.this.new C334281(this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AdtInstrumentInfo> continuation) {
            return ((C334281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = AdtInstrumentInfoStore.this.endpoint;
                UUID uuid = this.$instrumentId;
                this.label = 1;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return AdtInstrumentInfo2.toDbModel((ApiAdtInstrumentInfo) obj);
        }
    }

    public final Single<AdtInstrumentInfo> getInstrumentInfo(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C334281(instrumentId, null), 1, null);
    }
}

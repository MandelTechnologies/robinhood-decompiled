package com.robinhood.shared.equities.store.subzero;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.shared.equities.subzero.ApiEquitySsrData;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: EquitySsrStore.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000bJ$\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000bH\u0086@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/equities/store/subzero/EquitySsrStore;", "Lcom/robinhood/store/Store;", "brokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/equity/EquitiesBrokeback;Lcom/robinhood/store/StoreBundle;)V", "getEquitySsr", "Lcom/robinhood/android/moria/network/Endpoint;", "", "", "Lcom/robinhood/shared/equities/subzero/ApiEquitySsrData;", "streamEquitySsr", "Lkotlinx/coroutines/flow/Flow;", "instrumentIds", "getEquitySsrOnce", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EquitySsrStore extends Store {
    private final EquitiesBrokeback brokeback;
    private final Endpoint<String, List<ApiEquitySsrData>> getEquitySsr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquitySsrStore(EquitiesBrokeback brokeback, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.brokeback = brokeback;
        this.getEquitySsr = Endpoint.Companion.create$default(Endpoint.INSTANCE, new EquitySsrStore2(this, null), getLogoutKillswitch(), new EquitySsrStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public final Flow<List<ApiEquitySsrData>> streamEquitySsr(List<String> instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        return Endpoint.DefaultImpls.poll$default(this.getEquitySsr, CollectionsKt.joinToString$default(instrumentIds, ",", null, null, 0, null, null, 62, null), null, null, 6, null);
    }

    public final Object getEquitySsrOnce(List<String> list, Continuation<? super List<ApiEquitySsrData>> continuation) {
        return Endpoint.DefaultImpls.fetch$default(this.getEquitySsr, CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null), null, continuation, 2, null);
    }
}

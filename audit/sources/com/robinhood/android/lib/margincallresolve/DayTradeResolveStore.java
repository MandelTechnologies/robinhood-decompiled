package com.robinhood.android.lib.margincallresolve;

import com.robinhood.android.lib.margincallresolve.api.DayTradeResolveApi;
import com.robinhood.android.lib.margincallresolve.api.models.ApiDayTradeCallView;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DayTradeResolveStore.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lib/margincallresolve/DayTradeResolveStore;", "Lcom/robinhood/store/Store;", "dayTradeResolveApi", "Lcom/robinhood/android/lib/margincallresolve/api/DayTradeResolveApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/margincallresolve/api/DayTradeResolveApi;Lcom/robinhood/store/StoreBundle;)V", "getEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/lib/margincallresolve/api/models/ApiDayTradeCallView;", "getDayTradeCallView", "accountNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class DayTradeResolveStore extends Store {
    private final DayTradeResolveApi dayTradeResolveApi;
    private final Endpoint<String, ApiDayTradeCallView> getEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DayTradeResolveStore(DayTradeResolveApi dayTradeResolveApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(dayTradeResolveApi, "dayTradeResolveApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dayTradeResolveApi = dayTradeResolveApi;
        this.getEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new DayTradeResolveStore2(this, null), getLogoutKillswitch(), new DayTradeResolveStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public final Object getDayTradeCallView(String str, Continuation<? super ApiDayTradeCallView> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getEndpoint, str, null, continuation, 2, null);
    }
}

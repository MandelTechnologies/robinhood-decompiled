package com.robinhood.librobinhood.data.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.api.gold.GoldApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.api.bonfire.ApiGoldValuePropsDowngrade;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldValuePropsStore.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/GoldValuePropsStore;", "Lcom/robinhood/store/Store;", "goldApi", "Lcom/robinhood/android/api/gold/GoldApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/gold/GoldApi;Lcom/robinhood/store/StoreBundle;)V", "downgradeValuePropsRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/models/api/bonfire/ApiGoldValuePropsDowngrade;", "kotlin.jvm.PlatformType", "downgradeValuePropsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "getDowngradeValueProps", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-gold_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class GoldValuePropsStore extends Store {
    private final Endpoint<Unit, ApiGoldValuePropsDowngrade> downgradeValuePropsEndpoint;
    private final BehaviorRelay<ApiGoldValuePropsDowngrade> downgradeValuePropsRelay;
    private final GoldApi goldApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldValuePropsStore(GoldApi goldApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(goldApi, "goldApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.goldApi = goldApi;
        BehaviorRelay<ApiGoldValuePropsDowngrade> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.downgradeValuePropsRelay = behaviorRelayCreate;
        this.downgradeValuePropsEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new GoldValuePropsStore2(this, null), getLogoutKillswitch(), new GoldValuePropsStore3(behaviorRelayCreate), storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object downgradeValuePropsEndpoint$accept(BehaviorRelay behaviorRelay, ApiGoldValuePropsDowngrade apiGoldValuePropsDowngrade, Continuation continuation) {
        behaviorRelay.accept(apiGoldValuePropsDowngrade);
        return Unit.INSTANCE;
    }

    public final Object getDowngradeValueProps(Continuation<? super ApiGoldValuePropsDowngrade> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.downgradeValuePropsEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }
}

package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.p355ui.identi.UiFullNin;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import identi.service.p471v1.RestIdentiIDLV1Service;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: FullNinStore.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/FullNinStore;", "Lcom/robinhood/store/Store;", "identiService", "Lidenti/service/v1/RestIdentiIDLV1Service;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lidenti/service/v1/RestIdentiIDLV1Service;Lcom/robinhood/store/StoreBundle;)V", "fullNinCacheFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/ui/identi/UiFullNin;", "fullNinEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "fullNinQuery", "Lcom/robinhood/android/moria/db/Query;", "streamFullNin", "Lkotlinx/coroutines/flow/Flow;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class FullNinStore extends Store {
    private final StateFlow2<UiFullNin> fullNinCacheFlow;
    private final Endpoint<Unit, UiFullNin> fullNinEndpoint;
    private final Query<Unit, UiFullNin> fullNinQuery;
    private final RestIdentiIDLV1Service identiService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullNinStore(RestIdentiIDLV1Service identiService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(identiService, "identiService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.identiService = identiService;
        this.fullNinCacheFlow = StateFlow4.MutableStateFlow(null);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        FullNinStore2 fullNinStore2 = new FullNinStore2(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        FullNinStore3 fullNinStore3 = new FullNinStore3(this, null);
        Clock clock = storeBundle.getClock();
        Duration durationOfDays = Duration.ofDays(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfDays, "ofDays(...)");
        Endpoint<Unit, UiFullNin> endpointCreate = companion.create(fullNinStore2, logoutKillswitch, fullNinStore3, clock, new DefaultStaleDecider(durationOfDays, storeBundle.getClock()));
        this.fullNinEndpoint = endpointCreate;
        this.fullNinQuery = Store.create$default(this, Query.INSTANCE, "getFullNin", CollectionsKt.listOf(new RefreshEach(new FullNinStore4(endpointCreate))), new Function1() { // from class: com.robinhood.librobinhood.data.store.identi.FullNinStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FullNinStore.fullNinQuery$lambda$0(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow fullNinQuery$lambda$0(FullNinStore fullNinStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.distinctUntilChanged(FlowKt.filterNotNull(fullNinStore.fullNinCacheFlow));
    }

    public final Flow<UiFullNin> streamFullNin() {
        return this.fullNinQuery.asFlow(Unit.INSTANCE);
    }
}

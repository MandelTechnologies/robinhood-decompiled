package com.robinhood.shared.security.store.trusteddevice;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiTrustedDevice;
import com.robinhood.models.dao.TrustedDeviceDao;
import com.robinhood.models.p320db.TrustedDevice;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Observable;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: TrustedDeviceStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u001cJ\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001f0\u001eJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e2\u0006\u0010\u0019\u001a\u00020\u000eJ\u0010\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u0017J\u000e\u0010\"\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/security/store/trusteddevice/TrustedDeviceStore;", "Lcom/robinhood/store/Store;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/TrustedDeviceDao;", "<init>", "(Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/api/retrofit/Sheriff;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/TrustedDeviceDao;)V", "reportTrustedDeviceEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/db/TrustedDevice;", "getTrustedDevicesEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/ApiTrustedDevice;", "removeDevicesEndpoint", "isRemoveDevicesDisabledEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "report", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeDevices", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stream", "Lio/reactivex/Observable;", "", "refresh", "force", "isRemoveDevicesDisabled", "lib-store-trusted-device_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TrustedDeviceStore extends Store {
    private final Brokeback brokeback;
    private final TrustedDeviceDao dao;
    private final PaginatedEndpoint<Unit, ApiTrustedDevice> getTrustedDevicesEndpoint;
    private final Endpoint<Unit, Boolean> isRemoveDevicesDisabledEndpoint;
    private final PostEndpoint<Unit, Unit> removeDevicesEndpoint;
    private final PostEndpoint<UUID, TrustedDevice> reportTrustedDeviceEndpoint;
    private final Sheriff sheriff;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedDeviceStore(Brokeback brokeback, Sheriff sheriff, StoreBundle storeBundle, TrustedDeviceDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.brokeback = brokeback;
        this.sheriff = sheriff;
        this.dao = dao;
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.reportTrustedDeviceEndpoint = companion.create(new TrustedDeviceStore8(this, null), new TrustedDeviceStore9(dao));
        PaginatedEndpoint.Companion companion2 = PaginatedEndpoint.INSTANCE;
        TrustedDeviceStore2 trustedDeviceStore2 = new TrustedDeviceStore2(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        TrustedDeviceStore3 trustedDeviceStore3 = new TrustedDeviceStore3(dao);
        Clock clock = storeBundle.getClock();
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        this.getTrustedDevicesEndpoint = companion2.create(trustedDeviceStore2, logoutKillswitch, trustedDeviceStore3, clock, new DefaultStaleDecider(durationOfMinutes, storeBundle.getClock()));
        this.removeDevicesEndpoint = companion.create(new TrustedDeviceStore6(this, null), new TrustedDeviceStore7(null));
        this.isRemoveDevicesDisabledEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new TrustedDeviceStore4(this, null), getLogoutKillswitch(), new TrustedDeviceStore5(null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object reportTrustedDeviceEndpoint$insert(TrustedDeviceDao trustedDeviceDao, TrustedDevice trustedDevice, Continuation continuation) {
        trustedDeviceDao.insert((TrustedDeviceDao) trustedDevice);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getTrustedDevicesEndpoint$insertPaginated(TrustedDeviceDao trustedDeviceDao, PaginatedResult paginatedResult, Continuation continuation) {
        trustedDeviceDao.insertPaginated(paginatedResult);
        return Unit.INSTANCE;
    }

    public final Object report(UUID uuid, Continuation<? super TrustedDevice> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.reportTrustedDeviceEndpoint, uuid, null, continuation, 2, null);
    }

    public final Object removeDevices(Continuation<? super Unit> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.removeDevicesEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }

    public final Observable<List<TrustedDevice>> stream() {
        return asObservable(takeWhileLoggedIn(this.dao.getDevices((ApiTrustedDevice.Status[]) ApiTrustedDevice.Status.INSTANCE.getDisplayStatuses().toArray(new ApiTrustedDevice.Status[0]))));
    }

    public final Observable<TrustedDevice> stream(UUID deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getDevice(deviceId))));
    }

    public static /* synthetic */ void refresh$default(TrustedDeviceStore trustedDeviceStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        trustedDeviceStore.refresh(z);
    }

    public final void refresh(boolean force) {
        PaginatedEndpointKt.refreshAllPages(this.getTrustedDevicesEndpoint, force);
    }

    public final Object isRemoveDevicesDisabled(Continuation<? super Boolean> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.isRemoveDevicesDisabledEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }
}

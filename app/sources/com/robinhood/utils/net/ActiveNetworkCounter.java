package com.robinhood.utils.net;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActiveNetworkCounter.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R(\u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/utils/net/ActiveNetworkCounter;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "networks", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "", "kotlin.jvm.PlatformType", "networksSet", "getNetworksSet", "()Ljava/util/Set;", "hasAvailableNetwork", "", "getHasAvailableNetwork", "()Z", "streamHasAvailableNetwork", "Lio/reactivex/Observable;", "onAvailable", "", "network", "Landroid/net/Network;", "onLost", "Companion", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ActiveNetworkCounter extends ConnectivityManager.NetworkCallback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BehaviorRelay<Set<Long>> networks;

    public ActiveNetworkCounter() {
        BehaviorRelay<Set<Long>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(SetsKt.emptySet());
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.networks = behaviorRelayCreateDefault;
    }

    private final Set<Long> getNetworksSet() {
        Set<Long> value = this.networks.getValue();
        Intrinsics.checkNotNull(value);
        return value;
    }

    public final boolean getHasAvailableNetwork() {
        return !getNetworksSet().isEmpty();
    }

    public final Observable<Boolean> streamHasAvailableNetwork() {
        Observable<Boolean> observableHide = this.networks.map(new Function() { // from class: com.robinhood.utils.net.ActiveNetworkCounter.streamHasAvailableNetwork.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Set<Long> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(ActiveNetworkCounter.this.getHasAvailableNetwork());
            }
        }).startWith((Observable<R>) Boolean.valueOf(getHasAvailableNetwork())).distinctUntilChanged().hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.networks.accept(SetsKt.plus(getNetworksSet(), Long.valueOf(network.getNetworkHandle())));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        if (getNetworksSet().contains(Long.valueOf(network.getNetworkHandle()))) {
            this.networks.accept(SetsKt.minus(getNetworksSet(), Long.valueOf(network.getNetworkHandle())));
            return;
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Error("Attempting to remove network handle " + network.getNetworkHandle() + " that doesn't exist."), false, null, 6, null);
    }

    /* compiled from: ActiveNetworkCounter.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/utils/net/ActiveNetworkCounter$Companion;", "", "<init>", "()V", "networkRequest", "Landroid/net/NetworkRequest;", "getNetworkRequest", "()Landroid/net/NetworkRequest;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NetworkRequest getNetworkRequest() {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
            Intrinsics.checkNotNullExpressionValue(networkRequestBuild, "build(...)");
            return networkRequestBuild;
        }
    }
}

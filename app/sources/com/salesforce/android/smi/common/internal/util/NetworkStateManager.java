package com.salesforce.android.smi.common.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.salesforce.android.smi.common.internal.util.NetworkStateManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: NetworkStateManager.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m3636d2 = {"Lcom/salesforce/android/smi/common/internal/util/NetworkStateManager;", "", "context", "Landroid/content/Context;", "connectivityManager", "Landroid/net/ConnectivityManager;", "<init>", "(Landroid/content/Context;Landroid/net/ConnectivityManager;)V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "Ljava/util/logging/Logger;", "networkStateMap", "", "", "", "overallNetworkState", "Lcom/salesforce/android/smi/common/internal/util/NetworkConnectivityStatus;", "connectivityStatusFlow", "Lkotlinx/coroutines/flow/Flow;", "getConnectivityStatusFlow", "()Lkotlinx/coroutines/flow/Flow;", "currentConnection", "Companion", "common_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class NetworkStateManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = NetworkStateManager.class.getName();
    private final ConnectivityManager connectivityManager;
    private final Flow<NetworkConnectivityStatus> connectivityStatusFlow;
    private final Logger logger;
    private final Map<Long, Boolean> networkStateMap;

    public NetworkStateManager(Context context, ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        this.connectivityManager = connectivityManager;
        this.logger = Logger.getLogger(TAG);
        this.networkStateMap = new LinkedHashMap();
        this.connectivityStatusFlow = FlowKt.callbackFlow(new NetworkStateManager2(this, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NetworkStateManager(Context context, ConnectivityManager connectivityManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            connectivityManager = (ConnectivityManager) systemService;
        }
        this(context, connectivityManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkConnectivityStatus overallNetworkState() {
        boolean zContainsValue = this.networkStateMap.containsValue(Boolean.TRUE);
        if (zContainsValue) {
            return NetworkConnectivityStatus.Connected;
        }
        if (zContainsValue) {
            throw new NoWhenBranchMatchedException();
        }
        return NetworkConnectivityStatus.Offline;
    }

    public final Flow<NetworkConnectivityStatus> getConnectivityStatusFlow() {
        return this.connectivityStatusFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkConnectivityStatus currentConnection() {
        ConnectivityManager connectivityManager = this.connectivityManager;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return Intrinsics.areEqual(networkCapabilities != null ? Boolean.valueOf(networkCapabilities.hasCapability(12)) : null, Boolean.TRUE) ? NetworkConnectivityStatus.Connected : NetworkConnectivityStatus.Offline;
    }

    /* compiled from: NetworkStateManager.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0007R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/salesforce/android/smi/common/internal/util/NetworkStateManager$Companion;", "Lcom/salesforce/android/smi/common/internal/util/SingletonHolder;", "Lcom/salesforce/android/smi/common/internal/util/NetworkStateManager;", "Landroid/content/Context;", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "getNetworkRequestBuilder", "Landroid/net/NetworkRequest$Builder;", "common_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion extends SingletonHolder<NetworkStateManager, Context> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(new Function1() { // from class: com.salesforce.android.smi.common.internal.util.NetworkStateManager$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NetworkStateManager.Companion._init_$lambda$0((Context) obj);
                }
            }, null, null, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final NetworkStateManager _init_$lambda$0(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new NetworkStateManager(context, null, 2, 0 == true ? 1 : 0);
        }

        public final NetworkRequest.Builder getNetworkRequestBuilder() {
            return new NetworkRequest.Builder();
        }
    }
}

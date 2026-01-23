package com.salesforce.android.smi.common.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Produce;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: NetworkStateManager.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/salesforce/android/smi/common/internal/util/NetworkConnectivityStatus;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.salesforce.android.smi.common.internal.util.NetworkStateManager$connectivityStatusFlow$1", m3645f = "NetworkStateManager.kt", m3646l = {65}, m3647m = "invokeSuspend")
/* renamed from: com.salesforce.android.smi.common.internal.util.NetworkStateManager$connectivityStatusFlow$1, reason: use source file name */
/* loaded from: classes12.dex */
final class NetworkStateManager2 extends ContinuationImpl7 implements Function2<Produce4<? super NetworkConnectivityStatus>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NetworkStateManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkStateManager2(NetworkStateManager networkStateManager, Continuation<? super NetworkStateManager2> continuation) {
        super(2, continuation);
        this.this$0 = networkStateManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NetworkStateManager2 networkStateManager2 = new NetworkStateManager2(this.this$0, continuation);
        networkStateManager2.L$0 = obj;
        return networkStateManager2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Produce4<? super NetworkConnectivityStatus> produce4, Continuation<? super Unit> continuation) {
        return ((NetworkStateManager2) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.net.ConnectivityManager$NetworkCallback, com.salesforce.android.smi.common.internal.util.NetworkStateManager$connectivityStatusFlow$1$callback$1] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Produce4 produce4 = (Produce4) this.L$0;
            final NetworkStateManager networkStateManager = this.this$0;
            final ?? r1 = new ConnectivityManager.NetworkCallback() { // from class: com.salesforce.android.smi.common.internal.util.NetworkStateManager$connectivityStatusFlow$1$callback$1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    super.onAvailable(network);
                    networkStateManager.logger.log(Level.INFO, "Network available: " + network.getNetworkHandle());
                    networkStateManager.networkStateMap.put(Long.valueOf(network.getNetworkHandle()), Boolean.TRUE);
                    produce4.mo8337trySendJP2dKIU(networkStateManager.overallNetworkState());
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    super.onLost(network);
                    networkStateManager.logger.log(Level.INFO, "Network lost: " + network.getNetworkHandle());
                    networkStateManager.networkStateMap.put(Long.valueOf(network.getNetworkHandle()), Boolean.FALSE);
                    produce4.mo8337trySendJP2dKIU(networkStateManager.overallNetworkState());
                }
            };
            NetworkRequest networkRequestBuild = NetworkStateManager.INSTANCE.getNetworkRequestBuilder().addCapability(12).addCapability(16).addTransportType(1).addTransportType(0).addTransportType(4).addTransportType(3).build();
            produce4.mo8337trySendJP2dKIU(this.this$0.currentConnection());
            this.this$0.connectivityManager.registerNetworkCallback(networkRequestBuild, (ConnectivityManager.NetworkCallback) r1);
            final NetworkStateManager networkStateManager2 = this.this$0;
            Function0 function0 = new Function0() { // from class: com.salesforce.android.smi.common.internal.util.NetworkStateManager$connectivityStatusFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NetworkStateManager2.invokeSuspend$lambda$0(networkStateManager2, r1);
                }
            };
            this.label = 1;
            if (Produce.awaitClose(produce4, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(NetworkStateManager networkStateManager, NetworkStateManager3 networkStateManager3) {
        networkStateManager.connectivityManager.unregisterNetworkCallback(networkStateManager3);
        return Unit.INSTANCE;
    }
}

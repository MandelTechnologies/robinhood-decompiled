package com.mux.stats.sdk.muxstats;

import android.content.Context;
import android.view.View;
import androidx.media3.common.Player;
import com.mux.stats.sdk.core.CustomOptions;
import com.mux.stats.sdk.core.model.CustomerData;
import com.mux.stats.sdk.muxstats.MuxDataSdk;
import com.mux.stats.sdk.muxstats.MuxPlayerAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;

/* compiled from: MuxStatsSdkMedia3.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003Bq\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/MuxStatsSdkMedia3;", "Landroidx/media3/common/Player;", "P", "Lcom/mux/stats/sdk/muxstats/MuxDataSdk;", "Landroid/view/View;", "Landroid/content/Context;", "context", "", "envKey", "Lcom/mux/stats/sdk/core/model/CustomerData;", "customerData", "player", "playerView", "Lcom/mux/stats/sdk/core/CustomOptions;", "customOptions", "Lcom/mux/stats/sdk/muxstats/INetworkRequest;", "network", "Lcom/mux/stats/sdk/muxstats/IDevice;", "device", "Lcom/mux/stats/sdk/muxstats/MuxDataSdk$LogcatLevel;", "logLevel", "Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;", "playerBinding", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/mux/stats/sdk/core/model/CustomerData;Landroidx/media3/common/Player;Landroid/view/View;Lcom/mux/stats/sdk/core/CustomOptions;Lcom/mux/stats/sdk/muxstats/INetworkRequest;Lcom/mux/stats/sdk/muxstats/IDevice;Lcom/mux/stats/sdk/muxstats/MuxDataSdk$LogcatLevel;Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;)V", "Lcom/mux/stats/sdk/muxstats/AdCollector;", "adCollector$delegate", "Lkotlin/Lazy;", "getAdCollector", "()Lcom/mux/stats/sdk/muxstats/AdCollector;", "adCollector", "getBoundPlayer", "()Landroidx/media3/common/Player;", "boundPlayer", "library_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class MuxStatsSdkMedia3<P extends Player> extends MuxDataSdk<P, View> {

    /* renamed from: adCollector$delegate, reason: from kotlin metadata */
    private final Lazy adCollector;

    public /* synthetic */ MuxStatsSdkMedia3(Context context, String str, CustomerData customerData, Player player, View view, CustomOptions customOptions, INetworkRequest iNetworkRequest, IDevice iDevice, MuxDataSdk.LogcatLevel logcatLevel, MuxPlayerAdapter.PlayerBinding playerBinding, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, customerData, player, (i & 16) != 0 ? null : view, (i & 32) != 0 ? null : customOptions, (i & 64) != 0 ? null : iNetworkRequest, (i & 128) != 0 ? null : iDevice, (i & 256) != 0 ? MuxDataSdk.LogcatLevel.NONE : logcatLevel, playerBinding);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MuxStatsSdkMedia3(Context context, String envKey, CustomerData customerData, P player, View view, CustomOptions customOptions, final INetworkRequest iNetworkRequest, IDevice iDevice, MuxDataSdk.LogcatLevel logLevel, MuxPlayerAdapter.PlayerBinding<P> playerBinding) {
        super(context, envKey, player, view, customerData, iDevice == null ? new MuxDataSdk.AndroidDevice(context, "1.3.x", "mux-media3", "1.5.0", "media3-generic") : iDevice, playerBinding, customOptions == null ? new CustomOptions() : customOptions, true, logLevel, null, null, null, null, null, null, null, new Function1<IDevice, INetworkRequest>() { // from class: com.mux.stats.sdk.muxstats.MuxStatsSdkMedia3.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final INetworkRequest invoke(IDevice iDevice2) {
                Intrinsics.checkNotNullParameter(iDevice2, "iDevice");
                INetworkRequest iNetworkRequest2 = iNetworkRequest;
                return iNetworkRequest2 == null ? new MuxNetwork(iDevice2, CoroutineScope2.CoroutineScope(Dispatchers.getIO())) : iNetworkRequest2;
            }
        }, 130048, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(envKey, "envKey");
        Intrinsics.checkNotNullParameter(customerData, "customerData");
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(playerBinding, "playerBinding");
        this.adCollector = LazyKt.lazy(new Function0<MuxStatsSdkMedia32>(this) { // from class: com.mux.stats.sdk.muxstats.MuxStatsSdkMedia3$adCollector$2
            final /* synthetic */ MuxStatsSdkMedia3<P> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MuxStatsSdkMedia32 invoke() {
                return MuxStatsSdkMedia32.INSTANCE.create$library_At_latestRelease(this.this$0.getCollector(), this.this$0.getEventBus());
            }
        });
    }

    public final P getBoundPlayer() {
        return getPlayer();
    }
}

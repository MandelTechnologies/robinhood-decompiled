package com.mux.stats.sdk.muxstats;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.mux.android.util.UtilKt;
import com.mux.android.util.Weak2;
import com.mux.stats.sdk.core.CustomOptions;
import com.mux.stats.sdk.core.MuxSDKViewOrientation;
import com.mux.stats.sdk.core.events.EventBus;
import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.model.CustomData;
import com.mux.stats.sdk.core.model.CustomerData;
import com.mux.stats.sdk.core.model.CustomerPlayerData;
import com.mux.stats.sdk.core.model.CustomerVideoData;
import com.mux.stats.sdk.core.model.CustomerViewData;
import com.mux.stats.sdk.core.model.CustomerViewerData;
import com.mux.stats.sdk.core.util.MuxLogger;
import com.mux.stats.sdk.muxstats.MuxPlayerAdapter;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.singular.sdk.internal.Constants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONException;

/* compiled from: MuxDataSdk.kt */
@Metadata(m3635d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\b&\u0018\u0000 b*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004:\u0004cbdeBú\u0004\b\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\u0010\n\u001a\u0004\u0018\u00018\u0001\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012:\b\u0002\u0010\u001b\u001a4\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00070\u0017\u0012/\b\u0002\u0010\u001f\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u001c\u0012b\b\u0002\u0010$\u001a\\\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020#0 \u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%\u0012z\b\u0002\u0010-\u001at\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\t\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010(¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b()\u0012\u0013\u0012\u00110*¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(+\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000,0 \u0012M\b\u0002\u00102\u001aG\u0012\u0013\u0012\u00110#¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(/\u0012\u0013\u0012\u001100¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(1\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020*0.\u0012@\b\u0002\u00103\u001a:\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010(0\u0017\u0012#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002040\u001c¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u0002082\b\u0010\u001a\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u0002082\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u0002082\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u0002082\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u000208H\u0016¢\u0006\u0004\bG\u0010HR,\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000,8\u0004X\u0084\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u0010H\u001a\u0004\bK\u0010LR\u001a\u0010/\u001a\u00020#8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b/\u0010N\u001a\u0004\bO\u0010PR \u0010Q\u001a\u00020&8\u0004X\u0084\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010H\u001a\u0004\bS\u0010TR \u0010\t\u001a\u00028\u00008\u0004X\u0084\u0004¢\u0006\u0012\n\u0004\b\t\u0010V\u0012\u0004\bY\u0010H\u001a\u0004\bW\u0010XR&\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(8\u0004X\u0084\u0004¢\u0006\u0012\n\u0004\b)\u0010Z\u0012\u0004\b]\u0010H\u001a\u0004\b[\u0010\\R \u0010+\u001a\u00020*8\u0004X\u0084\u0004¢\u0006\u0012\n\u0004\b+\u0010^\u0012\u0004\ba\u0010H\u001a\u0004\b_\u0010`¨\u0006f"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/MuxDataSdk;", "Player", "Landroid/view/View;", "PlayerView", "", "Landroid/content/Context;", "context", "", "envKey", "player", "playerView", "Lcom/mux/stats/sdk/core/model/CustomerData;", "customerData", "Lcom/mux/stats/sdk/muxstats/IDevice;", "device", "Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;", "playerBinding", "Lcom/mux/stats/sdk/core/CustomOptions;", "customOptions", "", "trackFirstFrame", "Lcom/mux/stats/sdk/muxstats/MuxDataSdk$LogcatLevel;", "logLevel", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "view", "makePlayerId", "Lkotlin/Function1;", "of", "Lcom/mux/stats/sdk/muxstats/IPlayerListener;", "makePlayerListener", "Lkotlin/Function4;", "playerListener", "playerId", "Lcom/mux/stats/sdk/muxstats/MuxStats;", "makeMuxStats", "Lkotlin/Function0;", "Lcom/mux/stats/sdk/core/events/EventBus;", "makeEventBus", "Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;", "uiDelegate", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "collector", "Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter;", "makePlayerAdapter", "Lkotlin/Function3;", "muxStats", "Lcom/mux/stats/sdk/core/events/IEventDispatcher;", "dispatcher", "makeStateCollector", "makeUiDelegate", "Lcom/mux/stats/sdk/muxstats/INetworkRequest;", "makeNetworkRequest", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;Landroid/view/View;Lcom/mux/stats/sdk/core/model/CustomerData;Lcom/mux/stats/sdk/muxstats/IDevice;Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;Lcom/mux/stats/sdk/core/CustomOptions;ZLcom/mux/stats/sdk/muxstats/MuxDataSdk$LogcatLevel;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "", "setPlayerView", "(Landroid/view/View;)V", "Lcom/mux/stats/sdk/core/model/CustomerVideoData;", "videoData", "videoChange", "(Lcom/mux/stats/sdk/core/model/CustomerVideoData;)V", "Lcom/mux/stats/sdk/core/MuxSDKViewOrientation;", "orientation", "orientationChange", "(Lcom/mux/stats/sdk/core/MuxSDKViewOrientation;)V", "Lcom/mux/stats/sdk/muxstats/MuxSDKViewPresentation;", "presentation", "presentationChange", "(Lcom/mux/stats/sdk/muxstats/MuxSDKViewPresentation;)V", "release", "()V", "playerAdapter", "Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter;", "getPlayerAdapter", "()Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter;", "getPlayerAdapter$annotations", "Lcom/mux/stats/sdk/muxstats/MuxStats;", "getMuxStats", "()Lcom/mux/stats/sdk/muxstats/MuxStats;", "eventBus", "Lcom/mux/stats/sdk/core/events/EventBus;", "getEventBus", "()Lcom/mux/stats/sdk/core/events/EventBus;", "getEventBus$annotations", "Ljava/lang/Object;", "getPlayer", "()Ljava/lang/Object;", "getPlayer$annotations", "Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;", "getUiDelegate", "()Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;", "getUiDelegate$annotations", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "getCollector", "()Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "getCollector$annotations", "Factory", "AndroidDevice", "LogcatLevel", "PlayerListenerBase", "core-android_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public abstract class MuxDataSdk<Player, PlayerView extends View> {
    protected static final Factory Factory = new Factory(null);
    private final MuxStateCollector collector;
    private final EventBus eventBus;
    private final MuxStats muxStats;
    private final Player player;
    private final MuxPlayerAdapter<PlayerView, Player> playerAdapter;
    private final MuxUiDelegate<PlayerView> uiDelegate;

    @JvmOverloads
    protected MuxDataSdk(Context context, String envKey, Player player, PlayerView playerview, CustomerData customerData, IDevice device, MuxPlayerAdapter.PlayerBinding<Player> playerBinding, CustomOptions customOptions, boolean z, LogcatLevel logLevel, Function2<? super Context, ? super View, String> makePlayerId, Function1<? super MuxDataSdk<Player, PlayerView>, ? extends IPlayerListener> makePlayerListener, Function4<? super IPlayerListener, ? super String, ? super CustomerData, ? super CustomOptions, ? extends MuxStats> makeMuxStats, Function0<? extends EventBus> makeEventBus, Function4<? super Player, ? super MuxUiDelegate<PlayerView>, ? super MuxStateCollector, ? super MuxPlayerAdapter.PlayerBinding<Player>, MuxPlayerAdapter<PlayerView, Player>> makePlayerAdapter, Function3<? super MuxStats, ? super IEventDispatcher, ? super Boolean, ? extends MuxStateCollector> makeStateCollector, Function2<? super Context, ? super PlayerView, ? extends MuxUiDelegate<PlayerView>> makeUiDelegate, Function1<? super IDevice, ? extends INetworkRequest> makeNetworkRequest) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(envKey, "envKey");
        Intrinsics.checkNotNullParameter(customerData, "customerData");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(playerBinding, "playerBinding");
        Intrinsics.checkNotNullParameter(customOptions, "customOptions");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(makePlayerId, "makePlayerId");
        Intrinsics.checkNotNullParameter(makePlayerListener, "makePlayerListener");
        Intrinsics.checkNotNullParameter(makeMuxStats, "makeMuxStats");
        Intrinsics.checkNotNullParameter(makeEventBus, "makeEventBus");
        Intrinsics.checkNotNullParameter(makePlayerAdapter, "makePlayerAdapter");
        Intrinsics.checkNotNullParameter(makeStateCollector, "makeStateCollector");
        Intrinsics.checkNotNullParameter(makeUiDelegate, "makeUiDelegate");
        Intrinsics.checkNotNullParameter(makeNetworkRequest, "makeNetworkRequest");
        this.player = player;
        MuxStats.setHostDevice(device);
        MuxStats.setHostNetworkApi(makeNetworkRequest.invoke(device));
        if (customerData.getCustomerPlayerData() == null) {
            customerData.setCustomerPlayerData(new CustomerPlayerData());
        }
        if (customerData.getCustomerVideoData() == null) {
            customerData.setCustomerVideoData(new CustomerVideoData());
        }
        if (customerData.getCustomerViewData() == null) {
            customerData.setCustomerViewData(new CustomerViewData());
        }
        if (customerData.getCustomerViewerData() == null) {
            customerData.setCustomerViewerData(new CustomerViewerData());
        }
        if (customerData.getCustomData() == null) {
            customerData.setCustomData(new CustomData());
        }
        if (customerData.getCustomerPlayerData() == null) {
            customerData.setCustomerPlayerData(new CustomerPlayerData());
        }
        customerData.getCustomerPlayerData().setEnvironmentKey(envKey);
        EventBus eventBusInvoke = makeEventBus.invoke();
        this.eventBus = eventBusInvoke;
        MuxUiDelegate<PlayerView> muxUiDelegateInvoke = makeUiDelegate.invoke(context, playerview);
        this.uiDelegate = muxUiDelegateInvoke;
        MuxStats muxStatsInvoke = makeMuxStats.invoke(makePlayerListener.invoke(this), makePlayerId.invoke(context, playerview), customerData, customOptions);
        this.muxStats = muxStatsInvoke;
        MuxStateCollector muxStateCollectorInvoke = makeStateCollector.invoke(muxStatsInvoke, eventBusInvoke, Boolean.valueOf(z));
        this.collector = muxStateCollectorInvoke;
        eventBusInvoke.addListener(muxStatsInvoke);
        muxStatsInvoke.setCustomerData(customerData);
        this.playerAdapter = makePlayerAdapter.invoke(player, muxUiDelegateInvoke, muxStateCollectorInvoke, playerBinding);
        LogcatLevel logcatLevel = LogcatLevel.DEBUG;
        LogcatLevel logcatLevel2 = LogcatLevel.VERBOSE;
        muxStatsInvoke.allowLogcatOutput(UtilKt.oneOf(logLevel, logcatLevel, logcatLevel2), logLevel == logcatLevel2);
    }

    public /* synthetic */ MuxDataSdk(Context context, String str, Object obj, View view, CustomerData customerData, IDevice iDevice, MuxPlayerAdapter.PlayerBinding playerBinding, CustomOptions customOptions, boolean z, LogcatLevel logcatLevel, Function2 function2, Function1 function1, Function4 function4, Function0 function0, Function4 function42, Function3 function3, Function2 function22, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, obj, view, customerData, iDevice, playerBinding, (i & 128) != 0 ? new CustomOptions() : customOptions, (i & 256) != 0 ? false : z, (i & 512) != 0 ? LogcatLevel.NONE : logcatLevel, (i & 1024) != 0 ? new C57341(Factory) : function2, (i & 2048) != 0 ? new C57352(Factory) : function1, (i & 4096) != 0 ? new C57363(Factory) : function4, (i & 8192) != 0 ? new Function0<EventBus>() { // from class: com.mux.stats.sdk.muxstats.MuxDataSdk.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final EventBus invoke() {
                return new EventBus();
            }
        } : function0, (i & 16384) != 0 ? new C57385(Factory) : function42, (32768 & i) != 0 ? new C57396(Factory) : function3, (65536 & i) != 0 ? new C57407(Factory) : function22, (i & 131072) != 0 ? new C57418(Factory) : function12);
    }

    /* compiled from: MuxDataSdk.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.mux.stats.sdk.muxstats.MuxDataSdk$1 */
    /* synthetic */ class C57341 extends FunctionReferenceImpl implements Function2<Context, View, String> {
        C57341(Object obj) {
            super(2, obj, Factory.class, "generatePlayerId", "generatePlayerId(Landroid/content/Context;Landroid/view/View;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(Context p0, View view) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((Factory) this.receiver).generatePlayerId(p0, view);
        }
    }

    /* compiled from: MuxDataSdk.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.mux.stats.sdk.muxstats.MuxDataSdk$2 */
    /* synthetic */ class C57352 extends FunctionReferenceImpl implements Function1<MuxDataSdk<?, ?>, IPlayerListener> {
        C57352(Object obj) {
            super(1, obj, Factory.class, "defaultPlayerListener", "defaultPlayerListener(Lcom/mux/stats/sdk/muxstats/MuxDataSdk;)Lcom/mux/stats/sdk/muxstats/IPlayerListener;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final IPlayerListener invoke(MuxDataSdk<?, ?> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((Factory) this.receiver).defaultPlayerListener(p0);
        }
    }

    /* compiled from: MuxDataSdk.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.mux.stats.sdk.muxstats.MuxDataSdk$3 */
    /* synthetic */ class C57363 extends FunctionReferenceImpl implements Function4<IPlayerListener, String, CustomerData, CustomOptions, MuxStats> {
        C57363(Object obj) {
            super(4, obj, Factory.class, "defaultMuxStats", "defaultMuxStats(Lcom/mux/stats/sdk/muxstats/IPlayerListener;Ljava/lang/String;Lcom/mux/stats/sdk/core/model/CustomerData;Lcom/mux/stats/sdk/core/CustomOptions;)Lcom/mux/stats/sdk/muxstats/MuxStats;", 0);
        }

        @Override // kotlin.jvm.functions.Function4
        public final MuxStats invoke(IPlayerListener p0, String p1, CustomerData p2, CustomOptions p3) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            Intrinsics.checkNotNullParameter(p3, "p3");
            return ((Factory) this.receiver).defaultMuxStats(p0, p1, p2, p3);
        }
    }

    /* compiled from: MuxDataSdk.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.mux.stats.sdk.muxstats.MuxDataSdk$5 */
    /* synthetic */ class C57385 extends FunctionReferenceImpl implements Function4<Player, MuxUiDelegate<PlayerView>, MuxStateCollector, MuxPlayerAdapter.PlayerBinding<Player>, MuxPlayerAdapter<PlayerView, Player>> {
        C57385(Object obj) {
            super(4, obj, Factory.class, "defaultPlayerAdapter", "defaultPlayerAdapter(Ljava/lang/Object;Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;Lcom/mux/stats/sdk/muxstats/MuxStateCollector;Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;)Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter;", 0);
        }

        public final MuxPlayerAdapter<PlayerView, Player> invoke(Player player, MuxUiDelegate<PlayerView> p1, MuxStateCollector p2, MuxPlayerAdapter.PlayerBinding<Player> p3) {
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            Intrinsics.checkNotNullParameter(p3, "p3");
            return ((Factory) this.receiver).defaultPlayerAdapter(player, p1, p2, p3);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, MuxStateCollector muxStateCollector, Object obj3) {
            return invoke((C57385) obj, (MuxUiDelegate) obj2, muxStateCollector, (MuxPlayerAdapter.PlayerBinding<C57385>) obj3);
        }
    }

    /* compiled from: MuxDataSdk.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.mux.stats.sdk.muxstats.MuxDataSdk$6 */
    /* synthetic */ class C57396 extends FunctionReferenceImpl implements Function3<MuxStats, IEventDispatcher, Boolean, MuxStateCollector> {
        C57396(Object obj) {
            super(3, obj, Factory.class, "defaultMuxStateCollector", "defaultMuxStateCollector(Lcom/mux/stats/sdk/muxstats/MuxStats;Lcom/mux/stats/sdk/core/events/IEventDispatcher;Z)Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", 0);
        }

        public final MuxStateCollector invoke(MuxStats p0, IEventDispatcher p1, boolean z) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return ((Factory) this.receiver).defaultMuxStateCollector(p0, p1, z);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ MuxStateCollector invoke(MuxStats muxStats, IEventDispatcher iEventDispatcher, Boolean bool) {
            return invoke(muxStats, iEventDispatcher, bool.booleanValue());
        }
    }

    /* compiled from: MuxDataSdk.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.mux.stats.sdk.muxstats.MuxDataSdk$7 */
    /* synthetic */ class C57407 extends FunctionReferenceImpl implements Function2<Context, PlayerView, MuxUiDelegate<PlayerView>> {
        C57407(Object obj) {
            super(2, obj, Factory.class, "defaultUiDelegate", "defaultUiDelegate(Landroid/content/Context;Landroid/view/View;)Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final MuxUiDelegate<PlayerView> invoke(Context p0, PlayerView playerview) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((Factory) this.receiver).defaultUiDelegate(p0, playerview);
        }
    }

    /* compiled from: MuxDataSdk.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.mux.stats.sdk.muxstats.MuxDataSdk$8 */
    /* synthetic */ class C57418 extends FunctionReferenceImpl implements Function1<IDevice, MuxNetwork> {
        C57418(Object obj) {
            super(1, obj, Factory.class, "defaultNetworkRequest", "defaultNetworkRequest(Lcom/mux/stats/sdk/muxstats/IDevice;)Lcom/mux/stats/sdk/muxstats/MuxNetwork;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final MuxNetwork invoke(IDevice p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((Factory) this.receiver).defaultNetworkRequest(p0);
        }
    }

    protected final EventBus getEventBus() {
        return this.eventBus;
    }

    protected final Player getPlayer() {
        return this.player;
    }

    protected final MuxUiDelegate<PlayerView> getUiDelegate() {
        return this.uiDelegate;
    }

    protected final MuxStateCollector getCollector() {
        return this.collector;
    }

    public void setPlayerView(PlayerView view) {
        this.uiDelegate.setView(view);
    }

    public void videoChange(CustomerVideoData videoData) {
        Intrinsics.checkNotNullParameter(videoData, "videoData");
        this.collector.videoChange(videoData);
    }

    public void orientationChange(MuxSDKViewOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.muxStats.orientationChange(orientation);
    }

    public void presentationChange(MuxSDKViewPresentation presentation) {
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        this.muxStats.presentationChange(presentation);
    }

    public void release() {
        this.playerAdapter.unbindEverything();
        this.muxStats.release();
    }

    /* compiled from: MuxDataSdk.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0094\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u001eR\u001c\u0010%\u001a\u0004\u0018\u00010 8DX\u0084\u0004¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006&"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/MuxDataSdk$PlayerListenerBase;", "Lcom/mux/stats/sdk/muxstats/IPlayerListener;", "<init>", "(Lcom/mux/stats/sdk/muxstats/MuxDataSdk;)V", "", "getCurrentPosition", "()J", "", "getMimeType", "()Ljava/lang/String;", "", "getSourceWidth", "()Ljava/lang/Integer;", "getSourceHeight", "getSourceAdvertisedBitrate", "", "getSourceAdvertisedFramerate", "()Ljava/lang/Float;", "getSourceDuration", "()Ljava/lang/Long;", "", "isPaused", "()Z", "getPlayerProgramTime", "getPlayerManifestNewestTime", "getVideoHoldback", "getVideoPartHoldback", "getVideoPartTargetDuration", "getVideoTargetDuration", "getPlayerViewWidth", "()I", "getPlayerViewHeight", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "getCollector", "()Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "getCollector$annotations", "()V", "collector", "core-android_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    protected class PlayerListenerBase implements IPlayerListener {
        public PlayerListenerBase() {
        }

        protected final MuxStateCollector getCollector() {
            return MuxDataSdk.this.getCollector();
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public long getCurrentPosition() {
            MuxStateCollector collector = getCollector();
            if (collector != null) {
                return collector.getPlaybackPositionMills();
            }
            return 0L;
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public String getMimeType() {
            MuxStateCollector collector = getCollector();
            if (collector != null) {
                return collector.getMimeType();
            }
            return null;
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public Integer getSourceWidth() {
            MuxStateCollector collector = getCollector();
            if (collector != null) {
                return Integer.valueOf(collector.getSourceWidth());
            }
            return null;
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public Integer getSourceHeight() {
            MuxStateCollector collector = getCollector();
            if (collector != null) {
                return Integer.valueOf(collector.getSourceHeight());
            }
            return null;
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public Integer getSourceAdvertisedBitrate() {
            MuxStateCollector collector = getCollector();
            if (collector != null) {
                return Integer.valueOf(collector.getSourceAdvertisedBitrate());
            }
            return null;
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public Float getSourceAdvertisedFramerate() {
            MuxStateCollector collector = getCollector();
            if (collector != null) {
                return Float.valueOf(collector.getSourceAdvertisedFrameRate());
            }
            return null;
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public Long getSourceDuration() {
            MuxStateCollector collector = getCollector();
            if (collector != null) {
                return Long.valueOf(collector.getSourceDurationMs());
            }
            return null;
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public boolean isPaused() {
            MuxStateCollector collector = getCollector();
            if (collector != null) {
                return collector.isPaused();
            }
            return true;
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public Long getPlayerProgramTime() {
            MuxStateCollector collector = getCollector();
            if (collector != null) {
                return collector.getHlsPlayerProgramTime();
            }
            return null;
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public Long getPlayerManifestNewestTime() {
            MuxStateCollector collector = getCollector();
            if (collector != null) {
                return collector.getHlsManifestNewestTime();
            }
            return null;
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public Long getVideoHoldback() {
            MuxStateCollector collector = getCollector();
            if (collector != null) {
                return collector.getHlsHoldBack();
            }
            return null;
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public Long getVideoPartHoldback() {
            MuxStateCollector collector = getCollector();
            if (collector != null) {
                return collector.getHlsPartHoldBack();
            }
            return null;
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public Long getVideoPartTargetDuration() {
            MuxStateCollector collector = getCollector();
            if (collector != null) {
                return collector.getHlsPartTargetDuration();
            }
            return null;
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public Long getVideoTargetDuration() {
            MuxStateCollector collector = getCollector();
            if (collector != null) {
                return collector.getHlsTargetDuration();
            }
            return null;
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public int getPlayerViewWidth() {
            return UtilKt.convertPxToDp(MuxDataSdk.this.getUiDelegate().getPlayerViewSize().x, MuxDataSdk.this.getUiDelegate().getDisplayDensity());
        }

        @Override // com.mux.stats.sdk.muxstats.IPlayerListener
        public int getPlayerViewHeight() {
            return UtilKt.convertPxToDp(MuxDataSdk.this.getUiDelegate().getPlayerViewSize().y, MuxDataSdk.this.getUiDelegate().getDisplayDensity());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MuxDataSdk.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/MuxDataSdk$LogcatLevel;", "", "(Ljava/lang/String;I)V", "NONE", "DEBUG", "VERBOSE", "core-android_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class LogcatLevel {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LogcatLevel[] $VALUES;
        public static final LogcatLevel NONE = new LogcatLevel("NONE", 0);
        public static final LogcatLevel DEBUG = new LogcatLevel("DEBUG", 1);
        public static final LogcatLevel VERBOSE = new LogcatLevel("VERBOSE", 2);

        private static final /* synthetic */ LogcatLevel[] $values() {
            return new LogcatLevel[]{NONE, DEBUG, VERBOSE};
        }

        public static EnumEntries<LogcatLevel> getEntries() {
            return $ENTRIES;
        }

        public static LogcatLevel valueOf(String str) {
            return (LogcatLevel) Enum.valueOf(LogcatLevel.class, str);
        }

        public static LogcatLevel[] values() {
            return (LogcatLevel[]) $VALUES.clone();
        }

        static {
            LogcatLevel[] logcatLevelArr$values = $values();
            $VALUES = logcatLevelArr$values;
            $ENTRIES = EnumEntries2.enumEntries(logcatLevelArr$values);
        }

        private LogcatLevel(String str, int i) {
        }
    }

    /* compiled from: MuxDataSdk.kt */
    @Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ&\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017JS\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u0002H\u001b0\u0019\"\u0004\b\u0002\u0010\u001b\"\b\b\u0003\u0010\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u0002H\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001f2\u0006\u0010 \u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001b0\"¢\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\r2\u000e\u0010%\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&J-\u0010'\u001a\b\u0012\u0004\u0012\u0002H(0\u001f\"\b\b\u0002\u0010(*\u00020\u001c2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u0001H(¢\u0006\u0002\u0010,J\u0018\u0010-\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u001c¨\u0006."}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/MuxDataSdk$Factory;", "", "()V", "defaultMuxStateCollector", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "muxStats", "Lcom/mux/stats/sdk/muxstats/MuxStats;", "dispatcher", "Lcom/mux/stats/sdk/core/events/IEventDispatcher;", "trackFirstFrame", "", "defaultMuxStats", "playerListener", "Lcom/mux/stats/sdk/muxstats/IPlayerListener;", "playerId", "", "customerData", "Lcom/mux/stats/sdk/core/model/CustomerData;", "customOptions", "Lcom/mux/stats/sdk/core/CustomOptions;", "defaultNetworkRequest", "Lcom/mux/stats/sdk/muxstats/MuxNetwork;", "device", "Lcom/mux/stats/sdk/muxstats/IDevice;", "defaultPlayerAdapter", "Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter;", "PlayerView", "Player", "Landroid/view/View;", "player", "uiDelegate", "Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;", "collector", "playerBinding", "Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;", "(Ljava/lang/Object;Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;Lcom/mux/stats/sdk/muxstats/MuxStateCollector;Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;)Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter;", "defaultPlayerListener", "outerSdk", "Lcom/mux/stats/sdk/muxstats/MuxDataSdk;", "defaultUiDelegate", "V", "context", "Landroid/content/Context;", "view", "(Landroid/content/Context;Landroid/view/View;)Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;", "generatePlayerId", "core-android_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    protected static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Factory() {
        }

        public final String generatePlayerId(Context context, View view) {
            Intrinsics.checkNotNullParameter(context, "context");
            StringBuilder sb = new StringBuilder();
            String canonicalName = context.getClass().getCanonicalName();
            Intrinsics.checkNotNull(canonicalName);
            sb.append(canonicalName);
            sb.append(view != null ? Integer.valueOf(view.getId()) : "audio");
            return sb.toString();
        }

        public final IPlayerListener defaultPlayerListener(MuxDataSdk<?, ?> outerSdk) {
            Intrinsics.checkNotNullParameter(outerSdk, "outerSdk");
            return new PlayerListenerBase();
        }

        public final <V extends View> MuxUiDelegate<V> defaultUiDelegate(Context context, V view) {
            MuxUiDelegate<V> muxUiDelegate;
            Intrinsics.checkNotNullParameter(context, "context");
            return (view == null || (muxUiDelegate = MuxUiDelegate3.muxUiDelegate(view, context)) == null) ? MuxUiDelegate3.noUiDelegate(context) : muxUiDelegate;
        }

        public final MuxStats defaultMuxStats(IPlayerListener playerListener, String playerId, CustomerData customerData, CustomOptions customOptions) {
            Intrinsics.checkNotNullParameter(playerListener, "playerListener");
            Intrinsics.checkNotNullParameter(playerId, "playerId");
            Intrinsics.checkNotNullParameter(customerData, "customerData");
            Intrinsics.checkNotNullParameter(customOptions, "customOptions");
            return new MuxStats(playerListener, playerId, customerData, customOptions);
        }

        public final <Player, PlayerView extends View> MuxPlayerAdapter<PlayerView, Player> defaultPlayerAdapter(Player player, MuxUiDelegate<PlayerView> uiDelegate, MuxStateCollector collector, MuxPlayerAdapter.PlayerBinding<Player> playerBinding) {
            Intrinsics.checkNotNullParameter(uiDelegate, "uiDelegate");
            Intrinsics.checkNotNullParameter(collector, "collector");
            Intrinsics.checkNotNullParameter(playerBinding, "playerBinding");
            return new MuxPlayerAdapter<>(player, collector, uiDelegate, playerBinding);
        }

        public final MuxStateCollector defaultMuxStateCollector(MuxStats muxStats, IEventDispatcher dispatcher, boolean trackFirstFrame) {
            Intrinsics.checkNotNullParameter(muxStats, "muxStats");
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            return new MuxStateCollector(muxStats, dispatcher, trackFirstFrame);
        }

        public final MuxNetwork defaultNetworkRequest(IDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            return new MuxNetwork(device, CoroutineScope2.CoroutineScope(Dispatchers.getIO()));
        }
    }

    /* compiled from: MuxDataSdk.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 92\u00020\u0001:\u00019B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\fJ\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010%\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010!\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b%\u0010&J'\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010'J\u0011\u0010(\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b(\u0010\fJ\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0002H\u0003¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b/\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u001d\u00105\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00100R\u0016\u00107\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00100R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00100¨\u0006:"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/MuxDataSdk$AndroidDevice;", "Lcom/mux/stats/sdk/muxstats/IDevice;", "Landroid/content/Context;", "ctx", "", "playerVersion", "muxPluginName", "muxPluginVersion", "playerSoftware", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHardwareArchitecture", "()Ljava/lang/String;", "getOSFamily", "getOSVersion", "getDeviceName", "getDeviceCategory", "getManufacturer", "getModelName", "getPlayerVersion", "getDeviceId", "getAppName", "getAppVersion", "getPluginName", "getPluginVersion", "getPlayerSoftware", "getNetworkConnectionType", "", "getElapsedRealtime", "()J", "Lcom/mux/stats/sdk/muxstats/LogPriority;", "logPriority", "tag", "msg", "", "t", "", "outputLog", "(Lcom/mux/stats/sdk/muxstats/LogPriority;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Lcom/mux/stats/sdk/muxstats/LogPriority;Ljava/lang/String;Ljava/lang/String;)V", "connectionTypeApi23", "context", "getOrCreateDeviceId", "(Landroid/content/Context;)Ljava/lang/String;", "Landroid/content/pm/PackageInfo;", "getPackageInfoLegacy", "(Landroid/content/Context;)Landroid/content/pm/PackageInfo;", "getPackageInfoApi33", "Ljava/lang/String;", "contextRef$delegate", "Lkotlin/properties/ReadWriteProperty;", "getContextRef", "()Landroid/content/Context;", "contextRef", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "appName", "appVersion", "Companion", "core-android_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static class AndroidDevice implements IDevice {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AndroidDevice.class, "contextRef", "getContextRef()Landroid/content/Context;", 0))};
        private String appName;
        private String appVersion;

        /* renamed from: contextRef$delegate, reason: from kotlin metadata */
        private final Interfaces3 contextRef;
        private final String deviceId;
        private final String muxPluginName;
        private final String muxPluginVersion;
        private final String playerSoftware;
        private final String playerVersion;

        /* compiled from: MuxDataSdk.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LogPriority.values().length];
                try {
                    iArr[LogPriority.ERROR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LogPriority.WARN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LogPriority.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LogPriority.DEBUG.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[LogPriority.VERBOSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AndroidDevice(Context ctx, String playerVersion, String muxPluginName, String muxPluginVersion, String playerSoftware) {
            PackageInfo packageInfoLegacy;
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(playerVersion, "playerVersion");
            Intrinsics.checkNotNullParameter(muxPluginName, "muxPluginName");
            Intrinsics.checkNotNullParameter(muxPluginVersion, "muxPluginVersion");
            Intrinsics.checkNotNullParameter(playerSoftware, "playerSoftware");
            this.playerVersion = playerVersion;
            this.muxPluginName = muxPluginName;
            this.muxPluginVersion = muxPluginVersion;
            this.playerSoftware = playerSoftware;
            this.contextRef = Weak2.weak(ctx);
            this.appName = "";
            this.appVersion = "";
            this.deviceId = getOrCreateDeviceId(ctx);
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageInfoLegacy = getPackageInfoApi33(ctx);
                } else {
                    packageInfoLegacy = getPackageInfoLegacy(ctx);
                }
                String packageName = packageInfoLegacy.packageName;
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                this.appName = packageName;
                String versionName = packageInfoLegacy.versionName;
                Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
                this.appVersion = versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                MuxLogger.m1117d("MuxDevice", "could not get package info");
            }
        }

        private final Context getContextRef() {
            return (Context) this.contextRef.getValue(this, $$delegatedProperties[0]);
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public String getHardwareArchitecture() {
            return Build.HARDWARE;
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public String getOSFamily() {
            return "Android";
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public String getOSVersion() {
            return Build.VERSION.RELEASE + " (" + Build.VERSION.SDK_INT + ')';
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public String getDeviceName() {
            return "";
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public String getDeviceCategory() {
            return "";
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public String getManufacturer() {
            return Build.MANUFACTURER;
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public String getModelName() {
            return Build.MODEL;
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public String getPlayerVersion() {
            return this.playerVersion;
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public String getDeviceId() {
            return this.deviceId;
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public String getAppName() {
            return this.appName;
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public String getAppVersion() {
            return this.appVersion;
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        /* renamed from: getPluginName, reason: from getter */
        public String getMuxPluginName() {
            return this.muxPluginName;
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        /* renamed from: getPluginVersion, reason: from getter */
        public String getMuxPluginVersion() {
            return this.muxPluginVersion;
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public String getPlayerSoftware() {
            return this.playerSoftware;
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public String getNetworkConnectionType() {
            return connectionTypeApi23();
        }

        @TargetApi(23)
        private final String connectionTypeApi23() {
            Context contextRef = getContextRef();
            if (contextRef == null) {
                return null;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) contextRef.getSystemService(ConnectivityManager.class);
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                MuxLogger.m1118w("MuxDevice", "Could not get network capabilities");
                return null;
            }
            if (networkCapabilities.hasTransport(3)) {
                return "wired";
            }
            if (networkCapabilities.hasTransport(1)) {
                return Constants.WIFI;
            }
            if (networkCapabilities.hasTransport(0)) {
                return "cellular";
            }
            return "other";
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public long getElapsedRealtime() {
            return SystemClock.elapsedRealtime();
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public void outputLog(LogPriority logPriority, String tag, String msg, Throwable t) {
            int i = logPriority == null ? -1 : WhenMappings.$EnumSwitchMapping$0[logPriority.ordinal()];
            if (i == 1) {
                Log.e(tag, msg, t);
                return;
            }
            if (i == 2) {
                Log.w(tag, msg, t);
                return;
            }
            if (i == 3) {
                Log.i(tag, msg, t);
                return;
            }
            if (i == 4) {
                Log.d(tag, msg, t);
            } else if (i == 5) {
                Log.v(tag, msg, t);
            } else {
                Log.v(tag, msg, t);
            }
        }

        @Override // com.mux.stats.sdk.muxstats.IDevice
        public void outputLog(LogPriority logPriority, String tag, String msg) {
            Intrinsics.checkNotNullParameter(logPriority, "logPriority");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            outputLog(logPriority, tag, msg, null);
        }

        @SuppressLint({"ApplySharedPref"})
        private final synchronized String getOrCreateDeviceId(Context context) {
            String string2;
            SharedPreferences sharedPreferences = context.getSharedPreferences("MUX_DEVICE_ID", 0);
            string2 = sharedPreferences.getString("MUX_DEVICE_ID", null);
            if (string2 == null) {
                string2 = UUID.randomUUID().toString();
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("MUX_DEVICE_ID", string2);
                editorEdit.commit();
            }
            return string2;
        }

        private final PackageInfo getPackageInfoLegacy(Context ctx) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
            return packageInfo;
        }

        @TargetApi(33)
        private final PackageInfo getPackageInfoApi33(Context ctx) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
            return packageInfo;
        }
    }
}

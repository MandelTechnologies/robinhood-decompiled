package io.bitdrift.capture.attributes;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import com.singular.sdk.internal.Constants;
import io.bitdrift.capture.providers.FieldProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkAttributes.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0012j\u0002`\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0003J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001e\u0010\u001b\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001d2\u0006\u0010\u001e\u001a\u00020\nH\u0002J\b\u0010\u001f\u001a\u00020\nH\u0002J\u0012\u0010 \u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n`\u000e8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lio/bitdrift/capture/attributes/NetworkAttributes;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lio/bitdrift/capture/providers/FieldProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "currentNetworkType", "Ljava/util/concurrent/atomic/AtomicReference;", "", "radioTypeNameMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "telephonyManager", "Landroid/telephony/TelephonyManager;", "invoke", "", "Lio/bitdrift/capture/providers/Fields;", "monitorNetworkType", "", "onCapabilitiesChanged", "network", "Landroid/net/Network;", "networkCapabilities", "Landroid/net/NetworkCapabilities;", "permissiveOperation", "func", "Lkotlin/Function0;", "permission", "radioType", "updateNetworkType", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SuppressLint({"MissingPermission"})
/* loaded from: classes14.dex */
public final class NetworkAttributes extends ConnectivityManager.NetworkCallback implements FieldProvider {
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private final AtomicReference<String> currentNetworkType;

    @SuppressLint({"InlinedApi"})
    private final HashMap<Integer, String> radioTypeNameMap;
    private final TelephonyManager telephonyManager;

    public NetworkAttributes(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.radioTypeNameMap = MapsKt.hashMapOf(Tuples4.m3642to(7, "onExRtt"), Tuples4.m3642to(4, "cdma"), Tuples4.m3642to(2, "edge"), Tuples4.m3642to(14, "ehrpd"), Tuples4.m3642to(5, "evdo0"), Tuples4.m3642to(6, "evdoA"), Tuples4.m3642to(12, "evdoB"), Tuples4.m3642to(1, "gprs"), Tuples4.m3642to(16, "gsm"), Tuples4.m3642to(8, "hsdpa"), Tuples4.m3642to(10, "hspa"), Tuples4.m3642to(15, "hspap"), Tuples4.m3642to(9, "hsupa"), Tuples4.m3642to(18, "iwlan"), Tuples4.m3642to(13, "lte"), Tuples4.m3642to(20, "nr"), Tuples4.m3642to(17, "tdScdma"), Tuples4.m3642to(3, "umts"), Tuples4.m3642to(0, "unknown"));
        this.currentNetworkType = new AtomicReference<>("unknown");
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        this.telephonyManager = (TelephonyManager) systemService;
        Object systemService2 = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService2;
        monitorNetworkType();
    }

    @Override // io.bitdrift.capture.providers.FieldProvider, kotlin.jvm.functions.Function0
    public Map<String, ? extends String> invoke() {
        return MapsKt.mapOf(Tuples4.m3642to("carrier", this.telephonyManager.getNetworkOperatorName()), Tuples4.m3642to("network_type", this.currentNetworkType.get()), Tuples4.m3642to("radio_type", permissiveOperation(new Function0<String>() { // from class: io.bitdrift.capture.attributes.NetworkAttributes.invoke.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return NetworkAttributes.this.radioType();
            }
        }, "android.permission.READ_PHONE_STATE")));
    }

    @SuppressLint({"NewApi"})
    private final void monitorNetworkType() {
        if (ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                Network activeNetwork = this.connectivityManager.getActiveNetwork();
                if (activeNetwork != null) {
                    updateNetworkType(this.connectivityManager.getNetworkCapabilities(activeNetwork));
                }
                this.connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), this);
            } catch (Throwable unused) {
                updateNetworkType(new NetworkCapabilities(null));
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        updateNetworkType(networkCapabilities);
    }

    private final void updateNetworkType(NetworkCapabilities networkCapabilities) {
        String str;
        AtomicReference<String> atomicReference = this.currentNetworkType;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(1)) {
                str = "wlan";
            } else if (networkCapabilities.hasTransport(0)) {
                str = Constants.WWAN;
            } else {
                str = networkCapabilities.hasTransport(3) ? "ethernet" : "other";
            }
        } else {
            str = "unknown";
        }
        atomicReference.set(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String radioType() {
        String str = this.radioTypeNameMap.get(Integer.valueOf(this.telephonyManager.getNetworkType()));
        return str == null ? "unknown" : str;
    }

    private final String permissiveOperation(Function0<String> func, String permission) {
        if (ContextCompat.checkSelfPermission(this.context, permission) != 0) {
            return "forbidden";
        }
        return func.invoke();
    }
}

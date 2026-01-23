package androidx.core.net;

import android.net.ConnectivityManager;

/* loaded from: classes4.dex */
public final class ConnectivityManagerCompat {
    @Deprecated
    public static boolean isActiveNetworkMetered(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}

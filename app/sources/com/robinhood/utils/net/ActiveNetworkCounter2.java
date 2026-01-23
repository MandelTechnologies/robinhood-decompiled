package com.robinhood.utils.net;

import android.net.ConnectivityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActiveNetworkCounter.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"registerNetworkCallback", "", "Landroid/net/ConnectivityManager;", "counter", "Lcom/robinhood/utils/net/ActiveNetworkCounter;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.net.ActiveNetworkCounterKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ActiveNetworkCounter2 {
    public static final void registerNetworkCallback(ConnectivityManager connectivityManager, ActiveNetworkCounter counter) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        Intrinsics.checkNotNullParameter(counter, "counter");
        connectivityManager.registerNetworkCallback(ActiveNetworkCounter.INSTANCE.getNetworkRequest(), counter);
    }
}

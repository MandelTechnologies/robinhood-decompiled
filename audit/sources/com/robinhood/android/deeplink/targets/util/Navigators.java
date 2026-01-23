package com.robinhood.android.deeplink.targets.util;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.home.contracts.WatchListIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Navigators.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"getWatchlistScreenIntent", "Landroid/content/Intent;", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "watchlistScreen", "Lcom/robinhood/android/home/contracts/WatchlistScreen;", "lib-deeplink-targets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.targets.util.NavigatorsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Navigators {
    public static final Intent getWatchlistScreenIntent(Navigator navigator, Context context, WatchListIntentKey2 watchlistScreen) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(watchlistScreen, "watchlistScreen");
        return Navigator.DefaultImpls.createIntent$default(navigator, context, new WatchListIntentKey(watchlistScreen), null, false, 12, null);
    }
}

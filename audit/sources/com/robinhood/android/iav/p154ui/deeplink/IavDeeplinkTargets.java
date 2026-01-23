package com.robinhood.android.iav.p154ui.deeplink;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.home.contracts.WatchListIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;

/* compiled from: IavDeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, m3636d2 = {"getWatchlistScreenIntent", "Landroid/content/Intent;", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "watchlistScreen", "Lcom/robinhood/android/home/contracts/WatchlistScreen;", "feature-iav_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.iav.ui.deeplink.IavDeeplinkTargetsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IavDeeplinkTargets {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent getWatchlistScreenIntent(Navigator navigator, Context context, WatchListIntentKey2 watchListIntentKey2) {
        return Navigator.DefaultImpls.createIntent$default(navigator, context, new WatchListIntentKey(watchListIntentKey2), null, false, 12, null);
    }
}

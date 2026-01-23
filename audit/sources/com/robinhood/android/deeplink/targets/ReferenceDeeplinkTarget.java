package com.robinhood.android.deeplink.targets;

import android.content.Intent;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.deeplink.targets.util.Navigators;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.GoldReferenceManualPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Targets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/ReferenceDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ReferenceDeeplinkTarget extends DeeplinkTarget4 {
    public static final ReferenceDeeplinkTarget INSTANCE = new ReferenceDeeplinkTarget();
    public static final int $stable = 8;

    private ReferenceDeeplinkTarget() {
        super(DeepLinkPath.REFERENCE.getPath(), false, false, false, false, false, null, 102, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intent watchlistScreenIntent;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("identifier");
        if (queryParameter != null) {
            int iHashCode = queryParameter.hashCode();
            int i = 1;
            GoldReferenceManualPage goldReferenceManualPage = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            if (iHashCode != -1249474914) {
                if (iHashCode != -340598160) {
                    if (iHashCode == 3178592 && queryParameter.equals(AnalyticsStrings.TAB_NAV_TAB_BAR_GOLD_UPGRADE)) {
                        watchlistScreenIntent = Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new LegacyIntentKey.ReferenceManual.Gold(goldReferenceManualPage, i, objArr5 == true ? 1 : 0), null, false, 12, null);
                    } else {
                        watchlistScreenIntent = Navigators.getWatchlistScreenIntent(deeplinkContext.getNavigator(), deeplinkContext.getContext(), WatchListIntentKey2.HELP);
                    }
                } else if (queryParameter.equals("options_nux")) {
                    watchlistScreenIntent = Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new LegacyIntentKey.ReferenceManual.OptionNux(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0), null, false, 12, null);
                }
            } else if (queryParameter.equals("options")) {
                watchlistScreenIntent = Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new LegacyIntentKey.ReferenceManual.Options(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), null, false, 12, null);
            }
        }
        return new Intent[]{watchlistScreenIntent};
    }
}

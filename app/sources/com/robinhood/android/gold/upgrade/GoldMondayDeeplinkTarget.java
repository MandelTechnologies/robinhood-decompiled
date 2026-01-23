package com.robinhood.android.gold.upgrade;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldMondayDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/GoldMondayDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldMondayDeeplinkTarget extends DeeplinkTarget4 {
    public static final GoldMondayDeeplinkTarget INSTANCE = new GoldMondayDeeplinkTarget();
    public static final int $stable = 8;

    private GoldMondayDeeplinkTarget() {
        super(DeepLinkPath.GOLD_MONDAY.getPath(), false, true, false, false, false, null, 106, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("source");
        if (queryParameter == null) {
            queryParameter = "gold_monday_deeplink";
        }
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        Uri uri = Uri.parse("robinhood://upgrade_gold?feature=gold_days&source=" + queryParameter);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        return Navigator.DefaultImpls.resolveDeepLink$default(navigator, context, uri, null, DeepLinkOrigin.Internal.INSTANCE, false, 20, null);
    }
}

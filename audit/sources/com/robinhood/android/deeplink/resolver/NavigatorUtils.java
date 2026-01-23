package com.robinhood.android.deeplink.resolver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigatorUtils.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"getMainIntent", "Landroid/content/Intent;", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "requiresMainActivity", "", "handleMalformedUri", "", WebsocketGatewayConstants.DATA_KEY, "Landroid/net/Uri;", "(Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Landroid/net/Uri;)[Landroid/content/Intent;", "lib-deeplink-resolver_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.resolver.NavigatorUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class NavigatorUtils {
    public static final Intent getMainIntent(Navigator navigator, Context context, boolean z) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (z) {
            return getMainIntent(navigator, context);
        }
        return null;
    }

    public static final Intent getMainIntent(Navigator navigator, Context context) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return Navigator.DefaultImpls.createIntent$default(navigator, context, MainActivityIntentKey.INSTANCE, null, false, 12, null);
    }

    public static final Intent[] handleMalformedUri(Navigator navigator, Context context, Uri data) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Toast.makeText(context, context.getString(C13954R.string.applink_unrecognized_uri_error, data), 1).show();
        return new Intent[]{getMainIntent(navigator, context)};
    }
}

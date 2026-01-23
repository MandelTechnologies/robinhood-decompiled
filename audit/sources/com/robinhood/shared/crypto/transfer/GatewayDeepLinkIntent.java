package com.robinhood.shared.crypto.transfer;

import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GatewayDeepLinkIntent.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"gatewayDeepLinkIntent", "Landroid/content/Intent;", "path", "", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.GatewayDeepLinkIntentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class GatewayDeepLinkIntent {
    public static /* synthetic */ Intent gatewayDeepLinkIntent$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return gatewayDeepLinkIntent(str);
    }

    public static final Intent gatewayDeepLinkIntent(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("robinhood-wallet://" + path));
        return intent;
    }
}

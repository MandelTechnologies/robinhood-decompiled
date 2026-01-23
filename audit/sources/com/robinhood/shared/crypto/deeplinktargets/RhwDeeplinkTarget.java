package com.robinhood.shared.crypto.deeplinktargets;

import android.content.Intent;
import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.util.play.GooglePlay;
import com.robinhood.shared.app.type.AppType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhwDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/deeplinktargets/RhwDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RhwDeeplinkTarget extends DeeplinkTarget4 {
    public static final RhwDeeplinkTarget INSTANCE = new RhwDeeplinkTarget();

    private RhwDeeplinkTarget() {
        super("rhw", false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Uri uri;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("url");
        Intent intent = new Intent("android.intent.action.VIEW");
        if (queryParameter == null || (uri = Uri.parse(queryParameter)) == null) {
            uri = deeplinkContext.getUri();
        }
        intent.setData(uri);
        if (!(intent.resolveActivity(deeplinkContext.getContext().getPackageManager()) != null)) {
            intent = GooglePlay.INSTANCE.playStoreIntent(deeplinkContext.getContext(), AppType.NCW);
            if (intent.resolveActivity(deeplinkContext.getContext().getPackageManager()) == null) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.robinhood.gateway"));
                Unit unit = Unit.INSTANCE;
            }
        }
        return new Intent[]{intent};
    }
}

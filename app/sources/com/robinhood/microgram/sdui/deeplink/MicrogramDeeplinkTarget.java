package com.robinhood.microgram.sdui.deeplink;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey2;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: MicrogramDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/deeplink/MicrogramDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class MicrogramDeeplinkTarget extends DeeplinkTarget4 {
    public static final MicrogramDeeplinkTarget INSTANCE = new MicrogramDeeplinkTarget();
    public static final int $stable = 8;

    private MicrogramDeeplinkTarget() {
        super("microgram_launch", false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        if (queryParameter != null) {
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new MicrogramRouterFragmentKey(new RemoteMicrogramApplication(queryParameter, null, 2, null), deeplinkContext.getUri().getQueryParameter("deeplink"), null, MicrogramRouterFragmentKey2.INSTANCE.from(deeplinkContext.getUri().getQueryParameter("loading_type")), MicrogramRouterFragmentKey3.INSTANCE.from(deeplinkContext.getUri().getQueryParameter("nav")), 4, null), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
        }
        return new Intent[0];
    }
}

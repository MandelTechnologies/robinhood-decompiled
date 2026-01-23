package com.robinhood.shared.user.lib.deeplink.targets;

import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.user.contracts.WelcomeIntentKey;
import com.robinhood.shared.user.contracts.auth.Login;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LogInDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\tJ \u0010\n\u001a\u00020\u0006*\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/user/lib/deeplink/targets/LogInDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "logInIntent", "username", "", "postLogInDeeplink", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class LogInDeeplinkTarget extends DeeplinkTarget4 {
    public static final LogInDeeplinkTarget INSTANCE = new LogInDeeplinkTarget();

    private LogInDeeplinkTarget() {
        super("log_in", false, false, false, false, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("username");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("post_login");
        if (deeplinkContext.getUri().getBooleanQueryParameter("no_backstack", false)) {
            return new Intent[]{logInIntent(deeplinkContext, queryParameter, queryParameter2)};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), WelcomeIntentKey.INSTANCE, null, false, 12, null), logInIntent(deeplinkContext, queryParameter, queryParameter2)};
    }

    private final Intent logInIntent(DeeplinkTarget2 deeplinkTarget2, String str, String str2) {
        return Navigator.DefaultImpls.createIntent$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), new Login(str, str2 != null ? Uri.parse(str2) : null, false, 4, null), null, false, 12, null);
    }
}

package com.robinhood.shared.user.lib.deeplink.targets;

import android.content.Intent;
import android.widget.Toast;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.common.lib.deeplink.targets.C37467R;
import com.robinhood.shared.user.contracts.WelcomeIntentKey;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogNonfatalDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/user/lib/deeplink/targets/LogNonfatalDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class LogNonfatalDeeplinkTarget extends DeeplinkTarget4 {
    public static final LogNonfatalDeeplinkTarget INSTANCE = new LogNonfatalDeeplinkTarget();

    private LogNonfatalDeeplinkTarget() {
        super("log_nonfatal", false, false, false, true, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new LogNonfatalDeeplinkTarget2(), false, null, 6, null);
        Toast.makeText(deeplinkContext.getContext(), C37467R.string.nonfatal_info_sent_message, 1).show();
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), WelcomeIntentKey.INSTANCE, null, false, 12, null)};
    }
}

package com.robinhood.android.crypto.lib.deeplink.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.crypto.contracts.CryptoSettings;
import kotlin.Metadata;

/* compiled from: TraderCryptoSettingsTargets.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"getIntent", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.lib.deeplink.targets.TraderCryptoSettingsTargetsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class TraderCryptoSettingsTargets3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] getIntent(DeeplinkTarget2 deeplinkTarget2) {
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), CryptoSettings.INSTANCE, false, false, false, null, false, false, false, false, false, null, false, 8188, null)};
    }
}

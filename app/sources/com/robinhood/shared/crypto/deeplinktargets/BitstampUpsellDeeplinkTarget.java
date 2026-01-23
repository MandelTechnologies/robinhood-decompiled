package com.robinhood.shared.crypto.deeplinktargets;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CryptoBitstampUkUpsellRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: BitstampUpsellDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/deeplinktargets/BitstampUpsellDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "MICROGRAM_APP_ID", "", "BITSTAMP_PACKAGE_NAME", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "parseCurrencyCodeFromBitstampUrl", "bitstampUrl", "checkIfBitstampIsInstalled", "", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BitstampUpsellDeeplinkTarget extends DeeplinkTarget4 {
    private static final String BITSTAMP_PACKAGE_NAME = "net.bitstamp.app";
    public static final BitstampUpsellDeeplinkTarget INSTANCE = new BitstampUpsellDeeplinkTarget();
    private static final String MICROGRAM_APP_ID = "app-crypto-explainers-v2";

    private BitstampUpsellDeeplinkTarget() {
        super("bitstamp_upsell", (RegionGate) CryptoBitstampUkUpsellRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    private final String parseCurrencyCodeFromBitstampUrl(String bitstampUrl) {
        if (bitstampUrl == null) {
            return null;
        }
        try {
            return Uri.parse(bitstampUrl).getQueryParameter("base");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("url");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("touchpoint");
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("timeInterval");
        String currencyCodeFromBitstampUrl = parseCurrencyCodeFromBitstampUrl(queryParameter);
        boolean zCheckIfBitstampIsInstalled = checkIfBitstampIsInstalled(deeplinkContext);
        StringBuilder sb = new StringBuilder();
        sb.append("robinhood://app_crypto_explainers_v2");
        sb.append("?type=bitstamp_upsell_v1");
        sb.append("&has_bitstamp=" + zCheckIfBitstampIsInstalled);
        if (currencyCodeFromBitstampUrl != null) {
            sb.append("&currency_code=" + currencyCodeFromBitstampUrl);
        }
        sb.append("&source=rhuk");
        sb.append("&tint=achromatic");
        if (queryParameter2 != null) {
            sb.append("&touchpoint=" + queryParameter2);
        }
        if (queryParameter3 != null) {
            sb.append("&timeInterval=" + queryParameter3);
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new MicrogramRouterFragmentKey(new RemoteMicrogramApplication(MICROGRAM_APP_ID, null, 2, null), sb.toString(), null, MicrogramRouterFragmentKey2.HERO, null, 20, null), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
    }

    private final boolean checkIfBitstampIsInstalled(DeeplinkTarget2 deeplinkContext) throws PackageManager.NameNotFoundException {
        try {
            deeplinkContext.getContext().getPackageManager().getPackageInfo(BITSTAMP_PACKAGE_NAME, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}

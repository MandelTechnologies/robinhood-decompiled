package com.robinhood.android.crypto.referrals.deeplink;

import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.crypto.contracts.CryptoReferralsUpsellIntentKey;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.regiongate.CryptoUsReferralsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.shared.crypto.contracts.CryptoTabFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostLogInCryptoReferralsUpsellDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/crypto/referrals/deeplink/PostLogInCryptoReferralsUpsellDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-crypto-referrals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PostLogInCryptoReferralsUpsellDeeplinkTarget extends DeeplinkTarget4 {
    public static final PostLogInCryptoReferralsUpsellDeeplinkTarget INSTANCE = new PostLogInCryptoReferralsUpsellDeeplinkTarget();

    private PostLogInCryptoReferralsUpsellDeeplinkTarget() {
        super("authed_crypto_rewards", (RegionGate) CryptoUsReferralsRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Uri uri = deeplinkContext.getUri();
        String queryParameter = uri.getQueryParameter("reward_program");
        if (queryParameter == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String queryParameter2 = uri.getQueryParameter("referral_code");
        if (queryParameter2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new HostIntentKey.ShowFragmentInTab(new CryptoTabFragmentKey(false, 1, null), false, true, null, 8, null), null, true, 4, null);
        intentCreateIntent$default.setFlags(268468224);
        Unit unit = Unit.INSTANCE;
        return new Intent[]{intentCreateIntent$default, Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new CryptoReferralsUpsellIntentKey(queryParameter, queryParameter2), null, false, 12, null)};
    }
}

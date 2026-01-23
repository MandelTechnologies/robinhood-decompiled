package com.robinhood.android.matcha.p177ui;

import android.content.Intent;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.models.matcha.api.ApiMatchaTreatment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.social.contracts.matcha.MatchaInstantWithdrawalIntro;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/MatchaInstantWithdrawalIntroDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaInstantWithdrawalIntroDeeplinkTarget extends DeeplinkTarget4 {
    public static final MatchaInstantWithdrawalIntroDeeplinkTarget INSTANCE = new MatchaInstantWithdrawalIntroDeeplinkTarget();
    public static final int $stable = 8;

    private MatchaInstantWithdrawalIntroDeeplinkTarget() {
        super(DeepLinkPath.MATCHA_INSTANT_WITHDRAWAL_INTRO.getPath(), false, false, false, true, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        String upperCase;
        Intent intentCreateIntent$default;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        ApiMatchaTreatment.InstantWithdrawalVariant.Companion companion = ApiMatchaTreatment.InstantWithdrawalVariant.INSTANCE;
        String queryParameter = deeplinkContext.getUri().getQueryParameter("variant");
        if (queryParameter != null) {
            upperCase = queryParameter.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        ApiMatchaTreatment.InstantWithdrawalVariant instantWithdrawalVariantFromServerValue = companion.fromServerValue(upperCase);
        if (instantWithdrawalVariantFromServerValue == null || instantWithdrawalVariantFromServerValue == ApiMatchaTreatment.InstantWithdrawalVariant.UNKNOWN) {
            intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new TabLinkIntentKey.McDuckling(null, false, null, 7, null), null, false, 12, null);
        } else {
            intentCreateIntent$default = Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new MatchaInstantWithdrawalIntro(instantWithdrawalVariantFromServerValue), false, false, false, null, false, true, false, false, false, null, false, 8052, null);
        }
        return new Intent[]{intentCreateIntent$default};
    }
}

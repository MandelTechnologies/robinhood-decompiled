package com.robinhood.android.onboarding.gold.nativefunding.upsell;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.GoldNativeFundingUpsellIntentKey;
import com.robinhood.models.api.ColorTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GoldNativeFundingUpsellDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "ONBOARDING_SOURCE", "", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-gold-native-funding-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldNativeFundingUpsellDeeplinkTarget extends DeeplinkTarget4 {
    private static final String ONBOARDING_SOURCE = "onboarding";
    public static final GoldNativeFundingUpsellDeeplinkTarget INSTANCE = new GoldNativeFundingUpsellDeeplinkTarget();
    public static final int $stable = 8;

    private GoldNativeFundingUpsellDeeplinkTarget() {
        super("gold_native_funding_upsell", false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        ColorTheme colorThemeFromServerValue;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("source");
        if (queryParameter == null) {
            queryParameter = "unknown";
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("theme");
        if (queryParameter2 == null || (colorThemeFromServerValue = ColorTheme.INSTANCE.fromServerValue(queryParameter2)) == null) {
            colorThemeFromServerValue = ColorTheme.DEFAULT;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new GoldNativeFundingUpsellIntentKey(queryParameter, StringsKt.contains$default((CharSequence) queryParameter, (CharSequence) ONBOARDING_SOURCE, false, 2, (Object) null), colorThemeFromServerValue), null, false, 12, null)};
    }
}

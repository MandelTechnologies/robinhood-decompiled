package com.robinhood.android.doc.deeplink;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.documents.contracts.PersonaSplashIntentKey;
import com.robinhood.shared.documents.lib.docupload.PersonaFlowStyle;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PersonaSplashDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/doc/deeplink/PersonaSplashDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PersonaSplashDeeplinkTarget extends DeeplinkTarget4 {
    public static final PersonaSplashDeeplinkTarget INSTANCE = new PersonaSplashDeeplinkTarget();
    public static final int $stable = 8;

    private PersonaSplashDeeplinkTarget() {
        super("onboarding_verify_identity", false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        PersonaFlowStyle personaFlowStyle;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter(InstantCashConstants.ACCOUNT_TYPE_KEY);
        PersonaFlowStyle[] personaFlowStyleArrValues = PersonaFlowStyle.values();
        int length = personaFlowStyleArrValues.length;
        int i = 0;
        while (true) {
            personaFlowStyle = null;
            String lowerCase = null;
            if (i >= length) {
                break;
            }
            PersonaFlowStyle personaFlowStyle2 = personaFlowStyleArrValues[i];
            String strName = personaFlowStyle2.name();
            Locale locale = Locale.ROOT;
            String lowerCase2 = strName.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (queryParameter != null) {
                lowerCase = queryParameter.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            if (Intrinsics.areEqual(lowerCase2, lowerCase)) {
                personaFlowStyle = personaFlowStyle2;
                break;
            }
            i++;
        }
        if (personaFlowStyle == null) {
            personaFlowStyle = PersonaFlowStyle.BROKERAGE;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new PersonaSplashIntentKey(personaFlowStyle), null, false, 12, null)};
    }
}

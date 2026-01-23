package com.robinhood.android.matcha.p177ui;

import android.content.Intent;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.social.contracts.matcha.MatchaIncentiveLearnMoreFragmentKey;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/MatchaIncentivesLearnMoreDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaIncentivesLearnMoreDeeplinkTarget extends DeeplinkTarget4 {
    public static final MatchaIncentivesLearnMoreDeeplinkTarget INSTANCE = new MatchaIncentivesLearnMoreDeeplinkTarget();
    public static final int $stable = 8;

    private MatchaIncentivesLearnMoreDeeplinkTarget() {
        super(DeepLinkPath.MATCHA_INCENTIVES_LEARN_MORE.getPath(), false, false, false, true, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("dismiss_to_cash_tab");
        boolean z = queryParameter != null ? Boolean.parseBoolean(queryParameter) : false;
        Intent intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new MatchaIncentiveLearnMoreFragmentKey(MatchaIncentiveLearnMoreFragmentKey.FooterContext.PAY_AND_REQUEST), false, false, false, null, false, true, false, false, false, null, false, 8052, null);
        if (z) {
            return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new TabLinkIntentKey.McDuckling(null, false, null, 7, null), null, false, 12, null), intentCreateIntentForFragment$default};
        }
        return new Intent[]{intentCreateIntentForFragment$default};
    }
}

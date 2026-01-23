package com.robinhood.android.gold.sage;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.gold.contracts.GoldSageRateFragmentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSageRateDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageRateDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldSageRateDeeplinkTarget extends DeeplinkTarget4 {
    public static final GoldSageRateDeeplinkTarget INSTANCE = new GoldSageRateDeeplinkTarget();
    public static final int $stable = 8;

    private GoldSageRateDeeplinkTarget() {
        super("gold_sage_rate", false, false, true, false, false, SetsKt.setOf(GoldRegionGate.INSTANCE), 54, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("source");
        if (queryParameter == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("gold_sage_rate deeplink source should not be null"), true, null, 4, null);
        }
        boolean experimentState = deeplinkContext.getExperimentState(GoldSageExperiment.INSTANCE);
        boolean experimentState2 = deeplinkContext.getExperimentState(GoldSageNgExperiment.INSTANCE);
        if (experimentState || experimentState2) {
            String str = queryParameter;
            Navigator navigator = deeplinkContext.getNavigator();
            Context context = deeplinkContext.getContext();
            if (str == null) {
                str = "deeplink";
            }
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new GoldSageRateFragmentKey(str), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 7, null), null, false, 12, null)};
    }
}

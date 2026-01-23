package com.robinhood.android.settings.settings.gold.deeplinktarget;

import android.content.Intent;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.gold.contracts.GoldHubSettingsComponentTargetType;
import com.robinhood.android.gold.contracts.GoldSettingsIntentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSettingsDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/gold/deeplinktarget/GoldSettingsDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class GoldSettingsDeeplinkTarget extends DeeplinkTarget4 {
    public static final GoldSettingsDeeplinkTarget INSTANCE = new GoldSettingsDeeplinkTarget();
    public static final int $stable = 8;

    private GoldSettingsDeeplinkTarget() {
        super(DeepLinkPath.GOLD_SETTINGS.getPath(), (RegionGate) GoldRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("present_in_place");
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new GoldSettingsIntentKey((Intrinsics.areEqual(queryParameter, Constants.SdidMigrationStatusCodes.ALREADY_SDID) || Boolean.parseBoolean(queryParameter)) ? false : true, Boolean.parseBoolean(deeplinkContext.getUri().getQueryParameter("skip_gold_check")), GoldHubSettingsComponentTargetType.INSTANCE.getComponentFromValue(deeplinkContext.getUri().getQueryParameter("scroll_to_section"))), null, false, 12, null)};
    }
}

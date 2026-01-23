package com.robinhood.android.futures.onboarding.p145ui;

import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.futures.contracts.FuturesOnboardingActivityKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.EventContractsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventsOnboardingDeepLinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/EventsOnboardingDeepLinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventsOnboardingDeepLinkTarget extends DeeplinkTarget4 {
    public static final EventsOnboardingDeepLinkTarget INSTANCE = new EventsOnboardingDeepLinkTarget();
    public static final int $stable = 8;

    private EventsOnboardingDeepLinkTarget() {
        super("event_contract_onboarding", (RegionGate) EventContractsRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        FuturesOnboardingActivityKey.PostOnboardingNavigation routeToBracket;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Uri uri = deeplinkContext.getUri();
        String queryParameter = uri.getQueryParameter("source");
        if (queryParameter == null) {
            queryParameter = "deeplink";
        }
        String queryParameter2 = uri.getQueryParameter("id");
        UUID uuid2 = null;
        if (queryParameter2 != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter2);
            } catch (IllegalArgumentException unused) {
            }
        } else {
            uuid = null;
        }
        String queryParameter3 = uri.getQueryParameter("bracket_id");
        if (queryParameter3 != null) {
            try {
                uuid2 = StringsKt.toUuid(queryParameter3);
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (uuid != null) {
            routeToBracket = new FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEdpByEventId(uuid);
        } else if (uuid2 != null) {
            routeToBracket = new FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToBracket(uuid2);
        } else {
            routeToBracket = FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcHub.INSTANCE;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new FuturesOnboardingActivityKey(queryParameter, true, routeToBracket), null, false, 12, null)};
    }
}

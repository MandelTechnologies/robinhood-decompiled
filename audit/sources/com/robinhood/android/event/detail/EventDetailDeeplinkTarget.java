package com.robinhood.android.event.detail;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventDetailRoutingFragmentKey;
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

/* compiled from: EventDetailDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventDetailDeeplinkTarget extends DeeplinkTarget4 {
    public static final EventDetailDeeplinkTarget INSTANCE = new EventDetailDeeplinkTarget();
    public static final int $stable = 8;

    private EventDetailDeeplinkTarget() {
        super("event_contracts", (RegionGate) EventContractsRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        UUID uuid4;
        EventDetailRoutingFragmentKey eventDetailRoutingFragmentKey;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        if (queryParameter != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter);
            } catch (IllegalArgumentException unused) {
                uuid = null;
            }
            uuid2 = uuid;
        } else {
            uuid2 = null;
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("entry_point");
        if (queryParameter2 == null) {
            queryParameter2 = deeplinkContext.getUri().getQueryParameter("source");
        }
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("contract_id");
        if (queryParameter3 != null) {
            try {
                uuid3 = StringsKt.toUuid(queryParameter3);
            } catch (IllegalArgumentException unused2) {
                uuid3 = null;
            }
            uuid4 = uuid3;
        } else {
            uuid4 = null;
        }
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter("show_in_tab");
        if (queryParameter4 == null) {
            queryParameter4 = "true";
        }
        boolean z = Boolean.parseBoolean(queryParameter4);
        if (uuid2 != null) {
            eventDetailRoutingFragmentKey = new EventDetailRoutingFragmentKey(uuid2, EcUuidType.EVENT_ID, queryParameter2 == null ? "deeplink" : queryParameter2, false, 8, null);
        } else if (uuid4 != null) {
            eventDetailRoutingFragmentKey = new EventDetailRoutingFragmentKey(uuid4, EcUuidType.CONTRACT_ID, queryParameter2 == null ? "deeplink" : queryParameter2, false, 8, null);
        } else {
            eventDetailRoutingFragmentKey = null;
        }
        if (eventDetailRoutingFragmentKey != null) {
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), eventDetailRoutingFragmentKey, false, z, false, null, false, false, false, false, false, null, false, 8180, null)};
        }
        return new Intent[0];
    }
}

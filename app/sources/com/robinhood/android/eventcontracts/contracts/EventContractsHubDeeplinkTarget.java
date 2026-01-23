package com.robinhood.android.eventcontracts.contracts;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.eventcontracts.experiments.EventContractsSportsExperiment;
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

/* compiled from: EventContractsHubDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contracts/EventContractsHubDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventContractsHubDeeplinkTarget extends DeeplinkTarget4 {
    public static final EventContractsHubDeeplinkTarget INSTANCE = new EventContractsHubDeeplinkTarget();

    private EventContractsHubDeeplinkTarget() {
        super("event_contracts_hub", (RegionGate) EventContractsRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intent intentCreateIntentForFragment$default;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("entry_point");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("node_id");
        UUID uuid = null;
        if (queryParameter2 != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter2);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (deeplinkContext.getExperimentState(EventContractsSportsExperiment.INSTANCE)) {
            intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new EventContractHubV2IntentKey(uuid, queryParameter), null, false, 12, null);
        } else {
            intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), EventContractsHubDeeplinkTarget2.constructEcHubFragmentKey(queryParameter), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
        }
        return new Intent[]{intentCreateIntentForFragment$default};
    }
}

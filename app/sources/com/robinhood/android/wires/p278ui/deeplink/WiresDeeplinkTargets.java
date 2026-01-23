package com.robinhood.android.wires.p278ui.deeplink;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.transfers.contracts.Wires;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.rosetta.eventlogging.WiresContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WiresDeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/deeplink/WiresDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.wires.ui.deeplink.WiresDeeplinkTarget, reason: use source file name */
/* loaded from: classes16.dex */
public final class WiresDeeplinkTargets extends DeeplinkTarget4 {
    public static final WiresDeeplinkTargets INSTANCE = new WiresDeeplinkTargets();
    public static final int $stable = 8;

    private WiresDeeplinkTargets() {
        super("wires", (RegionGate) MoneyMovementsUsRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        WiresContext.WiresDirection wiresDirection;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        String queryParameter = deeplinkContext.getUri().getQueryParameter("direction");
        if (queryParameter == null) {
            wiresDirection = WiresContext.WiresDirection.WIRES_DIRECTION_UNSPECIFIED;
        } else {
            int iHashCode = queryParameter.hashCode();
            if (iHashCode != 61682540) {
                if (iHashCode == 92796966 && queryParameter.equals("incoming")) {
                    wiresDirection = WiresContext.WiresDirection.INCOMING;
                }
            } else if (queryParameter.equals("outgoing")) {
                wiresDirection = WiresContext.WiresDirection.OUTGOING;
            }
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, new Wires(wiresDirection, null, 2, 0 == true ? 1 : 0), null, false, 12, null)};
    }
}

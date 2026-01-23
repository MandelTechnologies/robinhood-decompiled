package com.robinhood.android.isa.tab;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.android.isa.contracts.IsaNavHostFragmentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.regiongate.StocksAndSharesIsaRegionGate;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import deeplinks.isa.p450v1.IsaDashboardDeeplinkDto;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaDashboardDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/isa/tab/IsaDashboardDeeplinkTarget;", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Ldeeplinks/isa/v1/IsaDashboardDeeplinkDto;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Ldeeplinks/isa/v1/IsaDashboardDeeplinkDto;Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-isa-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IsaDashboardDeeplinkTarget extends DeeplinkTarget3<IsaDashboardDeeplinkDto> {
    public static final IsaDashboardDeeplinkTarget INSTANCE = new IsaDashboardDeeplinkTarget();
    public static final int $stable = 8;

    private IsaDashboardDeeplinkTarget() {
        super(IsaDashboardDeeplinkDto.INSTANCE, null, true, SetsKt.setOf(StocksAndSharesIsaRegionGate.INSTANCE), false, 18, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget3
    public Intent[] getIntents(IsaDashboardDeeplinkDto data, DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), IsaNavHostFragmentKey.INSTANCE, false, true, false, FragmentTab.ISA, false, true, false, false, false, null, true, 3924, null)};
    }
}

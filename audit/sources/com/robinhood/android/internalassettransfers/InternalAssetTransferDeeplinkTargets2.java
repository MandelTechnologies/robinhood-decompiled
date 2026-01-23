package com.robinhood.android.internalassettransfers;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.assettransfers.contracts.InternalAssetTransferHistory;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.JointAccountsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferDeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferHistoryDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.InternalAssetTransferHistoryDeeplinkTarget, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferDeeplinkTargets2 extends DeeplinkTarget4 {
    public static final InternalAssetTransferDeeplinkTargets2 INSTANCE = new InternalAssetTransferDeeplinkTargets2();
    public static final int $stable = 8;

    private InternalAssetTransferDeeplinkTargets2() {
        super("internal_asset_transfer", (RegionGate) JointAccountsRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        if (queryParameter == null) {
            queryParameter = "";
        }
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        UUID uuidFromString = UUID.fromString(queryParameter);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new InternalAssetTransferHistory(uuidFromString), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
    }
}

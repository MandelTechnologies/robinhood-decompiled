package com.robinhood.android.equities.orderactions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.EquityPendingOrderActionKey;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityPendingOrderDeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"getActionIntent", "", "Landroid/content/Intent;", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "action", "Lcom/robinhood/android/trading/contracts/EquityPendingOrderActionKey$Action;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;Lcom/robinhood/android/trading/contracts/EquityPendingOrderActionKey$Action;)[Landroid/content/Intent;", "feature-equity-order-actions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.orderactions.EquityPendingOrderDeeplinkTargetsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityPendingOrderDeeplinkTargets3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] getActionIntent(DeeplinkTarget2 deeplinkTarget2, EquityPendingOrderActionKey.Action action) {
        Uri uri = deeplinkTarget2.getUri();
        String queryParameter = uri.getQueryParameter("rhs_account_number");
        String queryParameter2 = uri.getQueryParameter("order_id");
        UUID uuid = null;
        if (queryParameter2 != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter2);
            } catch (IllegalArgumentException unused) {
            }
        }
        EquityOrderFlowSource equityOrderFlowSourceFromDeepLinkActionSource = EquityOrderFlowSource.INSTANCE.fromDeepLinkActionSource(uri.getQueryParameter("action_source"), action == EquityPendingOrderActionKey.Action.REPLACE);
        if (queryParameter == null || uuid == null) {
            return new Intent[]{deeplinkTarget2.getMainIntent()};
        }
        Navigator navigator = deeplinkTarget2.getNavigator();
        Context context = deeplinkTarget2.getContext();
        if (equityOrderFlowSourceFromDeepLinkActionSource == null) {
            equityOrderFlowSourceFromDeepLinkActionSource = EquityOrderFlowSource.CANCEL_NEW_HISTORY;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, new EquityPendingOrderActionKey(queryParameter, uuid, action, equityOrderFlowSourceFromDeepLinkActionSource), null, false, 12, null)};
    }
}

package com.robinhood.shared.history.deeplink;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.eventcontracts.contracts.EventOrderDetailKey;
import com.robinhood.android.futures.contracts.FuturesOrderDetailFragmentKey;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.ComboOrderDetailFragmentKey;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrdersDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/history/deeplink/OrdersDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-history-detail-deeplink_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class OrdersDeeplinkTarget extends DeeplinkTarget4 {
    public static final OrdersDeeplinkTarget INSTANCE = new OrdersDeeplinkTarget();

    private OrdersDeeplinkTarget() {
        super("orders", false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        DetailType detailType;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        UUID uuid = null;
        if (queryParameter != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter);
            } catch (IllegalArgumentException unused) {
            }
        }
        UUID uuid2 = uuid;
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("type");
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("tint");
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter("show_in_tab");
        boolean z = queryParameter4 != null && Boolean.parseBoolean(queryParameter4);
        if (uuid2 == null) {
            return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new WatchListIntentKey(WatchListIntentKey2.ORDERS), null, false, 12, null)};
        }
        if (queryParameter2 != null) {
            int iHashCode = queryParameter2.hashCode();
            if (iHashCode != -503567600) {
                if (iHashCode != -14580164) {
                    if (iHashCode == 94843278 && queryParameter2.equals("combo")) {
                        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new ComboOrderDetailFragmentKey(uuid2), false, z, false, null, false, false, false, false, false, null, false, 8180, null)};
                    }
                } else if (queryParameter2.equals("event_contracts")) {
                    return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new EventOrderDetailKey(uuid2), false, z, false, null, false, false, false, false, false, null, false, 8180, null)};
                }
            } else if (queryParameter2.equals("futures")) {
                return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new FuturesOrderDetailFragmentKey(uuid2), false, z, false, null, false, false, false, false, false, null, false, 8180, null)};
            }
        }
        if (Intrinsics.areEqual(queryParameter2, AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION)) {
            detailType = DetailType.OPTION_ORDER;
        } else {
            detailType = Intrinsics.areEqual(queryParameter2, "currency") ? DetailType.CRYPTO_ORDER : DetailType.ORDER;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, detailType, uuid2, queryParameter3, false, 8, null), false, z, false, null, false, false, false, false, false, null, false, 8180, null)};
    }
}

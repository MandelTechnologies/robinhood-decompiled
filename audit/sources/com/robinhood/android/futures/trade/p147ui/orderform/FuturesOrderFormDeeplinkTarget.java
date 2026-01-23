package com.robinhood.android.futures.trade.p147ui.orderform;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.futures.contracts.FuturesTradeActivityKey;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesOrderFormDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class FuturesOrderFormDeeplinkTarget extends DeeplinkTarget4 {
    public static final FuturesOrderFormDeeplinkTarget INSTANCE = new FuturesOrderFormDeeplinkTarget();
    public static final int $stable = 8;

    private FuturesOrderFormDeeplinkTarget() {
        super("futures_order_form", (RegionGate) FuturesTradingRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        UUID uuid2;
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
        boolean booleanQueryParameter = deeplinkContext.getUri().getBooleanQueryParameter("is_buy", false);
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("default_quantity");
        Integer intOrNull = queryParameter2 != null ? kotlin.text.StringsKt.toIntOrNull(queryParameter2) : null;
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("entry_point");
        if (queryParameter3 == null) {
            queryParameter3 = "deeplink";
        }
        String str = queryParameter3;
        if (uuid2 != null) {
            return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new FuturesTradeActivityKey(new FuturesTradeActivityKey.TradeData.OrderForm(uuid2, new Screen(null, str, null, null, 13, null), booleanQueryParameter ? FuturesOrderSide.BUY : FuturesOrderSide.SELL, intOrNull, false, 16, null)), null, false, 12, null)};
        }
        return new Intent[0];
    }
}

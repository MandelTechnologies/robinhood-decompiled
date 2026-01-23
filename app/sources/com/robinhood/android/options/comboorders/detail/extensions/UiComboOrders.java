package com.robinhood.android.options.comboorders.detail.extensions;

import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.android.options.historydetail.OptionOrderUtils;
import com.robinhood.rosetta.eventlogging.ComboOrderDetailContext;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiComboOrders.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0002¨\u0006\f"}, m3636d2 = {"getOrderTypeString", "", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "resources", "Landroid/content/res/Resources;", "getTimeInForceString", "getPositionEffectString", "getOrderPriceString", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "getComboOrderDetailContext", "Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContext;", "feature-combo-order-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.comboorders.detail.extensions.UiComboOrdersKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UiComboOrders {
    public static final String getOrderTypeString(UiComboOrder uiComboOrder, Resources resources) {
        Intrinsics.checkNotNullParameter(uiComboOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return OptionOrderUtils.INSTANCE.getOrderTypeString(resources, uiComboOrder.getComboOrder().getType());
    }

    public static final String getTimeInForceString(UiComboOrder uiComboOrder, Resources resources) {
        Intrinsics.checkNotNullParameter(uiComboOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return OptionOrderUtils.INSTANCE.getTimeInForceString(resources, uiComboOrder.getComboOrder().getTimeInForce());
    }

    public static final String getPositionEffectString(UiComboOrder uiComboOrder, Resources resources) {
        Intrinsics.checkNotNullParameter(uiComboOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return OptionOrderUtils.INSTANCE.getPositionEffectString(resources, uiComboOrder.getEffect());
    }

    public static final String getOrderPriceString(UiComboOrder uiComboOrder, Resources resources, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(uiComboOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return OptionOrderUtils.INSTANCE.getOrderPriceString(resources, uiComboOrder.getComboOrder().getType(), bigDecimal);
    }

    public static final ComboOrderDetailContext getComboOrderDetailContext(UiComboOrder uiComboOrder) {
        Intrinsics.checkNotNullParameter(uiComboOrder, "<this>");
        String string2 = uiComboOrder.getComboOrder().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String symbol = uiComboOrder.getInstrument().getSymbol();
        BigDecimal price = uiComboOrder.getComboOrder().getPrice();
        return new ComboOrderDetailContext(string2, symbol, price != null ? price.floatValue() : 0.0f, uiComboOrder.getComboOrder().getQuantity().intValue(), uiComboOrder.getComboOrder().getDerivedState().getServerValue(), null, 32, null);
    }
}

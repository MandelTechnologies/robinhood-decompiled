package com.robinhood.android.trade.equity.p261ui.configuration.toolbar;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.trade.equity.util.OrderRequests;
import com.robinhood.models.p320db.Order;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderConfigurationToolbar.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/toolbar/OrderConfigurationToolbar;", "", "<init>", "()V", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "updateTitle", "Lkotlin/Function1;", "Landroid/widget/TextView;", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "isOrderReplacement", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderConfigurationToolbar {
    public static final int $stable = 0;
    public static final OrderConfigurationToolbar INSTANCE = new OrderConfigurationToolbar();

    private OrderConfigurationToolbar() {
    }

    public final void configureToolbar(RhToolbar toolbar, Function1<? super TextView, Unit> updateTitle) {
        RhToolbar rhToolbar;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(updateTitle, "updateTitle");
        ViewGroup viewGroup = (ViewGroup) toolbar.findViewById(C20649R.id.equity_order_toolbar_content);
        if (viewGroup == null) {
            rhToolbar = toolbar;
            RhToolbar.addCustomView$default(rhToolbar, C20649R.layout.include_equity_order_toolbar, false, 0, 6, null);
            viewGroup = (ViewGroup) rhToolbar.findViewById(C20649R.id.equity_order_toolbar_content);
        } else {
            rhToolbar = toolbar;
        }
        View viewFindViewById = viewGroup != null ? viewGroup.findViewById(C20649R.id.action_order_types) : null;
        View view = viewFindViewById != null ? viewFindViewById : null;
        if (view != null) {
            view.setVisibility(8);
        }
        View viewFindViewById2 = rhToolbar.findViewById(C20649R.id.order_label_content);
        if (viewFindViewById2 == null) {
            RhToolbar.addCustomView$default(rhToolbar, C20649R.layout.include_toolbar_equity_order_label, true, 0, 4, null);
            viewFindViewById2 = rhToolbar.findViewById(C20649R.id.order_label_content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "run(...)");
        }
        View viewFindViewById3 = viewFindViewById2.findViewById(C20649R.id.order_label_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        updateTitle.invoke(viewFindViewById3);
    }

    public final StringResource toolbarTitle(Order.Configuration configuration, boolean isOrderReplacement) {
        StringResource titleString = configuration != null ? OrderRequests.getTitleString(configuration) : null;
        if (CollectionsKt.contains(SetsKt.setOf((Object[]) new Order.Configuration[]{Order.Configuration.LIMIT, Order.Configuration.STOP_LIMIT, Order.Configuration.STOP_LOSS}), configuration) && isOrderReplacement) {
            return titleString;
        }
        return null;
    }
}

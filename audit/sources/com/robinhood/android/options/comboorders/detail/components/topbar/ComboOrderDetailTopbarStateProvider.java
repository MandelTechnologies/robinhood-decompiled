package com.robinhood.android.options.comboorders.detail.components.topbar;

import android.content.res.Resources;
import com.robinhood.android.options.historydetail.C23150R;
import com.robinhood.android.options.historydetail.OptionOrderUtils;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComboOrderDetailTopbarStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/topbar/ComboOrderDetailTopbarStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/comboorders/detail/components/topbar/ComboOrderDetailTopbarDataState;", "Lcom/robinhood/android/options/comboorders/detail/components/topbar/ComboOrderDetailTopbarViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComboOrderDetailTopbarStateProvider implements StateProvider<ComboOrderDetailTopbarDataState, ComboOrderDetailTopbarViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public ComboOrderDetailTopbarStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public ComboOrderDetailTopbarViewState reduce(ComboOrderDetailTopbarDataState dataState) throws Resources.NotFoundException {
        String orderStateStringRes;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        OrderState orderState = dataState.getOrderState();
        if (orderState == null || (orderStateStringRes = OptionOrderUtils.INSTANCE.getOrderStateStringRes(this.resources, orderState)) == null) {
            orderStateStringRes = "";
        }
        StringResource accountText = dataState.getAccountText();
        String strValueOf = String.valueOf(accountText != null ? accountText.getText(this.resources) : null);
        String string2 = this.resources.getString(C23150R.string.option_order_combo_order_topbar_label, dataState.getSymbolText());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new ComboOrderDetailTopbarViewState(orderStateStringRes, strValueOf, string2);
    }
}

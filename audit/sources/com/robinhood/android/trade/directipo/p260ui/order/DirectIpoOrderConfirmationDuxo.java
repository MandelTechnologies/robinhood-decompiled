package com.robinhood.android.trade.directipo.p260ui.order;

import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.directipo.models.p293ui.UiDirectIpoOrderResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOrderConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationViewState;", "<init>", "()V", "setOrder", "", "orderResponse", "Lcom/robinhood/directipo/models/ui/UiDirectIpoOrderResponse;", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class DirectIpoOrderConfirmationDuxo extends OldBaseDuxo<DirectIpoOrderConfirmationViewState> {
    public static final int $stable = OldBaseDuxo.$stable;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public DirectIpoOrderConfirmationDuxo() {
        Object[] objArr = 0 == true ? 1 : 0;
        super(new DirectIpoOrderConfirmationViewState(null, 1, 0 == true ? 1 : 0), objArr, 2, 0 == true ? 1 : 0);
    }

    public final void setOrder(final UiDirectIpoOrderResponse orderResponse) {
        Intrinsics.checkNotNullParameter(orderResponse, "orderResponse");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderConfirmationDuxo.setOrder$lambda$0(orderResponse, (DirectIpoOrderConfirmationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoOrderConfirmationViewState setOrder$lambda$0(UiDirectIpoOrderResponse uiDirectIpoOrderResponse, DirectIpoOrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(uiDirectIpoOrderResponse);
    }
}

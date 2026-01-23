package com.robinhood.shared.education.order;

import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;

/* compiled from: OrderTypeEducationFragmentCallbacks.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationFragmentCallbacks;", "", "onOrderTypeEducationFinished", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "onLearnMoreClicked", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", OrderTypeEducationLearnMoreFragment.ARG_DESCRIPTION_RES, "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface OrderTypeEducationFragmentCallbacks {
    void onLearnMoreClicked(int titleRes, int descriptionRes);

    void onOrderTypeEducationFinished(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration);
}

package com.truelayer.payments.p419ui.screens.wait;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.models.PaymentContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: WaitContainerViewModel.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aJ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000¨\u0006\u000f"}, m3636d2 = {"waitViewModel", "Landroidx/lifecycle/ViewModelProvider$Factory;", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "providerCountryCode", "", "translations", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "api", "Lcom/truelayer/payments/core/network/Network;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.wait.WaitContainerViewModelKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class WaitContainerViewModel2 {
    public static /* synthetic */ ViewModelProvider.Factory waitViewModel$default(PaymentContext paymentContext, Payment payment, String str, Map map, Network network, CoroutineDispatcher coroutineDispatcher, int i, Object obj) {
        if ((i & 16) != 0) {
            network = TrueLayerUI.INSTANCE.getCore$payments_ui_release().getNetwork();
        }
        Network network2 = network;
        if ((i & 32) != 0) {
            coroutineDispatcher = Dispatchers.getIO();
        }
        return waitViewModel(paymentContext, payment, str, map, network2, coroutineDispatcher);
    }

    public static final ViewModelProvider.Factory waitViewModel(final PaymentContext paymentContext, final Payment payment, final String providerCountryCode, final Map<String, LocalisedText> map, final Network api, final CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(providerCountryCode, "providerCountryCode");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return new ViewModelProvider.Factory() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerViewModelKt.waitViewModel.1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new WaitContainerViewModel(paymentContext, payment, providerCountryCode, map, api, dispatcher);
            }
        };
    }
}

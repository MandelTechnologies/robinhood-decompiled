package com.truelayer.payments.p419ui.screens.formflows;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.models.PaymentContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FormCoordinatorViewModel.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0000¨\u0006\n"}, m3636d2 = {"formCoordinatorViewModel", "Landroidx/lifecycle/ViewModelProvider$Factory;", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", "formViewData", "Lcom/truelayer/payments/ui/screens/formflows/FormViewData;", "api", "Lcom/truelayer/payments/core/network/Network;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.formflows.FormCoordinatorViewModelKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FormCoordinatorViewModel4 {
    public static /* synthetic */ ViewModelProvider.Factory formCoordinatorViewModel$default(PaymentContext paymentContext, FormViewData formViewData, Network network, CoroutineDispatcher coroutineDispatcher, int i, Object obj) {
        if ((i & 4) != 0) {
            network = TrueLayerUI.INSTANCE.getCore$payments_ui_release().getNetwork();
        }
        if ((i & 8) != 0) {
            coroutineDispatcher = Dispatchers.getIO();
        }
        return formCoordinatorViewModel(paymentContext, formViewData, network, coroutineDispatcher);
    }

    public static final ViewModelProvider.Factory formCoordinatorViewModel(final PaymentContext paymentContext, final FormViewData formViewData, final Network api, final CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(formViewData, "formViewData");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return new ViewModelProvider.Factory() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorViewModelKt.formCoordinatorViewModel.1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new FormCoordinatorViewModel(paymentContext, formViewData, api, dispatcher);
            }
        };
    }
}

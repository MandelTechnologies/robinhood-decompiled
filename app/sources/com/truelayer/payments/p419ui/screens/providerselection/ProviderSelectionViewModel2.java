package com.truelayer.payments.p419ui.screens.providerselection;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.core.store.Store;
import com.truelayer.payments.p419ui.TrueLayerUI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProviderSelectionViewModel.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, m3636d2 = {"providerSelectionViewModel", "Landroidx/lifecycle/ViewModelProvider$Factory;", WebsocketGatewayConstants.DATA_KEY, "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionViewData;", PlaceTypes.STORE, "Lcom/truelayer/payments/core/store/Store;", "api", "Lcom/truelayer/payments/core/network/Network;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ProviderSelectionViewModel2 {
    public static /* synthetic */ ViewModelProvider.Factory providerSelectionViewModel$default(ProviderSelectionViewData providerSelectionViewData, Store store, Network network, int i, Object obj) {
        if ((i & 2) != 0) {
            store = TrueLayerUI.INSTANCE.getCore$payments_ui_release().getStore();
        }
        if ((i & 4) != 0) {
            network = TrueLayerUI.INSTANCE.getCore$payments_ui_release().getNetwork();
        }
        return providerSelectionViewModel(providerSelectionViewData, store, network);
    }

    public static final ViewModelProvider.Factory providerSelectionViewModel(final ProviderSelectionViewData data, final Store store, final Network api) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(api, "api");
        return new ViewModelProvider.Factory() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelKt.providerSelectionViewModel.1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new ProviderSelectionViewModel(data, store, api, null, 8, null);
            }
        };
    }
}

package com.truelayer.payments.p419ui.screens.result;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.core.store.Store;
import com.truelayer.payments.p419ui.TrueLayerUI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ResultContainerViewModel.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0000¨\u0006\n"}, m3636d2 = {"resultViewModel", "Landroidx/lifecycle/ViewModelProvider$Factory;", "resultContext", "Lcom/truelayer/payments/ui/screens/result/ResultContext;", "api", "Lcom/truelayer/payments/core/network/Network;", PlaceTypes.STORE, "Lcom/truelayer/payments/core/store/Store;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.result.ResultContainerViewModelKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ResultContainerViewModel8 {
    public static /* synthetic */ ViewModelProvider.Factory resultViewModel$default(ResultContext resultContext, Network network, Store store, CoroutineDispatcher coroutineDispatcher, int i, Object obj) {
        if ((i & 2) != 0) {
            network = TrueLayerUI.INSTANCE.getCore$payments_ui_release().getNetwork();
        }
        if ((i & 4) != 0) {
            store = TrueLayerUI.INSTANCE.getCore$payments_ui_release().getStore();
        }
        if ((i & 8) != 0) {
            coroutineDispatcher = Dispatchers.getIO();
        }
        return resultViewModel(resultContext, network, store, coroutineDispatcher);
    }

    public static final ViewModelProvider.Factory resultViewModel(final ResultContext resultContext, final Network api, final Store store, final CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(resultContext, "resultContext");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return new ViewModelProvider.Factory() { // from class: com.truelayer.payments.ui.screens.result.ResultContainerViewModelKt.resultViewModel.1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new ResultContainerViewModel(resultContext, api, store, dispatcher);
            }
        };
    }
}

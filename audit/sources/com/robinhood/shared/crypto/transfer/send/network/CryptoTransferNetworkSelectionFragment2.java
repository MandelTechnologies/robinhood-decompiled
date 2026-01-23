package com.robinhood.shared.crypto.transfer.send.network;

import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferNetworkSelectionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class CryptoTransferNetworkSelectionFragment2 extends FunctionReferenceImpl implements Function1<ApiCryptoSupportedNetworks.CryptoNetwork, Unit> {
    CryptoTransferNetworkSelectionFragment2(Object obj) {
        super(1, obj, CryptoTransferNetworkSelectionFragment.Callbacks.class, "onNetworkSelected", "onNetworkSelected(Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork) {
        invoke2(cryptoNetwork);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ApiCryptoSupportedNetworks.CryptoNetwork p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoTransferNetworkSelectionFragment.Callbacks) this.receiver).onNetworkSelected(p0);
    }
}

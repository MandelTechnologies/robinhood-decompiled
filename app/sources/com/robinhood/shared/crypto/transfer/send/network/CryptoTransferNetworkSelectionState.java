package com.robinhood.shared.crypto.transfer.send.network;

import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionFragment;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferNetworkSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u001d\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/network/CryptoTransferNetworkSelectionState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "args", "Lcom/robinhood/shared/crypto/transfer/send/network/CryptoTransferNetworkSelectionFragment$Args;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/crypto/transfer/send/network/CryptoTransferNetworkSelectionFragment$Args;)V", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "getArgs", "()Lcom/robinhood/shared/crypto/transfer/send/network/CryptoTransferNetworkSelectionFragment$Args;", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "supportedNetworks", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;", "getSupportedNetworks", "()Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;", "defaultSelectedNetwork", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "getDefaultSelectedNetwork", "()Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "url", "getUrl", "fallbackSubtitle", "getFallbackSubtitle", "isRhc", "", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferNetworkSelectionState {
    public static final int $stable = 8;
    private final AppType appType;
    private final CryptoTransferNetworkSelectionFragment.Args args;
    private final String currencyCode;
    private final ApiCryptoSupportedNetworks.CryptoNetwork defaultSelectedNetwork;
    private final boolean isRhc;
    private final ApiCryptoSupportedNetworks supportedNetworks;

    public static /* synthetic */ CryptoTransferNetworkSelectionState copy$default(CryptoTransferNetworkSelectionState cryptoTransferNetworkSelectionState, AppType appType, CryptoTransferNetworkSelectionFragment.Args args, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = cryptoTransferNetworkSelectionState.appType;
        }
        if ((i & 2) != 0) {
            args = cryptoTransferNetworkSelectionState.args;
        }
        return cryptoTransferNetworkSelectionState.copy(appType, args);
    }

    /* renamed from: component1, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoTransferNetworkSelectionFragment.Args getArgs() {
        return this.args;
    }

    public final CryptoTransferNetworkSelectionState copy(AppType appType, CryptoTransferNetworkSelectionFragment.Args args) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(args, "args");
        return new CryptoTransferNetworkSelectionState(appType, args);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferNetworkSelectionState)) {
            return false;
        }
        CryptoTransferNetworkSelectionState cryptoTransferNetworkSelectionState = (CryptoTransferNetworkSelectionState) other;
        return this.appType == cryptoTransferNetworkSelectionState.appType && Intrinsics.areEqual(this.args, cryptoTransferNetworkSelectionState.args);
    }

    public int hashCode() {
        return (this.appType.hashCode() * 31) + this.args.hashCode();
    }

    public String toString() {
        return "CryptoTransferNetworkSelectionState(appType=" + this.appType + ", args=" + this.args + ")";
    }

    public CryptoTransferNetworkSelectionState(AppType appType, CryptoTransferNetworkSelectionFragment.Args args) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(args, "args");
        this.appType = appType;
        this.args = args;
        this.currencyCode = args.getUiCurrencyPair().getDisplaySymbol();
        ApiCryptoSupportedNetworks supportedNetworks = args.getSupportedNetworks();
        this.supportedNetworks = supportedNetworks;
        this.defaultSelectedNetwork = supportedNetworks.getDefaultNetworkForWithdrawal();
        this.isRhc = appType == AppType.RHC;
    }

    public final AppType getAppType() {
        return this.appType;
    }

    public final CryptoTransferNetworkSelectionFragment.Args getArgs() {
        return this.args;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final ApiCryptoSupportedNetworks getSupportedNetworks() {
        return this.supportedNetworks;
    }

    public final ApiCryptoSupportedNetworks.CryptoNetwork getDefaultSelectedNetwork() {
        return this.defaultSelectedNetwork;
    }

    public final StringResource getSubtitle() {
        if (this.isRhc) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_send_network_selection_subtitle_rhc, this.currencyCode);
        }
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_send_network_selection_subtitle, this.currencyCode);
    }

    public final StringResource getUrl() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (this.isRhc) {
            i = C37934R.string.crypto_transfer_support_url_rhc;
        } else {
            i = C37934R.string.crypto_transfer_support_url;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final StringResource getFallbackSubtitle() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (this.isRhc) {
            i = C37934R.string.crypto_transfer_send_network_fallback_subtitle_rhc;
        } else {
            i = C37934R.string.crypto_transfer_send_network_fallback_subtitle;
        }
        return companion.invoke(i, new Object[0]);
    }
}

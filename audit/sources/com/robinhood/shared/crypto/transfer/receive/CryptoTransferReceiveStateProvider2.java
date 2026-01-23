package com.robinhood.shared.crypto.transfer.receive;

import com.robinhood.models.api.ApiCurrency;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.api.transfer.ApiCryptoTransferDepositDetails;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveViewState;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferReceiveStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a \u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0001\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\u0001*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000f"}, m3636d2 = {"displayTitle", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails$ApiCryptoTransferDepositDetail;", "getDisplayTitle$annotations", "(Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails$ApiCryptoTransferDepositDetail;)V", "getDisplayTitle", "(Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails$ApiCryptoTransferDepositDetail;)Lcom/robinhood/utils/resource/StringResource;", "disclaimer", "getDisclaimer$annotations", "getDisclaimer", "getNetworkChip", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Success$NetworkChip;", "allDepositAddresses", "", "activeAddress", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveStateProviderKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferReceiveStateProvider2 {
    public static /* synthetic */ void getDisclaimer$annotations(ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail apiCryptoTransferDepositDetail) {
    }

    public static /* synthetic */ void getDisplayTitle$annotations(ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail apiCryptoTransferDepositDetail) {
    }

    public static final StringResource getDisplayTitle(ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail apiCryptoTransferDepositDetail) {
        Intrinsics.checkNotNullParameter(apiCryptoTransferDepositDetail, "<this>");
        if (apiCryptoTransferDepositDetail.getNetwork_info().getType() == ApiCurrency.CryptoType.ERC20) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_receive_subtitle_qr_v2_token, apiCryptoTransferDepositDetail.getCurrency_code(), apiCryptoTransferDepositDetail.getNetwork_info().getType_name());
        }
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_receive_subtitle_qr_v2, apiCryptoTransferDepositDetail.getCurrency_code());
    }

    public static final StringResource getDisclaimer(ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail apiCryptoTransferDepositDetail) {
        Intrinsics.checkNotNullParameter(apiCryptoTransferDepositDetail, "<this>");
        if (apiCryptoTransferDepositDetail.getNetwork_info().getType() == ApiCurrency.CryptoType.ERC20) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_unified_receive_disclaimer_multi_chain_erc, apiCryptoTransferDepositDetail.getCurrency_code(), apiCryptoTransferDepositDetail.getNetwork_info().getType_name(), apiCryptoTransferDepositDetail.getNetwork_info().getName());
        }
        if (apiCryptoTransferDepositDetail.getAddress_tag() != null) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_unified_receive_disclaimer_memo, apiCryptoTransferDepositDetail.getCurrency_code());
        }
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_unified_receive_disclaimer_multi_chain, apiCryptoTransferDepositDetail.getCurrency_code(), apiCryptoTransferDepositDetail.getNetwork_info().getName());
    }

    public static final CryptoTransferReceiveViewState.Success.NetworkChip getNetworkChip(List<ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail> allDepositAddresses, ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail activeAddress) {
        Intrinsics.checkNotNullParameter(allDepositAddresses, "allDepositAddresses");
        Intrinsics.checkNotNullParameter(activeAddress, "activeAddress");
        if (allDepositAddresses.size() == 1) {
            return null;
        }
        ApiCryptoSupportedNetworks.CryptoNetwork.NetworkInfo network_info = activeAddress.getNetwork_info();
        return new CryptoTransferReceiveViewState.Success.NetworkChip(network_info.getName(), network_info.getLogo_url_light(), network_info.getLogo_url());
    }
}

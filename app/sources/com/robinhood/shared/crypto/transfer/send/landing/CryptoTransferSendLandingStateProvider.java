package com.robinhood.shared.crypto.transfer.send.landing;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.ApiCurrency;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingViewState;
import com.robinhood.shared.crypto.transfer.unified.QrScannerState;
import com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendLandingStateProvider.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J?\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0014J\u001f\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\b\u0019J'\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDataState;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState;", "<init>", "()V", "reduce", "dataState", "generateSuccessState", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$Success;", "isRhc", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "supportedNetworks", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;", "useSavedAddressesFlow", "hasShownInitialWarningSheet", "config", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "generateSuccessState$feature_crypto_transfer_externalDebug", "getTitle", "Lcom/robinhood/utils/resource/StringResource;", "currencyCode", "", "getTitle$feature_crypto_transfer_externalDebug", "getInitialWarningSheet", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "getInitialWarningSheet$feature_crypto_transfer_externalDebug", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferSendLandingStateProvider implements StateProvider<CryptoTransferSendLandingDataState, CryptoTransferSendLandingViewState> {
    public static final int $stable = 0;

    /* compiled from: CryptoTransferSendLandingStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCryptoTransferConfig.TransferStates.SendState.values().length];
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.SendState.ENROLLMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.SendState.MFA_SETUP_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.SendState.ENROLLMENT_PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.SendState.ENROLLMENT_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.SendState.SEND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoTransferSendLandingViewState reduce(CryptoTransferSendLandingDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Tuples2 tuples2M3642to = Tuples4.m3642to(dataState.getUiCurrencyPair(), dataState.getCryptoTransferConfig());
        UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) tuples2M3642to.component1();
        CryptoTransferConfig cryptoTransferConfig = (CryptoTransferConfig) tuples2M3642to.component2();
        if (uiCurrencyPair == null || cryptoTransferConfig == null) {
            return CryptoTransferSendLandingViewState.Loading.INSTANCE;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoTransferConfig.getSendState().ordinal()];
        if (i == 1 || i == 2) {
            return new CryptoTransferSendLandingViewState.SecuritySetupRequired(cryptoTransferConfig.getEnrollmentState());
        }
        if (i == 3) {
            return CryptoTransferSendLandingViewState.PendingEnrollment.INSTANCE;
        }
        if (i == 4) {
            return CryptoTransferSendLandingViewState.FailedEnrollment.INSTANCE;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return generateSuccessState$feature_crypto_transfer_externalDebug(dataState.isRhc(), uiCurrencyPair, dataState.getSupportedNetworks(), dataState.getUseSavedAddressesFlow(), dataState.getHasShownInitialWarningSheet(), cryptoTransferConfig);
    }

    public final CryptoTransferSendLandingViewState.Success generateSuccessState$feature_crypto_transfer_externalDebug(boolean isRhc, UiCurrencyPair currencyPair, ApiCryptoSupportedNetworks supportedNetworks, boolean useSavedAddressesFlow, boolean hasShownInitialWarningSheet, CryptoTransferConfig config) {
        CryptoTransferConfig.TransferWarnings.Stage send;
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(config, "config");
        StringResource title$feature_crypto_transfer_externalDebug = getTitle$feature_crypto_transfer_externalDebug(currencyPair.getDisplaySymbol(), supportedNetworks);
        UUID id = currencyPair.getAssetCurrency().getId();
        QrScannerState qrScannerState = new QrScannerState(title$feature_crypto_transfer_externalDebug, useSavedAddressesFlow);
        TipsSheetContent2.Send send2 = new TipsSheetContent2.Send(isRhc, config, currencyPair);
        CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet$feature_crypto_transfer_externalDebug = getInitialWarningSheet$feature_crypto_transfer_externalDebug(hasShownInitialWarningSheet, useSavedAddressesFlow, config);
        CryptoTransferConfig.TransferWarnings transferWarnings = config.getTransferWarnings();
        return new CryptoTransferSendLandingViewState.Success(id, title$feature_crypto_transfer_externalDebug, qrScannerState, send2, initialWarningSheet$feature_crypto_transfer_externalDebug, (transferWarnings == null || (send = transferWarnings.getSend()) == null) ? null : send.getFinal(), config.getMaxAddressLength(), config.getAddressTag());
    }

    public final StringResource getTitle$feature_crypto_transfer_externalDebug(String currencyCode, ApiCryptoSupportedNetworks supportedNetworks) {
        ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork;
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        StringResource.Companion companion = StringResource.INSTANCE;
        return (supportedNetworks == null || !supportedNetworks.isSingleNetwork() || (cryptoNetwork = (ApiCryptoSupportedNetworks.CryptoNetwork) CollectionsKt.getOrNull(supportedNetworks.getResults(), 0)) == null || cryptoNetwork.getNetwork_info().getType() == ApiCurrency.CryptoType.NATIVE) ? companion.invoke(C37934R.string.crypto_unified_send_title, currencyCode) : companion.invoke(C37934R.string.crypto_unified_send_title_with_network, currencyCode, supportedNetworks.getResults().get(0).getNetwork_info().getType_name());
    }

    public final CryptoTransferConfig.TransferWarnings.Stage.Warning getInitialWarningSheet$feature_crypto_transfer_externalDebug(boolean hasShownInitialWarningSheet, boolean useSavedAddressesFlow, CryptoTransferConfig config) {
        CryptoTransferConfig.TransferWarnings transferWarnings;
        CryptoTransferConfig.TransferWarnings.Stage send;
        Intrinsics.checkNotNullParameter(config, "config");
        if (hasShownInitialWarningSheet || useSavedAddressesFlow || (transferWarnings = config.getTransferWarnings()) == null || (send = transferWarnings.getSend()) == null) {
            return null;
        }
        return send.getInitial();
    }
}

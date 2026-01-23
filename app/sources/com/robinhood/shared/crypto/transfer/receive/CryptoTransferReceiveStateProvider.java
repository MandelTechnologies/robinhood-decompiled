package com.robinhood.shared.crypto.transfer.receive;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.ApiCryptoTransferDepositDetails;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveViewState;
import com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoTransferReceiveStateProvider.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016JC\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDataState;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState;", "<init>", "()V", "reduce", "dataState", "generateReceiveViewState", "isRhc", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "depositDetails", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails;", "selectedNetworkIndex", "", "config", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "hasShownInitialWarningSheet", "generateReceiveViewState$feature_crypto_transfer_externalDebug", "(ZLcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails;Ljava/lang/Integer;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;Z)Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState;", "getActiveDepositIndex", "availableDepositAddresses", "", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails$ApiCryptoTransferDepositDetail;", "getActiveDepositIndex$feature_crypto_transfer_externalDebug", "(Ljava/lang/Integer;Ljava/util/List;)I", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTransferReceiveStateProvider implements StateProvider<CryptoTransferReceiveDataState, CryptoTransferReceiveViewState> {
    public static final int $stable = 0;

    /* compiled from: CryptoTransferReceiveStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCryptoTransferConfig.TransferStates.ReceiveState.values().length];
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.ReceiveState.ENROLLMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.ReceiveState.MFA_SETUP_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.ReceiveState.ENROLLMENT_PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.ReceiveState.ENROLLMENT_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.ReceiveState.RECEIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoTransferReceiveViewState reduce(CryptoTransferReceiveDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UiCurrencyPair uiCurrencyPair = dataState.getUiCurrencyPair();
        CryptoTransferConfig cryptoTransferConfig = dataState.getCryptoTransferConfig();
        ApiCryptoTransferDepositDetails depositDetails = dataState.getDepositDetails();
        if (uiCurrencyPair == null || cryptoTransferConfig == null) {
            return CryptoTransferReceiveViewState.Loading.INSTANCE;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoTransferConfig.getReceiveState().ordinal()];
        if (i == 1 || i == 2) {
            return new CryptoTransferReceiveViewState.SecuritySetupRequired(cryptoTransferConfig.getEnrollmentState());
        }
        if (i == 3) {
            return CryptoTransferReceiveViewState.PendingEnrollment.INSTANCE;
        }
        if (i == 4) {
            return CryptoTransferReceiveViewState.FailedEnrollment.INSTANCE;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return generateReceiveViewState$feature_crypto_transfer_externalDebug(dataState.isRhc(), uiCurrencyPair, depositDetails, dataState.getSelectedNetworkIndex(), cryptoTransferConfig, dataState.getHasShownInitialWarningSheet());
    }

    public final CryptoTransferReceiveViewState generateReceiveViewState$feature_crypto_transfer_externalDebug(boolean isRhc, UiCurrencyPair currencyPair, ApiCryptoTransferDepositDetails depositDetails, Integer selectedNetworkIndex, CryptoTransferConfig config, boolean hasShownInitialWarningSheet) {
        CryptoTransferConfig.TransferWarnings transferWarnings;
        CryptoTransferConfig.TransferWarnings.Stage receive;
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(config, "config");
        if (depositDetails == null) {
            return CryptoTransferReceiveViewState.Loading.INSTANCE;
        }
        List<ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail> deposit_addresses = depositDetails.getDeposit_addresses();
        if (!deposit_addresses.isEmpty()) {
            List<ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail> list = deposit_addresses;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail) it.next()).is_enabled_for_deposit()) {
                        List<ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail> deposit_addresses2 = depositDetails.getDeposit_addresses();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : deposit_addresses2) {
                            if (((ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail) obj).is_enabled_for_deposit()) {
                                arrayList.add(obj);
                            }
                        }
                        ImmutableList immutableList = extensions2.toImmutableList(arrayList);
                        try {
                            ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail apiCryptoTransferDepositDetail = immutableList.get(getActiveDepositIndex$feature_crypto_transfer_externalDebug(selectedNetworkIndex, immutableList));
                            String code = currencyPair.getAssetCurrency().getCode();
                            UUID id = currencyPair.getAssetCurrency().getId();
                            StringResource displayTitle = CryptoTransferReceiveStateProvider2.getDisplayTitle(apiCryptoTransferDepositDetail);
                            String address = apiCryptoTransferDepositDetail.getAddress();
                            String address_tag = apiCryptoTransferDepositDetail.getAddress_tag();
                            StringResource disclaimer = CryptoTransferReceiveStateProvider2.getDisclaimer(apiCryptoTransferDepositDetail);
                            CryptoTransferReceiveViewState.Success.NetworkChip networkChip = CryptoTransferReceiveStateProvider2.getNetworkChip(depositDetails.getDeposit_addresses(), apiCryptoTransferDepositDetail);
                            ImmutableList immutableList2 = extensions2.toImmutableList(depositDetails.getDeposit_addresses());
                            CryptoTransferConfig.TransferWarnings.Stage.Warning initial = null;
                            if (!hasShownInitialWarningSheet && (transferWarnings = config.getTransferWarnings()) != null && (receive = transferWarnings.getReceive()) != null) {
                                initial = receive.getInitial();
                            }
                            return new CryptoTransferReceiveViewState.Success(code, id, displayTitle, address, address_tag, disclaimer, networkChip, immutableList2, initial, new TipsSheetContent2.Receive(isRhc, config, apiCryptoTransferDepositDetail));
                        } catch (IndexOutOfBoundsException unused) {
                            return CryptoTransferReceiveViewState.Error.INSTANCE;
                        }
                    }
                }
            }
        }
        return CryptoTransferReceiveViewState.Error.INSTANCE;
    }

    public final int getActiveDepositIndex$feature_crypto_transfer_externalDebug(Integer selectedNetworkIndex, List<ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail> availableDepositAddresses) {
        Intrinsics.checkNotNullParameter(availableDepositAddresses, "availableDepositAddresses");
        if (selectedNetworkIndex != null) {
            if (selectedNetworkIndex.intValue() > CollectionsKt.getLastIndex(availableDepositAddresses)) {
                return -1;
            }
            return selectedNetworkIndex.intValue();
        }
        Iterator<ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail> it = availableDepositAddresses.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().is_default_for_deposit()) {
                break;
            }
            i2++;
        }
        Iterator<ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail> it2 = availableDepositAddresses.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (it2.next().is_enabled_for_deposit()) {
                break;
            }
            i++;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i != -1) {
            return i;
        }
        return -1;
    }
}

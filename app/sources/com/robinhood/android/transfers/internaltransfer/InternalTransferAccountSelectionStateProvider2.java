package com.robinhood.android.transfers.internaltransfer;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import kotlin.Metadata;

/* compiled from: InternalTransferAccountSelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getIconAsset", "(Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;)Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "feature-transfer-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InternalTransferAccountSelectionStateProvider2 {

    /* compiled from: InternalTransferAccountSelectionStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionStateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ServerToBentoAssetMapper2 getIconAsset(ApiTransferAccount.TransferAccountType transferAccountType) {
        int i = WhenMappings.$EnumSwitchMapping$0[transferAccountType.ordinal()];
        if (i == 1) {
            return ServerToBentoAssetMapper2.CHART_LINE_24;
        }
        if (i == 2) {
            return ServerToBentoAssetMapper2.ISA_24;
        }
        return ServerToBentoAssetMapper2.UNKNOWN;
    }
}

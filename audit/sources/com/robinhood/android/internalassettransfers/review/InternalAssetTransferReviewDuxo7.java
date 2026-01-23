package com.robinhood.android.internalassettransfers.review;

import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.review.models.UiEligibleAsset;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.api.ManagementType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nimbus.service.p511v1.EquityPositionDto;
import nimbus.service.p511v1.TransferAccountInfoDto;
import rosetta.account.ManagementTypeDto;

/* compiled from: InternalAssetTransferReviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b¨\u0006\t"}, m3636d2 = {"toTransferAccountInfoDto", "Lnimbus/service/v1/TransferAccountInfoDto;", "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "toManagementTypeDto", "Lrosetta/account/ManagementTypeDto;", "Lcom/robinhood/models/api/ManagementType;", "toEquityPositionDto", "Lnimbus/service/v1/EquityPositionDto;", "Lcom/robinhood/android/internalassettransfers/review/models/UiEligibleAsset;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxoKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferReviewDuxo7 {

    /* compiled from: InternalAssetTransferReviewDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ManagementType.values().length];
            try {
                iArr[ManagementType.SELF_DIRECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ManagementType.MANAGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ManagementType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TransferAccountInfoDto toTransferAccountInfoDto(UiIatAccount uiIatAccount) {
        Intrinsics.checkNotNullParameter(uiIatAccount, "<this>");
        return new TransferAccountInfoDto(uiIatAccount.getRhsAccountNumber(), uiIatAccount.getBrokerageAccountType().toBrokerageAccountTypeDto(), toManagementTypeDto(uiIatAccount.getManagementType()));
    }

    public static final ManagementTypeDto toManagementTypeDto(ManagementType managementType) {
        Intrinsics.checkNotNullParameter(managementType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[managementType.ordinal()];
        if (i == 1) {
            return ManagementTypeDto.SELF_DIRECTED;
        }
        if (i == 2) {
            return ManagementTypeDto.MANAGED;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ManagementTypeDto.MANAGEMENT_TYPE_UNSPECIFIED;
    }

    public static final EquityPositionDto toEquityPositionDto(UiEligibleAsset uiEligibleAsset) {
        Intrinsics.checkNotNullParameter(uiEligibleAsset, "<this>");
        String instrumentId = uiEligibleAsset.getInstrumentId();
        String string2 = uiEligibleAsset.getShares().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new EquityPositionDto(instrumentId, new IdlDecimal(string2));
    }
}

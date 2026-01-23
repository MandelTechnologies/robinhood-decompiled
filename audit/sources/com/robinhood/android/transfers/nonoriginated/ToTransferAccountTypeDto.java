package com.robinhood.android.transfers.nonoriginated;

import bff_money_movement.service.p019v1.TransferAccountTypeDto;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ToTransferAccountTypeDto.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toTransferAccountTypeDto", "Lbff_money_movement/service/v1/TransferAccountTypeDto;", "Lcom/robinhood/models/api/BrokerageAccountType;", "feature-non-originated-transfer-info_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.nonoriginated.ToTransferAccountTypeDtoKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ToTransferAccountTypeDto {

    /* compiled from: ToTransferAccountTypeDto.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.nonoriginated.ToTransferAccountTypeDtoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TransferAccountTypeDto toTransferAccountTypeDto(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
            case 1:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHS;
            case 2:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_IRA_ROTH;
            case 3:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL;
            case 4:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS;
            case 5:
            case 6:
            case 7:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
            case 8:
                throw new IllegalStateException("ISA stocks and share brokerage type not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

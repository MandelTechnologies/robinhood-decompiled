package com.robinhood.android.lib.transfers.util;

import bff_money_movement.service.p019v1.CreateTransferAccountDto;
import bff_money_movement.service.p019v1.TransferAccountTypeDto;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.transfers.api.TransferType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.payment_hub.p540v1.service.TransferTypeDto;

/* compiled from: IdlConverters.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b¨\u0006\t"}, m3636d2 = {"toTransferAccountTypeDto", "Lbff_money_movement/service/v1/TransferAccountTypeDto;", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "toTransferTypeDto", "Lrosetta/payment_hub/v1/service/TransferTypeDto;", "Lcom/robinhood/transfers/api/TransferType;", "toTransferAccountDto", "Lbff_money_movement/service/v1/CreateTransferAccountDto;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "lib-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.transfers.util.IdlConvertersKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class IdlConverters {

    /* compiled from: IdlConverters.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.transfers.util.IdlConvertersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr[ApiTransferAccount.TransferAccountType.ACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY_BANKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.SEPA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UGMA.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UTMA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TransferType.values().length];
            try {
                iArr2[TransferType.CHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[TransferType.DEBIT_CARD_TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[TransferType.ORIGINATED_ACH.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[TransferType.INSTANT_BANK_TRANSFER.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[TransferType.NON_ORIGINATED_ACH.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[TransferType.NON_ORIGINATED_ACH_EARLY_PAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[TransferType.INTER_ENTITY.ordinal()] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[TransferType.INTRA_ENTITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[TransferType.INTERNAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[TransferType.INCOMING_WIRE.ordinal()] = 10;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[TransferType.OUTGOING_WIRE.ordinal()] = 11;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[TransferType.UK_BANK_TRANSFER.ordinal()] = 12;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[TransferType.SEPA_CREDIT.ordinal()] = 13;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[TransferType.SG_BANK_WITHDRAWAL.ordinal()] = 14;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[TransferType.UK_OPEN_BANKING_TRANSFER.ordinal()] = 15;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[TransferType.ROLLOVER_ACH.ordinal()] = 16;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[TransferType.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused34) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final TransferAccountTypeDto toTransferAccountTypeDto(ApiTransferAccount.TransferAccountType transferAccountType) {
        Intrinsics.checkNotNullParameter(transferAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[transferAccountType.ordinal()]) {
            case 1:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_ACH;
            case 2:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_DCF;
            case 3:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHS;
            case 4:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHY;
            case 5:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHY_BANKING;
            case 6:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_IRA_ROTH;
            case 7:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL;
            case 8:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_SEPA;
            case 9:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHCE;
            case 10:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT;
            case 11:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
            case 12:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS;
            case 13:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT;
            case 14:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
            case 15:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
            case 16:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
            case 17:
                return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final TransferTypeDto toTransferTypeDto(TransferType transferType) {
        switch (transferType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[transferType.ordinal()]) {
            case -1:
            case 15:
            case 16:
            case 17:
                return TransferTypeDto.TRANSFER_TYPE__UNSPECIFIED;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return TransferTypeDto.TRANSFER_TYPE_CHECK;
            case 2:
                return TransferTypeDto.TRANSFER_TYPE_DEBIT_CARD_FUNDING;
            case 3:
                return TransferTypeDto.TRANSFER_TYPE_ORIGINATED_ACH;
            case 4:
                return TransferTypeDto.TRANSFER_TYPE_INSTANT_BANK_TRANSFER;
            case 5:
                return TransferTypeDto.TRANSFER_TYPE_NON_ORIGINATED_ACH;
            case 6:
                return TransferTypeDto.TRANSFER_TYPE_NON_ORIGINATED_ACH;
            case 7:
                return TransferTypeDto.TRANSFER_TYPE_INTER_ENTITY;
            case 8:
                return TransferTypeDto.TRANSFER_TYPE_INTER_ENTITY;
            case 9:
                return TransferTypeDto.TRANSFER_TYPE_INTERNAL;
            case 10:
                return TransferTypeDto.TRANSFER_TYPE_INCOMING_WIRE;
            case 11:
                return TransferTypeDto.TRANSFER_TYPE_OUTGOING_WIRE;
            case 12:
                return TransferTypeDto.TRANSFER_TYPE_UK_BANK_TRANSFER;
            case 13:
                return TransferTypeDto.TRANSFER_TYPE_SEPA_CREDIT;
            case 14:
                return TransferTypeDto.TRANSFER_TYPE_SG_BANK_WITHDRAWAL;
        }
    }

    public static final CreateTransferAccountDto toTransferAccountDto(TransferAccount transferAccount) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        return new CreateTransferAccountDto(transferAccount.getAccountId(), toTransferAccountTypeDto(transferAccount.getType()), null, 4, null);
    }
}

package com.robinhood.android.transfers.p271ui.p272v2.logging;

import com.robinhood.lib.transfers.contracts.models.TransferAccountType;
import com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrogramLoggingConverters.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007¨\u0006\b"}, m3636d2 = {"toBottomSheetIdentifier", "", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "toMAXTransferAccountSelectionState", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState;", "toEventTransferAccountType", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.v2.logging.MicrogramLoggingConvertersKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class MicrogramLoggingConverters {

    /* compiled from: MicrogramLoggingConverters.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.v2.logging.MicrogramLoggingConvertersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferAccountDirection.values().length];
            try {
                iArr[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TransferAccountType.values().length];
            try {
                iArr2[TransferAccountType.ACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TransferAccountType.DEBIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TransferAccountType.APPLE_PAY_DCF.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TransferAccountType.RHS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TransferAccountType.RHY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TransferAccountType.RHY_BANKING.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[TransferAccountType.IRA_ROTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[TransferAccountType.IRA_TRADITIONAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[TransferAccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[TransferAccountType.RHCE.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[TransferAccountType.SEPA.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[TransferAccountType.CUSTODIAL_UGMA.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[TransferAccountType.CUSTODIAL_UTMA.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[TransferAccountType.UNKNOWN.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String toBottomSheetIdentifier(TransferAccountDirection transferAccountDirection) {
        Intrinsics.checkNotNullParameter(transferAccountDirection, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[transferAccountDirection.ordinal()];
        if (i == 1) {
            return "source_account_selection";
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "sink_account_selection";
    }

    public static final MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState toMAXTransferAccountSelectionState(TransferAccountDirection transferAccountDirection) {
        Intrinsics.checkNotNullParameter(transferAccountDirection, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[transferAccountDirection.ordinal()];
        if (i == 1) {
            return MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.SOURCE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.SINK;
    }

    public static final MAXTransferContext.TransferAccount.TransferAccountType toEventTransferAccountType(TransferAccountType transferAccountType) {
        Intrinsics.checkNotNullParameter(transferAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[transferAccountType.ordinal()]) {
            case 1:
                return MAXTransferContext.TransferAccount.TransferAccountType.ACH;
            case 2:
                return MAXTransferContext.TransferAccount.TransferAccountType.DCF;
            case 3:
                return MAXTransferContext.TransferAccount.TransferAccountType.APPLE_PAY_DCF;
            case 4:
                return MAXTransferContext.TransferAccount.TransferAccountType.RHS;
            case 5:
                return MAXTransferContext.TransferAccount.TransferAccountType.RHY;
            case 6:
                return MAXTransferContext.TransferAccount.TransferAccountType.RHY_BANKING;
            case 7:
                return MAXTransferContext.TransferAccount.TransferAccountType.IRA_ROTH;
            case 8:
                return MAXTransferContext.TransferAccount.TransferAccountType.IRA_TRADITIONAL;
            case 9:
                return MAXTransferContext.TransferAccount.TransferAccountType.UK_BANK_ACCOUNT;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return MAXTransferContext.TransferAccount.TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

package com.robinhood.android.transfers.contracts;

import com.robinhood.enums.RhEnum;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransferFundsDeepLinkAccountType.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "IRA_TRADITIONAL", "IRA_ROTH", "ACH_RELATIONSHIP", "UK_BANK_ACCOUNT", "I18N_BANK_ACCOUNT", "ACH_RELATIONSHIP_INSTANT", "BROKERAGE", "DEBIT_CARD", "SPENDING", "JOINT_TENANCY_WITH_ROS", "UNKNOWN", "toTransferAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "Companion", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransferFundsDeepLinkAccountType implements RhEnum<TransferFundsDeepLinkAccountType> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferFundsDeepLinkAccountType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final TransferFundsDeepLinkAccountType IRA_TRADITIONAL = new TransferFundsDeepLinkAccountType("IRA_TRADITIONAL", 0, "ira_traditional");
    public static final TransferFundsDeepLinkAccountType IRA_ROTH = new TransferFundsDeepLinkAccountType("IRA_ROTH", 1, "ira_roth");
    public static final TransferFundsDeepLinkAccountType ACH_RELATIONSHIP = new TransferFundsDeepLinkAccountType("ACH_RELATIONSHIP", 2, "ach_relationship");
    public static final TransferFundsDeepLinkAccountType UK_BANK_ACCOUNT = new TransferFundsDeepLinkAccountType("UK_BANK_ACCOUNT", 3, PaymentInstrumentConstants.UK_BANK_ACCOUNT_SERVER_VALUE);
    public static final TransferFundsDeepLinkAccountType I18N_BANK_ACCOUNT = new TransferFundsDeepLinkAccountType("I18N_BANK_ACCOUNT", 4, PaymentInstrumentConstants.I18N_BANK_ACCOUNT_SERVER_VALUE);
    public static final TransferFundsDeepLinkAccountType ACH_RELATIONSHIP_INSTANT = new TransferFundsDeepLinkAccountType("ACH_RELATIONSHIP_INSTANT", 5, "ach_relationship_instant");
    public static final TransferFundsDeepLinkAccountType BROKERAGE = new TransferFundsDeepLinkAccountType("BROKERAGE", 6, "brokerage");
    public static final TransferFundsDeepLinkAccountType DEBIT_CARD = new TransferFundsDeepLinkAccountType("DEBIT_CARD", 7, "debit_card");
    public static final TransferFundsDeepLinkAccountType SPENDING = new TransferFundsDeepLinkAccountType("SPENDING", 8, "spending");
    public static final TransferFundsDeepLinkAccountType JOINT_TENANCY_WITH_ROS = new TransferFundsDeepLinkAccountType("JOINT_TENANCY_WITH_ROS", 9, "joint_tenancy_with_ros");
    public static final TransferFundsDeepLinkAccountType UNKNOWN = new TransferFundsDeepLinkAccountType("UNKNOWN", 10, "unknown");

    /* compiled from: TransferFundsDeepLinkAccountType.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferFundsDeepLinkAccountType.values().length];
            try {
                iArr[TransferFundsDeepLinkAccountType.IRA_TRADITIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferFundsDeepLinkAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferFundsDeepLinkAccountType.ACH_RELATIONSHIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransferFundsDeepLinkAccountType.ACH_RELATIONSHIP_INSTANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransferFundsDeepLinkAccountType.BROKERAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransferFundsDeepLinkAccountType.DEBIT_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TransferFundsDeepLinkAccountType.SPENDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TransferFundsDeepLinkAccountType.UK_BANK_ACCOUNT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TransferFundsDeepLinkAccountType.I18N_BANK_ACCOUNT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TransferFundsDeepLinkAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TransferFundsDeepLinkAccountType.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ TransferFundsDeepLinkAccountType[] $values() {
        return new TransferFundsDeepLinkAccountType[]{IRA_TRADITIONAL, IRA_ROTH, ACH_RELATIONSHIP, UK_BANK_ACCOUNT, I18N_BANK_ACCOUNT, ACH_RELATIONSHIP_INSTANT, BROKERAGE, DEBIT_CARD, SPENDING, JOINT_TENANCY_WITH_ROS, UNKNOWN};
    }

    public static EnumEntries<TransferFundsDeepLinkAccountType> getEntries() {
        return $ENTRIES;
    }

    private TransferFundsDeepLinkAccountType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        TransferFundsDeepLinkAccountType[] transferFundsDeepLinkAccountTypeArr$values = $values();
        $VALUES = transferFundsDeepLinkAccountTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferFundsDeepLinkAccountTypeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: TransferFundsDeepLinkAccountType.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;", "<init>", "()V", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Defaulted<TransferFundsDeepLinkAccountType> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(TransferFundsDeepLinkAccountType.values(), TransferFundsDeepLinkAccountType.UNKNOWN, false, 4, null);
        }
    }

    public final ApiTransferAccount.TransferAccountType toTransferAccountType() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL;
            case 2:
                return ApiTransferAccount.TransferAccountType.IRA_ROTH;
            case 3:
            case 4:
                return ApiTransferAccount.TransferAccountType.ACH;
            case 5:
                return ApiTransferAccount.TransferAccountType.RHS;
            case 6:
                return ApiTransferAccount.TransferAccountType.DEBIT_CARD;
            case 7:
                return ApiTransferAccount.TransferAccountType.RHY;
            case 8:
                return ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT;
            case 9:
                return ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT;
            case 10:
                return ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS;
            case 11:
                return ApiTransferAccount.TransferAccountType.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static TransferFundsDeepLinkAccountType valueOf(String str) {
        return (TransferFundsDeepLinkAccountType) Enum.valueOf(TransferFundsDeepLinkAccountType.class, str);
    }

    public static TransferFundsDeepLinkAccountType[] values() {
        return (TransferFundsDeepLinkAccountType[]) $VALUES.clone();
    }
}

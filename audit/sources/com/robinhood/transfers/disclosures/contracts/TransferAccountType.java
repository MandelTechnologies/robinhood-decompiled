package com.robinhood.transfers.disclosures.contracts;

import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransferAccountType.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/TransferAccountType;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "ACH", "DEBIT_CARD", "RHS", "RHY", "IRA_ROTH", "IRA_TRADITIONAL", "SEPA", "RHCE", "UK_BANK_ACCOUNT", "JOINT_TENANCY_WITH_ROS", "OUTGOING_WIRE_ACCOUNT", "I18N_BANK_ACCOUNT", "UNKNOWN", "isIra", "", "()Z", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final class TransferAccountType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferAccountType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final TransferAccountType ACH = new TransferAccountType("ACH", 0, "ach");
    public static final TransferAccountType DEBIT_CARD = new TransferAccountType("DEBIT_CARD", 1, "dcf");
    public static final TransferAccountType RHS = new TransferAccountType("RHS", 2, "rhs");
    public static final TransferAccountType RHY = new TransferAccountType("RHY", 3, "rhy");
    public static final TransferAccountType IRA_ROTH = new TransferAccountType("IRA_ROTH", 4, "ira_roth");
    public static final TransferAccountType IRA_TRADITIONAL = new TransferAccountType("IRA_TRADITIONAL", 5, "ira_traditional");
    public static final TransferAccountType SEPA = new TransferAccountType("SEPA", 6, "sepa");
    public static final TransferAccountType RHCE = new TransferAccountType("RHCE", 7, "rhce");
    public static final TransferAccountType UK_BANK_ACCOUNT = new TransferAccountType("UK_BANK_ACCOUNT", 8, PaymentInstrumentConstants.UK_BANK_ACCOUNT_SERVER_VALUE);
    public static final TransferAccountType JOINT_TENANCY_WITH_ROS = new TransferAccountType("JOINT_TENANCY_WITH_ROS", 9, "joint_tenancy_with_ros");
    public static final TransferAccountType OUTGOING_WIRE_ACCOUNT = new TransferAccountType("OUTGOING_WIRE_ACCOUNT", 10, PaymentInstrumentConstants.OUTGOING_WIRE_SERVER_VALUE);
    public static final TransferAccountType I18N_BANK_ACCOUNT = new TransferAccountType("I18N_BANK_ACCOUNT", 11, PaymentInstrumentConstants.I18N_BANK_ACCOUNT_SERVER_VALUE);
    public static final TransferAccountType UNKNOWN = new TransferAccountType("UNKNOWN", 12, "unknown");

    /* compiled from: TransferAccountType.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferAccountType.values().length];
            try {
                iArr[TransferAccountType.IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferAccountType.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferAccountType.ACH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransferAccountType.DEBIT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransferAccountType.RHS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransferAccountType.RHY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TransferAccountType.RHCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TransferAccountType.SEPA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TransferAccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TransferAccountType.UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ TransferAccountType[] $values() {
        return new TransferAccountType[]{ACH, DEBIT_CARD, RHS, RHY, IRA_ROTH, IRA_TRADITIONAL, SEPA, RHCE, UK_BANK_ACCOUNT, JOINT_TENANCY_WITH_ROS, OUTGOING_WIRE_ACCOUNT, I18N_BANK_ACCOUNT, UNKNOWN};
    }

    public static EnumEntries<TransferAccountType> getEntries() {
        return $ENTRIES;
    }

    /* compiled from: TransferAccountType.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/TransferAccountType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/disclosures/contracts/TransferAccountType;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) TransferAccountType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TransferAccountType> serializer() {
            return get$cachedSerializer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return Enums4.createSimpleEnumSerializer("com.robinhood.transfers.disclosures.contracts.TransferAccountType", values());
    }

    private TransferAccountType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        TransferAccountType[] transferAccountTypeArr$values = $values();
        $VALUES = transferAccountTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferAccountTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.transfers.disclosures.contracts.TransferAccountType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferAccountType._init_$_anonymous_();
            }
        });
    }

    public final boolean isIra() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static TransferAccountType valueOf(String str) {
        return (TransferAccountType) Enum.valueOf(TransferAccountType.class, str);
    }

    public static TransferAccountType[] values() {
        return (TransferAccountType[]) $VALUES.clone();
    }
}

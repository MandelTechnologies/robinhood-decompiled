package com.robinhood.transfers.suggestions.pills.contracts;

import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentConstants;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MicrogramTransferAccountType.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountType;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "isIra", "", "()Z", "getServerValue", "()Ljava/lang/String;", "ACH", "DEBIT_CARD", "RHS", "RHY", "IRA_ROTH", "IRA_TRADITIONAL", "SEPA", "RHCE", "UK_BANK_ACCOUNT", "JOINT_TENANCY_WITH_ROS", "UNKNOWN", "ANY", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final class MicrogramTransferAccountType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MicrogramTransferAccountType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;

    @SerialName("ach")
    public static final MicrogramTransferAccountType ACH = new MicrogramTransferAccountType("ACH", 0, "ach");

    @SerialName("dcf")
    public static final MicrogramTransferAccountType DEBIT_CARD = new MicrogramTransferAccountType("DEBIT_CARD", 1, "dcf");

    @SerialName("rhs")
    public static final MicrogramTransferAccountType RHS = new MicrogramTransferAccountType("RHS", 2, "rhs");

    @SerialName("rhy")
    public static final MicrogramTransferAccountType RHY = new MicrogramTransferAccountType("RHY", 3, "rhy");

    @SerialName("ira_roth")
    public static final MicrogramTransferAccountType IRA_ROTH = new MicrogramTransferAccountType("IRA_ROTH", 4, "ira_roth");

    @SerialName("ira_traditional")
    public static final MicrogramTransferAccountType IRA_TRADITIONAL = new MicrogramTransferAccountType("IRA_TRADITIONAL", 5, "ira_traditional");

    @SerialName("sepa")
    public static final MicrogramTransferAccountType SEPA = new MicrogramTransferAccountType("SEPA", 6, "sepa");

    @SerialName("rhce")
    public static final MicrogramTransferAccountType RHCE = new MicrogramTransferAccountType("RHCE", 7, "rhce");

    @SerialName(PaymentInstrumentConstants.UK_BANK_ACCOUNT_SERVER_VALUE)
    public static final MicrogramTransferAccountType UK_BANK_ACCOUNT = new MicrogramTransferAccountType("UK_BANK_ACCOUNT", 8, PaymentInstrumentConstants.UK_BANK_ACCOUNT_SERVER_VALUE);

    @SerialName("joint_tenancy_with_ros")
    public static final MicrogramTransferAccountType JOINT_TENANCY_WITH_ROS = new MicrogramTransferAccountType("JOINT_TENANCY_WITH_ROS", 9, "joint_tenancy_with_ros");

    @SerialName("unknown")
    public static final MicrogramTransferAccountType UNKNOWN = new MicrogramTransferAccountType("UNKNOWN", 10, "unknown");

    @SerialName("any")
    public static final MicrogramTransferAccountType ANY = new MicrogramTransferAccountType("ANY", 11, "any");

    /* compiled from: MicrogramTransferAccountType.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MicrogramTransferAccountType.values().length];
            try {
                iArr[MicrogramTransferAccountType.IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MicrogramTransferAccountType.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MicrogramTransferAccountType.ACH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MicrogramTransferAccountType.DEBIT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MicrogramTransferAccountType.RHS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MicrogramTransferAccountType.RHY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MicrogramTransferAccountType.RHCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MicrogramTransferAccountType.SEPA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MicrogramTransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MicrogramTransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MicrogramTransferAccountType.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MicrogramTransferAccountType.ANY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ MicrogramTransferAccountType[] $values() {
        return new MicrogramTransferAccountType[]{ACH, DEBIT_CARD, RHS, RHY, IRA_ROTH, IRA_TRADITIONAL, SEPA, RHCE, UK_BANK_ACCOUNT, JOINT_TENANCY_WITH_ROS, UNKNOWN, ANY};
    }

    public static EnumEntries<MicrogramTransferAccountType> getEntries() {
        return $ENTRIES;
    }

    public static MicrogramTransferAccountType valueOf(String str) {
        return (MicrogramTransferAccountType) Enum.valueOf(MicrogramTransferAccountType.class, str);
    }

    public static MicrogramTransferAccountType[] values() {
        return (MicrogramTransferAccountType[]) $VALUES.clone();
    }

    private MicrogramTransferAccountType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        MicrogramTransferAccountType[] microgramTransferAccountTypeArr$values = $values();
        $VALUES = microgramTransferAccountTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(microgramTransferAccountTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.robinhood.transfers.suggestions.pills.contracts.MicrogramTransferAccountType.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("com.robinhood.transfers.suggestions.pills.contracts.MicrogramTransferAccountType", MicrogramTransferAccountType.values(), new String[]{"ach", "dcf", "rhs", "rhy", "ira_roth", "ira_traditional", "sepa", "rhce", PaymentInstrumentConstants.UK_BANK_ACCOUNT_SERVER_VALUE, "joint_tenancy_with_ros", "unknown", "any"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null}, null);
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
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: MicrogramTransferAccountType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountType$Companion;", "", "()V", "fromServerValue", "Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountType;", "serverValue", "", "serializer", "Lkotlinx/serialization/KSerializer;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) MicrogramTransferAccountType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<MicrogramTransferAccountType> serializer() {
            return get$cachedSerializer();
        }

        public final MicrogramTransferAccountType fromServerValue(String serverValue) {
            MicrogramTransferAccountType next;
            Intrinsics.checkNotNullParameter(serverValue, "serverValue");
            Iterator<MicrogramTransferAccountType> it = MicrogramTransferAccountType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getServerValue(), serverValue)) {
                    break;
                }
            }
            return next;
        }
    }
}

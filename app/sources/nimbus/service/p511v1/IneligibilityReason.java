package nimbus.service.p511v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IneligibilityReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, m3636d2 = {"Lnimbus/service/v1/IneligibilityReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INELIGIBILITY_REASON_UNSPECIFIED", "INELIGIBILITY_REASON_NONE", "INELIGIBILITY_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED", "INELIGIBILITY_REASON_PDT_25K_MINIMUM_EQUITY_CHECK_FAILED", "INELIGIBILITY_REASON_MAINTENANCE_EXCESS_CHECK_FAILED", "INELIGIBILITY_REASON_BORROWING_LIMIT_CHECK_FAILED", "INELIGIBILITY_REASON_TRANSFER_LIMIT_CHECK_FAILED", "INELIGIBILITY_REASON_UNSETTLED_POSITIONS_CHECK_FAILED", "INELIGIBILITY_REASON_NEGATIVE_TRANSFER_MARKET_VALUE", "INELIGIBILITY_REASON_INSTANT_CHECK_FAILED", "INELIGIBILITY_REASON_TRANSFER_COUNT_CHECK_FAILED", "INELIGIBILITY_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED", "INELIGIBILITY_REASON_INSTRUMENT_NOT_TRANSFERABLE", "INELIGIBILITY_REASON_EMPTY_TRANSFER", "INELIGIBILITY_REASON_MANAGED_ACCOUNT_FUNDING_TRANSFER_VALUE_CHECK_FAILED", "INELIGIBILITY_REASON_OTHER", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class IneligibilityReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IneligibilityReason[] $VALUES;

    @JvmField
    public static final ProtoAdapter<IneligibilityReason> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final IneligibilityReason INELIGIBILITY_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED;
    public static final IneligibilityReason INELIGIBILITY_REASON_BORROWING_LIMIT_CHECK_FAILED;
    public static final IneligibilityReason INELIGIBILITY_REASON_EMPTY_TRANSFER;
    public static final IneligibilityReason INELIGIBILITY_REASON_INSTANT_CHECK_FAILED;
    public static final IneligibilityReason INELIGIBILITY_REASON_INSTRUMENT_NOT_TRANSFERABLE;
    public static final IneligibilityReason INELIGIBILITY_REASON_MAINTENANCE_EXCESS_CHECK_FAILED;

    /* renamed from: INELIGIBILITY_REASON_MANAGED_ACCOUNT_FUNDING_TRANSFER_VALUE_CHECK_FAILED */
    public static final IneligibilityReason f7134x994b2b1e;
    public static final IneligibilityReason INELIGIBILITY_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED;
    public static final IneligibilityReason INELIGIBILITY_REASON_NEGATIVE_TRANSFER_MARKET_VALUE;
    public static final IneligibilityReason INELIGIBILITY_REASON_NONE;
    public static final IneligibilityReason INELIGIBILITY_REASON_OTHER;
    public static final IneligibilityReason INELIGIBILITY_REASON_PDT_25K_MINIMUM_EQUITY_CHECK_FAILED;
    public static final IneligibilityReason INELIGIBILITY_REASON_TRANSFER_COUNT_CHECK_FAILED;
    public static final IneligibilityReason INELIGIBILITY_REASON_TRANSFER_LIMIT_CHECK_FAILED;
    public static final IneligibilityReason INELIGIBILITY_REASON_UNSETTLED_POSITIONS_CHECK_FAILED;
    public static final IneligibilityReason INELIGIBILITY_REASON_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ IneligibilityReason[] $values() {
        return new IneligibilityReason[]{INELIGIBILITY_REASON_UNSPECIFIED, INELIGIBILITY_REASON_NONE, INELIGIBILITY_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED, INELIGIBILITY_REASON_PDT_25K_MINIMUM_EQUITY_CHECK_FAILED, INELIGIBILITY_REASON_MAINTENANCE_EXCESS_CHECK_FAILED, INELIGIBILITY_REASON_BORROWING_LIMIT_CHECK_FAILED, INELIGIBILITY_REASON_TRANSFER_LIMIT_CHECK_FAILED, INELIGIBILITY_REASON_UNSETTLED_POSITIONS_CHECK_FAILED, INELIGIBILITY_REASON_NEGATIVE_TRANSFER_MARKET_VALUE, INELIGIBILITY_REASON_INSTANT_CHECK_FAILED, INELIGIBILITY_REASON_TRANSFER_COUNT_CHECK_FAILED, INELIGIBILITY_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED, INELIGIBILITY_REASON_INSTRUMENT_NOT_TRANSFERABLE, INELIGIBILITY_REASON_EMPTY_TRANSFER, f7134x994b2b1e, INELIGIBILITY_REASON_OTHER};
    }

    @JvmStatic
    public static final IneligibilityReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<IneligibilityReason> getEntries() {
        return $ENTRIES;
    }

    private IneligibilityReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final IneligibilityReason ineligibilityReason = new IneligibilityReason("INELIGIBILITY_REASON_UNSPECIFIED", 0, 0);
        INELIGIBILITY_REASON_UNSPECIFIED = ineligibilityReason;
        INELIGIBILITY_REASON_NONE = new IneligibilityReason("INELIGIBILITY_REASON_NONE", 1, 1);
        INELIGIBILITY_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED = new IneligibilityReason("INELIGIBILITY_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED", 2, 2);
        INELIGIBILITY_REASON_PDT_25K_MINIMUM_EQUITY_CHECK_FAILED = new IneligibilityReason("INELIGIBILITY_REASON_PDT_25K_MINIMUM_EQUITY_CHECK_FAILED", 3, 3);
        INELIGIBILITY_REASON_MAINTENANCE_EXCESS_CHECK_FAILED = new IneligibilityReason("INELIGIBILITY_REASON_MAINTENANCE_EXCESS_CHECK_FAILED", 4, 4);
        INELIGIBILITY_REASON_BORROWING_LIMIT_CHECK_FAILED = new IneligibilityReason("INELIGIBILITY_REASON_BORROWING_LIMIT_CHECK_FAILED", 5, 5);
        INELIGIBILITY_REASON_TRANSFER_LIMIT_CHECK_FAILED = new IneligibilityReason("INELIGIBILITY_REASON_TRANSFER_LIMIT_CHECK_FAILED", 6, 6);
        INELIGIBILITY_REASON_UNSETTLED_POSITIONS_CHECK_FAILED = new IneligibilityReason("INELIGIBILITY_REASON_UNSETTLED_POSITIONS_CHECK_FAILED", 7, 7);
        INELIGIBILITY_REASON_NEGATIVE_TRANSFER_MARKET_VALUE = new IneligibilityReason("INELIGIBILITY_REASON_NEGATIVE_TRANSFER_MARKET_VALUE", 8, 8);
        INELIGIBILITY_REASON_INSTANT_CHECK_FAILED = new IneligibilityReason("INELIGIBILITY_REASON_INSTANT_CHECK_FAILED", 9, 9);
        INELIGIBILITY_REASON_TRANSFER_COUNT_CHECK_FAILED = new IneligibilityReason("INELIGIBILITY_REASON_TRANSFER_COUNT_CHECK_FAILED", 10, 25);
        INELIGIBILITY_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED = new IneligibilityReason("INELIGIBILITY_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED", 11, 28);
        INELIGIBILITY_REASON_INSTRUMENT_NOT_TRANSFERABLE = new IneligibilityReason("INELIGIBILITY_REASON_INSTRUMENT_NOT_TRANSFERABLE", 12, 29);
        INELIGIBILITY_REASON_EMPTY_TRANSFER = new IneligibilityReason("INELIGIBILITY_REASON_EMPTY_TRANSFER", 13, 30);
        f7134x994b2b1e = new IneligibilityReason("INELIGIBILITY_REASON_MANAGED_ACCOUNT_FUNDING_TRANSFER_VALUE_CHECK_FAILED", 14, 31);
        INELIGIBILITY_REASON_OTHER = new IneligibilityReason("INELIGIBILITY_REASON_OTHER", 15, 32);
        IneligibilityReason[] ineligibilityReasonArr$values = $values();
        $VALUES = ineligibilityReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(ineligibilityReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IneligibilityReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<IneligibilityReason>(orCreateKotlinClass, syntax, ineligibilityReason) { // from class: nimbus.service.v1.IneligibilityReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public IneligibilityReason fromValue(int value) {
                return IneligibilityReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: IneligibilityReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lnimbus/service/v1/IneligibilityReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lnimbus/service/v1/IneligibilityReason;", "fromValue", "value", "", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IneligibilityReason fromValue(int value) {
            if (value != 25) {
                switch (value) {
                    case 0:
                        return IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED;
                    case 1:
                        return IneligibilityReason.INELIGIBILITY_REASON_NONE;
                    case 2:
                        return IneligibilityReason.INELIGIBILITY_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED;
                    case 3:
                        return IneligibilityReason.INELIGIBILITY_REASON_PDT_25K_MINIMUM_EQUITY_CHECK_FAILED;
                    case 4:
                        return IneligibilityReason.INELIGIBILITY_REASON_MAINTENANCE_EXCESS_CHECK_FAILED;
                    case 5:
                        return IneligibilityReason.INELIGIBILITY_REASON_BORROWING_LIMIT_CHECK_FAILED;
                    case 6:
                        return IneligibilityReason.INELIGIBILITY_REASON_TRANSFER_LIMIT_CHECK_FAILED;
                    case 7:
                        return IneligibilityReason.INELIGIBILITY_REASON_UNSETTLED_POSITIONS_CHECK_FAILED;
                    case 8:
                        return IneligibilityReason.INELIGIBILITY_REASON_NEGATIVE_TRANSFER_MARKET_VALUE;
                    case 9:
                        return IneligibilityReason.INELIGIBILITY_REASON_INSTANT_CHECK_FAILED;
                    default:
                        switch (value) {
                            case 28:
                                return IneligibilityReason.INELIGIBILITY_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED;
                            case 29:
                                return IneligibilityReason.INELIGIBILITY_REASON_INSTRUMENT_NOT_TRANSFERABLE;
                            case 30:
                                return IneligibilityReason.INELIGIBILITY_REASON_EMPTY_TRANSFER;
                            case 31:
                                return IneligibilityReason.f7134x994b2b1e;
                            case 32:
                                return IneligibilityReason.INELIGIBILITY_REASON_OTHER;
                            default:
                                return null;
                        }
                }
            }
            return IneligibilityReason.INELIGIBILITY_REASON_TRANSFER_COUNT_CHECK_FAILED;
        }
    }

    public static IneligibilityReason valueOf(String str) {
        return (IneligibilityReason) Enum.valueOf(IneligibilityReason.class, str);
    }

    public static IneligibilityReason[] values() {
        return (IneligibilityReason[]) $VALUES.clone();
    }
}

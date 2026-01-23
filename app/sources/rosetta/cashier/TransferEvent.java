package rosetta.cashier;

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
/* compiled from: TransferEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m3636d2 = {"rosetta/cashier/TransferEvent$SourceType", "Lcom/squareup/wire/WireEnum;", "", "Lrosetta/cashier/TransferEvent$SourceType;", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "SOURCE_TYPE_UNSPECIFIED", "AUTO_INVESTMENT", "DEPOSIT_SCHEDULE", "IRA", "IRA_RECURRING", "CATPAY", "DEVICE_RISK", "ACH_DEPOSIT_SCHEDULE", "MAJOR_OAK", "RECEIVED_ACH_TRANSFER", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: rosetta.cashier.TransferEvent$SourceType, reason: use source file name */
/* loaded from: classes25.dex */
public final class TransferEvent implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferEvent[] $VALUES;
    public static final TransferEvent ACH_DEPOSIT_SCHEDULE;

    @JvmField
    public static final ProtoAdapter<TransferEvent> ADAPTER;
    public static final TransferEvent AUTO_INVESTMENT;
    public static final TransferEvent CATPAY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransferEvent DEPOSIT_SCHEDULE;
    public static final TransferEvent DEVICE_RISK;
    public static final TransferEvent IRA;
    public static final TransferEvent IRA_RECURRING;
    public static final TransferEvent MAJOR_OAK;
    public static final TransferEvent RECEIVED_ACH_TRANSFER;
    public static final TransferEvent SOURCE_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TransferEvent[] $values() {
        return new TransferEvent[]{SOURCE_TYPE_UNSPECIFIED, AUTO_INVESTMENT, DEPOSIT_SCHEDULE, IRA, IRA_RECURRING, CATPAY, DEVICE_RISK, ACH_DEPOSIT_SCHEDULE, MAJOR_OAK, RECEIVED_ACH_TRANSFER};
    }

    @JvmStatic
    public static final TransferEvent fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TransferEvent> getEntries() {
        return $ENTRIES;
    }

    private TransferEvent(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TransferEvent transferEvent = new TransferEvent("SOURCE_TYPE_UNSPECIFIED", 0, 0);
        SOURCE_TYPE_UNSPECIFIED = transferEvent;
        AUTO_INVESTMENT = new TransferEvent("AUTO_INVESTMENT", 1, 1);
        DEPOSIT_SCHEDULE = new TransferEvent("DEPOSIT_SCHEDULE", 2, 2);
        IRA = new TransferEvent("IRA", 3, 3);
        IRA_RECURRING = new TransferEvent("IRA_RECURRING", 4, 4);
        CATPAY = new TransferEvent("CATPAY", 5, 5);
        DEVICE_RISK = new TransferEvent("DEVICE_RISK", 6, 6);
        ACH_DEPOSIT_SCHEDULE = new TransferEvent("ACH_DEPOSIT_SCHEDULE", 7, 7);
        MAJOR_OAK = new TransferEvent("MAJOR_OAK", 8, 8);
        RECEIVED_ACH_TRANSFER = new TransferEvent("RECEIVED_ACH_TRANSFER", 9, 9);
        TransferEvent[] transferEventArr$values = $values();
        $VALUES = transferEventArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferEventArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TransferEvent>(orCreateKotlinClass, syntax, transferEvent) { // from class: rosetta.cashier.TransferEvent$SourceType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TransferEvent fromValue(int value) {
                return TransferEvent.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/cashier/TransferEvent$SourceType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/cashier/TransferEvent$SourceType;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: rosetta.cashier.TransferEvent$SourceType$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransferEvent fromValue(int value) {
            switch (value) {
                case 0:
                    return TransferEvent.SOURCE_TYPE_UNSPECIFIED;
                case 1:
                    return TransferEvent.AUTO_INVESTMENT;
                case 2:
                    return TransferEvent.DEPOSIT_SCHEDULE;
                case 3:
                    return TransferEvent.IRA;
                case 4:
                    return TransferEvent.IRA_RECURRING;
                case 5:
                    return TransferEvent.CATPAY;
                case 6:
                    return TransferEvent.DEVICE_RISK;
                case 7:
                    return TransferEvent.ACH_DEPOSIT_SCHEDULE;
                case 8:
                    return TransferEvent.MAJOR_OAK;
                case 9:
                    return TransferEvent.RECEIVED_ACH_TRANSFER;
                default:
                    return null;
            }
        }
    }

    public static TransferEvent valueOf(String str) {
        return (TransferEvent) Enum.valueOf(TransferEvent.class, str);
    }

    public static TransferEvent[] values() {
        return (TransferEvent[]) $VALUES.clone();
    }
}

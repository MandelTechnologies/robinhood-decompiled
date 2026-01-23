package rosetta.order;

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
/* compiled from: HandlingInstruction.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, m3636d2 = {"Lrosetta/order/HandlingInstruction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "HANDLING_INSTRUCTION_UNSPECIFIED", "HANDLING_INSTRUCTION_NOT_HELD", "HANDLING_INSTRUCTION_COLLARED", "HANDLING_INSTRUCTION_HELD", "HANDLING_INSTRUCTION_VWAP", "HANDLING_INSTRUCTION_GF5", "HANDLING_INSTRUCTION_ROUTE_NOT_HELD", "HANDLING_INSTRUCTION_REGION_US", "HANDLING_INSTRUCTION_REGION_EU", "HANDLING_INSTRUCTION_NO_PFOF", "HANDLING_INSTRUCTION_INVENTORY_RHUK", "HANDLING_INSTRUCTION_FRACTIONAL", "HANDLING_INSTRUCTION_FRACTIONAL_ROUNDUP", "HANDLING_INSTRUCTION_INVENTORY_RHSG", "HANDLING_INSTRUCTION_MAKE_OR_CANCEL", "Companion", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class HandlingInstruction implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HandlingInstruction[] $VALUES;

    @JvmField
    public static final ProtoAdapter<HandlingInstruction> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final HandlingInstruction HANDLING_INSTRUCTION_COLLARED;
    public static final HandlingInstruction HANDLING_INSTRUCTION_FRACTIONAL;
    public static final HandlingInstruction HANDLING_INSTRUCTION_FRACTIONAL_ROUNDUP;
    public static final HandlingInstruction HANDLING_INSTRUCTION_GF5;
    public static final HandlingInstruction HANDLING_INSTRUCTION_HELD;
    public static final HandlingInstruction HANDLING_INSTRUCTION_INVENTORY_RHSG;
    public static final HandlingInstruction HANDLING_INSTRUCTION_INVENTORY_RHUK;
    public static final HandlingInstruction HANDLING_INSTRUCTION_MAKE_OR_CANCEL;
    public static final HandlingInstruction HANDLING_INSTRUCTION_NOT_HELD;
    public static final HandlingInstruction HANDLING_INSTRUCTION_NO_PFOF;
    public static final HandlingInstruction HANDLING_INSTRUCTION_REGION_EU;
    public static final HandlingInstruction HANDLING_INSTRUCTION_REGION_US;
    public static final HandlingInstruction HANDLING_INSTRUCTION_ROUTE_NOT_HELD;
    public static final HandlingInstruction HANDLING_INSTRUCTION_UNSPECIFIED;
    public static final HandlingInstruction HANDLING_INSTRUCTION_VWAP;
    private final int value;

    private static final /* synthetic */ HandlingInstruction[] $values() {
        return new HandlingInstruction[]{HANDLING_INSTRUCTION_UNSPECIFIED, HANDLING_INSTRUCTION_NOT_HELD, HANDLING_INSTRUCTION_COLLARED, HANDLING_INSTRUCTION_HELD, HANDLING_INSTRUCTION_VWAP, HANDLING_INSTRUCTION_GF5, HANDLING_INSTRUCTION_ROUTE_NOT_HELD, HANDLING_INSTRUCTION_REGION_US, HANDLING_INSTRUCTION_REGION_EU, HANDLING_INSTRUCTION_NO_PFOF, HANDLING_INSTRUCTION_INVENTORY_RHUK, HANDLING_INSTRUCTION_FRACTIONAL, HANDLING_INSTRUCTION_FRACTIONAL_ROUNDUP, HANDLING_INSTRUCTION_INVENTORY_RHSG, HANDLING_INSTRUCTION_MAKE_OR_CANCEL};
    }

    @JvmStatic
    public static final HandlingInstruction fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<HandlingInstruction> getEntries() {
        return $ENTRIES;
    }

    private HandlingInstruction(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final HandlingInstruction handlingInstruction = new HandlingInstruction("HANDLING_INSTRUCTION_UNSPECIFIED", 0, 0);
        HANDLING_INSTRUCTION_UNSPECIFIED = handlingInstruction;
        HANDLING_INSTRUCTION_NOT_HELD = new HandlingInstruction("HANDLING_INSTRUCTION_NOT_HELD", 1, 1);
        HANDLING_INSTRUCTION_COLLARED = new HandlingInstruction("HANDLING_INSTRUCTION_COLLARED", 2, 2);
        HANDLING_INSTRUCTION_HELD = new HandlingInstruction("HANDLING_INSTRUCTION_HELD", 3, 3);
        HANDLING_INSTRUCTION_VWAP = new HandlingInstruction("HANDLING_INSTRUCTION_VWAP", 4, 4);
        HANDLING_INSTRUCTION_GF5 = new HandlingInstruction("HANDLING_INSTRUCTION_GF5", 5, 5);
        HANDLING_INSTRUCTION_ROUTE_NOT_HELD = new HandlingInstruction("HANDLING_INSTRUCTION_ROUTE_NOT_HELD", 6, 6);
        HANDLING_INSTRUCTION_REGION_US = new HandlingInstruction("HANDLING_INSTRUCTION_REGION_US", 7, 7);
        HANDLING_INSTRUCTION_REGION_EU = new HandlingInstruction("HANDLING_INSTRUCTION_REGION_EU", 8, 8);
        HANDLING_INSTRUCTION_NO_PFOF = new HandlingInstruction("HANDLING_INSTRUCTION_NO_PFOF", 9, 9);
        HANDLING_INSTRUCTION_INVENTORY_RHUK = new HandlingInstruction("HANDLING_INSTRUCTION_INVENTORY_RHUK", 10, 10);
        HANDLING_INSTRUCTION_FRACTIONAL = new HandlingInstruction("HANDLING_INSTRUCTION_FRACTIONAL", 11, 11);
        HANDLING_INSTRUCTION_FRACTIONAL_ROUNDUP = new HandlingInstruction("HANDLING_INSTRUCTION_FRACTIONAL_ROUNDUP", 12, 12);
        HANDLING_INSTRUCTION_INVENTORY_RHSG = new HandlingInstruction("HANDLING_INSTRUCTION_INVENTORY_RHSG", 13, 13);
        HANDLING_INSTRUCTION_MAKE_OR_CANCEL = new HandlingInstruction("HANDLING_INSTRUCTION_MAKE_OR_CANCEL", 14, 14);
        HandlingInstruction[] handlingInstructionArr$values = $values();
        $VALUES = handlingInstructionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(handlingInstructionArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HandlingInstruction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<HandlingInstruction>(orCreateKotlinClass, syntax, handlingInstruction) { // from class: rosetta.order.HandlingInstruction$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public HandlingInstruction fromValue(int value) {
                return HandlingInstruction.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: HandlingInstruction.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/HandlingInstruction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/HandlingInstruction;", "fromValue", "value", "", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HandlingInstruction fromValue(int value) {
            switch (value) {
                case 0:
                    return HandlingInstruction.HANDLING_INSTRUCTION_UNSPECIFIED;
                case 1:
                    return HandlingInstruction.HANDLING_INSTRUCTION_NOT_HELD;
                case 2:
                    return HandlingInstruction.HANDLING_INSTRUCTION_COLLARED;
                case 3:
                    return HandlingInstruction.HANDLING_INSTRUCTION_HELD;
                case 4:
                    return HandlingInstruction.HANDLING_INSTRUCTION_VWAP;
                case 5:
                    return HandlingInstruction.HANDLING_INSTRUCTION_GF5;
                case 6:
                    return HandlingInstruction.HANDLING_INSTRUCTION_ROUTE_NOT_HELD;
                case 7:
                    return HandlingInstruction.HANDLING_INSTRUCTION_REGION_US;
                case 8:
                    return HandlingInstruction.HANDLING_INSTRUCTION_REGION_EU;
                case 9:
                    return HandlingInstruction.HANDLING_INSTRUCTION_NO_PFOF;
                case 10:
                    return HandlingInstruction.HANDLING_INSTRUCTION_INVENTORY_RHUK;
                case 11:
                    return HandlingInstruction.HANDLING_INSTRUCTION_FRACTIONAL;
                case 12:
                    return HandlingInstruction.HANDLING_INSTRUCTION_FRACTIONAL_ROUNDUP;
                case 13:
                    return HandlingInstruction.HANDLING_INSTRUCTION_INVENTORY_RHSG;
                case 14:
                    return HandlingInstruction.HANDLING_INSTRUCTION_MAKE_OR_CANCEL;
                default:
                    return null;
            }
        }
    }

    public static HandlingInstruction valueOf(String str) {
        return (HandlingInstruction) Enum.valueOf(HandlingInstruction.class, str);
    }

    public static HandlingInstruction[] values() {
        return (HandlingInstruction[]) $VALUES.clone();
    }
}

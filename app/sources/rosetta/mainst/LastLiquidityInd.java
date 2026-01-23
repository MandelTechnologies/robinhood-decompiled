package rosetta.mainst;

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
/* compiled from: LastLiquidityInd.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrosetta/mainst/LastLiquidityInd;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LAST_LIQUIDITY_IND_UNSPECIFIED", "LAST_LIQUIDITY_IND_ADDED_LIQUIDITY", "LAST_LIQUIDITY_IND_REMOVED_LIQUIDITY", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class LastLiquidityInd implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LastLiquidityInd[] $VALUES;

    @JvmField
    public static final ProtoAdapter<LastLiquidityInd> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final LastLiquidityInd LAST_LIQUIDITY_IND_ADDED_LIQUIDITY;
    public static final LastLiquidityInd LAST_LIQUIDITY_IND_REMOVED_LIQUIDITY;
    public static final LastLiquidityInd LAST_LIQUIDITY_IND_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ LastLiquidityInd[] $values() {
        return new LastLiquidityInd[]{LAST_LIQUIDITY_IND_UNSPECIFIED, LAST_LIQUIDITY_IND_ADDED_LIQUIDITY, LAST_LIQUIDITY_IND_REMOVED_LIQUIDITY};
    }

    @JvmStatic
    public static final LastLiquidityInd fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<LastLiquidityInd> getEntries() {
        return $ENTRIES;
    }

    private LastLiquidityInd(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final LastLiquidityInd lastLiquidityInd = new LastLiquidityInd("LAST_LIQUIDITY_IND_UNSPECIFIED", 0, 0);
        LAST_LIQUIDITY_IND_UNSPECIFIED = lastLiquidityInd;
        LAST_LIQUIDITY_IND_ADDED_LIQUIDITY = new LastLiquidityInd("LAST_LIQUIDITY_IND_ADDED_LIQUIDITY", 1, 1);
        LAST_LIQUIDITY_IND_REMOVED_LIQUIDITY = new LastLiquidityInd("LAST_LIQUIDITY_IND_REMOVED_LIQUIDITY", 2, 2);
        LastLiquidityInd[] lastLiquidityIndArr$values = $values();
        $VALUES = lastLiquidityIndArr$values;
        $ENTRIES = EnumEntries2.enumEntries(lastLiquidityIndArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LastLiquidityInd.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<LastLiquidityInd>(orCreateKotlinClass, syntax, lastLiquidityInd) { // from class: rosetta.mainst.LastLiquidityInd$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public LastLiquidityInd fromValue(int value) {
                return LastLiquidityInd.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: LastLiquidityInd.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/mainst/LastLiquidityInd$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/mainst/LastLiquidityInd;", "fromValue", "value", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LastLiquidityInd fromValue(int value) {
            if (value == 0) {
                return LastLiquidityInd.LAST_LIQUIDITY_IND_UNSPECIFIED;
            }
            if (value == 1) {
                return LastLiquidityInd.LAST_LIQUIDITY_IND_ADDED_LIQUIDITY;
            }
            if (value != 2) {
                return null;
            }
            return LastLiquidityInd.LAST_LIQUIDITY_IND_REMOVED_LIQUIDITY;
        }
    }

    public static LastLiquidityInd valueOf(String str) {
        return (LastLiquidityInd) Enum.valueOf(LastLiquidityInd.class, str);
    }

    public static LastLiquidityInd[] values() {
        return (LastLiquidityInd[]) $VALUES.clone();
    }
}

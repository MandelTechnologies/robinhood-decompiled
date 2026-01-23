package rosetta.nummus;

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
/* compiled from: FeeType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrosetta/nummus/FeeType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FEE_TYPE_UNSPECIFIED", "FEE_TYPE_TRADING", "FEE_TYPE_FX_EXCHANGE", "FEE_TYPE_VENUE", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class FeeType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeeType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<FeeType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final FeeType FEE_TYPE_FX_EXCHANGE;
    public static final FeeType FEE_TYPE_TRADING;
    public static final FeeType FEE_TYPE_UNSPECIFIED;
    public static final FeeType FEE_TYPE_VENUE;
    private final int value;

    private static final /* synthetic */ FeeType[] $values() {
        return new FeeType[]{FEE_TYPE_UNSPECIFIED, FEE_TYPE_TRADING, FEE_TYPE_FX_EXCHANGE, FEE_TYPE_VENUE};
    }

    @JvmStatic
    public static final FeeType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<FeeType> getEntries() {
        return $ENTRIES;
    }

    private FeeType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final FeeType feeType = new FeeType("FEE_TYPE_UNSPECIFIED", 0, 0);
        FEE_TYPE_UNSPECIFIED = feeType;
        FEE_TYPE_TRADING = new FeeType("FEE_TYPE_TRADING", 1, 1);
        FEE_TYPE_FX_EXCHANGE = new FeeType("FEE_TYPE_FX_EXCHANGE", 2, 2);
        FEE_TYPE_VENUE = new FeeType("FEE_TYPE_VENUE", 3, 3);
        FeeType[] feeTypeArr$values = $values();
        $VALUES = feeTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(feeTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<FeeType>(orCreateKotlinClass, syntax, feeType) { // from class: rosetta.nummus.FeeType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public FeeType fromValue(int value) {
                return FeeType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: FeeType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/nummus/FeeType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/nummus/FeeType;", "fromValue", "value", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FeeType fromValue(int value) {
            if (value == 0) {
                return FeeType.FEE_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return FeeType.FEE_TYPE_TRADING;
            }
            if (value == 2) {
                return FeeType.FEE_TYPE_FX_EXCHANGE;
            }
            if (value != 3) {
                return null;
            }
            return FeeType.FEE_TYPE_VENUE;
        }
    }

    public static FeeType valueOf(String str) {
        return (FeeType) Enum.valueOf(FeeType.class, str);
    }

    public static FeeType[] values() {
        return (FeeType[]) $VALUES.clone();
    }
}

package advisory.proto.p008v1;

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
/* compiled from: ReturnsBreakdownBarType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Ladvisory/proto/v1/ReturnsBreakdownBarType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RETURNS_BREAKDOWN_BAR_TYPE_UNSPECIFIED", "RETURNS_BREAKDOWN_BAR_TYPE_POSITIVE", "RETURNS_BREAKDOWN_BAR_TYPE_NEGATIVE", "RETURNS_BREAKDOWN_BAR_TYPE_SLIGHTLY_POSITIVE", "RETURNS_BREAKDOWN_BAR_TYPE_SLIGHTLY_NEGATIVE", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ReturnsBreakdownBarType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReturnsBreakdownBarType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ReturnsBreakdownBarType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ReturnsBreakdownBarType RETURNS_BREAKDOWN_BAR_TYPE_NEGATIVE;
    public static final ReturnsBreakdownBarType RETURNS_BREAKDOWN_BAR_TYPE_POSITIVE;
    public static final ReturnsBreakdownBarType RETURNS_BREAKDOWN_BAR_TYPE_SLIGHTLY_NEGATIVE;
    public static final ReturnsBreakdownBarType RETURNS_BREAKDOWN_BAR_TYPE_SLIGHTLY_POSITIVE;
    public static final ReturnsBreakdownBarType RETURNS_BREAKDOWN_BAR_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ ReturnsBreakdownBarType[] $values() {
        return new ReturnsBreakdownBarType[]{RETURNS_BREAKDOWN_BAR_TYPE_UNSPECIFIED, RETURNS_BREAKDOWN_BAR_TYPE_POSITIVE, RETURNS_BREAKDOWN_BAR_TYPE_NEGATIVE, RETURNS_BREAKDOWN_BAR_TYPE_SLIGHTLY_POSITIVE, RETURNS_BREAKDOWN_BAR_TYPE_SLIGHTLY_NEGATIVE};
    }

    @JvmStatic
    public static final ReturnsBreakdownBarType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ReturnsBreakdownBarType> getEntries() {
        return $ENTRIES;
    }

    private ReturnsBreakdownBarType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ReturnsBreakdownBarType returnsBreakdownBarType = new ReturnsBreakdownBarType("RETURNS_BREAKDOWN_BAR_TYPE_UNSPECIFIED", 0, 0);
        RETURNS_BREAKDOWN_BAR_TYPE_UNSPECIFIED = returnsBreakdownBarType;
        RETURNS_BREAKDOWN_BAR_TYPE_POSITIVE = new ReturnsBreakdownBarType("RETURNS_BREAKDOWN_BAR_TYPE_POSITIVE", 1, 1);
        RETURNS_BREAKDOWN_BAR_TYPE_NEGATIVE = new ReturnsBreakdownBarType("RETURNS_BREAKDOWN_BAR_TYPE_NEGATIVE", 2, 2);
        RETURNS_BREAKDOWN_BAR_TYPE_SLIGHTLY_POSITIVE = new ReturnsBreakdownBarType("RETURNS_BREAKDOWN_BAR_TYPE_SLIGHTLY_POSITIVE", 3, 3);
        RETURNS_BREAKDOWN_BAR_TYPE_SLIGHTLY_NEGATIVE = new ReturnsBreakdownBarType("RETURNS_BREAKDOWN_BAR_TYPE_SLIGHTLY_NEGATIVE", 4, 4);
        ReturnsBreakdownBarType[] returnsBreakdownBarTypeArr$values = $values();
        $VALUES = returnsBreakdownBarTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(returnsBreakdownBarTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ReturnsBreakdownBarType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ReturnsBreakdownBarType>(orCreateKotlinClass, syntax, returnsBreakdownBarType) { // from class: advisory.proto.v1.ReturnsBreakdownBarType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ReturnsBreakdownBarType fromValue(int value) {
                return ReturnsBreakdownBarType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ReturnsBreakdownBarType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Ladvisory/proto/v1/ReturnsBreakdownBarType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Ladvisory/proto/v1/ReturnsBreakdownBarType;", "fromValue", "value", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ReturnsBreakdownBarType fromValue(int value) {
            if (value == 0) {
                return ReturnsBreakdownBarType.RETURNS_BREAKDOWN_BAR_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return ReturnsBreakdownBarType.RETURNS_BREAKDOWN_BAR_TYPE_POSITIVE;
            }
            if (value == 2) {
                return ReturnsBreakdownBarType.RETURNS_BREAKDOWN_BAR_TYPE_NEGATIVE;
            }
            if (value == 3) {
                return ReturnsBreakdownBarType.RETURNS_BREAKDOWN_BAR_TYPE_SLIGHTLY_POSITIVE;
            }
            if (value != 4) {
                return null;
            }
            return ReturnsBreakdownBarType.RETURNS_BREAKDOWN_BAR_TYPE_SLIGHTLY_NEGATIVE;
        }
    }

    public static ReturnsBreakdownBarType valueOf(String str) {
        return (ReturnsBreakdownBarType) Enum.valueOf(ReturnsBreakdownBarType.class, str);
    }

    public static ReturnsBreakdownBarType[] values() {
        return (ReturnsBreakdownBarType[]) $VALUES.clone();
    }
}

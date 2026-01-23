package bonfire.proto.idl.portfolio.p037v1;

import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
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
/* compiled from: PositionDetailChartType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionDetailChartType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PositionDetailChartType_UNSPECIFIED", "mini_sparkline", ApiRenderablePlatforms.VERSIONS_NONE, "Companion", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PositionDetailChartType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PositionDetailChartType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<PositionDetailChartType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PositionDetailChartType PositionDetailChartType_UNSPECIFIED;
    public static final PositionDetailChartType mini_sparkline;
    public static final PositionDetailChartType none;
    private final int value;

    private static final /* synthetic */ PositionDetailChartType[] $values() {
        return new PositionDetailChartType[]{PositionDetailChartType_UNSPECIFIED, mini_sparkline, none};
    }

    @JvmStatic
    public static final PositionDetailChartType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<PositionDetailChartType> getEntries() {
        return $ENTRIES;
    }

    private PositionDetailChartType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final PositionDetailChartType positionDetailChartType = new PositionDetailChartType("PositionDetailChartType_UNSPECIFIED", 0, 0);
        PositionDetailChartType_UNSPECIFIED = positionDetailChartType;
        mini_sparkline = new PositionDetailChartType("mini_sparkline", 1, 2);
        none = new PositionDetailChartType(ApiRenderablePlatforms.VERSIONS_NONE, 2, 3);
        PositionDetailChartType[] positionDetailChartTypeArr$values = $values();
        $VALUES = positionDetailChartTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(positionDetailChartTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PositionDetailChartType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<PositionDetailChartType>(orCreateKotlinClass, syntax, positionDetailChartType) { // from class: bonfire.proto.idl.portfolio.v1.PositionDetailChartType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public PositionDetailChartType fromValue(int value) {
                return PositionDetailChartType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: PositionDetailChartType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionDetailChartType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/portfolio/v1/PositionDetailChartType;", "fromValue", "value", "", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PositionDetailChartType fromValue(int value) {
            if (value == 0) {
                return PositionDetailChartType.PositionDetailChartType_UNSPECIFIED;
            }
            if (value == 2) {
                return PositionDetailChartType.mini_sparkline;
            }
            if (value != 3) {
                return null;
            }
            return PositionDetailChartType.none;
        }
    }

    public static PositionDetailChartType valueOf(String str) {
        return (PositionDetailChartType) Enum.valueOf(PositionDetailChartType.class, str);
    }

    public static PositionDetailChartType[] values() {
        return (PositionDetailChartType[]) $VALUES.clone();
    }
}

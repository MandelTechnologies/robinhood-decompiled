package futures_asset_home.proto.p462v1;

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
/* compiled from: SectionType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lfutures_asset_home/proto/v1/SectionType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SECTION_UNSPECIFIED", "SECTION_PERFORMANCE_CHART", "SECTION_BUYING_POWER", "SECTION_PENDING_ORDERS", "SECTION_POSITIONS", "SECTION_HISTORY", "SECTION_DISCLOSURES", "Companion", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SectionType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SectionType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<SectionType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SectionType SECTION_BUYING_POWER;
    public static final SectionType SECTION_DISCLOSURES;
    public static final SectionType SECTION_HISTORY;
    public static final SectionType SECTION_PENDING_ORDERS;
    public static final SectionType SECTION_PERFORMANCE_CHART;
    public static final SectionType SECTION_POSITIONS;
    public static final SectionType SECTION_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ SectionType[] $values() {
        return new SectionType[]{SECTION_UNSPECIFIED, SECTION_PERFORMANCE_CHART, SECTION_BUYING_POWER, SECTION_PENDING_ORDERS, SECTION_POSITIONS, SECTION_HISTORY, SECTION_DISCLOSURES};
    }

    @JvmStatic
    public static final SectionType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<SectionType> getEntries() {
        return $ENTRIES;
    }

    private SectionType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final SectionType sectionType = new SectionType("SECTION_UNSPECIFIED", 0, 0);
        SECTION_UNSPECIFIED = sectionType;
        SECTION_PERFORMANCE_CHART = new SectionType("SECTION_PERFORMANCE_CHART", 1, 1);
        SECTION_BUYING_POWER = new SectionType("SECTION_BUYING_POWER", 2, 2);
        SECTION_PENDING_ORDERS = new SectionType("SECTION_PENDING_ORDERS", 3, 3);
        SECTION_POSITIONS = new SectionType("SECTION_POSITIONS", 4, 4);
        SECTION_HISTORY = new SectionType("SECTION_HISTORY", 5, 5);
        SECTION_DISCLOSURES = new SectionType("SECTION_DISCLOSURES", 6, 6);
        SectionType[] sectionTypeArr$values = $values();
        $VALUES = sectionTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sectionTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SectionType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<SectionType>(orCreateKotlinClass, syntax, sectionType) { // from class: futures_asset_home.proto.v1.SectionType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public SectionType fromValue(int value) {
                return SectionType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: SectionType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lfutures_asset_home/proto/v1/SectionType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lfutures_asset_home/proto/v1/SectionType;", "fromValue", "value", "", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SectionType fromValue(int value) {
            switch (value) {
                case 0:
                    return SectionType.SECTION_UNSPECIFIED;
                case 1:
                    return SectionType.SECTION_PERFORMANCE_CHART;
                case 2:
                    return SectionType.SECTION_BUYING_POWER;
                case 3:
                    return SectionType.SECTION_PENDING_ORDERS;
                case 4:
                    return SectionType.SECTION_POSITIONS;
                case 5:
                    return SectionType.SECTION_HISTORY;
                case 6:
                    return SectionType.SECTION_DISCLOSURES;
                default:
                    return null;
            }
        }
    }

    public static SectionType valueOf(String str) {
        return (SectionType) Enum.valueOf(SectionType.class, str);
    }

    public static SectionType[] values() {
        return (SectionType[]) $VALUES.clone();
    }
}

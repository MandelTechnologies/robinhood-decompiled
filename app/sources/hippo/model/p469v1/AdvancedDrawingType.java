package hippo.model.p469v1;

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
/* compiled from: AdvancedDrawingType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lhippo/model/v1/AdvancedDrawingType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ADVANCED_DRAWING_TYPE_UNSPECIFIED", "ADVANCED_DRAWING_TYPE_FIBONACCI_RETRACEMENTS", "ADVANCED_DRAWING_TYPE_FIBONACCI_PROJECTION", "ADVANCED_DRAWING_TYPE_FIBONACCI_TIME_EXTENSION", "ADVANCED_DRAWING_TYPE_DATE_PRICE_RANGE", "ADVANCED_DRAWING_TYPE_DATE_RANGE", "ADVANCED_DRAWING_TYPE_PRICE_RANGE", "ADVANCED_DRAWING_TYPE_RANGE_VOLUME_BY_PRICE", "ADVANCED_DRAWING_TYPE_ANCHORED_VOLUME_BY_PRICE", "ADVANCED_DRAWING_TYPE_ANCHORED_VWAP", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AdvancedDrawingType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdvancedDrawingType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<AdvancedDrawingType> ADAPTER;
    public static final AdvancedDrawingType ADVANCED_DRAWING_TYPE_ANCHORED_VOLUME_BY_PRICE;
    public static final AdvancedDrawingType ADVANCED_DRAWING_TYPE_ANCHORED_VWAP;
    public static final AdvancedDrawingType ADVANCED_DRAWING_TYPE_DATE_PRICE_RANGE;
    public static final AdvancedDrawingType ADVANCED_DRAWING_TYPE_DATE_RANGE;
    public static final AdvancedDrawingType ADVANCED_DRAWING_TYPE_FIBONACCI_PROJECTION;
    public static final AdvancedDrawingType ADVANCED_DRAWING_TYPE_FIBONACCI_RETRACEMENTS;
    public static final AdvancedDrawingType ADVANCED_DRAWING_TYPE_FIBONACCI_TIME_EXTENSION;
    public static final AdvancedDrawingType ADVANCED_DRAWING_TYPE_PRICE_RANGE;
    public static final AdvancedDrawingType ADVANCED_DRAWING_TYPE_RANGE_VOLUME_BY_PRICE;
    public static final AdvancedDrawingType ADVANCED_DRAWING_TYPE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ AdvancedDrawingType[] $values() {
        return new AdvancedDrawingType[]{ADVANCED_DRAWING_TYPE_UNSPECIFIED, ADVANCED_DRAWING_TYPE_FIBONACCI_RETRACEMENTS, ADVANCED_DRAWING_TYPE_FIBONACCI_PROJECTION, ADVANCED_DRAWING_TYPE_FIBONACCI_TIME_EXTENSION, ADVANCED_DRAWING_TYPE_DATE_PRICE_RANGE, ADVANCED_DRAWING_TYPE_DATE_RANGE, ADVANCED_DRAWING_TYPE_PRICE_RANGE, ADVANCED_DRAWING_TYPE_RANGE_VOLUME_BY_PRICE, ADVANCED_DRAWING_TYPE_ANCHORED_VOLUME_BY_PRICE, ADVANCED_DRAWING_TYPE_ANCHORED_VWAP};
    }

    @JvmStatic
    public static final AdvancedDrawingType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AdvancedDrawingType> getEntries() {
        return $ENTRIES;
    }

    private AdvancedDrawingType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AdvancedDrawingType advancedDrawingType = new AdvancedDrawingType("ADVANCED_DRAWING_TYPE_UNSPECIFIED", 0, 0);
        ADVANCED_DRAWING_TYPE_UNSPECIFIED = advancedDrawingType;
        ADVANCED_DRAWING_TYPE_FIBONACCI_RETRACEMENTS = new AdvancedDrawingType("ADVANCED_DRAWING_TYPE_FIBONACCI_RETRACEMENTS", 1, 1);
        ADVANCED_DRAWING_TYPE_FIBONACCI_PROJECTION = new AdvancedDrawingType("ADVANCED_DRAWING_TYPE_FIBONACCI_PROJECTION", 2, 2);
        ADVANCED_DRAWING_TYPE_FIBONACCI_TIME_EXTENSION = new AdvancedDrawingType("ADVANCED_DRAWING_TYPE_FIBONACCI_TIME_EXTENSION", 3, 3);
        ADVANCED_DRAWING_TYPE_DATE_PRICE_RANGE = new AdvancedDrawingType("ADVANCED_DRAWING_TYPE_DATE_PRICE_RANGE", 4, 4);
        ADVANCED_DRAWING_TYPE_DATE_RANGE = new AdvancedDrawingType("ADVANCED_DRAWING_TYPE_DATE_RANGE", 5, 5);
        ADVANCED_DRAWING_TYPE_PRICE_RANGE = new AdvancedDrawingType("ADVANCED_DRAWING_TYPE_PRICE_RANGE", 6, 6);
        ADVANCED_DRAWING_TYPE_RANGE_VOLUME_BY_PRICE = new AdvancedDrawingType("ADVANCED_DRAWING_TYPE_RANGE_VOLUME_BY_PRICE", 7, 7);
        ADVANCED_DRAWING_TYPE_ANCHORED_VOLUME_BY_PRICE = new AdvancedDrawingType("ADVANCED_DRAWING_TYPE_ANCHORED_VOLUME_BY_PRICE", 8, 8);
        ADVANCED_DRAWING_TYPE_ANCHORED_VWAP = new AdvancedDrawingType("ADVANCED_DRAWING_TYPE_ANCHORED_VWAP", 9, 9);
        AdvancedDrawingType[] advancedDrawingTypeArr$values = $values();
        $VALUES = advancedDrawingTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(advancedDrawingTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvancedDrawingType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AdvancedDrawingType>(orCreateKotlinClass, syntax, advancedDrawingType) { // from class: hippo.model.v1.AdvancedDrawingType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AdvancedDrawingType fromValue(int value) {
                return AdvancedDrawingType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AdvancedDrawingType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lhippo/model/v1/AdvancedDrawingType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lhippo/model/v1/AdvancedDrawingType;", "fromValue", "value", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvancedDrawingType fromValue(int value) {
            switch (value) {
                case 0:
                    return AdvancedDrawingType.ADVANCED_DRAWING_TYPE_UNSPECIFIED;
                case 1:
                    return AdvancedDrawingType.ADVANCED_DRAWING_TYPE_FIBONACCI_RETRACEMENTS;
                case 2:
                    return AdvancedDrawingType.ADVANCED_DRAWING_TYPE_FIBONACCI_PROJECTION;
                case 3:
                    return AdvancedDrawingType.ADVANCED_DRAWING_TYPE_FIBONACCI_TIME_EXTENSION;
                case 4:
                    return AdvancedDrawingType.ADVANCED_DRAWING_TYPE_DATE_PRICE_RANGE;
                case 5:
                    return AdvancedDrawingType.ADVANCED_DRAWING_TYPE_DATE_RANGE;
                case 6:
                    return AdvancedDrawingType.ADVANCED_DRAWING_TYPE_PRICE_RANGE;
                case 7:
                    return AdvancedDrawingType.ADVANCED_DRAWING_TYPE_RANGE_VOLUME_BY_PRICE;
                case 8:
                    return AdvancedDrawingType.ADVANCED_DRAWING_TYPE_ANCHORED_VOLUME_BY_PRICE;
                case 9:
                    return AdvancedDrawingType.ADVANCED_DRAWING_TYPE_ANCHORED_VWAP;
                default:
                    return null;
            }
        }
    }

    public static AdvancedDrawingType valueOf(String str) {
        return (AdvancedDrawingType) Enum.valueOf(AdvancedDrawingType.class, str);
    }

    public static AdvancedDrawingType[] values() {
        return (AdvancedDrawingType[]) $VALUES.clone();
    }
}

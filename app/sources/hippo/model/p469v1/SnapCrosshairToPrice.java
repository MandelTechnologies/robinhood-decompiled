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
/* compiled from: SnapCrosshairToPrice.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lhippo/model/v1/SnapCrosshairToPrice;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SNAP_CROSSHAIR_TO_PRICE_UNSPECIFIED", "SNAP_CROSSHAIR_TO_PRICE_NONE", "SNAP_CROSSHAIR_TO_PRICE_OPEN", "SNAP_CROSSHAIR_TO_PRICE_CLOSE", "SNAP_CROSSHAIR_TO_PRICE_OHLC", "SNAP_CROSSHAIR_TO_PRICE_HIGH", "SNAP_CROSSHAIR_TO_PRICE_LOW", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SnapCrosshairToPrice implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SnapCrosshairToPrice[] $VALUES;

    @JvmField
    public static final ProtoAdapter<SnapCrosshairToPrice> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SnapCrosshairToPrice SNAP_CROSSHAIR_TO_PRICE_CLOSE;
    public static final SnapCrosshairToPrice SNAP_CROSSHAIR_TO_PRICE_HIGH;
    public static final SnapCrosshairToPrice SNAP_CROSSHAIR_TO_PRICE_LOW;
    public static final SnapCrosshairToPrice SNAP_CROSSHAIR_TO_PRICE_NONE;
    public static final SnapCrosshairToPrice SNAP_CROSSHAIR_TO_PRICE_OHLC;
    public static final SnapCrosshairToPrice SNAP_CROSSHAIR_TO_PRICE_OPEN;
    public static final SnapCrosshairToPrice SNAP_CROSSHAIR_TO_PRICE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ SnapCrosshairToPrice[] $values() {
        return new SnapCrosshairToPrice[]{SNAP_CROSSHAIR_TO_PRICE_UNSPECIFIED, SNAP_CROSSHAIR_TO_PRICE_NONE, SNAP_CROSSHAIR_TO_PRICE_OPEN, SNAP_CROSSHAIR_TO_PRICE_CLOSE, SNAP_CROSSHAIR_TO_PRICE_OHLC, SNAP_CROSSHAIR_TO_PRICE_HIGH, SNAP_CROSSHAIR_TO_PRICE_LOW};
    }

    @JvmStatic
    public static final SnapCrosshairToPrice fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<SnapCrosshairToPrice> getEntries() {
        return $ENTRIES;
    }

    private SnapCrosshairToPrice(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final SnapCrosshairToPrice snapCrosshairToPrice = new SnapCrosshairToPrice("SNAP_CROSSHAIR_TO_PRICE_UNSPECIFIED", 0, 0);
        SNAP_CROSSHAIR_TO_PRICE_UNSPECIFIED = snapCrosshairToPrice;
        SNAP_CROSSHAIR_TO_PRICE_NONE = new SnapCrosshairToPrice("SNAP_CROSSHAIR_TO_PRICE_NONE", 1, 1);
        SNAP_CROSSHAIR_TO_PRICE_OPEN = new SnapCrosshairToPrice("SNAP_CROSSHAIR_TO_PRICE_OPEN", 2, 2);
        SNAP_CROSSHAIR_TO_PRICE_CLOSE = new SnapCrosshairToPrice("SNAP_CROSSHAIR_TO_PRICE_CLOSE", 3, 3);
        SNAP_CROSSHAIR_TO_PRICE_OHLC = new SnapCrosshairToPrice("SNAP_CROSSHAIR_TO_PRICE_OHLC", 4, 4);
        SNAP_CROSSHAIR_TO_PRICE_HIGH = new SnapCrosshairToPrice("SNAP_CROSSHAIR_TO_PRICE_HIGH", 5, 5);
        SNAP_CROSSHAIR_TO_PRICE_LOW = new SnapCrosshairToPrice("SNAP_CROSSHAIR_TO_PRICE_LOW", 6, 6);
        SnapCrosshairToPrice[] snapCrosshairToPriceArr$values = $values();
        $VALUES = snapCrosshairToPriceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(snapCrosshairToPriceArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SnapCrosshairToPrice.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<SnapCrosshairToPrice>(orCreateKotlinClass, syntax, snapCrosshairToPrice) { // from class: hippo.model.v1.SnapCrosshairToPrice$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public SnapCrosshairToPrice fromValue(int value) {
                return SnapCrosshairToPrice.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: SnapCrosshairToPrice.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lhippo/model/v1/SnapCrosshairToPrice$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lhippo/model/v1/SnapCrosshairToPrice;", "fromValue", "value", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SnapCrosshairToPrice fromValue(int value) {
            switch (value) {
                case 0:
                    return SnapCrosshairToPrice.SNAP_CROSSHAIR_TO_PRICE_UNSPECIFIED;
                case 1:
                    return SnapCrosshairToPrice.SNAP_CROSSHAIR_TO_PRICE_NONE;
                case 2:
                    return SnapCrosshairToPrice.SNAP_CROSSHAIR_TO_PRICE_OPEN;
                case 3:
                    return SnapCrosshairToPrice.SNAP_CROSSHAIR_TO_PRICE_CLOSE;
                case 4:
                    return SnapCrosshairToPrice.SNAP_CROSSHAIR_TO_PRICE_OHLC;
                case 5:
                    return SnapCrosshairToPrice.SNAP_CROSSHAIR_TO_PRICE_HIGH;
                case 6:
                    return SnapCrosshairToPrice.SNAP_CROSSHAIR_TO_PRICE_LOW;
                default:
                    return null;
            }
        }
    }

    public static SnapCrosshairToPrice valueOf(String str) {
        return (SnapCrosshairToPrice) Enum.valueOf(SnapCrosshairToPrice.class, str);
    }

    public static SnapCrosshairToPrice[] values() {
        return (SnapCrosshairToPrice[]) $VALUES.clone();
    }
}

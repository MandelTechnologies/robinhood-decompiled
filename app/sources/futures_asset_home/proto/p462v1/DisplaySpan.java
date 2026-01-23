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
/* compiled from: DisplaySpan.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lfutures_asset_home/proto/v1/DisplaySpan;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SPAN_UNSPECIFIED", "WEEK_SPAN", "MONTH_SPAN", "THREE_MONTH_SPAN", "YTD_SPAN", "YEAR_SPAN", "ALL_SPAN", "Companion", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DisplaySpan implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DisplaySpan[] $VALUES;

    @JvmField
    public static final ProtoAdapter<DisplaySpan> ADAPTER;
    public static final DisplaySpan ALL_SPAN;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final DisplaySpan MONTH_SPAN;
    public static final DisplaySpan SPAN_UNSPECIFIED;
    public static final DisplaySpan THREE_MONTH_SPAN;
    public static final DisplaySpan WEEK_SPAN;
    public static final DisplaySpan YEAR_SPAN;
    public static final DisplaySpan YTD_SPAN;
    private final int value;

    private static final /* synthetic */ DisplaySpan[] $values() {
        return new DisplaySpan[]{SPAN_UNSPECIFIED, WEEK_SPAN, MONTH_SPAN, THREE_MONTH_SPAN, YTD_SPAN, YEAR_SPAN, ALL_SPAN};
    }

    @JvmStatic
    public static final DisplaySpan fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<DisplaySpan> getEntries() {
        return $ENTRIES;
    }

    private DisplaySpan(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final DisplaySpan displaySpan = new DisplaySpan("SPAN_UNSPECIFIED", 0, 0);
        SPAN_UNSPECIFIED = displaySpan;
        WEEK_SPAN = new DisplaySpan("WEEK_SPAN", 1, 1);
        MONTH_SPAN = new DisplaySpan("MONTH_SPAN", 2, 2);
        THREE_MONTH_SPAN = new DisplaySpan("THREE_MONTH_SPAN", 3, 3);
        YTD_SPAN = new DisplaySpan("YTD_SPAN", 4, 4);
        YEAR_SPAN = new DisplaySpan("YEAR_SPAN", 5, 5);
        ALL_SPAN = new DisplaySpan("ALL_SPAN", 6, 6);
        DisplaySpan[] displaySpanArr$values = $values();
        $VALUES = displaySpanArr$values;
        $ENTRIES = EnumEntries2.enumEntries(displaySpanArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DisplaySpan.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<DisplaySpan>(orCreateKotlinClass, syntax, displaySpan) { // from class: futures_asset_home.proto.v1.DisplaySpan$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public DisplaySpan fromValue(int value) {
                return DisplaySpan.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: DisplaySpan.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lfutures_asset_home/proto/v1/DisplaySpan$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lfutures_asset_home/proto/v1/DisplaySpan;", "fromValue", "value", "", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DisplaySpan fromValue(int value) {
            switch (value) {
                case 0:
                    return DisplaySpan.SPAN_UNSPECIFIED;
                case 1:
                    return DisplaySpan.WEEK_SPAN;
                case 2:
                    return DisplaySpan.MONTH_SPAN;
                case 3:
                    return DisplaySpan.THREE_MONTH_SPAN;
                case 4:
                    return DisplaySpan.YTD_SPAN;
                case 5:
                    return DisplaySpan.YEAR_SPAN;
                case 6:
                    return DisplaySpan.ALL_SPAN;
                default:
                    return null;
            }
        }
    }

    public static DisplaySpan valueOf(String str) {
        return (DisplaySpan) Enum.valueOf(DisplaySpan.class, str);
    }

    public static DisplaySpan[] values() {
        return (DisplaySpan[]) $VALUES.clone();
    }
}

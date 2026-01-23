package md_server_proxy.service.p483v1;

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
/* compiled from: Bounds.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lmd_server_proxy/service/v1/Bounds;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BOUNDS_UNSPECIFIED", "REGULAR", "TRADING", "EXTENDED", "TWENTY_FOUR_FIVE", "TWENTY_FOUR_SEVEN", "HYPER_TRADING", "LATE_CLOSING_OPTIONS", "Companion", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class Bounds implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Bounds[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Bounds> ADAPTER;
    public static final Bounds BOUNDS_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Bounds EXTENDED;
    public static final Bounds HYPER_TRADING;
    public static final Bounds LATE_CLOSING_OPTIONS;
    public static final Bounds REGULAR;
    public static final Bounds TRADING;
    public static final Bounds TWENTY_FOUR_FIVE;
    public static final Bounds TWENTY_FOUR_SEVEN;
    private final int value;

    private static final /* synthetic */ Bounds[] $values() {
        return new Bounds[]{BOUNDS_UNSPECIFIED, REGULAR, TRADING, EXTENDED, TWENTY_FOUR_FIVE, TWENTY_FOUR_SEVEN, HYPER_TRADING, LATE_CLOSING_OPTIONS};
    }

    @JvmStatic
    public static final Bounds fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Bounds> getEntries() {
        return $ENTRIES;
    }

    private Bounds(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Bounds bounds = new Bounds("BOUNDS_UNSPECIFIED", 0, 0);
        BOUNDS_UNSPECIFIED = bounds;
        REGULAR = new Bounds("REGULAR", 1, 1);
        TRADING = new Bounds("TRADING", 2, 2);
        EXTENDED = new Bounds("EXTENDED", 3, 3);
        TWENTY_FOUR_FIVE = new Bounds("TWENTY_FOUR_FIVE", 4, 4);
        TWENTY_FOUR_SEVEN = new Bounds("TWENTY_FOUR_SEVEN", 5, 5);
        HYPER_TRADING = new Bounds("HYPER_TRADING", 6, 6);
        LATE_CLOSING_OPTIONS = new Bounds("LATE_CLOSING_OPTIONS", 7, 7);
        Bounds[] boundsArr$values = $values();
        $VALUES = boundsArr$values;
        $ENTRIES = EnumEntries2.enumEntries(boundsArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Bounds.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Bounds>(orCreateKotlinClass, syntax, bounds) { // from class: md_server_proxy.service.v1.Bounds$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Bounds fromValue(int value) {
                return Bounds.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Bounds.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lmd_server_proxy/service/v1/Bounds$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lmd_server_proxy/service/v1/Bounds;", "fromValue", "value", "", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Bounds fromValue(int value) {
            switch (value) {
                case 0:
                    return Bounds.BOUNDS_UNSPECIFIED;
                case 1:
                    return Bounds.REGULAR;
                case 2:
                    return Bounds.TRADING;
                case 3:
                    return Bounds.EXTENDED;
                case 4:
                    return Bounds.TWENTY_FOUR_FIVE;
                case 5:
                    return Bounds.TWENTY_FOUR_SEVEN;
                case 6:
                    return Bounds.HYPER_TRADING;
                case 7:
                    return Bounds.LATE_CLOSING_OPTIONS;
                default:
                    return null;
            }
        }
    }

    public static Bounds valueOf(String str) {
        return (Bounds) Enum.valueOf(Bounds.class, str);
    }

    public static Bounds[] values() {
        return (Bounds[]) $VALUES.clone();
    }
}

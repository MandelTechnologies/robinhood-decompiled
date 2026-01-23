package microgram.p507ui.p508v1;

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
/* compiled from: StatusBarStyle.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lmicrogram/ui/v1/StatusBarStyle;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATUS_BAR_STYLE_UNSPECIFIED", "STATUS_BAR_STYLE_LIGHT", "STATUS_BAR_STYLE_DARK", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class StatusBarStyle implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StatusBarStyle[] $VALUES;

    @JvmField
    public static final ProtoAdapter<StatusBarStyle> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final StatusBarStyle STATUS_BAR_STYLE_DARK;
    public static final StatusBarStyle STATUS_BAR_STYLE_LIGHT;
    public static final StatusBarStyle STATUS_BAR_STYLE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ StatusBarStyle[] $values() {
        return new StatusBarStyle[]{STATUS_BAR_STYLE_UNSPECIFIED, STATUS_BAR_STYLE_LIGHT, STATUS_BAR_STYLE_DARK};
    }

    @JvmStatic
    public static final StatusBarStyle fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<StatusBarStyle> getEntries() {
        return $ENTRIES;
    }

    private StatusBarStyle(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final StatusBarStyle statusBarStyle = new StatusBarStyle("STATUS_BAR_STYLE_UNSPECIFIED", 0, 0);
        STATUS_BAR_STYLE_UNSPECIFIED = statusBarStyle;
        STATUS_BAR_STYLE_LIGHT = new StatusBarStyle("STATUS_BAR_STYLE_LIGHT", 1, 1);
        STATUS_BAR_STYLE_DARK = new StatusBarStyle("STATUS_BAR_STYLE_DARK", 2, 2);
        StatusBarStyle[] statusBarStyleArr$values = $values();
        $VALUES = statusBarStyleArr$values;
        $ENTRIES = EnumEntries2.enumEntries(statusBarStyleArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StatusBarStyle.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<StatusBarStyle>(orCreateKotlinClass, syntax, statusBarStyle) { // from class: microgram.ui.v1.StatusBarStyle$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public StatusBarStyle fromValue(int value) {
                return StatusBarStyle.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: StatusBarStyle.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lmicrogram/ui/v1/StatusBarStyle$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lmicrogram/ui/v1/StatusBarStyle;", "fromValue", "value", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StatusBarStyle fromValue(int value) {
            if (value == 0) {
                return StatusBarStyle.STATUS_BAR_STYLE_UNSPECIFIED;
            }
            if (value == 1) {
                return StatusBarStyle.STATUS_BAR_STYLE_LIGHT;
            }
            if (value != 2) {
                return null;
            }
            return StatusBarStyle.STATUS_BAR_STYLE_DARK;
        }
    }

    public static StatusBarStyle valueOf(String str) {
        return (StatusBarStyle) Enum.valueOf(StatusBarStyle.class, str);
    }

    public static StatusBarStyle[] values() {
        return (StatusBarStyle[]) $VALUES.clone();
    }
}

package rh_server_driven_ui.p531v1;

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
/* compiled from: Corner.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrh_server_driven_ui/v1/Corner;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CORNER_UNSPECIFIED", "CORNER_MIN_X_MAX_Y", "CORNER_MIN_X_MIN_Y", "CORNER_MAX_X_MAX_Y", "CORNER_MAX_X_MIN_Y", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Corner implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Corner[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Corner> ADAPTER;
    public static final Corner CORNER_MAX_X_MAX_Y;
    public static final Corner CORNER_MAX_X_MIN_Y;
    public static final Corner CORNER_MIN_X_MAX_Y;
    public static final Corner CORNER_MIN_X_MIN_Y;
    public static final Corner CORNER_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ Corner[] $values() {
        return new Corner[]{CORNER_UNSPECIFIED, CORNER_MIN_X_MAX_Y, CORNER_MIN_X_MIN_Y, CORNER_MAX_X_MAX_Y, CORNER_MAX_X_MIN_Y};
    }

    @JvmStatic
    public static final Corner fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Corner> getEntries() {
        return $ENTRIES;
    }

    private Corner(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Corner corner = new Corner("CORNER_UNSPECIFIED", 0, 0);
        CORNER_UNSPECIFIED = corner;
        CORNER_MIN_X_MAX_Y = new Corner("CORNER_MIN_X_MAX_Y", 1, 1);
        CORNER_MIN_X_MIN_Y = new Corner("CORNER_MIN_X_MIN_Y", 2, 2);
        CORNER_MAX_X_MAX_Y = new Corner("CORNER_MAX_X_MAX_Y", 3, 3);
        CORNER_MAX_X_MIN_Y = new Corner("CORNER_MAX_X_MIN_Y", 4, 4);
        Corner[] cornerArr$values = $values();
        $VALUES = cornerArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cornerArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Corner.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Corner>(orCreateKotlinClass, syntax, corner) { // from class: rh_server_driven_ui.v1.Corner$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Corner fromValue(int value) {
                return Corner.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Corner.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/Corner$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/Corner;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Corner fromValue(int value) {
            if (value == 0) {
                return Corner.CORNER_UNSPECIFIED;
            }
            if (value == 1) {
                return Corner.CORNER_MIN_X_MAX_Y;
            }
            if (value == 2) {
                return Corner.CORNER_MIN_X_MIN_Y;
            }
            if (value == 3) {
                return Corner.CORNER_MAX_X_MAX_Y;
            }
            if (value != 4) {
                return null;
            }
            return Corner.CORNER_MAX_X_MIN_Y;
        }
    }

    public static Corner valueOf(String str) {
        return (Corner) Enum.valueOf(Corner.class, str);
    }

    public static Corner[] values() {
        return (Corner[]) $VALUES.clone();
    }
}

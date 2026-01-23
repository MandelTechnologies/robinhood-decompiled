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
/* compiled from: StackAlignment.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrh_server_driven_ui/v1/StackAlignment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STACK_ALIGNMENT_UNSPECIFIED", "STACK_ALIGNMENT_START", "STACK_ALIGNMENT_CENTER", "STACK_ALIGNMENT_END", "STACK_ALIGNMENT_FILL", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class StackAlignment implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StackAlignment[] $VALUES;

    @JvmField
    public static final ProtoAdapter<StackAlignment> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final StackAlignment STACK_ALIGNMENT_CENTER;
    public static final StackAlignment STACK_ALIGNMENT_END;
    public static final StackAlignment STACK_ALIGNMENT_FILL;
    public static final StackAlignment STACK_ALIGNMENT_START;
    public static final StackAlignment STACK_ALIGNMENT_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ StackAlignment[] $values() {
        return new StackAlignment[]{STACK_ALIGNMENT_UNSPECIFIED, STACK_ALIGNMENT_START, STACK_ALIGNMENT_CENTER, STACK_ALIGNMENT_END, STACK_ALIGNMENT_FILL};
    }

    @JvmStatic
    public static final StackAlignment fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<StackAlignment> getEntries() {
        return $ENTRIES;
    }

    private StackAlignment(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final StackAlignment stackAlignment = new StackAlignment("STACK_ALIGNMENT_UNSPECIFIED", 0, 0);
        STACK_ALIGNMENT_UNSPECIFIED = stackAlignment;
        STACK_ALIGNMENT_START = new StackAlignment("STACK_ALIGNMENT_START", 1, 1);
        STACK_ALIGNMENT_CENTER = new StackAlignment("STACK_ALIGNMENT_CENTER", 2, 2);
        STACK_ALIGNMENT_END = new StackAlignment("STACK_ALIGNMENT_END", 3, 3);
        STACK_ALIGNMENT_FILL = new StackAlignment("STACK_ALIGNMENT_FILL", 4, 4);
        StackAlignment[] stackAlignmentArr$values = $values();
        $VALUES = stackAlignmentArr$values;
        $ENTRIES = EnumEntries2.enumEntries(stackAlignmentArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StackAlignment.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<StackAlignment>(orCreateKotlinClass, syntax, stackAlignment) { // from class: rh_server_driven_ui.v1.StackAlignment$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public StackAlignment fromValue(int value) {
                return StackAlignment.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: StackAlignment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/StackAlignment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/StackAlignment;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StackAlignment fromValue(int value) {
            if (value == 0) {
                return StackAlignment.STACK_ALIGNMENT_UNSPECIFIED;
            }
            if (value == 1) {
                return StackAlignment.STACK_ALIGNMENT_START;
            }
            if (value == 2) {
                return StackAlignment.STACK_ALIGNMENT_CENTER;
            }
            if (value == 3) {
                return StackAlignment.STACK_ALIGNMENT_END;
            }
            if (value != 4) {
                return null;
            }
            return StackAlignment.STACK_ALIGNMENT_FILL;
        }
    }

    public static StackAlignment valueOf(String str) {
        return (StackAlignment) Enum.valueOf(StackAlignment.class, str);
    }

    public static StackAlignment[] values() {
        return (StackAlignment[]) $VALUES.clone();
    }
}

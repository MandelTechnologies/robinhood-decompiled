package gold_flow.proto.p466v1;

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
/* compiled from: PresentationType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lgold_flow/proto/v1/PresentationType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PRESENTATION_UNSPECIFIED", "PUSH", "MODAL", "REPLACE", "DEFAULT", "LISTEN_FOR_ACTIVITY_RESULT", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class PresentationType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PresentationType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<PresentationType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PresentationType DEFAULT;
    public static final PresentationType LISTEN_FOR_ACTIVITY_RESULT;
    public static final PresentationType MODAL;
    public static final PresentationType PRESENTATION_UNSPECIFIED;
    public static final PresentationType PUSH;
    public static final PresentationType REPLACE;
    private final int value;

    private static final /* synthetic */ PresentationType[] $values() {
        return new PresentationType[]{PRESENTATION_UNSPECIFIED, PUSH, MODAL, REPLACE, DEFAULT, LISTEN_FOR_ACTIVITY_RESULT};
    }

    @JvmStatic
    public static final PresentationType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<PresentationType> getEntries() {
        return $ENTRIES;
    }

    private PresentationType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final PresentationType presentationType = new PresentationType("PRESENTATION_UNSPECIFIED", 0, 0);
        PRESENTATION_UNSPECIFIED = presentationType;
        PUSH = new PresentationType("PUSH", 1, 1);
        MODAL = new PresentationType("MODAL", 2, 2);
        REPLACE = new PresentationType("REPLACE", 3, 3);
        DEFAULT = new PresentationType("DEFAULT", 4, 4);
        LISTEN_FOR_ACTIVITY_RESULT = new PresentationType("LISTEN_FOR_ACTIVITY_RESULT", 5, 5);
        PresentationType[] presentationTypeArr$values = $values();
        $VALUES = presentationTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(presentationTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PresentationType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<PresentationType>(orCreateKotlinClass, syntax, presentationType) { // from class: gold_flow.proto.v1.PresentationType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public PresentationType fromValue(int value) {
                return PresentationType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: PresentationType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lgold_flow/proto/v1/PresentationType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lgold_flow/proto/v1/PresentationType;", "fromValue", "value", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PresentationType fromValue(int value) {
            if (value == 0) {
                return PresentationType.PRESENTATION_UNSPECIFIED;
            }
            if (value == 1) {
                return PresentationType.PUSH;
            }
            if (value == 2) {
                return PresentationType.MODAL;
            }
            if (value == 3) {
                return PresentationType.REPLACE;
            }
            if (value == 4) {
                return PresentationType.DEFAULT;
            }
            if (value != 5) {
                return null;
            }
            return PresentationType.LISTEN_FOR_ACTIVITY_RESULT;
        }
    }

    public static PresentationType valueOf(String str) {
        return (PresentationType) Enum.valueOf(PresentationType.class, str);
    }

    public static PresentationType[] values() {
        return (PresentationType[]) $VALUES.clone();
    }
}

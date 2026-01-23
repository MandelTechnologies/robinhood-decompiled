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
/* compiled from: TransitionAnimation.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lgold_flow/proto/v1/TransitionAnimation;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ANIMATION_UNSPECIFIED", "CROSS_FADE", "ENTER_NONE_POP_SLIDE_HORIZONTAL", "SLIDE_HORIZONTAL", "SLIDE_HORIZONTAL_REVERSE", "SLIDE_VERTICAL", "NONE", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class TransitionAnimation implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransitionAnimation[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TransitionAnimation> ADAPTER;
    public static final TransitionAnimation ANIMATION_UNSPECIFIED;
    public static final TransitionAnimation CROSS_FADE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransitionAnimation ENTER_NONE_POP_SLIDE_HORIZONTAL;
    public static final TransitionAnimation NONE;
    public static final TransitionAnimation SLIDE_HORIZONTAL;
    public static final TransitionAnimation SLIDE_HORIZONTAL_REVERSE;
    public static final TransitionAnimation SLIDE_VERTICAL;
    private final int value;

    private static final /* synthetic */ TransitionAnimation[] $values() {
        return new TransitionAnimation[]{ANIMATION_UNSPECIFIED, CROSS_FADE, ENTER_NONE_POP_SLIDE_HORIZONTAL, SLIDE_HORIZONTAL, SLIDE_HORIZONTAL_REVERSE, SLIDE_VERTICAL, NONE};
    }

    @JvmStatic
    public static final TransitionAnimation fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TransitionAnimation> getEntries() {
        return $ENTRIES;
    }

    private TransitionAnimation(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TransitionAnimation transitionAnimation = new TransitionAnimation("ANIMATION_UNSPECIFIED", 0, 0);
        ANIMATION_UNSPECIFIED = transitionAnimation;
        CROSS_FADE = new TransitionAnimation("CROSS_FADE", 1, 1);
        ENTER_NONE_POP_SLIDE_HORIZONTAL = new TransitionAnimation("ENTER_NONE_POP_SLIDE_HORIZONTAL", 2, 2);
        SLIDE_HORIZONTAL = new TransitionAnimation("SLIDE_HORIZONTAL", 3, 3);
        SLIDE_HORIZONTAL_REVERSE = new TransitionAnimation("SLIDE_HORIZONTAL_REVERSE", 4, 4);
        SLIDE_VERTICAL = new TransitionAnimation("SLIDE_VERTICAL", 5, 5);
        NONE = new TransitionAnimation("NONE", 6, 6);
        TransitionAnimation[] transitionAnimationArr$values = $values();
        $VALUES = transitionAnimationArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transitionAnimationArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransitionAnimation.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TransitionAnimation>(orCreateKotlinClass, syntax, transitionAnimation) { // from class: gold_flow.proto.v1.TransitionAnimation$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TransitionAnimation fromValue(int value) {
                return TransitionAnimation.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TransitionAnimation.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lgold_flow/proto/v1/TransitionAnimation$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lgold_flow/proto/v1/TransitionAnimation;", "fromValue", "value", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransitionAnimation fromValue(int value) {
            switch (value) {
                case 0:
                    return TransitionAnimation.ANIMATION_UNSPECIFIED;
                case 1:
                    return TransitionAnimation.CROSS_FADE;
                case 2:
                    return TransitionAnimation.ENTER_NONE_POP_SLIDE_HORIZONTAL;
                case 3:
                    return TransitionAnimation.SLIDE_HORIZONTAL;
                case 4:
                    return TransitionAnimation.SLIDE_HORIZONTAL_REVERSE;
                case 5:
                    return TransitionAnimation.SLIDE_VERTICAL;
                case 6:
                    return TransitionAnimation.NONE;
                default:
                    return null;
            }
        }
    }

    public static TransitionAnimation valueOf(String str) {
        return (TransitionAnimation) Enum.valueOf(TransitionAnimation.class, str);
    }

    public static TransitionAnimation[] values() {
        return (TransitionAnimation[]) $VALUES.clone();
    }
}

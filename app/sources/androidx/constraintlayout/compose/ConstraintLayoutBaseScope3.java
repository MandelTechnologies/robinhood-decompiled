package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ConstraintLayoutBaseScope.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m3636d2 = {"Landroidx/constraintlayout/compose/ChainStyle;", "", "name", "", "bias", "", "(Ljava/lang/String;Ljava/lang/Float;)V", "getBias$constraintlayout_compose_release", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getName$constraintlayout_compose_release", "()Ljava/lang/String;", "Companion", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.constraintlayout.compose.ChainStyle, reason: use source file name */
/* loaded from: classes4.dex */
public final class ConstraintLayoutBaseScope3 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final ConstraintLayoutBaseScope3 Packed;
    private static final ConstraintLayoutBaseScope3 Spread;
    private static final ConstraintLayoutBaseScope3 SpreadInside;
    private final Float bias;
    private final String name;

    public ConstraintLayoutBaseScope3(String str, Float f) {
        this.name = str;
        this.bias = f;
    }

    /* compiled from: ConstraintLayoutBaseScope.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\f¨\u0006\u0013"}, m3636d2 = {"Landroidx/constraintlayout/compose/ChainStyle$Companion;", "", "<init>", "()V", "", "bias", "Landroidx/constraintlayout/compose/ChainStyle;", "Packed", "(F)Landroidx/constraintlayout/compose/ChainStyle;", "Spread", "Landroidx/constraintlayout/compose/ChainStyle;", "getSpread", "()Landroidx/constraintlayout/compose/ChainStyle;", "getSpread$annotations", "SpreadInside", "getSpreadInside", "getSpreadInside$annotations", "getPacked", "getPacked$annotations", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: androidx.constraintlayout.compose.ChainStyle$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ConstraintLayoutBaseScope3 getSpread() {
            return ConstraintLayoutBaseScope3.Spread;
        }

        public final ConstraintLayoutBaseScope3 getSpreadInside() {
            return ConstraintLayoutBaseScope3.SpreadInside;
        }

        public final ConstraintLayoutBaseScope3 getPacked() {
            return ConstraintLayoutBaseScope3.Packed;
        }

        public final ConstraintLayoutBaseScope3 Packed(float bias) {
            return new ConstraintLayoutBaseScope3("packed", Float.valueOf(bias));
        }
    }

    public /* synthetic */ ConstraintLayoutBaseScope3(String str, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : f);
    }

    /* renamed from: getBias$constraintlayout_compose_release, reason: from getter */
    public final Float getBias() {
        return this.bias;
    }

    /* renamed from: getName$constraintlayout_compose_release, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        int i = 2;
        Spread = new ConstraintLayoutBaseScope3("spread", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        SpreadInside = new ConstraintLayoutBaseScope3("spread_inside", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Packed = companion.Packed(0.5f);
    }
}

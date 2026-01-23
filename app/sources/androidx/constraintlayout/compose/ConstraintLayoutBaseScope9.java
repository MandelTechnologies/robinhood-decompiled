package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ConstraintLayoutBaseScope.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Landroidx/constraintlayout/compose/Visibility;", "", "name", "", "(Ljava/lang/String;)V", "getName$constraintlayout_compose_release", "()Ljava/lang/String;", "Companion", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.constraintlayout.compose.Visibility, reason: use source file name */
/* loaded from: classes4.dex */
public final class ConstraintLayoutBaseScope9 {
    private final String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConstraintLayoutBaseScope9 Visible = new ConstraintLayoutBaseScope9("visible");
    private static final ConstraintLayoutBaseScope9 Invisible = new ConstraintLayoutBaseScope9("invisible");
    private static final ConstraintLayoutBaseScope9 Gone = new ConstraintLayoutBaseScope9("gone");

    public ConstraintLayoutBaseScope9(String str) {
        this.name = str;
    }

    /* compiled from: ConstraintLayoutBaseScope.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, m3636d2 = {"Landroidx/constraintlayout/compose/Visibility$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/Visibility;", "Visible", "Landroidx/constraintlayout/compose/Visibility;", "getVisible", "()Landroidx/constraintlayout/compose/Visibility;", "getVisible$annotations", "Invisible", "getInvisible", "getInvisible$annotations", "Gone", "getGone", "getGone$annotations", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: androidx.constraintlayout.compose.Visibility$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ConstraintLayoutBaseScope9 getVisible() {
            return ConstraintLayoutBaseScope9.Visible;
        }

        public final ConstraintLayoutBaseScope9 getInvisible() {
            return ConstraintLayoutBaseScope9.Invisible;
        }

        public final ConstraintLayoutBaseScope9 getGone() {
            return ConstraintLayoutBaseScope9.Gone;
        }
    }

    /* renamed from: getName$constraintlayout_compose_release, reason: from getter */
    public final String getName() {
        return this.name;
    }
}

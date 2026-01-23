package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.Metadata;

/* compiled from: ConstraintLayoutBaseScope.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR \u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\b\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR \u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\b\u0012\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\nR \u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\b\u0012\u0004\b\u0015\u0010\f\u001a\u0004\b\u0014\u0010\n¨\u0006\u0016"}, m3636d2 = {"Landroidx/constraintlayout/compose/HorizontalChainReference;", "Landroidx/constraintlayout/compose/LayoutReference;", "", "id", "<init>", "(Ljava/lang/Object;)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "start", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "getStart", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "getStart$annotations", "()V", "absoluteLeft", "getAbsoluteLeft", "getAbsoluteLeft$annotations", "end", "getEnd", "getEnd$annotations", "absoluteRight", "getAbsoluteRight", "getAbsoluteRight$annotations", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.constraintlayout.compose.HorizontalChainReference, reason: use source file name */
/* loaded from: classes4.dex */
public final class ConstraintLayoutBaseScope5 extends ConstraintLayoutBaseScope6 {
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteLeft;
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteRight;
    private final ConstraintLayoutBaseScope.VerticalAnchor end;
    private final ConstraintLayoutBaseScope.VerticalAnchor start;

    public ConstraintLayoutBaseScope5(Object obj) {
        super(obj);
        this.start = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -2, this);
        this.absoluteLeft = new ConstraintLayoutBaseScope.VerticalAnchor(obj, 0, this);
        this.end = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -1, this);
        this.absoluteRight = new ConstraintLayoutBaseScope.VerticalAnchor(obj, 1, this);
    }
}

package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.parser.CLObject;
import kotlin.Metadata;

/* compiled from: ChainConstrainScope.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, m3636d2 = {"Landroidx/constraintlayout/compose/HorizontalChainScope;", "", "id", "Landroidx/constraintlayout/core/parser/CLObject;", "containerObject", "<init>", "(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/CLObject;)V", "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "parent", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "getParent", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "start", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "getStart", "()Landroidx/constraintlayout/compose/VerticalAnchorable;", "absoluteLeft", "getAbsoluteLeft", "end", "getEnd", "absoluteRight", "getAbsoluteRight", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.constraintlayout.compose.HorizontalChainScope, reason: use source file name */
/* loaded from: classes4.dex */
public final class ChainConstrainScope2 {
    private final ConstraintScopeCommon6 absoluteLeft;
    private final ConstraintScopeCommon6 absoluteRight;
    private final ConstraintScopeCommon6 end;
    private final Object id;
    private final ConstraintLayoutBaseScope4 parent = new ConstraintLayoutBaseScope4("parent");
    private final ConstraintScopeCommon6 start;

    public ChainConstrainScope2(Object obj, CLObject cLObject) {
        this.id = obj;
        this.start = new ChainConstrainScope(cLObject, -2);
        this.absoluteLeft = new ChainConstrainScope(cLObject, 0);
        this.end = new ChainConstrainScope(cLObject, -1);
        this.absoluteRight = new ChainConstrainScope(cLObject, 1);
    }

    public final ConstraintScopeCommon6 getStart() {
        return this.start;
    }

    public final ConstraintScopeCommon6 getEnd() {
        return this.end;
    }
}

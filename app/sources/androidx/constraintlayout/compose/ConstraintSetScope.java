package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.parser.CLObject;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ#\u0010\u000b\u001a\u00060\fR\u00020\u00002\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000e\"\u00020\n¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstraintSetScope;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "extendFrom", "Landroidx/constraintlayout/core/parser/CLObject;", "(Landroidx/constraintlayout/core/parser/CLObject;)V", "generatedCount", "", "createRefFor", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "id", "", "createRefsFor", "Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;", "ids", "", "([Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;", "nextId", "", "ConstrainedLayoutReferences", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class ConstraintSetScope extends ConstraintLayoutBaseScope {
    private int generatedCount;

    public ConstraintSetScope(CLObject cLObject) {
        super(cLObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String nextId() {
        StringBuilder sb = new StringBuilder();
        sb.append("androidx.constraintlayout.id");
        int i = this.generatedCount;
        this.generatedCount = i + 1;
        sb.append(i);
        return sb.toString();
    }

    public final ConstraintLayoutBaseScope4 createRefFor(Object id) {
        return new ConstraintLayoutBaseScope4(id);
    }

    public final ConstrainedLayoutReferences createRefsFor(Object... ids) {
        return new ConstrainedLayoutReferences(Arrays.copyOf(ids, ids.length));
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences;", "", "", "ids", "<init>", "(Landroidx/constraintlayout/compose/ConstraintSetScope;[Ljava/lang/Object;)V", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "component1", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "component2", "[Ljava/lang/Object;", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public final class ConstrainedLayoutReferences {
        private final Object[] ids;

        public ConstrainedLayoutReferences(Object[] objArr) {
            this.ids = objArr;
        }

        public final ConstraintLayoutBaseScope4 component1() {
            Object[] objArr = this.ids;
            return new ConstraintLayoutBaseScope4(ArraysKt.getLastIndex(objArr) >= 0 ? objArr[0] : ConstraintSetScope.this.nextId());
        }

        public final ConstraintLayoutBaseScope4 component2() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(1 <= ArraysKt.getLastIndex(objArr) ? objArr[1] : constraintSetScope.nextId());
        }
    }
}

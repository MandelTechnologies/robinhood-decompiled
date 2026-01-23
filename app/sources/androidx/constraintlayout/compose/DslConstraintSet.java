package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DslConstraintSet.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B,\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Landroidx/constraintlayout/compose/DslConstraintSet;", "Landroidx/constraintlayout/compose/DerivedConstraintSet;", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstraintSetScope;", "", "Lkotlin/ExtensionFunctionType;", "description", "Landroidx/constraintlayout/compose/ConstraintSet;", "extendFrom", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/constraintlayout/compose/ConstraintSet;)V", "Landroidx/constraintlayout/compose/State;", "state", "applyToState", "(Landroidx/constraintlayout/compose/State;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/jvm/functions/Function1;", "getDescription", "()Lkotlin/jvm/functions/Function1;", "scope", "Landroidx/constraintlayout/compose/ConstraintSetScope;", "getScope$constraintlayout_compose_release", "()Landroidx/constraintlayout/compose/ConstraintSetScope;", "Landroidx/constraintlayout/compose/ConstraintSet;", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class DslConstraintSet implements ConstraintSet2 {
    private final Function1<ConstraintSetScope, Unit> description;
    private final ConstraintSet extendFrom;
    private final ConstraintSetScope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public DslConstraintSet(Function1<? super ConstraintSetScope, Unit> function1, ConstraintSet constraintSet) {
        ConstraintSetScope constraintSetScope;
        this.description = function1;
        CLObject containerObject = null;
        DslConstraintSet dslConstraintSet = constraintSet instanceof DslConstraintSet ? (DslConstraintSet) constraintSet : null;
        if (dslConstraintSet != null && (constraintSetScope = dslConstraintSet.scope) != null) {
            containerObject = constraintSetScope.getContainerObject();
        }
        ConstraintSetScope constraintSetScope2 = new ConstraintSetScope(containerObject);
        function1.invoke(constraintSetScope2);
        this.scope = constraintSetScope2;
    }

    public /* synthetic */ DslConstraintSet(Function1 function1, ConstraintSet constraintSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? null : constraintSet);
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet2
    public ConstraintSet getExtendFrom() {
        return this.extendFrom;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet2
    public void applyToState(State state) throws CLParsingException {
        this.scope.applyTo(state);
    }

    public boolean equals(Object other) {
        if (other instanceof DslConstraintSet) {
            return Intrinsics.areEqual(this.scope, ((DslConstraintSet) other).scope);
        }
        return false;
    }

    public int hashCode() {
        return this.scope.hashCode();
    }
}

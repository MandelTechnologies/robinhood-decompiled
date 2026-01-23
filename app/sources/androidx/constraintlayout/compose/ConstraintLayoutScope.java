package androidx.constraintlayout.compose;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.ParentDataModifier;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.platform.InspectorValueInfo;
import androidx.compose.p011ui.unit.Density;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002%&B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0007R\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J4\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0018\u00010\u0007R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR$\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00040!j\b\u0012\u0004\u0012\u00020\u0004`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "<init>", "()V", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "createRef", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "createRefs", "()Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "", "reset", "Landroidx/compose/ui/Modifier;", "ref", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstrainScope;", "Lkotlin/ExtensionFunctionType;", "constrainBlock", "constrainAs", "(Landroidx/compose/ui/Modifier;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "", "isAnimateChanges", "Z", "()Z", "setAnimateChanges", "(Z)V", "isAnimateChanges$annotations", "referencesObject", "Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "", "ChildrenStartIndex", "I", "childId", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "childrenRefs", "Ljava/util/ArrayList;", "ConstrainAsModifier", "ConstrainedLayoutReferences", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConstraintLayoutScope extends ConstraintLayoutBaseScope {
    public static final int $stable = 8;
    private final int ChildrenStartIndex;
    private int childId;
    private final ArrayList<ConstraintLayoutBaseScope4> childrenRefs;
    private boolean isAnimateChanges;
    private ConstrainedLayoutReferences referencesObject;

    @PublishedApi
    public ConstraintLayoutScope() {
        super(null);
        this.childId = this.ChildrenStartIndex;
        this.childrenRefs = new ArrayList<>();
    }

    public final ConstraintLayoutBaseScope4 createRef() {
        ArrayList<ConstraintLayoutBaseScope4> arrayList = this.childrenRefs;
        int i = this.childId;
        this.childId = i + 1;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = (ConstraintLayoutBaseScope4) CollectionsKt.getOrNull(arrayList, i);
        if (constraintLayoutBaseScope4 != null) {
            return constraintLayoutBaseScope4;
        }
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42 = new ConstraintLayoutBaseScope4(Integer.valueOf(this.childId));
        this.childrenRefs.add(constraintLayoutBaseScope42);
        return constraintLayoutBaseScope42;
    }

    public final ConstrainedLayoutReferences createRefs() {
        ConstrainedLayoutReferences constrainedLayoutReferences = this.referencesObject;
        if (constrainedLayoutReferences != null) {
            return constrainedLayoutReferences;
        }
        ConstrainedLayoutReferences constrainedLayoutReferences2 = new ConstrainedLayoutReferences();
        this.referencesObject = constrainedLayoutReferences2;
        return constrainedLayoutReferences2;
    }

    public final void setAnimateChanges(boolean z) {
        this.isAnimateChanges = z;
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutBaseScope
    public void reset() {
        super.reset();
        this.childId = this.ChildrenStartIndex;
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\r\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "", "<init>", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;)V", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "component1", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public final class ConstrainedLayoutReferences {
        public ConstrainedLayoutReferences() {
        }

        public final ConstraintLayoutBaseScope4 component1() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstraintLayoutBaseScope4 component2() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstraintLayoutBaseScope4 component3() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstraintLayoutBaseScope4 component4() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstraintLayoutBaseScope4 component5() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstraintLayoutBaseScope4 component6() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstraintLayoutBaseScope4 component7() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstraintLayoutBaseScope4 component8() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstraintLayoutBaseScope4 component9() {
            return ConstraintLayoutScope.this.createRef();
        }

        public final ConstraintLayoutBaseScope4 component10() {
            return ConstraintLayoutScope.this.createRef();
        }
    }

    public final Modifier constrainAs(Modifier modifier, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, Function1<? super ConstrainScope, Unit> function1) {
        if (this.isAnimateChanges) {
            function1.invoke(new ConstrainScope(constraintLayoutBaseScope4.getId(), asCLContainer$constraintlayout_compose_release(constraintLayoutBaseScope4)));
        }
        return modifier.then(new ConstrainAsModifier(constraintLayoutBaseScope4, function1));
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B&\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016R\u001f\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainAsModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "ref", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "constrainBlock", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstrainScope;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lkotlin/jvm/functions/Function1;)V", "equals", "", "other", "", "hashCode", "", "modifyParentData", "Landroidx/constraintlayout/compose/ConstraintLayoutParentData;", "Landroidx/compose/ui/unit/Density;", "parentData", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class ConstrainAsModifier extends InspectorValueInfo implements ParentDataModifier {
        private final Function1<ConstrainScope, Unit> constrainBlock;
        private final ConstraintLayoutBaseScope4 ref;

        @Override // androidx.compose.p011ui.layout.ParentDataModifier
        public ConstraintLayoutParentData modifyParentData(Density density, Object obj) {
            return new ConstraintLayoutParentData(this.ref, this.constrainBlock);
        }

        public int hashCode() {
            return this.constrainBlock.hashCode();
        }

        public boolean equals(Object other) {
            Function1<ConstrainScope, Unit> function1 = this.constrainBlock;
            ConstrainAsModifier constrainAsModifier = other instanceof ConstrainAsModifier ? (ConstrainAsModifier) other : null;
            return function1 == (constrainAsModifier != null ? constrainAsModifier.constrainBlock : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ConstrainAsModifier(final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, final Function1<? super ConstrainScope, Unit> function1) {
            super(InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    invoke2(inspectorInfo);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(InspectorInfo inspectorInfo) {
                    inspectorInfo.setName("constrainAs");
                    inspectorInfo.getProperties().set("ref", constraintLayoutBaseScope4);
                    inspectorInfo.getProperties().set("constrainBlock", function1);
                }
            } : InspectableValueKt.getNoInspectorInfo());
            this.ref = constraintLayoutBaseScope4;
            this.constrainBlock = function1;
        }
    }
}

package androidx.constraintlayout.compose;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConstraintLayoutBaseScope.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0015\b'\u0018\u00002\u00020\u0001:\u0003XYZB\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0006J.\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u0019\u0010\u001dJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0018\u0010&\u001a\u00020 2\u0006\u0010$\u001a\u00020#ø\u0001\u0000¢\u0006\u0004\b%\u0010\"J\u0015\u0010&\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b&\u0010\"J\u0018\u0010*\u001a\u00020'2\u0006\u0010$\u001a\u00020#ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b*\u0010)J.\u00101\u001a\u00020 2\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020,0+\"\u00020,2\b\b\u0002\u0010.\u001a\u00020#ø\u0001\u0000¢\u0006\u0004\b/\u00100J.\u00103\u001a\u00020 2\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020,0+\"\u00020,2\b\b\u0002\u0010.\u001a\u00020#ø\u0001\u0000¢\u0006\u0004\b2\u00100J.\u00106\u001a\u00020'2\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020,0+\"\u00020,2\b\b\u0002\u0010.\u001a\u00020#ø\u0001\u0000¢\u0006\u0004\b4\u00105J+\u00109\u001a\u00020\u00132\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020,0+\"\u00020,2\b\b\u0002\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J+\u0010<\u001a\u00020;2\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020,0+\"\u00020,2\b\b\u0002\u00108\u001a\u000207¢\u0006\u0004\b<\u0010=J\u0013\u0010@\u001a\u00020\u0002*\u00020,H\u0000¢\u0006\u0004\b>\u0010?J\u001a\u0010C\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0007H\u0016¢\u0006\u0004\bE\u0010\rR2\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u00150F8\u0004X\u0085\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bK\u0010\u0006\u001a\u0004\bI\u0010JR \u0010L\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010\u0006\u001a\u0004\bN\u0010OR(\u0010Q\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010\u0006\u001a\u0004\bS\u0010\r\"\u0004\bT\u0010\u000bR\u0014\u0010V\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\bV\u0010RR\u0016\u0010W\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010R\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006["}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "", "Landroidx/constraintlayout/core/parser/CLObject;", "extendFrom", "<init>", "(Landroidx/constraintlayout/core/parser/CLObject;)V", "()V", "", "value", "", "updateHelpersHashCode", "(I)V", "createHelperId", "()I", "Landroidx/constraintlayout/compose/State;", "state", "applyTo", "(Landroidx/constraintlayout/compose/State;)V", "reset", "Landroidx/constraintlayout/compose/HorizontalChainReference;", "ref", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/HorizontalChainScope;", "Lkotlin/ExtensionFunctionType;", "constrainBlock", "constrain", "(Landroidx/constraintlayout/compose/HorizontalChainReference;Lkotlin/jvm/functions/Function1;)Landroidx/constraintlayout/compose/HorizontalChainScope;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Landroidx/constraintlayout/compose/ConstrainScope;", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lkotlin/jvm/functions/Function1;)Landroidx/constraintlayout/compose/ConstrainScope;", "", "fraction", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "createGuidelineFromStart", "(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "Landroidx/compose/ui/unit/Dp;", "offset", "createGuidelineFromEnd-0680j_4", "createGuidelineFromEnd", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "createGuidelineFromTop-0680j_4", "(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "createGuidelineFromTop", "", "Landroidx/constraintlayout/compose/LayoutReference;", "elements", GoldFeature.MARGIN, "createStartBarrier-3ABfNKs", "([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "createStartBarrier", "createEndBarrier-3ABfNKs", "createEndBarrier", "createBottomBarrier-3ABfNKs", "([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "createBottomBarrier", "Landroidx/constraintlayout/compose/ChainStyle;", "chainStyle", "createHorizontalChain", "([Landroidx/constraintlayout/compose/LayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/HorizontalChainReference;", "Landroidx/constraintlayout/compose/VerticalChainReference;", "createVerticalChain", "([Landroidx/constraintlayout/compose/LayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/VerticalChainReference;", "asCLContainer$constraintlayout_compose_release", "(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;", "asCLContainer", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "tasks", "Ljava/util/List;", "getTasks", "()Ljava/util/List;", "getTasks$annotations", "containerObject", "Landroidx/constraintlayout/core/parser/CLObject;", "getContainerObject", "()Landroidx/constraintlayout/core/parser/CLObject;", "getContainerObject$annotations", "helpersHashCode", "I", "getHelpersHashCode", "setHelpersHashCode", "getHelpersHashCode$annotations", "HelpersStartId", "helperId", "BaselineAnchor", "HorizontalAnchor", "VerticalAnchor", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class ConstraintLayoutBaseScope {
    private final int HelpersStartId;
    private final CLObject containerObject;
    private int helperId;
    private int helpersHashCode;
    private final List<Function1<State, Unit>> tasks;

    public ConstraintLayoutBaseScope(CLObject cLObject) {
        CLObject cLObjectMo8187clone;
        this.tasks = new ArrayList();
        this.containerObject = (cLObject == null || (cLObjectMo8187clone = cLObject.mo8187clone()) == null) ? new CLObject(new char[0]) : cLObjectMo8187clone;
        this.HelpersStartId = 1000;
        this.helperId = 1000;
    }

    public ConstraintLayoutBaseScope() {
        this(null);
    }

    public final CLObject getContainerObject() {
        return this.containerObject;
    }

    public final void applyTo(State state) throws CLParsingException {
        ConstraintSetParser.populateState(this.containerObject, state, new ConstraintSetParser.LayoutVariables());
    }

    public void reset() {
        this.containerObject.clear();
        this.helperId = this.HelpersStartId;
        this.helpersHashCode = 0;
    }

    public final int getHelpersHashCode() {
        return this.helpersHashCode;
    }

    private final void updateHelpersHashCode(int value) {
        this.helpersHashCode = ((this.helpersHashCode * 1009) + value) % 1000000007;
    }

    private final int createHelperId() {
        int i = this.helperId;
        this.helperId = i + 1;
        return i;
    }

    /* compiled from: ConstraintLayoutBaseScope.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "", "id", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Landroidx/constraintlayout/compose/LayoutReference;", "reference", "<init>", "(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "I", "getIndex$constraintlayout_compose_release", "Landroidx/constraintlayout/compose/LayoutReference;", "getReference", "()Landroidx/constraintlayout/compose/LayoutReference;", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final /* data */ class VerticalAnchor {
        private final Object id;
        private final int index;
        private final ConstraintLayoutBaseScope6 reference;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerticalAnchor)) {
                return false;
            }
            VerticalAnchor verticalAnchor = (VerticalAnchor) other;
            return Intrinsics.areEqual(this.id, verticalAnchor.id) && this.index == verticalAnchor.index && Intrinsics.areEqual(this.reference, verticalAnchor.reference);
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "VerticalAnchor(id=" + this.id + ", index=" + this.index + ", reference=" + this.reference + ')';
        }

        public VerticalAnchor(Object obj, int i, ConstraintLayoutBaseScope6 constraintLayoutBaseScope6) {
            this.id = obj;
            this.index = i;
            this.reference = constraintLayoutBaseScope6;
        }

        /* renamed from: getId$constraintlayout_compose_release, reason: from getter */
        public final Object getId() {
            return this.id;
        }

        /* renamed from: getIndex$constraintlayout_compose_release, reason: from getter */
        public final int getIndex() {
            return this.index;
        }
    }

    /* compiled from: ConstraintLayoutBaseScope.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "", "id", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Landroidx/constraintlayout/compose/LayoutReference;", "reference", "<init>", "(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "I", "getIndex$constraintlayout_compose_release", "Landroidx/constraintlayout/compose/LayoutReference;", "getReference", "()Landroidx/constraintlayout/compose/LayoutReference;", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final /* data */ class HorizontalAnchor {
        private final Object id;
        private final int index;
        private final ConstraintLayoutBaseScope6 reference;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HorizontalAnchor)) {
                return false;
            }
            HorizontalAnchor horizontalAnchor = (HorizontalAnchor) other;
            return Intrinsics.areEqual(this.id, horizontalAnchor.id) && this.index == horizontalAnchor.index && Intrinsics.areEqual(this.reference, horizontalAnchor.reference);
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "HorizontalAnchor(id=" + this.id + ", index=" + this.index + ", reference=" + this.reference + ')';
        }

        public HorizontalAnchor(Object obj, int i, ConstraintLayoutBaseScope6 constraintLayoutBaseScope6) {
            this.id = obj;
            this.index = i;
            this.reference = constraintLayoutBaseScope6;
        }

        /* renamed from: getId$constraintlayout_compose_release, reason: from getter */
        public final Object getId() {
            return this.id;
        }

        /* renamed from: getIndex$constraintlayout_compose_release, reason: from getter */
        public final int getIndex() {
            return this.index;
        }
    }

    /* compiled from: ConstraintLayoutBaseScope.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "", "id", "Landroidx/constraintlayout/compose/LayoutReference;", "reference", "<init>", "(Ljava/lang/Object;Landroidx/constraintlayout/compose/LayoutReference;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "Landroidx/constraintlayout/compose/LayoutReference;", "getReference", "()Landroidx/constraintlayout/compose/LayoutReference;", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final /* data */ class BaselineAnchor {
        private final Object id;
        private final ConstraintLayoutBaseScope6 reference;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaselineAnchor)) {
                return false;
            }
            BaselineAnchor baselineAnchor = (BaselineAnchor) other;
            return Intrinsics.areEqual(this.id, baselineAnchor.id) && Intrinsics.areEqual(this.reference, baselineAnchor.reference);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "BaselineAnchor(id=" + this.id + ", reference=" + this.reference + ')';
        }

        public BaselineAnchor(Object obj, ConstraintLayoutBaseScope6 constraintLayoutBaseScope6) {
            this.id = obj;
            this.reference = constraintLayoutBaseScope6;
        }

        /* renamed from: getId$constraintlayout_compose_release, reason: from getter */
        public final Object getId() {
            return this.id;
        }
    }

    public final ChainConstrainScope2 constrain(ConstraintLayoutBaseScope5 ref, Function1<? super ChainConstrainScope2, Unit> constrainBlock) {
        ChainConstrainScope2 chainConstrainScope2 = new ChainConstrainScope2(ref.getId(), asCLContainer$constraintlayout_compose_release(ref));
        constrainBlock.invoke(chainConstrainScope2);
        return chainConstrainScope2;
    }

    public final ConstrainScope constrain(ConstraintLayoutBaseScope4 ref, Function1<? super ConstrainScope, Unit> constrainBlock) {
        ConstrainScope constrainScope = new ConstrainScope(ref.getId(), asCLContainer$constraintlayout_compose_release(ref));
        constrainBlock.invoke(constrainScope);
        return constrainScope;
    }

    public final VerticalAnchor createGuidelineFromStart(float fraction) {
        ConstraintLayoutBaseScope7 constraintLayoutBaseScope7 = new ConstraintLayoutBaseScope7(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from("start"));
        cLArray.add(new CLNumber(fraction));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(constraintLayoutBaseScope7);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("type", "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.put("percent", cLArray);
        updateHelpersHashCode(3);
        updateHelpersHashCode(Float.hashCode(fraction));
        return new VerticalAnchor(constraintLayoutBaseScope7.getId(), 0, constraintLayoutBaseScope7);
    }

    /* renamed from: createGuidelineFromEnd-0680j_4, reason: not valid java name */
    public final VerticalAnchor m8141createGuidelineFromEnd0680j_4(float offset) {
        ConstraintLayoutBaseScope7 constraintLayoutBaseScope7 = new ConstraintLayoutBaseScope7(Integer.valueOf(createHelperId()));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(constraintLayoutBaseScope7);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("type", "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("end", offset);
        updateHelpersHashCode(5);
        updateHelpersHashCode(C2002Dp.m7998hashCodeimpl(offset));
        return new VerticalAnchor(constraintLayoutBaseScope7.getId(), 0, constraintLayoutBaseScope7);
    }

    public final VerticalAnchor createGuidelineFromEnd(float fraction) {
        ConstraintLayoutBaseScope7 constraintLayoutBaseScope7 = new ConstraintLayoutBaseScope7(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from("end"));
        cLArray.add(new CLNumber(fraction));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(constraintLayoutBaseScope7);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("type", "vGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.put("percent", cLArray);
        updateHelpersHashCode(3);
        updateHelpersHashCode(Float.hashCode(fraction));
        return new VerticalAnchor(constraintLayoutBaseScope7.getId(), 0, constraintLayoutBaseScope7);
    }

    /* renamed from: createGuidelineFromTop-0680j_4, reason: not valid java name */
    public final HorizontalAnchor m8142createGuidelineFromTop0680j_4(float offset) {
        ConstraintLayoutBaseScope7 constraintLayoutBaseScope7 = new ConstraintLayoutBaseScope7(Integer.valueOf(createHelperId()));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(constraintLayoutBaseScope7);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("type", "hGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("start", offset);
        updateHelpersHashCode(7);
        updateHelpersHashCode(C2002Dp.m7998hashCodeimpl(offset));
        return new HorizontalAnchor(constraintLayoutBaseScope7.getId(), 0, constraintLayoutBaseScope7);
    }

    public final HorizontalAnchor createGuidelineFromTop(float fraction) {
        ConstraintLayoutBaseScope7 constraintLayoutBaseScope7 = new ConstraintLayoutBaseScope7(Integer.valueOf(createHelperId()));
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(constraintLayoutBaseScope7);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("type", "hGuideline");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber("percent", fraction);
        updateHelpersHashCode(8);
        updateHelpersHashCode(Float.hashCode(fraction));
        return new HorizontalAnchor(constraintLayoutBaseScope7.getId(), 0, constraintLayoutBaseScope7);
    }

    /* renamed from: createStartBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m8143createStartBarrier3ABfNKs(ConstraintLayoutBaseScope6[] elements, float margin) {
        ConstraintLayoutBaseScope7 constraintLayoutBaseScope7 = new ConstraintLayoutBaseScope7(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (ConstraintLayoutBaseScope6 constraintLayoutBaseScope6 : elements) {
            cLArray.add(CLString.from(constraintLayoutBaseScope6.getId().toString()));
        }
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(constraintLayoutBaseScope7);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("type", "barrier");
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("direction", "start");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber(GoldFeature.MARGIN, margin);
        cLObjectAsCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(10);
        for (ConstraintLayoutBaseScope6 constraintLayoutBaseScope62 : elements) {
            updateHelpersHashCode(constraintLayoutBaseScope62.hashCode());
        }
        updateHelpersHashCode(C2002Dp.m7998hashCodeimpl(margin));
        return new VerticalAnchor(constraintLayoutBaseScope7.getId(), 0, constraintLayoutBaseScope7);
    }

    /* renamed from: createEndBarrier-3ABfNKs, reason: not valid java name */
    public final VerticalAnchor m8140createEndBarrier3ABfNKs(ConstraintLayoutBaseScope6[] elements, float margin) {
        ConstraintLayoutBaseScope7 constraintLayoutBaseScope7 = new ConstraintLayoutBaseScope7(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (ConstraintLayoutBaseScope6 constraintLayoutBaseScope6 : elements) {
            cLArray.add(CLString.from(constraintLayoutBaseScope6.getId().toString()));
        }
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(constraintLayoutBaseScope7);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("type", "barrier");
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("direction", "end");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber(GoldFeature.MARGIN, margin);
        cLObjectAsCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(13);
        for (ConstraintLayoutBaseScope6 constraintLayoutBaseScope62 : elements) {
            updateHelpersHashCode(constraintLayoutBaseScope62.hashCode());
        }
        updateHelpersHashCode(C2002Dp.m7998hashCodeimpl(margin));
        return new VerticalAnchor(constraintLayoutBaseScope7.getId(), 0, constraintLayoutBaseScope7);
    }

    /* renamed from: createBottomBarrier-3ABfNKs, reason: not valid java name */
    public final HorizontalAnchor m8139createBottomBarrier3ABfNKs(ConstraintLayoutBaseScope6[] elements, float margin) {
        ConstraintLayoutBaseScope7 constraintLayoutBaseScope7 = new ConstraintLayoutBaseScope7(Integer.valueOf(createHelperId()));
        CLArray cLArray = new CLArray(new char[0]);
        for (ConstraintLayoutBaseScope6 constraintLayoutBaseScope6 : elements) {
            cLArray.add(CLString.from(constraintLayoutBaseScope6.getId().toString()));
        }
        CLObject cLObjectAsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(constraintLayoutBaseScope7);
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("type", "barrier");
        cLObjectAsCLContainer$constraintlayout_compose_release.putString("direction", "bottom");
        cLObjectAsCLContainer$constraintlayout_compose_release.putNumber(GoldFeature.MARGIN, margin);
        cLObjectAsCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        updateHelpersHashCode(15);
        for (ConstraintLayoutBaseScope6 constraintLayoutBaseScope62 : elements) {
            updateHelpersHashCode(constraintLayoutBaseScope62.hashCode());
        }
        updateHelpersHashCode(C2002Dp.m7998hashCodeimpl(margin));
        return new HorizontalAnchor(constraintLayoutBaseScope7.getId(), 0, constraintLayoutBaseScope7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLObject] */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.constraintlayout.core.parser.CLString] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.constraintlayout.core.parser.CLElement] */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.constraintlayout.compose.ConstraintLayoutBaseScope] */
    public final ConstraintLayoutBaseScope5 createHorizontalChain(ConstraintLayoutBaseScope6[] elements, ConstraintLayoutBaseScope3 chainStyle) {
        ?? From;
        ConstraintLayoutBaseScope5 constraintLayoutBaseScope5 = new ConstraintLayoutBaseScope5(Integer.valueOf(createHelperId()));
        ?? cLArray = new CLArray(new char[0]);
        for (ConstraintLayoutBaseScope6 constraintLayoutBaseScope6 : elements) {
            Object obj = constraintLayoutBaseScope6.helperParamsMap.get(Reflection.getOrCreateKotlinClass(ConstraintLayoutBaseScope2.class).getSimpleName());
            if (!(obj instanceof ConstraintLayoutBaseScope2)) {
                obj = null;
            }
            ConstraintLayoutBaseScope2 constraintLayoutBaseScope2 = (ConstraintLayoutBaseScope2) obj;
            if (constraintLayoutBaseScope2 != null) {
                From = new CLArray(new char[0]);
                From.add(CLString.from(constraintLayoutBaseScope6.getId().toString()));
                From.add(new CLNumber(constraintLayoutBaseScope2.getWeight()));
                From.add(new CLNumber(constraintLayoutBaseScope2.getStartMargin()));
                From.add(new CLNumber(constraintLayoutBaseScope2.getEndMargin()));
                From.add(new CLNumber(constraintLayoutBaseScope2.getStartGoneMargin()));
                From.add(new CLNumber(constraintLayoutBaseScope2.getEndGoneMargin()));
            } else {
                From = CLString.from(constraintLayoutBaseScope6.getId().toString());
            }
            cLArray.add(From);
        }
        CLArray cLArray2 = new CLArray(new char[0]);
        cLArray2.add(CLString.from(chainStyle.getName()));
        Float bias = chainStyle.getBias();
        cLArray2.add(new CLNumber(bias != null ? bias.floatValue() : 0.5f));
        ?? AsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(constraintLayoutBaseScope5);
        AsCLContainer$constraintlayout_compose_release.putString("type", "hChain");
        AsCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        AsCLContainer$constraintlayout_compose_release.put(ResourceTypes.STYLE, cLArray2);
        updateHelpersHashCode(16);
        for (ConstraintLayoutBaseScope6 constraintLayoutBaseScope62 : elements) {
            updateHelpersHashCode(constraintLayoutBaseScope62.hashCode());
        }
        updateHelpersHashCode(chainStyle.hashCode());
        return constraintLayoutBaseScope5;
    }

    public static /* synthetic */ ConstraintLayoutBaseScope8 createVerticalChain$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr, ConstraintLayoutBaseScope3 constraintLayoutBaseScope3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createVerticalChain");
        }
        if ((i & 2) != 0) {
            constraintLayoutBaseScope3 = ConstraintLayoutBaseScope3.INSTANCE.getSpread();
        }
        return constraintLayoutBaseScope.createVerticalChain(constraintLayoutBaseScope6Arr, constraintLayoutBaseScope3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLObject] */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.constraintlayout.core.parser.CLString] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.constraintlayout.core.parser.CLElement] */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.constraintlayout.compose.ConstraintLayoutBaseScope] */
    public final ConstraintLayoutBaseScope8 createVerticalChain(ConstraintLayoutBaseScope6[] elements, ConstraintLayoutBaseScope3 chainStyle) {
        ?? From;
        ConstraintLayoutBaseScope8 constraintLayoutBaseScope8 = new ConstraintLayoutBaseScope8(Integer.valueOf(createHelperId()));
        ?? cLArray = new CLArray(new char[0]);
        for (ConstraintLayoutBaseScope6 constraintLayoutBaseScope6 : elements) {
            Object obj = constraintLayoutBaseScope6.helperParamsMap.get(Reflection.getOrCreateKotlinClass(ConstraintLayoutBaseScope2.class).getSimpleName());
            if (!(obj instanceof ConstraintLayoutBaseScope2)) {
                obj = null;
            }
            ConstraintLayoutBaseScope2 constraintLayoutBaseScope2 = (ConstraintLayoutBaseScope2) obj;
            if (constraintLayoutBaseScope2 != null) {
                From = new CLArray(new char[0]);
                From.add(CLString.from(constraintLayoutBaseScope6.getId().toString()));
                From.add(new CLNumber(constraintLayoutBaseScope2.getWeight()));
                From.add(new CLNumber(constraintLayoutBaseScope2.getTopMargin()));
                From.add(new CLNumber(constraintLayoutBaseScope2.getBottomMargin()));
                From.add(new CLNumber(constraintLayoutBaseScope2.getTopGoneMargin()));
                From.add(new CLNumber(constraintLayoutBaseScope2.getBottomGoneMargin()));
            } else {
                From = CLString.from(constraintLayoutBaseScope6.getId().toString());
            }
            cLArray.add(From);
        }
        CLArray cLArray2 = new CLArray(new char[0]);
        cLArray2.add(CLString.from(chainStyle.getName()));
        Float bias = chainStyle.getBias();
        cLArray2.add(new CLNumber(bias != null ? bias.floatValue() : 0.5f));
        ?? AsCLContainer$constraintlayout_compose_release = asCLContainer$constraintlayout_compose_release(constraintLayoutBaseScope8);
        AsCLContainer$constraintlayout_compose_release.putString("type", "vChain");
        AsCLContainer$constraintlayout_compose_release.put("contains", cLArray);
        AsCLContainer$constraintlayout_compose_release.put(ResourceTypes.STYLE, cLArray2);
        updateHelpersHashCode(17);
        for (ConstraintLayoutBaseScope6 constraintLayoutBaseScope62 : elements) {
            updateHelpersHashCode(constraintLayoutBaseScope62.hashCode());
        }
        updateHelpersHashCode(chainStyle.hashCode());
        return constraintLayoutBaseScope8;
    }

    public final CLObject asCLContainer$constraintlayout_compose_release(ConstraintLayoutBaseScope6 constraintLayoutBaseScope6) {
        String string2 = constraintLayoutBaseScope6.getId().toString();
        if (this.containerObject.getObjectOrNull(string2) == null) {
            this.containerObject.put(string2, new CLObject(new char[0]));
        }
        return this.containerObject.getObject(string2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ConstraintLayoutBaseScope) {
            return Intrinsics.areEqual(this.containerObject, ((ConstraintLayoutBaseScope) other).containerObject);
        }
        return false;
    }

    public int hashCode() {
        return this.containerObject.hashCode();
    }

    /* renamed from: createStartBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m8138createStartBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createStartBarrier-3ABfNKs");
        }
        if ((i & 2) != 0) {
            f = C2002Dp.m7995constructorimpl(0);
        }
        return constraintLayoutBaseScope.m8143createStartBarrier3ABfNKs(constraintLayoutBaseScope6Arr, f);
    }

    /* renamed from: createEndBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ VerticalAnchor m8137createEndBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createEndBarrier-3ABfNKs");
        }
        if ((i & 2) != 0) {
            f = C2002Dp.m7995constructorimpl(0);
        }
        return constraintLayoutBaseScope.m8140createEndBarrier3ABfNKs(constraintLayoutBaseScope6Arr, f);
    }

    /* renamed from: createBottomBarrier-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ HorizontalAnchor m8136createBottomBarrier3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope, ConstraintLayoutBaseScope6[] constraintLayoutBaseScope6Arr, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBottomBarrier-3ABfNKs");
        }
        if ((i & 2) != 0) {
            f = C2002Dp.m7995constructorimpl(0);
        }
        return constraintLayoutBaseScope.m8139createBottomBarrier3ABfNKs(constraintLayoutBaseScope6Arr, f);
    }
}

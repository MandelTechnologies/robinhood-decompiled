package androidx.compose.p011ui.focus;

import android.os.Trace;
import android.view.KeyEvent;
import androidx.collection.LongSet3;
import androidx.collection.ObjectList2;
import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.input.key.KeyEvent2;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import androidx.compose.p011ui.input.key.KeyInputModifierNode;
import androidx.compose.p011ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.p011ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.p011ui.input.rotary.RotaryScrollEvent;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.node.DelegatableNode2;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.node.NodeChain;
import androidx.compose.p011ui.node.NodeKind;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FocusOwnerImpl.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B¬\u0001\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012:\u0010\u000e\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006\u0012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u0004\u0018\u00010 *\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001a\u0010'\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J&\u0010*\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J$\u0010-\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010\u001bJ\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u00100J2\u0010\u0018\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105J:\u0010;\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u00072\b\u00107\u001a\u0004\u0018\u00010\u000b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J(\u0010?\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001a\u0010A\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010&J%\u0010D\u001a\u00020\r2\u0006\u0010C\u001a\u00020B2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u001cH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010G\u001a\u00020\u00042\u0006\u0010F\u001a\u00020IH\u0016¢\u0006\u0004\bG\u0010JJ\u0017\u0010G\u001a\u00020\u00042\u0006\u0010F\u001a\u00020KH\u0016¢\u0006\u0004\bG\u0010LJ\u000f\u0010M\u001a\u00020\u0004H\u0016¢\u0006\u0004\bM\u0010\u001bJ\u0011\u0010N\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\bN\u0010ORH\u0010\u000e\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010PR/\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010QR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010RR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010RR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010RR\"\u0010S\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010\u001e\"\u0004\bV\u0010HR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010[\u001a\u00020Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010`\u001a\u00020_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR \u0010i\u001a\b\u0012\u0004\u0012\u00020h0g8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR.\u0010n\u001a\u0004\u0018\u00010\u001c2\b\u0010m\u001a\u0004\u0018\u00010\u001c8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bn\u0010T\u001a\u0004\bo\u0010\u001e\"\u0004\bp\u0010HR*\u0010q\u001a\u00020\r2\u0006\u0010m\u001a\u00020\r8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bq\u0010s\"\u0004\bt\u00100R\u0014\u0010x\u001a\u00020u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010w\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006y"}, m3636d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestApplyChangesListener", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusDirection;", "Lkotlin/ParameterName;", "name", "focusDirection", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "", "onRequestFocusForOwner", "onMoveFocusInterop", "onClearFocusForOwner", "onFocusRectInterop", "Landroidx/compose/ui/unit/LayoutDirection;", "onLayoutDirection", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "forced", "refreshFocusEvents", "clearFocus", "(ZZ)Z", "invalidateOwnerFocusState", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "findFocusTargetNode", "()Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/Modifier$Node;", "lastLocalKeyInputNode", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "validateKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "validateKeyEvent", "requestFocusForOwner-7o62pno", "(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", "requestFocusForOwner", "takeFocus-aToIllA", "(ILandroidx/compose/ui/geometry/Rect;)Z", "takeFocus", "releaseFocus", "force", "(Z)V", "clearOwnerFocus", "clearFocus-I7lrPNg", "(ZZZI)Z", "moveFocus-3ESFkO8", "(I)Z", "moveFocus", "focusedRect", "onFound", "focusSearch-ULY8qGw", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "focusSearch", "onFocusedItem", "dispatchKeyEvent-YhN2O0w", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "dispatchKeyEvent", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "dispatchInterceptedSoftKeyboardEvent", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "event", "dispatchRotaryEvent", "(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;Lkotlin/jvm/functions/Function0;)Z", "node", "scheduleInvalidation", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", "scheduleInvalidationForOwner", "getFocusRect", "()Landroidx/compose/ui/geometry/Rect;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "getRootFocusNode$ui_release", "setRootFocusNode$ui_release", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "Landroidx/compose/ui/focus/FocusTransactionManager;", "focusTransactionManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "getFocusTransactionManager", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/collection/MutableLongSet;", "keysCurrentlyDown", "Landroidx/collection/MutableLongSet;", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/focus/FocusListener;", "listeners", "Landroidx/collection/MutableObjectList;", "getListeners", "()Landroidx/collection/MutableObjectList;", "value", "activeFocusTargetNode", "getActiveFocusTargetNode", "setActiveFocusTargetNode", "isFocusCaptured", "Z", "()Z", "setFocusCaptured", "Landroidx/compose/ui/focus/FocusState;", "getRootState", "()Landroidx/compose/ui/focus/FocusState;", "rootState", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements FocusOwner {
    private FocusTargetNode activeFocusTargetNode;
    private final FocusInvalidationManager focusInvalidationManager;
    private boolean isFocusCaptured;
    private LongSet3 keysCurrentlyDown;
    private final Function0<Unit> onClearFocusForOwner;
    private final Function0<Rect> onFocusRectInterop;
    private final Function0<LayoutDirection> onLayoutDirection;
    private final Function1<FocusDirection, Boolean> onMoveFocusInterop;
    private final Function2<FocusDirection, Rect, Boolean> onRequestFocusForOwner;
    private FocusTargetNode rootFocusNode = new FocusTargetNode(Focusability.INSTANCE.m6514getNeverLCbbffg(), null, null, 6, null);
    private final FocusTransactionManager focusTransactionManager = new FocusTransactionManager();
    private final Modifier modifier = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public boolean equals(Object other) {
            return other == this;
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        public void update(FocusTargetNode node) {
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        /* renamed from: create */
        public FocusTargetNode getNode() {
            return this.this$0.getRootFocusNode();
        }

        public int hashCode() {
            return this.this$0.getRootFocusNode().hashCode();
        }
    };
    private final ObjectList2<FocusListener> listeners = new ObjectList2<>(1);

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusTransactions.values().length];
            try {
                iArr[FocusTransactions.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusTransactions.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusTransactions.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusTransactions.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl(Function1<? super Function0<Unit>, Unit> function1, Function2<? super FocusDirection, ? super Rect, Boolean> function2, Function1<? super FocusDirection, Boolean> function12, Function0<Unit> function0, Function0<Rect> function02, Function0<? extends LayoutDirection> function03) {
        this.onRequestFocusForOwner = function2;
        this.onMoveFocusInterop = function12;
        this.onClearFocusForOwner = function0;
        this.onFocusRectInterop = function02;
        this.onLayoutDirection = function03;
        this.focusInvalidationManager = new FocusInvalidationManager(function1, new FocusOwnerImpl$focusInvalidationManager$1(this), new PropertyReference0Impl(this) { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusInvalidationManager$2
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((FocusOwnerImpl) this.receiver).getRootState();
            }
        }, new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusInvalidationManager$3
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((FocusOwnerImpl) this.receiver).getActiveFocusTargetNode();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((FocusOwnerImpl) this.receiver).setActiveFocusTargetNode((FocusTargetNode) obj);
            }
        });
    }

    /* renamed from: getRootFocusNode$ui_release, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    public FocusTransactionManager getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    public Modifier getModifier() {
        return this.modifier;
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int iM7381constructorimpl = NodeKind.m7381constructorimpl(1024) | NodeKind.m7381constructorimpl(8192);
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelper4.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        Modifier.Node node2 = null;
        if ((node.getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iM7381constructorimpl) != 0) {
                    if ((NodeKind.m7381constructorimpl(1024) & child.getKindSet()) != 0) {
                        return node2;
                    }
                    node2 = child;
                }
            }
        }
        return node2;
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    /* renamed from: requestFocusForOwner-7o62pno */
    public boolean mo6493requestFocusForOwner7o62pno(FocusDirection focusDirection, Rect previouslyFocusedRect) {
        return this.onRequestFocusForOwner.invoke(focusDirection, previouslyFocusedRect).booleanValue();
    }

    /* renamed from: takeFocus-aToIllA, reason: not valid java name */
    public boolean m6495takeFocusaToIllA(final int focusDirection, Rect previouslyFocusedRect) {
        Boolean boolMo6492focusSearchULY8qGw = mo6492focusSearchULY8qGw(focusDirection, previouslyFocusedRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.mo6500requestFocus3ESFkO8(focusDirection));
            }
        });
        if (boolMo6492focusSearchULY8qGw != null) {
            return boolMo6492focusSearchULY8qGw.booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    public void releaseFocus() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactions2.clearFocus(this.rootFocusNode, true, true);
            return;
        }
        FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
        if (!focusTransactionManager.getOngoingTransaction()) {
            try {
                focusTransactionManager.beginTransaction();
                FocusTransactions2.clearFocus(this.rootFocusNode, true, true);
                return;
            } finally {
                focusTransactionManager.commitTransaction();
            }
        }
        FocusTransactions2.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.p011ui.focus.FocusManager
    public void clearFocus(boolean force) {
        mo6489clearFocusI7lrPNg(force, true, true, FocusDirection.INSTANCE.m6480getExitdhqQ8s());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:16:0x0037, B:18:0x003d, B:21:0x0043, B:23:0x0048, B:25:0x0051, B:29:0x0065), top: B:37:0x0037 }] */
    @Override // androidx.compose.p011ui.focus.FocusOwner
    /* renamed from: clearFocus-I7lrPNg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo6489clearFocusI7lrPNg(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection) {
        boolean zClearFocus = false;
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
            FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 = new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
            try {
                if (focusTransactionManager.getOngoingTransaction()) {
                    focusTransactionManager.cancelTransaction();
                }
                focusTransactionManager.beginTransaction();
                if (focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 != null) {
                    focusTransactionManager.cancellationListener.add(focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1);
                }
                if (!force) {
                    int i = WhenMappings.$EnumSwitchMapping$0[FocusTransactions2.m6504performCustomClearFocusMxy_nc0(this.rootFocusNode, focusDirection).ordinal()];
                    if (i != 1 && i != 2 && i != 3) {
                        zClearFocus = FocusTransactions2.clearFocus(this.rootFocusNode, force, refreshFocusEvents);
                    }
                    focusTransactionManager.commitTransaction();
                }
            } catch (Throwable th) {
                focusTransactionManager.commitTransaction();
                throw th;
            }
        } else if (!force) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[FocusTransactions2.m6504performCustomClearFocusMxy_nc0(this.rootFocusNode, focusDirection).ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                zClearFocus = clearFocus(force, refreshFocusEvents);
            }
        } else {
            zClearFocus = clearFocus(force, refreshFocusEvents);
        }
        if (zClearFocus && clearOwnerFocus) {
            this.onClearFocusForOwner.invoke();
        }
        return zClearFocus;
    }

    private final boolean clearFocus(boolean forced, boolean refreshFocusEvents) {
        NodeChain nodes;
        if (getActiveFocusTargetNode() == null) {
            return true;
        }
        if (getIsFocusCaptured() && !forced) {
            return false;
        }
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        setActiveFocusTargetNode(null);
        if (refreshFocusEvents && activeFocusTargetNode != null) {
            activeFocusTargetNode.dispatchFocusCallbacks$ui_release(getIsFocusCaptured() ? FocusState2.Captured : FocusState2.Active, FocusState2.Inactive);
            int iM7381constructorimpl = NodeKind.m7381constructorimpl(1024);
            if (!activeFocusTargetNode.getNode().getIsAttached()) {
                InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent = activeFocusTargetNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNode2.requireLayoutNode(activeFocusTargetNode);
            while (layoutNodeRequireLayoutNode != null) {
                if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM7381constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            Modifier.Node nodePop = parent;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    ((FocusTargetNode) nodePop).dispatchFocusCallbacks$ui_release(FocusState2.ActiveParent, FocusState2.Inactive);
                                } else if ((nodePop.getKindSet() & iM7381constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i = 0;
                                    for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & iM7381constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                nodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                nodePop = DelegatableNode2.pop(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.p011ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo6487moveFocus3ESFkO8(final int focusDirection) {
        if (ComposeUiFlags.isViewFocusFixEnabled && this.onMoveFocusInterop.invoke(FocusDirection.m6471boximpl(focusDirection)).booleanValue()) {
            return true;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Boolean.FALSE;
        int generation = getFocusTransactionManager().getGeneration();
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        Boolean boolMo6492focusSearchULY8qGw = mo6492focusSearchULY8qGw(focusDirection, this.onFocusRectInterop.invoke(), new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                objectRef.element = Boolean.valueOf(focusTargetNode.mo6500requestFocus3ESFkO8(focusDirection));
                Boolean bool = objectRef.element;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        });
        int generation2 = getFocusTransactionManager().getGeneration();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(boolMo6492focusSearchULY8qGw, bool) && (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != getActiveFocusTargetNode()))) {
            return true;
        }
        if (boolMo6492focusSearchULY8qGw != null && objectRef.element != 0) {
            if (Intrinsics.areEqual(boolMo6492focusSearchULY8qGw, bool) && Intrinsics.areEqual(objectRef.element, bool)) {
                return true;
            }
            if (FocusOwnerImplKt.m6496is1dFocusSearch3ESFkO8(focusDirection)) {
                return mo6489clearFocusI7lrPNg(false, true, false, focusDirection) && m6495takeFocusaToIllA(focusDirection, null);
            }
            if (!ComposeUiFlags.isViewFocusFixEnabled && this.onMoveFocusInterop.invoke(FocusDirection.m6471boximpl(focusDirection)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    /* renamed from: focusSearch-ULY8qGw */
    public Boolean mo6492focusSearchULY8qGw(int focusDirection, Rect focusedRect, final Function1<? super FocusTargetNode, Boolean> onFound) {
        final FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
        if (focusTargetNodeFindFocusTargetNode != null) {
            FocusRequester focusRequesterM6508customFocusSearchOMvw8 = FocusTraversal.m6508customFocusSearchOMvw8(focusTargetNodeFindFocusTargetNode, focusDirection, this.onLayoutDirection.invoke());
            FocusRequester.Companion companion = FocusRequester.INSTANCE;
            if (Intrinsics.areEqual(focusRequesterM6508customFocusSearchOMvw8, companion.getCancel())) {
                return null;
            }
            if (Intrinsics.areEqual(focusRequesterM6508customFocusSearchOMvw8, companion.getRedirect$ui_release())) {
                FocusTargetNode focusTargetNodeFindFocusTargetNode2 = findFocusTargetNode();
                if (focusTargetNodeFindFocusTargetNode2 != null) {
                    return onFound.invoke(focusTargetNodeFindFocusTargetNode2);
                }
                return null;
            }
            if (!Intrinsics.areEqual(focusRequesterM6508customFocusSearchOMvw8, companion.getDefault())) {
                return Boolean.valueOf(focusRequesterM6508customFocusSearchOMvw8.findFocusTargetNode$ui_release(onFound));
            }
        } else {
            focusTargetNodeFindFocusTargetNode = null;
        }
        return FocusTraversal.m6509focusSearch0X8WOeE(this.rootFocusNode, focusDirection, this.onLayoutDirection.invoke(), focusedRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                boolean zBooleanValue;
                if (Intrinsics.areEqual(focusTargetNode, focusTargetNodeFindFocusTargetNode)) {
                    zBooleanValue = false;
                } else {
                    if (Intrinsics.areEqual(focusTargetNode, this.getRootFocusNode())) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = onFound.invoke(focusTargetNode).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e1 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0039, B:114:0x0189, B:116:0x0197, B:117:0x019a, B:119:0x01a9, B:122:0x01ba, B:126:0x01c5, B:129:0x01cb, B:130:0x01d0, B:150:0x0210, B:131:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e9, B:139:0x01f0, B:143:0x01f8, B:145:0x0201, B:146:0x0205, B:147:0x0208, B:151:0x0215, B:152:0x021a, B:154:0x0220, B:156:0x0226, B:159:0x0231, B:161:0x0239, B:168:0x0250, B:169:0x0252, B:170:0x0262, B:172:0x0266, B:174:0x026a, B:201:0x02c7, B:178:0x0276, B:180:0x027f, B:182:0x0285, B:184:0x028e, B:186:0x0295, B:188:0x0299, B:189:0x029c, B:191:0x02a2, B:192:0x02a9, B:194:0x02b1, B:195:0x02b6, B:197:0x02bc, B:198:0x02bf, B:202:0x02d2, B:206:0x02e2, B:207:0x02f2, B:209:0x02f6, B:211:0x02fa, B:238:0x0357, B:215:0x0306, B:217:0x030f, B:219:0x0315, B:221:0x031e, B:223:0x0325, B:225:0x0329, B:226:0x032c, B:228:0x0332, B:229:0x0339, B:231:0x0341, B:232:0x0346, B:234:0x034c, B:235:0x034f, B:240:0x0364, B:242:0x036b, B:247:0x037e, B:248:0x0380, B:20:0x0041, B:22:0x004f, B:23:0x0052, B:25:0x005c, B:28:0x006d, B:32:0x0078, B:63:0x00d7, B:65:0x00db, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:47:0x00a1, B:49:0x00aa, B:50:0x00ae, B:51:0x00b1, B:54:0x00b9, B:55:0x00be, B:56:0x00c3, B:58:0x00c9, B:60:0x00cf, B:66:0x00e1, B:68:0x00f1, B:69:0x00f4, B:71:0x0102, B:74:0x0113, B:78:0x011e, B:109:0x017d, B:111:0x0181, B:81:0x0123, B:83:0x012a, B:85:0x012e, B:87:0x0138, B:89:0x013f, B:93:0x0147, B:95:0x0150, B:96:0x0154, B:97:0x0157, B:100:0x015f, B:101:0x0164, B:102:0x0169, B:104:0x016f, B:106:0x0175), top: B:253:0x0009 }] */
    /* JADX WARN: Type inference failed for: r12v20, types: [T, androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r13v25, types: [T, androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r4v18, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v25, types: [T, androidx.compose.ui.Modifier$Node, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v38, types: [T, androidx.compose.ui.Modifier$Node, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.p011ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-YhN2O0w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo6491dispatchKeyEventYhN2O0w(KeyEvent keyEvent, Function0<Boolean> onFocusedItem) {
        Object obj;
        Modifier.Node node;
        NodeChain nodes;
        Object obj2;
        NodeChain nodes2;
        NodeChain nodes3;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.focusInvalidationManager.hasPendingInvalidation()) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!m6494validateKeyEventZmokQxo(keyEvent)) {
                return false;
            }
            FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
            if (focusTargetNodeFindFocusTargetNode == null || (node = lastLocalKeyInputNode(focusTargetNodeFindFocusTargetNode)) == null) {
                if (focusTargetNodeFindFocusTargetNode != null) {
                    int iM7381constructorimpl = NodeKind.m7381constructorimpl(8192);
                    if (!focusTargetNodeFindFocusTargetNode.getNode().getIsAttached()) {
                        InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
                    }
                    Modifier.Node node2 = focusTargetNodeFindFocusTargetNode.getNode();
                    LayoutNode layoutNodeRequireLayoutNode = DelegatableNode2.requireLayoutNode(focusTargetNodeFindFocusTargetNode);
                    loop10: while (true) {
                        if (layoutNodeRequireLayoutNode == null) {
                            obj2 = null;
                            break;
                        }
                        if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
                            while (node2 != null) {
                                if ((node2.getKindSet() & iM7381constructorimpl) != 0) {
                                    MutableVector mutableVector = null;
                                    Modifier.Node nodePop = node2;
                                    while (nodePop != null) {
                                        if (nodePop instanceof KeyInputModifierNode) {
                                            obj2 = nodePop;
                                            break loop10;
                                        }
                                        if ((nodePop.getKindSet() & iM7381constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                            Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate();
                                            int i = 0;
                                            nodePop = nodePop;
                                            while (delegate != null) {
                                                if ((delegate.getKindSet() & iM7381constructorimpl) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        nodePop = delegate;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (nodePop != null) {
                                                            mutableVector.add(nodePop);
                                                            nodePop = null;
                                                        }
                                                        mutableVector.add(delegate);
                                                    }
                                                }
                                                delegate = delegate.getChild();
                                                nodePop = nodePop;
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        nodePop = DelegatableNode2.pop(mutableVector);
                                    }
                                }
                                node2 = node2.getParent();
                            }
                        }
                        layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                        node2 = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
                    }
                    KeyInputModifierNode keyInputModifierNode = (KeyInputModifierNode) obj2;
                    if (keyInputModifierNode != null) {
                        node = keyInputModifierNode.getNode();
                    } else {
                        FocusTargetNode focusTargetNode = this.rootFocusNode;
                        int iM7381constructorimpl2 = NodeKind.m7381constructorimpl(8192);
                        if (!focusTargetNode.getNode().getIsAttached()) {
                            InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
                        }
                        Modifier.Node parent = focusTargetNode.getNode().getParent();
                        LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNode2.requireLayoutNode(focusTargetNode);
                        loop14: while (true) {
                            if (layoutNodeRequireLayoutNode2 == null) {
                                obj = null;
                                break;
                            }
                            if ((layoutNodeRequireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl2) != 0) {
                                while (parent != null) {
                                    if ((parent.getKindSet() & iM7381constructorimpl2) != 0) {
                                        MutableVector mutableVector2 = null;
                                        Modifier.Node nodePop2 = parent;
                                        while (nodePop2 != null) {
                                            if (nodePop2 instanceof KeyInputModifierNode) {
                                                obj = nodePop2;
                                                break loop14;
                                            }
                                            if ((nodePop2.getKindSet() & iM7381constructorimpl2) != 0 && (nodePop2 instanceof DelegatingNode)) {
                                                Modifier.Node delegate2 = ((DelegatingNode) nodePop2).getDelegate();
                                                int i2 = 0;
                                                nodePop2 = nodePop2;
                                                while (delegate2 != null) {
                                                    if ((delegate2.getKindSet() & iM7381constructorimpl2) != 0) {
                                                        i2++;
                                                        if (i2 == 1) {
                                                            nodePop2 = delegate2;
                                                        } else {
                                                            if (mutableVector2 == null) {
                                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                            }
                                                            if (nodePop2 != null) {
                                                                mutableVector2.add(nodePop2);
                                                                nodePop2 = null;
                                                            }
                                                            mutableVector2.add(delegate2);
                                                        }
                                                    }
                                                    delegate2 = delegate2.getChild();
                                                    nodePop2 = nodePop2;
                                                }
                                                if (i2 == 1) {
                                                }
                                            }
                                            nodePop2 = DelegatableNode2.pop(mutableVector2);
                                        }
                                    }
                                    parent = parent.getParent();
                                }
                            }
                            layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                            parent = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
                        }
                        KeyInputModifierNode keyInputModifierNode2 = (KeyInputModifierNode) obj;
                        node = keyInputModifierNode2 != null ? keyInputModifierNode2.getNode() : null;
                    }
                }
            }
            if (node != null) {
                int iM7381constructorimpl3 = NodeKind.m7381constructorimpl(8192);
                if (!node.getNode().getIsAttached()) {
                    InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent2 = node.getNode().getParent();
                LayoutNode layoutNodeRequireLayoutNode3 = DelegatableNode2.requireLayoutNode(node);
                ArrayList arrayList = null;
                while (layoutNodeRequireLayoutNode3 != null) {
                    if ((layoutNodeRequireLayoutNode3.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl3) != 0) {
                        while (parent2 != null) {
                            if ((parent2.getKindSet() & iM7381constructorimpl3) != 0) {
                                Modifier.Node nodePop3 = parent2;
                                MutableVector mutableVector3 = null;
                                while (nodePop3 != null) {
                                    if (nodePop3 instanceof KeyInputModifierNode) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(nodePop3);
                                    } else if ((nodePop3.getKindSet() & iM7381constructorimpl3) != 0 && (nodePop3 instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node delegate3 = ((DelegatingNode) nodePop3).getDelegate(); delegate3 != null; delegate3 = delegate3.getChild()) {
                                            if ((delegate3.getKindSet() & iM7381constructorimpl3) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    nodePop3 = delegate3;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodePop3 != null) {
                                                        mutableVector3.add(nodePop3);
                                                        nodePop3 = null;
                                                    }
                                                    mutableVector3.add(delegate3);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    nodePop3 = DelegatableNode2.pop(mutableVector3);
                                }
                            }
                            parent2 = parent2.getParent();
                        }
                    }
                    layoutNodeRequireLayoutNode3 = layoutNodeRequireLayoutNode3.getParent$ui_release();
                    parent2 = (layoutNodeRequireLayoutNode3 == null || (nodes3 = layoutNodeRequireLayoutNode3.getNodes()) == null) ? null : nodes3.getTail();
                }
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i4 = size - 1;
                            if (((KeyInputModifierNode) arrayList.get(size)).mo4852onPreKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size = i4;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
                ?? node3 = node.getNode();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = node3;
                while (true) {
                    T t = objectRef2.element;
                    if (t != 0) {
                        if (t instanceof KeyInputModifierNode) {
                            if (((KeyInputModifierNode) t).mo4852onPreKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                        } else if ((((Modifier.Node) t).getKindSet() & iM7381constructorimpl3) != 0) {
                            T t2 = objectRef2.element;
                            if (t2 instanceof DelegatingNode) {
                                int i5 = 0;
                                for (?? delegate4 = ((DelegatingNode) t2).getDelegate(); delegate4 != 0; delegate4 = delegate4.getChild()) {
                                    if ((delegate4.getKindSet() & iM7381constructorimpl3) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            objectRef2.element = delegate4;
                                        } else {
                                            MutableVector mutableVector4 = (MutableVector) objectRef.element;
                                            ?? mutableVector5 = mutableVector4;
                                            if (mutableVector4 == null) {
                                                mutableVector5 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            objectRef.element = mutableVector5;
                                            Modifier.Node node4 = (Modifier.Node) objectRef2.element;
                                            if (node4 != null) {
                                                mutableVector5.add(node4);
                                                objectRef2.element = null;
                                            }
                                            MutableVector mutableVector6 = (MutableVector) objectRef.element;
                                            if (mutableVector6 != null) {
                                                mutableVector6.add(delegate4);
                                            }
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                        }
                        objectRef2.element = DelegatableNode2.pop((MutableVector) objectRef.element);
                    } else {
                        if (onFocusedItem.invoke().booleanValue()) {
                            return true;
                        }
                        ?? node5 = node.getNode();
                        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                        objectRef4.element = node5;
                        while (true) {
                            T t3 = objectRef4.element;
                            if (t3 != 0) {
                                if (t3 instanceof KeyInputModifierNode) {
                                    if (((KeyInputModifierNode) t3).mo4850onKeyEventZmokQxo(keyEvent)) {
                                        return true;
                                    }
                                } else if ((((Modifier.Node) t3).getKindSet() & iM7381constructorimpl3) != 0) {
                                    T t4 = objectRef4.element;
                                    if (t4 instanceof DelegatingNode) {
                                        int i6 = 0;
                                        for (?? delegate5 = ((DelegatingNode) t4).getDelegate(); delegate5 != 0; delegate5 = delegate5.getChild()) {
                                            if ((delegate5.getKindSet() & iM7381constructorimpl3) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    objectRef4.element = delegate5;
                                                } else {
                                                    MutableVector mutableVector7 = (MutableVector) objectRef3.element;
                                                    ?? mutableVector8 = mutableVector7;
                                                    if (mutableVector7 == null) {
                                                        mutableVector8 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    objectRef3.element = mutableVector8;
                                                    Modifier.Node node6 = (Modifier.Node) objectRef4.element;
                                                    if (node6 != null) {
                                                        mutableVector8.add(node6);
                                                        objectRef4.element = null;
                                                    }
                                                    MutableVector mutableVector9 = (MutableVector) objectRef3.element;
                                                    if (mutableVector9 != null) {
                                                        mutableVector9.add(delegate5);
                                                    }
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                }
                                objectRef4.element = DelegatableNode2.pop((MutableVector) objectRef3.element);
                            } else {
                                if (arrayList != null) {
                                    int size2 = arrayList.size();
                                    for (int i7 = 0; i7 < size2; i7++) {
                                        if (((KeyInputModifierNode) arrayList.get(i7)).mo4850onKeyEventZmokQxo(keyEvent)) {
                                            return true;
                                        }
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                Unit unit3 = Unit.INSTANCE;
                            }
                        }
                    }
                }
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.compose.p011ui.focus.FocusOwner
    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo6490dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        NodeChain nodes;
        DelegatingNode delegatingNodePop;
        NodeChain nodes2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversal.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            int iM7381constructorimpl = NodeKind.m7381constructorimpl(131072);
            if (!focusTargetNodeFindActiveFocusNode.getNode().getIsAttached()) {
                InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNodeFindActiveFocusNode.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNode2.requireLayoutNode(focusTargetNodeFindActiveFocusNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    delegatingNodePop = 0;
                    break;
                }
                if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & iM7381constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNodePop = node;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof SoftKeyboardInterceptionModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNodePop.getKindSet() & iM7381constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                                    int i = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM7381constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                delegatingNodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNode2.pop(mutableVector);
                            }
                        }
                        node = node.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                node = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) delegatingNodePop;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            int iM7381constructorimpl2 = NodeKind.m7381constructorimpl(131072);
            if (!softKeyboardInterceptionModifierNode.getNode().getIsAttached()) {
                InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent = softKeyboardInterceptionModifierNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNode2.requireLayoutNode(softKeyboardInterceptionModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((layoutNodeRequireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM7381constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent;
                            MutableVector mutableVector2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                } else if ((nodePop.getKindSet() & iM7381constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate2 = ((DelegatingNode) nodePop).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & iM7381constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector2.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector2.add(delegate2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodePop = DelegatableNode2.pop(mutableVector2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(size)).m7125onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            DelegatingNode node2 = softKeyboardInterceptionModifierNode.getNode();
            MutableVector mutableVector3 = null;
            while (node2 != 0) {
                if (node2 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node2).m7125onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & iM7381constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                    Modifier.Node delegate3 = node2.getDelegate();
                    int i4 = 0;
                    node2 = node2;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & iM7381constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node2 = delegate3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node2 != 0) {
                                    mutableVector3.add(node2);
                                    node2 = 0;
                                }
                                mutableVector3.add(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node2 = node2;
                    }
                    if (i4 == 1) {
                    }
                }
                node2 = DelegatableNode2.pop(mutableVector3);
            }
            DelegatingNode node3 = softKeyboardInterceptionModifierNode.getNode();
            MutableVector mutableVector4 = null;
            while (node3 != 0) {
                if (node3 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node3).m7124onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & iM7381constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate4 = node3.getDelegate();
                    int i5 = 0;
                    node3 = node3;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & iM7381constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node3 = delegate4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    mutableVector4.add(node3);
                                    node3 = 0;
                                }
                                mutableVector4.add(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node3 = node3;
                    }
                    if (i5 == 1) {
                    }
                }
                node3 = DelegatableNode2.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i6)).m7124onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.p011ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(RotaryScrollEvent event, Function0<Boolean> onFocusedItem) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        NodeChain nodes;
        DelegatingNode delegatingNodePop;
        NodeChain nodes2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
        if (focusTargetNodeFindFocusTargetNode != null) {
            int iM7381constructorimpl = NodeKind.m7381constructorimpl(16384);
            if (!focusTargetNodeFindFocusTargetNode.getNode().getIsAttached()) {
                InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNodeFindFocusTargetNode.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNode2.requireLayoutNode(focusTargetNodeFindFocusTargetNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    delegatingNodePop = 0;
                    break;
                }
                if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & iM7381constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNodePop = node;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof RotaryInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNodePop.getKindSet() & iM7381constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                                    int i = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM7381constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                delegatingNodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNode2.pop(mutableVector);
                            }
                        }
                        node = node.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                node = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) delegatingNodePop;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            int iM7381constructorimpl2 = NodeKind.m7381constructorimpl(16384);
            if (!rotaryInputModifierNode.getNode().getIsAttached()) {
                InlineClassHelper4.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent = rotaryInputModifierNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNode2.requireLayoutNode(rotaryInputModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((layoutNodeRequireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & iM7381constructorimpl2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM7381constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent;
                            MutableVector mutableVector2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                } else if ((nodePop.getKindSet() & iM7381constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate2 = ((DelegatingNode) nodePop).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & iM7381constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector2.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector2.add(delegate2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodePop = DelegatableNode2.pop(mutableVector2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((RotaryInputModifierNode) arrayList.get(size)).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            DelegatingNode node2 = rotaryInputModifierNode.getNode();
            MutableVector mutableVector3 = null;
            while (node2 != 0) {
                if (node2 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node2).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & iM7381constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                    Modifier.Node delegate3 = node2.getDelegate();
                    int i4 = 0;
                    node2 = node2;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & iM7381constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node2 = delegate3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node2 != 0) {
                                    mutableVector3.add(node2);
                                    node2 = 0;
                                }
                                mutableVector3.add(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node2 = node2;
                    }
                    if (i4 == 1) {
                    }
                }
                node2 = DelegatableNode2.pop(mutableVector3);
            }
            if (onFocusedItem.invoke().booleanValue()) {
                return true;
            }
            DelegatingNode node3 = rotaryInputModifierNode.getNode();
            MutableVector mutableVector4 = null;
            while (node3 != 0) {
                if (node3 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node3).onRotaryScrollEvent(event)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & iM7381constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate4 = node3.getDelegate();
                    int i5 = 0;
                    node3 = node3;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & iM7381constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node3 = delegate4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    mutableVector4.add(node3);
                                    node3 = 0;
                                }
                                mutableVector4.add(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node3 = node3;
                    }
                    if (i5 == 1) {
                    }
                }
                node3 = DelegatableNode2.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((RotaryInputModifierNode) arrayList.get(i6)).onRotaryScrollEvent(event)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    public void scheduleInvalidation(FocusTargetNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    public void scheduleInvalidation(FocusEventModifierNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    public void scheduleInvalidation(FocusPropertiesModifierNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    public void scheduleInvalidationForOwner() {
        this.focusInvalidationManager.scheduleInvalidationForOwner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOwnerFocusState() {
        if ((ComposeUiFlags.isTrackFocusEnabled && getActiveFocusTargetNode() == null) || this.rootFocusNode.getFocusState() == FocusState2.Inactive) {
            this.onClearFocusForOwner.invoke();
        }
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    public Rect getFocusRect() {
        FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
        if (focusTargetNodeFindFocusTargetNode != null) {
            return FocusTraversal.focusRect(focusTargetNodeFindFocusTargetNode);
        }
        return null;
    }

    private final FocusTargetNode findFocusTargetNode() {
        return FocusTraversal.findActiveFocusNode(this.rootFocusNode);
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    public FocusState getRootState() {
        return this.rootFocusNode.getFocusState();
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    public ObjectList2<FocusListener> getListeners() {
        return this.listeners;
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    public FocusTargetNode getActiveFocusTargetNode() {
        return this.activeFocusTargetNode;
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    public void setActiveFocusTargetNode(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.activeFocusTargetNode;
        this.activeFocusTargetNode = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            setFocusCaptured(false);
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled) {
            ObjectList2<FocusListener> listeners = getListeners();
            Object[] objArr = listeners.content;
            int i = listeners._size;
            for (int i2 = 0; i2 < i; i2++) {
                ((FocusListener) objArr[i2]).onFocusChanged(focusTargetNode2, focusTargetNode);
            }
        }
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    /* renamed from: isFocusCaptured, reason: from getter */
    public boolean getIsFocusCaptured() {
        return this.isFocusCaptured;
    }

    @Override // androidx.compose.p011ui.focus.FocusOwner
    public void setFocusCaptured(boolean z) {
        if (!((z && getActiveFocusTargetNode() == null) ? false : true)) {
            InlineClassHelper4.throwIllegalArgumentException("Cannot capture focus when the active focus target node is unset");
        }
        this.isFocusCaptured = z;
    }

    /* renamed from: validateKeyEvent-ZmokQxo, reason: not valid java name */
    private final boolean m6494validateKeyEventZmokQxo(KeyEvent keyEvent) {
        long jM7117getKeyZmokQxo = KeyEvent_androidKt.m7117getKeyZmokQxo(keyEvent);
        int iM7118getTypeZmokQxo = KeyEvent_androidKt.m7118getTypeZmokQxo(keyEvent);
        KeyEvent2.Companion companion = KeyEvent2.INSTANCE;
        if (KeyEvent2.m7113equalsimpl0(iM7118getTypeZmokQxo, companion.m7114getKeyDownCS__XNY())) {
            LongSet3 longSet3 = this.keysCurrentlyDown;
            if (longSet3 == null) {
                longSet3 = new LongSet3(3);
                this.keysCurrentlyDown = longSet3;
            }
            longSet3.plusAssign(jM7117getKeyZmokQxo);
        } else if (KeyEvent2.m7113equalsimpl0(iM7118getTypeZmokQxo, companion.m7115getKeyUpCS__XNY())) {
            LongSet3 longSet32 = this.keysCurrentlyDown;
            if (longSet32 == null || !longSet32.contains(jM7117getKeyZmokQxo)) {
                return false;
            }
            LongSet3 longSet33 = this.keysCurrentlyDown;
            if (longSet33 != null) {
                longSet33.remove(jM7117getKeyZmokQxo);
            }
        }
        return true;
    }
}

package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMap2;
import androidx.collection.LongObjectMap3;
import androidx.compose.foundation.gestures.TapGestureDetector2;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.HoverInteraction2;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p011ui.focus.Focusability;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import androidx.compose.p011ui.input.key.KeyInputModifierNode;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerEventType;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.PointerInputModifierNode;
import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.compose.p011ui.node.SemanticsModifierNode2;
import androidx.compose.p011ui.node.TraversableNode;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: Clickable.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 a2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001aBC\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\u0010\u0013J\b\u00102\u001a\u00020\u000bH\u0002J\b\u00103\u001a\u00020\u0012H\u0004J\b\u00104\u001a\u00020\u0012H\u0002J\b\u00105\u001a\u00020\u0012H\u0002J\b\u00106\u001a\u00020\u0012H\u0002J\u0006\u00107\u001a\u00020\u0012J\b\u00108\u001a\u00020\u0012H\u0014J\u0006\u00109\u001a\u00020\u0012J\u001a\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<H$ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001a\u0010?\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<H$ø\u0001\u0000¢\u0006\u0004\b@\u0010>J\u0006\u0010A\u001a\u00020\u0012J\u0010\u0010B\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u000bH\u0002J\u0018\u0010D\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<ø\u0001\u0000¢\u0006\u0004\bE\u0010>J(\u0010F\u001a\u00020\u00122\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020Lø\u0001\u0000¢\u0006\u0004\bM\u0010NJ\u0018\u0010O\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<ø\u0001\u0000¢\u0006\u0004\bP\u0010>J\u000f\u0010Q\u001a\u0004\u0018\u00010\u0012H\u0004¢\u0006\u0002\u0010RJ\b\u0010S\u001a\u00020\u000bH\u0002JN\u0010T\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0004ø\u0001\u0000¢\u0006\u0002\bUJ\f\u0010V\u001a\u00020\u0012*\u00020WH\u0016J\n\u0010X\u001a\u00020\u0012*\u00020WJ\u0012\u0010Y\u001a\u00020\u0012*\u00020ZH¦@¢\u0006\u0002\u0010[J\u001f\u0010\\\u001a\u00020\u0012*\u00020]2\u0006\u0010^\u001a\u00020\u0015H\u0084@ø\u0001\u0000¢\u0006\u0004\b_\u0010`R\u0016\u0010\u0014\u001a\u00020\u0015X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010+\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001cR\u0014\u0010-\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0010\u00101\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, m3636d2 = {"Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indicationNodeFactory", "Landroidx/compose/foundation/IndicationNodeFactory;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "centerOffset", "Landroidx/compose/ui/geometry/Offset;", "J", "currentKeyPressInteractions", "Landroidx/collection/MutableLongObjectMap;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "<set-?>", "getEnabled", "()Z", "focusableNode", "Landroidx/compose/foundation/FocusableNode;", "hoverInteraction", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "indicationNode", "Landroidx/compose/ui/node/DelegatableNode;", "lazilyCreateIndication", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pressInteraction", "shouldAutoInvalidate", "getShouldAutoInvalidate", "shouldMergeDescendantSemantics", "getShouldMergeDescendantSemantics", "traverseKey", "", "getTraverseKey", "()Ljava/lang/Object;", "userProvidedInteractionSource", "delayPressInteraction", "disposeInteractions", "emitHoverEnter", "emitHoverExit", "initializeIndicationAndInteractionSourceIfNeeded", "onAttach", "onCancelKeyInput", "onCancelPointerInput", "onClickKeyDownEvent", "event", "Landroidx/compose/ui/input/key/KeyEvent;", "onClickKeyDownEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onClickKeyUpEvent", "onClickKeyUpEvent-ZmokQxo", "onDetach", "onFocusChange", "isFocused", "onKeyEvent", "onKeyEvent-ZmokQxo", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPreKeyEvent", "onPreKeyEvent-ZmokQxo", "resetPointerInputHandler", "()Lkotlin/Unit;", "shouldLazilyCreateIndication", "updateCommon", "updateCommon-QzZPfjk", "applyAdditionalSemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "clickPointerInput", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handlePressInteraction", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "handlePressInteraction-d-4ec7I", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TraverseKey", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, SemanticsModifierNode, TraversableNode {
    private long centerOffset;
    private final LongObjectMap3<PressInteraction.Press> currentKeyPressInteractions;
    private boolean enabled;
    private final Focusable3 focusableNode;
    private HoverInteraction hoverInteraction;
    private DelegatableNode indicationNode;
    private IndicationNodeFactory indicationNodeFactory;
    private InteractionSource3 interactionSource;
    private boolean lazilyCreateIndication;
    private Function0<Unit> onClick;
    private String onClickLabel;
    private SuspendingPointerInputModifierNode pointerInputNode;
    private PressInteraction.Press pressInteraction;
    private Role role;
    private final boolean shouldAutoInvalidate;
    private final Object traverseKey;
    private InteractionSource3 userProvidedInteractionSource;

    /* renamed from: TraverseKey, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ AbstractClickableNode(InteractionSource3 interactionSource3, IndicationNodeFactory indicationNodeFactory, boolean z, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource3, indicationNodeFactory, z, str, role, function0);
    }

    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public abstract Object clickPointerInput(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation);

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    /* renamed from: getShouldMergeDescendantSemantics */
    public final boolean getMergeDescendants() {
        return true;
    }

    protected void onCancelKeyInput() {
    }

    /* renamed from: onClickKeyDownEvent-ZmokQxo, reason: not valid java name */
    protected abstract boolean mo4848onClickKeyDownEventZmokQxo(KeyEvent event);

    /* renamed from: onClickKeyUpEvent-ZmokQxo, reason: not valid java name */
    protected abstract boolean mo4849onClickKeyUpEventZmokQxo(KeyEvent event);

    @Override // androidx.compose.p011ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo4852onPreKeyEventZmokQxo(KeyEvent event) {
        return false;
    }

    private AbstractClickableNode(InteractionSource3 interactionSource3, IndicationNodeFactory indicationNodeFactory, boolean z, String str, Role role, Function0<Unit> function0) {
        this.interactionSource = interactionSource3;
        this.indicationNodeFactory = indicationNodeFactory;
        this.onClickLabel = str;
        this.role = role;
        this.enabled = z;
        this.onClick = function0;
        this.focusableNode = new Focusable3(this.interactionSource, Focusability.INSTANCE.m6515getSystemDefinedLCbbffg(), new AbstractClickableNode$focusableNode$1(this), null);
        this.currentKeyPressInteractions = LongObjectMap2.mutableLongObjectMapOf();
        this.centerOffset = Offset.INSTANCE.m6553getZeroF1C5BW0();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = shouldLazilyCreateIndication();
        this.traverseKey = INSTANCE;
    }

    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    private final boolean shouldLazilyCreateIndication() {
        return this.userProvidedInteractionSource == null && this.indicationNodeFactory != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* renamed from: updateCommon-QzZPfjk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void m4853updateCommonQzZPfjk(InteractionSource3 interactionSource, IndicationNodeFactory indicationNodeFactory, boolean enabled, String onClickLabel, Role role, Function0<Unit> onClick) {
        boolean z;
        boolean z2;
        DelegatableNode delegatableNode;
        if (Intrinsics.areEqual(this.userProvidedInteractionSource, interactionSource)) {
            z = false;
        } else {
            disposeInteractions();
            this.userProvidedInteractionSource = interactionSource;
            this.interactionSource = interactionSource;
            z = true;
        }
        if (!Intrinsics.areEqual(this.indicationNodeFactory, indicationNodeFactory)) {
            this.indicationNodeFactory = indicationNodeFactory;
            z = true;
        }
        if (this.enabled != enabled) {
            if (enabled) {
                delegate(this.focusableNode);
            } else {
                undelegate(this.focusableNode);
                disposeInteractions();
            }
            SemanticsModifierNode2.invalidateSemantics(this);
            this.enabled = enabled;
        }
        if (!Intrinsics.areEqual(this.onClickLabel, onClickLabel)) {
            this.onClickLabel = onClickLabel;
            SemanticsModifierNode2.invalidateSemantics(this);
        }
        if (!Intrinsics.areEqual(this.role, role)) {
            this.role = role;
            SemanticsModifierNode2.invalidateSemantics(this);
        }
        this.onClick = onClick;
        if (this.lazilyCreateIndication != shouldLazilyCreateIndication()) {
            boolean zShouldLazilyCreateIndication = shouldLazilyCreateIndication();
            this.lazilyCreateIndication = zShouldLazilyCreateIndication;
            z2 = (zShouldLazilyCreateIndication || this.indicationNode != null) ? z : true;
        }
        if (z2 && ((delegatableNode = this.indicationNode) != null || !this.lazilyCreateIndication)) {
            if (delegatableNode != null) {
                undelegate(delegatableNode);
            }
            this.indicationNode = null;
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        this.focusableNode.update(this.interactionSource);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        if (!this.lazilyCreateIndication) {
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        if (this.enabled) {
            delegate(this.focusableNode);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        disposeInteractions();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        DelegatableNode delegatableNode = this.indicationNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.indicationNode = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void disposeInteractions() {
        InteractionSource3 interactionSource3 = this.interactionSource;
        if (interactionSource3 != null) {
            PressInteraction.Press press = this.pressInteraction;
            if (press != null) {
                interactionSource3.tryEmit(new PressInteraction.Cancel(press));
            }
            HoverInteraction hoverInteraction = this.hoverInteraction;
            if (hoverInteraction != null) {
                interactionSource3.tryEmit(new HoverInteraction2(hoverInteraction));
            }
            LongObjectMap3<PressInteraction.Press> longObjectMap3 = this.currentKeyPressInteractions;
            Object[] objArr = longObjectMap3.values;
            long[] jArr = longObjectMap3.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                interactionSource3.tryEmit(new PressInteraction.Cancel((PressInteraction.Press) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.pressInteraction = null;
        this.hoverInteraction = null;
        this.currentKeyPressInteractions.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFocusChange(boolean isFocused) {
        if (isFocused) {
            initializeIndicationAndInteractionSourceIfNeeded();
            return;
        }
        if (this.interactionSource != null) {
            LongObjectMap3<PressInteraction.Press> longObjectMap3 = this.currentKeyPressInteractions;
            Object[] objArr = longObjectMap3.values;
            long[] jArr = longObjectMap3.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onFocusChange$1$1(this, (PressInteraction.Press) objArr[(i << 3) + i3], null), 3, null);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.currentKeyPressInteractions.clear();
        onCancelKeyInput();
    }

    private final void initializeIndicationAndInteractionSourceIfNeeded() {
        IndicationNodeFactory indicationNodeFactory;
        if (this.indicationNode == null && (indicationNodeFactory = this.indicationNodeFactory) != null) {
            if (this.interactionSource == null) {
                this.interactionSource = InteractionSource2.MutableInteractionSource();
            }
            this.focusableNode.update(this.interactionSource);
            InteractionSource3 interactionSource3 = this.interactionSource;
            Intrinsics.checkNotNull(interactionSource3);
            DelegatableNode delegatableNodeCreate = indicationNodeFactory.create(interactionSource3);
            delegate(delegatableNodeCreate);
            this.indicationNode = delegatableNodeCreate;
        }
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void mo4851onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        long jM8065getCenterozmzZPI = IntSize2.m8065getCenterozmzZPI(bounds);
        float fM8038getXimpl = IntOffset.m8038getXimpl(jM8065getCenterozmzZPI);
        float fM8039getYimpl = IntOffset.m8039getYimpl(jM8065getCenterozmzZPI);
        this.centerOffset = Offset.m6535constructorimpl((Float.floatToRawIntBits(fM8038getXimpl) << 32) | (Float.floatToRawIntBits(fM8039getYimpl) & 4294967295L));
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled && pass == PointerEventPass.Main) {
            int type2 = pointerEvent.getType();
            PointerEventType.Companion companion = PointerEventType.INSTANCE;
            if (PointerEventType.m7156equalsimpl0(type2, companion.m7157getEnter7fucELk())) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3, null);
            } else if (PointerEventType.m7156equalsimpl0(type2, companion.m7158getExit7fucELk())) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3, null);
            }
        }
        if (this.pointerInputNode == null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.AbstractClickableNode$onPointerEvent$3
                @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    Object objClickPointerInput = this.this$0.clickPointerInput(pointerInputScope, continuation);
                    return objClickPointerInput == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objClickPointerInput : Unit.INSTANCE;
                }
            }));
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo4851onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        }
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        HoverInteraction hoverInteraction;
        InteractionSource3 interactionSource3 = this.interactionSource;
        if (interactionSource3 != null && (hoverInteraction = this.hoverInteraction) != null) {
            interactionSource3.tryEmit(new HoverInteraction2(hoverInteraction));
        }
        this.hoverInteraction = null;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
    }

    @Override // androidx.compose.p011ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo4850onKeyEventZmokQxo(KeyEvent event) {
        boolean z;
        initializeIndicationAndInteractionSourceIfNeeded();
        long jM7117getKeyZmokQxo = KeyEvent_androidKt.m7117getKeyZmokQxo(event);
        if (this.enabled && ClickableKt.m4900isPressZmokQxo(event)) {
            if (this.currentKeyPressInteractions.containsKey(jM7117getKeyZmokQxo)) {
                z = false;
            } else {
                PressInteraction.Press press = new PressInteraction.Press(this.centerOffset, null);
                this.currentKeyPressInteractions.set(jM7117getKeyZmokQxo, press);
                if (this.interactionSource != null) {
                    BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3, null);
                }
                z = true;
            }
            return mo4848onClickKeyDownEventZmokQxo(event) || z;
        }
        if (this.enabled && ClickableKt.m4898isClickZmokQxo(event)) {
            PressInteraction.Press pressRemove = this.currentKeyPressInteractions.remove(jM7117getKeyZmokQxo);
            if (pressRemove != null) {
                if (this.interactionSource != null) {
                    BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$2(this, pressRemove, null), 3, null);
                }
                mo4849onClickKeyUpEventZmokQxo(event);
            }
            if (pressRemove != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.role;
        if (role != null) {
            Intrinsics.checkNotNull(role);
            SemanticsPropertiesKt.m7496setRolekuIjeqM(semanticsPropertyReceiver, role.getValue());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new Function0<Boolean>() { // from class: androidx.compose.foundation.AbstractClickableNode.applySemantics.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                AbstractClickableNode.this.getOnClick().invoke();
                return Boolean.TRUE;
            }
        });
        if (this.enabled) {
            this.focusableNode.applySemantics(semanticsPropertyReceiver);
        } else {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        applyAdditionalSemantics(semanticsPropertyReceiver);
    }

    protected final Unit resetPointerInputHandler() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode == null) {
            return null;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
        return Unit.INSTANCE;
    }

    /* renamed from: handlePressInteraction-d-4ec7I, reason: not valid java name */
    protected final Object m4847handlePressInteractiond4ec7I(TapGestureDetector2 tapGestureDetector2, long j, Continuation<? super Unit> continuation) {
        Object objCoroutineScope;
        InteractionSource3 interactionSource3 = this.interactionSource;
        return (interactionSource3 == null || (objCoroutineScope = CoroutineScope2.coroutineScope(new AbstractClickableNode$handlePressInteraction$2$1(tapGestureDetector2, j, interactionSource3, this, null), continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objCoroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean delayPressInteraction() {
        return ClickableKt.hasScrollableContainer(this) || Clickable_androidKt.isComposeRootInScrollableContainer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverEnter() {
        if (this.hoverInteraction == null) {
            HoverInteraction hoverInteraction = new HoverInteraction();
            InteractionSource3 interactionSource3 = this.interactionSource;
            if (interactionSource3 != null) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverEnter$1$1(interactionSource3, hoverInteraction, null), 3, null);
            }
            this.hoverInteraction = hoverInteraction;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverExit() {
        HoverInteraction hoverInteraction = this.hoverInteraction;
        if (hoverInteraction != null) {
            HoverInteraction2 hoverInteraction2 = new HoverInteraction2(hoverInteraction);
            InteractionSource3 interactionSource3 = this.interactionSource;
            if (interactionSource3 != null) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverExit$1$1$1(interactionSource3, hoverInteraction2, null), 3, null);
            }
            this.hoverInteraction = null;
        }
    }

    @Override // androidx.compose.p011ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* compiled from: Clickable.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;", "", "()V", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: androidx.compose.foundation.AbstractClickableNode$TraverseKey, reason: from kotlin metadata */
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

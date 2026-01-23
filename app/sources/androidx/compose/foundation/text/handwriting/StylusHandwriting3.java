package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.gestures.TapGestureDetector_androidKt;
import androidx.compose.p011ui.focus.FocusEventModifierNode;
import androidx.compose.p011ui.focus.FocusRequesterModifierNode;
import androidx.compose.p011ui.focus.FocusRequesterModifierNode2;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerId;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.PointerType;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p011ui.node.DelegatableNode2;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.PointerInputModifierNode;
import com.plaid.internal.EnumC7081g;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StylusHandwriting.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\tR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020#8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m3636d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "()V", "Lkotlin/jvm/functions/Function0;", "getOnHandwritingSlopExceeded", "()Lkotlin/jvm/functions/Function0;", "setOnHandwritingSlopExceeded", "", "focused", "Z", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "suspendingPointerInputModifierNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "getTouchBoundsExpansion-RZrCHBk", "()J", "touchBoundsExpansion", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode, reason: use source file name */
/* loaded from: classes4.dex */
public class StylusHandwriting3 extends DelegatingNode implements PointerInputModifierNode, FocusEventModifierNode, FocusRequesterModifierNode {
    private boolean focused;
    private Function0<Unit> onHandwritingSlopExceeded;
    private final SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1

        /* compiled from: StylusHandwriting.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", m3645f = "StylusHandwriting.kt", m3646l = {105, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1 */
        static final class C13861 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ StylusHandwriting3 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13861(StylusHandwriting3 stylusHandwriting3, Continuation<? super C13861> continuation) {
                super(2, continuation);
                this.this$0 = stylusHandwriting3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C13861 c13861 = new C13861(this.this$0, continuation);
                c13861.L$0 = obj;
                return c13861;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C13861) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
            
                if (r8 == r1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00f4, code lost:
            
                if (r9 != r1) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x01a6, code lost:
            
                if (r5 != r1) goto L75;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01a8, code lost:
            
                return r1;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f4 -> B:42:0x00f8). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01a6 -> B:75:0x01a9). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                Object objAwaitFirstDown;
                AwaitPointerEventScope awaitPointerEventScope2;
                PointerEventPass pointerEventPass;
                PointerInputChange pointerInputChange;
                Object objAwaitPointerEvent;
                AwaitPointerEventScope awaitPointerEventScope3;
                PointerInputChange pointerInputChange2;
                AwaitPointerEventScope awaitPointerEventScope4;
                PointerInputChange pointerInputChange3;
                PointerInputChange pointerInputChange4;
                Object objAwaitPointerEvent2;
                PointerInputChange pointerInputChange5;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                int i2 = 2;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 1;
                    objAwaitFirstDown = TapGestureDetector4.awaitFirstDown(awaitPointerEventScope, true, pointerEventPass2, this);
                } else if (i == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwaitFirstDown = obj;
                } else if (i == 2) {
                    pointerEventPass = (PointerEventPass) this.L$2;
                    pointerInputChange = (PointerInputChange) this.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwaitPointerEvent = obj;
                    PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            awaitPointerEventScope3 = awaitPointerEventScope2;
                            pointerInputChange2 = null;
                            break;
                        }
                        pointerInputChange2 = changes.get(i3);
                        PointerInputChange pointerInputChange6 = pointerInputChange2;
                        if (!pointerInputChange6.isConsumed()) {
                            awaitPointerEventScope3 = awaitPointerEventScope2;
                            if (PointerId.m7170equalsimpl0(pointerInputChange6.getId(), pointerInputChange.getId()) && pointerInputChange6.getPressed()) {
                                break;
                            }
                        } else {
                            awaitPointerEventScope3 = awaitPointerEventScope2;
                        }
                        i3++;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                    }
                    PointerInputChange pointerInputChange7 = pointerInputChange2;
                    if (pointerInputChange7 == null || pointerInputChange7.getUptimeMillis() - pointerInputChange.getUptimeMillis() >= awaitPointerEventScope3.getViewConfiguration().getLongPressTimeoutMillis() || TapGestureDetector_androidKt.isDeepPress(pointerEvent)) {
                        pointerInputChange7 = null;
                    } else if (Offset.m6541getDistanceimpl(Offset.m6546minusMKHz9U(pointerInputChange7.getPosition(), pointerInputChange.getPosition())) <= awaitPointerEventScope3.getViewConfiguration().getHandwritingSlop()) {
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        i2 = 2;
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = pointerInputChange;
                        this.L$2 = pointerEventPass;
                        this.label = i2;
                        objAwaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
                    }
                    if (pointerInputChange7 == null) {
                        return Unit.INSTANCE;
                    }
                    if (!this.this$0.focused) {
                        FocusRequesterModifierNode2.requestFocus(this.this$0);
                    }
                    this.this$0.getOnHandwritingSlopExceeded().invoke();
                    pointerInputChange7.consume();
                    awaitPointerEventScope4 = awaitPointerEventScope3;
                    pointerInputChange3 = pointerInputChange;
                    PointerEventPass pointerEventPass3 = PointerEventPass.Initial;
                    this.L$0 = awaitPointerEventScope4;
                    this.L$1 = pointerInputChange3;
                    pointerInputChange4 = null;
                    this.L$2 = null;
                    this.label = 3;
                    objAwaitPointerEvent2 = awaitPointerEventScope4.awaitPointerEvent(pointerEventPass3, this);
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pointerInputChange3 = (PointerInputChange) this.L$1;
                    awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwaitPointerEvent2 = obj;
                    pointerInputChange4 = null;
                    List<PointerInputChange> changes2 = ((PointerEvent) objAwaitPointerEvent2).getChanges();
                    int size2 = changes2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            pointerInputChange5 = pointerInputChange4;
                            break;
                        }
                        pointerInputChange5 = changes2.get(i4);
                        PointerInputChange pointerInputChange8 = pointerInputChange5;
                        if (!pointerInputChange8.isConsumed() && PointerId.m7170equalsimpl0(pointerInputChange8.getId(), pointerInputChange3.getId()) && pointerInputChange8.getPressed()) {
                            break;
                        }
                        i4++;
                    }
                    PointerInputChange pointerInputChange9 = pointerInputChange5;
                    if (pointerInputChange9 == null) {
                        return Unit.INSTANCE;
                    }
                    pointerInputChange9.consume();
                    PointerEventPass pointerEventPass32 = PointerEventPass.Initial;
                    this.L$0 = awaitPointerEventScope4;
                    this.L$1 = pointerInputChange3;
                    pointerInputChange4 = null;
                    this.L$2 = null;
                    this.label = 3;
                    objAwaitPointerEvent2 = awaitPointerEventScope4.awaitPointerEvent(pointerEventPass32, this);
                }
                PointerInputChange pointerInputChange10 = (PointerInputChange) objAwaitFirstDown;
                int type2 = pointerInputChange10.getType();
                PointerType.Companion companion = PointerType.INSTANCE;
                if (!PointerType.m7203equalsimpl0(type2, companion.m7208getStylusT8wyACA()) && !PointerType.m7203equalsimpl0(pointerInputChange10.getType(), companion.m7206getEraserT8wyACA())) {
                    return Unit.INSTANCE;
                }
                PointerEventPass pointerEventPass4 = (this.this$0.focused || (Float.intBitsToFloat((int) (pointerInputChange10.getPosition() >> 32)) >= 0.0f && Float.intBitsToFloat((int) (pointerInputChange10.getPosition() >> 32)) < ((float) ((int) (awaitPointerEventScope.mo7138getSizeYbymL2g() >> 32))) && Float.intBitsToFloat((int) (pointerInputChange10.getPosition() & 4294967295L)) >= 0.0f && Float.intBitsToFloat((int) (pointerInputChange10.getPosition() & 4294967295L)) < ((float) ((int) (awaitPointerEventScope.mo7138getSizeYbymL2g() & 4294967295L))))) ? PointerEventPass.Initial : PointerEventPass.Main;
                awaitPointerEventScope2 = awaitPointerEventScope;
                pointerEventPass = pointerEventPass4;
                pointerInputChange = pointerInputChange10;
                this.L$0 = awaitPointerEventScope2;
                this.L$1 = pointerInputChange;
                this.L$2 = pointerEventPass;
                this.label = i2;
                objAwaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
            }
        }

        @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C13861(this.this$0, null), continuation);
            return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
        }
    }));

    public final Function0<Unit> getOnHandwritingSlopExceeded() {
        return this.onHandwritingSlopExceeded;
    }

    public final void setOnHandwritingSlopExceeded(Function0<Unit> function0) {
        this.onHandwritingSlopExceeded = function0;
    }

    public StylusHandwriting3(Function0<Unit> function0) {
        this.onHandwritingSlopExceeded = function0;
    }

    @Override // androidx.compose.p011ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        this.focused = focusState.isFocused();
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk, reason: not valid java name */
    public long mo5449getTouchBoundsExpansionRZrCHBk() {
        return StylusHandwriting2.getHandwritingBoundsExpansion().m7293roundToTouchBoundsExpansionTW6G1oQ(DelegatableNode2.requireDensity(this));
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo4851onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        this.suspendingPointerInputModifierNode.mo4851onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.suspendingPointerInputModifierNode.onCancelPointerInput();
    }
}

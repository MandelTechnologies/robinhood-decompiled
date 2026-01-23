package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.HoverInteraction2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerEventType;
import androidx.compose.p011ui.node.PointerInputModifierNode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: Hoverable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010\nJ\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J*\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\tH\u0002J\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, m3636d2 = {"Landroidx/compose/foundation/HoverableNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "hoverInteraction", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "emitEnter", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitExit", "onCancelPointerInput", "onDetach", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "tryEmitExit", "updateInteractionSource", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.HoverableNode, reason: use source file name */
/* loaded from: classes.dex */
final class Hoverable3 extends Modifier.Node implements PointerInputModifierNode {
    private HoverInteraction hoverInteraction;
    private InteractionSource3 interactionSource;

    /* compiled from: Hoverable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.HoverableNode", m3645f = "Hoverable.kt", m3646l = {106}, m3647m = "emitEnter")
    /* renamed from: androidx.compose.foundation.HoverableNode$emitEnter$1 */
    /* loaded from: classes4.dex */
    static final class C10441 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C10441(Continuation<? super C10441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Hoverable3.this.emitEnter(this);
        }
    }

    /* compiled from: Hoverable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.HoverableNode", m3645f = "Hoverable.kt", m3646l = {114}, m3647m = "emitExit")
    /* renamed from: androidx.compose.foundation.HoverableNode$emitExit$1 */
    /* loaded from: classes4.dex */
    static final class C10451 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10451(Continuation<? super C10451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Hoverable3.this.emitExit(this);
        }
    }

    public Hoverable3(InteractionSource3 interactionSource3) {
        this.interactionSource = interactionSource3;
    }

    public final void updateInteractionSource(InteractionSource3 interactionSource) {
        if (Intrinsics.areEqual(this.interactionSource, interactionSource)) {
            return;
        }
        tryEmitExit();
        this.interactionSource = interactionSource;
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo4851onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        if (pass == PointerEventPass.Main) {
            int type2 = pointerEvent.getType();
            PointerEventType.Companion companion = PointerEventType.INSTANCE;
            if (PointerEventType.m7156equalsimpl0(type2, companion.m7157getEnter7fucELk())) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new Hoverable4(this, null), 3, null);
            } else if (PointerEventType.m7156equalsimpl0(type2, companion.m7158getExit7fucELk())) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new Hoverable5(this, null), 3, null);
            }
        }
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        tryEmitExit();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        tryEmitExit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emitEnter(Continuation<? super Unit> continuation) {
        C10441 c10441;
        Hoverable3 hoverable3;
        HoverInteraction hoverInteraction;
        if (continuation instanceof C10441) {
            c10441 = (C10441) continuation;
            int i = c10441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c10441.label = i - Integer.MIN_VALUE;
            } else {
                c10441 = new C10441(continuation);
            }
        }
        Object obj = c10441.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c10441.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.hoverInteraction == null) {
                HoverInteraction hoverInteraction2 = new HoverInteraction();
                InteractionSource3 interactionSource3 = this.interactionSource;
                c10441.L$0 = this;
                c10441.L$1 = hoverInteraction2;
                c10441.label = 1;
                if (interactionSource3.emit(hoverInteraction2, c10441) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hoverable3 = this;
                hoverInteraction = hoverInteraction2;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hoverInteraction = (HoverInteraction) c10441.L$1;
        hoverable3 = (Hoverable3) c10441.L$0;
        ResultKt.throwOnFailure(obj);
        hoverable3.hoverInteraction = hoverInteraction;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emitExit(Continuation<? super Unit> continuation) {
        C10451 c10451;
        Hoverable3 hoverable3;
        if (continuation instanceof C10451) {
            c10451 = (C10451) continuation;
            int i = c10451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c10451.label = i - Integer.MIN_VALUE;
            } else {
                c10451 = new C10451(continuation);
            }
        }
        Object obj = c10451.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c10451.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HoverInteraction hoverInteraction = this.hoverInteraction;
            if (hoverInteraction != null) {
                HoverInteraction2 hoverInteraction2 = new HoverInteraction2(hoverInteraction);
                InteractionSource3 interactionSource3 = this.interactionSource;
                c10451.L$0 = this;
                c10451.label = 1;
                if (interactionSource3.emit(hoverInteraction2, c10451) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hoverable3 = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hoverable3 = (Hoverable3) c10451.L$0;
        ResultKt.throwOnFailure(obj);
        hoverable3.hoverInteraction = null;
        return Unit.INSTANCE;
    }

    private final void tryEmitExit() {
        HoverInteraction hoverInteraction = this.hoverInteraction;
        if (hoverInteraction != null) {
            this.interactionSource.tryEmit(new HoverInteraction2(hoverInteraction));
            this.hoverInteraction = null;
        }
    }
}

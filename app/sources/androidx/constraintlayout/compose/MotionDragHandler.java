package androidx.constraintlayout.compose;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.C1842xe3d9cdbd;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotFloatState2;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;

/* compiled from: MotionDragHandler.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u008e\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\fH\u0082@¢\u0006\u0002\u0010\u0012\u001a$\u0010\u0013\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¨\u0006\u001b"}, m3636d2 = {"detectDragGesturesWhenNeeded", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onAcceptFirstDown", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onDragStart", "onDragEnd", "Lkotlin/Function0;", "onDragCancel", "onDrag", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", "name", "change", "dragAmount", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "motionPointerInput", "Landroidx/compose/ui/Modifier;", "key", "", "motionProgress", "Landroidx/compose/runtime/MutableFloatState;", "measurer", "Landroidx/constraintlayout/compose/MotionMeasurer;", "constraintlayout-compose_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.constraintlayout.compose.MotionDragHandlerKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class MotionDragHandler {

    /* compiled from: MotionDragHandler.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2", m3645f = "MotionDragHandler.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2 */
    static final class C20412 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Offset, Boolean> $onAcceptFirstDown;
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C20412(Function1<? super Offset, Boolean> function1, Function1<? super Offset, Unit> function12, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super C20412> continuation) {
            super(2, continuation);
            this.$onAcceptFirstDown = function1;
            this.$onDragStart = function12;
            this.$onDrag = function2;
            this.$onDragCancel = function0;
            this.$onDragEnd = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C20412 c20412 = new C20412(this.$onAcceptFirstDown, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
            c20412.L$0 = obj;
            return c20412;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C20412) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d2, code lost:
        
            if (r12 == r0) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0096 A[PHI: r1 r4 r5 r8 r12
          0x0096: PHI (r1v5 kotlin.jvm.internal.Ref$LongRef) = (r1v4 kotlin.jvm.internal.Ref$LongRef), (r1v12 kotlin.jvm.internal.Ref$LongRef) binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r4v8 androidx.compose.ui.input.pointer.PointerInputChange) = 
          (r4v7 androidx.compose.ui.input.pointer.PointerInputChange)
          (r4v11 androidx.compose.ui.input.pointer.PointerInputChange)
         binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r5v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r5v7 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r5v10 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r8v3 androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2) = 
          (r8v2 androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2)
          (r8v6 androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2)
         binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r12v8 java.lang.Object) = (r12v7 java.lang.Object), (r12v0 java.lang.Object) binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0093 -> B:24:0x0096). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C20412 c20412;
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            final Ref.LongRef longRef;
            PointerInputChange pointerInputChange;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope3;
                this.label = 1;
                c20412 = this;
                obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope3, true, null, c20412, 2, null);
                if (obj != coroutine_suspended) {
                    awaitPointerEventScope = awaitPointerEventScope3;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c20412 = this;
                    if (!((Boolean) obj).booleanValue()) {
                        c20412.$onDragCancel.invoke();
                    } else {
                        c20412.$onDragEnd.invoke();
                    }
                    return Unit.INSTANCE;
                }
                longRef = (Ref.LongRef) this.L$2;
                pointerInputChange = (PointerInputChange) this.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                c20412 = this;
                PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
                if (pointerInputChange2 == null && !pointerInputChange2.isConsumed()) {
                    long id = pointerInputChange.getId();
                    Function2<PointerInputChange, Offset, Unit> function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt.detectDragGesturesWhenNeeded.2.1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3, Offset offset) {
                            m8167invokeUv8p0NA(pointerInputChange3, offset.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                        public final void m8167invokeUv8p0NA(PointerInputChange pointerInputChange3, long j) {
                            pointerInputChange3.consume();
                            longRef.element = j;
                        }
                    };
                    c20412.L$0 = awaitPointerEventScope2;
                    c20412.L$1 = pointerInputChange;
                    c20412.L$2 = longRef;
                    c20412.label = 2;
                    obj = DragGestureDetectorKt.m4976awaitTouchSlopOrCancellationjO51t88(awaitPointerEventScope2, id, function2, this);
                    if (obj != coroutine_suspended) {
                        PointerInputChange pointerInputChange22 = (PointerInputChange) obj;
                        if (pointerInputChange22 == null) {
                        }
                        if (pointerInputChange22 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (pointerInputChange22 != null) {
                        c20412.$onDragStart.invoke(Offset.m6534boximpl(pointerInputChange22.getPosition()));
                        c20412.$onDrag.invoke(pointerInputChange22, Offset.m6534boximpl(longRef.element));
                        long id2 = pointerInputChange22.getId();
                        final Function2<PointerInputChange, Offset, Unit> function22 = c20412.$onDrag;
                        Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt.detectDragGesturesWhenNeeded.2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3) {
                                invoke2(pointerInputChange3);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(PointerInputChange pointerInputChange3) {
                                function22.invoke(pointerInputChange3, Offset.m6534boximpl(PointerEventKt.positionChange(pointerInputChange3)));
                                pointerInputChange3.consume();
                            }
                        };
                        c20412.L$0 = null;
                        c20412.L$1 = null;
                        c20412.L$2 = null;
                        c20412.label = 3;
                        obj = DragGestureDetectorKt.m4979dragjO51t88(awaitPointerEventScope2, id2, function1, this);
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            c20412 = this;
            PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
            if (!c20412.$onAcceptFirstDown.invoke(Offset.m6534boximpl(pointerInputChange3.getPosition())).booleanValue()) {
                return Unit.INSTANCE;
            }
            Ref.LongRef longRef2 = new Ref.LongRef();
            longRef2.element = Offset.INSTANCE.m6553getZeroF1C5BW0();
            awaitPointerEventScope2 = awaitPointerEventScope;
            longRef = longRef2;
            pointerInputChange = pointerInputChange3;
            long id3 = pointerInputChange.getId();
            Function2<PointerInputChange, Offset, Unit> function23 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt.detectDragGesturesWhenNeeded.2.1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange32, Offset offset) {
                    m8167invokeUv8p0NA(pointerInputChange32, offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m8167invokeUv8p0NA(PointerInputChange pointerInputChange32, long j) {
                    pointerInputChange32.consume();
                    longRef.element = j;
                }
            };
            c20412.L$0 = awaitPointerEventScope2;
            c20412.L$1 = pointerInputChange;
            c20412.L$2 = longRef;
            c20412.label = 2;
            obj = DragGestureDetectorKt.m4976awaitTouchSlopOrCancellationjO51t88(awaitPointerEventScope2, id3, function23, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectDragGesturesWhenNeeded(PointerInputScope pointerInputScope, Function1<? super Offset, Boolean> function1, Function1<? super Offset, Unit> function12, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C20412(function1, function12, function2, function02, function0, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    public static final Modifier motionPointerInput(Modifier modifier, final Object obj, final SnapshotFloatState2 snapshotFloatState2, final MotionMeasurer motionMeasurer) {
        return ComposedModifier2.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("motionPointerInput");
                inspectorInfo.getProperties().set("key", obj);
                inspectorInfo.getProperties().set("motionProgress", snapshotFloatState2);
                inspectorInfo.getProperties().set("measurer", motionMeasurer);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt.motionPointerInput.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceGroup(146198586);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(146198586, i, -1, "androidx.constraintlayout.compose.motionPointerInput.<anonymous> (MotionDragHandler.kt:61)");
                }
                if (!motionMeasurer.getTransition().hasOnSwipe()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return modifier2;
                }
                boolean zChanged = composer.changed(obj);
                MotionMeasurer motionMeasurer2 = motionMeasurer;
                SnapshotFloatState2 snapshotFloatState22 = snapshotFloatState2;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new TransitionHandler(motionMeasurer2, snapshotFloatState22);
                    composer.updateRememberedValue(objRememberedValue);
                }
                TransitionHandler transitionHandler = (TransitionHandler) objRememberedValue;
                boolean zChanged2 = composer.changed(obj);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = Channel4.Channel$default(-1, null, null, 6, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Channel channel = (Channel) objRememberedValue2;
                Object obj2 = obj;
                boolean zChangedInstance = composer.changedInstance(transitionHandler) | composer.changedInstance(channel);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new MotionDragHandler2(transitionHandler, channel, null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.LaunchedEffect(obj2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
                Object obj3 = obj;
                boolean zChangedInstance2 = composer.changedInstance(transitionHandler) | composer.changedInstance(channel);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new MotionDragHandler3(transitionHandler, channel, null);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Modifier modifierThen = modifier2.then(new SuspendPointerInputElement(obj3, null, null, new C1842xe3d9cdbd((Function2) objRememberedValue4), 6, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        });
    }
}

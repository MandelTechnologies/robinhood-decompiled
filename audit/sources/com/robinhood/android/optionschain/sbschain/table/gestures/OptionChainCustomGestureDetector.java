package com.robinhood.android.optionschain.sbschain.table.gestures;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerId;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionChainCustomGestureDetector;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainCustomGestureDetector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0082\u0001\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00062\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0080@¢\u0006\u0002\u0010\u0011\u001a \u0010\u0012\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0080@¢\u0006\u0002\u0010\u0014\u001a.\u0010\u0015\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0080@¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"LONG_PRESS_TIMEOUT_MILLIS", "", "optionChainDragAfterLongPress", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "onDragEnd", "", "onDrag", "Lkotlin/Function2;", "", "hasDragTarget", "Lkotlin/Function0;", "onTouchWithoutDragTarget", "onGestureEnded", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectBidAskCellTouchDown", "onDown", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectPointerDownAndUp", "onPointerDown", "onPointerUp", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.table.gestures.OptionChainCustomGestureDetectorKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainCustomGestureDetector {
    private static final long LONG_PRESS_TIMEOUT_MILLIS = 200;

    public static /* synthetic */ Object optionChainDragAfterLongPress$default(PointerInputScope pointerInputScope, Function1 function1, Function1 function12, Function2 function2, Function0 function0, Function0 function02, Function0 function03, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.gestures.OptionChainCustomGestureDetectorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OptionChainCustomGestureDetector.optionChainDragAfterLongPress$lambda$0((Offset) obj2);
                }
            };
        }
        if ((i & 2) != 0) {
            function12 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.gestures.OptionChainCustomGestureDetectorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OptionChainCustomGestureDetector.optionChainDragAfterLongPress$lambda$1(((Boolean) obj2).booleanValue());
                }
            };
        }
        return optionChainDragAfterLongPress(pointerInputScope, function1, function12, function2, function0, function02, function03, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit optionChainDragAfterLongPress$lambda$0(Offset offset) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit optionChainDragAfterLongPress$lambda$1(boolean z) {
        return Unit.INSTANCE;
    }

    /* compiled from: OptionChainCustomGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.gestures.OptionChainCustomGestureDetectorKt$optionChainDragAfterLongPress$4", m3645f = "OptionChainCustomGestureDetector.kt", m3646l = {32, 36, 46, EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.gestures.OptionChainCustomGestureDetectorKt$optionChainDragAfterLongPress$4 */
    static final class C246374 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Boolean> $hasDragTarget;
        final /* synthetic */ Function2<Float, Float, Unit> $onDrag;
        final /* synthetic */ Function1<Boolean, Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        final /* synthetic */ Function0<Unit> $onGestureEnded;
        final /* synthetic */ Function0<Boolean> $onTouchWithoutDragTarget;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C246374(Function0<Boolean> function0, Function0<Boolean> function02, Function1<? super Offset, Unit> function1, Function1<? super Boolean, Unit> function12, Function0<Unit> function03, Function2<? super Float, ? super Float, Unit> function2, Continuation<? super C246374> continuation) {
            super(2, continuation);
            this.$hasDragTarget = function0;
            this.$onTouchWithoutDragTarget = function02;
            this.$onDragStart = function1;
            this.$onDragEnd = function12;
            this.$onGestureEnded = function03;
            this.$onDrag = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C246374 c246374 = new C246374(this.$hasDragTarget, this.$onTouchWithoutDragTarget, this.$onDragStart, this.$onDragEnd, this.$onGestureEnded, this.$onDrag, continuation);
            c246374.L$0 = obj;
            return c246374;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C246374) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x01b0, code lost:
        
            if (r0 == r6) goto L70;
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a5 A[Catch: CancellationException -> 0x0024, TryCatch #0 {CancellationException -> 0x0024, blocks: (B:9:0x001c, B:71:0x01b3, B:73:0x01bb, B:75:0x01cd, B:77:0x01d9, B:78:0x01dc, B:79:0x01df, B:81:0x01f2, B:80:0x01e9, B:16:0x0043, B:43:0x00d0, B:45:0x00e0, B:47:0x00ec, B:48:0x00f6, B:50:0x00fc, B:55:0x0119, B:57:0x011e, B:59:0x0169, B:61:0x0171, B:63:0x017d, B:40:0x00ba, B:68:0x0188, B:65:0x0180, B:66:0x0185, B:17:0x004e, B:33:0x00a1, B:35:0x00a5, B:36:0x00a8, B:20:0x0058, B:26:0x0075, B:28:0x0085, B:30:0x0093, B:38:0x00ab, B:23:0x0065), top: B:86:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ba A[Catch: CancellationException -> 0x0024, TryCatch #0 {CancellationException -> 0x0024, blocks: (B:9:0x001c, B:71:0x01b3, B:73:0x01bb, B:75:0x01cd, B:77:0x01d9, B:78:0x01dc, B:79:0x01df, B:81:0x01f2, B:80:0x01e9, B:16:0x0043, B:43:0x00d0, B:45:0x00e0, B:47:0x00ec, B:48:0x00f6, B:50:0x00fc, B:55:0x0119, B:57:0x011e, B:59:0x0169, B:61:0x0171, B:63:0x017d, B:40:0x00ba, B:68:0x0188, B:65:0x0180, B:66:0x0185, B:17:0x004e, B:33:0x00a1, B:35:0x00a5, B:36:0x00a8, B:20:0x0058, B:26:0x0075, B:28:0x0085, B:30:0x0093, B:38:0x00ab, B:23:0x0065), top: B:86:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00e0 A[Catch: CancellationException -> 0x0024, TryCatch #0 {CancellationException -> 0x0024, blocks: (B:9:0x001c, B:71:0x01b3, B:73:0x01bb, B:75:0x01cd, B:77:0x01d9, B:78:0x01dc, B:79:0x01df, B:81:0x01f2, B:80:0x01e9, B:16:0x0043, B:43:0x00d0, B:45:0x00e0, B:47:0x00ec, B:48:0x00f6, B:50:0x00fc, B:55:0x0119, B:57:0x011e, B:59:0x0169, B:61:0x0171, B:63:0x017d, B:40:0x00ba, B:68:0x0188, B:65:0x0180, B:66:0x0185, B:17:0x004e, B:33:0x00a1, B:35:0x00a5, B:36:0x00a8, B:20:0x0058, B:26:0x0075, B:28:0x0085, B:30:0x0093, B:38:0x00ab, B:23:0x0065), top: B:86:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0188 A[Catch: CancellationException -> 0x0024, TryCatch #0 {CancellationException -> 0x0024, blocks: (B:9:0x001c, B:71:0x01b3, B:73:0x01bb, B:75:0x01cd, B:77:0x01d9, B:78:0x01dc, B:79:0x01df, B:81:0x01f2, B:80:0x01e9, B:16:0x0043, B:43:0x00d0, B:45:0x00e0, B:47:0x00ec, B:48:0x00f6, B:50:0x00fc, B:55:0x0119, B:57:0x011e, B:59:0x0169, B:61:0x0171, B:63:0x017d, B:40:0x00ba, B:68:0x0188, B:65:0x0180, B:66:0x0185, B:17:0x004e, B:33:0x00a1, B:35:0x00a5, B:36:0x00a8, B:20:0x0058, B:26:0x0075, B:28:0x0085, B:30:0x0093, B:38:0x00ab, B:23:0x0065), top: B:86:0x000e }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00cc -> B:43:0x00d0). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            Object objAwaitFirstDown$default;
            final Ref.FloatRef floatRef;
            final Ref.FloatRef floatRef2;
            PointerInputChange pointerInputChange;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerInputChange pointerInputChange2;
            Object objWaitForUpOrCancellation;
            PointerInputChange pointerInputChange3;
            Object objM4979dragjO51t88;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 3;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 1;
                    objAwaitFirstDown$default = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                    if (objAwaitFirstDown$default == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        objWaitForUpOrCancellation = obj;
                        pointerInputChange3 = (PointerInputChange) objWaitForUpOrCancellation;
                        if (pointerInputChange3 != null) {
                            pointerInputChange3.consume();
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        objM4979dragjO51t88 = obj;
                        if (((Boolean) objM4979dragjO51t88).booleanValue()) {
                            List<PointerInputChange> changes = awaitPointerEventScope2.getCurrentEvent().getChanges();
                            int size = changes.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                PointerInputChange pointerInputChange4 = changes.get(i3);
                                if (PointerEventKt.changedToUp(pointerInputChange4)) {
                                    pointerInputChange4.consume();
                                }
                            }
                            this.$onDragEnd.invoke(boxing.boxBoolean(true));
                        } else {
                            this.$onDragEnd.invoke(boxing.boxBoolean(false));
                        }
                        this.$onGestureEnded.invoke();
                        return Unit.INSTANCE;
                    }
                    pointerInputChange2 = (PointerInputChange) this.L$4;
                    Ref.FloatRef floatRef3 = (Ref.FloatRef) this.L$3;
                    floatRef = (Ref.FloatRef) this.L$2;
                    PointerInputChange pointerInputChange5 = (PointerInputChange) this.L$1;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    floatRef2 = floatRef3;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    pointerInputChange = pointerInputChange5;
                    Object objAwaitPointerEvent = obj;
                    PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent;
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        if (!PointerEventKt.changedToUp(changes2.get(i4))) {
                            Iterator it = pointerEvent.getChanges().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                Object next = it.next();
                                Iterator it2 = it;
                                if (PointerId.m7170equalsimpl0(((PointerInputChange) next).getId(), pointerInputChange.getId())) {
                                    obj2 = next;
                                    break;
                                }
                                it = it2;
                            }
                            PointerInputChange pointerInputChange6 = (PointerInputChange) obj2;
                            if (pointerInputChange6 != null) {
                                float fAbs = Math.abs(Float.intBitsToFloat((int) (pointerInputChange6.getPosition() >> 32)) - Float.intBitsToFloat((int) (pointerInputChange.getPosition() >> 32)));
                                float fAbs2 = Math.abs(Float.intBitsToFloat((int) (pointerInputChange6.getPosition() & 4294967295L)) - Float.intBitsToFloat((int) (pointerInputChange.getPosition() & 4294967295L)));
                                if (pointerInputChange6.getUptimeMillis() - pointerInputChange.getUptimeMillis() > 200) {
                                    floatRef.element = fAbs;
                                    floatRef2.element = fAbs2;
                                    pointerInputChange2 = pointerInputChange6;
                                } else if (fAbs2 > awaitPointerEventScope2.getViewConfiguration().getTouchSlop()) {
                                    return Unit.INSTANCE;
                                }
                            }
                            i2 = 3;
                            if (pointerInputChange2 != null) {
                                PointerEventPass pointerEventPass = PointerEventPass.Initial;
                                this.L$0 = awaitPointerEventScope2;
                                this.L$1 = pointerInputChange;
                                this.L$2 = floatRef;
                                this.L$3 = floatRef2;
                                this.L$4 = pointerInputChange2;
                                this.label = i2;
                                objAwaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
                                if (objAwaitPointerEvent == coroutine_suspended) {
                                }
                                PointerEvent pointerEvent2 = (PointerEvent) objAwaitPointerEvent;
                                List<PointerInputChange> changes22 = pointerEvent2.getChanges();
                                int size22 = changes22.size();
                                int i42 = 0;
                                while (i42 < size22) {
                                }
                            } else {
                                this.$onDragStart.invoke(Offset.m6534boximpl(pointerInputChange2.getPosition()));
                                long id = pointerInputChange2.getId();
                                final Function2<Float, Float, Unit> function2 = this.$onDrag;
                                Function1 function1 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.gestures.OptionChainCustomGestureDetectorKt$optionChainDragAfterLongPress$4$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        return OptionChainCustomGestureDetector.C246374.invokeSuspend$lambda$2(floatRef, floatRef2, function2, (PointerInputChange) obj3);
                                    }
                                };
                                this.L$0 = awaitPointerEventScope2;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.label = 4;
                                objM4979dragjO51t88 = DragGestureDetectorKt.m4979dragjO51t88(awaitPointerEventScope2, id, function1, this);
                            }
                            return coroutine_suspended;
                        }
                        i42++;
                    }
                    return Unit.INSTANCE;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwaitFirstDown$default = obj;
                PointerInputChange pointerInputChange7 = (PointerInputChange) objAwaitFirstDown$default;
                if (this.$hasDragTarget.invoke().booleanValue()) {
                    floatRef = new Ref.FloatRef();
                    floatRef2 = new Ref.FloatRef();
                    pointerInputChange = pointerInputChange7;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    pointerInputChange2 = null;
                    if (pointerInputChange2 != null) {
                    }
                    return coroutine_suspended;
                }
                if (this.$onTouchWithoutDragTarget.invoke().booleanValue()) {
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    this.L$0 = null;
                    this.label = 2;
                    objWaitForUpOrCancellation = TapGestureDetector4.waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass2, this);
                    if (objWaitForUpOrCancellation == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pointerInputChange3 = (PointerInputChange) objWaitForUpOrCancellation;
                    if (pointerInputChange3 != null) {
                    }
                }
                return Unit.INSTANCE;
            } catch (CancellationException e) {
                this.$onDragEnd.invoke(boxing.boxBoolean(false));
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Function2 function2, PointerInputChange pointerInputChange) {
            long jPositionChange = PointerEventKt.positionChange(pointerInputChange);
            floatRef.element += Float.intBitsToFloat((int) (jPositionChange >> 32));
            floatRef2.element += Float.intBitsToFloat((int) (jPositionChange & 4294967295L));
            function2.invoke(Float.valueOf(floatRef.element), Float.valueOf(floatRef2.element));
            pointerInputChange.consume();
            return Unit.INSTANCE;
        }
    }

    public static final Object optionChainDragAfterLongPress(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function1<? super Boolean, Unit> function12, Function2<? super Float, ? super Float, Unit> function2, Function0<Boolean> function0, Function0<Boolean> function02, Function0<Unit> function03, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C246374(function0, function02, function1, function12, function03, function2, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* compiled from: OptionChainCustomGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.gestures.OptionChainCustomGestureDetectorKt$detectBidAskCellTouchDown$2", m3645f = "OptionChainCustomGestureDetector.kt", m3646l = {97}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.gestures.OptionChainCustomGestureDetectorKt$detectBidAskCellTouchDown$2 */
    static final class C246352 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onDown;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C246352(Function0<Unit> function0, Continuation<? super C246352> continuation) {
            super(2, continuation);
            this.$onDown = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C246352 c246352 = new C246352(this.$onDown, continuation);
            c246352.L$0 = obj;
            return c246352;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C246352) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C246352 c246352;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.label = 1;
                c246352 = this;
                obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope, false, null, c246352, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c246352 = this;
            }
            ((PointerInputChange) obj).consume();
            c246352.$onDown.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final Object detectBidAskCellTouchDown(PointerInputScope pointerInputScope, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C246352(function0, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* compiled from: OptionChainCustomGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.gestures.OptionChainCustomGestureDetectorKt$detectPointerDownAndUp$2", m3645f = "OptionChainCustomGestureDetector.kt", m3646l = {109, 112}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.gestures.OptionChainCustomGestureDetectorKt$detectPointerDownAndUp$2 */
    static final class C246362 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onPointerDown;
        final /* synthetic */ Function0<Unit> $onPointerUp;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C246362(Function0<Unit> function0, Function0<Unit> function02, Continuation<? super C246362> continuation) {
            super(2, continuation);
            this.$onPointerDown = function0;
            this.$onPointerUp = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C246362 c246362 = new C246362(this.$onPointerDown, this.$onPointerUp, continuation);
            c246362.L$0 = obj;
            return c246362;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C246362) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        
            if (r15 != r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0059 -> B:18:0x005c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C246362 c246362;
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerInputChange pointerInputChange;
            PointerInputChange pointerInputChange2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope3;
                this.label = 1;
                c246362 = this;
                obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope3, false, null, c246362, 2, null);
                if (obj != coroutine_suspended) {
                    awaitPointerEventScope = awaitPointerEventScope3;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                c246362 = this;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pointerInputChange = (PointerInputChange) this.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                c246362 = this;
                List<PointerInputChange> changes = ((PointerEvent) obj).getChanges();
                int size = changes.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes.get(i2);
                    if (PointerId.m7170equalsimpl0(pointerInputChange2.getId(), pointerInputChange.getId())) {
                        break;
                    }
                    i2++;
                }
                PointerInputChange pointerInputChange3 = pointerInputChange2;
                if (pointerInputChange3 != null && PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                    c246362.$onPointerUp.invoke();
                    return Unit.INSTANCE;
                }
                c246362.L$0 = awaitPointerEventScope2;
                c246362.L$1 = pointerInputChange;
                c246362.label = 2;
                obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, this, 1, null);
            }
            c246362.$onPointerDown.invoke();
            awaitPointerEventScope2 = awaitPointerEventScope;
            pointerInputChange = (PointerInputChange) obj;
            c246362.L$0 = awaitPointerEventScope2;
            c246362.L$1 = pointerInputChange;
            c246362.label = 2;
            obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, this, 1, null);
        }
    }

    public static final Object detectPointerDownAndUp(PointerInputScope pointerInputScope, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C246362(function0, function02, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }
}

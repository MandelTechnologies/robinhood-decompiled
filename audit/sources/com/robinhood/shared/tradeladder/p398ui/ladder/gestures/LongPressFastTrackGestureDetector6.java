package com.robinhood.shared.tradeladder.p398ui.ladder.gestures;

import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerId;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import com.plaid.internal.EnumC7081g;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LongPressFastTrackGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.gestures.LongPressFastTrackGestureDetectorKt$processEvents$change$1", m3645f = "LongPressFastTrackGestureDetector.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.LongPressFastTrackGestureDetectorKt$processEvents$change$1, reason: use source file name */
/* loaded from: classes12.dex */
final class LongPressFastTrackGestureDetector6 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {
    final /* synthetic */ Ref.LongRef $pointer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongPressFastTrackGestureDetector6(Ref.LongRef longRef, Continuation<? super LongPressFastTrackGestureDetector6> continuation) {
        super(2, continuation);
        this.$pointer = longRef;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LongPressFastTrackGestureDetector6 longPressFastTrackGestureDetector6 = new LongPressFastTrackGestureDetector6(this.$pointer, continuation);
        longPressFastTrackGestureDetector6.L$0 = obj;
        return longPressFastTrackGestureDetector6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerInputChange> continuation) {
        return ((LongPressFastTrackGestureDetector6) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope;
        int size;
        int i;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            long j = this.$pointer.element;
            longRef = new Ref.LongRef();
            longRef.element = j;
            awaitPointerEventScope = awaitPointerEventScope2;
            this.L$0 = awaitPointerEventScope;
            this.L$1 = longRef;
            this.label = 1;
            obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
            if (obj == coroutine_suspended) {
            }
            PointerEvent pointerEvent = (PointerEvent) obj;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            int i3 = 0;
            i = 0;
            while (true) {
                if (i >= size) {
                }
                i++;
            }
            pointerInputChange2 = pointerInputChange;
            if (pointerInputChange2 == null) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef = (Ref.LongRef) this.L$1;
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            PointerEvent pointerEvent2 = (PointerEvent) obj;
            List<PointerInputChange> changes2 = pointerEvent2.getChanges();
            size = changes2.size();
            int i32 = 0;
            i = 0;
            while (true) {
                if (i >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes2.get(i);
                if (PointerId.m7170equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                    break;
                }
                i++;
            }
            pointerInputChange2 = pointerInputChange;
            if (pointerInputChange2 == null) {
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    int size2 = changes3.size();
                    while (true) {
                        if (i32 >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes3.get(i32);
                        if (pointerInputChange3.getPressed()) {
                            break;
                        }
                        i32++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 != null) {
                        longRef.element = pointerInputChange4.getId();
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = longRef;
                        this.label = 1;
                        obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        PointerEvent pointerEvent22 = (PointerEvent) obj;
                        List<PointerInputChange> changes22 = pointerEvent22.getChanges();
                        size = changes22.size();
                        int i322 = 0;
                        i = 0;
                        while (true) {
                            if (i >= size) {
                            }
                            i++;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 == null) {
                            return null;
                        }
                    }
                }
                return pointerInputChange2;
            }
        }
    }
}

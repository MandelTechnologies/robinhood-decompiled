package com.robinhood.android.futures.sharedfuturesui;

import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerId;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Collection;
import java.util.Iterator;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a5\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t\u001a&\u0010\n\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u0005X\u008a\u0084\u0002"}, m3636d2 = {"scrim", "Landroidx/compose/ui/Modifier;", "enabled", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "onClick", "Lkotlin/Function0;", "", "scrim-GUYwDQI", "blockAllChildTouchEvents", "onContentClick", "lib-shared-futures-ui_externalDebug", "animatedColor"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ModifiersKt {
    /* renamed from: scrim-GUYwDQI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m14735scrimGUYwDQI$default(Modifier modifier, boolean z, Color color, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            color = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return m14734scrimGUYwDQI(modifier, z, color, function0);
    }

    /* renamed from: scrim-GUYwDQI, reason: not valid java name */
    public static final Modifier m14734scrimGUYwDQI(Modifier scrim, boolean z, Color color, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(scrim, "$this$scrim");
        return ComposedModifier2.composed$default(scrim, null, new ModifiersKt$scrim$1(z, color, function0), 1, null);
    }

    public static /* synthetic */ Modifier blockAllChildTouchEvents$default(Modifier modifier, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return blockAllChildTouchEvents(modifier, z, function0);
    }

    public static final Modifier blockAllChildTouchEvents(Modifier modifier, boolean z, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return !z ? modifier : SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.INSTANCE, new PointerInputEventHandler() { // from class: com.robinhood.android.futures.sharedfuturesui.ModifiersKt.blockAllChildTouchEvents.1

            /* compiled from: Modifiers.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.sharedfuturesui.ModifiersKt$blockAllChildTouchEvents$1$1", m3645f = "Modifiers.kt", m3646l = {60, 63}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.sharedfuturesui.ModifiersKt$blockAllChildTouchEvents$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $onContentClick;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$onContentClick = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onContentClick, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
                
                    if (r11 != r0) goto L18;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0059 -> B:18:0x005c). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AnonymousClass1 anonymousClass1;
                    AwaitPointerEventScope awaitPointerEventScope;
                    AwaitPointerEventScope awaitPointerEventScope2;
                    PointerInputChange pointerInputChange;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                        PointerEventPass pointerEventPass = PointerEventPass.Initial;
                        this.L$0 = awaitPointerEventScope3;
                        this.label = 1;
                        anonymousClass1 = this;
                        obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope3, false, pointerEventPass, anonymousClass1, 1, null);
                        if (obj != coroutine_suspended) {
                            awaitPointerEventScope = awaitPointerEventScope3;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pointerInputChange = (PointerInputChange) this.L$1;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        anonymousClass1 = this;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        Iterator<T> it = pointerEvent.getChanges().iterator();
                        while (it.hasNext()) {
                            ((PointerInputChange) it.next()).consume();
                        }
                        Function0<Unit> function0 = anonymousClass1.$onContentClick;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        if (!(changes instanceof Collection) || !changes.isEmpty()) {
                            for (PointerInputChange pointerInputChange2 : changes) {
                                if (PointerId.m7170equalsimpl0(pointerInputChange2.getId(), pointerInputChange.getId()) && pointerInputChange2.getPressed()) {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                                    anonymousClass1.L$0 = awaitPointerEventScope2;
                                    anonymousClass1.L$1 = pointerInputChange;
                                    anonymousClass1.label = 2;
                                    obj = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, this);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                    PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                    pointerInputChange3.consume();
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    pointerInputChange = pointerInputChange3;
                    PointerEventPass pointerEventPass22 = PointerEventPass.Initial;
                    anonymousClass1.L$0 = awaitPointerEventScope2;
                    anonymousClass1.L$1 = pointerInputChange;
                    anonymousClass1.label = 2;
                    obj = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass22, this);
                }
            }

            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new AnonymousClass1(function0, null), continuation);
                return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
            }
        });
    }
}

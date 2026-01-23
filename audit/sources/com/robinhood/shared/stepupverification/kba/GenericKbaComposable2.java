package com.robinhood.shared.stepupverification.kba;

import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: GenericKbaComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$MainContent$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class GenericKbaComposable2 implements PointerInputEventHandler {
    final /* synthetic */ FocusManager $focusManager;

    GenericKbaComposable2(FocusManager focusManager) {
        this.$focusManager = focusManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(FocusManager focusManager, Offset offset) {
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final FocusManager focusManager = this.$focusManager;
        Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$MainContent$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GenericKbaComposable2.invoke$lambda$0(focusManager, (Offset) obj);
            }
        }, continuation, 7, null);
        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
    }
}

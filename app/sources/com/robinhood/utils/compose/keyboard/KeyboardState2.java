package com.robinhood.utils.compose.keyboard;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: KeyboardState.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"rememberKeyboardState", "Landroidx/compose/runtime/State;", "Lcom/robinhood/utils/compose/keyboard/KeyboardState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.compose.keyboard.KeyboardStateKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class KeyboardState2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberKeyboardState$lambda$3$lambda$2(final View view, final SnapshotState snapshotState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.robinhood.utils.compose.keyboard.KeyboardStateKt$rememberKeyboardState$1$1$onGlobalListener$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                KeyboardState keyboardState;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int height = view.getRootView().getHeight();
                int i = height - rect.bottom;
                SnapshotState<KeyboardState> snapshotState2 = snapshotState;
                if (i > height * 0.15d) {
                    keyboardState = KeyboardState.OPENED;
                } else {
                    keyboardState = KeyboardState.CLOSED;
                }
                snapshotState2.setValue(keyboardState);
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        return new DisposableEffectResult() { // from class: com.robinhood.utils.compose.keyboard.KeyboardStateKt$rememberKeyboardState$lambda$3$lambda$2$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        };
    }

    public static final SnapshotState4<KeyboardState> rememberKeyboardState(Composer composer, int i) {
        composer.startReplaceGroup(-530595885);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-530595885, i, -1, "com.robinhood.utils.compose.keyboard.rememberKeyboardState (KeyboardState.kt:19)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(KeyboardState.CLOSED, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(view);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.utils.compose.keyboard.KeyboardStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KeyboardState2.rememberKeyboardState$lambda$3$lambda$2(view, snapshotState, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.DisposableEffect(view, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState;
    }
}

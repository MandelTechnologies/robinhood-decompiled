package com.robinhood.compose.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BottomSheetContentState.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"rememberBottomSheetContentState", "Lcom/robinhood/compose/common/BottomSheetContentState;", "T", "", "initialValue", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/compose/common/BottomSheetContentState;", "lib-compose-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.common.BottomSheetContentStateKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BottomSheetContentState2 {
    public static final <T> BottomSheetContentState<T> rememberBottomSheetContentState(final T t, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-439948807);
        boolean z = true;
        if ((i2 & 1) != 0) {
            t = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-439948807, i, -1, "com.robinhood.compose.common.rememberBottomSheetContentState (BottomSheetContentState.kt:51)");
        }
        Object[] objArr = new Object[0];
        Saver<BottomSheetContentState<Object>, ?> saver = BottomSheetContentState.INSTANCE.getSAVER();
        composer.startReplaceGroup(5004770);
        if ((((i & 14) ^ 6) <= 4 || !composer.changedInstance(t)) && (i & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.compose.common.BottomSheetContentStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BottomSheetContentState2.rememberBottomSheetContentState$lambda$1$lambda$0(t);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Object objM6426rememberSaveable = RememberSaveable.m6426rememberSaveable(objArr, saver, (String) null, (Function0<? extends Object>) objRememberedValue, composer, 0, 4);
        Intrinsics.checkNotNull(objM6426rememberSaveable, "null cannot be cast to non-null type com.robinhood.compose.common.BottomSheetContentState<T of com.robinhood.compose.common.BottomSheetContentStateKt.rememberBottomSheetContentState?>");
        BottomSheetContentState<T> bottomSheetContentState = (BottomSheetContentState) objM6426rememberSaveable;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bottomSheetContentState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetContentState rememberBottomSheetContentState$lambda$1$lambda$0(Object obj) {
        return new BottomSheetContentState(obj);
    }
}

package com.robinhood.android.common.composebottomsheet;

import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RhModalBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.composebottomsheet.ComposableSingletons$RhModalBottomSheetKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RhModalBottomSheet {
    public static final RhModalBottomSheet INSTANCE = new RhModalBottomSheet();
    private static Function2<Composer, Integer, Unit> lambda$700695524 = ComposableLambda3.composableLambdaInstance(700695524, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.composebottomsheet.ComposableSingletons$RhModalBottomSheetKt$lambda$700695524$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(700695524, i, -1, "com.robinhood.android.common.composebottomsheet.ComposableSingletons$RhModalBottomSheetKt.lambda$700695524.<anonymous> (RhModalBottomSheet.kt:46)");
            }
            BottomSheetDefaults.INSTANCE.m5711DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer, 196608, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$700695524$lib_compose_bottom_sheet_externalDebug() {
        return lambda$700695524;
    }
}

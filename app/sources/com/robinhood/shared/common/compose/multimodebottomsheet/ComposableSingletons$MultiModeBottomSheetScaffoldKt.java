package com.robinhood.shared.common.compose.multimodebottomsheet;

import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiModeBottomSheetScaffold.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ComposableSingletons$MultiModeBottomSheetScaffoldKt {
    public static final ComposableSingletons$MultiModeBottomSheetScaffoldKt INSTANCE = new ComposableSingletons$MultiModeBottomSheetScaffoldKt();

    /* renamed from: lambda$-721548470, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9387lambda$721548470 = ComposableLambda3.composableLambdaInstance(-721548470, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.ComposableSingletons$MultiModeBottomSheetScaffoldKt$lambda$-721548470$1
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
                ComposerKt.traceEventStart(-721548470, i, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.ComposableSingletons$MultiModeBottomSheetScaffoldKt.lambda$-721548470.<anonymous> (MultiModeBottomSheetScaffold.kt:90)");
            }
            BottomSheetDefaults.INSTANCE.m5711DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer, 196608, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<SnackbarHostState, Composer, Integer, Unit> lambda$710377168 = ComposableLambda3.composableLambdaInstance(710377168, false, new Function3<SnackbarHostState, Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.ComposableSingletons$MultiModeBottomSheetScaffoldKt$lambda$710377168$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SnackbarHostState snackbarHostState, Composer composer, Integer num) {
            invoke(snackbarHostState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SnackbarHostState it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 6) == 0) {
                i |= composer.changed(it) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(710377168, i, -1, "com.robinhood.shared.common.compose.multimodebottomsheet.ComposableSingletons$MultiModeBottomSheetScaffoldKt.lambda$710377168.<anonymous> (MultiModeBottomSheetScaffold.kt:93)");
            }
            SnackbarHostKt.SnackbarHost(it, null, null, composer, i & 14, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-721548470$lib_compose_multi_mode_bottom_sheet_externalDebug */
    public final Function2<Composer, Integer, Unit> m2750xca049683() {
        return f9387lambda$721548470;
    }

    /* renamed from: getLambda$710377168$lib_compose_multi_mode_bottom_sheet_externalDebug */
    public final Function3<SnackbarHostState, Composer, Integer, Unit> m2751xabb1b4e() {
        return lambda$710377168;
    }
}

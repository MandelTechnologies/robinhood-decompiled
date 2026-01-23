package com.robinhood.android.eventcontracts.sharedeventui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageBackground.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$ImageBackgroundKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ImageBackground {
    public static final ImageBackground INSTANCE = new ImageBackground();
    private static Function3<BoxScope, Composer, Integer, Unit> lambda$122453303 = ComposableLambda3.composableLambdaInstance(122453303, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$ImageBackgroundKt$lambda$122453303$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope boxScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(122453303, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$ImageBackgroundKt.lambda$122453303.<anonymous> (ImageBackground.kt:20)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BoxScope, Composer, Integer, Unit> lambda$67655607 = ComposableLambda3.composableLambdaInstance(67655607, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$ImageBackgroundKt$lambda$67655607$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope boxScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(67655607, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$ImageBackgroundKt.lambda$67655607.<anonymous> (ImageBackground.kt:43)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<BoxScope, Composer, Integer, Unit> getLambda$122453303$lib_shared_event_ui_externalDebug() {
        return lambda$122453303;
    }

    public final Function3<BoxScope, Composer, Integer, Unit> getLambda$67655607$lib_shared_event_ui_externalDebug() {
        return lambda$67655607;
    }
}

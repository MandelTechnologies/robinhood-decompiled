package com.robinhood.android.formentry.composables;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FormEntryPageInternal.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.formentry.composables.ComposableSingletons$FormEntryPageInternalKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FormEntryPageInternal {
    public static final FormEntryPageInternal INSTANCE = new FormEntryPageInternal();

    /* renamed from: lambda$-538049252, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8971lambda$538049252 = ComposableLambda3.composableLambdaInstance(-538049252, false, FormEntryPageInternal2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1648633927 = ComposableLambda3.composableLambdaInstance(1648633927, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.formentry.composables.ComposableSingletons$FormEntryPageInternalKt$lambda$1648633927$1
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
                ComposerKt.traceEventStart(1648633927, i, -1, "com.robinhood.android.formentry.composables.ComposableSingletons$FormEntryPageInternalKt.lambda$1648633927.<anonymous> (FormEntryPageInternal.kt:25)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(FormEntryPageInternal.INSTANCE.m14526getLambda$538049252$lib_form_entry_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-538049252$lib_form_entry_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14526getLambda$538049252$lib_form_entry_externalDebug() {
        return f8971lambda$538049252;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1648633927$lib_form_entry_externalDebug() {
        return lambda$1648633927;
    }
}

package com.robinhood.android.wires.p278ui.thirdparty.composables;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SubmitTitleDocumentsPrompt.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt$lambda$-1602116873$1, reason: use source file name */
/* loaded from: classes16.dex */
final class SubmitTitleDocumentsPrompt3 implements Function3<PaddingValues, Composer, Integer, Unit> {
    public static final SubmitTitleDocumentsPrompt3 INSTANCE = new SubmitTitleDocumentsPrompt3();

    SubmitTitleDocumentsPrompt3() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues padding, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(padding, "padding");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(padding) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1602116873, i2, -1, "com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt.lambda$-1602116873.<anonymous> (SubmitTitleDocumentsPrompt.kt:56)");
        }
        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(PaddingKt.padding(Modifier.INSTANCE, padding), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt$lambda$-1602116873$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubmitTitleDocumentsPrompt3.invoke$lambda$1$lambda$0((LazyListScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(modifierM5142padding3ABfNKs, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        SubmitTitleDocumentsPrompt submitTitleDocumentsPrompt = SubmitTitleDocumentsPrompt.INSTANCE;
        LazyListScope.item$default(LazyColumn, null, null, submitTitleDocumentsPrompt.m20102getLambda$568236990$feature_wires_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, submitTitleDocumentsPrompt.getLambda$650974059$feature_wires_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, submitTitleDocumentsPrompt.getLambda$1135610890$feature_wires_externalDebug(), 3, null);
        return Unit.INSTANCE;
    }
}

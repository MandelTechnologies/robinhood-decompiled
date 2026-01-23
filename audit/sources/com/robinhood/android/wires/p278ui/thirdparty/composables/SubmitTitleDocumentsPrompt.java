package com.robinhood.android.wires.p278ui.thirdparty.composables;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.wires.C31498R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubmitTitleDocumentsPrompt.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class SubmitTitleDocumentsPrompt {
    public static final SubmitTitleDocumentsPrompt INSTANCE = new SubmitTitleDocumentsPrompt();

    /* renamed from: lambda$-694815610, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9308lambda$694815610 = ComposableLambda3.composableLambdaInstance(-694815610, false, SubmitTitleDocumentsPrompt5.INSTANCE);

    /* renamed from: lambda$-124454607, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9305lambda$124454607 = ComposableLambda3.composableLambdaInstance(-124454607, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt$lambda$-124454607$1
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
                ComposerKt.traceEventStart(-124454607, i, -1, "com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt.lambda$-124454607.<anonymous> (SubmitTitleDocumentsPrompt.kt:26)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(SubmitTitleDocumentsPrompt.INSTANCE.m20103getLambda$694815610$feature_wires_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-568236990, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9307lambda$568236990 = ComposableLambda3.composableLambdaInstance(-568236990, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt$lambda$-568236990$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-568236990, i, -1, "com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt.lambda$-568236990.<anonymous> (SubmitTitleDocumentsPrompt.kt:62)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C31498R.string.submit_header, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$650974059 = ComposableLambda3.composableLambdaInstance(650974059, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt$lambda$650974059$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(650974059, i, -1, "com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt.lambda$650974059.<anonymous> (SubmitTitleDocumentsPrompt.kt:69)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C31498R.string.submit_sub_header, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7921getJustifye0LSkKk()), 0, false, 0, 0, null, 0, null, composer, 0, 0, 16316);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1135610890 = ComposableLambda3.composableLambdaInstance(1135610890, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt$lambda$1135610890$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1135610890, i, -1, "com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt.lambda$1135610890.<anonymous> (SubmitTitleDocumentsPrompt.kt:76)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C31498R.string.proof_of_purchase_header, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
            SubmitTitleDocumentsPrompt8.CheckmarkRow(StringResources_androidKt.stringResource(C31498R.string.proof_of_purchase_first, composer, 0), composer, 0);
            SubmitTitleDocumentsPrompt8.CheckmarkRow(StringResources_androidKt.stringResource(C31498R.string.proof_of_purchase_second, composer, 0), composer, 0);
            SubmitTitleDocumentsPrompt8.CheckmarkRow(StringResources_androidKt.stringResource(C31498R.string.proof_of_purchase_third, composer, 0), composer, 0);
            SubmitTitleDocumentsPrompt8.CheckmarkRow(StringResources_androidKt.stringResource(C31498R.string.proof_of_purchase_fourth, composer, 0), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1602116873, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f9306lambda$1602116873 = ComposableLambda3.composableLambdaInstance(-1602116873, false, SubmitTitleDocumentsPrompt3.INSTANCE);

    /* renamed from: getLambda$-124454607$feature_wires_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m20100getLambda$124454607$feature_wires_externalDebug() {
        return f9305lambda$124454607;
    }

    /* renamed from: getLambda$-1602116873$feature_wires_externalDebug, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m20101getLambda$1602116873$feature_wires_externalDebug() {
        return f9306lambda$1602116873;
    }

    /* renamed from: getLambda$-568236990$feature_wires_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m20102getLambda$568236990$feature_wires_externalDebug() {
        return f9307lambda$568236990;
    }

    /* renamed from: getLambda$-694815610$feature_wires_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m20103getLambda$694815610$feature_wires_externalDebug() {
        return f9308lambda$694815610;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1135610890$feature_wires_externalDebug() {
        return lambda$1135610890;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$650974059$feature_wires_externalDebug() {
        return lambda$650974059;
    }
}

package com.robinhood.compose.common;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeaderButtonBarScreenLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.common.ComposableSingletons$HeaderButtonBarScreenLayoutKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class HeaderButtonBarScreenLayout {
    public static final HeaderButtonBarScreenLayout INSTANCE = new HeaderButtonBarScreenLayout();

    /* renamed from: lambda$-712663674, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9346lambda$712663674 = ComposableLambda3.composableLambdaInstance(-712663674, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$HeaderButtonBarScreenLayoutKt$lambda$-712663674$1
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
                ComposerKt.traceEventStart(-712663674, i, -1, "com.robinhood.compose.common.ComposableSingletons$HeaderButtonBarScreenLayoutKt.lambda$-712663674.<anonymous> (HeaderButtonBarScreenLayout.kt:48)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw("Header", PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 6, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BentoButtonBar3, Composer, Integer, Unit> lambda$1420292274 = ComposableLambda3.composableLambdaInstance(1420292274, false, HeaderButtonBarScreenLayout4.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1659053192 = ComposableLambda3.composableLambdaInstance(1659053192, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$HeaderButtonBarScreenLayoutKt$lambda$1659053192$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1659053192, i, -1, "com.robinhood.compose.common.ComposableSingletons$HeaderButtonBarScreenLayoutKt.lambda$1659053192.<anonymous> (HeaderButtonBarScreenLayout.kt:65)");
            }
            int i2 = 0;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer2.startReplaceGroup(-1688612720);
            while (i2 < 51) {
                int i3 = i2;
                BentoText2.m20747BentoText38GnDrw(String.valueOf(i3), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                i2 = i3 + 1;
                composer2 = composer;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1700846204, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9345lambda$1700846204 = ComposableLambda3.composableLambdaInstance(-1700846204, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$HeaderButtonBarScreenLayoutKt$lambda$-1700846204$1
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
                ComposerKt.traceEventStart(-1700846204, i, -1, "com.robinhood.compose.common.ComposableSingletons$HeaderButtonBarScreenLayoutKt.lambda$-1700846204.<anonymous> (HeaderButtonBarScreenLayout.kt:46)");
            }
            HeaderButtonBarScreenLayout headerButtonBarScreenLayout = HeaderButtonBarScreenLayout.INSTANCE;
            HeaderButtonBarScreenLayout6.HeaderButtonBarScreenLayout(null, headerButtonBarScreenLayout.m21634getLambda$712663674$lib_compose_common_externalDebug(), headerButtonBarScreenLayout.getLambda$1420292274$lib_compose_common_externalDebug(), headerButtonBarScreenLayout.getLambda$1659053192$lib_compose_common_externalDebug(), composer, 3504, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1700846204$lib_compose_common_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21633getLambda$1700846204$lib_compose_common_externalDebug() {
        return f9345lambda$1700846204;
    }

    /* renamed from: getLambda$-712663674$lib_compose_common_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21634getLambda$712663674$lib_compose_common_externalDebug() {
        return f9346lambda$712663674;
    }

    public final Function3<BentoButtonBar3, Composer, Integer, Unit> getLambda$1420292274$lib_compose_common_externalDebug() {
        return lambda$1420292274;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1659053192$lib_compose_common_externalDebug() {
        return lambda$1659053192;
    }
}

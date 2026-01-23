package com.robinhood.shared.phone;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
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
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectCountryCodeBottomSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.phone.ComposableSingletons$SelectCountryCodeBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SelectCountryCodeBottomSheetComposable {
    public static final SelectCountryCodeBottomSheetComposable INSTANCE = new SelectCountryCodeBottomSheetComposable();
    private static Function2<Composer, Integer, Unit> lambda$1619221501 = ComposableLambda3.composableLambdaInstance(1619221501, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.phone.ComposableSingletons$SelectCountryCodeBottomSheetComposableKt$lambda$1619221501$1
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
                ComposerKt.traceEventStart(1619221501, i, -1, "com.robinhood.shared.phone.ComposableSingletons$SelectCountryCodeBottomSheetComposableKt.lambda$1619221501.<anonymous> (SelectCountryCodeBottomSheetComposable.kt:48)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer2.startReplaceGroup(-1607926348);
            int i2 = 0;
            while (i2 < 12) {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw("----- ----- -- ------", PaddingKt.m5143paddingVpY3zN4(companion3, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 6, 0, 16380);
                i2++;
                composer2 = composer;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1149280832, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9469lambda$1149280832 = ComposableLambda3.composableLambdaInstance(-1149280832, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.phone.ComposableSingletons$SelectCountryCodeBottomSheetComposableKt$lambda$-1149280832$1
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
                ComposerKt.traceEventStart(-1149280832, i, -1, "com.robinhood.shared.phone.ComposableSingletons$SelectCountryCodeBottomSheetComposableKt.lambda$-1149280832.<anonymous> (SelectCountryCodeBottomSheetComposable.kt:66)");
            }
            SelectCountryCodeBottomSheetComposable4.Loading(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1149280832$feature_phone_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25588getLambda$1149280832$feature_phone_externalDebug() {
        return f9469lambda$1149280832;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1619221501$feature_phone_externalDebug() {
        return lambda$1619221501;
    }
}

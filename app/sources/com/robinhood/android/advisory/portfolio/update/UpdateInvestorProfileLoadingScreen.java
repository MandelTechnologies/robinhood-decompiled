package com.robinhood.android.advisory.portfolio.update;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateInvestorProfileLoadingScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.portfolio.update.ComposableSingletons$UpdateInvestorProfileLoadingScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class UpdateInvestorProfileLoadingScreen {
    public static final UpdateInvestorProfileLoadingScreen INSTANCE = new UpdateInvestorProfileLoadingScreen();

    /* renamed from: lambda$-700554066, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8647lambda$700554066 = ComposableLambda3.composableLambdaInstance(-700554066, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.ComposableSingletons$UpdateInvestorProfileLoadingScreenKt$lambda$-700554066$1
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
                ComposerKt.traceEventStart(-700554066, i, -1, "com.robinhood.android.advisory.portfolio.update.ComposableSingletons$UpdateInvestorProfileLoadingScreenKt.lambda$-700554066.<anonymous> (UpdateInvestorProfileLoadingScreen.kt:41)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw("Update investor profile", null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 6, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-312391102, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8646lambda$312391102 = ComposableLambda3.composableLambdaInstance(-312391102, false, UpdateInvestorProfileLoadingScreen2.INSTANCE);
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$462605196 = ComposableLambda3.composableLambdaInstance(462605196, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.ComposableSingletons$UpdateInvestorProfileLoadingScreenKt$lambda$462605196$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer2.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(462605196, i2, -1, "com.robinhood.android.advisory.portfolio.update.ComposableSingletons$UpdateInvestorProfileLoadingScreenKt.lambda$462605196.<anonymous> (UpdateInvestorProfileLoadingScreen.kt:57)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.defaultScaffoldPadding(companion, paddingValues, composer2, ((i2 << 3) & 112) | 6), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            float f = 300;
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(Clip.clip(Column6.INSTANCE.align(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f)), companion2.getCenterHorizontally()), RoundedCornerShape2.getCircleShape()), true, null, 2, null), composer2, 0);
            composer2.startReplaceGroup(1242498442);
            int i3 = 0;
            while (i3 < 3) {
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, "- ------- ----- ---", (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine("-------"), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null), false, false, true, 0L, null, composer2, (BentoBaseRowState.$stable << 3) | 24576, 109);
                i3++;
                composer2 = composer;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-312391102$feature_advisory_portfolio_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11178getLambda$312391102$feature_advisory_portfolio_externalDebug() {
        return f8646lambda$312391102;
    }

    /* renamed from: getLambda$-700554066$feature_advisory_portfolio_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11179getLambda$700554066$feature_advisory_portfolio_externalDebug() {
        return f8647lambda$700554066;
    }

    public final Function3<PaddingValues, Composer, Integer, Unit> getLambda$462605196$feature_advisory_portfolio_externalDebug() {
        return lambda$462605196;
    }
}

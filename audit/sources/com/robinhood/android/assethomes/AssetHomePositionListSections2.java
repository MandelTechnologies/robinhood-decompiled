package com.robinhood.android.assethomes;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.portfolio.AssetHomeState;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionsPortfolioRiskAnalyzer;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AssetHomePositionListSections.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt$assetHomeOptionsPortfolioRiskAnalyzerEntryPoint$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AssetHomePositionListSections2 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ AssetHomeState $assetHomeState;
    final /* synthetic */ Navigator $navigator;

    AssetHomePositionListSections2(Navigator navigator, AssetHomeState assetHomeState) {
        this.$navigator = navigator;
        this.$assetHomeState = assetHomeState;
    }

    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final void invoke(LazyItemScope item, Composer composer, int i) {
        ?? r8;
        Composer composer2;
        float f;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(533361262, i, -1, "com.robinhood.android.assethomes.assetHomeOptionsPortfolioRiskAnalyzerEntryPoint.<anonymous>.<anonymous>.<anonymous> (AssetHomePositionListSections.kt:184)");
        }
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Color colorM21927getDividerColorQN2ZGVo = ((Styles) composer.consume(Styles2.getLocalStyles())).getRow(composer, 0).getColors().m21927getDividerColorQN2ZGVo();
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(context) | composer.changedInstance(this.$assetHomeState);
        final Navigator navigator = this.$navigator;
        final AssetHomeState assetHomeState = this.$assetHomeState;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt$assetHomeOptionsPortfolioRiskAnalyzerEntryPoint$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetHomePositionListSections2.invoke$lambda$1$lambda$0(navigator, context, assetHomeState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4893clickableXHw0xAI$default);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        composer.startReplaceGroup(770145571);
        if (colorM21927getDividerColorQN2ZGVo != null) {
            r8 = 0;
            composer2 = composer;
            f = 0.0f;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null), 0.0f, 1, null), colorM21927getDividerColorQN2ZGVo.getValue(), 0.0f, composer2, 0, 4);
        } else {
            r8 = 0;
            composer2 = composer;
            f = 0.0f;
        }
        composer2.endReplaceGroup();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion, ((C2002Dp) composer2.consume(Spacing2.getLocalHorizontalPadding())).getValue(), BentoBaseRowLayout8.INSTANCE.m21051getPaddingVerticalD9Ej5fM()), f, 1, r8);
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        if (composer2.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor2);
        } else {
            composer2.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        Modifier modifierAlign = row6.align(Row5.weight$default(row6, companion, 1.0f, false, 2, null), companion2.getCenterVertically());
        AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C23386R.string.option_portfolio_risk_analyzer_risk_analyzer, composer2, 0), r8, 2, r8);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifierAlign, Color.m6701boximpl(bentoTheme.getColors(composer2, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer2, i2).getTextM(), composer, 0, 0, 8184);
        IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.CARET_RIGHT_12.getResourceId(), composer, 0), (String) null, row6.align(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(16)), companion2.getCenterVertically()), bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), composer, 48, 0);
        composer.endNode();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, AssetHomeState assetHomeState) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new OptionsPortfolioRiskAnalyzer.WithAccountNumber(assetHomeState.getAccountNumber(), null), false, false, false, null, false, null, false, false, null, null, 4084, null);
        return Unit.INSTANCE;
    }
}

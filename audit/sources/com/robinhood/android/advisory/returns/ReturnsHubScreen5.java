package com.robinhood.android.advisory.returns;

import android.content.Context;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.ReturnsHubBenchmarkInfoFragmentKey;
import com.robinhood.android.advisory.returns.ReturnsHubViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.advisory.p304db.returns.ReturnsHubBenchmarkInfo;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReturnsHubScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$2$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class ReturnsHubScreen5 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ Function0<Unit> $onTooltipDismissed;
    final /* synthetic */ ReturnsHubViewState $viewState;

    ReturnsHubScreen5(ReturnsHubViewState returnsHubViewState, Function0<Unit> function0, Navigator navigator, Context context) {
        this.$viewState = returnsHubViewState;
        this.$onTooltipDismissed = function0;
        this.$navigator = navigator;
        this.$context = context;
    }

    public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
        BentoTheme bentoTheme;
        int i3;
        Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
        if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-3149077, i2, -1, "com.robinhood.android.advisory.returns.ReturnsHubScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReturnsHubScreen.kt:137)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
        int i4 = BentoTheme.$stable;
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme2.getColors(composer, i4).m21371getBg0d7_KjU(), null, 2, null);
        ReturnsHubViewState returnsHubViewState = this.$viewState;
        final Function0<Unit> function0 = this.$onTooltipDismissed;
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composer, i4).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme2.getSpacing(composer, i4).m21595getXsmallD9Ej5fM());
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), companion2.getCenterVertically(), composer, 48);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        String strStringResource = StringResources_androidKt.stringResource(C9338R.string.returns_hub_span_column_name, composer, 0);
        TextStyle textM = bentoTheme2.getTypography(composer, i4).getTextM();
        FontWeight.Companion companion4 = FontWeight.INSTANCE;
        BentoText2.m20747BentoText38GnDrw(strStringResource, Row5.weight$default(row6, companion, 1.2f, false, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU()), null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8168);
        String strStringResource2 = StringResources_androidKt.stringResource(C9338R.string.returns_hub_portfolio_column_name, composer, 0);
        TextStyle textM2 = bentoTheme2.getTypography(composer, i4).getTextM();
        BentoText2.m20747BentoText38GnDrw(strStringResource2, SizeKt.wrapContentWidth$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), companion2.getEnd(), false, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU()), null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, textM2, composer, 24576, 0, 8168);
        ReturnsHubViewState.Loaded loaded = (ReturnsHubViewState.Loaded) returnsHubViewState;
        final ReturnsHubBenchmarkInfo benchmarkInfo = loaded.getReturnsHubData().getBenchmarkInfo();
        if (benchmarkInfo != null) {
            composer.startReplaceGroup(-110123174);
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), companion2.getEnd(), false, 2, null);
            boolean zIsBenchmarkInfoTooltipVisible = loaded.isBenchmarkInfoTooltipVisible();
            PopupPositioning popupPositioning = PopupPositioning.BELOW;
            float fM21590getDefaultD9Ej5fM = bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM();
            Boolean boolValueOf = Boolean.valueOf(zIsBenchmarkInfoTooltipVisible);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$2$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReturnsHubScreen5.invoke$lambda$6$lambda$5$lambda$1$lambda$0(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(modifierWrapContentWidth$default, (16232 & 1) != 0 ? Boolean.TRUE : boolValueOf, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : (Function0) objRememberedValue, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : null, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : popupPositioning, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : fM21590getDefaultD9Ej5fM, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ReturnsHubScreen.INSTANCE.m11252getLambda$1676985859$feature_returns_hub_externalDebug());
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(benchmarkInfo);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.returns.ReturnsHubScreenKt$ReturnsHubScreen$2$1$2$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReturnsHubScreen5.invoke$lambda$6$lambda$5$lambda$3$lambda$2(navigator, context, benchmarkInfo);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM26519popupTooltipBgaGok8, false, null, null, (Function0) objRememberedValue2, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, ReturnsHubScreen4.LOGGING_IDENTIFIER_BENCHMARK_INFO_ICON, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierAutoLogEvents$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            String strStringResource3 = StringResources_androidKt.stringResource(C9338R.string.returns_hub_benchmark_column_name, composer, 0);
            TextStyle textM3 = bentoTheme2.getTypography(composer, i4).getTextM();
            long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU();
            BentoText2.m20747BentoText38GnDrw(strStringResource3, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, textM3, composer, 24576, 0, 8170);
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16), StringResources_androidKt.stringResource(C9338R.string.returns_hub_benchmark_info_icon_description, composer, 0), bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme2.getSpacing(composer, i4).m21595getXsmallD9Ej5fM(), bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), 4, null), null, false, composer, BentoIcon4.Size16.$stable, 48);
            composer.endNode();
            composer.endReplaceGroup();
            bentoTheme = bentoTheme2;
            i3 = i4;
        } else {
            composer.startReplaceGroup(-104901720);
            String strStringResource4 = StringResources_androidKt.stringResource(C9338R.string.returns_hub_benchmark_column_name, composer, 0);
            TextStyle textM4 = bentoTheme2.getTypography(composer, i4).getTextM();
            long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU();
            bentoTheme = bentoTheme2;
            i3 = i4;
            BentoText2.m20747BentoText38GnDrw(strStringResource4, null, Color.m6701boximpl(jM21426getFg20d7_KjU2), null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, textM4, composer, 24576, 0, 8170);
            composer.endReplaceGroup();
        }
        composer.endNode();
        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer, i3).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$3$lambda$2(Navigator navigator, Context context, ReturnsHubBenchmarkInfo returnsHubBenchmarkInfo) {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new ReturnsHubBenchmarkInfoFragmentKey(returnsHubBenchmarkInfo.getContent(), returnsHubBenchmarkInfo.getDisclosure(), returnsHubBenchmarkInfo.getLoggingIdentifier()), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }
}

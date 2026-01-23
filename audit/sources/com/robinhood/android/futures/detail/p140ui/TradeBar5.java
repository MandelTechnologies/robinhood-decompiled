package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.futures.analytics.FuturesAnalyticsStrings;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.futures.detail.utils.LoggingUtils5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.tooltips.TooltipData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* compiled from: TradeBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$2$1$2, reason: use source file name */
/* loaded from: classes3.dex */
final class TradeBar5 implements Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit> {
    final /* synthetic */ Function1<FuturesOrderSide, Unit> $navigateToOnboarding;
    final /* synthetic */ Function1<Boolean, Unit> $onExpanded;
    final /* synthetic */ Function0<Unit> $onTradeLadderClicked;
    final /* synthetic */ Function0<Unit> $onTradeLadderTooltipClicked;
    final /* synthetic */ Function1<FuturesOrderSide, Unit> $onTradeOrderFormClicked;
    final /* synthetic */ FuturesDetailViewState.TradeBarData $tradeBarData;

    /* JADX WARN: Multi-variable type inference failed */
    TradeBar5(FuturesDetailViewState.TradeBarData tradeBarData, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function1<? super FuturesOrderSide, Unit> function12, Function1<? super FuturesOrderSide, Unit> function13) {
        this.$tradeBarData = tradeBarData;
        this.$onExpanded = function1;
        this.$onTradeLadderTooltipClicked = function0;
        this.$onTradeLadderClicked = function02;
        this.$navigateToOnboarding = function12;
        this.$onTradeOrderFormClicked = function13;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer, Integer num) {
        invoke(animatedContentScope, bool.booleanValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2041910060, i, -1, "com.robinhood.android.futures.detail.ui.TradeBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TradeBar.kt:114)");
        }
        composer.startReplaceGroup(-524484957);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        final int iRoundToInt = MathKt.roundToInt(density.mo5016toPx0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()));
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(iRoundToInt);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$2$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(TradeBar5.invoke$lambda$2$lambda$1(iRoundToInt, ((Integer) obj).intValue(), ((Integer) obj2).intValue()));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        final Function2 function2 = (Function2) objRememberedValue;
        composer.endReplaceGroup();
        if (z) {
            composer.startReplaceGroup(921465222);
            final FuturesDetailViewState.TradeBarData tradeBarData = this.$tradeBarData;
            Function0<Unit> function0 = this.$onTradeLadderTooltipClicked;
            Function0<Unit> function02 = this.$onTradeLadderClicked;
            final Function1<FuturesOrderSide, Unit> function1 = this.$navigateToOnboarding;
            final Function1<FuturesOrderSide, Unit> function12 = this.$onTradeOrderFormClicked;
            final Function1<Boolean, Unit> function13 = this.$onExpanded;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_detail_trade_ladder_label, composer, 0);
            boolean ladderButtonEnabled = tradeBarData.getLadderButtonEnabled();
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ZIndexModifier2.zIndex(ModifiersKt.autoLogEvents$default(companion, LoggingUtils5.buttonDescriptor(FuturesAnalyticsStrings.FUTURES_TRADE_BAR_LADDER_BUTTON, composer, 6), true, false, false, true, false, null, 108, null), 3.0f), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(function2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$2$1$2$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(TradeBar5.invoke$lambda$21$lambda$4$lambda$3(function2, ((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EnterTransition enterTransitionSlideInVertically = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue2);
            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged3 = composer.changed(function2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$2$1$2$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(TradeBar5.invoke$lambda$21$lambda$6$lambda$5(function2, ((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            Modifier modifierAnimateEnterExit$default = AnimatedVisibilityScope.animateEnterExit$default(AnimatedContent, modifierM5146paddingqDBjuR0$default, enterTransitionSlideInVertically, EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default2, (Function1) objRememberedValue3), null, 4, null);
            composer.startReplaceGroup(-676385359);
            String strStringResource2 = tradeBarData.getShowLadderButtonTooltip() ? StringResources_androidKt.stringResource(C17042R.string.futures_detail_ftux_trade_ladder_button_tooltip_label, composer, 0) : null;
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8(function02, strStringResource, com.robinhood.tooltips.ModifiersKt.tooltip$default(modifierAnimateEnterExit$default, strStringResource2, new TooltipData.Layout(RdsTooltipView.NibDirection.DOWN, -50.0f, null, null, 12, null), new TooltipData.Behavior(null, null, null, function0, 7, null), null, false, 24, null), null, null, ladderButtonEnabled, false, null, null, null, null, false, null, composer, 0, 0, 8152);
            String strStringResource3 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_trade_sell_label, composer, 0);
            boolean sellButtonEnabled = tradeBarData.getSellButtonEnabled();
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ZIndexModifier2.zIndex(ModifiersKt.autoLogEvents$default(companion, LoggingUtils5.buttonDescriptor(FuturesAnalyticsStrings.FUTURES_TRADE_BAR_SELL_BUTTON, composer, 6), true, false, false, true, false, null, 108, null), 2.0f), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null);
            TweenSpec tweenSpecTween$default3 = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged4 = composer.changed(function2);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$2$1$2$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(TradeBar5.invoke$lambda$21$lambda$8$lambda$7(function2, ((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            EnterTransition enterTransitionSlideInVertically2 = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default3, (Function1) objRememberedValue4);
            TweenSpec tweenSpecTween$default4 = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged5 = composer.changed(function2);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$2$1$2$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(TradeBar5.invoke$lambda$21$lambda$10$lambda$9(function2, ((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            Modifier modifierAnimateEnterExit$default2 = AnimatedVisibilityScope.animateEnterExit$default(AnimatedContent, modifierM5146paddingqDBjuR0$default2, enterTransitionSlideInVertically2, EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default4, (Function1) objRememberedValue5), null, 4, null);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(tradeBarData) | composer.changed(function1) | composer.changed(function12);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$2$1$2$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TradeBar5.invoke$lambda$21$lambda$12$lambda$11(tradeBarData, function1, function12);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue6, strStringResource3, modifierAnimateEnterExit$default2, null, null, sellButtonEnabled, false, null, null, null, null, false, null, composer, 0, 0, 8152);
            String strStringResource4 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_trade_buy_label, composer, 0);
            boolean buyButtonEnabled = tradeBarData.getBuyButtonEnabled();
            Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ZIndexModifier2.zIndex(ModifiersKt.autoLogEvents$default(companion, LoggingUtils5.buttonDescriptor(FuturesAnalyticsStrings.FUTURES_TRADE_BAR_BUY_BUTTON, composer, 6), true, false, false, true, false, null, 108, null), 1.0f), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null);
            TweenSpec tweenSpecTween$default5 = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged6 = composer.changed(function2);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged6 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$2$1$2$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(TradeBar5.invoke$lambda$21$lambda$14$lambda$13(function2, ((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            EnterTransition enterTransitionSlideInVertically3 = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default5, (Function1) objRememberedValue7);
            TweenSpec tweenSpecTween$default6 = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged7 = composer.changed(function2);
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChanged7 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$2$1$2$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(TradeBar5.invoke$lambda$21$lambda$16$lambda$15(function2, ((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue8);
            }
            composer.endReplaceGroup();
            Modifier modifierAnimateEnterExit$default3 = AnimatedVisibilityScope.animateEnterExit$default(AnimatedContent, modifierM5146paddingqDBjuR0$default3, enterTransitionSlideInVertically3, EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default6, (Function1) objRememberedValue8), null, 4, null);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composer.changedInstance(tradeBarData) | composer.changed(function1) | composer.changed(function12);
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$2$1$2$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TradeBar5.invoke$lambda$21$lambda$18$lambda$17(tradeBarData, function1, function12);
                    }
                };
                composer.updateRememberedValue(objRememberedValue9);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue9, strStringResource4, modifierAnimateEnterExit$default3, null, null, buyButtonEnabled, false, null, null, null, null, false, null, composer, 0, 0, 8152);
            BentoIconButton4.Icon.StandardSize16 standardSize16 = new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.CLOSE_16);
            String strStringResource5 = StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer, 0);
            BentoIconButton4.Type type2 = BentoIconButton4.Type.Secondary;
            Modifier modifierAnimateEnterExit$default4 = AnimatedVisibilityScope.animateEnterExit$default(AnimatedContent, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, 2, null), null, 4, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged8 = composer.changed(function13);
            Object objRememberedValue10 = composer.rememberedValue();
            if (zChanged8 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$2$1$2$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TradeBar5.invoke$lambda$21$lambda$20$lambda$19(function13);
                    }
                };
                composer.updateRememberedValue(objRememberedValue10);
            }
            composer.endReplaceGroup();
            BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue10, standardSize16, strStringResource5, modifierAnimateEnterExit$default4, type2, false, null, null, null, null, false, composer, (BentoIconButton4.Icon.StandardSize16.$stable << 3) | 24576, 0, 2016);
            composer.endNode();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(928417220);
            String strStringResource6 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_trade_label, composer, 0);
            boolean tradeButtonEnabled = this.$tradeBarData.getTradeButtonEnabled();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, LoggingUtils5.buttonDescriptor(FuturesAnalyticsStrings.FUTURES_TRADE_BUTTON, composer, 6), true, false, false, true, false, null, 108, null), 0.0f, 1, null);
            TweenSpec tweenSpecTween$default7 = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged9 = composer.changed(function2);
            Object objRememberedValue11 = composer.rememberedValue();
            if (zChanged9 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue11 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$2$1$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(TradeBar5.invoke$lambda$23$lambda$22(function2, ((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue11);
            }
            composer.endReplaceGroup();
            EnterTransition enterTransitionPlus = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default7, (Function1) objRememberedValue11).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, 2, null));
            TweenSpec tweenSpecTween$default8 = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged10 = composer.changed(function2);
            Object objRememberedValue12 = composer.rememberedValue();
            if (zChanged10 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue12 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$2$1$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(TradeBar5.invoke$lambda$25$lambda$24(function2, ((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue12);
            }
            composer.endReplaceGroup();
            Modifier modifierAnimateEnterExit$default5 = AnimatedVisibilityScope.animateEnterExit$default(AnimatedContent, modifierFillMaxWidth$default, enterTransitionPlus, EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default8, (Function1) objRememberedValue12).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, 2, null)), null, 4, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged11 = composer.changed(this.$onExpanded);
            final Function1<Boolean, Unit> function14 = this.$onExpanded;
            Object objRememberedValue13 = composer.rememberedValue();
            if (zChanged11 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue13 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.TradeBarKt$TradeBar$1$2$1$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TradeBar5.invoke$lambda$27$lambda$26(function14);
                    }
                };
                composer.updateRememberedValue(objRememberedValue13);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue13, strStringResource6, modifierAnimateEnterExit$default5, null, null, tradeButtonEnabled, false, null, null, null, null, false, null, composer, 0, 0, 8152);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$2$lambda$1(int i, int i2, int i3) {
        return ((i2 + i) * i3) - (i / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$21$lambda$4$lambda$3(Function2 function2, int i) {
        return ((Number) function2.invoke(Integer.valueOf(i), 3)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$21$lambda$6$lambda$5(Function2 function2, int i) {
        return ((Number) function2.invoke(Integer.valueOf(i), 3)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$21$lambda$12$lambda$11(FuturesDetailViewState.TradeBarData tradeBarData, Function1 function1, Function1 function12) {
        if (tradeBarData.getTakeUserToOnboardingFlow()) {
            function1.invoke(FuturesOrderSide.SELL);
        } else {
            function12.invoke(FuturesOrderSide.SELL);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$21$lambda$8$lambda$7(Function2 function2, int i) {
        return ((Number) function2.invoke(Integer.valueOf(i), 2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$21$lambda$10$lambda$9(Function2 function2, int i) {
        return ((Number) function2.invoke(Integer.valueOf(i), 2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$21$lambda$18$lambda$17(FuturesDetailViewState.TradeBarData tradeBarData, Function1 function1, Function1 function12) {
        if (tradeBarData.getTakeUserToOnboardingFlow()) {
            function1.invoke(FuturesOrderSide.BUY);
        } else {
            function12.invoke(FuturesOrderSide.BUY);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$21$lambda$14$lambda$13(Function2 function2, int i) {
        return ((Number) function2.invoke(Integer.valueOf(i), 1)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$21$lambda$16$lambda$15(Function2 function2, int i) {
        return ((Number) function2.invoke(Integer.valueOf(i), 1)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$21$lambda$20$lambda$19(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$27$lambda$26(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$23$lambda$22(Function2 function2, int i) {
        return -((Number) function2.invoke(Integer.valueOf(i), 3)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$25$lambda$24(Function2 function2, int i) {
        return -((Number) function2.invoke(Integer.valueOf(i), 3)).intValue();
    }
}

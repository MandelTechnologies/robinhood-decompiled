package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeActionBar4;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoQuickTradeActionBar.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a9\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\t\u001aS\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"CryptoQuickTradeActionBar", "", "action", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "onButtonPressed", "Lkotlin/Function2;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Cta", "SingleButton", "text", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "buttonType", "Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "isEnabled", "", "onClick", "Lkotlin/Function0;", "SingleButton-KsoMrH8", "(Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lcom/robinhood/compose/bento/component/BentoButtons$Type;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoQuickTradeActionBarPreview", "(Landroidx/compose/runtime/Composer;I)V", "CryptoQuickTradeActionBarAnimationPreview", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoQuickTradeActionBar4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoQuickTradeActionBar$lambda$4(ActionViewState actionViewState, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoQuickTradeActionBar(actionViewState, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoQuickTradeActionBarAnimationPreview$lambda$8(int i, Composer composer, int i2) {
        CryptoQuickTradeActionBarAnimationPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoQuickTradeActionBarPreview$lambda$7(int i, Composer composer, int i2) {
        CryptoQuickTradeActionBarPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Cta$lambda$5(ActionViewState actionViewState, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Cta(actionViewState, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleButton_KsoMrH8$lambda$6(String str, Color color, Color color2, BentoButtons.Type type2, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m25963SingleButtonKsoMrH8(str, color, color2, type2, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CryptoQuickTradeActionBar(final ActionViewState action, final Function2<? super ActionViewState, ? super Integer, Unit> onButtonPressed, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(onButtonPressed, "onButtonPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-386283869);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(action) : composerStartRestartGroup.changedInstance(action) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onButtonPressed) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-386283869, i3, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBar (CryptoQuickTradeActionBar.kt:45)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoQuickTradeActionBar4.CryptoQuickTradeActionBar$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoQuickTradeActionBar4.CryptoQuickTradeActionBar$lambda$3$lambda$2((ActionViewState) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier4 = modifier3;
            AnimatedContentKt.AnimatedContent(action, modifier4, function1, null, null, (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(-570858604, true, new Function4<AnimatedContentScope, ActionViewState, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt.CryptoQuickTradeActionBar.3
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, ActionViewState actionViewState, Composer composer2, Integer num) {
                    invoke(animatedContentScope, actionViewState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, ActionViewState action2, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(action2, "action");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-570858604, i5, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBar.<anonymous> (CryptoQuickTradeActionBar.kt:58)");
                    }
                    CryptoQuickTradeActionBar4.Cta(action2, onButtonPressed, null, composer2, (i5 >> 3) & 14, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 1769856 | ((i3 >> 3) & 112), 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeActionBar4.CryptoQuickTradeActionBar$lambda$4(action, onButtonPressed, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform CryptoQuickTradeActionBar$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(250, 250, null, 4, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(250, 0, null, 6, null), 0.0f, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object CryptoQuickTradeActionBar$lambda$3$lambda$2(ActionViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Reflection.getOrCreateKotlinClass(it.getClass());
    }

    /* compiled from: CryptoQuickTradeActionBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt$Cta$1 */
    static final class C405771 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ActionViewState $action;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function2<ActionViewState, Integer, Unit> $onButtonPressed;

        /* JADX WARN: Multi-variable type inference failed */
        C405771(ActionViewState actionViewState, Function2<? super ActionViewState, ? super Integer, Unit> function2, Modifier modifier) {
            this.$action = actionViewState;
            this.$onButtonPressed = function2;
            this.$modifier = modifier;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            float fM21590getDefaultD9Ej5fM;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-538055687, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.Cta.<anonymous> (CryptoQuickTradeActionBar.kt:71)");
            }
            ActionViewState actionViewState = this.$action;
            if (Intrinsics.areEqual(actionViewState, ActionViewState.SellAll.INSTANCE)) {
                composer.startReplaceGroup(-398941089);
                String strStringResource = StringResources_androidKt.stringResource(C38572R.string.crypto_quick_trade_button_sell_all, composer, 0);
                long jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                boolean zIsButtonEnabled = this.$action.isButtonEnabled();
                Color colorM6701boximpl = Color.m6701boximpl(jM21427getFg30d7_KjU);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(this.$onButtonPressed) | composer.changedInstance(this.$action);
                final Function2<ActionViewState, Integer, Unit> function2 = this.$onButtonPressed;
                final ActionViewState actionViewState2 = this.$action;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt$Cta$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoQuickTradeActionBar4.C405771.invoke$lambda$1$lambda$0(function2, actionViewState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                CryptoQuickTradeActionBar4.m25963SingleButtonKsoMrH8(strStringResource, null, colorM6701boximpl, type2, zIsButtonEnabled, (Function0) objRememberedValue, modifierFillMaxWidth$default, composer, 1575984, 0);
                composer.endReplaceGroup();
            } else if (actionViewState instanceof ActionViewState.BuyMax) {
                composer.startReplaceGroup(-398468680);
                String string2 = StringResource2.getString(((ActionViewState.BuyMax) this.$action).getButtonText(), composer, StringResource.$stable);
                long jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
                BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                boolean zIsButtonEnabled2 = this.$action.isButtonEnabled();
                Color colorM6701boximpl2 = Color.m6701boximpl(jM21427getFg30d7_KjU2);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged2 = composer.changed(this.$onButtonPressed) | composer.changedInstance(this.$action);
                final Function2<ActionViewState, Integer, Unit> function22 = this.$onButtonPressed;
                final ActionViewState actionViewState3 = this.$action;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt$Cta$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoQuickTradeActionBar4.C405771.invoke$lambda$3$lambda$2(function22, actionViewState3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                CryptoQuickTradeActionBar4.m25963SingleButtonKsoMrH8(string2, null, colorM6701boximpl2, type3, zIsButtonEnabled2, (Function0) objRememberedValue2, modifierFillMaxWidth$default2, composer, 1575984, 0);
                composer.endReplaceGroup();
            } else if (actionViewState instanceof ActionViewState.Submit) {
                composer.startReplaceGroup(-398020203);
                String string3 = StringResource2.getString(((ActionViewState.Submit) this.$action).getButtonText(), composer, StringResource.$stable);
                long jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                BentoButtons.Type type4 = BentoButtons.Type.Primary;
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                boolean zIsButtonEnabled3 = ((ActionViewState.Submit) this.$action).isButtonEnabled();
                Color colorM6701boximpl3 = Color.m6701boximpl(jM21456getPositive0d7_KjU);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged3 = composer.changed(this.$onButtonPressed) | composer.changedInstance(this.$action);
                final Function2<ActionViewState, Integer, Unit> function23 = this.$onButtonPressed;
                final ActionViewState actionViewState4 = this.$action;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt$Cta$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoQuickTradeActionBar4.C405771.invoke$lambda$5$lambda$4(function23, actionViewState4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                CryptoQuickTradeActionBar4.m25963SingleButtonKsoMrH8(string3, colorM6701boximpl3, null, type4, zIsButtonEnabled3, (Function0) objRememberedValue3, modifierFillMaxWidth$default3, composer, 1576320, 0);
                composer.endReplaceGroup();
            } else if (actionViewState instanceof ActionViewState.QuickTrades) {
                composer.startReplaceGroup(-397531085);
                if (((ActionViewState.QuickTrades) this.$action).isRoundedRectangleShape()) {
                    composer.startReplaceGroup(-397512175);
                    fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-397450609);
                    fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
                    composer.endReplaceGroup();
                }
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(fM21590getDefaultD9Ej5fM);
                Modifier modifier = this.$modifier;
                final ActionViewState actionViewState5 = this.$action;
                final Function2<ActionViewState, Integer, Unit> function24 = this.$onButtonPressed;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifier);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composer.startReplaceGroup(-1324891915);
                ActionViewState.QuickTrades quickTrades = (ActionViewState.QuickTrades) actionViewState5;
                for (final ActionViewState.QuickTrade quickTrade : quickTrades.getQuickTrades()) {
                    if (quickTrades.isRoundedRectangleShape()) {
                        composer.startReplaceGroup(1789027077);
                        String string4 = StringResource2.getString(quickTrade.getButtonText(), composer, StringResource.$stable);
                        composer.startReplaceGroup(-1746271574);
                        boolean zChanged4 = composer.changed(function24) | composer.changedInstance(actionViewState5) | composer.changedInstance(quickTrade);
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt$Cta$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoQuickTradeActionBar4.C405771.invoke$lambda$11$lambda$10$lambda$7$lambda$6(function24, actionViewState5, quickTrade);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        CryptoQuickTradePill3.CryptoQuickTradePill(string4, (Function0) objRememberedValue4, Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 0, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1789400100);
                        BentoButtonState bentoButtonState = new BentoButtonState(StringResource2.getString(quickTrade.getButtonText(), composer, StringResource.$stable), (BentoButtons.Icon.Size16) null, BentoButtons.Type.Secondary, false, false, (Color) null, (Color) null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU()), (TextStyle) null, (Color) null, false, 1914, (DefaultConstructorMarker) null);
                        composer.startReplaceGroup(-1746271574);
                        boolean zChanged5 = composer.changed(function24) | composer.changedInstance(actionViewState5) | composer.changedInstance(quickTrade);
                        Object objRememberedValue5 = composer.rememberedValue();
                        if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt$Cta$1$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoQuickTradeActionBar4.C405771.invoke$lambda$11$lambda$10$lambda$9$lambda$8(function24, actionViewState5, quickTrade);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.BentoButton(bentoButtonState, (Function0<Unit>) objRememberedValue5, Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), (String) null, composer, BentoButtonState.$stable, 8);
                        composer.endReplaceGroup();
                    }
                }
                composer.endReplaceGroup();
                composer.endNode();
                composer.endReplaceGroup();
            } else if (actionViewState instanceof ActionViewState.SwipeToSubmit) {
                composer.startReplaceGroup(-1675345143);
                String string5 = StringResource2.getString(((ActionViewState.SwipeToSubmit) this.$action).getButtonText(), composer, StringResource.$stable);
                Modifier modifier2 = this.$modifier;
                composer.startReplaceGroup(-1633490746);
                boolean zChanged6 = composer.changed(this.$onButtonPressed) | composer.changedInstance(this.$action);
                final Function2<ActionViewState, Integer, Unit> function25 = this.$onButtonPressed;
                final ActionViewState actionViewState6 = this.$action;
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt$Cta$1$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoQuickTradeActionBar4.C405771.invoke$lambda$13$lambda$12(function25, actionViewState6);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceGroup();
                CryptoQuickTradeSwipeToSubmit3.m25973CryptoQuickTradeSwipeToSubmitvz2T9sI(string5, modifier2, 0.0f, 0.0f, (Function0) objRememberedValue6, composer, 0, 12);
                composer.endReplaceGroup();
            } else {
                if (!Intrinsics.areEqual(actionViewState, ActionViewState.Empty.INSTANCE)) {
                    if (actionViewState instanceof ActionViewState.Continue) {
                        composer.startReplaceGroup(-1675335161);
                        composer.endReplaceGroup();
                        throw new IllegalStateException("Continue not supported in quick trade");
                    }
                    if (actionViewState instanceof ActionViewState.Review) {
                        composer.startReplaceGroup(-1675332475);
                        composer.endReplaceGroup();
                        throw new IllegalStateException("Review not supported in quick trade");
                    }
                    composer.startReplaceGroup(-1675436102);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-395826457);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function2 function2, ActionViewState actionViewState) {
            function2.invoke(actionViewState, 0);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Function2 function2, ActionViewState actionViewState) {
            function2.invoke(actionViewState, 0);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(Function2 function2, ActionViewState actionViewState) {
            function2.invoke(actionViewState, 0);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10$lambda$7$lambda$6(Function2 function2, ActionViewState actionViewState, ActionViewState.QuickTrade quickTrade) {
            function2.invoke(actionViewState, Integer.valueOf(quickTrade.getIndex()));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10$lambda$9$lambda$8(Function2 function2, ActionViewState actionViewState, ActionViewState.QuickTrade quickTrade) {
            function2.invoke(actionViewState, Integer.valueOf(quickTrade.getIndex()));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12(Function2 function2, ActionViewState actionViewState) {
            function2.invoke(actionViewState, 0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Cta(final ActionViewState actionViewState, final Function2<? super ActionViewState, ? super Integer, Unit> function2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1280901394);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(actionViewState) : composerStartRestartGroup.changedInstance(actionViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1280901394, i3, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.Cta (CryptoQuickTradeActionBar.kt:70)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-538055687, true, new C405771(actionViewState, function2, modifier), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeActionBar4.Cta$lambda$5(actionViewState, function2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: SingleButton-KsoMrH8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m25963SingleButtonKsoMrH8(final String str, final Color color, final Color color2, final BentoButtons.Type type2, final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Color color3;
        Color color4;
        boolean z2;
        Function0<Unit> function02;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1404267777);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            color3 = color;
        } else {
            color3 = color;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(color3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            color4 = color2;
        } else {
            color4 = color2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(color4) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(type2.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
            }
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1404267777, i3, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.SingleButton (CryptoQuickTradeActionBar.kt:167)");
                }
                Modifier modifier5 = modifier4;
                BentoButtonKt.BentoButton(new BentoButtonState(str2, (BentoButtons.Icon.Size16) null, type2, z2, false, color3, (Color) null, color4, (TextStyle) null, (Color) null, false, 1874, (DefaultConstructorMarker) null), function02, SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), (String) null, composerStartRestartGroup, BentoButtonState.$stable | ((i3 >> 12) & 112), 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoQuickTradeActionBar4.SingleButton_KsoMrH8$lambda$6(str, color, color2, type2, z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            BentoButtonKt.BentoButton(new BentoButtonState(str2, (BentoButtons.Icon.Size16) null, type2, z2, false, color3, (Color) null, color4, (TextStyle) null, (Color) null, false, 1874, (DefaultConstructorMarker) null), function02, SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), (String) null, composerStartRestartGroup, BentoButtonState.$stable | ((i3 >> 12) & 112), 8);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void CryptoQuickTradeActionBarPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2040453764);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2040453764, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarPreview (CryptoQuickTradeActionBar.kt:183)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoQuickTradeActionBar.INSTANCE.m25954getLambda$999152444$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeActionBar4.CryptoQuickTradeActionBarPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CryptoQuickTradeActionBarAnimationPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-716261722);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-716261722, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarAnimationPreview (CryptoQuickTradeActionBar.kt:239)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoQuickTradeActionBar.INSTANCE.getLambda$1167353950$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeActionBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeActionBar4.CryptoQuickTradeActionBarAnimationPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

package com.robinhood.android.portfolio.pnl;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;
import p479j$.time.Month;

/* compiled from: Tooltips.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aS\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\"\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "", "showTooltip", "Lkotlin/Function0;", "", "onClick", "onAppear", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "", "markdownId", "j$/time/LocalDate", WebsocketGatewayConstants.DATA_KEY, "profitAndLossAverageCostTooltip", "(Landroidx/compose/ui/Modifier;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/rosetta/eventlogging/Screen;ILj$/time/LocalDate;)Landroidx/compose/ui/Modifier;", "onTextClick", "ProfitAndLossAverageCostTooltipContent", "(ILcom/robinhood/rosetta/eventlogging/Screen;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "kotlin.jvm.PlatformType", "pnlAverageCostTooltipExpirationDate", "Lj$/time/LocalDate;", "", "PNL_AVERAGE_COST_TOOLTIP_TEST_TAG", "Ljava/lang/String;", "AVERAGE_COST_TOOL_TIP", "AVERAGE_COST_TOOL_TIP_LEARN_MORE", "lib-profit-and-loss_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnl.TooltipsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class Tooltips {
    public static final String AVERAGE_COST_TOOL_TIP = "average-cost-tool-tip";
    public static final String AVERAGE_COST_TOOL_TIP_LEARN_MORE = "average-cost-tool-tip-learn-more";
    public static final String PNL_AVERAGE_COST_TOOLTIP_TEST_TAG = "pnl-average-cost-tooltip";
    private static final LocalDate pnlAverageCostTooltipExpirationDate = LocalDate.m3378of(2026, Month.AUGUST, 1);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfitAndLossAverageCostTooltipContent$lambda$5(int i, Screen screen, Function0 function0, int i2, Composer composer, int i3) {
        ProfitAndLossAverageCostTooltipContent(i, screen, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Modifier profitAndLossAverageCostTooltip$default(Modifier modifier, Boolean bool, Function0 function0, Function0 function02, Screen screen, int i, LocalDate localDate, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            localDate = LocalDate.now();
        }
        return profitAndLossAverageCostTooltip(modifier, bool, function0, function02, screen, i, localDate);
    }

    public static final Modifier profitAndLossAverageCostTooltip(Modifier modifier, final Boolean bool, final Function0<Unit> onClick, final Function0<Unit> onAppear, final Screen screen, final int i, final LocalDate data) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onAppear, "onAppear");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(data, "data");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.portfolio.pnl.TooltipsKt.profitAndLossAverageCostTooltip.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i2) {
                Modifier modifierM26519popupTooltipBgaGok8;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(779999555);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(779999555, i2, -1, "com.robinhood.android.portfolio.pnl.profitAndLossAverageCostTooltip.<anonymous> (Tooltips.kt:40)");
                }
                if (data.isBefore(Tooltips.pnlAverageCostTooltipExpirationDate)) {
                    Boolean bool2 = bool;
                    Function0<Unit> function0 = onAppear;
                    PopupPositioning popupPositioning = PopupPositioning.ABOVE;
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(50);
                    final int i3 = i;
                    final Screen screen2 = screen;
                    final Function0<Unit> function02 = onClick;
                    modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(composed, (16232 & 1) != 0 ? Boolean.TRUE : bool2, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    } : null, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    } : function0, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : popupPositioning, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : fM7995constructorimpl, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ComposableLambda3.rememberComposableLambda(-1097044631, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.TooltipsKt.profitAndLossAverageCostTooltip.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i4) {
                            if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1097044631, i4, -1, "com.robinhood.android.portfolio.pnl.profitAndLossAverageCostTooltip.<anonymous>.<anonymous> (Tooltips.kt:47)");
                            }
                            Tooltips.ProfitAndLossAverageCostTooltipContent(i3, screen2, function02, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54));
                } else {
                    modifierM26519popupTooltipBgaGok8 = composed;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM26519popupTooltipBgaGok8;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProfitAndLossAverageCostTooltipContent(final int i, Screen screen, Function0<Unit> function0, Composer composer, final int i2) {
        int i3;
        final Screen screen2;
        Composer composer2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(1859199929);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screen) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1859199929, i4, -1, "com.robinhood.android.portfolio.pnl.ProfitAndLossAverageCostTooltipContent (Tooltips.kt:67)");
            }
            final UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Modifier.Companion companion = Modifier.INSTANCE;
            screen2 = screen;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, screen, null, null, new Component(Component.ComponentType.TOOLTIP, AVERAGE_COST_TOOL_TIP, null, 4, null), null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.portfolio.pnl.TooltipsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Tooltips.m2373xc2febb90((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTestTag = TestTag3.testTag(SemanticsModifier6.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), PNL_AVERAGE_COST_TOOLTIP_TEST_TAG);
            String strStringResource = StringResources_androidKt.stringResource(i, composerStartRestartGroup, i4 & 14);
            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), 0, 0L, 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 30);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screen2) | composerStartRestartGroup.changedInstance(uriHandler);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.portfolio.pnl.TooltipsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Tooltips.m2374xab919dd0(current, screen2, uriHandler, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            function02 = function0;
            BentoMarkdownText2.BentoMarkdownText(strStringResource, modifierTestTag, markdownStyleM21100withTextStylesYhh7B2I, function02, (Function1<? super String, Unit>) objRememberedValue2, composer2, (MarkdownStyle.$stable << 6) | ((i4 << 3) & 7168), 0);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            screen2 = screen;
            function02 = function0;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnl.TooltipsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Tooltips.ProfitAndLossAverageCostTooltipContent$lambda$5(i, screen2, function02, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProfitAndLossAverageCostTooltipContent$lambda$4$lambda$1$lambda$0 */
    public static final Unit m2373xc2febb90(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProfitAndLossAverageCostTooltipContent$lambda$4$lambda$3$lambda$2 */
    public static final Unit m2374xab919dd0(EventLogger eventLogger, Screen screen, UriHandler uriHandler, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.TOOLTIP, AVERAGE_COST_TOOL_TIP_LEARN_MORE, null, 4, null), null, null, false, 57, null);
        uriHandler.openUri(uri);
        return Unit.INSTANCE;
    }
}

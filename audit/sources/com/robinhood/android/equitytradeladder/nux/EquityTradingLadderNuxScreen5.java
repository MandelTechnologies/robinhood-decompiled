package com.robinhood.android.equitytradeladder.nux;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.BackHandler;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.equitytradeladder.C15889R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.component.text.Markdown3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.loading.Nux2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityTradingLadderNuxScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"EquityTradingLadderNuxScreen", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/utils/resource/StringResource;", "onContinueClick", "Lkotlin/Function0;", "onBack", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EquityTradingLadderNuxScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.nux.EquityTradingLadderNuxScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityTradingLadderNuxScreen5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradingLadderNuxScreen$lambda$0(StringResource stringResource, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityTradingLadderNuxScreen(stringResource, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradingLadderNuxScreenPreview$lambda$1(int i, Composer composer, int i2) {
        EquityTradingLadderNuxScreenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityTradingLadderNuxScreen(final StringResource disclosure, final Function0<Unit> onContinueClick, final Function0<Unit> onBack, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(1018318138);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(disclosure) : composerStartRestartGroup.changedInstance(disclosure) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1018318138, i3, -1, "com.robinhood.android.equitytradeladder.nux.EquityTradingLadderNuxScreen (EquityTradingLadderNuxScreen.kt:45)");
                }
                int i5 = i3;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, null, ComposableLambda3.rememberComposableLambda(-968953451, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.nux.EquityTradingLadderNuxScreenKt.EquityTradingLadderNuxScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-968953451, i6, -1, "com.robinhood.android.equitytradeladder.nux.EquityTradingLadderNuxScreen.<anonymous> (EquityTradingLadderNuxScreen.kt:48)");
                        }
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        StringResource stringResource = disclosure;
                        Function0<Unit> function0 = onContinueClick;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, composer3, 6, 2);
                        BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(StringResources6.getTextAsString(stringResource, composer3, StringResource.$stable), modifierM21622defaultHorizontalPaddingWMci_g0, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), C20690R.attr.textAppearanceRegularSmall, 17, 0, 0, null, composer3, 196608, 448);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer3, 0), SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM())), 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1468631285, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.nux.EquityTradingLadderNuxScreenKt.EquityTradingLadderNuxScreen.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1468631285, i7, -1, "com.robinhood.android.equitytradeladder.nux.EquityTradingLadderNuxScreen.<anonymous> (EquityTradingLadderNuxScreen.kt:71)");
                        }
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), paddingValues);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Nux2.Nux(SizeKt.fillMaxWidth$default(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), 0.0f, 1, null), null, composer3, 0, 2);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i8).m21592getMediumD9Ej5fM()), composer3, 0);
                        String strStringResource = StringResources_androidKt.stringResource(C15889R.string.equity_ladder_nux_welcome, composer3, 0);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer3, 6, 1);
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getDisplayCapsuleLarge(), composer3, 0, 0, 8124);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(12)), composer3, 6);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15889R.string.equity_ladder_nux_description, composer3, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer3, 6, 1), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextM(), composer3, 0, 0, 8124);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306752, 507);
                composer2 = composerStartRestartGroup;
                BackHandler.BackHandler(false, onBack, composer2, (i5 >> 3) & 112, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.nux.EquityTradingLadderNuxScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityTradingLadderNuxScreen5.EquityTradingLadderNuxScreen$lambda$0(disclosure, onContinueClick, onBack, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = i3;
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, null, ComposableLambda3.rememberComposableLambda(-968953451, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.nux.EquityTradingLadderNuxScreenKt.EquityTradingLadderNuxScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-968953451, i6, -1, "com.robinhood.android.equitytradeladder.nux.EquityTradingLadderNuxScreen.<anonymous> (EquityTradingLadderNuxScreen.kt:48)");
                    }
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    StringResource stringResource = disclosure;
                    Function0<Unit> function0 = onContinueClick;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, composer3, 6, 2);
                    BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(StringResources6.getTextAsString(stringResource, composer3, StringResource.$stable), modifierM21622defaultHorizontalPaddingWMci_g0, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), C20690R.attr.textAppearanceRegularSmall, 17, 0, 0, null, composer3, 196608, 448);
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer3, 0), SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM())), 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1468631285, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.nux.EquityTradingLadderNuxScreenKt.EquityTradingLadderNuxScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                    int i7;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1468631285, i7, -1, "com.robinhood.android.equitytradeladder.nux.EquityTradingLadderNuxScreen.<anonymous> (EquityTradingLadderNuxScreen.kt:71)");
                    }
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), paddingValues);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Nux2.Nux(SizeKt.fillMaxWidth$default(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), 0.0f, 1, null), null, composer3, 0, 2);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i8).m21592getMediumD9Ej5fM()), composer3, 0);
                    String strStringResource = StringResources_androidKt.stringResource(C15889R.string.equity_ladder_nux_welcome, composer3, 0);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer3, 6, 1);
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getDisplayCapsuleLarge(), composer3, 0, 0, 8124);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(12)), composer3, 6);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15889R.string.equity_ladder_nux_description, composer3, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer3, 6, 1), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextM(), composer3, 0, 0, 8124);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306752, 507);
            composer2 = composerStartRestartGroup;
            BackHandler.BackHandler(false, onBack, composer2, (i52 >> 3) & 112, 1);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void EquityTradingLadderNuxScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-989682090);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-989682090, i, -1, "com.robinhood.android.equitytradeladder.nux.EquityTradingLadderNuxScreenPreview (EquityTradingLadderNuxScreen.kt:101)");
            }
            Markwon markwonCreate = Markwon.create((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            Intrinsics.checkNotNullExpressionValue(markwonCreate, "create(...)");
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{Markdown3.getLocalMarkwon().provides(markwonCreate), BentoSpannedText.getLocalSpannedTextProvider().provides(EquityTradingLadderNuxScreen4.INSTANCE)}, EquityTradingLadderNuxScreen.INSTANCE.m14061getLambda$1262941802$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.nux.EquityTradingLadderNuxScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradingLadderNuxScreen5.EquityTradingLadderNuxScreenPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

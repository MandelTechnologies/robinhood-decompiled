package com.robinhood.android.onboarding.p205ui.postfundupsell.goldupsell;

import android.net.Uri;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.onboarding.p205ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionComposable;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.Haptics;
import com.robinhood.models.onboardingupsell.ApiChooseApyScreenContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InfoTag;
import com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OnboardingUpsellGoldRateSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a@\u0010\u0016\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u00142\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/models/onboardingupsell/ApiChooseApyScreenContent;", "state", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/OnboardingFundingUpsellAction;", "actionHandler", "", "isRhfMaxOnboardingStyle", "Landroidx/compose/ui/Modifier;", "modifier", "", "OnboardingUpsellGoldRateSelectionComposable", "(Lcom/robinhood/models/onboardingupsell/ApiChooseApyScreenContent;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/onboardingupsell/ApiChooseApyScreenContent$ApiChooseApyScreenRow;", "Lkotlin/Function1;", "onAccountTypeSelected", "RateSelectionCard", "(Lcom/robinhood/models/onboardingupsell/ApiChooseApyScreenContent$ApiChooseApyScreenRow;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "content", EquityOrderFormRowState2.SelectionRowTestTag, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OnboardingUpsellGoldRateSelectionComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingUpsellGoldRateSelectionComposable$lambda$9(ApiChooseApyScreenContent apiChooseApyScreenContent, SduiActionHandler sduiActionHandler, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OnboardingUpsellGoldRateSelectionComposable(apiChooseApyScreenContent, sduiActionHandler, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RateSelectionCard$lambda$10(ApiChooseApyScreenContent.ApiChooseApyScreenRow apiChooseApyScreenRow, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RateSelectionCard(apiChooseApyScreenRow, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionRow$lambda$13(Function0 function0, Function3 function3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SelectionRow(function0, function3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnboardingUpsellGoldRateSelectionComposable(final ApiChooseApyScreenContent state, final SduiActionHandler<? super OnboardingFundingUpsellAction> actionHandler, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Composer composer2;
        RichText subtitle;
        Modifier.Companion companion;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        final UriHandler uriHandler;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1878940989);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1878940989, i3, -1, "com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionComposable (OnboardingUpsellGoldRateSelectionComposable.kt:47)");
                }
                ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Alignment.Horizontal centerHorizontally = !z ? companion2.getCenterHorizontally() : companion2.getStart();
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                int iM7919getCentere0LSkKk = !z ? TextAlign.INSTANCE.m7919getCentere0LSkKk() : TextAlign.INSTANCE.m7924getStarte0LSkKk();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                BentoRichText.m15949BentoRichText0sCZWFg(state.getTitle(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 5, null), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, iM7919getCentere0LSkKk, 0, 0L, null, null, null, 0, 0, null, 16744447, null), 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composerStartRestartGroup, 0, 1016);
                composer2 = composerStartRestartGroup;
                subtitle = state.getSubtitle();
                composer2.startReplaceGroup(505035399);
                if (subtitle != null) {
                    companion = companion4;
                } else {
                    companion = companion4;
                    BentoRichText.m15949BentoRichText0sCZWFg(subtitle, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 7, null), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer2, i5).getTextM(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, iM7919getCentere0LSkKk, 0, 0L, null, null, null, 0, 0, null, 16744447, null), 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composer2, 0, 1016);
                    composer2 = composer2;
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), composer2, 6, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM()), companion2.getStart(), composer2, 0);
                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor4);
                }
                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy4, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                composer2.startReplaceGroup(88274055);
                for (ApiChooseApyScreenContent.ApiChooseApyScreenRow apiChooseApyScreenRow : state.getRows()) {
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer2.changedInstance(actionHandler);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new OnboardingUpsellGoldRateSelectionComposable2(actionHandler);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    RateSelectionCard(apiChooseApyScreenRow, (Function1) objRememberedValue2, null, composer2, 0, 4);
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endNode();
                uriHandler = (UriHandler) composer2.consume(CompositionLocalsKt.getLocalUriHandler());
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 7, null);
                RichText disclosure = state.getDisclosure();
                TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composer2, i6).getTextS(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
                long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer2, i6).m21426getFg20d7_KjU();
                long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composer2, i6).m21426getFg20d7_KjU();
                composer2.startReplaceGroup(5004770);
                zChangedInstance = composer2.changedInstance(uriHandler);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OnboardingUpsellGoldRateSelectionComposable.m2214x81b8998d(uriHandler, (Uri) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                composer3 = composer2;
                BentoRichText.m15949BentoRichText0sCZWFg(disclosure, modifierM5146paddingqDBjuR0$default, textStyleM7655copyp1EtxEg$default, jM21426getFg20d7_KjU, jM21426getFg20d7_KjU2, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composer3, 0, 480);
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OnboardingUpsellGoldRateSelectionComposable.OnboardingUpsellGoldRateSelectionComposable$lambda$9(state, actionHandler, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Modifier modifierNavigationBarsPadding2 = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy5 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor5 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy5, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Column5.weight$default(column62, companion42, 1.0f, false, 2, null), scrollStateRememberScrollState2, false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    if (!z) {
                    }
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default3 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion42, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally, composerStartRestartGroup, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default3);
                    Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy32, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                        int iM7919getCentere0LSkKk2 = !z ? TextAlign.INSTANCE.m7919getCentere0LSkKk() : TextAlign.INSTANCE.m7924getStarte0LSkKk();
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        BentoRichText.m15949BentoRichText0sCZWFg(state.getTitle(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 5, null), TextStyle.m7655copyp1EtxEg$default(bentoTheme3.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, iM7919getCentere0LSkKk2, 0, 0L, null, null, null, 0, 0, null, 16744447, null), 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composerStartRestartGroup, 0, 1016);
                        composer2 = composerStartRestartGroup;
                        subtitle = state.getSubtitle();
                        composer2.startReplaceGroup(505035399);
                        if (subtitle != null) {
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme3.getSpacing(composer2, i52).m21590getDefaultD9Ej5fM(), composer2, 6, 0);
                        MeasurePolicy measurePolicyColumnMeasurePolicy42 = Column2.columnMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme3.getSpacing(composer2, i52).m21593getSmallD9Ej5fM()), companion22.getStart(), composer2, 0);
                        currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap42 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                        Function0<ComposeUiNode> constructor42 = companion32.getConstructor();
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy42, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash4 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl4.getInserting()) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion32.getSetModifier());
                            composer2.startReplaceGroup(88274055);
                            while (r0.hasNext()) {
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            composer2.endNode();
                            uriHandler = (UriHandler) composer2.consume(CompositionLocalsKt.getLocalUriHandler());
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default22 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                            int i62 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default22, 0.0f, 0.0f, 0.0f, bentoTheme22.getSpacing(composer2, i62).m21590getDefaultD9Ej5fM(), 7, null);
                            RichText disclosure2 = state.getDisclosure();
                            TextStyle textStyleM7655copyp1EtxEg$default2 = TextStyle.m7655copyp1EtxEg$default(bentoTheme22.getTypography(composer2, i62).getTextS(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
                            long jM21426getFg20d7_KjU3 = bentoTheme22.getColors(composer2, i62).m21426getFg20d7_KjU();
                            long jM21426getFg20d7_KjU22 = bentoTheme22.getColors(composer2, i62).m21426getFg20d7_KjU();
                            composer2.startReplaceGroup(5004770);
                            zChangedInstance = composer2.changedInstance(uriHandler);
                            objRememberedValue = composer2.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionComposableKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return OnboardingUpsellGoldRateSelectionComposable.m2214x81b8998d(uriHandler, (Uri) obj);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                                composer2.endReplaceGroup();
                                composer3 = composer2;
                                BentoRichText.m15949BentoRichText0sCZWFg(disclosure2, modifierM5146paddingqDBjuR0$default2, textStyleM7655copyp1EtxEg$default2, jM21426getFg20d7_KjU3, jM21426getFg20d7_KjU22, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composer3, 0, 480);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier4;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OnboardingUpsellGoldRateSelectionComposable$lambda$8$lambda$7$lambda$6 */
    public static final Unit m2214x81b8998d(UriHandler uriHandler, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String string2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        uriHandler.openUri(string2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RateSelectionCard(final ApiChooseApyScreenContent.ApiChooseApyScreenRow state, final Function1<? super OnboardingFundingUpsellAction, Unit> onAccountTypeSelected, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAccountTypeSelected, "onAccountTypeSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1572622904);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAccountTypeSelected) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1572622904, i3, -1, "com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.RateSelectionCard (OnboardingUpsellGoldRateSelectionComposable.kt:132)");
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(state.getLogging_identifier(), null, null, null, new Component(Component.ComponentType.ROW, state.getLogging_identifier(), null, 4, null), null, 46, null), ComposableLambda3.rememberComposableLambda(1197579491, true, new C228121(onAccountTypeSelected, state, modifier3), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OnboardingUpsellGoldRateSelectionComposable.RateSelectionCard$lambda$10(state, onAccountTypeSelected, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(state.getLogging_identifier(), null, null, null, new Component(Component.ComponentType.ROW, state.getLogging_identifier(), null, 4, null), null, 46, null), ComposableLambda3.rememberComposableLambda(1197579491, true, new C228121(onAccountTypeSelected, state, modifier3), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: OnboardingUpsellGoldRateSelectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionComposableKt$RateSelectionCard$1 */
    static final class C228121 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<OnboardingFundingUpsellAction, Unit> $onAccountTypeSelected;
        final /* synthetic */ ApiChooseApyScreenContent.ApiChooseApyScreenRow $state;

        /* JADX WARN: Multi-variable type inference failed */
        C228121(Function1<? super OnboardingFundingUpsellAction, Unit> function1, ApiChooseApyScreenContent.ApiChooseApyScreenRow apiChooseApyScreenRow, Modifier modifier) {
            this.$onAccountTypeSelected = function1;
            this.$state = apiChooseApyScreenRow;
            this.$modifier = modifier;
        }

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
                ComposerKt.traceEventStart(1197579491, i, -1, "com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.RateSelectionCard.<anonymous> (OnboardingUpsellGoldRateSelectionComposable.kt:139)");
            }
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onAccountTypeSelected) | composer.changedInstance(this.$state);
            final Function1<OnboardingFundingUpsellAction, Unit> function1 = this.$onAccountTypeSelected;
            final ApiChooseApyScreenContent.ApiChooseApyScreenRow apiChooseApyScreenRow = this.$state;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionComposableKt$RateSelectionCard$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OnboardingUpsellGoldRateSelectionComposable.C228121.invoke$lambda$1$lambda$0(function1, apiChooseApyScreenRow);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            final Modifier modifier = this.$modifier;
            final ApiChooseApyScreenContent.ApiChooseApyScreenRow apiChooseApyScreenRow2 = this.$state;
            OnboardingUpsellGoldRateSelectionComposable.SelectionRow((Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(-1314127937, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionComposableKt.RateSelectionCard.1.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                    invoke(row5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 SelectionRow, Composer composer2, int i2) {
                    int i3;
                    Intrinsics.checkNotNullParameter(SelectionRow, "$this$SelectionRow");
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer2.changed(SelectionRow) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i3 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1314127937, i3, -1, "com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.RateSelectionCard.<anonymous>.<anonymous> (OnboardingUpsellGoldRateSelectionComposable.kt:144)");
                    }
                    Modifier modifierWeight$default = Row5.weight$default(SelectionRow, modifier, 1.0f, false, 2, null);
                    ApiChooseApyScreenContent.ApiChooseApyScreenRow apiChooseApyScreenRow3 = apiChooseApyScreenRow2;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
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
                    InfoTag<GenericAction> info_tag = apiChooseApyScreenRow3.getInfo_tag();
                    composer2.startReplaceGroup(-578373372);
                    if (info_tag != null) {
                        SduiComponent3.SduiComponent(info_tag, null, null, composer2, 0, 6);
                        Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    String text = apiChooseApyScreenRow3.getTitle().getText();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextM(), composer2, 24576, 0, 8170);
                    BentoText2.m20747BentoText38GnDrw(apiChooseApyScreenRow3.getSubtitle().getText(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextS(), composer2, 0, 0, 8186);
                    composer2.endNode();
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme.getColors(composer2, i4).m21427getFg30d7_KjU(), null, null, false, composer2, BentoIcon4.Size16.$stable | 48, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), null, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, ApiChooseApyScreenContent.ApiChooseApyScreenRow apiChooseApyScreenRow) {
            function1.invoke(apiChooseApyScreenRow.getAction());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectionRow(final Function0<Unit> function0, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(484162204);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(484162204, i3, -1, "com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.SelectionRow (OnboardingUpsellGoldRateSelectionComposable.kt:179)");
                }
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierClip = Clip.clip(BorderKt.m4876borderxT4_qwU(modifier3, fM7995constructorimpl, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), roundedCornerShapeM5327RoundedCornerShape0680j_4), roundedCornerShapeM5327RoundedCornerShape0680j_4);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) == 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OnboardingUpsellGoldRateSelectionComposable.SelectionRow$lambda$12$lambda$11(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5143paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierClip, true, null, null, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), 6, null), null, true, false, false, true, false, null, 109, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM());
                int i6 = ((i3 << 6) & 7168) | 384;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                function3.invoke(Row6.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OnboardingUpsellGoldRateSelectionComposable.SelectionRow$lambda$13(function0, function3, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierClip2 = Clip.clip(BorderKt.m4876borderxT4_qwU(modifier3, fM7995constructorimpl2, Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), roundedCornerShapeM5327RoundedCornerShape0680j_42), roundedCornerShapeM5327RoundedCornerShape0680j_42);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) == 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OnboardingUpsellGoldRateSelectionComposable.SelectionRow$lambda$12$lambda$11(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5143paddingVpY3zN42 = androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierClip2, true, null, null, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), 6, null), null, true, false, false, true, false, null, 109, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM());
                int i62 = ((i3 << 6) & 7168) | 384;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    function3.invoke(Row6.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i62 >> 6) & 112) | 6));
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionRow$lambda$12$lambda$11(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}

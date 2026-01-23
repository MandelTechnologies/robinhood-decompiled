package com.robinhood.android.chart.blackwidowadvancedchart.onboarding;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.IconButton5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.chart.blackwidowadvancedchart.C10614R;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.AnimationExoPlayer2;
import com.robinhood.compose.common.AnimationExoPlayerConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BlackWidowAdvanceChartNuxComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006²\u0006\n\u0010\u0007\u001a\u00020\bX\u008a\u008e\u0002"}, m3636d2 = {"BlackWidowAdvanceChartNuxComposable", "", "onBackPressed", "Lkotlin/Function0;", "onContinue", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "titleFontSize", "Landroidx/compose/ui/unit/TextUnit;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvanceChartNuxComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BlackWidowAdvanceChartNuxComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlackWidowAdvanceChartNuxComposable$lambda$12(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        BlackWidowAdvanceChartNuxComposable(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BlackWidowAdvanceChartNuxComposable(final Function0<Unit> onBackPressed, final Function0<Unit> onContinue, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(-198004010);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onBackPressed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-198004010, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvanceChartNuxComposable (BlackWidowAdvanceChartNuxComposable.kt:52)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null));
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composerStartRestartGroup, i3).getJet(), null, 2, null), 0.0f, 1, null), 0.5f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            BentoImage.BentoImage(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C10614R.drawable.nux_image_asset), null, null, null, 0, null, composerStartRestartGroup, 0, 62), null, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, 0.0f, null, composerStartRestartGroup, 432, 120);
            AnimationExoPlayerConfig animationExoPlayerConfig = new AnimationExoPlayerConfig(0, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvanceChartNuxComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BlackWidowAdvanceChartNuxComposable.m1805xce26ae40(context, (ExoPlayer) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimationExoPlayer2.AnimationExoPlayer(animationExoPlayerConfig, modifierFillMaxWidth$default, false, 0, null, null, (Function1) objRememberedValue, composerStartRestartGroup, AnimationExoPlayerConfig.$stable | 48, 60);
            composerStartRestartGroup.endNode();
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getColors(composerStartRestartGroup, i3).m21372getBg20d7_KjU(), null, 2, null), 0.0f, composerStartRestartGroup, 0, 1), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(TextUnit.m8068boximpl(TextUnit2.getSp(45)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strStringResource = StringResources_androidKt.stringResource(C10963R.string.mac_nux_title, composerStartRestartGroup, 0);
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayMartinaLarge(), 0L, m1806x257cc914(snapshotState), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            TextAlign.Companion companion5 = TextAlign.INSTANCE;
            TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk());
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvanceChartNuxComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BlackWidowAdvanceChartNuxComposable.m1808x59dd9f86(snapshotState, (TextLayoutResult) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, textAlignM7912boximpl, 0, false, 0, 0, (Function1) objRememberedValue3, 0, textStyleM7655copyp1EtxEg$default, composerStartRestartGroup, 0, 48, 6076);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10963R.string.mac_nux_body, composerStartRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16316);
            composerStartRestartGroup.endNode();
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getColors(composerStartRestartGroup, i3).m21372getBg20d7_KjU(), null, 2, null), 0.0f, composerStartRestartGroup, 0, 1);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
            BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(StringResources_androidKt.stringResource(C10963R.string.mac_nux_disclosure, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), C20690R.attr.textAppearanceRegularSmall, 17, 0, 0, null, composerStartRestartGroup, 196608, 450);
            BentoButtonKt.BentoButton(new BentoButtonState(StringResources_androidKt.stringResource(C10963R.string.max_nux_button_text, composerStartRestartGroup, 0), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2046, (DefaultConstructorMarker) null), onContinue, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 1, null), (String) null, composerStartRestartGroup, BentoButtonState.$stable | (i2 & 112), 8);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(BlackWidowAdvanceChartNuxComposable3.INSTANCE.m1809xe081ea11(), boxScopeInstance.align(companion, companion2.getTopCenter()), ComposableLambda3.rememberComposableLambda(-1501821987, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvanceChartNuxComposableKt$BlackWidowAdvanceChartNuxComposable$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i4) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i4 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1501821987, i4, -1, "com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvanceChartNuxComposable.<anonymous>.<anonymous> (BlackWidowAdvanceChartNuxComposable.kt:146)");
                    }
                    IconButton5.IconButton(onBackPressed, null, false, null, null, BlackWidowAdvanceChartNuxComposable3.INSTANCE.m1810xbddb166a(), composer3, 196608, 30);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, true, false, null, null, 0L, null, composerStartRestartGroup, 196998, 0, 2008);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.onboarding.BlackWidowAdvanceChartNuxComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlackWidowAdvanceChartNuxComposable.BlackWidowAdvanceChartNuxComposable$lambda$12(onBackPressed, onContinue, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BlackWidowAdvanceChartNuxComposable$lambda$11$lambda$10$lambda$2$lambda$1$lambda$0 */
    public static final Unit m1805xce26ae40(Context context, ExoPlayer AnimationExoPlayer) {
        Intrinsics.checkNotNullParameter(AnimationExoPlayer, "$this$AnimationExoPlayer");
        AnimationExoPlayer.setMediaItem(MediaItem.fromUri(context.getString(C10963R.string.mac_nux_video_asset_url)));
        AnimationExoPlayer.prepare();
        AnimationExoPlayer.setPlayWhenReady(true);
        return Unit.INSTANCE;
    }

    /* renamed from: BlackWidowAdvanceChartNuxComposable$lambda$11$lambda$10$lambda$8$lambda$4 */
    private static final long m1806x257cc914(SnapshotState<TextUnit> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* renamed from: BlackWidowAdvanceChartNuxComposable$lambda$11$lambda$10$lambda$8$lambda$5 */
    private static final void m1807x257cc915(SnapshotState<TextUnit> snapshotState, long j) {
        snapshotState.setValue(TextUnit.m8068boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BlackWidowAdvanceChartNuxComposable$lambda$11$lambda$10$lambda$8$lambda$7$lambda$6 */
    public static final Unit m1808x59dd9f86(SnapshotState snapshotState, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getLineCount() > 2) {
            m1807x257cc915(snapshotState, TextUnit2.getSp(Math.max(3.0f, TextUnit.m8074getValueimpl(m1806x257cc914(snapshotState)) - 1)));
        }
        return Unit.INSTANCE;
    }
}

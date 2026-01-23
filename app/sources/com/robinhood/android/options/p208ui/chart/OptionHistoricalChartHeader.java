package com.robinhood.android.options.p208ui.chart;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.options.C22993R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionHistoricalChartHeader.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001aq\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"eyebrowPlaceholderText", "", "headerPlaceholderText", "subheaderPlaceholderText", "cursorHeaderPlaceholderText", "OptionHistoricalChartHeaderPlaceholder", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "OptionHistoricalChartHeader", "underlyingInfo", "Landroidx/compose/ui/text/AnnotatedString;", "onUnderlyingInfoClicked", "Lkotlin/Function0;", "onLateCloseInfoClicked", "optionInstrumentTitle", "", "showLateCloseInfoTag", "", "state", "Lcom/robinhood/android/charts/cursor/CursorData;", "tertiaryValueTooltip", "Lcom/robinhood/android/charts/cursor/CursorRowModifiers$TertiaryValueTooltip;", "displayCurrencyCode", "showDisplayCurrencyLabel", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/CharSequence;ZLcom/robinhood/android/charts/cursor/CursorData;Lcom/robinhood/android/charts/cursor/CursorRowModifiers$TertiaryValueTooltip;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.chart.OptionHistoricalChartHeaderKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionHistoricalChartHeader {
    private static final String cursorHeaderPlaceholderText = "$0.75 (0.75%) Today";
    private static final String eyebrowPlaceholderText = "ABCD $172.75 (+10%)";
    private static final String headerPlaceholderText = "ABCD $170 Call";
    private static final String subheaderPlaceholderText = "$100.00";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionHistoricalChartHeader$lambda$11(Modifier modifier, AnnotatedString annotatedString, Function0 function0, Function0 function02, CharSequence charSequence, boolean z, CursorData cursorData, CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip, String str, boolean z2, int i, Composer composer, int i2) {
        OptionHistoricalChartHeader(modifier, annotatedString, function0, function02, charSequence, z, cursorData, tertiaryValueTooltip, str, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionHistoricalChartHeaderPlaceholder$lambda$1(Modifier modifier, int i, Composer composer, int i2) {
        OptionHistoricalChartHeaderPlaceholder(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OptionHistoricalChartHeaderPlaceholder(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(593108898);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(593108898, i2, -1, "com.robinhood.android.options.ui.chart.OptionHistoricalChartHeaderPlaceholder (OptionHistoricalChartHeader.kt:34)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(eyebrowPlaceholderText, ModifiersKt.bentoPillPlaceholder(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM(), 7, null), true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composer2, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(headerPlaceholderText, ModifiersKt.bentoPillPlaceholder(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i3).m21595getXsmallD9Ej5fM(), 7, null), true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getDisplayCapsuleLarge(), composer2, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(subheaderPlaceholderText, ModifiersKt.bentoPillPlaceholder(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i3).m21595getXsmallD9Ej5fM(), 7, null), true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getDisplayCapsuleLarge(), composer2, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(cursorHeaderPlaceholderText, ModifiersKt.bentoPillPlaceholder(companion2, true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextM(), composer2, 6, 0, 8188);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartHeaderKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionHistoricalChartHeader.OptionHistoricalChartHeaderPlaceholder$lambda$1(modifier, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OptionHistoricalChartHeader(final Modifier modifier, final AnnotatedString annotatedString, final Function0<Unit> onUnderlyingInfoClicked, final Function0<Unit> onLateCloseInfoClicked, final CharSequence charSequence, final boolean z, final CursorData cursorData, CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip, final String displayCurrencyCode, final boolean z2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip2;
        int i3;
        BentoTheme bentoTheme;
        CursorData.SubDisplayText subDisplayText;
        CursorData cursorDataCopy$default;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onUnderlyingInfoClicked, "onUnderlyingInfoClicked");
        Intrinsics.checkNotNullParameter(onLateCloseInfoClicked, "onLateCloseInfoClicked");
        Intrinsics.checkNotNullParameter(displayCurrencyCode, "displayCurrencyCode");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2079252796);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(annotatedString) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onUnderlyingInfoClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onLateCloseInfoClicked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(charSequence) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? composerStartRestartGroup.changed(cursorData) : composerStartRestartGroup.changedInstance(cursorData) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (i & 16777216) == 0 ? composerStartRestartGroup.changed(tertiaryValueTooltip) : composerStartRestartGroup.changedInstance(tertiaryValueTooltip) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(displayCurrencyCode) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            tertiaryValueTooltip2 = tertiaryValueTooltip;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2079252796, i2, -1, "com.robinhood.android.options.ui.chart.OptionHistoricalChartHeader (OptionHistoricalChartHeader.kt:79)");
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            int i5 = i2;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal start = companion.getStart();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), start, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z3 = true;
            boolean z4 = (i5 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartHeaderKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionHistoricalChartHeader.OptionHistoricalChartHeader$lambda$10$lambda$6$lambda$3$lambda$2(onUnderlyingInfoClicked);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion3, false, null, null, (Function0) objRememberedValue, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            AnnotatedString annotatedString2 = annotatedString == null ? new AnnotatedString.Builder(0, 1, null).toAnnotatedString() : annotatedString;
            TextStyle textS = bentoTheme2.getTypography(composerStartRestartGroup, i4).getTextS();
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            BentoText2.m20748BentoTextQnj7Zds(annotatedString2, null, null, null, companion4.getSemiBold(), null, null, 0, false, 0, 0, null, null, textS, composerStartRestartGroup, 24576, 0, 8174);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(935621470);
            if (z) {
                i3 = i5;
                bentoTheme = bentoTheme2;
                tertiaryValueTooltip2 = tertiaryValueTooltip;
                InfoTagsKt.m20826BentoInlineInfoTagyZUFuyM(StringResources_androidKt.stringResource(C22993R.string.options_graph_late_close_info_tag_text, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Integer.valueOf(C20690R.drawable.ic_rds_info_filled_16dp), null, false, null, onLateCloseInfoClicked, composerStartRestartGroup, (i5 << 9) & 3670016, 56);
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                tertiaryValueTooltip2 = tertiaryValueTooltip;
                i3 = i5;
                bentoTheme = bentoTheme2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            BentoText2.m20747BentoText38GnDrw(String.valueOf(charSequence), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getDisplayCapsuleMedium(), composer2, 0, 0, 8190);
            composer2.startReplaceGroup(-1033215479);
            if (cursorData == null) {
                cursorDataCopy$default = null;
            } else {
                CursorData.SubDisplayText tertiaryValue = cursorData.getTertiaryValue();
                composer2.startReplaceGroup(-1033212651);
                if (tertiaryValue == null) {
                    subDisplayText = null;
                } else {
                    composer2.startReplaceGroup(-138524416);
                    if (tertiaryValue.getDescription() == null) {
                        tertiaryValue = CursorData.SubDisplayText.copy$default(tertiaryValue, CursorData.IconDisplayText.m11999copyiJQMabo$default(tertiaryValue.getMain(), null, 0L, null, null, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer2, i4).getTextM(), 0L, 0L, companion4.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), 15, null), null, null, 6, null);
                    }
                    composer2.endReplaceGroup();
                    subDisplayText = tertiaryValue;
                }
                composer2.endReplaceGroup();
                cursorDataCopy$default = CursorData.copy$default(cursorData, null, null, null, subDisplayText, null, null, 55, null);
            }
            composer2.endReplaceGroup();
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Boolean boolValueOf = Boolean.valueOf(tertiaryValueTooltip2 != null);
            composer2.startReplaceGroup(-1746271574);
            if ((i3 & 29360128) != 8388608 && ((i3 & 16777216) == 0 || !composer2.changedInstance(tertiaryValueTooltip2))) {
                z3 = false;
            }
            boolean zChangedInstance = z3 | composer2.changedInstance(current) | composer2.changedInstance(userInteractionEventDescriptor);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new OptionHistoricalChartHeader2(tertiaryValueTooltip2, current, userInteractionEventDescriptor, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
            int i6 = i3 >> 3;
            ChartCursorDataHeaderKt.ChartCursorDataHeaderSection(cursorDataCopy$default, null, tertiaryValueTooltip2 != null ? tertiaryValueTooltip2 : CursorRowModifiers.Default.INSTANCE, null, null, null, null, displayCurrencyCode, z2, composer2, CursorData.$stable | (i6 & 29360128) | (i6 & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip3 = tertiaryValueTooltip2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartHeaderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionHistoricalChartHeader.OptionHistoricalChartHeader$lambda$11(modifier, annotatedString, onUnderlyingInfoClicked, onLateCloseInfoClicked, charSequence, z, cursorData, tertiaryValueTooltip3, displayCurrencyCode, z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionHistoricalChartHeader$lambda$10$lambda$6$lambda$3$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}

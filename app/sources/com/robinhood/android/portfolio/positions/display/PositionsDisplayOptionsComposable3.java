package com.robinhood.android.portfolio.positions.display;

import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.portfolio.PositionsDisplayOptions;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.portfolio.positions.C25825R;
import com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsViewState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PositionsDisplayOptionsComposable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a7\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\r\u001a'\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0015\"\u0010\u0010\u0016\u001a\u00020\u00068\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"PositionsDisplayOptionsComposable", "", "state", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState;", "onDisplayTypeSelected", "Lkotlin/Function1;", "", "Lcom/robinhood/android/models/portfolio/PositionDisplayType;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PositionsDisplayOptionsReadyComposable", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState$Ready;", "(Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState$Ready;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "valueDisplayRowMeta", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/models/portfolio/PositionsDisplayOptions$PositionsDisplayOption;", "isActiveItem", "", "isMcwFeatureAvailable", "(Lcom/robinhood/android/models/portfolio/PositionsDisplayOptions$PositionsDisplayOption;ZZLandroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "LoadingSpinnerTestTag", "lib-positions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PositionsDisplayOptionsComposable3 {
    public static final String LoadingSpinnerTestTag = "loading-spinner";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionsDisplayOptionsComposable$lambda$0(PositionsDisplayOptionsViewState positionsDisplayOptionsViewState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PositionsDisplayOptionsComposable(positionsDisplayOptionsViewState, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionsDisplayOptionsReadyComposable$lambda$6(PositionsDisplayOptionsViewState.Ready ready, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        PositionsDisplayOptionsReadyComposable(ready, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PositionsDisplayOptionsComposable(final PositionsDisplayOptionsViewState state, final Function1<? super String, Unit> onDisplayTypeSelected, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDisplayTypeSelected, "onDisplayTypeSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1946619066);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisplayTypeSelected) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1946619066, i3, -1, "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsComposable (PositionsDisplayOptionsComposable.kt:32)");
            }
            if (Intrinsics.areEqual(state, PositionsDisplayOptionsViewState.Loading.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(1080437726);
                LocalShowPlaceholder.Loadable(true, TestTag3.testTag(modifier, "loading-spinner"), null, PositionsDisplayOptionsComposable.INSTANCE.getLambda$210413746$lib_positions_externalDebug(), composerStartRestartGroup, 3078, 4);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                modifier2 = modifier;
            } else {
                if (!(state instanceof PositionsDisplayOptionsViewState.Ready)) {
                    composerStartRestartGroup.startReplaceGroup(-1904811640);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1904796270);
                modifier2 = modifier;
                PositionsDisplayOptionsReadyComposable((PositionsDisplayOptionsViewState.Ready) state, onDisplayTypeSelected, modifier2, composerStartRestartGroup, i3 & 1008, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PositionsDisplayOptionsComposable3.PositionsDisplayOptionsComposable$lambda$0(state, onDisplayTypeSelected, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PositionsDisplayOptionsReadyComposable(PositionsDisplayOptionsViewState.Ready ready, final Function1<? super String, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        PositionsDisplayOptionsViewState.Ready ready2;
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-415948732);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            ready2 = ready;
        } else if ((i & 6) == 0) {
            ready2 = ready;
            i3 = (composerStartRestartGroup.changedInstance(ready2) ? 4 : 2) | i;
        } else {
            ready2 = ready;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-415948732, i3, -1, "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsReadyComposable (PositionsDisplayOptionsComposable.kt:60)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 1, null);
                int i6 = i3;
                String title = ready2.getTitle();
                TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall();
                modifier3 = modifier4;
                BentoText2.m20747BentoText38GnDrw(title, modifierM5144paddingVpY3zN4$default, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 0, 0, 8124);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(515034410);
                for (final PositionsDisplayOptions.PositionsDisplayOption positionsDisplayOption : ready2.getDisplayOptions()) {
                    boolean zAreEqual = Intrinsics.areEqual(positionsDisplayOption.getQueryValue(), ready2.getSelectedDisplayType());
                    String displayValue = positionsDisplayOption.getDisplayValue();
                    BentoBaseRowState.Meta metaValueDisplayRowMeta = valueDisplayRowMeta(positionsDisplayOption, zAreEqual, ready2.isMcwFeatureAvailable(), composer2, 0);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = ((i6 & 112) == 32) | composer2.changedInstance(positionsDisplayOption);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PositionsDisplayOptionsComposable3.m2385x9a07dca8(function1, positionsDisplayOption);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composer2.endReplaceGroup();
                    Composer composer3 = composer2;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, displayValue, null, null, metaValueDisplayRowMeta, null, false, false, false, 0L, !zAreEqual ? function0 : null, composer3, BentoBaseRowState.Meta.$stable << 15, 0, 2011);
                    composer2 = composer3;
                }
                composer2.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final PositionsDisplayOptionsViewState.Ready ready3 = ready2;
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PositionsDisplayOptionsComposable3.PositionsDisplayOptionsReadyComposable$lambda$6(ready3, function1, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 1, null);
                int i62 = i3;
                String title2 = ready2.getTitle();
                TextStyle displayCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall();
                modifier3 = modifier4;
                BentoText2.m20747BentoText38GnDrw(title2, modifierM5144paddingVpY3zN4$default2, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, 0, 0, 8124);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(515034410);
                while (r22.hasNext()) {
                }
                composer2.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PositionsDisplayOptionsReadyComposable$lambda$5$lambda$4$lambda$2$lambda$1 */
    public static final Unit m2385x9a07dca8(Function1 function1, PositionsDisplayOptions.PositionsDisplayOption positionsDisplayOption) {
        function1.invoke(positionsDisplayOption.getQueryValue());
        return Unit.INSTANCE;
    }

    private static final BentoBaseRowState.Meta valueDisplayRowMeta(PositionsDisplayOptions.PositionsDisplayOption positionsDisplayOption, boolean z, boolean z2, Composer composer, int i) throws Resources.NotFoundException {
        BentoBaseRowState.Meta singleLineAndIcon;
        long jM21427getFg30d7_KjU;
        composer.startReplaceGroup(1317417723);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1317417723, i, -1, "com.robinhood.android.portfolio.positions.display.valueDisplayRowMeta (PositionsDisplayOptionsComposable.kt:94)");
        }
        if (z2) {
            composer.startReplaceGroup(-219511807);
            composer.startReplaceGroup(-976910517);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
            try {
                String metaLabelValue = positionsDisplayOption.getMetaLabelValue();
                if (metaLabelValue == null) {
                    metaLabelValue = "";
                }
                builder.append(metaLabelValue);
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composer.endReplaceGroup();
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = z ? ServerToBentoAssetMapper2.BUBBLE_RADIO_BUTTON_24 : ServerToBentoAssetMapper2.BUBBLE_EMPTY_24;
                String strStringResource = StringResources_androidKt.stringResource(C25825R.string.selected_positions_display_type, new Object[]{positionsDisplayOption.getDisplayValue()}, composer, 0);
                if (z) {
                    composer.startReplaceGroup(-976891811);
                    jM21427getFg30d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                } else {
                    composer.startReplaceGroup(-976890978);
                    jM21427getFg30d7_KjU = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
                }
                composer.endReplaceGroup();
                singleLineAndIcon = new BentoBaseRowState.Meta.SingleLineAndIcon(annotatedString, serverToBentoAssetMapper2, strStringResource, Color.m6701boximpl(jM21427getFg30d7_KjU), (DefaultConstructorMarker) null);
                composer.endReplaceGroup();
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        } else {
            composer.startReplaceGroup(-218812416);
            BentoBaseRowState.Meta icon = z ? new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.CHECKMARK_24, StringResources_androidKt.stringResource(C25825R.string.selected_positions_display_type, new Object[]{positionsDisplayOption.getDisplayValue()}, composer, 0), (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null) : null;
            composer.endReplaceGroup();
            singleLineAndIcon = icon;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return singleLineAndIcon;
    }
}

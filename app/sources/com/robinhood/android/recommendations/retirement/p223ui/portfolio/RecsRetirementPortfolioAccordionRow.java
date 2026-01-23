package com.robinhood.android.recommendations.retirement.p223ui.portfolio;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Rotate;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.recommendations.retirement.C26015R;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementPortfolio;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RecsRetirementPortfolioAccordionRow.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\u001a1\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a5\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0011\u001a5\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002"}, m3636d2 = {"PortfolioRow", "", "currentSelectedId", "Ljava/util/UUID;", "asset", "Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementPortfolio$PortfolioAsset;", "callbacks", "Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/UUID;Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementPortfolio$PortfolioAsset;Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ExpandableContent", "description", "", "learnMoreButtonText", "onClickLearnMore", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OutlinedSquare", "fillColor", "Landroidx/compose/ui/graphics/Color;", "size", "Landroidx/compose/ui/unit/Dp;", "borderThickness", "OutlinedSquare-oMI9zvI", "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V", "feature-recommendations-for-retirement_externalDebug", "rotation", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioAccordionRowKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RecsRetirementPortfolioAccordionRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandableContent$lambda$6(String str, String str2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ExpandableContent(str, str2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedSquare_oMI9zvI$lambda$7(Modifier modifier, long j, float f, float f2, int i, int i2, Composer composer, int i3) {
        m17811OutlinedSquareoMI9zvI(modifier, j, f, f2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioRow$lambda$4(UUID uuid, ApiRecsRetirementPortfolio.PortfolioAsset portfolioAsset, RecsRetirementPortfolioContent3 recsRetirementPortfolioContent3, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        PortfolioRow(uuid, portfolioAsset, recsRetirementPortfolioContent3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioRow(final UUID uuid, final ApiRecsRetirementPortfolio.PortfolioAsset asset, final RecsRetirementPortfolioContent3 callbacks, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        final boolean zAreEqual;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1844304941);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(uuid) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(asset) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 256 : 128;
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
                    ComposerKt.traceEventStart(1844304941, i3, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.PortfolioRow (RecsRetirementPortfolioAccordionRow.kt:53)");
                }
                zAreEqual = Intrinsics.areEqual(asset.getInstrument_id(), uuid);
                final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!zAreEqual ? 180.0f : 360.0f, null, 0.0f, "portfolio_row_caret_rotation", null, composerStartRestartGroup, 3072, 22);
                String strStringResource = StringResources_androidKt.stringResource(C26015R.string.recs_retirement_portfolio_reveal_row_primary, new Object[]{asset.getSymbol(), asset.getTitle()}, composerStartRestartGroup, 0);
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strStringResource, asset.getSymbol(), 0, false, 6, (Object) null);
                final AnnotatedString annotatedString = new AnnotatedString(strStringResource, CollectionsKt.listOf(new AnnotatedString.Range(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null), iIndexOf$default, asset.getSymbol().length() + iIndexOf$default)), null, 4, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = ((i3 & 896) != 256) | composerStartRestartGroup.changed(zAreEqual) | composerStartRestartGroup.changedInstance(asset);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioAccordionRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecsRetirementPortfolioAccordionRow.PortfolioRow$lambda$3$lambda$2$lambda$1(zAreEqual, callbacks, asset);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue, 7, null), null, null, ComposableLambda3.rememberComposableLambda(128456352, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioAccordionRowKt$PortfolioRow$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(128456352, i5, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.PortfolioRow.<anonymous>.<anonymous> (RecsRetirementPortfolioAccordionRow.kt:89)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer2, i6).getTextM(), composer2, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1221241634, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioAccordionRowKt$PortfolioRow$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1221241634, i5, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.PortfolioRow.<anonymous>.<anonymous> (RecsRetirementPortfolioAccordionRow.kt:96)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ApiRecsRetirementPortfolio.PortfolioAsset portfolioAsset = asset;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
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
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26015R.string.recs_retirement_portfolio_reveal_row_meta, new Object[]{Integer.valueOf((int) (portfolioAsset.getWeight() * 100.0f))}, composer2, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                        com.robinhood.models.serverdriven.experimental.api.Color colorFromServerValue = com.robinhood.models.serverdriven.experimental.api.Color.INSTANCE.fromServerValue(portfolioAsset.getColor());
                        composer2.startReplaceGroup(1727758422);
                        Color composeColor = colorFromServerValue == null ? null : SduiColors2.toComposeColor(colorFromServerValue, composer2, 0);
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1727756336);
                        long jet = composeColor == null ? bentoTheme.getColors(composer2, i6).getJet() : composeColor.getValue();
                        composer2.endReplaceGroup();
                        RecsRetirementPortfolioAccordionRow.m17811OutlinedSquareoMI9zvI(modifierM5146paddingqDBjuR0$default, jet, 0.0f, 0.0f, composer2, 0, 12);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1767634275, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioAccordionRowKt$PortfolioRow$1$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1767634275, i5, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.PortfolioRow.<anonymous>.<anonymous> (RecsRetirementPortfolioAccordionRow.kt:113)");
                        }
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_DOWN_16), "Caret", BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU(), Rotate.rotate(Modifier.INSTANCE, RecsRetirementPortfolioAccordionRow.PortfolioRow$lambda$0(snapshotState4AnimateFloatAsState)), null, false, composer2, BentoIcon4.Size16.$stable | 48, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), !zAreEqual, false, false, null, composerStartRestartGroup, 1772544, 0, 1814);
                AnimatedVisibilityKt.AnimatedVisibility(column6, zAreEqual, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambda3.rememberComposableLambda(325169275, true, new RecsRetirementPortfolioAccordionRow5(asset, callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioAccordionRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecsRetirementPortfolioAccordionRow.PortfolioRow$lambda$4(uuid, asset, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            zAreEqual = Intrinsics.areEqual(asset.getInstrument_id(), uuid);
            final SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(!zAreEqual ? 180.0f : 360.0f, null, 0.0f, "portfolio_row_caret_rotation", null, composerStartRestartGroup, 3072, 22);
            String strStringResource2 = StringResources_androidKt.stringResource(C26015R.string.recs_retirement_portfolio_reveal_row_primary, new Object[]{asset.getSymbol(), asset.getTitle()}, composerStartRestartGroup, 0);
            int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) strStringResource2, asset.getSymbol(), 0, false, 6, (Object) null);
            final AnnotatedString annotatedString2 = new AnnotatedString(strStringResource2, CollectionsKt.listOf(new AnnotatedString.Range(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null), iIndexOf$default2, asset.getSymbol().length() + iIndexOf$default2)), null, 4, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
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
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = ((i3 & 896) != 256) | composerStartRestartGroup.changed(zAreEqual) | composerStartRestartGroup.changedInstance(asset);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioAccordionRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecsRetirementPortfolioAccordionRow.PortfolioRow$lambda$3$lambda$2$lambda$1(zAreEqual, callbacks, asset);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier4;
                    BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default2, false, null, null, (Function0) objRememberedValue, 7, null), null, null, ComposableLambda3.rememberComposableLambda(128456352, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioAccordionRowKt$PortfolioRow$1$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(128456352, i5, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.PortfolioRow.<anonymous>.<anonymous> (RecsRetirementPortfolioAccordionRow.kt:89)");
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoText2.m20748BentoTextQnj7Zds(annotatedString2, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer2, i6).getTextM(), composer2, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1221241634, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioAccordionRowKt$PortfolioRow$1$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1221241634, i5, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.PortfolioRow.<anonymous>.<anonymous> (RecsRetirementPortfolioAccordionRow.kt:96)");
                            }
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ApiRecsRetirementPortfolio.PortfolioAsset portfolioAsset = asset;
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, companion22);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor22 = companion3.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor22);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion3.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26015R.string.recs_retirement_portfolio_reveal_row_meta, new Object[]{Integer.valueOf((int) (portfolioAsset.getWeight() * 100.0f))}, composer2, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion22, bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                            com.robinhood.models.serverdriven.experimental.api.Color colorFromServerValue = com.robinhood.models.serverdriven.experimental.api.Color.INSTANCE.fromServerValue(portfolioAsset.getColor());
                            composer2.startReplaceGroup(1727758422);
                            Color composeColor = colorFromServerValue == null ? null : SduiColors2.toComposeColor(colorFromServerValue, composer2, 0);
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(1727756336);
                            long jet = composeColor == null ? bentoTheme.getColors(composer2, i6).getJet() : composeColor.getValue();
                            composer2.endReplaceGroup();
                            RecsRetirementPortfolioAccordionRow.m17811OutlinedSquareoMI9zvI(modifierM5146paddingqDBjuR0$default, jet, 0.0f, 0.0f, composer2, 0, 12);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1767634275, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioAccordionRowKt$PortfolioRow$1$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1767634275, i5, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.PortfolioRow.<anonymous>.<anonymous> (RecsRetirementPortfolioAccordionRow.kt:113)");
                            }
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_DOWN_16), "Caret", BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU(), Rotate.rotate(Modifier.INSTANCE, RecsRetirementPortfolioAccordionRow.PortfolioRow$lambda$0(snapshotState4AnimateFloatAsState2)), null, false, composer2, BentoIcon4.Size16.$stable | 48, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), !zAreEqual, false, false, null, composerStartRestartGroup, 1772544, 0, 1814);
                    AnimatedVisibilityKt.AnimatedVisibility(column62, zAreEqual, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambda3.rememberComposableLambda(325169275, true, new RecsRetirementPortfolioAccordionRow5(asset, callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioRow$lambda$3$lambda$2$lambda$1(boolean z, RecsRetirementPortfolioContent3 recsRetirementPortfolioContent3, ApiRecsRetirementPortfolio.PortfolioAsset portfolioAsset) {
        if (z) {
            recsRetirementPortfolioContent3.onRowCollapsed();
        } else {
            recsRetirementPortfolioContent3.onRowExpanded(portfolioAsset.getInstrument_id());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float PortfolioRow$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExpandableContent(final String str, final String str2, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        String str4;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-331352297);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else if ((i & 6) == 0) {
            str3 = str;
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str4 = str2;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
                i4 = i2 & 8;
                if (i4 == 0) {
                    if ((i & 3072) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        composer2 = composerStartRestartGroup;
                    } else {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-331352297, i3, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.ExpandableContent (RecsRetirementPortfolioAccordionRow.kt:162)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
                        composer2 = composerStartRestartGroup;
                        Modifier modifier5 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(str3, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, i3 & 14, 0, 8188);
                        BentoTextButton2.m20715BentoTextButtonPIknLig(function02, str4, null, null, BentoTextButton3.Size.f5148S, false, null, composer2, ((i3 >> 6) & 14) | 24576 | (i3 & 112), 108);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioAccordionRowKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return RecsRetirementPortfolioAccordionRow.ExpandableContent$lambda$6(str, str2, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                modifier2 = modifier;
                if ((i3 & 1171) != 1170) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
                        composer2 = composerStartRestartGroup;
                        Modifier modifier52 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(str3, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composer2, i3 & 14, 0, 8188);
                        BentoTextButton2.m20715BentoTextButtonPIknLig(function02, str4, null, null, BentoTextButton3.Size.f5148S, false, null, composer2, ((i3 >> 6) & 14) | 24576 | (i3 & 112), 108);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i4 = i2 & 8;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i3 & 1171) != 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str4 = str2;
        if ((i2 & 4) == 0) {
        }
        function02 = function0;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: OutlinedSquare-oMI9zvI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17811OutlinedSquareoMI9zvI(Modifier modifier, final long j, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        float f3;
        float f4;
        Modifier modifier2;
        float fM21590getDefaultD9Ej5fM;
        final float fM7995constructorimpl;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2069628618);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                f3 = f;
                int i5 = composerStartRestartGroup.changed(f3) ? 256 : 128;
                i3 |= i5;
            } else {
                f3 = f;
            }
            i3 |= i5;
        } else {
            f3 = f;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                f4 = f2;
                i3 |= composerStartRestartGroup.changed(f4) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier2 = modifier;
                    fM21590getDefaultD9Ej5fM = f3;
                } else {
                    modifier2 = i4 == 0 ? Modifier.INSTANCE : modifier;
                    if ((i2 & 4) == 0) {
                        fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
                        i3 &= -897;
                    } else {
                        fM21590getDefaultD9Ej5fM = f3;
                    }
                    if (i6 == 0) {
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2069628618, i3, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.OutlinedSquare (RecsRetirementPortfolioAccordionRow.kt:188)");
                    }
                    BoxKt.Box(BorderKt.border(Background3.m4872backgroundbw27NRU$default(SizeKt.m5169size3ABfNKs(modifier2, fM21590getDefaultD9Ej5fM), j, null, 2, null), BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, Color.INSTANCE.m6716getBlack0d7_KjU()), RectangleShape2.getRectangleShape()), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = fM21590getDefaultD9Ej5fM;
                }
                fM7995constructorimpl = f4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                BoxKt.Box(BorderKt.border(Background3.m4872backgroundbw27NRU$default(SizeKt.m5169size3ABfNKs(modifier2, fM21590getDefaultD9Ej5fM), j, null, 2, null), BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, Color.INSTANCE.m6716getBlack0d7_KjU()), RectangleShape2.getRectangleShape()), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f5 = fM21590getDefaultD9Ej5fM;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                f5 = f3;
                fM7995constructorimpl = f4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioAccordionRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecsRetirementPortfolioAccordionRow.OutlinedSquare_oMI9zvI$lambda$7(modifier3, j, f5, fM7995constructorimpl, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        f4 = f2;
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i4 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if (i6 == 0) {
                    fM7995constructorimpl = f4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                BoxKt.Box(BorderKt.border(Background3.m4872backgroundbw27NRU$default(SizeKt.m5169size3ABfNKs(modifier2, fM21590getDefaultD9Ej5fM), j, null, 2, null), BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, Color.INSTANCE.m6716getBlack0d7_KjU()), RectangleShape2.getRectangleShape()), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f5 = fM21590getDefaultD9Ej5fM;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}

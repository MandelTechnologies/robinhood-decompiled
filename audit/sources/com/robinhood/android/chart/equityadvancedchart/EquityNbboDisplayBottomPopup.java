package com.robinhood.android.chart.equityadvancedchart;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContent2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.PlaceholderVerticalAlign;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLinkStyles;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
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
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EquityNbboDisplayBottomPopup.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u0084\u0002"}, m3636d2 = {"EquityNbboDisplayBottomPopup", "", "instrumentOrderState", "Lcom/robinhood/android/chart/equityadvancedchart/MacEquityOrderState;", "onNbboRefreshed", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/chart/equityadvancedchart/MacEquityOrderState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-equity-advanced-chart_externalDebug", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityNbboDisplayBottomPopupKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class EquityNbboDisplayBottomPopup {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityNbboDisplayBottomPopup$lambda$10(MacEquityOrderState macEquityOrderState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityNbboDisplayBottomPopup(macEquityOrderState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityNbboDisplayBottomPopup(final MacEquityOrderState instrumentOrderState, final Function0<Unit> onNbboRefreshed, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        BentoTheme bentoTheme;
        int i5;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        Composer.Companion companion;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        AnnotatedString.Builder builder;
        int iPushStyle;
        NbboSummary nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$1;
        String str;
        NbboSummary nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$12;
        boolean z;
        Object objRememberedValue3;
        int iPushLink;
        NbboSummary nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$13;
        Composer composer2;
        final Modifier modifier4;
        String nbboRefreshActionCopy;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentOrderState, "instrumentOrderState");
        Intrinsics.checkNotNullParameter(onNbboRefreshed, "onNbboRefreshed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1517733493);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrumentOrderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNbboRefreshed) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1517733493, i4, -1, "com.robinhood.android.chart.equityadvancedchart.EquityNbboDisplayBottomPopup (EquityNbboDisplayBottomPopup.kt:41)");
                }
                bentoTheme = BentoTheme.INSTANCE;
                i5 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier5, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null);
                modifier3 = modifier5;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
                NbboSummary nbboSummary = instrumentOrderState.getNbboSummary();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(nbboSummary);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(instrumentOrderState.getNbboSummary(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.equityadvancedchart.EquityNbboDisplayBottomPopupKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(ClickableKt.m4891clickableO2vRcR0$default(companion4, null, null, false, null, null, (Function0) objRememberedValue2, 28, null), 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 0, 0);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getCenter(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(848845669);
                builder = new AnnotatedString.Builder(0, 1, null);
                iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, (FontWeight) null, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS().m7663getFontStyle4Lr2A7w(), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65526, (DefaultConstructorMarker) null));
                try {
                    nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$1 = EquityNbboDisplayBottomPopup$lambda$9$lambda$1(snapshotState);
                    str = "";
                    if (nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$1 != null || (nbboPricesCopy = nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$1.getNbboPricesCopy()) == null) {
                        String nbboPricesCopy = "";
                    }
                    builder.append(nbboPricesCopy);
                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                    nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$12 = EquityNbboDisplayBottomPopup$lambda$9$lambda$1(snapshotState);
                    if (nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$12 != null || (nbboRefreshCopy = nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$12.getNbboRefreshCopy()) == null) {
                        String nbboRefreshCopy = "";
                    }
                    builder.append(nbboRefreshCopy);
                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS().m7663getFontStyle4Lr2A7w(), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61426, (DefaultConstructorMarker) null), null, null, null, 14, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z = (i4 & 112) == 32;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new LinkInteractionListener() { // from class: com.robinhood.android.chart.equityadvancedchart.EquityNbboDisplayBottomPopupKt$EquityNbboDisplayBottomPopup$1$2$1$2$1
                            @Override // androidx.compose.p011ui.text.LinkInteractionListener
                            public final void onClick(LinkAnnotation it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                onNbboRefreshed.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    iPushLink = builder.pushLink(new LinkAnnotation.Clickable("", textLinkStyles, (LinkInteractionListener) objRememberedValue3));
                    try {
                        nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$13 = EquityNbboDisplayBottomPopup$lambda$9$lambda$1(snapshotState);
                        if (nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$13 != null && (nbboRefreshActionCopy = nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$13.getNbboRefreshActionCopy()) != null) {
                            str = nbboRefreshActionCopy;
                        }
                        builder.append(str);
                        builder.append(PlaceholderUtils.XXShortPlaceholderText);
                        builder.pop(iPushLink);
                        InlineTextContent2.appendInlineContent$default(builder, "loading_indicator", null, 2, null);
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, extensions2.persistentMapOf(Tuples4.m3642to("loading_indicator", new InlineTextContent(new Placeholder(TextUnit2.getSp(16), TextUnit2.getSp(16), PlaceholderVerticalAlign.INSTANCE.m7577getCenterJ6kI3mc(), null), ComposableLambda3.rememberComposableLambda(-924366336, true, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.equityadvancedchart.EquityNbboDisplayBottomPopupKt$EquityNbboDisplayBottomPopup$1$2$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(String str2, Composer composer3, Integer num) {
                                invoke(str2, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(String it, Composer composer3, int i7) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((i7 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-924366336, i7, -1, "com.robinhood.android.chart.equityadvancedchart.EquityNbboDisplayBottomPopup.<anonymous>.<anonymous>.<anonymous> (EquityNbboDisplayBottomPopup.kt:97)");
                                }
                                if (EquityNbboDisplayBottomPopup.EquityNbboDisplayBottomPopup$lambda$9$lambda$1(snapshotState) == null || instrumentOrderState.getNbboLoading()) {
                                    BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5153XS, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU(), composer3, 48, 1);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54)))), null, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 0, 0, 6074);
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    } catch (Throwable th) {
                        builder.pop(iPushLink);
                        throw th;
                    }
                } catch (Throwable th2) {
                    builder.pop(iPushStyle);
                    throw th2;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.equityadvancedchart.EquityNbboDisplayBottomPopupKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityNbboDisplayBottomPopup.EquityNbboDisplayBottomPopup$lambda$10(instrumentOrderState, onNbboRefreshed, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            bentoTheme = BentoTheme.INSTANCE;
            i5 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifier5, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null);
            modifier3 = modifier5;
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                NbboSummary nbboSummary2 = instrumentOrderState.getNbboSummary();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(nbboSummary2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(instrumentOrderState.getNbboSummary(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(ClickableKt.m4891clickableO2vRcR0$default(companion42, null, null, false, null, null, (Function0) objRememberedValue2, 28, null), 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 0, 0);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getCenter(), companion22.getCenterVertically(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(848845669);
                        builder = new AnnotatedString.Builder(0, 1, null);
                        iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, (FontWeight) null, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS().m7663getFontStyle4Lr2A7w(), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65526, (DefaultConstructorMarker) null));
                        nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$1 = EquityNbboDisplayBottomPopup$lambda$9$lambda$1(snapshotState);
                        str = "";
                        if (nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$1 != null) {
                            String nbboPricesCopy2 = "";
                            builder.append(nbboPricesCopy2);
                            builder.append(PlaceholderUtils.XXShortPlaceholderText);
                            nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$12 = EquityNbboDisplayBottomPopup$lambda$9$lambda$1(snapshotState);
                            if (nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$12 != null) {
                                String nbboRefreshCopy2 = "";
                                builder.append(nbboRefreshCopy2);
                                builder.append(PlaceholderUtils.XXShortPlaceholderText);
                                Unit unit2 = Unit.INSTANCE;
                                builder.pop(iPushStyle);
                                TextLinkStyles textLinkStyles2 = new TextLinkStyles(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS().m7663getFontStyle4Lr2A7w(), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61426, (DefaultConstructorMarker) null), null, null, null, 14, null);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                if ((i4 & 112) == 32) {
                                }
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!z) {
                                    objRememberedValue3 = new LinkInteractionListener() { // from class: com.robinhood.android.chart.equityadvancedchart.EquityNbboDisplayBottomPopupKt$EquityNbboDisplayBottomPopup$1$2$1$2$1
                                        @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                        public final void onClick(LinkAnnotation it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            onNbboRefreshed.invoke();
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    composerStartRestartGroup.endReplaceGroup();
                                    iPushLink = builder.pushLink(new LinkAnnotation.Clickable("", textLinkStyles2, (LinkInteractionListener) objRememberedValue3));
                                    nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$13 = EquityNbboDisplayBottomPopup$lambda$9$lambda$1(snapshotState);
                                    if (nbboSummaryEquityNbboDisplayBottomPopup$lambda$9$lambda$13 != null) {
                                        str = nbboRefreshActionCopy;
                                    }
                                    builder.append(str);
                                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                                    builder.pop(iPushLink);
                                    InlineTextContent2.appendInlineContent$default(builder, "loading_indicator", null, 2, null);
                                    AnnotatedString annotatedString2 = builder.toAnnotatedString();
                                    composerStartRestartGroup.endReplaceGroup();
                                    composer2 = composerStartRestartGroup;
                                    BentoText2.m20748BentoTextQnj7Zds(annotatedString2, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, extensions2.persistentMapOf(Tuples4.m3642to("loading_indicator", new InlineTextContent(new Placeholder(TextUnit2.getSp(16), TextUnit2.getSp(16), PlaceholderVerticalAlign.INSTANCE.m7577getCenterJ6kI3mc(), null), ComposableLambda3.rememberComposableLambda(-924366336, true, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.equityadvancedchart.EquityNbboDisplayBottomPopupKt$EquityNbboDisplayBottomPopup$1$2$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(String str2, Composer composer3, Integer num) {
                                            invoke(str2, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(String it, Composer composer3, int i7) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            if ((i7 & 17) == 16 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-924366336, i7, -1, "com.robinhood.android.chart.equityadvancedchart.EquityNbboDisplayBottomPopup.<anonymous>.<anonymous>.<anonymous> (EquityNbboDisplayBottomPopup.kt:97)");
                                            }
                                            if (EquityNbboDisplayBottomPopup.EquityNbboDisplayBottomPopup$lambda$9$lambda$1(snapshotState) == null || instrumentOrderState.getNbboLoading()) {
                                                BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5153XS, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU(), composer3, 48, 1);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54)))), null, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 0, 0, 6074);
                                    composer2.endNode();
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier4 = modifier3;
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NbboSummary EquityNbboDisplayBottomPopup$lambda$9$lambda$1(SnapshotState<NbboSummary> snapshotState) {
        return snapshotState.getValue();
    }
}

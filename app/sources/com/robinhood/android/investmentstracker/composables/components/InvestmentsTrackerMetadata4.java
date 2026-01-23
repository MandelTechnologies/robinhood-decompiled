package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Divider5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentMetadataDetailsRowDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerDisconnectedDataDto;
import com.robinhood.android.investmentstracker.C19501R;
import com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerMetadataViewModel;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: InvestmentsTrackerMetadata.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a9\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"InvestmentsTrackerMetadataPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "InvestmentsTrackerMetadata", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerMetadataViewModel;", "nativeActionHandler", "Lkotlin/Function2;", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerNativeAction;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerMetadataViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-investments-tracker_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerMetadataKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerMetadata4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerMetadata$lambda$12(InvestmentsTrackerMetadataViewModel investmentsTrackerMetadataViewModel, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestmentsTrackerMetadata(investmentsTrackerMetadataViewModel, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerMetadataPreview$lambda$0(int i, Composer composer, int i2) {
        InvestmentsTrackerMetadataPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final void InvestmentsTrackerMetadataPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1928189606);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1928189606, i, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerMetadataPreview (InvestmentsTrackerMetadata.kt:36)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, InvestmentsTrackerMetadata.INSTANCE.m15601getLambda$1320015378$feature_investments_tracker_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerMetadataKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerMetadata4.InvestmentsTrackerMetadataPreview$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestmentsTrackerMetadata(final InvestmentsTrackerMetadataViewModel item, final Function2<? super InvestmentsTrackerNativeAction, Object, Unit> function2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        int i4;
        Modifier.Companion companion;
        final InvestmentsTrackerComponentMetadataDetailsRowDto investmentsTrackerComponentMetadataDetailsRowDto;
        int i5;
        char c;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function2<? super InvestmentsTrackerNativeAction, Object, Unit> nativeActionHandler = function2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(nativeActionHandler, "nativeActionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(938459900);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(nativeActionHandler) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(938459900, i3, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerMetadata (InvestmentsTrackerMetadata.kt:103)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String header = item.getDetails().getHeader();
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleMedium();
                FontWeight w500 = FontWeight.INSTANCE.getW500();
                Color colorM6701boximpl = Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU());
                Modifier modifier5 = modifier4;
                int i8 = 0;
                BentoText2.m20747BentoText38GnDrw(header, null, colorM6701boximpl, null, w500, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 24576, 0, 8170);
                Composer composer3 = composerStartRestartGroup;
                composer3.startReplaceGroup(-352598960);
                for (final InvestmentsTrackerComponentMetadataDetailsRowDto investmentsTrackerComponentMetadataDetailsRowDto2 : item.getDetails().getRows()) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme2.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top, companion4.getStart(), composer3, i8);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, i8);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Alignment.Vertical centerVertically = companion4.getCenterVertically();
                    composer3.startReplaceGroup(-1633490746);
                    int i10 = i3 & 112;
                    int i11 = (i10 == 32 ? 1 : i8) | (composer3.changedInstance(investmentsTrackerComponentMetadataDetailsRowDto2) ? 1 : 0);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (i11 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerMetadataKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InvestmentsTrackerMetadata4.InvestmentsTrackerMetadata$lambda$11$lambda$10$lambda$2$lambda$1(nativeActionHandler, investmentsTrackerComponentMetadataDetailsRowDto2);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion3, false, null, null, (Function0) objRememberedValue, 7, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer3, 48);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, i8);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierM4893clickableXHw0xAI$default);
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                    Modifier modifierWeight$default = Row5.weight$default(Row6.INSTANCE, companion3, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer3, i8);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, i8);
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                    Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composer3, i8);
                    int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer3, i8);
                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer3, companion3);
                    Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor5);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion5.getSetModifier());
                    String left_text = investmentsTrackerComponentMetadataDetailsRowDto2.getLeft_text();
                    TextStyle textM = bentoTheme2.getTypography(composer3, i9).getTextM();
                    long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer3, i9).m21425getFg0d7_KjU();
                    FontWeight.Companion companion6 = FontWeight.INSTANCE;
                    Composer composer4 = composer3;
                    BentoText2.m20747BentoText38GnDrw(left_text, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, companion6.getW400(), null, null, 0, false, 0, 0, null, 0, textM, composer4, 24576, 0, 8170);
                    Composer composer5 = composer4;
                    InvestmentsTrackerDisconnectedDataDto disconnected_data = investmentsTrackerComponentMetadataDetailsRowDto2.getDisconnected_data();
                    composer5.startReplaceGroup(-1169497577);
                    if (disconnected_data == null) {
                        i4 = i3;
                        companion = companion3;
                    } else {
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme2.getSpacing(composer5, i9).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                        String display_text = disconnected_data.getDisplay_text();
                        TextStyle textM2 = bentoTheme2.getTypography(composer5, i9).getTextM();
                        InvestmentsTrackerDisconnectedDataDto disconnected_data2 = investmentsTrackerComponentMetadataDetailsRowDto2.getDisconnected_data();
                        ThemedColorDto color = disconnected_data2 != null ? disconnected_data2.getColor() : null;
                        composer5.startReplaceGroup(-1169485608);
                        Color composeColor = color == null ? null : SduiColors2.toComposeColor(color, composer5, 0);
                        composer5.endReplaceGroup();
                        composer5.startReplaceGroup(-1169486513);
                        long jM21426getFg20d7_KjU = composeColor == null ? bentoTheme2.getColors(composer5, i9).m21426getFg20d7_KjU() : composeColor.getValue();
                        composer5.endReplaceGroup();
                        i4 = i3;
                        companion = companion3;
                        BentoText2.m20747BentoText38GnDrw(display_text, modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM2, composer5, 0, 0, 8184);
                        composer5 = composer5;
                        Unit unit = Unit.INSTANCE;
                    }
                    composer5.endReplaceGroup();
                    composer5.endNode();
                    composer5.startReplaceGroup(-483133428);
                    if (investmentsTrackerComponentMetadataDetailsRowDto2.getBottom_left_text().length() > 0) {
                        Composer composer6 = composer5;
                        BentoText2.m20747BentoText38GnDrw(investmentsTrackerComponentMetadataDetailsRowDto2.getBottom_left_text(), null, Color.m6701boximpl(bentoTheme2.getColors(composer5, i9).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer5, i9).getTextS(), composer6, 0, 0, 8186);
                        composer5 = composer6;
                    }
                    composer5.endReplaceGroup();
                    composer5.endNode();
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer5, 0);
                    int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer5, companion);
                    Function0<ComposeUiNode> constructor6 = companion5.getConstructor();
                    if (composer5.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor6);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer5);
                    Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyColumnMeasurePolicy4, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion5.getSetModifier());
                    composer5.startReplaceGroup(386881999);
                    InvestmentsTrackerDisconnectedDataDto disconnected_data3 = investmentsTrackerComponentMetadataDetailsRowDto2.getDisconnected_data();
                    if ((disconnected_data3 != null ? disconnected_data3.getInstitution_id() : null) != null) {
                        Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme2.getSpacing(composer5, i9).m21590getDefaultD9Ej5fM());
                        i5 = 0;
                        BentoButtonState bentoButtonState = new BentoButtonState(StringResources_androidKt.stringResource(C19501R.string.reconnect_button, composer5, 0), (BentoButtons.Icon.Size16) null, BentoButtons.Type.Secondary, false, false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2042, (DefaultConstructorMarker) null);
                        composer5.startReplaceGroup(-1633490746);
                        c = ' ';
                        investmentsTrackerComponentMetadataDetailsRowDto = investmentsTrackerComponentMetadataDetailsRowDto2;
                        boolean zChangedInstance = (i10 == 32) | composer5.changedInstance(investmentsTrackerComponentMetadataDetailsRowDto);
                        Object objRememberedValue2 = composer5.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerMetadataKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InvestmentsTrackerMetadata4.m2131x8cf87eb6(nativeActionHandler, investmentsTrackerComponentMetadataDetailsRowDto);
                                }
                            };
                            composer5.updateRememberedValue(objRememberedValue2);
                        }
                        composer5.endReplaceGroup();
                        BentoButtonKt.BentoButton(bentoButtonState, (Function0<Unit>) objRememberedValue2, modifierM5142padding3ABfNKs2, (String) null, composer5, BentoButtonState.$stable, 8);
                    } else {
                        investmentsTrackerComponentMetadataDetailsRowDto = investmentsTrackerComponentMetadataDetailsRowDto2;
                        i5 = 0;
                        c = ' ';
                    }
                    composer5.endReplaceGroup();
                    Composer composer7 = composer5;
                    int i12 = i5;
                    BentoText2.m20747BentoText38GnDrw(item.getSecurityFilter().getValueOrStars(investmentsTrackerComponentMetadataDetailsRowDto.getRight_text()), null, null, null, companion6.getW400(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer5, i9).getTextM(), composer7, 24576, 0, 8110);
                    composer7.endNode();
                    composer7.endNode();
                    composer7.startReplaceGroup(570106655);
                    if (!Intrinsics.areEqual(CollectionsKt.last((List) item.getDetails().getRows()), investmentsTrackerComponentMetadataDetailsRowDto)) {
                        Divider5.m5851HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme2.getSpacing(composer7, i9).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composer7, i9).m21373getBg30d7_KjU(), composer7, 48, 0);
                    }
                    composer7.endReplaceGroup();
                    composer7.endNode();
                    nativeActionHandler = function2;
                    composer3 = composer7;
                    i8 = i12;
                    i3 = i4;
                }
                composer2 = composer3;
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerMetadataKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestmentsTrackerMetadata4.InvestmentsTrackerMetadata$lambda$12(item, function2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs3 = PaddingKt.m5142padding3ABfNKs(modifier4, bentoTheme3.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy5 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor7 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy5, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap7, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier7, companion22.getSetModifier());
                Column6 column63 = Column6.INSTANCE;
                String header2 = item.getDetails().getHeader();
                TextStyle displayCapsuleMedium2 = bentoTheme3.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleMedium();
                FontWeight w5002 = FontWeight.INSTANCE.getW500();
                Color colorM6701boximpl2 = Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU());
                Modifier modifier52 = modifier4;
                int i82 = 0;
                BentoText2.m20747BentoText38GnDrw(header2, null, colorM6701boximpl2, null, w5002, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 24576, 0, 8170);
                Composer composer32 = composerStartRestartGroup;
                composer32.startReplaceGroup(-352598960);
                while (r25.hasNext()) {
                }
                composer2 = composer32;
                composer2.endReplaceGroup();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerMetadata$lambda$11$lambda$10$lambda$2$lambda$1(Function2 function2, InvestmentsTrackerComponentMetadataDetailsRowDto investmentsTrackerComponentMetadataDetailsRowDto) {
        function2.invoke(InvestmentsTrackerNativeAction.METADATA_SELECTED, investmentsTrackerComponentMetadataDetailsRowDto.getDeeplink());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InvestmentsTrackerMetadata$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6 */
    public static final Unit m2131x8cf87eb6(Function2 function2, InvestmentsTrackerComponentMetadataDetailsRowDto investmentsTrackerComponentMetadataDetailsRowDto) {
        String institution_id;
        InvestmentsTrackerNativeAction investmentsTrackerNativeAction = InvestmentsTrackerNativeAction.METADATA_RECONNECT_SELECTED;
        InvestmentsTrackerDisconnectedDataDto disconnected_data = investmentsTrackerComponentMetadataDetailsRowDto.getDisconnected_data();
        if (disconnected_data == null || (institution_id = disconnected_data.getInstitution_id()) == null) {
            institution_id = "";
        }
        function2.invoke(investmentsTrackerNativeAction, institution_id);
        return Unit.INSTANCE;
    }
}

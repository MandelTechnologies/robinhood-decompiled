package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerUpsellCardViewModel;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.CoilUtils2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestmentsTrackerUpsellCard.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a9\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"InvestmentsTrackerUpsellCardPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "InvestmentsTrackerUpsellCard", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerUpsellCardViewModel;", "nativeActionHandler", "Lkotlin/Function2;", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerNativeAction;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerUpsellCardViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-investments-tracker_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerUpsellCardKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerUpsellCard4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerUpsellCard$lambda$11(InvestmentsTrackerUpsellCardViewModel investmentsTrackerUpsellCardViewModel, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestmentsTrackerUpsellCard(investmentsTrackerUpsellCardViewModel, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerUpsellCardPreview$lambda$0(int i, Composer composer, int i2) {
        InvestmentsTrackerUpsellCardPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final void InvestmentsTrackerUpsellCardPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2087417754);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2087417754, i, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerUpsellCardPreview (InvestmentsTrackerUpsellCard.kt:38)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, InvestmentsTrackerUpsellCard.INSTANCE.m15607getLambda$2054293586$feature_investments_tracker_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerUpsellCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerUpsellCard4.InvestmentsTrackerUpsellCardPreview$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestmentsTrackerUpsellCard(final InvestmentsTrackerUpsellCardViewModel item, final Function2<? super InvestmentsTrackerNativeAction, Object, Unit> nativeActionHandler, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        String description;
        ImageLoader imageLoader;
        int i4;
        BentoTheme bentoTheme;
        int i5;
        Column6 column6;
        Modifier.Companion companion;
        int i6;
        int i7;
        String link_text;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        Object objRememberedValue2;
        final Function2<? super InvestmentsTrackerNativeAction, Object, Unit> function2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(nativeActionHandler, "nativeActionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(-782544178);
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
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-782544178, i3, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerUpsellCard (InvestmentsTrackerUpsellCard.kt:67)");
                }
                ImageLoader imageLoaderRememberImageLoader = CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme2.getColors(composerStartRestartGroup, i9).m21371getBg0d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM()), C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composerStartRestartGroup, i9).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)));
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i10 = i3 & 112;
                z = i10 != 32;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerUpsellCardKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestmentsTrackerUpsellCard4.InvestmentsTrackerUpsellCard$lambda$2$lambda$1(nativeActionHandler);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4876borderxT4_qwU, false, null, null, (Function0) objRememberedValue, 7, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
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
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
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
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Row5.weight$default(Row6.INSTANCE, PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                description = item.getItem().getDescription();
                composerStartRestartGroup.startReplaceGroup(-1170185646);
                if (description != null) {
                    imageLoader = imageLoaderRememberImageLoader;
                    i4 = i10;
                    bentoTheme = bentoTheme2;
                    i5 = i9;
                    column6 = column62;
                    companion = companion4;
                    i6 = 0;
                    i7 = 1;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1170184858);
                    if (description.length() > 0) {
                        i7 = 1;
                        imageLoader = imageLoaderRememberImageLoader;
                        i4 = i10;
                        companion = companion4;
                        column6 = column62;
                        bentoTheme = bentoTheme2;
                        i5 = i9;
                        i6 = 0;
                        BentoText2.m20747BentoText38GnDrw(description, PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 5, null), null, null, FontWeight.INSTANCE.getW400(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i9).getTextS(), composerStartRestartGroup, 24576, 0, 8172);
                        composerStartRestartGroup = composerStartRestartGroup;
                    } else {
                        imageLoader = imageLoaderRememberImageLoader;
                        i4 = i10;
                        bentoTheme = bentoTheme2;
                        i5 = i9;
                        column6 = column62;
                        companion = companion4;
                        i6 = 0;
                        i7 = 1;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                link_text = item.getItem().getLink_text();
                composerStartRestartGroup.startReplaceGroup(-1170167556);
                if (link_text != null) {
                    composerStartRestartGroup.startReplaceGroup(-1170166768);
                    if (link_text.length() > 0) {
                        Composer composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(link_text, null, null, null, FontWeight.INSTANCE.getW700(), TextDecoration.INSTANCE.getUnderline(), null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 221184, 0, 8142);
                        composerStartRestartGroup = composer2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, i6);
                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i6);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor4);
                }
                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.CLOSE_24);
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(column6.align(companion, companion2.getEnd()), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 9, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                if (i4 != 32) {
                    i7 = i6;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i7 == 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    function2 = nativeActionHandler;
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerUpsellCardKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestmentsTrackerUpsellCard4.m2135x39ee062b(function2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    function2 = nativeActionHandler;
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(size24, "", jM21425getFg0d7_KjU, ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue2, 7, null), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 48);
                ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(item.getItem().getImage_url(), imageLoader, null, null, null, 0, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE)), C2002Dp.m7995constructorimpl(100)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function2 = nativeActionHandler;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function2<? super InvestmentsTrackerNativeAction, Object, Unit> function22 = function2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerUpsellCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestmentsTrackerUpsellCard4.InvestmentsTrackerUpsellCard$lambda$11(item, function22, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ImageLoader imageLoaderRememberImageLoader2 = CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3);
            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
            int i92 = BentoTheme.$stable;
            Modifier modifier52 = modifier4;
            Modifier modifierM4876borderxT4_qwU2 = BorderKt.m4876borderxT4_qwU(PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme22.getColors(composerStartRestartGroup, i92).m21371getBg0d7_KjU(), null, 2, null), bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21590getDefaultD9Ej5fM()), C2002Dp.m7995constructorimpl(1), bentoTheme22.getColors(composerStartRestartGroup, i92).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)));
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i102 = i3 & 112;
            if (i102 != 32) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerUpsellCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InvestmentsTrackerUpsellCard4.InvestmentsTrackerUpsellCard$lambda$2$lambda$1(nativeActionHandler);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierM4876borderxT4_qwU2, false, null, null, (Function0) objRememberedValue, 7, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor5 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion32.getSetModifier());
                    Column6 column622 = Column6.INSTANCE;
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
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
                        Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(Row5.weight$default(Row6.INSTANCE, PaddingKt.m5146paddingqDBjuR0$default(companion42, bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null), 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getCenter(), companion22.getStart(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default2);
                        Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                            description = item.getItem().getDescription();
                            composerStartRestartGroup.startReplaceGroup(-1170185646);
                            if (description != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            link_text = item.getItem().getLink_text();
                            composerStartRestartGroup.startReplaceGroup(-1170167556);
                            if (link_text != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, i6);
                            currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i6);
                            CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                            Function0<ComposeUiNode> constructor42 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy32, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash4 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl4.getInserting()) {
                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion32.getSetModifier());
                                BentoIcon4.Size24 size242 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.CLOSE_24);
                                long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(column6.align(companion, companion22.getEnd()), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 9, null);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                if (i4 != 32) {
                                }
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (i7 == 0) {
                                    function2 = nativeActionHandler;
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerUpsellCardKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InvestmentsTrackerUpsellCard4.m2135x39ee062b(function2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    composerStartRestartGroup.endReplaceGroup();
                                    BentoIcon2.m20644BentoIconFU0evQE(size242, "", jM21425getFg0d7_KjU2, ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default2, false, null, null, (Function0) objRememberedValue2, 7, null), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 48);
                                    ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(item.getItem().getImage_url(), imageLoader, null, null, null, 0, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE)), C2002Dp.m7995constructorimpl(100)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerUpsellCard$lambda$2$lambda$1(Function2 function2) {
        InvestmentsTrackerNativeAction investmentsTrackerNativeAction = InvestmentsTrackerNativeAction.CONNECT_ACCOUNT_CLICKED;
        Unit unit = Unit.INSTANCE;
        function2.invoke(investmentsTrackerNativeAction, unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InvestmentsTrackerUpsellCard$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6 */
    public static final Unit m2135x39ee062b(Function2 function2) {
        InvestmentsTrackerNativeAction investmentsTrackerNativeAction = InvestmentsTrackerNativeAction.UPSELL_CLOSE_CARD_CLICKED;
        Unit unit = Unit.INSTANCE;
        function2.invoke(investmentsTrackerNativeAction, unit);
        return unit;
    }
}

package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import android.annotation.SuppressLint;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PlanSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a;\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0001¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"PlanSelectorCell", "", "imageRes", "", "title", "", "subtitle", "plan", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/SelectedPlan;", "isSelected", "", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/SelectedPlan;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PlanSelectorComposable", "maxHeight", "", "annualFeeMicro", "", "selectedPlan", "onPlanSelected", "Lkotlin/Function1;", "(DJLcom/robinhood/android/creditcard/ui/creditapplication/finalterms/SelectedPlan;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PLAN_SELECTOR_COMPOSABLE_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PlanSelectorComposableKt {
    public static final String PLAN_SELECTOR_COMPOSABLE_TEST_TAG = "plan-selector-composable-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlanSelectorCell$lambda$2(int i, String str, String str2, SelectedPlan selectedPlan, boolean z, Modifier modifier, Function0 function0, int i2, int i3, Composer composer, int i4) {
        PlanSelectorCell(i, str, str2, selectedPlan, z, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlanSelectorComposable$lambda$5(double d, long j, SelectedPlan selectedPlan, Function1 function1, int i, Composer composer, int i2) {
        PlanSelectorComposable(d, j, selectedPlan, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    @SuppressLint({"VisibleForTests"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlanSelectorCell(final int i, final String title, final String subtitle, final SelectedPlan plan, final boolean z, Modifier modifier, Function0<Unit> function0, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        final EventLogger current;
        boolean zChangedInstance;
        Object objRememberedValue;
        long ccGoldBg3;
        final Modifier modifier3;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(plan, "plan");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1441928246);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(subtitle) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(plan.ordinal()) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i6 = i3 & 32;
        if (i6 != 0) {
            i4 |= 196608;
        } else {
            if ((196608 & i2) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i5 = i3 & 64;
            if (i5 != 0) {
                if ((1572864 & i2) == 0) {
                    function02 = function0;
                    i4 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                }
                if ((599187 & i4) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    function03 = i5 == 0 ? null : function02;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1441928246, i4, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.PlanSelectorCell (PlanSelectorComposable.kt:54)");
                    }
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    boolean z2 = function03 == null;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = ((i4 & 3670016) != 1048576) | ((i4 & 7168) != 2048) | composerStartRestartGroup.changedInstance(current);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.PlanSelectorComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PlanSelectorComposableKt.PlanSelectorCell$lambda$1$lambda$0(plan, current, function03);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default, z2, null, null, (Function0) objRememberedValue, 6, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM());
                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                    long ccGoldBg = bentoTheme.getColors(composerStartRestartGroup, i7).getCcGoldBg();
                    int i8 = CardDefaults.$stable;
                    Function0<Unit> function05 = function03;
                    CardColors cardColorsM5729cardColorsro_MJ88 = cardDefaults.m5729cardColorsro_MJ88(ccGoldBg, 0L, 0L, 0L, composerStartRestartGroup, i8 << 12, 14);
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                    if (z) {
                        composerStartRestartGroup.startReplaceGroup(1581430387);
                        ccGoldBg3 = bentoTheme.getColors(composerStartRestartGroup, i7).getCcGoldBg3();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1581429238);
                        ccGoldBg3 = bentoTheme.getColors(composerStartRestartGroup, i7).getCcGoldAccent();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, ccGoldBg3);
                    CardElevation cardElevationM5730cardElevationaqJV_2Y = cardDefaults.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i8 << 18) | 6, 62);
                    composerStartRestartGroup = composerStartRestartGroup;
                    CardKt.Card(modifierM4893clickableXHw0xAI$default, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardColorsM5729cardColorsro_MJ88, cardElevationM5730cardElevationaqJV_2Y, borderStrokeM4886BorderStrokecXLIe8U, ComposableLambda3.rememberComposableLambda(169843644, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.PlanSelectorComposableKt.PlanSelectorCell.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                            invoke(column5, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 Card, Composer composer2, int i9) {
                            long ccGoldFg;
                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            if ((i9 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(169843644, i9, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.PlanSelectorCell.<anonymous> (PlanSelectorComposable.kt:81)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i10 = BentoTheme.$stable;
                            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default2, bentoTheme2.getSpacing(composer2, i10).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composer2, i10).m21592getMediumD9Ej5fM());
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Horizontal start = arrangement.getStart();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            int i11 = i;
                            SelectedPlan selectedPlan = plan;
                            String str = title;
                            String str2 = subtitle;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, centerVertically, composer2, 54);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5143paddingVpY3zN4);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            Modifier modifierWeight$default = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getCenter(), companion2.getCenterHorizontally(), composer2, 54);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            ImageKt.Image(PainterResources_androidKt.painterResource(i11, composer2, 0), (String) null, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
                            composer2.endNode();
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme2.getSpacing(composer2, i10).m21590getDefaultD9Ej5fM()), composer2, 0);
                            Modifier modifierWeight$default2 = Row5.weight$default(row6, companion, 2.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composer2, 54);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default2);
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                            TextStyle textM = bentoTheme2.getTypography(composer2, i10).getTextM();
                            if (selectedPlan == SelectedPlan.BASIC_1P5_PERCENT) {
                                composer2.startReplaceGroup(-55838657);
                                ccGoldFg = bentoTheme2.getColors(composer2, i10).getCcGoldAccent();
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-55747517);
                                ccGoldFg = bentoTheme2.getColors(composer2, i10).getCcGoldFg();
                                composer2.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(ccGoldFg), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer2, 24576, 0, 8170);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer2, i10).m21595getXsmallD9Ej5fM()), composer2, 0);
                            BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i10).getCcGoldFg2()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i10).getTextS(), composer2, 0, 0, 8186);
                            composer2.endNode();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    function04 = function05;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function04 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.PlanSelectorComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PlanSelectorComposableKt.PlanSelectorCell$lambda$2(i, title, subtitle, plan, z, modifier3, function04, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 1572864;
            function02 = function0;
            if ((599187 & i4) != 599186) {
                if (i6 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                if (function03 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i4 & 3670016) != 1048576) | ((i4 & 7168) != 2048) | composerStartRestartGroup.changedInstance(current);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.PlanSelectorComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PlanSelectorComposableKt.PlanSelectorCell$lambda$1$lambda$0(plan, current, function03);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default2, z2, null, null, (Function0) objRememberedValue, 6, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM());
                    CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
                    long ccGoldBg2 = bentoTheme2.getColors(composerStartRestartGroup, i72).getCcGoldBg();
                    int i82 = CardDefaults.$stable;
                    Function0<Unit> function052 = function03;
                    CardColors cardColorsM5729cardColorsro_MJ882 = cardDefaults2.m5729cardColorsro_MJ88(ccGoldBg2, 0L, 0L, 0L, composerStartRestartGroup, i82 << 12, 14);
                    float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
                    if (z) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BorderStroke borderStrokeM4886BorderStrokecXLIe8U2 = BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl2, ccGoldBg3);
                    CardElevation cardElevationM5730cardElevationaqJV_2Y2 = cardDefaults2.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i82 << 18) | 6, 62);
                    composerStartRestartGroup = composerStartRestartGroup;
                    CardKt.Card(modifierM4893clickableXHw0xAI$default2, roundedCornerShapeM5327RoundedCornerShape0680j_42, cardColorsM5729cardColorsro_MJ882, cardElevationM5730cardElevationaqJV_2Y2, borderStrokeM4886BorderStrokecXLIe8U2, ComposableLambda3.rememberComposableLambda(169843644, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.PlanSelectorComposableKt.PlanSelectorCell.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                            invoke(column5, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 Card, Composer composer2, int i9) {
                            long ccGoldFg;
                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            if ((i9 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(169843644, i9, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.PlanSelectorCell.<anonymous> (PlanSelectorComposable.kt:81)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                            int i10 = BentoTheme.$stable;
                            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default22, bentoTheme22.getSpacing(composer2, i10).m21590getDefaultD9Ej5fM(), bentoTheme22.getSpacing(composer2, i10).m21592getMediumD9Ej5fM());
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Horizontal start = arrangement.getStart();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            int i11 = i;
                            SelectedPlan selectedPlan = plan;
                            String str = title;
                            String str2 = subtitle;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, centerVertically, composer2, 54);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5143paddingVpY3zN4);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            Modifier modifierWeight$default = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getCenter(), companion2.getCenterHorizontally(), composer2, 54);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            ImageKt.Image(PainterResources_androidKt.painterResource(i11, composer2, 0), (String) null, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
                            composer2.endNode();
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme22.getSpacing(composer2, i10).m21590getDefaultD9Ej5fM()), composer2, 0);
                            Modifier modifierWeight$default2 = Row5.weight$default(row6, companion, 2.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composer2, 54);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default2);
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                            TextStyle textM = bentoTheme22.getTypography(composer2, i10).getTextM();
                            if (selectedPlan == SelectedPlan.BASIC_1P5_PERCENT) {
                                composer2.startReplaceGroup(-55838657);
                                ccGoldFg = bentoTheme22.getColors(composer2, i10).getCcGoldAccent();
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-55747517);
                                ccGoldFg = bentoTheme22.getColors(composer2, i10).getCcGoldFg();
                                composer2.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(ccGoldFg), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer2, 24576, 0, 8170);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme22.getSpacing(composer2, i10).m21595getXsmallD9Ej5fM()), composer2, 0);
                            BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme22.getColors(composer2, i10).getCcGoldFg2()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer2, i10).getTextS(), composer2, 0, 0, 8186);
                            composer2.endNode();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    function04 = function052;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 64;
        if (i5 != 0) {
        }
        function02 = function0;
        if ((599187 & i4) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlanSelectorCell$lambda$1$lambda$0(SelectedPlan selectedPlan, EventLogger eventLogger, Function0 function0) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SELECT, new Screen(Screen.Name.CC_APPLICATION_ACCOUNT_TERMS, null, null, null, 14, null), new Component(Component.ComponentType.CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET, null, null, 6, null), null, new Context(0, 0, 0, selectedPlan.name(), null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void PlanSelectorComposable(final double d, final long j, final SelectedPlan selectedPlan, final Function1<? super SelectedPlan, Unit> onPlanSelected, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onPlanSelected, "onPlanSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(2110745281);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(d) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(selectedPlan == null ? -1 : selectedPlan.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPlanSelected) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2110745281, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.PlanSelectorComposable (PlanSelectorComposable.kt:141)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier modifierTestTag = TestTag3.testTag(SizeKt.m5158heightInVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl((float) d), 1, null), PLAN_SELECTOR_COMPOSABLE_TEST_TAG);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.PlanSelectorComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PlanSelectorComposableKt.PlanSelectorComposable$lambda$4$lambda$3(selectedPlan, onPlanSelected, j, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierTestTag, null, null, false, center, centerHorizontally, null, false, null, (Function1) objRememberedValue, composer2, 221184, 462);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.PlanSelectorComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PlanSelectorComposableKt.PlanSelectorComposable$lambda$5(d, j, selectedPlan, onPlanSelected, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlanSelectorComposable$lambda$4$lambda$3(SelectedPlan selectedPlan, Function1 function1, long j, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        ComposableSingletons$PlanSelectorComposableKt composableSingletons$PlanSelectorComposableKt = ComposableSingletons$PlanSelectorComposableKt.INSTANCE;
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$PlanSelectorComposableKt.m12670getLambda$1692961396$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$PlanSelectorComposableKt.getLambda$1490289973$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, TermsComposableKt.TERMS_COMPOSABLE_TITLE_KEY, null, composableSingletons$PlanSelectorComposableKt.getLambda$1935827284$feature_credit_card_externalDebug(), 2, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$PlanSelectorComposableKt.m12671getLambda$1913602701$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1468065390, true, new PlanSelectorComposableKt$PlanSelectorComposable$1$1$1(selectedPlan, function1)), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$PlanSelectorComposableKt.m12669getLambda$1022528079$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-576990768, true, new PlanSelectorComposableKt$PlanSelectorComposable$1$1$2(j, selectedPlan, function1)), 3, null);
        return Unit.INSTANCE;
    }
}

package com.robinhood.android.account.p060ui;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.account.p060ui.PortfolioSectionState;
import com.robinhood.android.charts.PieChart2;
import com.robinhood.android.charts.model.Pie;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountOverviewPortfolioCard.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0003¢\u0006\u0002\u0010\u0011\u001a'\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00048CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u0004X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0004X\u008a\u0084\u0002"}, m3636d2 = {"PieChartStroke", "Landroidx/compose/ui/unit/Dp;", "F", "PieChartStrokePx", "", "getPieChartStrokePx", "(Landroidx/compose/runtime/Composer;I)F", "SliceGap", "PieAnimationDurationMs", "", "PortfolioPieChart", "", "modifier", "Landroidx/compose/ui/Modifier;", "slices", "", "Lcom/robinhood/android/charts/model/Pie$Slice;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "PortfolioSection", "state", "Lcom/robinhood/android/account/ui/PortfolioSectionState;", "callbacks", "Lcom/robinhood/android/account/ui/PortfolioSectionCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/account/ui/PortfolioSectionState;Lcom/robinhood/android/account/ui/PortfolioSectionCallbacks;Landroidx/compose/runtime/Composer;II)V", "feature-account-overview_externalRelease", "targetValue", "progress"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.ui.AccountOverviewPortfolioCardKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountOverviewPortfolioCard {
    private static final int PieAnimationDurationMs = 500;
    private static final float PieChartStroke = C2002Dp.m7995constructorimpl(5);
    private static final float SliceGap = 0.02f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioPieChart$lambda$7(Modifier modifier, List list, int i, int i2, Composer composer, int i3) {
        PortfolioPieChart(modifier, list, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioSection$lambda$19(Modifier modifier, PortfolioSectionState portfolioSectionState, AccountOverviewPortfolioCard3 accountOverviewPortfolioCard3, int i, int i2, Composer composer, int i3) {
        PortfolioSection(modifier, portfolioSectionState, accountOverviewPortfolioCard3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final float PortfolioPieChart$lambda$5(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    @JvmName
    private static final float getPieChartStrokePx(Composer composer, int i) {
        composer.startReplaceGroup(80523674);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(80523674, i, -1, "com.robinhood.android.account.ui.<get-PieChartStrokePx> (AccountOverviewPortfolioCard.kt:318)");
        }
        float fMo5016toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(PieChartStroke);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fMo5016toPx0680j_4;
    }

    private static final void PortfolioPieChart(Modifier modifier, final List<Pie.Slice> list, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(51181408);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(51181408, i5, -1, "com.robinhood.android.account.ui.PortfolioPieChart (AccountOverviewPortfolioCard.kt:327)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewPortfolioCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountOverviewPortfolioCard.PortfolioPieChart$lambda$2$lambda$1();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(snapshotFloatState2.getFloatValue(), AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            modifier3 = modifier4;
            PieChart2.m11980PieChartcEmTA8(modifier3, list, new Stroke(getPieChartStrokePx(composerStartRestartGroup, 0), 0.0f, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), 0, null, 26, null), false, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU()), SliceGap, PortfolioPieChart$lambda$5(snapshotState4AnimateFloatAsState), composerStartRestartGroup, (i5 & 14) | 1572864 | (i5 & 112), 24);
            composerStartRestartGroup = composerStartRestartGroup;
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(snapshotFloatState2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new AccountOverviewPortfolioCard2(snapshotFloatState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewPortfolioCardKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountOverviewPortfolioCard.PortfolioPieChart$lambda$7(modifier3, list, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotFloatState2 PortfolioPieChart$lambda$2$lambda$1() {
        return SnapshotFloatState3.mutableFloatStateOf(0.0f);
    }

    public static final void PortfolioSection(Modifier modifier, final PortfolioSectionState state, final AccountOverviewPortfolioCard3 callbacks, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(67962070);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        int i9 = i3;
        if ((i9 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i8 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(67962070, i9, -1, "com.robinhood.android.account.ui.PortfolioSection (AccountOverviewPortfolioCard.kt:355)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i10 = BentoTheme.$stable;
            Modifier modifierM10805defaultAccountOverviewSectionPaddinguFdPcIQ = AccountOverviewComponents.m10805defaultAccountOverviewSectionPaddinguFdPcIQ(modifier2, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21592getMediumD9Ej5fM(), false, composerStartRestartGroup, i9 & 14, 2);
            Modifier modifier4 = modifier2;
            composerStartRestartGroup = composerStartRestartGroup;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM10805defaultAccountOverviewSectionPaddinguFdPcIQ);
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
            AccountOverviewComponents.AccountOverviewSectionTitle(null, StringResources_androidKt.stringResource(state.getMainSectionLabelRes(), composerStartRestartGroup, 0), state.getTotalValueText(), null, null, composerStartRestartGroup, 0, 25);
            AccountOverviewComponents.AccountOverviewSectionSummary(null, StringResources_androidKt.stringResource(state.getSummaryTextRes(), composerStartRestartGroup, 0), composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(1832120469);
            if (state.getShowPortfolioPieChart()) {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
                PortfolioPieChart(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(companion3, C2002Dp.m7995constructorimpl(PieChartStroke / 2)), 0.0f, 1, null), 1.0f, false, 2, null), state.getSlices(composerStartRestartGroup, (i9 >> 3) & 14), composerStartRestartGroup, 6, 0);
                Modifier modifierAlign = boxScopeInstance.align(companion3, companion.getCenter());
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                i5 = 0;
                int i11 = i9;
                i4 = 1;
                BentoText2.m20747BentoText38GnDrw(state.getTotalValueText(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16382);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(state.getPortfolioDescriptionTextRes(), composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i10).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i10).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                Modifier modifierWeight$default2 = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion2.getSetModifier());
                composerStartRestartGroup.startReplaceGroup(-586957377);
                for (final PortfolioSectionState.Row row : state.getRows()) {
                    BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResource2.getString(row.getLabel(), composerStartRestartGroup, StringResource.$stable), null, 2, null), null, row.getShowInfoIcon() ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16) : null, null, new AnnotatedString(row.getValue(), null, 2, null), null, null, null, null, false, false, 4053, null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i12 = i11;
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(row) | ((i12 & 896) == 256 || ((i12 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks)));
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewPortfolioCardKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountOverviewPortfolioCard.m1701x8ad41804(row, callbacks);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    BentoDataRowKt.BentoDataRow(bentoDataRowState, null, (Function0) objRememberedValue, composer2, BentoDataRowState.$stable, 2);
                    composerStartRestartGroup = composer2;
                    i11 = i12;
                }
                i6 = i11;
                i7 = 256;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
            } else {
                i4 = 1;
                i5 = 0;
                i6 = i9;
                i7 = 256;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1832180201);
            if (state.getShowDepositFundsButton()) {
                String strStringResource = StringResources_androidKt.stringResource(C8159R.string.account_overview_instant_deposit_deposit_funds, composerStartRestartGroup, i5);
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i13 = ((i6 & 896) == i7 || ((i6 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks))) ? i4 : i5;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i13 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewPortfolioCardKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountOverviewPortfolioCard.PortfolioSection$lambda$18$lambda$17$lambda$16(callbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                AccountOverviewComponents.AccountOverviewSectionCta(null, strStringResource, false, false, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 13);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewPortfolioCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountOverviewPortfolioCard.PortfolioSection$lambda$19(modifier3, state, callbacks, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PortfolioSection$lambda$18$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11 */
    public static final Unit m1701x8ad41804(PortfolioSectionState.Row row, AccountOverviewPortfolioCard3 accountOverviewPortfolioCard3) {
        Function1<AccountOverviewPortfolioCard3, Unit> onClickInfoIcon = row.getOnClickInfoIcon();
        if (onClickInfoIcon != null) {
            onClickInfoIcon.invoke(accountOverviewPortfolioCard3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioSection$lambda$18$lambda$17$lambda$16(AccountOverviewPortfolioCard3 accountOverviewPortfolioCard3) {
        accountOverviewPortfolioCard3.onDepositFundsButtonClicked();
        return Unit.INSTANCE;
    }
}

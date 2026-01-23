package com.robinhood.android.rollover401k.steps;

import android.net.Uri;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.models.retirement.p194db.Retirement401kRolloverViewModel;
import com.robinhood.android.retirement.lib.rollover401k.Rollover401kHeaderImage3;
import com.robinhood.android.retirement.match.MatchAgreementsScreen5;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: MethodSelectionScreen.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\u001a)\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, m3636d2 = {MatchAgreementsScreen5.ContributionAndAgreementsLoadingTestTag, "", "getLoadingTestTag$annotations", "()V", "getLoadingTestTag", "()Ljava/lang/String;", "MethodSelectionScreen", "", "viewModel", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$RolloverMethodViewModel;", "callbacks", "Lcom/robinhood/android/rollover401k/steps/MethodSelectionCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$RolloverMethodViewModel;Lcom/robinhood/android/rollover401k/steps/MethodSelectionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MethodSelectionContent", "feature-rollover-401k_externalDebug", "selectedRowIndex", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rollover401k.steps.MethodSelectionScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class MethodSelectionScreen2 {
    private static final String LoadingTestTag = "Loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MethodSelectionContent$lambda$12(Retirement401kRolloverViewModel.RolloverMethodViewModel rolloverMethodViewModel, MethodSelectionScreen methodSelectionScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MethodSelectionContent(rolloverMethodViewModel, methodSelectionScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MethodSelectionScreen$lambda$0(Retirement401kRolloverViewModel.RolloverMethodViewModel rolloverMethodViewModel, MethodSelectionScreen methodSelectionScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MethodSelectionScreen(rolloverMethodViewModel, methodSelectionScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getLoadingTestTag$annotations() {
    }

    public static final String getLoadingTestTag() {
        return LoadingTestTag;
    }

    public static final void MethodSelectionScreen(final Retirement401kRolloverViewModel.RolloverMethodViewModel rolloverMethodViewModel, final MethodSelectionScreen callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1548342208);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(rolloverMethodViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1548342208, i3, -1, "com.robinhood.android.rollover401k.steps.MethodSelectionScreen (MethodSelectionScreen.kt:44)");
            }
            if (rolloverMethodViewModel == null) {
                composerStartRestartGroup.startReplaceGroup(1286265450);
                composer2 = composerStartRestartGroup;
                LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(TestTag3.testTag(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4), LoadingTestTag), null, true, true, composer2, 3456, 2);
                composer2.endReplaceGroup();
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.startReplaceGroup(1286514442);
                modifier2 = modifier4;
                MethodSelectionContent(rolloverMethodViewModel, callbacks, modifier2, composerStartRestartGroup, i3 & 1022, 0);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.MethodSelectionScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MethodSelectionScreen2.MethodSelectionScreen$lambda$0(rolloverMethodViewModel, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MethodSelectionContent(final Retirement401kRolloverViewModel.RolloverMethodViewModel viewModel, final MethodSelectionScreen callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotIntState2 snapshotIntState2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean z;
        Object objRememberedValue2;
        Composer composer2;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1243082995);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
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
                    ComposerKt.traceEventStart(1243082995, i3, -1, "com.robinhood.android.rollover401k.steps.MethodSelectionContent (MethodSelectionScreen.kt:67)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
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
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
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
                String headerImage = viewModel.getHeaderImage();
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i5 = i3 & 112;
                z = i5 != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new MethodSelectionScreen3(callbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Rollover401kHeaderImage3.m18135RolloverHeaderImageIColEu4(headerImage, (Function0) ((KFunction) objRememberedValue2), null, null, composerStartRestartGroup, 0, 12);
                String title = viewModel.getTitle();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                int i7 = i3;
                BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8184);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-1241411932);
                final int i8 = 0;
                for (Object obj : viewModel.getSelectionRows()) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Retirement401kRolloverViewModel.RolloverMethodSelectionRow rolloverMethodSelectionRow = (Retirement401kRolloverViewModel.RolloverMethodSelectionRow) obj;
                    BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, rolloverMethodSelectionRow.getTitle(), i8 == snapshotIntState2.getIntValue(), (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(rolloverMethodSelectionRow.getSubtitle()), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2032, (DefaultConstructorMarker) null);
                    Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(Modifier.INSTANCE, Component.ComponentType.ROW, rolloverMethodSelectionRow.getLoggingId(), false, composer2, 54, 4);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged = composer2.changed(i8);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.rollover401k.steps.MethodSelectionScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MethodSelectionScreen2.m2447xe3a7d5a5(i8, snapshotIntState2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    Composer composer3 = composer2;
                    BentoSelectionRow2.BentoSelectionRow(modifierAutoLogEvents, bentoSelectionRowState, (Function0) objRememberedValue4, composer3, BentoSelectionRowState.$stable << 3, 0);
                    composer2 = composer3;
                    i8 = i9;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.startReplaceGroup(-1746271574);
                zChangedInstance = composer2.changedInstance(viewModel) | (i5 != 32 || ((i7 & 64) != 0 && composer2.changedInstance(callbacks)));
                objRememberedValue3 = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.rollover401k.steps.MethodSelectionScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MethodSelectionScreen2.MethodSelectionContent$lambda$11$lambda$10$lambda$9(viewModel, callbacks, snapshotIntState2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                Composer composer4 = composer2;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, viewModel.getCtaLabel(), UtilKt.autoLogEvents(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), 0.0f, 1, null), Component.ComponentType.BUTTON, viewModel.getSelectionRows().get(snapshotIntState2.getIntValue()).getLoggingId(), false, composer2, 48, 4), null, null, false, false, null, null, null, null, false, null, composer4, 0, 0, 8184);
                composerStartRestartGroup = composer4;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.MethodSelectionScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return MethodSelectionScreen2.MethodSelectionContent$lambda$12(viewModel, callbacks, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierNavigationBarsPadding2 = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Column5.weight$default(column62, companion42, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
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
                    String headerImage2 = viewModel.getHeaderImage();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i52 = i3 & 112;
                    if (i52 != 32) {
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue2 = new MethodSelectionScreen3(callbacks);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            Rollover401kHeaderImage3.m18135RolloverHeaderImageIColEu4(headerImage2, (Function0) ((KFunction) objRememberedValue2), null, null, composerStartRestartGroup, 0, 12);
                            String title2 = viewModel.getTitle();
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i62 = BentoTheme.$stable;
                            int i72 = i3;
                            BentoText2.m20747BentoText38GnDrw(title2, PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion42, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8184);
                            composer2 = composerStartRestartGroup;
                            composer2.startReplaceGroup(-1241411932);
                            final int i82 = 0;
                            while (r12.hasNext()) {
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            composer2.startReplaceGroup(-1746271574);
                            if (i52 != 32) {
                                zChangedInstance = composer2.changedInstance(viewModel) | (i52 != 32 || ((i72 & 64) != 0 && composer2.changedInstance(callbacks)));
                                objRememberedValue3 = composer2.rememberedValue();
                                if (!zChangedInstance) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.rollover401k.steps.MethodSelectionScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return MethodSelectionScreen2.MethodSelectionContent$lambda$11$lambda$10$lambda$9(viewModel, callbacks, snapshotIntState2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                    composer2.endReplaceGroup();
                                    Composer composer42 = composer2;
                                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, viewModel.getCtaLabel(), UtilKt.autoLogEvents(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), 0.0f, 1, null), Component.ComponentType.BUTTON, viewModel.getSelectionRows().get(snapshotIntState2.getIntValue()).getLoggingId(), false, composer2, 48, 4), null, null, false, false, null, null, null, null, false, null, composer42, 0, 0, 8184);
                                    composerStartRestartGroup = composer42;
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier4;
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
    /* renamed from: MethodSelectionContent$lambda$11$lambda$8$lambda$7$lambda$6$lambda$5 */
    public static final Unit m2447xe3a7d5a5(int i, SnapshotIntState2 snapshotIntState2) {
        snapshotIntState2.setIntValue(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MethodSelectionContent$lambda$11$lambda$10$lambda$9(Retirement401kRolloverViewModel.RolloverMethodViewModel rolloverMethodViewModel, MethodSelectionScreen methodSelectionScreen, SnapshotIntState2 snapshotIntState2) {
        Uri uri = Uri.parse(rolloverMethodViewModel.getSelectionRows().get(snapshotIntState2.getIntValue()).getDeeplink());
        Intrinsics.checkNotNull(uri);
        methodSelectionScreen.onMethodSelected(uri);
        return Unit.INSTANCE;
    }
}

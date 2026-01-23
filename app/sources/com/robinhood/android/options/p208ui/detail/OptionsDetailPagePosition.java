package com.robinhood.android.options.p208ui.detail;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.C22993R;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageBodyState2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionsDetailPagePosition.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a¤\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u00052)\u0010\u0007\u001a%\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0016\u001a1\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\u001c\"\u000e\u0010\u001d\u001a\u00020\u001eX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\nX\u008a\u008e\u0002"}, m3636d2 = {"OptionsDetailPagePosition", "", "state", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Position;", "startActivity", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "showFragment", "Lkotlin/Function2;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "", "Lkotlin/ParameterName;", "name", "showInTab", "onWatchlistPositionLearnMoreTapped", "Lkotlin/Function0;", "onSimulatedReturnTooltipFirstAppear", "Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;", "onSimulatedReturnTooltipClicked", "recordSeenTooltip", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageCellTooltip;", "enableAutoLogging", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Position;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "OptionsDetailPageProjectedReturnTooltip", "tooltip", "Lcom/robinhood/models/db/OptionTooltip;", "onClick", "onFirstAppear", "(Lcom/robinhood/models/db/OptionTooltip;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ODP_SIMULATED_RETURNS_IDENTIFIER", "", "feature-options-detail_externalDebug", "tooltipSize", "Landroidx/compose/ui/unit/IntSize;", "isVisible"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPagePositionKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsDetailPagePosition {
    public static final String ODP_SIMULATED_RETURNS_IDENTIFIER = "odp_simulated_returns";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPagePosition$lambda$11(OptionsDetailPageBodyState2.Position position, Function1 function1, Function2 function2, Function0 function0, Function1 function12, Function0 function02, Function1 function13, boolean z, int i, int i2, Composer composer, int i3) {
        OptionsDetailPagePosition(position, function1, function2, function0, function12, function02, function13, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPageProjectedReturnTooltip$lambda$31(OptionTooltip optionTooltip, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        OptionsDetailPageProjectedReturnTooltip(optionTooltip, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v12, types: [androidx.compose.ui.Modifier] */
    public static final void OptionsDetailPagePosition(final OptionsDetailPageBodyState2.Position state, final Function1<? super IntentKey, Unit> startActivity, final Function2<? super FragmentKey, ? super Boolean, Unit> showFragment, final Function0<Unit> onWatchlistPositionLearnMoreTapped, final Function1<? super OptionsSimulatedReturnTooltipState, Unit> onSimulatedReturnTooltipFirstAppear, final Function0<Unit> onSimulatedReturnTooltipClicked, final Function1<? super OptionsDetailPageDataCell2, Unit> recordSeenTooltip, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Composer composer2;
        Modifier.Companion companion;
        int i4;
        int i5;
        final boolean z3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(startActivity, "startActivity");
        Intrinsics.checkNotNullParameter(showFragment, "showFragment");
        Intrinsics.checkNotNullParameter(onWatchlistPositionLearnMoreTapped, "onWatchlistPositionLearnMoreTapped");
        Intrinsics.checkNotNullParameter(onSimulatedReturnTooltipFirstAppear, "onSimulatedReturnTooltipFirstAppear");
        Intrinsics.checkNotNullParameter(onSimulatedReturnTooltipClicked, "onSimulatedReturnTooltipClicked");
        Intrinsics.checkNotNullParameter(recordSeenTooltip, "recordSeenTooltip");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1491405771);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(startActivity) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(showFragment) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onWatchlistPositionLearnMoreTapped) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSimulatedReturnTooltipFirstAppear) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSimulatedReturnTooltipClicked) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(recordSeenTooltip) ? 1048576 : 524288;
        }
        int i6 = i2 & 128;
        if (i6 != 0) {
            i3 |= 12582912;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
            }
        }
        if ((i3 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            z3 = z2;
        } else {
            boolean z4 = i6 != 0 ? true : z2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1491405771, i3, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPagePosition (OptionsDetailPagePosition.kt:64)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            Modifier modifierZIndex = ZIndexModifier2.zIndex(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 1.0f);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierZIndex);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            int i8 = i3;
            OptionsDetailPageSectionTitle.OptionsDetailPageSectionTitle(null, state.getTitle(), state.getSubtitle(), onWatchlistPositionLearnMoreTapped, composerStartRestartGroup, i3 & 7168, 1);
            OptionsDetailPageDataGrid.m17035OptionsDetailPageDataGridrg9RtIk(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(12), 7, null), 2, state.getCells(), state.getShowDataCellTooltip(), recordSeenTooltip, null, composerStartRestartGroup, ((i8 >> 6) & 57344) | 54, 32);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceGroup(-199422168);
            if (state.getShowReturns()) {
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 7, null);
                i4 = 57344;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer2, 48);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                String strStringResource = StringResources_androidKt.stringResource(C22993R.string.options_detail_page_position_today_return_label, composer2, 0);
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU();
                TextStyle textS = bentoTheme.getTypography(composer2, i7).getTextS();
                TextOverflow.Companion companion5 = TextOverflow.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, companion5.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textS, composer2, 817889280, 0, 7546);
                Spacer2.Spacer(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composer2, 0);
                BentoText2.m20747BentoText38GnDrw(state.getTodayReturnValue(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU()), null, null, null, null, companion5.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextM(), composer2, 817889280, 0, 7546);
                composer2.endNode();
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 7, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer2, 48);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C22993R.string.options_detail_page_position_total_return_label, composer2, 0), null, bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, companion5.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 3120, 55290);
                companion = companion2;
                Spacer2.Spacer(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composer2, 0);
                BentoText2.m20747BentoText38GnDrw(state.getTotalReturnValue(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU()), null, null, null, null, companion5.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextM(), composer2, 817889280, 0, 7546);
                composer2.endNode();
            } else {
                companion = companion2;
                i4 = 57344;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-199364729);
            if (state.getSimulatedReturnState() != null) {
                Modifier.Companion companionAutoLogEvents$default = z4 ? ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, state.getSimulatedReturnState().getEventScreen(), null, state.getSimulatedReturnState().getEventContext(), new Component(Component.ComponentType.BUTTON, "odp_simulated_returns", null, 4, null), null, 37, null), true, false, false, true, false, null, 108, null) : companion;
                BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.CHART_24, null, null, 6, null);
                AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C22993R.string.options_detail_page_position_simulated_return, composer2, 0), null, 2, null);
                composer2.startReplaceGroup(-1633490746);
                i5 = 256;
                boolean zChangedInstance = ((i8 & 896) == 256) | composer2.changedInstance(state);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPagePositionKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsDetailPagePosition.OptionsDetailPagePosition$lambda$10$lambda$3$lambda$2(showFragment, state);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(companionAutoLogEvents$default, icon, annotatedString, null, null, null, null, false, false, true, false, false, 0L, (Function0) objRememberedValue, composer2, (BentoBaseRowState.Start.Icon.$stable << 3) | 805306368, 0, 7672);
                if (state.getSimulatedReturnState().getTooltipState() != null) {
                    OptionTooltip tooltip = state.getSimulatedReturnState().getTooltipState().getTooltip();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composer2.changedInstance(state) | ((i8 & i4) == 16384);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPagePositionKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionsDetailPagePosition.OptionsDetailPagePosition$lambda$10$lambda$5$lambda$4(onSimulatedReturnTooltipFirstAppear, state);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    OptionsDetailPageProjectedReturnTooltip(tooltip, onSimulatedReturnTooltipClicked, (Function0) objRememberedValue2, composer2, (i8 >> 12) & 112);
                }
            } else {
                i5 = 256;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-199312520);
            if (state.getExerciseKey() != null) {
                BentoBaseRowState.Start.Icon icon2 = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.DISCLOSURES_24, null, null, 6, null);
                AnnotatedString annotatedString2 = new AnnotatedString(StringResources_androidKt.stringResource(C22993R.string.options_detail_page_position_exercise, composer2, 0), null, 2, null);
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composer2.changedInstance(state) | ((i8 & 112) == 32);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPagePositionKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsDetailPagePosition.OptionsDetailPagePosition$lambda$10$lambda$7$lambda$6(startActivity, state);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, icon2, annotatedString2, null, null, null, null, false, false, true, false, false, 0L, (Function0) objRememberedValue3, composer2, (BentoBaseRowState.Start.Icon.$stable << 3) | 805306368, 0, 7673);
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-199298418);
            if (state.getPortfolioRiskAnalyzerKey() != null) {
                BentoBaseRowState.Start.Icon icon3 = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.CHART_CANDLESTICKS_24, null, null, 6, null);
                AnnotatedString annotatedString3 = new AnnotatedString(StringResources_androidKt.stringResource(C22993R.string.options_detail_page_position_portfolio_risk_analyzer, composer2, 0), null, 2, null);
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance4 = ((i8 & 896) == i5) | composer2.changedInstance(state);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPagePositionKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsDetailPagePosition.OptionsDetailPagePosition$lambda$10$lambda$9$lambda$8(showFragment, state);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceGroup();
                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, icon3, annotatedString3, null, null, null, null, false, false, true, false, false, 0L, (Function0) objRememberedValue4, composer2, (BentoBaseRowState.Start.Icon.$stable << 3) | 805306368, 0, 7673);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPagePositionKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsDetailPagePosition.OptionsDetailPagePosition$lambda$11(state, startActivity, showFragment, onWatchlistPositionLearnMoreTapped, onSimulatedReturnTooltipFirstAppear, onSimulatedReturnTooltipClicked, recordSeenTooltip, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long OptionsDetailPageProjectedReturnTooltip$lambda$30$lambda$13(SnapshotState<IntSize> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OptionsDetailPageProjectedReturnTooltip$lambda$30$lambda$16(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPagePosition$lambda$10$lambda$3$lambda$2(Function2 function2, OptionsDetailPageBodyState2.Position position) {
        function2.invoke(position.getSimulatedReturnState().getSimulatedReturnKey(), Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPagePosition$lambda$10$lambda$5$lambda$4(Function1 function1, OptionsDetailPageBodyState2.Position position) {
        function1.invoke(position.getSimulatedReturnState().getTooltipState());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPagePosition$lambda$10$lambda$7$lambda$6(Function1 function1, OptionsDetailPageBodyState2.Position position) {
        function1.invoke(position.getExerciseKey());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPagePosition$lambda$10$lambda$9$lambda$8(Function2 function2, OptionsDetailPageBodyState2.Position position) {
        function2.invoke(position.getPortfolioRiskAnalyzerKey(), Boolean.FALSE);
        return Unit.INSTANCE;
    }

    @SuppressLint({"InflateParams"})
    private static final void OptionsDetailPageProjectedReturnTooltip(final OptionTooltip optionTooltip, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1717217875);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(optionTooltip) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1717217875, i2, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageProjectedReturnTooltip (OptionsDetailPagePosition.kt:197)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(ZIndexModifier2.zIndex(companion, 1.0f), C2002Dp.m7995constructorimpl(0)), 0.0f, 1, null), null, true, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                long j = 0;
                objRememberedValue = SnapshotState3.mutableStateOf$default(IntSize.m8055boximpl(IntSize.m8056constructorimpl((j & 4294967295L) | (j << 32))), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            final View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            final Rect rect = new Rect();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z = (i2 & 896) == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = new OptionsDetailPagePosition2(snapshotState2, function02, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion3.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPagePositionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPagePosition.m2290x7ea327a7(snapshotState, (Density) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue4);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion3.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPagePositionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPagePosition.m2291xa86c8d40(snapshotState, (IntSize) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierOffset, (Function1) objRememberedValue5);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(view) | composerStartRestartGroup.changedInstance(rect);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion3.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPagePositionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPagePosition.m2292xd235f2c4(view, rect, snapshotState2, (LayoutCoordinates) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierOnSizeChanged, (Function1) objRememberedValue6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion3.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPagePositionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPagePosition.m2293xfbff5848((Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            Function1 function1 = (Function1) objRememberedValue7;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(optionTooltip) | ((i2 & 112) == 32);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion3.getEmpty()) {
                objRememberedValue8 = new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPagePositionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPagePosition.m2294xbaad708e(optionTooltip, function0, (RdsTooltipView) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function1, modifierOnGloballyPositioned, (Function1) objRememberedValue8, composerStartRestartGroup, 6, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPagePositionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsDetailPagePosition.OptionsDetailPageProjectedReturnTooltip$lambda$31(optionTooltip, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void OptionsDetailPageProjectedReturnTooltip$lambda$30$lambda$14(SnapshotState<IntSize> snapshotState, long j) {
        snapshotState.setValue(IntSize.m8055boximpl(j));
    }

    private static final void OptionsDetailPageProjectedReturnTooltip$lambda$30$lambda$17(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsDetailPageProjectedReturnTooltip$lambda$30$lambda$20$lambda$19 */
    public static final IntOffset m2290x7ea327a7(SnapshotState snapshotState, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl(((((int) (OptionsDetailPageProjectedReturnTooltip$lambda$30$lambda$13(snapshotState) & 4294967295L)) / 2) & 4294967295L) | (0 << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsDetailPageProjectedReturnTooltip$lambda$30$lambda$22$lambda$21 */
    public static final Unit m2291xa86c8d40(SnapshotState snapshotState, IntSize intSize) {
        OptionsDetailPageProjectedReturnTooltip$lambda$30$lambda$14(snapshotState, intSize.getPackedValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsDetailPageProjectedReturnTooltip$lambda$30$lambda$24$lambda$23 */
    public static final Unit m2292xd235f2c4(View view, Rect rect, SnapshotState snapshotState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        boolean z = false;
        if (coordinates.isAttached() && view.getGlobalVisibleRect(rect)) {
            androidx.compose.p011ui.geometry.Rect rectBoundsInWindow = LayoutCoordinates2.boundsInWindow(coordinates);
            if (rectBoundsInWindow.getTop() < rect.bottom && rectBoundsInWindow.getBottom() > rect.top) {
                z = true;
            }
        }
        OptionsDetailPageProjectedReturnTooltip$lambda$30$lambda$17(snapshotState, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsDetailPageProjectedReturnTooltip$lambda$30$lambda$26$lambda$25 */
    public static final RdsTooltipView m2293xfbff5848(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(C22993R.layout.view_tooltip, (ViewGroup) null, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.designsystem.tooltip.RdsTooltipView");
        return (RdsTooltipView) viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsDetailPageProjectedReturnTooltip$lambda$30$lambda$29$lambda$28 */
    public static final Unit m2294xbaad708e(OptionTooltip optionTooltip, final Function0 function0, RdsTooltipView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setText(optionTooltip.getContent());
        OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPagePositionKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsDetailPagePosition.m2295x21f14fac(function0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsDetailPageProjectedReturnTooltip$lambda$30$lambda$29$lambda$28$lambda$27 */
    public static final Unit m2295x21f14fac(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}

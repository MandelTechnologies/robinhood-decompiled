package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.extensions.StringResources2;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.futures.sharedfuturesui.FuturesColors;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StatsSection.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\b¨\u0006\n"}, m3636d2 = {"StatsSection", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$StatsData;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$StatsData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BidAskSection", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$StatsData;Landroidx/compose/runtime/Composer;I)V", "MoreStats", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StatsSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BidAskSection$lambda$11(FuturesDetailViewState.StatsData statsData, int i, Composer composer, int i2) {
        BidAskSection(statsData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreStats$lambda$17(FuturesDetailViewState.StatsData statsData, int i, Composer composer, int i2) {
        MoreStats(statsData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatsSection$lambda$1(FuturesDetailViewState.StatsData statsData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StatsSection(statsData, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StatsSection(final FuturesDetailViewState.StatsData data, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1689778143);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(data) : composerStartRestartGroup.changedInstance(data) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1689778143, i3, -1, "com.robinhood.android.futures.detail.ui.StatsSection (StatsSection.kt:34)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
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
                String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_detail_stats_section_header, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                int i6 = StringResource.$stable;
                int i7 = i3 & 14;
                BidAskSection(data, composerStartRestartGroup, i6 | i7);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                MoreStats(data, composerStartRestartGroup, i6 | i7);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StatsSectionKt.StatsSection$lambda$1(data, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String strStringResource2 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_stats_section_header, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium();
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                int i62 = StringResource.$stable;
                int i72 = i3 & 14;
                BidAskSection(data, composerStartRestartGroup, i62 | i72);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme2.getColors(composerStartRestartGroup, i52).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                MoreStats(data, composerStartRestartGroup, i62 | i72);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void BidAskSection(final FuturesDetailViewState.StatsData statsData, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-915119761);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(statsData) : composerStartRestartGroup.changedInstance(statsData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-915119761, i2, -1, "com.robinhood.android.futures.detail.ui.BidAskSection (StatsSection.kt:60)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Measurer2(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue5;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
            final int i4 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            boolean zChanged = zChangedInstance | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$BidAskSection$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i5);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i5);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i5);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i5);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        snapshotState2.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i4);
                        snapshotState.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$BidAskSection$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                measurer22.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicy);
                objRememberedValue6 = measurePolicy;
            }
            MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$BidAskSection$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final Function0 function0 = (Function0) objRememberedValue7;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$BidAskSection$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierM5143paddingVpY3zN4, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$BidAskSection$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

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
                        ComposerKt.traceEventStart(1200550679, i5, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    snapshotState2.setValue(Unit.INSTANCE);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer2.startReplaceGroup(-500295200);
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
                    String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_detail_stats_bid_label, composer2, 0);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer2, i6).m21426getFg20d7_KjU();
                    TextStyle textS = bentoTheme2.getTypography(composer2, i6).getTextS();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composer2.startReplaceGroup(5004770);
                    boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component2);
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new StatsSectionKt$BidAskSection$1$1$1(constraintLayoutBaseScope4Component2);
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    composer2.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(strStringResource, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8184);
                    StringResource bid = statsData.getBid();
                    int i7 = StringResource.$stable;
                    String text = StringResources2.getText(bid, composer2, i7);
                    TextStyle textL = bentoTheme2.getTypography(composer2, i6).getTextL();
                    FontWeight.Companion companion3 = FontWeight.INSTANCE;
                    FontWeight bold = companion3.getBold();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged3 = composer2.changed(constraintLayoutBaseScope4Component1) | composer2.changed(constraintLayoutBaseScope4Component3);
                    Object objRememberedValue10 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new StatsSectionKt$BidAskSection$1$2$1(constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component3);
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    composer2.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(text, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10), null, null, bold, null, null, 0, false, 0, 0, null, 0, textL, composer2, 24576, 0, 8172);
                    String text2 = StringResources2.getText(statsData.getBidSize(), composer2, i7);
                    TextStyle textM = bentoTheme2.getTypography(composer2, i6).getTextM();
                    composer2.startReplaceGroup(5004770);
                    boolean zChanged4 = composer2.changed(constraintLayoutBaseScope4Component2);
                    Object objRememberedValue11 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new StatsSectionKt$BidAskSection$1$3$1(constraintLayoutBaseScope4Component2);
                        composer2.updateRememberedValue(objRememberedValue11);
                    }
                    composer2.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(text2, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), null, null, null, null, null, 0, false, 0, 0, null, 0, textM, composer2, 0, 0, 8188);
                    ConstraintLayoutBaseScope3.Companion companion4 = ConstraintLayoutBaseScope3.INSTANCE;
                    constraintLayoutScope2.createVerticalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component3}, companion4.getPacked());
                    float f = 6;
                    float f2 = 42;
                    float f3 = 1;
                    Modifier modifierM4877borderxT4_qwU$default = BorderKt.m4877borderxT4_qwU$default(Background3.m4872backgroundbw27NRU$default(SizeKt.m5174width3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion2, C2002Dp.m7995constructorimpl(f), 0.0f, 2, null), C2002Dp.m7995constructorimpl(f2)), Color.m6705copywmQWz5c$default(FuturesColors.getFuturesBidColor(bentoTheme2.getColors(composer2, i6)), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), C2002Dp.m7995constructorimpl(f3), FuturesColors.getFuturesBidColor(bentoTheme2.getColors(composer2, i6)), null, 4, null);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged5 = composer2.changed(constraintLayoutBaseScope4Component5) | composer2.changedInstance(statsData);
                    Object objRememberedValue12 = composer2.rememberedValue();
                    if (zChanged5 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new StatsSectionKt$BidAskSection$1$4$1(constraintLayoutBaseScope4Component5, statsData);
                        composer2.updateRememberedValue(objRememberedValue12);
                    }
                    composer2.endReplaceGroup();
                    BoxKt.Box(AnimationModifier.animateContentSize$default(constraintLayoutScope2.constrainAs(modifierM4877borderxT4_qwU$default, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue12), null, null, 3, null), composer2, 0);
                    Modifier modifierM4877borderxT4_qwU$default2 = BorderKt.m4877borderxT4_qwU$default(Background3.m4872backgroundbw27NRU$default(SizeKt.m5174width3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion2, C2002Dp.m7995constructorimpl(f), 0.0f, 2, null), C2002Dp.m7995constructorimpl(f2)), Color.m6705copywmQWz5c$default(FuturesColors.getFuturesAskColor(bentoTheme2.getColors(composer2, i6)), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), C2002Dp.m7995constructorimpl(f3), FuturesColors.getFuturesAskColor(bentoTheme2.getColors(composer2, i6)), null, 4, null);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged6 = composer2.changed(constraintLayoutBaseScope4Component4) | composer2.changedInstance(statsData);
                    Object objRememberedValue13 = composer2.rememberedValue();
                    if (zChanged6 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = new StatsSectionKt$BidAskSection$1$5$1(constraintLayoutBaseScope4Component4, statsData);
                        composer2.updateRememberedValue(objRememberedValue13);
                    }
                    composer2.endReplaceGroup();
                    BoxKt.Box(constraintLayoutScope2.constrainAs(modifierM4877borderxT4_qwU$default2, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue13), composer2, 0);
                    constraintLayoutScope2.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component5}, companion4.getPacked());
                    String strStringResource2 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_stats_ask_label, composer2, 0);
                    long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composer2, i6).m21426getFg20d7_KjU();
                    TextStyle textS2 = bentoTheme2.getTypography(composer2, i6).getTextS();
                    composer2.startReplaceGroup(5004770);
                    boolean zChanged7 = composer2.changed(constraintLayoutBaseScope4Component7);
                    Object objRememberedValue14 = composer2.rememberedValue();
                    if (zChanged7 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue14 = new StatsSectionKt$BidAskSection$1$6$1(constraintLayoutBaseScope4Component7);
                        composer2.updateRememberedValue(objRememberedValue14);
                    }
                    composer2.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(strStringResource2, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue14), Color.m6701boximpl(jM21426getFg20d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textS2, composer2, 0, 0, 8184);
                    String text3 = StringResources2.getText(statsData.getAsk(), composer2, i7);
                    TextStyle textL2 = bentoTheme2.getTypography(composer2, i6).getTextL();
                    FontWeight bold2 = companion3.getBold();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged8 = composer2.changed(constraintLayoutBaseScope4Component6) | composer2.changed(constraintLayoutBaseScope4Component8);
                    Object objRememberedValue15 = composer2.rememberedValue();
                    if (zChanged8 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue15 = new StatsSectionKt$BidAskSection$1$7$1(constraintLayoutBaseScope4Component6, constraintLayoutBaseScope4Component8);
                        composer2.updateRememberedValue(objRememberedValue15);
                    }
                    composer2.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(text3, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue15), null, null, bold2, null, null, 0, false, 0, 0, null, 0, textL2, composer2, 24576, 0, 8172);
                    String text4 = StringResources2.getText(statsData.getAskSize(), composer2, i7);
                    TextStyle textM2 = bentoTheme2.getTypography(composer2, i6).getTextM();
                    composer2.startReplaceGroup(5004770);
                    boolean zChanged9 = composer2.changed(constraintLayoutBaseScope4Component7);
                    Object objRememberedValue16 = composer2.rememberedValue();
                    if (zChanged9 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue16 = new StatsSectionKt$BidAskSection$1$8$1(constraintLayoutBaseScope4Component7);
                        composer2.updateRememberedValue(objRememberedValue16);
                    }
                    composer2.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(text4, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue16), null, null, null, null, null, 0, false, 0, 0, null, 0, textM2, composer2, 0, 0, 8188);
                    constraintLayoutScope2.createVerticalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component6, constraintLayoutBaseScope4Component7, constraintLayoutBaseScope4Component8}, companion4.getPacked());
                    composer2.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(function0, composer2, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), measurePolicy2, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StatsSectionKt.BidAskSection$lambda$11(statsData, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void MoreStats(final FuturesDetailViewState.StatsData statsData, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-558046288);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(statsData) : composerStartRestartGroup.changedInstance(statsData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-558046288, i2, -1, "com.robinhood.android.futures.detail.ui.MoreStats (StatsSection.kt:169)");
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Measurer2(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue5;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
            final int i3 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            boolean zChanged = zChangedInstance | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$MoreStats$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        snapshotState2.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i3);
                        snapshotState.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$MoreStats$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                measurer22.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicy);
                objRememberedValue6 = measurePolicy;
            }
            MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$MoreStats$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final Function0 function0 = (Function0) objRememberedValue7;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$MoreStats$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierM5146paddingqDBjuR0$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$MoreStats$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i4, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    snapshotState2.setValue(Unit.INSTANCE);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer2.startReplaceGroup(1029271455);
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                    AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_stats_high_label, composer2, 0), null, 2, null);
                    StringResource high = statsData.getHigh();
                    int i5 = StringResource.$stable;
                    AnnotatedString annotatedString2 = new AnnotatedString(StringResources2.getText(high, composer2, i5), null, 2, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, null, null, annotatedString2, null, bentoTheme.getTypography(composer2, i6).getTextM(), null, null, false, false, 3933, null);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    float f = 0;
                    Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f));
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component2) | composer2.changed(constraintLayoutBaseScope4Component3);
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new StatsSectionKt$MoreStats$1$1$1(constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component3);
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierM5174width3ABfNKs, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9);
                    int i7 = BentoDataRowState.$stable;
                    BentoDataRowKt.BentoDataRow(bentoDataRowState, modifierConstrainAs, null, composer2, i7, 4);
                    BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_stats_low_label, composer2, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources2.getText(statsData.getLow(), composer2, i5), null, 2, null), null, bentoTheme.getTypography(composer2, i6).getTextM(), null, null, false, false, 3933, null);
                    Modifier modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f));
                    composer2.startReplaceGroup(5004770);
                    boolean zChanged3 = composer2.changed(constraintLayoutBaseScope4Component1);
                    Object objRememberedValue10 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new StatsSectionKt$MoreStats$1$2$1(constraintLayoutBaseScope4Component1);
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    composer2.endReplaceGroup();
                    BentoDataRowKt.BentoDataRow(bentoDataRowState2, constraintLayoutScope2.constrainAs(modifierM5174width3ABfNKs2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10), null, composer2, i7, 4);
                    BentoDataRowState bentoDataRowState3 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_stats_volume_label, composer2, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources2.getText(statsData.getVolume(), composer2, i5), null, 2, null), null, bentoTheme.getTypography(composer2, i6).getTextM(), null, null, false, false, 3933, null);
                    Modifier modifierM5174width3ABfNKs3 = SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f));
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged4 = composer2.changed(constraintLayoutBaseScope4Component4) | composer2.changed(constraintLayoutBaseScope4Component1);
                    Object objRememberedValue11 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new StatsSectionKt$MoreStats$1$3$1(constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component1);
                        composer2.updateRememberedValue(objRememberedValue11);
                    }
                    composer2.endReplaceGroup();
                    BentoDataRowKt.BentoDataRow(bentoDataRowState3, constraintLayoutScope2.constrainAs(modifierM5174width3ABfNKs3, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), null, composer2, i7, 4);
                    BentoDataRowState bentoDataRowState4 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_stats_prev_settlement_label, composer2, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources2.getText(statsData.getPrevSettlement(), composer2, i5), null, 2, null), null, bentoTheme.getTypography(composer2, i6).getTextM(), null, null, false, false, 3933, null);
                    Modifier modifierM5174width3ABfNKs4 = SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f));
                    composer2.startReplaceGroup(5004770);
                    boolean zChanged5 = composer2.changed(constraintLayoutBaseScope4Component3);
                    Object objRememberedValue12 = composer2.rememberedValue();
                    if (zChanged5 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new StatsSectionKt$MoreStats$1$4$1(constraintLayoutBaseScope4Component3);
                        composer2.updateRememberedValue(objRememberedValue12);
                    }
                    composer2.endReplaceGroup();
                    BentoDataRowKt.BentoDataRow(bentoDataRowState4, constraintLayoutScope2.constrainAs(modifierM5174width3ABfNKs4, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue12), null, composer2, i7, 4);
                    composer2.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(function0, composer2, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), measurePolicy2, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StatsSectionKt.MoreStats$lambda$17(statsData, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

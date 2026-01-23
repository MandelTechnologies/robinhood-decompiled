package com.robinhood.shared.crypto.charts.p374ui;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.charts.model.LegendItem;
import com.robinhood.android.charts.segmented.SegmentedLineAnimation;
import com.robinhood.android.charts.span.DisplaySpanDynamicSelector;
import com.robinhood.android.charts.span.SpanSelectorTrailingButton;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.shared.crypto.charts.p374ui.HistoricalChartComposable2;
import com.robinhood.shared.crypto.p375ui.reward.CryptoRewardButton;
import com.robinhood.utils.Either;
import com.robinhood.utils.compose.extensions.ModifiersKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.ButtonDto;

/* compiled from: HistoricalChartComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"ChartContentTag", "", "HistoricalChartComposable", "", "state", "Lcom/robinhood/shared/crypto/charts/ui/HistoricalChartState;", "onSpanSelected", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "onScrub", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "onTrailingIconClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/crypto/charts/ui/HistoricalChartState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewChartWithPlaceholder", "(Landroidx/compose/runtime/Composer;I)V", "lib-charts-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class HistoricalChartComposable2 {
    public static final String ChartContentTag = "chartContentTag";

    /* compiled from: HistoricalChartComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HistoricalChartComposable.values().length];
            try {
                iArr[HistoricalChartComposable.LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HistoricalChartComposable.CANDLE_STICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoricalChartComposable$lambda$11(HistoricalChartState historicalChartState, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HistoricalChartComposable(historicalChartState, function1, function12, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewChartWithPlaceholder$lambda$12(int i, Composer composer, int i2) {
        PreviewChartWithPlaceholder(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HistoricalChartComposable(HistoricalChartState state, final Function1<? super DisplaySpan, Unit> onSpanSelected, final Function1<? super Point, Unit> onScrub, final Function0<Unit> onTrailingIconClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        float f;
        int i4;
        boolean z;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int i5;
        boolean z2;
        Composer composer3;
        final HistoricalChartState historicalChartState;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onSpanSelected, "onSpanSelected");
        Intrinsics.checkNotNullParameter(onScrub, "onScrub");
        Intrinsics.checkNotNullParameter(onTrailingIconClick, "onTrailingIconClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2103263454);
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
            i3 |= composerStartRestartGroup.changedInstance(onSpanSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScrub) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTrailingIconClick) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2103263454, i3, -1, "com.robinhood.shared.crypto.charts.ui.HistoricalChartComposable (HistoricalChartComposable.kt:63)");
                }
                composerStartRestartGroup.startReplaceGroup(-1693405066);
                ImmutableList<Line> immutableListAnimateSduiLineList = !state.isAnimationEnabled() ? SegmentedLineAnimation.animateSduiLineList(state.getLines(), AnimationSpecKt.tween$default(500, 0, null, 6, null), composerStartRestartGroup, 48, 0) : state.getLines();
                composerStartRestartGroup.endReplaceGroup();
                Modifier contentDescriptionIf = ModifiersKt.setContentDescriptionIf(modifier4, state.isLoading(), StringResources_androidKt.stringResource(C37632R.string.crypto_status_loading, composerStartRestartGroup, 0), true);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, contentDescriptionIf);
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
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifier5 = modifier4;
                ImmutableList<Line> immutableList = immutableListAnimateSduiLineList;
                HistoricalChartHeaderComposable.CryptoHistoricalChartHeader(state.getCursorData(), state.isLoading(), state.getLegendList(composerStartRestartGroup, i3 & 14), state.getPriceString(), state.getShowCandleScrubData(), state.getHeader(), null, composerStartRestartGroup, LegendItem.$stable << 6, 64);
                composerStartRestartGroup.startReplaceGroup(546199510);
                if (state.getRewardButton() == null) {
                    ButtonDto rewardButton = state.getRewardButton();
                    BentoTheme4 rewardButtonThemeDirection = state.getRewardButtonThemeDirection();
                    z = 0;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.wrapContentSize$default(boxScopeInstance.align(companion3, companion.getTopEnd()), null, false, 3, null), 0.0f, composerStartRestartGroup, 0, 1);
                    f = 0.0f;
                    i4 = 1;
                    composer2 = composerStartRestartGroup;
                    CryptoRewardButton.CryptoRewardButton(rewardButton, rewardButtonThemeDirection, modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                } else {
                    composer2 = composerStartRestartGroup;
                    f = 0.0f;
                    i4 = 1;
                    z = 0;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                SduiCursorData2.SduiLabelTrack(null, state.getScrubPoint(), composer2, z ? 1 : 0, i4);
                Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion3, f, i4, null), null, z, 3, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), z);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, z ? 1 : 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierWrapContentHeight$default);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                i5 = WhenMappings.$EnumSwitchMapping$0[state.getChartMode().ordinal()];
                if (i5 != i4) {
                    int i7 = i4;
                    Composer composer4 = composer2;
                    composer4.startReplaceGroup(-1349779217);
                    Modifier modifierTestTag = TestTag3.testTag(Clip.clipToBounds(com.robinhood.android.charts.ModifiersKt.fullWidthChartSize(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, 0.0f, 3, null))), ChartContentTag);
                    ImmutableList<ChartFill> fills = state.getFills();
                    ImmutableList<UIComponent<GenericAction>> overlays = state.getOverlays();
                    composer4.startReplaceGroup(5004770);
                    int i8 = i3 & 896;
                    int i9 = i8 == 256 ? i7 : z ? 1 : 0;
                    Object objRememberedValue = composer4.rememberedValue();
                    if (i9 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return HistoricalChartComposable2.HistoricalChartComposable$lambda$10$lambda$9$lambda$2$lambda$1(onScrub, (List) obj);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    composer4.endReplaceGroup();
                    composer4.startReplaceGroup(5004770);
                    int i10 = z;
                    if (i8 == 256) {
                        i10 = i7;
                    }
                    Object objRememberedValue2 = composer4.rememberedValue();
                    if (i10 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HistoricalChartComposable2.HistoricalChartComposable$lambda$10$lambda$9$lambda$4$lambda$3(onScrub);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    composer4.endReplaceGroup();
                    boolean zIsLoading = state.isLoading();
                    composer4.startReplaceGroup(977840936);
                    composer4.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composer4.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1<com.robinhood.android.charts.model.Point, Unit>() { // from class: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt$HistoricalChartComposable$lambda$10$lambda$9$$inlined$SduiSegmentedLineChart$1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(com.robinhood.android.charts.model.Point it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(com.robinhood.android.charts.model.Point point) {
                                invoke2(point);
                                return Unit.INSTANCE;
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue3);
                    }
                    composer4.endReplaceGroup();
                    z2 = i7;
                    SduiChartMappersKt.SduiSegmentedLineChart(modifierTestTag, fills, immutableList, overlays, null, (Function1) objRememberedValue3, function1, function0, zIsLoading, true, null, 0.0f, GenericAction.class, composer4, 24576, 0, 0);
                    composer3 = composer4;
                    composer3.endReplaceGroup();
                    composer3.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                } else {
                    if (i5 != 2) {
                        Composer composer5 = composer2;
                        composer5.startReplaceGroup(-1349780434);
                        composer5.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(1107196941);
                    Modifier modifierTestTag2 = TestTag3.testTag(com.robinhood.android.charts.ModifiersKt.fullWidthChartSize(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, 0.0f, 3, null)), ChartContentTag);
                    ImmutableList<ChartFill> fills2 = state.getFills();
                    SduiActionHandler.NotImplemented notImplemented = SduiActionHandler.NotImplemented.INSTANCE;
                    ImmutableSet<Float> legendPoints = state.getLegendPoints();
                    composer2.startReplaceGroup(5004770);
                    int i11 = i3 & 896;
                    int i12 = i11 == 256 ? i4 : z ? 1 : 0;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (i12 != 0 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return HistoricalChartComposable2.HistoricalChartComposable$lambda$10$lambda$9$lambda$6$lambda$5(onScrub, (List) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function12 = (Function1) objRememberedValue4;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    int i13 = z;
                    if (i11 == 256) {
                        i13 = i4;
                    }
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (i13 != 0 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HistoricalChartComposable2.HistoricalChartComposable$lambda$10$lambda$9$lambda$8$lambda$7(onScrub);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    Composer composer6 = composer2;
                    int i14 = i4;
                    SduiChartMappersKt.SduiCandlestickChart(modifierTestTag2, fills2, immutableList, legendPoints, notImplemented, false, function12, (Function0) objRememberedValue5, false, composer6, SduiActionHandler.NotImplemented.$stable << 12, 288);
                    composer3 = composer6;
                    composer3.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                    z2 = i14;
                }
                composer3.endNode();
                historicalChartState = state;
                BentoThemeOverlays.DirectionThemeOverlay(state.getThemeDirection(), ComposableLambda3.rememberComposableLambda(-1129938354, z2, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt$HistoricalChartComposable$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                        invoke(composer7, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer7, int i15) {
                        SpanSelectorTrailingButton spanSelectorTrailingButton;
                        if ((i15 & 3) == 2 && composer7.getSkipping()) {
                            composer7.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1129938354, i15, -1, "com.robinhood.shared.crypto.charts.ui.HistoricalChartComposable.<anonymous>.<anonymous> (HistoricalChartComposable.kt:143)");
                        }
                        Modifier modifierClearSemanticsIf = ModifiersKt.clearSemanticsIf(SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer7, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), historicalChartState.isLoading());
                        ImmutableList<DisplaySpan> spans = historicalChartState.getSpans();
                        DisplaySpan selectedSpan = historicalChartState.getSelectedSpan();
                        Either<BentoIcon4, SpanSelectorTrailingButton.DrawableIcon> trailingSpanIcon = historicalChartState.getTrailingSpanIcon();
                        composer7.startReplaceGroup(755982908);
                        if (trailingSpanIcon == null) {
                            spanSelectorTrailingButton = null;
                        } else {
                            spanSelectorTrailingButton = new SpanSelectorTrailingButton(trailingSpanIcon, StringResources_androidKt.stringResource(C37632R.string.crypto_detail_chart_toggle_content_description, composer7, 0), onTrailingIconClick);
                        }
                        composer7.endReplaceGroup();
                        DisplaySpanDynamicSelector.DisplaySpanDynamicSelector(spans, selectedSpan, modifierClearSemanticsIf, null, onSpanSelected, spanSelectorTrailingButton, false, null, composer7, (SpanSelectorTrailingButton.$stable << 15) | 1572864, 136);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 48);
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                historicalChartState = state;
                composer3 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final HistoricalChartState historicalChartState2 = historicalChartState;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HistoricalChartComposable2.HistoricalChartComposable$lambda$11(historicalChartState2, onSpanSelected, onScrub, onTrailingIconClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1693405066);
            if (!state.isAnimationEnabled()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier contentDescriptionIf2 = ModifiersKt.setContentDescriptionIf(modifier4, state.isLoading(), StringResources_androidKt.stringResource(C37632R.string.crypto_status_loading, composerStartRestartGroup, 0), true);
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, contentDescriptionIf2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy3, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifier52 = modifier4;
                    ImmutableList<Line> immutableList2 = immutableListAnimateSduiLineList;
                    HistoricalChartHeaderComposable.CryptoHistoricalChartHeader(state.getCursorData(), state.isLoading(), state.getLegendList(composerStartRestartGroup, i3 & 14), state.getPriceString(), state.getShowCandleScrubData(), state.getHeader(), null, composerStartRestartGroup, LegendItem.$stable << 6, 64);
                    composerStartRestartGroup.startReplaceGroup(546199510);
                    if (state.getRewardButton() == null) {
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    SduiCursorData2.SduiLabelTrack(null, state.getScrubPoint(), composer2, z ? 1 : 0, i4);
                    Modifier modifierWrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion32, f, i4, null), null, z, 3, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), z);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, z ? 1 : 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierWrapContentHeight$default2);
                    Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                    if (composer2.getApplier() == null) {
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                        i5 = WhenMappings.$EnumSwitchMapping$0[state.getChartMode().ordinal()];
                        if (i5 != i4) {
                        }
                        composer3.endNode();
                        historicalChartState = state;
                        BentoThemeOverlays.DirectionThemeOverlay(state.getThemeDirection(), ComposableLambda3.rememberComposableLambda(-1129938354, z2, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt$HistoricalChartComposable$1$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                invoke(composer7, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer7, int i15) {
                                SpanSelectorTrailingButton spanSelectorTrailingButton;
                                if ((i15 & 3) == 2 && composer7.getSkipping()) {
                                    composer7.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1129938354, i15, -1, "com.robinhood.shared.crypto.charts.ui.HistoricalChartComposable.<anonymous>.<anonymous> (HistoricalChartComposable.kt:143)");
                                }
                                Modifier modifierClearSemanticsIf = ModifiersKt.clearSemanticsIf(SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer7, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), historicalChartState.isLoading());
                                ImmutableList<DisplaySpan> spans = historicalChartState.getSpans();
                                DisplaySpan selectedSpan = historicalChartState.getSelectedSpan();
                                Either<BentoIcon4, SpanSelectorTrailingButton.DrawableIcon> trailingSpanIcon = historicalChartState.getTrailingSpanIcon();
                                composer7.startReplaceGroup(755982908);
                                if (trailingSpanIcon == null) {
                                    spanSelectorTrailingButton = null;
                                } else {
                                    spanSelectorTrailingButton = new SpanSelectorTrailingButton(trailingSpanIcon, StringResources_androidKt.stringResource(C37632R.string.crypto_detail_chart_toggle_content_description, composer7, 0), onTrailingIconClick);
                                }
                                composer7.endReplaceGroup();
                                DisplaySpanDynamicSelector.DisplaySpanDynamicSelector(spans, selectedSpan, modifierClearSemanticsIf, null, onSpanSelected, spanSelectorTrailingButton, false, null, composer7, (SpanSelectorTrailingButton.$stable << 15) | 1572864, 136);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 48);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoricalChartComposable$lambda$10$lambda$9$lambda$2$lambda$1(Function1 function1, List scrubPoint) {
        Intrinsics.checkNotNullParameter(scrubPoint, "scrubPoint");
        function1.invoke(CollectionsKt.lastOrNull(scrubPoint));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoricalChartComposable$lambda$10$lambda$9$lambda$4$lambda$3(Function1 function1) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoricalChartComposable$lambda$10$lambda$9$lambda$6$lambda$5(Function1 function1, List scrubPoint) {
        Intrinsics.checkNotNullParameter(scrubPoint, "scrubPoint");
        function1.invoke(CollectionsKt.lastOrNull(scrubPoint));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoricalChartComposable$lambda$10$lambda$9$lambda$8$lambda$7(Function1 function1) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    private static final void PreviewChartWithPlaceholder(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1255544042);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1255544042, i, -1, "com.robinhood.shared.crypto.charts.ui.PreviewChartWithPlaceholder (HistoricalChartComposable.kt:213)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(2050168994, true, new C376271(new HistoricalChartState(HistoricalChartComposable.LINE, null, extensions2.persistentListOf(), extensions2.persistentListOf(), false, false, false, extensions2.persistentSetOf(), extensions2.persistentListOf(), extensions2.persistentListOf(), Direction.f5855UP, "$12,345.67", null, BentoTheme4.POSITIVE, null, DisplaySpan.DAY, extensions2.persistentListOf(), null, extensions2.persistentListOf())), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HistoricalChartComposable2.PreviewChartWithPlaceholder$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: HistoricalChartComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt$PreviewChartWithPlaceholder$1 */
    static final class C376271 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ HistoricalChartState $state;

        C376271(HistoricalChartState historicalChartState) {
            this.$state = historicalChartState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2050168994, i, -1, "com.robinhood.shared.crypto.charts.ui.PreviewChartWithPlaceholder.<anonymous> (HistoricalChartComposable.kt:237)");
            }
            HistoricalChartState historicalChartState = this.$state;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt$PreviewChartWithPlaceholder$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HistoricalChartComposable2.C376271.invoke$lambda$1$lambda$0((DisplaySpan) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt$PreviewChartWithPlaceholder$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HistoricalChartComposable2.C376271.invoke$lambda$3$lambda$2((Point) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.charts.ui.HistoricalChartComposableKt$PreviewChartWithPlaceholder$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            HistoricalChartComposable2.HistoricalChartComposable(historicalChartState, function1, function12, (Function0) objRememberedValue3, null, composer, 3504, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(DisplaySpan it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Point point) {
            return Unit.INSTANCE;
        }
    }
}

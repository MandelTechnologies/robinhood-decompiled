package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholds;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState;
import com.robinhood.android.options.portfolioriskanalyzer.components.search.PnLUiState;
import com.robinhood.android.options.portfolioriskanalyzer.extensions.UtilsKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p355ui.UiAggregateOptionPositionLeg;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionsPortfolioRiskAnalyzerOptionPositionRow.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a÷\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000326\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u000526\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\u00052Q\u0010\u000e\u001aM\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u000f2f\u0010\u0015\u001ab\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00010\u001eH\u0007¢\u0006\u0002\u0010 \u001a3\u0010!\u001a\u00020\u00012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\u0010%¨\u0006&²\u0006\f\u0010'\u001a\u0004\u0018\u00010(X\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u0004\u0018\u00010*X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002"}, m3636d2 = {"OptionsPortfolioRiskAnalyzerOptionPositionRow", "", "state", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState;", "onExpandOrCollapse", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "rowId", "", "collapsed", "onPlusOrMinusClicked", "isPlus", "onAggregateOptionRowCheckedChanged", "Lkotlin/Function3;", "Ljava/util/UUID;", "aggregatePositionIdToCheck", "", "relatedLegPositionIds", "checked", "onLegOptionRowCheckedChanged", "Lkotlin/Function4;", "legPositionIdToCheck", "relatedAggregatePositionId", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDuxo;", "onOpenAggregateOptionsDetailPage", "Lkotlin/Function1;", "aggregatePositionId", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDuxo;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PlusMinusPill", "onMinusClick", "Lkotlin/Function0;", "onPlusClick", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-options-portfolio-risk-analyzer_externalDebug", "tradeActionViewState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/TradeActionUiState;", "innerViewState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState;", "expanded", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "borderAlpha", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerOptionPositionRow {

    /* compiled from: OptionsPortfolioRiskAnalyzerOptionPositionRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2.values().length];
            try {
                iArr[OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$32(OptionsPortfolioRiskAnalyzerOptionPositionRowViewState optionsPortfolioRiskAnalyzerOptionPositionRowViewState, Function2 function2, Function2 function22, Function3 function3, Function4 function4, Modifier modifier, OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Function1 function1, int i, int i2, Composer composer, int i3) {
        OptionsPortfolioRiskAnalyzerOptionPositionRow(optionsPortfolioRiskAnalyzerOptionPositionRowViewState, function2, function22, function3, function4, modifier, optionsPortfolioRiskAnalyzerPositionDuxo, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlusMinusPill$lambda$33(Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlusMinusPill(function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$15(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$17(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradeActionUiState OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$6(SnapshotState4<TradeActionUiState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7(SnapshotState4<OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final void OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$9$lambda$8() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$31$lambda$20$lambda$19 */
    public static final Unit m2267x3b8e22ac(Function2 function2, OptionsPortfolioRiskAnalyzerOptionPositionRowViewState optionsPortfolioRiskAnalyzerOptionPositionRowViewState, SnapshotState snapshotState) {
        OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$11(snapshotState, !OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$10(snapshotState));
        function2.invoke(optionsPortfolioRiskAnalyzerOptionPositionRowViewState.getRowId(), Boolean.valueOf(!optionsPortfolioRiskAnalyzerOptionPositionRowViewState.getCollapsed()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$31$lambda$30$lambda$25$lambda$23$lambda$22 */
    public static final Unit m2268xea3731d9(OptionsPortfolioRiskAnalyzerOptionPositionRowViewState optionsPortfolioRiskAnalyzerOptionPositionRowViewState, Function3 function3, Function4 function4) {
        if (optionsPortfolioRiskAnalyzerOptionPositionRowViewState instanceof OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate) {
            OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate aggregate = (OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate) optionsPortfolioRiskAnalyzerOptionPositionRowViewState;
            UUID aggregatePositionId = aggregate.getAggregatePositionId();
            List<OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg> legs = aggregate.getLegs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
            Iterator<T> it = legs.iterator();
            while (it.hasNext()) {
                arrayList.add(((OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg) it.next()).getInstrumentPositionId());
            }
            function3.invoke(aggregatePositionId, arrayList, Boolean.valueOf(aggregate.getCheckState() != ToggleableState.f174On));
        } else {
            if (!(optionsPortfolioRiskAnalyzerOptionPositionRowViewState instanceof OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg)) {
                throw new NoWhenBranchMatchedException();
            }
            OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg leg = (OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg) optionsPortfolioRiskAnalyzerOptionPositionRowViewState;
            function4.invoke(leg.getInstrumentPositionId(), leg.getAggregatePositionId(), leg.getRelatedLegPositionIds(), Boolean.valueOf(leg.getCheckState() != ToggleableState.f174On));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlusMinusPill(final Function0<Unit> onMinusClick, final Function0<Unit> onPlusClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onMinusClick, "onMinusClick");
        Intrinsics.checkNotNullParameter(onPlusClick, "onPlusClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(592202271);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onMinusClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPlusClick) ? 32 : 16;
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
                    ComposerKt.traceEventStart(592202271, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.PlusMinusPill (OptionsPortfolioRiskAnalyzerOptionPositionRow.kt:466)");
                }
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifier4, C2002Dp.m7995constructorimpl(100)), C2002Dp.m7995constructorimpl(32));
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                RoundedCornerShape circleShape = RoundedCornerShape2.getCircleShape();
                BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl((float) 0.5d), bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU());
                float f = 0;
                Modifier modifier5 = modifier4;
                SurfaceKt.m5967SurfaceT9BRK9s(modifierM5156height3ABfNKs, circleShape, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), borderStrokeM4886BorderStrokecXLIe8U, ComposableLambda3.rememberComposableLambda(1922520250, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt.PlusMinusPill.1
                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1922520250, i6, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.PlusMinusPill.<anonymous> (OptionsPortfolioRiskAnalyzerOptionPositionRow.kt:478)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        Function0<Unit> function0 = onMinusClick;
                        Function0<Unit> function02 = onPlusClick;
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                        RoundedCornerShape roundedCornerShapeRoundedCornerShape$default = RoundedCornerShape2.RoundedCornerShape$default(50, 0, 0, 50, 6, null);
                        RoundedCornerShape roundedCornerShapeRoundedCornerShape$default2 = RoundedCornerShape2.RoundedCornerShape$default(0, 50, 50, 0, 9, null);
                        composer2.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion4 = Composer.INSTANCE;
                        if (objRememberedValue == companion4.getEmpty()) {
                            objRememberedValue = InteractionSource2.MutableInteractionSource();
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == companion4.getEmpty()) {
                            objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue2;
                        composer2.endReplaceGroup();
                        Modifier modifierIndication = IndicationKt.indication(Clip.clip(SizeKt.fillMaxHeight$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), 0.0f, 1, null), roundedCornerShapeRoundedCornerShape$default), interactionSource3, RippleKt.m5937rippleH2RKhps$default(true, 0.0f, 0L, 6, null));
                        Role.Companion companion5 = Role.INSTANCE;
                        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierIndication, interactionSource3, null, false, null, Role.m7472boximpl(companion5.m7479getButtono7Vup1c()), function0, 12, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM4891clickableO2vRcR0$default);
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.MINUS_16.getResourceId(), composer2, 0), (String) null, (Modifier) null, 0L, composer2, 48, 12);
                        composer2.endNode();
                        BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(1)), 0.0f, C2002Dp.m7995constructorimpl(4), 1, null), 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU(), null, 2, null), composer2, 0);
                        Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(IndicationKt.indication(Clip.clip(SizeKt.fillMaxHeight$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), 0.0f, 1, null), roundedCornerShapeRoundedCornerShape$default2), interactionSource32, RippleKt.m5937rippleH2RKhps$default(true, 0.0f, 0L, 6, null)), interactionSource32, null, false, null, Role.m7472boximpl(companion5.m7479getButtono7Vup1c()), function02, 12, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM4891clickableO2vRcR0$default2);
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
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                        IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.PLUS_16.getResourceId(), composer2, 0), (String) null, (Modifier) null, 0L, composer2, 48, 12);
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 12804096, 0);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionsPortfolioRiskAnalyzerOptionPositionRow.PlusMinusPill$lambda$33(onMinusClick, onPlusClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifier4, C2002Dp.m7995constructorimpl(100)), C2002Dp.m7995constructorimpl(32));
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU();
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
            RoundedCornerShape circleShape2 = RoundedCornerShape2.getCircleShape();
            BorderStroke borderStrokeM4886BorderStrokecXLIe8U2 = BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl((float) 0.5d), bentoTheme2.getColors(composerStartRestartGroup, i52).m21427getFg30d7_KjU());
            float f2 = 0;
            Modifier modifier52 = modifier4;
            SurfaceKt.m5967SurfaceT9BRK9s(modifierM5156height3ABfNKs2, circleShape2, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f2), borderStrokeM4886BorderStrokecXLIe8U2, ComposableLambda3.rememberComposableLambda(1922520250, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt.PlusMinusPill.1
                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1922520250, i6, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.PlusMinusPill.<anonymous> (OptionsPortfolioRiskAnalyzerOptionPositionRow.kt:478)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    Function0<Unit> function0 = onMinusClick;
                    Function0<Unit> function02 = onPlusClick;
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                    RoundedCornerShape roundedCornerShapeRoundedCornerShape$default = RoundedCornerShape2.RoundedCornerShape$default(50, 0, 0, 50, 6, null);
                    RoundedCornerShape roundedCornerShapeRoundedCornerShape$default2 = RoundedCornerShape2.RoundedCornerShape$default(0, 50, 50, 0, 9, null);
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objRememberedValue == companion4.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion4.getEmpty()) {
                        objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue2;
                    composer2.endReplaceGroup();
                    Modifier modifierIndication = IndicationKt.indication(Clip.clip(SizeKt.fillMaxHeight$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), 0.0f, 1, null), roundedCornerShapeRoundedCornerShape$default), interactionSource3, RippleKt.m5937rippleH2RKhps$default(true, 0.0f, 0L, 6, null));
                    Role.Companion companion5 = Role.INSTANCE;
                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierIndication, interactionSource3, null, false, null, Role.m7472boximpl(companion5.m7479getButtono7Vup1c()), function0, 12, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM4891clickableO2vRcR0$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.MINUS_16.getResourceId(), composer2, 0), (String) null, (Modifier) null, 0L, composer2, 48, 12);
                    composer2.endNode();
                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(1)), 0.0f, C2002Dp.m7995constructorimpl(4), 1, null), 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU(), null, 2, null), composer2, 0);
                    Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(IndicationKt.indication(Clip.clip(SizeKt.fillMaxHeight$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), 0.0f, 1, null), roundedCornerShapeRoundedCornerShape$default2), interactionSource32, RippleKt.m5937rippleH2RKhps$default(true, 0.0f, 0L, 6, null)), interactionSource32, null, false, null, Role.m7472boximpl(companion5.m7479getButtono7Vup1c()), function02, 12, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM4891clickableO2vRcR0$default2);
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
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                    IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.PLUS_16.getResourceId(), composer2, 0), (String) null, (Modifier) null, 0L, composer2, 48, 12);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12804096, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x09c7  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0a3e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0b2c  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0b99  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0c65  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0c95  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0ca2  */
    /* JADX WARN: Removed duplicated region for block: B:402:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsPortfolioRiskAnalyzerOptionPositionRow(final OptionsPortfolioRiskAnalyzerOptionPositionRowViewState state, final Function2<? super String, ? super Boolean, Unit> onExpandOrCollapse, final Function2<? super String, ? super Boolean, Unit> onPlusOrMinusClicked, final Function3<? super UUID, ? super List<UUID>, ? super Boolean, Unit> onAggregateOptionRowCheckedChanged, final Function4<? super UUID, ? super UUID, ? super List<UUID>, ? super Boolean, Unit> onLegOptionRowCheckedChanged, Modifier modifier, OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, final Function1<? super UUID, Unit> onOpenAggregateOptionsDetailPage, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo2;
        Modifier modifier3;
        Composer composer2;
        OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo3;
        boolean zChanged;
        Object objRememberedValue;
        Context context;
        Composer composer3;
        boolean z;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Composer composer4;
        Object objRememberedValue2;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue3;
        MutableTransitionState mutableTransitionState;
        boolean zChangedInstance;
        Object objRememberedValue4;
        boolean z2;
        Transition transition;
        boolean z3;
        SnapshotState4 snapshotState4;
        int i4;
        C2002Dp c2002Dp;
        boolean z4;
        int i5;
        SnapshotState4 snapshotState42;
        boolean z5;
        Float f;
        boolean z6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue5;
        boolean zChanged2;
        Object objRememberedValue6;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        boolean z7;
        Object objRememberedValue7;
        final Function3<? super UUID, ? super List<UUID>, ? super Boolean, Unit> function3;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        int currentCompositeKeyHash5;
        Composer composerM6388constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        int currentCompositeKeyHash6;
        Composer composerM6388constructorimpl6;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6;
        OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7;
        OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$72;
        String str;
        int i6;
        long jM21456getPositive0d7_KjU;
        Composer composer5;
        final OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo4;
        final Modifier modifier4;
        PnLUiState pnlUiState;
        PnLUiState pnlUiState2;
        BigDecimal pnlPercentage;
        PnLUiState pnlUiState3;
        BigDecimal pnlNumeric;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onExpandOrCollapse, "onExpandOrCollapse");
        Intrinsics.checkNotNullParameter(onPlusOrMinusClicked, "onPlusOrMinusClicked");
        Intrinsics.checkNotNullParameter(onAggregateOptionRowCheckedChanged, "onAggregateOptionRowCheckedChanged");
        Intrinsics.checkNotNullParameter(onLegOptionRowCheckedChanged, "onLegOptionRowCheckedChanged");
        Intrinsics.checkNotNullParameter(onOpenAggregateOptionsDetailPage, "onOpenAggregateOptionsDetailPage");
        Composer composerStartRestartGroup = composer.startRestartGroup(1900425020);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onExpandOrCollapse) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPlusOrMinusClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAggregateOptionRowCheckedChanged) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onLegOptionRowCheckedChanged) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= 196608;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
        }
        if ((i & 1572864) == 0) {
            optionsPortfolioRiskAnalyzerPositionDuxo2 = optionsPortfolioRiskAnalyzerPositionDuxo;
            i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changedInstance(optionsPortfolioRiskAnalyzerPositionDuxo2)) ? 1048576 : 524288;
        } else {
            optionsPortfolioRiskAnalyzerPositionDuxo2 = optionsPortfolioRiskAnalyzerPositionDuxo;
        }
        if ((i2 & 128) == 0) {
            i7 = (12582912 & i) == 0 ? composerStartRestartGroup.changedInstance(onOpenAggregateOptionsDetailPage) ? 8388608 : 4194304 : 12582912;
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 64) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsPortfolioRiskAnalyzerPositionDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue8 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$OptionsPortfolioRiskAnalyzerOptionPositionRow$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$OptionsPortfolioRiskAnalyzerOptionPositionRow$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue8);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue8, composer2, 0);
                        composer2.endReplaceGroup();
                        optionsPortfolioRiskAnalyzerPositionDuxo3 = (OptionsPortfolioRiskAnalyzerPositionDuxo) baseDuxo;
                        i3 &= -3670017;
                    } else {
                        composer2 = composerStartRestartGroup;
                        optionsPortfolioRiskAnalyzerPositionDuxo3 = optionsPortfolioRiskAnalyzerPositionDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    optionsPortfolioRiskAnalyzerPositionDuxo3 = optionsPortfolioRiskAnalyzerPositionDuxo2;
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1900425020, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRow (OptionsPortfolioRiskAnalyzerOptionPositionRow.kt:92)");
                }
                Context context2 = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                boolean z8 = state instanceof OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate;
                String rowId = state.getRowId();
                composer2.startReplaceGroup(5004770);
                zChanged = composer2.changed(rowId);
                objRememberedValue = composer2.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = optionsPortfolioRiskAnalyzerPositionDuxo3.getOptionPositionInnerViewStateFlow(state);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                StateFlow stateFlow = (StateFlow) objRememberedValue;
                composer2.endReplaceGroup();
                if (state instanceof OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate) {
                    context = context2;
                    composer3 = composer2;
                    z = z8;
                    composer3.startReplaceGroup(-695114731);
                    composer3.startReplaceGroup(1849434622);
                    Object objRememberedValue9 = composer3.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composer3.updateRememberedValue(objRememberedValue9);
                    }
                    snapshotState4CollectAsStateWithLifecycle = (SnapshotState) objRememberedValue9;
                    composer3.endReplaceGroup();
                    composer3.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-695821810);
                    OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate aggregate = (OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate) state;
                    List<OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg> legs = aggregate.getLegs();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : legs) {
                        OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate aggregate2 = aggregate;
                        Context context3 = context2;
                        if (((OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg) obj).getCheckState() == ToggleableState.f174On) {
                            arrayList.add(obj);
                        }
                        aggregate = aggregate2;
                        context2 = context3;
                    }
                    OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate aggregate3 = aggregate;
                    context = context2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg) it.next()).getInstrumentPositionId());
                    }
                    List<UiAggregateOptionPositionLeg> uiLegs = aggregate3.getAggregatePosition().getUiLegs();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = uiLegs.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Iterator it3 = it2;
                        if (arrayList2.contains(((UiAggregateOptionPositionLeg) next).getOptionPositionId())) {
                            arrayList3.add(next);
                        }
                        it2 = it3;
                    }
                    String rowId2 = state.getRowId();
                    BigDecimal simulatedQuantityDelta = aggregate3.getSimulatedQuantityDelta();
                    composer2.startReplaceGroup(-1746271574);
                    boolean zChanged3 = composer2.changed(rowId2) | composer2.changed(arrayList3) | composer2.changed(simulatedQuantityDelta);
                    Object objRememberedValue10 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = optionsPortfolioRiskAnalyzerPositionDuxo3.getTradeActionButtonViewState(aggregate3.getAggregatePosition(), arrayList3, aggregate3.getSimulatedQuantityDelta());
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    composer2.endReplaceGroup();
                    z = z8;
                    Composer composer6 = composer2;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle((StateFlow) objRememberedValue10, (Object) null, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer6, 48, 14);
                    composer3 = composer6;
                    composer3.endReplaceGroup();
                }
                SnapshotState4 snapshotState43 = snapshotState4CollectAsStateWithLifecycle;
                composer4 = composer3;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(stateFlow, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                Object[] objArr = {state.getRowId()};
                composer4.startReplaceGroup(1849434622);
                objRememberedValue2 = composer4.rememberedValue();
                companion = Composer.INSTANCE;
                OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo5 = optionsPortfolioRiskAnalyzerPositionDuxo3;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsPortfolioRiskAnalyzerOptionPositionRow.OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$9$lambda$8();
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue2);
                }
                composer4.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composer4, 3072, 6);
                composer4.startReplaceGroup(1849434622);
                objRememberedValue3 = composer4.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new MutableTransitionState(Boolean.FALSE);
                    composer4.updateRememberedValue(objRememberedValue3);
                }
                mutableTransitionState = (MutableTransitionState) objRememberedValue3;
                composer4.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$10(snapshotState));
                composer4.startReplaceGroup(-1633490746);
                zChangedInstance = composer4.changedInstance(mutableTransitionState) | composer4.changed(snapshotState);
                objRememberedValue4 = composer4.rememberedValue();
                boolean z9 = z;
                if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new OptionsPortfolioRiskAnalyzerOptionPositionRow2(mutableTransitionState, snapshotState, null);
                    composer4.updateRememberedValue(objRememberedValue4);
                }
                composer4.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer4, 0);
                z2 = !z9 && (!mutableTransitionState.isIdle() || ((Boolean) mutableTransitionState.getCurrentState()).booleanValue());
                Transition transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(z2), "ExpandTransition", composer4, 48, 0);
                C23532x11cb3d62 c23532x11cb3d62 = new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<C2002Dp>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$OptionsPortfolioRiskAnalyzerOptionPositionRow$$inlined$animateDp$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ SpringSpec<C2002Dp> invoke(Transition.Segment<Boolean> segment, Composer composer7, Integer num) {
                        return invoke(segment, composer7, num.intValue());
                    }

                    public final SpringSpec<C2002Dp> invoke(Transition.Segment<Boolean> segment, Composer composer7, int i9) {
                        composer7.startReplaceGroup(-575880366);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-575880366, i9, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1950)");
                        }
                        SpringSpec<C2002Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, C2002Dp.m7993boximpl(VisibilityThresholds.getVisibilityThreshold(C2002Dp.INSTANCE)), 3, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer7.endReplaceGroup();
                        return springSpecSpring$default;
                    }
                };
                TwoWayConverter<C2002Dp, AnimationVectors2> vectorConverter = VectorConvertersKt.getVectorConverter(C2002Dp.INSTANCE);
                boolean zBooleanValue = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
                composer4.startReplaceGroup(1045805726);
                if (ComposerKt.isTraceInProgress()) {
                    transition = transitionUpdateTransition;
                    z3 = zBooleanValue;
                    snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                    i4 = 0;
                } else {
                    transition = transitionUpdateTransition;
                    z3 = zBooleanValue;
                    snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                    i4 = 0;
                    ComposerKt.traceEventStart(1045805726, 0, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRow.<anonymous> (OptionsPortfolioRiskAnalyzerOptionPositionRow.kt:145)");
                }
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl((z3 || !z9) ? i4 : 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer4.endReplaceGroup();
                C2002Dp c2002DpM7993boximpl = C2002Dp.m7993boximpl(fM7995constructorimpl);
                boolean zBooleanValue2 = ((Boolean) transition.getTargetState()).booleanValue();
                composer4.startReplaceGroup(1045805726);
                if (ComposerKt.isTraceInProgress()) {
                    c2002Dp = c2002DpM7993boximpl;
                    z4 = zBooleanValue2;
                    i5 = 0;
                } else {
                    c2002Dp = c2002DpM7993boximpl;
                    z4 = zBooleanValue2;
                    i5 = 0;
                    ComposerKt.traceEventStart(1045805726, 0, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRow.<anonymous> (OptionsPortfolioRiskAnalyzerOptionPositionRow.kt:145)");
                }
                float fM7995constructorimpl2 = (z4 || !z9) ? C2002Dp.m7995constructorimpl(i5) : C2002Dp.m7995constructorimpl(1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer4.endReplaceGroup();
                Transition transition2 = transition;
                SnapshotState4 snapshotState4CreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition2, c2002Dp, C2002Dp.m7993boximpl(fM7995constructorimpl2), c23532x11cb3d62.invoke((C23532x11cb3d62) transition.getSegment(), (Transition.Segment) composer4, (Composer) 0), vectorConverter, "BorderWidth", composer4, 196608);
                C23533x196db000 c23533x196db000 = new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<Float>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$OptionsPortfolioRiskAnalyzerOptionPositionRow$$inlined$animateFloat$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer7, Integer num) {
                        return invoke(segment, composer7, num.intValue());
                    }

                    public final SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer7, int i9) {
                        composer7.startReplaceGroup(-522164544);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-522164544, i9, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1920)");
                        }
                        SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer7.endReplaceGroup();
                        return springSpecSpring$default;
                    }
                };
                TwoWayConverter<Float, AnimationVectors2> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                boolean zBooleanValue3 = ((Boolean) transition2.getCurrentState()).booleanValue();
                composer4.startReplaceGroup(748219480);
                if (ComposerKt.isTraceInProgress()) {
                    snapshotState42 = snapshotState4CreateTransitionAnimation;
                    z5 = zBooleanValue3;
                } else {
                    snapshotState42 = snapshotState4CreateTransitionAnimation;
                    z5 = zBooleanValue3;
                    ComposerKt.traceEventStart(748219480, 0, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRow.<anonymous> (OptionsPortfolioRiskAnalyzerOptionPositionRow.kt:146)");
                }
                float f2 = (z5 || !z9) ? 0.0f : 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer4.endReplaceGroup();
                Float fValueOf = Float.valueOf(f2);
                boolean zBooleanValue4 = ((Boolean) transition2.getTargetState()).booleanValue();
                composer4.startReplaceGroup(748219480);
                if (ComposerKt.isTraceInProgress()) {
                    f = fValueOf;
                    z6 = zBooleanValue4;
                } else {
                    f = fValueOf;
                    z6 = zBooleanValue4;
                    ComposerKt.traceEventStart(748219480, 0, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRow.<anonymous> (OptionsPortfolioRiskAnalyzerOptionPositionRow.kt:146)");
                }
                float f3 = (z6 || !z9) ? 0.0f : 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer4.endReplaceGroup();
                SnapshotState4 snapshotState4CreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transition2, f, Float.valueOf(f3), c23533x196db000.invoke((C23533x196db000) transition2.getSegment(), (Transition.Segment) composer4, (Composer) 0), vectorConverter2, "BorderAlpha", composer4, 196608);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer4, i9).m21427getFg30d7_KjU(), OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$17(snapshotState4CreateTransitionAnimation2), 0.0f, 0.0f, 0.0f, 14, null);
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(16));
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composer4.startReplaceGroup(947449231);
                float fM21593getSmallD9Ej5fM = !z9 ? bentoTheme.getSpacing(composer4, i9).m21593getSmallD9Ej5fM() : C2002Dp.m7995constructorimpl(0);
                composer4.endReplaceGroup();
                Modifier modifier5 = modifier3;
                Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Clip.clip(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, fM21593getSmallD9Ej5fM, 0.0f, 2, null), roundedCornerShapeM5327RoundedCornerShape0680j_4), OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$15(snapshotState42), jM6705copywmQWz5c$default, roundedCornerShapeM5327RoundedCornerShape0680j_4);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer4, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM4876borderxT4_qwU);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composer4.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.useNode();
                } else {
                    composer4.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
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
                composer4.startReplaceGroup(1849434622);
                objRememberedValue5 = composer4.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = InteractionSource2.MutableInteractionSource();
                    composer4.updateRememberedValue(objRememberedValue5);
                }
                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue5;
                composer4.endReplaceGroup();
                composer4.startReplaceGroup(-1746271574);
                int i10 = i3 & 14;
                zChanged2 = composer4.changed(snapshotState) | ((i3 & 112) != 32) | (i10 != 4 || ((i3 & 8) != 0 && composer4.changedInstance(state)));
                objRememberedValue6 = composer4.rememberedValue();
                if (!zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsPortfolioRiskAnalyzerOptionPositionRow.m2267x3b8e22ac(onExpandOrCollapse, state, snapshotState);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue6);
                }
                composer4.endReplaceGroup();
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(ClickableKt.m4891clickableO2vRcR0$default(companion4, interactionSource3, null, false, null, null, (Function0) objRememberedValue6, 28, null), 0.0f, bentoTheme.getSpacing(composer4, i9).m21590getDefaultD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer4, 54);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM5144paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer4.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.useNode();
                } else {
                    composer4.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Modifier modifierWeight$default = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer4, 48);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierWeight$default);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composer4.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.useNode();
                } else {
                    composer4.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                ToggleableState checkState = state.getCheckState();
                composer4.startReplaceGroup(-1746271574);
                z7 = (i10 != 4 || ((i3 & 8) != 0 && composer4.changedInstance(state))) | ((i3 & 7168) != 2048) | ((57344 & i3) != 16384);
                objRememberedValue7 = composer4.rememberedValue();
                if (!z7 || objRememberedValue7 == companion.getEmpty()) {
                    function3 = onAggregateOptionRowCheckedChanged;
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsPortfolioRiskAnalyzerOptionPositionRow.m2268xea3731d9(state, function3, onLegOptionRowCheckedChanged);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue7);
                } else {
                    function3 = onAggregateOptionRowCheckedChanged;
                }
                composer4.endReplaceGroup();
                CheckboxKt.TriStateCheckbox(checkState, (Function0) objRememberedValue7, null, false, new CheckboxColors(bentoTheme.getColors(composer4, i9).m21371getBg0d7_KjU(), Color.INSTANCE.m6725getTransparent0d7_KjU(), bentoTheme.getColors(composer4, i9).m21425getFg0d7_KjU(), bentoTheme.getColors(composer4, i9).m21371getBg0d7_KjU(), bentoTheme.getColors(composer4, i9).m21427getFg30d7_KjU(), bentoTheme.getColors(composer4, i9).m21427getFg30d7_KjU(), bentoTheme.getColors(composer4, i9).m21427getFg30d7_KjU(), bentoTheme.getColors(composer4, i9).m21425getFg0d7_KjU(), bentoTheme.getColors(composer4, i9).m21427getFg30d7_KjU(), bentoTheme.getColors(composer4, i9).m21371getBg0d7_KjU(), bentoTheme.getColors(composer4, i9).m21371getBg0d7_KjU(), bentoTheme.getColors(composer4, i9).m21427getFg30d7_KjU(), null), null, composer4, 0, 44);
                Modifier modifierWeight$default2 = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer4, 0);
                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer4, modifierWeight$default2);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                if (composer4.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.useNode();
                } else {
                    composer4.createNode(constructor4);
                }
                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer4);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                BentoText2.m20747BentoText38GnDrw(state.getTitle(), null, null, null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composer4, i9).getTextM(), composer4, 805306368, 0, 7678);
                BentoText2.m20747BentoText38GnDrw(state.getSubtitle(), null, Color.m6701boximpl(bentoTheme.getColors(composer4, i9).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composer4, i9).getTextS(), composer4, 805306368, 0, 7674);
                composer4.endNode();
                composer4.endNode();
                MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer4, 48);
                currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer4, companion4);
                Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                if (composer4.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.useNode();
                } else {
                    composer4.createNode(constructor5);
                }
                composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer4);
                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getEnd(), composer4, 48);
                currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer4, companion4);
                Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
                if (composer4.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.useNode();
                } else {
                    composer4.createNode(constructor6);
                }
                composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer4);
                Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
                optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7 = OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7(snapshotState4);
                if (optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7 != null || (pnlUiState3 = optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7.getPnlUiState()) == null || (pnlNumeric = pnlUiState3.getPnlNumeric()) == null || (str = Formats.getPriceDeltaWithHundredthDecimalFormat().format(pnlNumeric)) == null) {
                    String str2 = "-";
                }
                BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme.getColors(composer4, i9).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i9).getTextM(), composer4, 0, 0, 8186);
                optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$72 = OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7(snapshotState4);
                if (optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$72 != null || (pnlUiState2 = optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$72.getPnlUiState()) == null || (pnlPercentage = pnlUiState2.getPnlPercentage()) == null || (str = Formats.getPercentDeltaWithHundredthDecimalFormat().format(pnlPercentage)) == null) {
                    str = "-";
                }
                TextStyle textS = bentoTheme.getTypography(composer4, i9).getTextS();
                OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$73 = OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7(snapshotState4);
                i6 = WhenMappings.$EnumSwitchMapping$0[UtilsKt.toPnlColorType((optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$73 != null || (pnlUiState = optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$73.getPnlUiState()) == null) ? null : pnlUiState.getPnlPercentage()).ordinal()];
                if (i6 != 1) {
                    composer4.startReplaceGroup(-686721425);
                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composer4, i9).m21456getPositive0d7_KjU();
                    composer4.endReplaceGroup();
                } else if (i6 != 2) {
                    composer4.startReplaceGroup(-686716855);
                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composer4, i9).m21425getFg0d7_KjU();
                    composer4.endReplaceGroup();
                } else {
                    composer4.startReplaceGroup(-686718865);
                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composer4, i9).m21452getNegative0d7_KjU();
                    composer4.endReplaceGroup();
                }
                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer4, 0, 0, 8186);
                composer4.endNode();
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(!OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$10(snapshotState) ? ServerToBentoAssetMapper2.CARET_UP_16 : ServerToBentoAssetMapper2.CARET_DOWN_16), null, bentoTheme.getColors(composer4, i9).m21427getFg30d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composer4, i9).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer4, i9).m21590getDefaultD9Ej5fM(), 0.0f, 10, null), null, false, composer4, BentoIcon4.Size16.$stable | 48, 48);
                composer4.endNode();
                composer4.endNode();
                AnimatedVisibilityKt.AnimatedVisibility(column6, (MutableTransitionState<Boolean>) mutableTransitionState, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 0, null, 6, null), null, false, null, 14, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 0, null, 6, null), 0.0f, 2, null)), EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 0, Easing3.getFastOutLinearInEasing(), 2, null), companion2.getTop(), false, null, 12, null), (String) null, ComposableLambda3.rememberComposableLambda(549186570, true, new OptionsPortfolioRiskAnalyzerOptionPositionRow3(z9, state, onOpenAggregateOptionsDetailPage, snapshotState4, onExpandOrCollapse, onPlusOrMinusClicked, function3, onLegOptionRowCheckedChanged, snapshotState43, navigator, context), composer4, 54), composer4, 1576326 | (MutableTransitionState.$stable << 3), 16);
                composer5 = composer4;
                composer5.startReplaceGroup(1877758252);
                if (!z2) {
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), bentoTheme.getSpacing(composer5, i9).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composer5, i9).m21373getBg30d7_KjU(), 0.0f, composer5, 0, 4);
                }
                composer5.endReplaceGroup();
                composer5.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                optionsPortfolioRiskAnalyzerPositionDuxo4 = optionsPortfolioRiskAnalyzerPositionDuxo5;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                optionsPortfolioRiskAnalyzerPositionDuxo4 = optionsPortfolioRiskAnalyzerPositionDuxo2;
                modifier4 = modifier2;
                composer5 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer5.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return OptionsPortfolioRiskAnalyzerOptionPositionRow.OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$32(state, onExpandOrCollapse, onPlusOrMinusClicked, onAggregateOptionRowCheckedChanged, onLegOptionRowCheckedChanged, modifier4, optionsPortfolioRiskAnalyzerPositionDuxo4, onOpenAggregateOptionsDetailPage, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= i7;
        if ((4793491 & i3) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Context context22 = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Navigator navigator2 = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                boolean z82 = state instanceof OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate;
                String rowId3 = state.getRowId();
                composer2.startReplaceGroup(5004770);
                zChanged = composer2.changed(rowId3);
                objRememberedValue = composer2.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = optionsPortfolioRiskAnalyzerPositionDuxo3.getOptionPositionInnerViewStateFlow(state);
                    composer2.updateRememberedValue(objRememberedValue);
                    StateFlow stateFlow2 = (StateFlow) objRememberedValue;
                    composer2.endReplaceGroup();
                    if (state instanceof OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate) {
                    }
                    SnapshotState4 snapshotState432 = snapshotState4CollectAsStateWithLifecycle;
                    composer4 = composer3;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(stateFlow2, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                    Object[] objArr2 = {state.getRowId()};
                    composer4.startReplaceGroup(1849434622);
                    objRememberedValue2 = composer4.rememberedValue();
                    companion = Composer.INSTANCE;
                    OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo52 = optionsPortfolioRiskAnalyzerPositionDuxo3;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    composer4.endReplaceGroup();
                    snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composer4, 3072, 6);
                    composer4.startReplaceGroup(1849434622);
                    objRememberedValue3 = composer4.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    mutableTransitionState = (MutableTransitionState) objRememberedValue3;
                    composer4.endReplaceGroup();
                    Boolean boolValueOf2 = Boolean.valueOf(OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$10(snapshotState));
                    composer4.startReplaceGroup(-1633490746);
                    zChangedInstance = composer4.changedInstance(mutableTransitionState) | composer4.changed(snapshotState);
                    objRememberedValue4 = composer4.rememberedValue();
                    boolean z92 = z;
                    if (!zChangedInstance) {
                        objRememberedValue4 = new OptionsPortfolioRiskAnalyzerOptionPositionRow2(mutableTransitionState, snapshotState, null);
                        composer4.updateRememberedValue(objRememberedValue4);
                        composer4.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer4, 0);
                        if (z92) {
                            Transition transitionUpdateTransition2 = TransitionKt.updateTransition(Boolean.valueOf(z2), "ExpandTransition", composer4, 48, 0);
                            C23532x11cb3d62 c23532x11cb3d622 = new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<C2002Dp>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$OptionsPortfolioRiskAnalyzerOptionPositionRow$$inlined$animateDp$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ SpringSpec<C2002Dp> invoke(Transition.Segment<Boolean> segment, Composer composer7, Integer num) {
                                    return invoke(segment, composer7, num.intValue());
                                }

                                public final SpringSpec<C2002Dp> invoke(Transition.Segment<Boolean> segment, Composer composer7, int i92) {
                                    composer7.startReplaceGroup(-575880366);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-575880366, i92, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1950)");
                                    }
                                    SpringSpec<C2002Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, C2002Dp.m7993boximpl(VisibilityThresholds.getVisibilityThreshold(C2002Dp.INSTANCE)), 3, null);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer7.endReplaceGroup();
                                    return springSpecSpring$default;
                                }
                            };
                            TwoWayConverter<C2002Dp, AnimationVectors2> vectorConverter3 = VectorConvertersKt.getVectorConverter(C2002Dp.INSTANCE);
                            boolean zBooleanValue5 = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
                            composer4.startReplaceGroup(1045805726);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (z3) {
                                float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl((z3 || !z92) ? i4 : 1);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer4.endReplaceGroup();
                                C2002Dp c2002DpM7993boximpl2 = C2002Dp.m7993boximpl(fM7995constructorimpl3);
                                boolean zBooleanValue22 = ((Boolean) transition.getTargetState()).booleanValue();
                                composer4.startReplaceGroup(1045805726);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (z4) {
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composer4.endReplaceGroup();
                                    Transition transition22 = transition;
                                    SnapshotState4 snapshotState4CreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transition22, c2002Dp, C2002Dp.m7993boximpl(fM7995constructorimpl2), c23532x11cb3d622.invoke((C23532x11cb3d62) transition.getSegment(), (Transition.Segment) composer4, (Composer) 0), vectorConverter3, "BorderWidth", composer4, 196608);
                                    C23533x196db000 c23533x196db0002 = new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<Float>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$OptionsPortfolioRiskAnalyzerOptionPositionRow$$inlined$animateFloat$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer7, Integer num) {
                                            return invoke(segment, composer7, num.intValue());
                                        }

                                        public final SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer7, int i92) {
                                            composer7.startReplaceGroup(-522164544);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-522164544, i92, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1920)");
                                            }
                                            SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer7.endReplaceGroup();
                                            return springSpecSpring$default;
                                        }
                                    };
                                    TwoWayConverter<Float, AnimationVectors2> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                    boolean zBooleanValue32 = ((Boolean) transition22.getCurrentState()).booleanValue();
                                    composer4.startReplaceGroup(748219480);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (z5) {
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composer4.endReplaceGroup();
                                        Float fValueOf2 = Float.valueOf(f2);
                                        boolean zBooleanValue42 = ((Boolean) transition22.getTargetState()).booleanValue();
                                        composer4.startReplaceGroup(748219480);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (z6) {
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            composer4.endReplaceGroup();
                                            SnapshotState4 snapshotState4CreateTransitionAnimation22 = TransitionKt.createTransitionAnimation(transition22, f, Float.valueOf(f3), c23533x196db0002.invoke((C23533x196db000) transition22.getSegment(), (Transition.Segment) composer4, (Composer) 0), vectorConverter22, "BorderAlpha", composer4, 196608);
                                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                            int i92 = BentoTheme.$stable;
                                            long jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composer4, i92).m21427getFg30d7_KjU(), OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$17(snapshotState4CreateTransitionAnimation22), 0.0f, 0.0f, 0.0f, 14, null);
                                            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(16));
                                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                                            composer4.startReplaceGroup(947449231);
                                            if (!z92) {
                                            }
                                            composer4.endReplaceGroup();
                                            Modifier modifier52 = modifier3;
                                            Modifier modifierM4876borderxT4_qwU2 = BorderKt.m4876borderxT4_qwU(Clip.clip(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default2, fM21593getSmallD9Ej5fM, 0.0f, 2, null), roundedCornerShapeM5327RoundedCornerShape0680j_42), OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$15(snapshotState42), jM6705copywmQWz5c$default2, roundedCornerShapeM5327RoundedCornerShape0680j_42);
                                            Arrangement arrangement2 = Arrangement.INSTANCE;
                                            Arrangement.Vertical top2 = arrangement2.getTop();
                                            Alignment.Companion companion22 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composer4, 0);
                                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap7 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier7 = ComposedModifier2.materializeModifier(composer4, modifierM4876borderxT4_qwU2);
                                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor7 = companion32.getConstructor();
                                            if (composer4.getApplier() == null) {
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                            }
                                            composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion32.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap7, companion32.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl.getInserting()) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier7, companion32.getSetModifier());
                                                Column6 column62 = Column6.INSTANCE;
                                                Modifier.Companion companion42 = Modifier.INSTANCE;
                                                composer4.startReplaceGroup(1849434622);
                                                objRememberedValue5 = composer4.rememberedValue();
                                                if (objRememberedValue5 == companion.getEmpty()) {
                                                }
                                                InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue5;
                                                composer4.endReplaceGroup();
                                                composer4.startReplaceGroup(-1746271574);
                                                int i102 = i3 & 14;
                                                if (i102 != 4) {
                                                    zChanged2 = composer4.changed(snapshotState) | ((i3 & 112) != 32) | (i102 != 4 || ((i3 & 8) != 0 && composer4.changedInstance(state)));
                                                    objRememberedValue6 = composer4.rememberedValue();
                                                    if (!zChanged2) {
                                                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$$ExternalSyntheticLambda2
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return OptionsPortfolioRiskAnalyzerOptionPositionRow.m2267x3b8e22ac(onExpandOrCollapse, state, snapshotState);
                                                            }
                                                        };
                                                        composer4.updateRememberedValue(objRememberedValue6);
                                                        composer4.endReplaceGroup();
                                                        Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(ClickableKt.m4891clickableO2vRcR0$default(companion42, interactionSource32, null, false, null, null, (Function0) objRememberedValue6, 28, null), 0.0f, bentoTheme2.getSpacing(composer4, i92).m21590getDefaultD9Ej5fM(), 1, null);
                                                        MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion22.getCenterVertically(), composer4, 54);
                                                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                        CompositionLocalMap currentCompositionLocalMap22 = composer4.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer4, modifierM5144paddingVpY3zN4$default2);
                                                        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                                        if (composer4.getApplier() == null) {
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                        }
                                                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy4, companion32.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                                        setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                                        if (!composerM6388constructorimpl2.getInserting()) {
                                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                                            Row6 row62 = Row6.INSTANCE;
                                                            Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                                                            Modifier modifierWeight$default3 = Row5.weight$default(row62, companion42, 1.0f, false, 2, null);
                                                            MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composer4, 48);
                                                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                            CompositionLocalMap currentCompositionLocalMap32 = composer4.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer4, modifierWeight$default3);
                                                            Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                                                            if (composer4.getApplier() == null) {
                                                            }
                                                            composer4.startReusableNode();
                                                            if (composer4.getInserting()) {
                                                            }
                                                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion32.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                                                            setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                                                            if (!composerM6388constructorimpl3.getInserting()) {
                                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                                                                ToggleableState checkState2 = state.getCheckState();
                                                                composer4.startReplaceGroup(-1746271574);
                                                                if (i102 != 4) {
                                                                    z7 = (i102 != 4 || ((i3 & 8) != 0 && composer4.changedInstance(state))) | ((i3 & 7168) != 2048) | ((57344 & i3) != 16384);
                                                                    objRememberedValue7 = composer4.rememberedValue();
                                                                    if (z7) {
                                                                        function3 = onAggregateOptionRowCheckedChanged;
                                                                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowKt$$ExternalSyntheticLambda3
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Object invoke() {
                                                                                return OptionsPortfolioRiskAnalyzerOptionPositionRow.m2268xea3731d9(state, function3, onLegOptionRowCheckedChanged);
                                                                            }
                                                                        };
                                                                        composer4.updateRememberedValue(objRememberedValue7);
                                                                        composer4.endReplaceGroup();
                                                                        CheckboxKt.TriStateCheckbox(checkState2, (Function0) objRememberedValue7, null, false, new CheckboxColors(bentoTheme2.getColors(composer4, i92).m21371getBg0d7_KjU(), Color.INSTANCE.m6725getTransparent0d7_KjU(), bentoTheme2.getColors(composer4, i92).m21425getFg0d7_KjU(), bentoTheme2.getColors(composer4, i92).m21371getBg0d7_KjU(), bentoTheme2.getColors(composer4, i92).m21427getFg30d7_KjU(), bentoTheme2.getColors(composer4, i92).m21427getFg30d7_KjU(), bentoTheme2.getColors(composer4, i92).m21427getFg30d7_KjU(), bentoTheme2.getColors(composer4, i92).m21425getFg0d7_KjU(), bentoTheme2.getColors(composer4, i92).m21427getFg30d7_KjU(), bentoTheme2.getColors(composer4, i92).m21371getBg0d7_KjU(), bentoTheme2.getColors(composer4, i92).m21371getBg0d7_KjU(), bentoTheme2.getColors(composer4, i92).m21427getFg30d7_KjU(), null), null, composer4, 0, 44);
                                                                        Modifier modifierWeight$default22 = Row5.weight$default(row62, companion42, 1.0f, false, 2, null);
                                                                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composer4, 0);
                                                                        currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                                        CompositionLocalMap currentCompositionLocalMap42 = composer4.getCurrentCompositionLocalMap();
                                                                        Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composer4, modifierWeight$default22);
                                                                        Function0<ComposeUiNode> constructor42 = companion32.getConstructor();
                                                                        if (composer4.getApplier() == null) {
                                                                        }
                                                                        composer4.startReusableNode();
                                                                        if (composer4.getInserting()) {
                                                                        }
                                                                        composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer4);
                                                                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                                                                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion32.getSetResolvedCompositionLocals());
                                                                        setCompositeKeyHash4 = companion32.getSetCompositeKeyHash();
                                                                        if (!composerM6388constructorimpl4.getInserting()) {
                                                                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion32.getSetModifier());
                                                                            BentoText2.m20747BentoText38GnDrw(state.getTitle(), null, null, null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme2.getTypography(composer4, i92).getTextM(), composer4, 805306368, 0, 7678);
                                                                            BentoText2.m20747BentoText38GnDrw(state.getSubtitle(), null, Color.m6701boximpl(bentoTheme2.getColors(composer4, i92).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme2.getTypography(composer4, i92).getTextS(), composer4, 805306368, 0, 7674);
                                                                            composer4.endNode();
                                                                            composer4.endNode();
                                                                            MeasurePolicy measurePolicyRowMeasurePolicy32 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getCenterVertically(), composer4, 48);
                                                                            currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                                            CompositionLocalMap currentCompositionLocalMap52 = composer4.getCurrentCompositionLocalMap();
                                                                            Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composer4, companion42);
                                                                            Function0<ComposeUiNode> constructor52 = companion32.getConstructor();
                                                                            if (composer4.getApplier() == null) {
                                                                            }
                                                                            composer4.startReusableNode();
                                                                            if (composer4.getInserting()) {
                                                                            }
                                                                            composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer4);
                                                                            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy32, companion32.getSetMeasurePolicy());
                                                                            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap52, companion32.getSetResolvedCompositionLocals());
                                                                            setCompositeKeyHash5 = companion32.getSetCompositeKeyHash();
                                                                            if (!composerM6388constructorimpl5.getInserting()) {
                                                                                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                                                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                                                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier52, companion32.getSetModifier());
                                                                                MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getEnd(), composer4, 48);
                                                                                currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                                                CompositionLocalMap currentCompositionLocalMap62 = composer4.getCurrentCompositionLocalMap();
                                                                                Modifier modifierMaterializeModifier62 = ComposedModifier2.materializeModifier(composer4, companion42);
                                                                                Function0<ComposeUiNode> constructor62 = companion32.getConstructor();
                                                                                if (composer4.getApplier() == null) {
                                                                                }
                                                                                composer4.startReusableNode();
                                                                                if (composer4.getInserting()) {
                                                                                }
                                                                                composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer4);
                                                                                Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyColumnMeasurePolicy32, companion32.getSetMeasurePolicy());
                                                                                Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap62, companion32.getSetResolvedCompositionLocals());
                                                                                setCompositeKeyHash6 = companion32.getSetCompositeKeyHash();
                                                                                if (!composerM6388constructorimpl6.getInserting()) {
                                                                                    composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                                                    composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                                                                    Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier62, companion32.getSetModifier());
                                                                                    optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7 = OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7(snapshotState4);
                                                                                    if (optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7 != null) {
                                                                                        String str22 = "-";
                                                                                        BentoText2.m20747BentoText38GnDrw(str22, null, Color.m6701boximpl(bentoTheme2.getColors(composer4, i92).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i92).getTextM(), composer4, 0, 0, 8186);
                                                                                        optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$72 = OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7(snapshotState4);
                                                                                        if (optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$72 != null) {
                                                                                            str = "-";
                                                                                            TextStyle textS2 = bentoTheme2.getTypography(composer4, i92).getTextS();
                                                                                            OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$732 = OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$7(snapshotState4);
                                                                                            if (optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$732 != null) {
                                                                                                i6 = WhenMappings.$EnumSwitchMapping$0[UtilsKt.toPnlColorType((optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$732 != null || (pnlUiState = optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewStateOptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$732.getPnlUiState()) == null) ? null : pnlUiState.getPnlPercentage()).ordinal()];
                                                                                                if (i6 != 1) {
                                                                                                }
                                                                                                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS2, composer4, 0, 0, 8186);
                                                                                                composer4.endNode();
                                                                                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(!OptionsPortfolioRiskAnalyzerOptionPositionRow$lambda$10(snapshotState) ? ServerToBentoAssetMapper2.CARET_UP_16 : ServerToBentoAssetMapper2.CARET_DOWN_16), null, bentoTheme2.getColors(composer4, i92).m21427getFg30d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion42, bentoTheme2.getSpacing(composer4, i92).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer4, i92).m21590getDefaultD9Ej5fM(), 0.0f, 10, null), null, false, composer4, BentoIcon4.Size16.$stable | 48, 48);
                                                                                                composer4.endNode();
                                                                                                composer4.endNode();
                                                                                                AnimatedVisibilityKt.AnimatedVisibility(column62, (MutableTransitionState<Boolean>) mutableTransitionState, SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 0, null, 6, null), null, false, null, 14, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 0, null, 6, null), 0.0f, 2, null)), EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 0, Easing3.getFastOutLinearInEasing(), 2, null), companion22.getTop(), false, null, 12, null), (String) null, ComposableLambda3.rememberComposableLambda(549186570, true, new OptionsPortfolioRiskAnalyzerOptionPositionRow3(z92, state, onOpenAggregateOptionsDetailPage, snapshotState4, onExpandOrCollapse, onPlusOrMinusClicked, function3, onLegOptionRowCheckedChanged, snapshotState432, navigator2, context), composer4, 54), composer4, 1576326 | (MutableTransitionState.$stable << 3), 16);
                                                                                                composer5 = composer4;
                                                                                                composer5.startReplaceGroup(1877758252);
                                                                                                if (!z2) {
                                                                                                }
                                                                                                composer5.endReplaceGroup();
                                                                                                composer5.endNode();
                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                }
                                                                                                optionsPortfolioRiskAnalyzerPositionDuxo4 = optionsPortfolioRiskAnalyzerPositionDuxo52;
                                                                                                modifier4 = modifier52;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer5.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}

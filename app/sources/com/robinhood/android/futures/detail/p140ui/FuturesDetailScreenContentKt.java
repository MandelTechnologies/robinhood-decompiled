package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewListParams;
import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewSection5;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartSectionKt;
import com.robinhood.android.futures.detail.p140ui.duxo.FtuxProgressState;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState2;
import com.robinhood.android.futures.sharedfuturesui.ModifiersKt;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.FuturesFtuxContextualBar3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import com.robinhood.store.futures.FuturesLocaleStore2;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesDetailScreenContent.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u0082\u0001\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0019\u001a!\u0010\u001a\u001a\u00020\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u001d¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\"X\u008a\u008e\u0002"}, m3636d2 = {"FuturesDetailScreenContent", "", "state", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "fdpCallbacks", "Lcom/robinhood/android/futures/detail/ui/FuturesDetailScreenCallbacks;", "chartCallbacks", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/futures/detail/ui/FuturesDetailScreenCallbacks;Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FuturesDetailContentList", "onOpenContractsSelector", "Lkotlin/Function0;", "onFlattenConfirmationClick", "onOpenAdvancedChart", "Lkotlin/Function1;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "contractId", "onError", "", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartCallbacks;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FuturesDisclosure", "locale", "Lcom/robinhood/store/futures/FuturesLocale;", "(Lcom/robinhood/store/futures/FuturesLocale;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-futures-detail_externalDebug", "tradeBarHeight", "", "tradeBarExpanded", "", "showFlattenConfirmationDialog"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FuturesDetailScreenContentKt {

    /* compiled from: FuturesDetailScreenContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesLocaleStore2.values().length];
            try {
                iArr[FuturesLocaleStore2.f6324US.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesLocaleStore2.f6323UK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesLocaleStore2.UNSUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailContentList$lambda$35(FuturesDetailViewState futuresDetailViewState, LazyListState lazyListState, FuturesDetailChartCallbacks futuresDetailChartCallbacks, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesDetailContentList(futuresDetailViewState, lazyListState, futuresDetailChartCallbacks, function0, function02, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FuturesDetailScreenContent$lambda$21$lambda$18$lambda$14$lambda$13 */
    public static final int m2021x13b93d9b(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailScreenContent$lambda$22(FuturesDetailViewState futuresDetailViewState, LazyListState lazyListState, FuturesDetailScreenCallbacks futuresDetailScreenCallbacks, FuturesDetailChartCallbacks futuresDetailChartCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesDetailScreenContent(futuresDetailViewState, lazyListState, futuresDetailScreenCallbacks, futuresDetailChartCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDisclosure$lambda$36(FuturesLocaleStore2 futuresLocaleStore2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesDisclosure(futuresLocaleStore2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesDetailScreenContent(final FuturesDetailViewState state, final LazyListState lazyListState, FuturesDetailScreenCallbacks fdpCallbacks, final FuturesDetailChartCallbacks chartCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int iRoundToInt;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue2;
        Composer.Companion companion;
        Object objRememberedValue3;
        boolean z;
        Object objRememberedValue4;
        boolean z2;
        Object objRememberedValue5;
        boolean z3;
        Object objRememberedValue6;
        boolean z4;
        Object objRememberedValue7;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Object objRememberedValue8;
        final FuturesDetailScreenCallbacks futuresDetailScreenCallbacks;
        FtuxProgressState ftuxProgressState;
        int i5;
        int i6;
        boolean z5;
        int i7;
        int i8;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(fdpCallbacks, "fdpCallbacks");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-176716726);
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
            i3 |= composerStartRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(fdpCallbacks) : composerStartRestartGroup.changedInstance(fdpCallbacks) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(chartCallbacks) : composerStartRestartGroup.changedInstance(chartCallbacks) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-176716726, i4, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailScreenContent (FuturesDetailScreenContent.kt:60)");
                }
                iRoundToInt = MathKt.roundToInt(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(60)));
                FtuxProgressState ftuxProgressState2 = state.getFtuxProgressState();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i4 & 112) != 32) | composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changed(iRoundToInt);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new FuturesDetailScreenContentKt$FuturesDetailScreenContent$1$1(state, lazyListState, iRoundToInt, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i10 = FtuxContextualBarData.$stable;
                EffectsKt.LaunchedEffect(ftuxProgressState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i10);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i11 = i4 & 896;
                z = i11 != 256 || ((i4 & 512) != 0 && composerStartRestartGroup.changedInstance(fdpCallbacks));
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$1$1(fdpCallbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0 function0 = (Function0) ((KFunction) objRememberedValue4);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z2 = i11 != 256 || ((i4 & 512) != 0 && composerStartRestartGroup.changedInstance(fdpCallbacks));
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$2$1(fdpCallbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0 function02 = (Function0) ((KFunction) objRememberedValue5);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z3 = i11 != 256 || ((i4 & 512) != 0 && composerStartRestartGroup.changedInstance(fdpCallbacks));
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!z3 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$3$1(fdpCallbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function1 function1 = (Function1) ((KFunction) objRememberedValue6);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z4 = i11 != 256 || ((i4 & 512) != 0 && composerStartRestartGroup.changedInstance(fdpCallbacks));
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!z4 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$4$1(fdpCallbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifier5 = modifier4;
                FuturesDetailContentList(state, lazyListState, chartCallbacks, function0, function02, function1, (Function1) ((KFunction) objRememberedValue7), ModifiersKt.blockAllChildTouchEvents$default(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(snapshotIntState2.getIntValue()), 7, null), state.isFtuxInProgress(), null, 2, null), composerStartRestartGroup, (i4 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i4 >> 3) & 896), 0);
                AnimatedVisibilityKt.AnimatedVisibility(FuturesDetailScreenContent$lambda$21$lambda$6(snapshotState), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(2077115432, true, new FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$6(fdpCallbacks, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
                Modifier modifierAlign = boxScopeInstance.align(companion4, companion2.getBottomCenter());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                boolean zIsTradeBarVisible = state.isTradeBarVisible();
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(FuturesDetailScreenContentKt.m2021x13b93d9b(((Integer) obj).intValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                EnterTransition enterTransitionPlus = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue8).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(0, 0, null, 7, null), 0.0f, 2, null));
                futuresDetailScreenCallbacks = fdpCallbacks;
                AnimatedVisibilityKt.AnimatedVisibility(column6, zIsTradeBarVisible, (Modifier) null, enterTransitionPlus, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(1282741022, true, new FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$7$2(zIsTradeBarVisible, state, futuresDetailScreenCallbacks, snapshotState, snapshotIntState2), composerStartRestartGroup, 54), composerStartRestartGroup, 1575942, 26);
                ftuxProgressState = state.getFtuxProgressState();
                composerStartRestartGroup.startReplaceGroup(1251266394);
                if (ftuxProgressState != null) {
                    i7 = i4;
                    z5 = false;
                    composerStartRestartGroup = composerStartRestartGroup;
                    i6 = i11;
                    i5 = 5004770;
                    i8 = 256;
                } else {
                    FtuxContextualBarData contextBarData = ftuxProgressState.getContextBarData();
                    i5 = 5004770;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    i6 = i11;
                    boolean z6 = i6 == 256 || ((i4 & 512) != 0 && composerStartRestartGroup.changedInstance(futuresDetailScreenCallbacks));
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (z6 || objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = new C17067xa4590185(futuresDetailScreenCallbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0 function03 = (Function0) ((KFunction) objRememberedValue9);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z7 = i6 == 256 || ((i4 & 512) != 0 && composerStartRestartGroup.changedInstance(futuresDetailScreenCallbacks));
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (z7 || objRememberedValue10 == companion.getEmpty()) {
                        objRememberedValue10 = new C17068xa4590546(futuresDetailScreenCallbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    z5 = false;
                    i7 = i4;
                    composerStartRestartGroup = composerStartRestartGroup;
                    i8 = 256;
                    FuturesFtuxContextualBar3.FuturesFtuxContextualBar(contextBarData, function03, null, (Function0) ((KFunction) objRememberedValue10), composerStartRestartGroup, i10, 4);
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(404656593);
                if (state.getContractSelectorOpen()) {
                    ImmutableList<FuturesDetailViewState.RelatedContract> relatedContracts = state.getRelatedContracts();
                    boolean z8 = z5;
                    boolean showSeparateContractAndProductItemsInContractSelector = state.getShowSeparateContractAndProductItemsInContractSelector();
                    boolean zIsViewingProductOnly = state.isViewingProductOnly();
                    StringResource productName = state.getProductName();
                    StringResource productSymbol = state.getProductSymbol();
                    composerStartRestartGroup.startReplaceGroup(i5);
                    boolean z9 = (i6 == i8 || ((i7 & 512) != 0 && composerStartRestartGroup.changedInstance(futuresDetailScreenCallbacks))) ? true : z8;
                    Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (z9 || objRememberedValue11 == companion.getEmpty()) {
                        objRememberedValue11 = new FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$8$1(futuresDetailScreenCallbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function2 function2 = (Function2) ((KFunction) objRememberedValue11);
                    composerStartRestartGroup.startReplaceGroup(i5);
                    if (i6 == i8 || ((i7 & 512) != 0 && composerStartRestartGroup.changedInstance(futuresDetailScreenCallbacks))) {
                        z8 = true;
                    }
                    Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (z8 || objRememberedValue12 == companion.getEmpty()) {
                        objRememberedValue12 = new FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$9$1(futuresDetailScreenCallbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0 function04 = (Function0) ((KFunction) objRememberedValue12);
                    int i12 = StringResource.$stable;
                    ContractSelectorBottomSheet3.ContractSelectorBottomSheet(relatedContracts, showSeparateContractAndProductItemsInContractSelector, zIsViewingProductOnly, productName, productSymbol, function2, null, function04, composerStartRestartGroup, (i12 << 9) | (i12 << 12), 64);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                futuresDetailScreenCallbacks = fdpCallbacks;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesDetailScreenContentKt.FuturesDetailScreenContent$lambda$22(state, lazyListState, futuresDetailScreenCallbacks, chartCallbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i9 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            iRoundToInt = MathKt.roundToInt(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(60)));
            FtuxProgressState ftuxProgressState22 = state.getFtuxProgressState();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = ((i4 & 112) != 32) | composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changed(iRoundToInt);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new FuturesDetailScreenContentKt$FuturesDetailScreenContent$1$1(state, lazyListState, iRoundToInt, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                int i102 = FtuxContextualBarData.$stable;
                EffectsKt.LaunchedEffect(ftuxProgressState22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i102);
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i112 = i4 & 896;
                    if (i112 != 256) {
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue4 = new FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$1$1(fdpCallbacks);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            composerStartRestartGroup.endReplaceGroup();
                            Function0 function05 = (Function0) ((KFunction) objRememberedValue4);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            if (i112 != 256) {
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (!z2) {
                                    objRememberedValue5 = new FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$2$1(fdpCallbacks);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    composerStartRestartGroup.endReplaceGroup();
                                    Function0 function022 = (Function0) ((KFunction) objRememberedValue5);
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    if (i112 != 256) {
                                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                        if (!z3) {
                                            objRememberedValue6 = new FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$3$1(fdpCallbacks);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                            composerStartRestartGroup.endReplaceGroup();
                                            Function1 function12 = (Function1) ((KFunction) objRememberedValue6);
                                            composerStartRestartGroup.startReplaceGroup(5004770);
                                            if (i112 != 256) {
                                                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                                if (!z4) {
                                                    objRememberedValue7 = new FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$4$1(fdpCallbacks);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    Modifier.Companion companion42 = Modifier.INSTANCE;
                                                    Modifier modifier52 = modifier4;
                                                    FuturesDetailContentList(state, lazyListState, chartCallbacks, function05, function022, function12, (Function1) ((KFunction) objRememberedValue7), ModifiersKt.blockAllChildTouchEvents$default(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(snapshotIntState22.getIntValue()), 7, null), state.isFtuxInProgress(), null, 2, null), composerStartRestartGroup, (i4 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i4 >> 3) & 896), 0);
                                                    AnimatedVisibilityKt.AnimatedVisibility(FuturesDetailScreenContent$lambda$21$lambda$6(snapshotState2), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(2077115432, true, new FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$6(fdpCallbacks, snapshotState2), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
                                                    Modifier modifierAlign2 = boxScopeInstance2.align(companion42, companion22.getBottomCenter());
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                                                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign2);
                                                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                                    if (composerStartRestartGroup.getApplier() == null) {
                                                    }
                                                    composerStartRestartGroup.startReusableNode();
                                                    if (composerStartRestartGroup.getInserting()) {
                                                    }
                                                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                                    if (!composerM6388constructorimpl2.getInserting()) {
                                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                                        Column6 column62 = Column6.INSTANCE;
                                                        boolean zIsTradeBarVisible2 = state.isTradeBarVisible();
                                                        TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                                        if (objRememberedValue8 == companion.getEmpty()) {
                                                        }
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        EnterTransition enterTransitionPlus2 = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default2, (Function1) objRememberedValue8).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(0, 0, null, 7, null), 0.0f, 2, null));
                                                        futuresDetailScreenCallbacks = fdpCallbacks;
                                                        AnimatedVisibilityKt.AnimatedVisibility(column62, zIsTradeBarVisible2, (Modifier) null, enterTransitionPlus2, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(1282741022, true, new FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$7$2(zIsTradeBarVisible2, state, futuresDetailScreenCallbacks, snapshotState2, snapshotIntState22), composerStartRestartGroup, 54), composerStartRestartGroup, 1575942, 26);
                                                        ftuxProgressState = state.getFtuxProgressState();
                                                        composerStartRestartGroup.startReplaceGroup(1251266394);
                                                        if (ftuxProgressState != null) {
                                                        }
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        composerStartRestartGroup.endNode();
                                                        composerStartRestartGroup.startReplaceGroup(404656593);
                                                        if (state.getContractSelectorOpen()) {
                                                        }
                                                        composerStartRestartGroup.endReplaceGroup();
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
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean FuturesDetailContentList$lambda$24(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FuturesDetailScreenContent$lambda$21$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FuturesDetailScreenContent$lambda$21$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010f  */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FuturesDetailContentList(final FuturesDetailViewState futuresDetailViewState, final LazyListState lazyListState, final FuturesDetailChartCallbacks futuresDetailChartCallbacks, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super UUID, Unit> function1, final Function1<? super Throwable, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function03;
        Function1<? super Throwable, Unit> function13;
        int i4;
        Modifier modifier2;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        final FuturesDetailViewState2.PendingHistory pendingHistory;
        SnapshotState snapshotState2;
        ?? r6;
        Function1<LazyListScope, Unit> function1HistoryPreviewSection;
        Composer composer2;
        final FuturesDetailViewState2.SettledHistory settledHistory;
        Function1<LazyListScope, Unit> function14;
        final Function1<LazyListScope, Unit> function15;
        boolean zChangedInstance;
        Object obj;
        int i5;
        Modifier modifier4;
        Composer composer3;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1912018999);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(futuresDetailViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(lazyListState) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(futuresDetailChartCallbacks) : composerStartRestartGroup.changedInstance(futuresDetailChartCallbacks) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function03 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                if ((i2 & 32) == 0) {
                    if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                        function13 = function12;
                    } else {
                        function13 = function12;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function13) ? 1048576 : 524288;
                        }
                    }
                    i4 = i2 & 128;
                    if (i4 == 0) {
                        i3 |= 12582912;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                        }
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1912018999, i3, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailContentList (FuturesDetailScreenContent.kt:203)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-795729590);
                        if (FuturesDetailContentList$lambda$24(snapshotState)) {
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return FuturesDetailScreenContentKt.FuturesDetailContentList$lambda$27$lambda$26(snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            Function0 function04 = (Function0) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean z = (57344 & i3) == 16384;
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return FuturesDetailScreenContentKt.FuturesDetailContentList$lambda$29$lambda$28(function02, snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            FlattenConfirmationDialog.FlattenConfirmationDialog(function04, (Function0) objRememberedValue3, composerStartRestartGroup, 6);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ImmutableList<FuturesDetailViewState2> items = futuresDetailViewState.getItems();
                        ArrayList arrayList = new ArrayList();
                        for (FuturesDetailViewState2 futuresDetailViewState2 : items) {
                            if (futuresDetailViewState2 instanceof FuturesDetailViewState2.PendingHistory) {
                                arrayList.add(futuresDetailViewState2);
                            }
                        }
                        pendingHistory = (FuturesDetailViewState2.PendingHistory) CollectionsKt.firstOrNull((List) arrayList);
                        composerStartRestartGroup.startReplaceGroup(-795702864);
                        if (pendingHistory != null) {
                            snapshotState2 = snapshotState;
                            composer2 = composerStartRestartGroup;
                            r6 = 1;
                            function1HistoryPreviewSection = null;
                        } else {
                            snapshotState2 = snapshotState;
                            r6 = 1;
                            function1HistoryPreviewSection = HistoryPreviewSection5.historyPreviewSection(pendingHistory.getData().getListParams(), false, ComposableSingletons$FuturesDetailScreenContentKt.INSTANCE.m14558getLambda$1607950981$feature_futures_detail_externalDebug(), ComposableLambda3.rememberComposableLambda(-56296452, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailContentList$pending$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer4, Integer num) {
                                    invoke(lazyItemScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope historyPreviewSection, Composer composer4, int i6) {
                                    Intrinsics.checkNotNullParameter(historyPreviewSection, "$this$historyPreviewSection");
                                    if ((i6 & 17) == 16 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-56296452, i6, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailContentList.<anonymous>.<anonymous> (FuturesDetailScreenContent.kt:233)");
                                    }
                                    HistoryRowsKt.DefaultHistoryFooter(null, StringResources_androidKt.stringResource(C17042R.string.futures_detail_show_more_cta, composer4, 0), pendingHistory.getData().getFooterKey(), composer4, 0, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, "fdp_pending_orders_preview_", null, composerStartRestartGroup, HistoryPreviewListParams.$stable | 200112, 80);
                            composer2 = composerStartRestartGroup;
                        }
                        composer2.endReplaceGroup();
                        ImmutableList<FuturesDetailViewState2> items2 = futuresDetailViewState.getItems();
                        ArrayList arrayList2 = new ArrayList();
                        for (FuturesDetailViewState2 futuresDetailViewState22 : items2) {
                            if (futuresDetailViewState22 instanceof FuturesDetailViewState2.SettledHistory) {
                                arrayList2.add(futuresDetailViewState22);
                            }
                        }
                        settledHistory = (FuturesDetailViewState2.SettledHistory) CollectionsKt.firstOrNull((List) arrayList2);
                        composer2.startReplaceGroup(-795679402);
                        if (settledHistory != null) {
                            function14 = function1HistoryPreviewSection;
                            function15 = null;
                        } else {
                            Composer composer4 = composer2;
                            function14 = function1HistoryPreviewSection;
                            Function1<LazyListScope, Unit> function1HistoryPreviewSection2 = HistoryPreviewSection5.historyPreviewSection(settledHistory.getData().getListParams(), false, ComposableSingletons$FuturesDetailScreenContentKt.INSTANCE.m14557getLambda$132770121$feature_futures_detail_externalDebug(), ComposableLambda3.rememberComposableLambda(1418884408, r6, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailContentList$settled$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer5, Integer num) {
                                    invoke(lazyItemScope, composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope historyPreviewSection, Composer composer5, int i6) {
                                    Intrinsics.checkNotNullParameter(historyPreviewSection, "$this$historyPreviewSection");
                                    if ((i6 & 17) == 16 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1418884408, i6, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailContentList.<anonymous>.<anonymous> (FuturesDetailScreenContent.kt:250)");
                                    }
                                    HistoryRowsKt.DefaultHistoryFooter(null, StringResources_androidKt.stringResource(C17042R.string.futures_detail_show_more_cta, composer5, 0), settledHistory.getData().getFooterKey(), composer5, 0, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), null, "fdp_history_preview_", null, composer4, HistoryPreviewListParams.$stable | 200112, 80);
                            composer2 = composer4;
                            function15 = function1HistoryPreviewSection2;
                        }
                        composer2.endReplaceGroup();
                        boolean z2 = !futuresDetailViewState.isFtuxInProgress();
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, r6, null);
                        composer2.startReplaceGroup(-1224400529);
                        zChangedInstance = ((i3 & 896) != 256 || ((i3 & 512) != 0 && composer2.changedInstance(futuresDetailChartCallbacks))) | composer2.changedInstance(futuresDetailViewState) | ((i3 & 7168) != 2048) | ((458752 & i3) != 131072) | ((3670016 & i3) == 1048576) | composer2.changed(function15) | composer2.changed(function14);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (!zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            final Function1<LazyListScope, Unit> function16 = function14;
                            i5 = i3;
                            modifier4 = modifier3;
                            final Function0<Unit> function05 = function03;
                            final Function1<? super Throwable, Unit> function17 = function13;
                            final SnapshotState snapshotState3 = snapshotState2;
                            obj = new Function1() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return FuturesDetailScreenContentKt.FuturesDetailContentList$lambda$34$lambda$33(futuresDetailViewState, function15, function16, futuresDetailChartCallbacks, function05, function1, function17, snapshotState3, (LazyListScope) obj2);
                                }
                            };
                            composer2.updateRememberedValue(obj);
                        } else {
                            modifier4 = modifier3;
                            obj = objRememberedValue4;
                            i5 = i3;
                        }
                        composer2.endReplaceGroup();
                        Composer composer5 = composer2;
                        LazyDslKt.LazyColumn(modifierFillMaxSize$default, lazyListState, null, false, null, null, null, z2, null, (Function1) obj, composer5, i5 & 112, 380);
                        composer3 = composer5;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer3 = composerStartRestartGroup;
                        modifier5 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return FuturesDetailScreenContentKt.FuturesDetailContentList$lambda$35(futuresDetailViewState, lazyListState, futuresDetailChartCallbacks, function0, function02, function1, function12, modifier5, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                if ((i2 & 64) == 0) {
                }
                i4 = i2 & 128;
                if (i4 == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-795729590);
                    if (FuturesDetailContentList$lambda$24(snapshotState)) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ImmutableList<FuturesDetailViewState2> items3 = futuresDetailViewState.getItems();
                    ArrayList arrayList3 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    pendingHistory = (FuturesDetailViewState2.PendingHistory) CollectionsKt.firstOrNull((List) arrayList3);
                    composerStartRestartGroup.startReplaceGroup(-795702864);
                    if (pendingHistory != null) {
                    }
                    composer2.endReplaceGroup();
                    ImmutableList<FuturesDetailViewState2> items22 = futuresDetailViewState.getItems();
                    ArrayList arrayList22 = new ArrayList();
                    while (r13.hasNext()) {
                    }
                    settledHistory = (FuturesDetailViewState2.SettledHistory) CollectionsKt.firstOrNull((List) arrayList22);
                    composer2.startReplaceGroup(-795679402);
                    if (settledHistory != null) {
                    }
                    composer2.endReplaceGroup();
                    boolean z22 = !futuresDetailViewState.isFtuxInProgress();
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, r6, null);
                    composer2.startReplaceGroup(-1224400529);
                    if ((i3 & 896) != 256) {
                        zChangedInstance = ((i3 & 896) != 256 || ((i3 & 512) != 0 && composer2.changedInstance(futuresDetailChartCallbacks))) | composer2.changedInstance(futuresDetailViewState) | ((i3 & 7168) != 2048) | ((458752 & i3) != 131072) | ((3670016 & i3) == 1048576) | composer2.changed(function15) | composer2.changed(function14);
                        Object objRememberedValue42 = composer2.rememberedValue();
                        if (zChangedInstance) {
                            final Function1 function162 = function14;
                            i5 = i3;
                            modifier4 = modifier3;
                            final Function0 function052 = function03;
                            final Function1 function172 = function13;
                            final SnapshotState snapshotState32 = snapshotState2;
                            obj = new Function1() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return FuturesDetailScreenContentKt.FuturesDetailContentList$lambda$34$lambda$33(futuresDetailViewState, function15, function162, futuresDetailChartCallbacks, function052, function1, function172, snapshotState32, (LazyListScope) obj2);
                                }
                            };
                            composer2.updateRememberedValue(obj);
                            composer2.endReplaceGroup();
                            Composer composer52 = composer2;
                            LazyDslKt.LazyColumn(modifierFillMaxSize$default2, lazyListState, null, false, null, null, null, z22, null, (Function1) obj, composer52, i5 & 112, 380);
                            composer3 = composer52;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier5 = modifier4;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function03 = function0;
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i4 = i2 & 128;
            if (i4 == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        function03 = function0;
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FuturesDetailContentList$lambda$25(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailContentList$lambda$27$lambda$26(SnapshotState snapshotState) {
        FuturesDetailContentList$lambda$25(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailContentList$lambda$29$lambda$28(Function0 function0, SnapshotState snapshotState) {
        function0.invoke();
        FuturesDetailContentList$lambda$25(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailContentList$lambda$34$lambda$33(final FuturesDetailViewState futuresDetailViewState, Function1 function1, Function1 function12, final FuturesDetailChartCallbacks futuresDetailChartCallbacks, final Function0 function0, final Function1 function13, final Function1 function14, SnapshotState snapshotState, LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        for (final FuturesDetailViewState2 futuresDetailViewState2 : futuresDetailViewState.getItems()) {
            if (futuresDetailViewState2 instanceof FuturesDetailViewState2.About) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-322907535, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailContentList$3$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-322907535, i, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailContentList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FuturesDetailScreenContent.kt:269)");
                        }
                        AboutSection.AboutSection(((FuturesDetailViewState2.About) futuresDetailViewState2).getData().getTitle(), ((FuturesDetailViewState2.About) futuresDetailViewState2).getData().getDescription(), ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 7, null), futuresDetailViewState.isFtuxInProgress(), null, null, 6, null), composer, StringResource.$stable, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            } else if (Intrinsics.areEqual(futuresDetailViewState2, FuturesDetailViewState2.Chart.INSTANCE)) {
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(1414050152, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailContentList$3$1$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1414050152, i, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailContentList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FuturesDetailScreenContent.kt:281)");
                        }
                        StringResource contractSelectorText = futuresDetailViewState.getContractSelectorText();
                        StringResource productName = futuresDetailViewState.getProductName();
                        boolean zIsFtuxChartEducationInProgress = futuresDetailViewState.isFtuxChartEducationInProgress();
                        Modifier modifierM14735scrimGUYwDQI$default = ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 7, null), futuresDetailViewState.getShowScrimOnChart(), null, null, 6, null);
                        FuturesDetailChartCallbacks futuresDetailChartCallbacks2 = futuresDetailChartCallbacks;
                        Function0<Unit> function02 = function0;
                        Function1<UUID, Unit> function15 = function13;
                        Function1<Throwable, Unit> function16 = function14;
                        int i2 = StringResource.$stable;
                        FuturesDetailChartSectionKt.FuturesDetailChartSection(contractSelectorText, productName, zIsFtuxChartEducationInProgress, futuresDetailChartCallbacks2, function02, function15, function16, modifierM14735scrimGUYwDQI$default, composer, i2 | (i2 << 3), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            } else if (futuresDetailViewState2 instanceof FuturesDetailViewState2.ContractSpec) {
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(503170409, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailContentList$3$1$1$3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(503170409, i, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailContentList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FuturesDetailScreenContent.kt:298)");
                        }
                        ContractSpecsSection.ContractSpecsSection(((FuturesDetailViewState2.ContractSpec) futuresDetailViewState2).getData(), futuresDetailViewState.isFtuxContractSpecsEducationInProgress(), futuresDetailViewState.getShowScrimOnLeverage(), ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 7, null), futuresDetailViewState.getShowScrimOnContractSpec(), null, null, 6, null), composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            } else if (futuresDetailViewState2 instanceof FuturesDetailViewState2.Disclosure) {
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-407709334, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailContentList$3$1$1$4
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-407709334, i, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailContentList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FuturesDetailScreenContent.kt:311)");
                        }
                        FuturesDetailScreenContentKt.FuturesDisclosure(((FuturesDetailViewState2.Disclosure) futuresDetailViewState2).getLocale(), ModifiersKt.m14735scrimGUYwDQI$default(Modifier.INSTANCE, futuresDetailViewState.isFtuxInProgress(), null, null, 6, null), composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            } else if (futuresDetailViewState2 instanceof FuturesDetailViewState2.SettledHistory) {
                if (function1 != null) {
                    function1.invoke(lazyListScope);
                }
            } else if (Intrinsics.areEqual(futuresDetailViewState2, FuturesDetailViewState2.IacBanner.INSTANCE)) {
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(2065498476, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailContentList$3$1$1$5
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2065498476, i, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailContentList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FuturesDetailScreenContent.kt:324)");
                        }
                        InfoBannerComponent.InfoBannerComponent(futuresDetailViewState.getRhsAccountNumber(), IacInfoBannerLocation.INFO_BANNER_FUTURES_DETAIL_PAGE_MOBILE_TOP_LEVEL, ModifiersKt.m14735scrimGUYwDQI$default(Modifier.INSTANCE, futuresDetailViewState.isFtuxInProgress(), null, null, 6, null), null, null, null, null, null, null, futuresDetailViewState.getSelectedContractId(), null, null, null, composer, 48, 0, 7672);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            } else if (!(futuresDetailViewState2 instanceof FuturesDetailViewState2.PendingHistory)) {
                if (futuresDetailViewState2 instanceof FuturesDetailViewState2.Position) {
                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(243738990, true, new FuturesDetailScreenContentKt$FuturesDetailContentList$3$1$1$6(futuresDetailViewState2, futuresDetailViewState, snapshotState)), 3, null);
                } else if (Intrinsics.areEqual(futuresDetailViewState2, FuturesDetailViewState2.Spacer.INSTANCE)) {
                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-667140753, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailContentList$3$1$1$7
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-667140753, i, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailContentList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FuturesDetailScreenContent.kt:353)");
                            }
                            Spacer2.Spacer(ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 7, null), futuresDetailViewState.isFtuxInProgress(), null, null, 6, null), composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                } else {
                    if (!(futuresDetailViewState2 instanceof FuturesDetailViewState2.Stats)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1578020496, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailContentList$3$1$1$8
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1578020496, i, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailContentList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FuturesDetailScreenContent.kt:363)");
                            }
                            StatsSectionKt.StatsSection(((FuturesDetailViewState2.Stats) futuresDetailViewState2).getData(), ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 7, null), futuresDetailViewState.isFtuxInProgress(), null, null, 6, null), composer, StringResource.$stable, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                }
                LazyColumn = lazyListScope;
            } else if (function12 != null) {
                function12.invoke(lazyListScope);
            }
            LazyColumn = lazyListScope;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesDisclosure(final FuturesLocaleStore2 futuresLocaleStore2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1847079967);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(futuresLocaleStore2 == null ? -1 : futuresLocaleStore2.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1847079967, i3, -1, "com.robinhood.android.futures.detail.ui.FuturesDisclosure (FuturesDetailScreenContent.kt:380)");
                }
                i4 = futuresLocaleStore2 != null ? -1 : WhenMappings.$EnumSwitchMapping$0[futuresLocaleStore2.ordinal()];
                if (i4 == -1) {
                    i5 = C17042R.string.futures_detail_loading;
                    int i7 = i5;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    AnnotatedString annotatedStringM22062annotatedStringResourceV2eopBjH0 = AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i7, bentoTheme.getColors(composerStartRestartGroup, i8).m21426getFg20d7_KjU(), 0L, (LinkInteractionListener) null, composerStartRestartGroup, 0, 12);
                    TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i8).getTextS();
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM());
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                    BentoText2.m20748BentoTextQnj7Zds(annotatedStringM22062annotatedStringResourceV2eopBjH0, modifierM5142padding3ABfNKs, null, null, null, null, null, 0, false, 0, 0, null, null, textS, composer2, 0, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i4 == 1) {
                        i5 = C17042R.string.futures_detail_disclosure_us;
                    } else if (i4 == 2) {
                        i5 = C17042R.string.futures_detail_disclosure_uk;
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i5 = C17042R.string.futures_detail_loading;
                    }
                    int i72 = i5;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i82 = BentoTheme.$stable;
                    AnnotatedString annotatedStringM22062annotatedStringResourceV2eopBjH02 = AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i72, bentoTheme2.getColors(composerStartRestartGroup, i82).m21426getFg20d7_KjU(), 0L, (LinkInteractionListener) null, composerStartRestartGroup, 0, 12);
                    TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i82).getTextS();
                    Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21592getMediumD9Ej5fM());
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                    BentoText2.m20748BentoTextQnj7Zds(annotatedStringM22062annotatedStringResourceV2eopBjH02, modifierM5142padding3ABfNKs2, null, null, null, null, null, 0, false, 0, 0, null, null, textS2, composer2, 0, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesDetailScreenContentKt.FuturesDisclosure$lambda$36(futuresLocaleStore2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (futuresLocaleStore2 != null) {
            }
            if (i4 == -1) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}

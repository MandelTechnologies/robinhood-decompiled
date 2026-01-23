package com.robinhood.shared.tradeladder.p398ui.ladder;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.SnackbarVisuals;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.shared.tradeladder.p398ui.LadderInteraction;
import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LadderCustomGestureDetector3;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderGestureConfiguration;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderTrigger;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderType;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui.LadderSnackbarVisuals;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyleKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GenericLadderScreen.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¤\u0001\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\u0001\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0002\b\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/BaseLadderDuxo;", "duxo", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderGestureConfiguration;", "ladderGestureConfiguration", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/foundation/lazy/LazyListState;", "listState", "Lkotlin/Function0;", "", "topBar", "bottomBar", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/ExtensionFunctionType;", "floatingLadderItems", "bottomSheet", "loadingContent", "GenericLadderScreen", "(Lcom/robinhood/shared/tradeladder/ui/ladder/BaseLadderDuxo;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderGestureConfiguration;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/shared/tradeladder/ui/ladder/ILadderViewState;", "state", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class GenericLadderScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericLadderScreen$lambda$3(BaseLadderDuxo baseLadderDuxo, LadderGestureConfiguration ladderGestureConfiguration, Modifier modifier, SnackbarHostState snackbarHostState, LazyListState lazyListState, Function2 function2, Function2 function22, Function3 function3, Function2 function23, Function2 function24, int i, int i2, Composer composer, int i3) {
        GenericLadderScreen(baseLadderDuxo, ladderGestureConfiguration, modifier, snackbarHostState, lazyListState, function2, function22, function3, function23, function24, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenericLadderScreen(final BaseLadderDuxo<?, ?, ?> duxo, final LadderGestureConfiguration ladderGestureConfiguration, Modifier modifier, SnackbarHostState snackbarHostState, LazyListState lazyListState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        SnackbarHostState snackbarHostState2;
        LazyListState lazyListStateRememberLazyListState;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> lambda$859451270$lib_trade_ladder_externalDebug;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function2M26062getLambda$1191420810$lib_trade_ladder_externalDebug;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final SnackbarHostState snackbarHostState3;
        final LazyListState lazyListState2;
        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function32;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function2M26063getLambda$1265750137$lib_trade_ladder_externalDebug;
        Composer composer3;
        Composer composer4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final SnackbarHostState snackbarHostState4;
        final LazyListState lazyListState3;
        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(ladderGestureConfiguration, "ladderGestureConfiguration");
        Composer composerStartRestartGroup = composer.startRestartGroup(2080031762);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(duxo) : composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(ladderGestureConfiguration) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    snackbarHostState2 = snackbarHostState;
                    i3 |= composerStartRestartGroup.changed(snackbarHostState2) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        lazyListStateRememberLazyListState = lazyListState;
                        int i15 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 16384 : 8192;
                        i3 |= i15;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    i3 |= i15;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        lambda$859451270$lib_trade_ladder_externalDebug = function2;
                        i3 |= composerStartRestartGroup.changedInstance(lambda$859451270$lib_trade_ladder_externalDebug) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else {
                        if ((1572864 & i) == 0) {
                            function2M26062getLambda$1191420810$lib_trade_ladder_externalDebug = function22;
                            i3 |= composerStartRestartGroup.changedInstance(function2M26062getLambda$1191420810$lib_trade_ladder_externalDebug) ? 1048576 : 524288;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                i8 = i7;
                                i3 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                            }
                            i9 = i2 & 256;
                            if (i9 == 0) {
                                i3 |= 100663296;
                            } else {
                                if ((i & 100663296) == 0) {
                                    i10 = i9;
                                    i3 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : 33554432;
                                }
                                i11 = i2 & 512;
                                if (i11 == 0) {
                                    if ((i & 805306368) == 0) {
                                        i12 = i11;
                                        i3 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                                    }
                                    int i16 = i3;
                                    if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            if (i14 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (i4 != 0) {
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new SnackbarHostState();
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                snackbarHostState2 = (SnackbarHostState) objRememberedValue;
                                            }
                                            if ((i2 & 16) == 0) {
                                                i13 = i16 & (-57345);
                                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                            } else {
                                                i13 = i16;
                                            }
                                            if (i5 != 0) {
                                                lambda$859451270$lib_trade_ladder_externalDebug = ComposableSingletons$GenericLadderScreenKt.INSTANCE.getLambda$859451270$lib_trade_ladder_externalDebug();
                                            }
                                            if (i6 != 0) {
                                                function2M26062getLambda$1191420810$lib_trade_ladder_externalDebug = ComposableSingletons$GenericLadderScreenKt.INSTANCE.m26062getLambda$1191420810$lib_trade_ladder_externalDebug();
                                            }
                                            Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3M26065getLambda$227985265$lib_trade_ladder_externalDebug = i8 == 0 ? ComposableSingletons$GenericLadderScreenKt.INSTANCE.m26065getLambda$227985265$lib_trade_ladder_externalDebug() : function3;
                                            Function2<? super Composer, ? super Integer, Unit> function2M26064getLambda$1448626262$lib_trade_ladder_externalDebug = i10 == 0 ? ComposableSingletons$GenericLadderScreenKt.INSTANCE.m26064getLambda$1448626262$lib_trade_ladder_externalDebug() : function23;
                                            if (i12 == 0) {
                                                LazyListState lazyListState4 = lazyListStateRememberLazyListState;
                                                function32 = function3M26065getLambda$227985265$lib_trade_ladder_externalDebug;
                                                composer2 = composerStartRestartGroup;
                                                function26 = lambda$859451270$lib_trade_ladder_externalDebug;
                                                modifier3 = modifier2;
                                                function2M26063getLambda$1265750137$lib_trade_ladder_externalDebug = ComposableSingletons$GenericLadderScreenKt.INSTANCE.m26063getLambda$1265750137$lib_trade_ladder_externalDebug();
                                                function25 = function2M26064getLambda$1448626262$lib_trade_ladder_externalDebug;
                                                snackbarHostState3 = snackbarHostState2;
                                                lazyListState2 = lazyListState4;
                                                composer2.endDefaults();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    composer3 = composer2;
                                                } else {
                                                    composer3 = composer2;
                                                    ComposerKt.traceEventStart(2080031762, i13, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreen (GenericLadderScreen.kt:39)");
                                                }
                                                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                                                composer4 = composer3;
                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                final Function2<? super Composer, ? super Integer, Unit> function211 = function26;
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifier3);
                                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (!composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                                final Function2<? super Composer, ? super Integer, Unit> function212 = function2M26063getLambda$1265750137$lib_trade_ladder_externalDebug;
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                final Function2<? super Composer, ? super Integer, Unit> function213 = function2M26062getLambda$1191420810$lib_trade_ladder_externalDebug;
                                                LadderStyleKt.WithLadderStyle(ComposableLambda3.rememberComposableLambda(-789115730, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i17) {
                                                        if ((i17 & 3) == 2 && composer5.getSkipping()) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-789115730, i17, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreen.<anonymous>.<anonymous> (GenericLadderScreen.kt:44)");
                                                        }
                                                        LadderState ladderState = GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle).getLadderState();
                                                        if (ladderState instanceof LadderState.Loading) {
                                                            composer5.startReplaceGroup(2104376484);
                                                            Function2<Composer, Integer, Unit> function214 = function211;
                                                            Function2<Composer, Integer, Unit> function215 = function213;
                                                            final Function2<Composer, Integer, Unit> function216 = function212;
                                                            ScaffoldKt.m5939ScaffoldTvnljyQ(null, function214, function215, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1859102901, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1.1
                                                                @Override // kotlin.jvm.functions.Function3
                                                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer6, Integer num) {
                                                                    invoke(paddingValues, composer6, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(PaddingValues padding, Composer composer6, int i18) {
                                                                    Intrinsics.checkNotNullParameter(padding, "padding");
                                                                    if ((i18 & 6) == 0) {
                                                                        i18 |= composer6.changed(padding) ? 4 : 2;
                                                                    }
                                                                    if ((i18 & 19) == 18 && composer6.getSkipping()) {
                                                                        composer6.skipToGroupEnd();
                                                                        return;
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(1859102901, i18, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreen.<anonymous>.<anonymous>.<anonymous> (GenericLadderScreen.kt:50)");
                                                                    }
                                                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, padding);
                                                                    Function2<Composer, Integer, Unit> function217 = function216;
                                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer6, modifierPadding);
                                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                                                    if (composer6.getApplier() == null) {
                                                                        Composables.invalidApplier();
                                                                    }
                                                                    composer6.startReusableNode();
                                                                    if (composer6.getInserting()) {
                                                                        composer6.createNode(constructor2);
                                                                    } else {
                                                                        composer6.useNode();
                                                                    }
                                                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer6);
                                                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                    }
                                                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                                                    Column6 column6 = Column6.INSTANCE;
                                                                    function217.invoke(composer6, 0);
                                                                    composer6.endNode();
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                }
                                                            }, composer5, 54), composer5, 805306368, 505);
                                                            composer5.endReplaceGroup();
                                                        } else {
                                                            if (!(ladderState instanceof LadderState.LadderData)) {
                                                                composer5.startReplaceGroup(1869004205);
                                                                composer5.endReplaceGroup();
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            composer5.startReplaceGroup(2105005784);
                                                            Function2<Composer, Integer, Unit> function217 = function211;
                                                            Function2<Composer, Integer, Unit> function218 = function213;
                                                            final SnackbarHostState snackbarHostState5 = snackbarHostState3;
                                                            ScaffoldKt.m5939ScaffoldTvnljyQ(null, function217, function218, ComposableLambda3.rememberComposableLambda(663117653, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1.2

                                                                /* compiled from: GenericLadderScreen.kt */
                                                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                                @SourceDebugExtension
                                                                /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$2$1, reason: invalid class name */
                                                                static final class AnonymousClass1 implements Function3<SnackbarData, Composer, Integer, Unit> {
                                                                    final /* synthetic */ SnackbarHostState $snackbarHostState;

                                                                    AnonymousClass1(SnackbarHostState snackbarHostState) {
                                                                        this.$snackbarHostState = snackbarHostState;
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function3
                                                                    public /* bridge */ /* synthetic */ Unit invoke(SnackbarData snackbarData, Composer composer, Integer num) {
                                                                        invoke(snackbarData, composer, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(SnackbarData it, Composer composer, int i) {
                                                                        int i2;
                                                                        Intrinsics.checkNotNullParameter(it, "it");
                                                                        if ((i & 6) == 0) {
                                                                            i2 = (composer.changed(it) ? 4 : 2) | i;
                                                                        } else {
                                                                            i2 = i;
                                                                        }
                                                                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                                                                            composer.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(2017468770, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GenericLadderScreen.kt:59)");
                                                                        }
                                                                        SnackbarVisuals visuals = it.getVisuals();
                                                                        final LadderSnackbarVisuals ladderSnackbarVisuals = visuals instanceof LadderSnackbarVisuals ? (LadderSnackbarVisuals) visuals : null;
                                                                        if (ladderSnackbarVisuals != null) {
                                                                            final SnackbarHostState snackbarHostState = this.$snackbarHostState;
                                                                            composer.startReplaceGroup(5004770);
                                                                            boolean zChanged = composer.changed(snackbarHostState);
                                                                            Object objRememberedValue = composer.rememberedValue();
                                                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                                                objRememberedValue = 
                                                                                /*  JADX ERROR: Method code generation error
                                                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0062: CONSTRUCTOR (r2v3 'objRememberedValue' java.lang.Object) = (r0v4 'snackbarHostState' androidx.compose.material3.SnackbarHostState A[DONT_INLINE]) A[MD:(androidx.compose.material3.SnackbarHostState):void (m)] (LINE:62) call: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$2$1$$ExternalSyntheticLambda0.<init>(androidx.compose.material3.SnackbarHostState):void type: CONSTRUCTOR in method: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt.GenericLadderScreen.2.1.2.1.invoke(androidx.compose.material3.SnackbarData, androidx.compose.runtime.Composer, int):void, file: classes12.dex
                                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                                                    	... 31 more
                                                                                    */
                                                                                /*
                                                                                    this = this;
                                                                                    java.lang.String r1 = "it"
                                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
                                                                                    r1 = r13 & 6
                                                                                    if (r1 != 0) goto L14
                                                                                    boolean r1 = r12.changed(r11)
                                                                                    if (r1 == 0) goto L11
                                                                                    r1 = 4
                                                                                    goto L12
                                                                                L11:
                                                                                    r1 = 2
                                                                                L12:
                                                                                    r1 = r1 | r13
                                                                                    goto L15
                                                                                L14:
                                                                                    r1 = r13
                                                                                L15:
                                                                                    r2 = r1 & 19
                                                                                    r4 = 18
                                                                                    if (r2 != r4) goto L26
                                                                                    boolean r2 = r12.getSkipping()
                                                                                    if (r2 != 0) goto L22
                                                                                    goto L26
                                                                                L22:
                                                                                    r12.skipToGroupEnd()
                                                                                    return
                                                                                L26:
                                                                                    boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                                                    if (r2 == 0) goto L35
                                                                                    r2 = -1
                                                                                    java.lang.String r4 = "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GenericLadderScreen.kt:59)"
                                                                                    r5 = 2017468770(0x78402162, float:1.558747E34)
                                                                                    androidx.compose.runtime.ComposerKt.traceEventStart(r5, r1, r2, r4)
                                                                                L35:
                                                                                    androidx.compose.material3.SnackbarVisuals r0 = r11.getVisuals()
                                                                                    boolean r1 = r0 instanceof com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui.LadderSnackbarVisuals
                                                                                    if (r1 == 0) goto L41
                                                                                    com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderSnackbarVisuals r0 = (com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui.LadderSnackbarVisuals) r0
                                                                                L3f:
                                                                                    r6 = r0
                                                                                    goto L43
                                                                                L41:
                                                                                    r0 = 0
                                                                                    goto L3f
                                                                                L43:
                                                                                    if (r6 != 0) goto L46
                                                                                    goto L9d
                                                                                L46:
                                                                                    androidx.compose.material3.SnackbarHostState r0 = r10.$snackbarHostState
                                                                                    r1 = 5004770(0x4c5de2, float:7.013177E-39)
                                                                                    r12.startReplaceGroup(r1)
                                                                                    boolean r1 = r12.changed(r0)
                                                                                    java.lang.Object r2 = r12.rememberedValue()
                                                                                    if (r1 != 0) goto L60
                                                                                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
                                                                                    java.lang.Object r1 = r1.getEmpty()
                                                                                    if (r2 != r1) goto L68
                                                                                L60:
                                                                                    com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$2$1$$ExternalSyntheticLambda0 r2 = new com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$2$1$$ExternalSyntheticLambda0
                                                                                    r2.<init>(r0)
                                                                                    r12.updateRememberedValue(r2)
                                                                                L68:
                                                                                    r1 = r2
                                                                                    kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                                                                                    r12.endReplaceGroup()
                                                                                    r4 = 0
                                                                                    r5 = 5
                                                                                    r0 = 0
                                                                                    r2 = 0
                                                                                    r3 = r12
                                                                                    androidx.compose.material3.SwipeToDismissBoxState r0 = androidx.compose.material3.SwipeToDismissBoxKt.rememberSwipeToDismissBoxState(r0, r1, r2, r3, r4, r5)
                                                                                    com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderScreenKt r1 = com.robinhood.shared.tradeladder.p398ui.ladder.ComposableSingletons$GenericLadderScreenKt.INSTANCE
                                                                                    kotlin.jvm.functions.Function3 r1 = r1.m26066getLambda$489536309$lib_trade_ladder_externalDebug()
                                                                                    com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$2$1$1$1 r2 = new com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$2$1$1$1
                                                                                    r2.<init>(r6)
                                                                                    r4 = 54
                                                                                    r5 = 1612933030(0x602367a6, float:4.709825E19)
                                                                                    r6 = 1
                                                                                    androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambda3.rememberComposableLambda(r5, r6, r2, r12, r4)
                                                                                    r2 = 1600560(0x186c30, float:2.242862E-39)
                                                                                    int r4 = androidx.compose.material3.SwipeToDismissBoxState.$stable
                                                                                    r8 = r4 | r2
                                                                                    r9 = 36
                                                                                    r2 = 0
                                                                                    r3 = 1
                                                                                    r4 = 1
                                                                                    r5 = 0
                                                                                    r7 = r12
                                                                                    androidx.compose.material3.SwipeToDismissBoxKt.SwipeToDismissBox(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                                                                                L9d:
                                                                                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                                                    if (r0 == 0) goto La6
                                                                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                                                                La6:
                                                                                    return
                                                                                */
                                                                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.tradeladder.p398ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1.C409322.AnonymousClass1.invoke(androidx.compose.material3.SnackbarData, androidx.compose.runtime.Composer, int):void");
                                                                            }

                                                                            /* JADX INFO: Access modifiers changed from: private */
                                                                            public static final boolean invoke$lambda$2$lambda$1$lambda$0(SnackbarHostState snackbarHostState, SwipeToDismissBoxValue value) {
                                                                                Intrinsics.checkNotNullParameter(value, "value");
                                                                                if (value == SwipeToDismissBoxValue.Settled) {
                                                                                    return false;
                                                                                }
                                                                                SnackbarData currentSnackbarData = snackbarHostState.getCurrentSnackbarData();
                                                                                if (currentSnackbarData == null) {
                                                                                    return true;
                                                                                }
                                                                                currentSnackbarData.dismiss();
                                                                                return true;
                                                                            }
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                            invoke(composer6, num.intValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        public final void invoke(Composer composer6, int i18) {
                                                                            if ((i18 & 3) == 2 && composer6.getSkipping()) {
                                                                                composer6.skipToGroupEnd();
                                                                                return;
                                                                            }
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(663117653, i18, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreen.<anonymous>.<anonymous>.<anonymous> (GenericLadderScreen.kt:58)");
                                                                            }
                                                                            SnackbarHostState snackbarHostState6 = snackbarHostState5;
                                                                            SnackbarHostKt.SnackbarHost(snackbarHostState6, null, ComposableLambda3.rememberComposableLambda(2017468770, true, new AnonymousClass1(snackbarHostState6), composer6, 54), composer6, 384, 2);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                            }
                                                                        }
                                                                    }, composer5, 54), null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(660757214, true, new C409333(ladderState, ladderGestureConfiguration, duxo, snapshotState4CollectAsStateWithLifecycle, lazyListState2, function32, function25), composer5, 54), composer5, 805309440, 497);
                                                                    composer5.endReplaceGroup();
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }

                                                            /* compiled from: GenericLadderScreen.kt */
                                                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                            @SourceDebugExtension
                                                            /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$3 */
                                                            static final class C409333 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                                                final /* synthetic */ Function2<Composer, Integer, Unit> $bottomSheet;
                                                                final /* synthetic */ BaseLadderDuxo<?, ?, ?> $duxo;
                                                                final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> $floatingLadderItems;
                                                                final /* synthetic */ LadderGestureConfiguration $ladderGestureConfiguration;
                                                                final /* synthetic */ LadderState $ladderState;
                                                                final /* synthetic */ LazyListState $listState;
                                                                final /* synthetic */ SnapshotState4<BaseLadderDuxo5> $state$delegate;

                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                C409333(LadderState ladderState, LadderGestureConfiguration ladderGestureConfiguration, BaseLadderDuxo<?, ?, ?> baseLadderDuxo, SnapshotState4<? extends BaseLadderDuxo5> snapshotState4, LazyListState lazyListState, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2) {
                                                                    this.$ladderState = ladderState;
                                                                    this.$ladderGestureConfiguration = ladderGestureConfiguration;
                                                                    this.$duxo = baseLadderDuxo;
                                                                    this.$state$delegate = snapshotState4;
                                                                    this.$listState = lazyListState;
                                                                    this.$floatingLadderItems = function3;
                                                                    this.$bottomSheet = function2;
                                                                }

                                                                @Override // kotlin.jvm.functions.Function3
                                                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                                                    invoke(paddingValues, composer, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* JADX WARN: Removed duplicated region for block: B:102:0x0348  */
                                                                /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
                                                                /* JADX WARN: Removed duplicated region for block: B:99:0x02f5  */
                                                                /*
                                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                                */
                                                                public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                                                    int i2;
                                                                    ImmutableMap immutableMap;
                                                                    boolean zChangedInstance;
                                                                    Object objRememberedValue;
                                                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                                                    if ((i & 6) == 0) {
                                                                        i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                                                                    } else {
                                                                        i2 = i;
                                                                    }
                                                                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                                                                        composer.skipToGroupEnd();
                                                                        return;
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(660757214, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreen.<anonymous>.<anonymous>.<anonymous> (GenericLadderScreen.kt:84)");
                                                                    }
                                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                                    Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                                                                    LadderState ladderState = this.$ladderState;
                                                                    LadderGestureConfiguration ladderGestureConfiguration = this.$ladderGestureConfiguration;
                                                                    final BaseLadderDuxo<?, ?, ?> baseLadderDuxo = this.$duxo;
                                                                    final SnapshotState4<BaseLadderDuxo5> snapshotState4 = this.$state$delegate;
                                                                    LazyListState lazyListState = this.$listState;
                                                                    Function3<BoxScope, Composer, Integer, Unit> function3 = this.$floatingLadderItems;
                                                                    Function2<Composer, Integer, Unit> function2 = this.$bottomSheet;
                                                                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                                                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                                    if (composer.getApplier() == null) {
                                                                        Composables.invalidApplier();
                                                                    }
                                                                    composer.startReusableNode();
                                                                    if (composer.getInserting()) {
                                                                        composer.createNode(constructor);
                                                                    } else {
                                                                        composer.useNode();
                                                                    }
                                                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                    }
                                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                                                    Column6 column6 = Column6.INSTANCE;
                                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
                                                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                                                    if (composer.getApplier() == null) {
                                                                        Composables.invalidApplier();
                                                                    }
                                                                    composer.startReusableNode();
                                                                    if (composer.getInserting()) {
                                                                        composer.createNode(constructor2);
                                                                    } else {
                                                                        composer.useNode();
                                                                    }
                                                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                                                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                    }
                                                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                    ImmutableMap<Integer, BigDecimal> zoomOverlayData = GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getZoomOverlayData();
                                                                    ImmutableMap immutableMap2 = zoomOverlayData != null ? extensions2.toImmutableMap(zoomOverlayData) : null;
                                                                    LadderState.LadderData ladderData = (LadderState.LadderData) ladderState;
                                                                    composer.startReplaceGroup(-1633490746);
                                                                    boolean zChangedInstance2 = composer.changedInstance(baseLadderDuxo) | composer.changed(snapshotState4);
                                                                    Object objRememberedValue2 = composer.rememberedValue();
                                                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                                        objRememberedValue2 = 
                                                                        /*  JADX ERROR: Method code generation error
                                                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0172: CONSTRUCTOR (r12v6 'objRememberedValue2' java.lang.Object) = 
                                                                              (r6v0 'baseLadderDuxo' com.robinhood.shared.tradeladder.ui.ladder.BaseLadderDuxo<?, ?, ?> A[DONT_INLINE])
                                                                              (r7v0 'snapshotState4' androidx.compose.runtime.State<com.robinhood.shared.tradeladder.ui.ladder.ILadderViewState> A[DONT_INLINE])
                                                                             A[MD:(com.robinhood.shared.tradeladder.ui.ladder.BaseLadderDuxo, androidx.compose.runtime.State):void (m)] (LINE:95) call: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$3$$ExternalSyntheticLambda0.<init>(com.robinhood.shared.tradeladder.ui.ladder.BaseLadderDuxo, androidx.compose.runtime.State):void type: CONSTRUCTOR in method: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1.3.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void, file: classes12.dex
                                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$3$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                                            	... 25 more
                                                                            */
                                                                        /*
                                                                            Method dump skipped, instructions count: 844
                                                                            To view this dump add '--comments-level debug' option
                                                                        */
                                                                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.tradeladder.p398ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1.C409333.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
                                                                    }

                                                                    /* JADX INFO: Access modifiers changed from: private */
                                                                    public static final Unit invoke$lambda$21$lambda$20$lambda$1$lambda$0(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, boolean z, Integer num, Integer num2) {
                                                                        baseLadderDuxo.onUserInteraction(new LadderInteraction.ZoomStateChanged(z, num, num2), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* JADX INFO: Access modifiers changed from: private */
                                                                    public static final Unit invoke$lambda$21$lambda$20$lambda$3$lambda$2(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, int i, int i2) {
                                                                        baseLadderDuxo.onUserInteraction(new LadderInteraction.ZoomScaleChanged(i, i2, null, null, 12, null), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* JADX INFO: Access modifiers changed from: private */
                                                                    public static final Unit invoke$lambda$21$lambda$20$lambda$5$lambda$4(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, int i) {
                                                                        baseLadderDuxo.onUserInteraction(new LadderInteraction.RowClicked(i), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* JADX INFO: Access modifiers changed from: private */
                                                                    public static final Unit invoke$lambda$21$lambda$20$lambda$7$lambda$6(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, LadderState.LadderData.SelectedPendingOrders selectedPendingOrders) {
                                                                        Intrinsics.checkNotNullParameter(selectedPendingOrders, "selectedPendingOrders");
                                                                        baseLadderDuxo.onUserInteraction(new LadderInteraction.PendingOrderSelected(selectedPendingOrders), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* JADX INFO: Access modifiers changed from: private */
                                                                    public static final Unit invoke$lambda$21$lambda$20$lambda$9$lambda$8(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, LadderCustomGestureDetector3 ladderCustomGestureDetector3) {
                                                                        baseLadderDuxo.onUserInteraction(new LadderInteraction.PendingOrderDragDirectionChanged(ladderCustomGestureDetector3), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* JADX INFO: Access modifiers changed from: private */
                                                                    public static final Unit invoke$lambda$21$lambda$20$lambda$11$lambda$10(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, int i) {
                                                                        baseLadderDuxo.onUserInteraction(new LadderInteraction.PendingOrderDraggedOverRowChanged(i), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* JADX INFO: Access modifiers changed from: private */
                                                                    public static final Unit invoke$lambda$21$lambda$20$lambda$13$lambda$12(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, boolean z, boolean z2) {
                                                                        baseLadderDuxo.onUserInteraction(new LadderInteraction.PendingOrderDragEnded(z, z2), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* JADX INFO: Access modifiers changed from: private */
                                                                    public static final Unit invoke$lambda$21$lambda$20$lambda$15$lambda$14(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, LadderState.LadderData.SelectedPendingOrders it) {
                                                                        Intrinsics.checkNotNullParameter(it, "it");
                                                                        baseLadderDuxo.onUserInteraction(new LadderInteraction.PendingOrderClicked(it), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* JADX INFO: Access modifiers changed from: private */
                                                                    public static final Unit invoke$lambda$21$lambda$20$lambda$17$lambda$16(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, int i, OrderType type2, OrderTrigger trigger) {
                                                                        Intrinsics.checkNotNullParameter(type2, "type");
                                                                        Intrinsics.checkNotNullParameter(trigger, "trigger");
                                                                        baseLadderDuxo.onUserInteraction(new LadderInteraction.StartSideOrderClicked(i, type2, trigger), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* JADX INFO: Access modifiers changed from: private */
                                                                    public static final Unit invoke$lambda$21$lambda$20$lambda$19$lambda$18(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, int i, OrderType type2, OrderTrigger trigger) {
                                                                        Intrinsics.checkNotNullParameter(type2, "type");
                                                                        Intrinsics.checkNotNullParameter(trigger, "trigger");
                                                                        baseLadderDuxo.onUserInteraction(new LadderInteraction.EndSideOrderClicked(i, type2, trigger), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }
                                                            }, composer4, 54), composer4, 6);
                                                            composer4.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                            Function2<? super Composer, ? super Integer, Unit> function214 = function25;
                                                            function27 = function212;
                                                            snackbarHostState4 = snackbarHostState3;
                                                            lazyListState3 = lazyListState2;
                                                            function33 = function32;
                                                            function28 = function214;
                                                            function29 = function211;
                                                            function210 = function213;
                                                            modifier4 = modifier3;
                                                        } else {
                                                            function25 = function2M26064getLambda$1448626262$lib_trade_ladder_externalDebug;
                                                            snackbarHostState3 = snackbarHostState2;
                                                            lazyListState2 = lazyListStateRememberLazyListState;
                                                            function32 = function3M26065getLambda$227985265$lib_trade_ladder_externalDebug;
                                                            composer2 = composerStartRestartGroup;
                                                            function26 = lambda$859451270$lib_trade_ladder_externalDebug;
                                                        }
                                                    } else {
                                                        composerStartRestartGroup.skipToGroupEnd();
                                                        if ((i2 & 16) != 0) {
                                                            function25 = function23;
                                                            i13 = i16 & (-57345);
                                                        } else {
                                                            function25 = function23;
                                                            i13 = i16;
                                                        }
                                                        composer2 = composerStartRestartGroup;
                                                        snackbarHostState3 = snackbarHostState2;
                                                        lazyListState2 = lazyListStateRememberLazyListState;
                                                        function26 = lambda$859451270$lib_trade_ladder_externalDebug;
                                                        function32 = function3;
                                                    }
                                                    modifier3 = modifier2;
                                                    function2M26063getLambda$1265750137$lib_trade_ladder_externalDebug = function24;
                                                    composer2.endDefaults();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    final SnapshotState4<? extends BaseLadderDuxo5> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                                                    composer4 = composer3;
                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                    final Function2<? super Composer, ? super Integer, Unit> function2112 = function26;
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifier3);
                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                                    if (composer4.getApplier() == null) {
                                                    }
                                                    composer4.startReusableNode();
                                                    if (!composer4.getInserting()) {
                                                    }
                                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                                    final Function2<? super Composer, ? super Integer, Unit> function2122 = function2M26063getLambda$1265750137$lib_trade_ladder_externalDebug;
                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                    if (!composerM6388constructorimpl.getInserting()) {
                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                        final Function2<? super Composer, ? super Integer, Unit> function2132 = function2M26062getLambda$1191420810$lib_trade_ladder_externalDebug;
                                                        LadderStyleKt.WithLadderStyle(ComposableLambda3.rememberComposableLambda(-789115730, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                invoke(composer5, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer5, int i17) {
                                                                if ((i17 & 3) == 2 && composer5.getSkipping()) {
                                                                    composer5.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-789115730, i17, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreen.<anonymous>.<anonymous> (GenericLadderScreen.kt:44)");
                                                                }
                                                                LadderState ladderState = GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle2).getLadderState();
                                                                if (ladderState instanceof LadderState.Loading) {
                                                                    composer5.startReplaceGroup(2104376484);
                                                                    Function2<Composer, Integer, Unit> function2142 = function2112;
                                                                    Function2<Composer, Integer, Unit> function215 = function2132;
                                                                    final Function2<? super Composer, ? super Integer, Unit> function216 = function2122;
                                                                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, function2142, function215, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1859102901, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1.1
                                                                        @Override // kotlin.jvm.functions.Function3
                                                                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer6, Integer num) {
                                                                            invoke(paddingValues, composer6, num.intValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        public final void invoke(PaddingValues padding, Composer composer6, int i18) {
                                                                            Intrinsics.checkNotNullParameter(padding, "padding");
                                                                            if ((i18 & 6) == 0) {
                                                                                i18 |= composer6.changed(padding) ? 4 : 2;
                                                                            }
                                                                            if ((i18 & 19) == 18 && composer6.getSkipping()) {
                                                                                composer6.skipToGroupEnd();
                                                                                return;
                                                                            }
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(1859102901, i18, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreen.<anonymous>.<anonymous>.<anonymous> (GenericLadderScreen.kt:50)");
                                                                            }
                                                                            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, padding);
                                                                            Function2<Composer, Integer, Unit> function217 = function216;
                                                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                                                            CompositionLocalMap currentCompositionLocalMap22 = composer6.getCurrentCompositionLocalMap();
                                                                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer6, modifierPadding);
                                                                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                                                            Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                                                                            if (composer6.getApplier() == null) {
                                                                                Composables.invalidApplier();
                                                                            }
                                                                            composer6.startReusableNode();
                                                                            if (composer6.getInserting()) {
                                                                                composer6.createNode(constructor22);
                                                                            } else {
                                                                                composer6.useNode();
                                                                            }
                                                                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer6);
                                                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion22.getSetMeasurePolicy());
                                                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                                                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                            }
                                                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                                                                            Column6 column6 = Column6.INSTANCE;
                                                                            function217.invoke(composer6, 0);
                                                                            composer6.endNode();
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                            }
                                                                        }
                                                                    }, composer5, 54), composer5, 805306368, 505);
                                                                    composer5.endReplaceGroup();
                                                                } else {
                                                                    if (!(ladderState instanceof LadderState.LadderData)) {
                                                                        composer5.startReplaceGroup(1869004205);
                                                                        composer5.endReplaceGroup();
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    composer5.startReplaceGroup(2105005784);
                                                                    Function2<Composer, Integer, Unit> function217 = function2112;
                                                                    Function2<Composer, Integer, Unit> function218 = function2132;
                                                                    final SnackbarHostState snackbarHostState5 = snackbarHostState3;
                                                                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, function217, function218, ComposableLambda3.rememberComposableLambda(663117653, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1.2

                                                                        /* compiled from: GenericLadderScreen.kt */
                                                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                                        @SourceDebugExtension
                                                                        /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$2$1, reason: invalid class name */
                                                                        static final class AnonymousClass1 implements Function3<SnackbarData, Composer, Integer, Unit> {
                                                                            final /* synthetic */ SnackbarHostState $snackbarHostState;

                                                                            AnonymousClass1(SnackbarHostState snackbarHostState) {
                                                                                this.$snackbarHostState = snackbarHostState;
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function3
                                                                            public /* bridge */ /* synthetic */ Unit invoke(SnackbarData snackbarData, Composer composer, Integer num) {
                                                                                invoke(snackbarData, composer, num.intValue());
                                                                                return Unit.INSTANCE;
                                                                            }

                                                                            /*  JADX ERROR: Method code generation error
                                                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0062: CONSTRUCTOR (r2v3 'objRememberedValue' java.lang.Object) = (r0v4 'snackbarHostState' androidx.compose.material3.SnackbarHostState A[DONT_INLINE]) A[MD:(androidx.compose.material3.SnackbarHostState):void (m)] (LINE:62) call: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$2$1$$ExternalSyntheticLambda0.<init>(androidx.compose.material3.SnackbarHostState):void type: CONSTRUCTOR in method: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt.GenericLadderScreen.2.1.2.1.invoke(androidx.compose.material3.SnackbarData, androidx.compose.runtime.Composer, int):void, file: classes12.dex
                                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                                                	... 26 more
                                                                                */
                                                                            public final void invoke(androidx.compose.material3.SnackbarData r11, androidx.compose.runtime.Composer r12, int r13) {
                                                                                /*
                                                                                    r10 = this;
                                                                                    java.lang.String r1 = "it"
                                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
                                                                                    r1 = r13 & 6
                                                                                    if (r1 != 0) goto L14
                                                                                    boolean r1 = r12.changed(r11)
                                                                                    if (r1 == 0) goto L11
                                                                                    r1 = 4
                                                                                    goto L12
                                                                                L11:
                                                                                    r1 = 2
                                                                                L12:
                                                                                    r1 = r1 | r13
                                                                                    goto L15
                                                                                L14:
                                                                                    r1 = r13
                                                                                L15:
                                                                                    r2 = r1 & 19
                                                                                    r4 = 18
                                                                                    if (r2 != r4) goto L26
                                                                                    boolean r2 = r12.getSkipping()
                                                                                    if (r2 != 0) goto L22
                                                                                    goto L26
                                                                                L22:
                                                                                    r12.skipToGroupEnd()
                                                                                    return
                                                                                L26:
                                                                                    boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                                                    if (r2 == 0) goto L35
                                                                                    r2 = -1
                                                                                    java.lang.String r4 = "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GenericLadderScreen.kt:59)"
                                                                                    r5 = 2017468770(0x78402162, float:1.558747E34)
                                                                                    androidx.compose.runtime.ComposerKt.traceEventStart(r5, r1, r2, r4)
                                                                                L35:
                                                                                    androidx.compose.material3.SnackbarVisuals r0 = r11.getVisuals()
                                                                                    boolean r1 = r0 instanceof com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui.LadderSnackbarVisuals
                                                                                    if (r1 == 0) goto L41
                                                                                    com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderSnackbarVisuals r0 = (com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui.LadderSnackbarVisuals) r0
                                                                                L3f:
                                                                                    r6 = r0
                                                                                    goto L43
                                                                                L41:
                                                                                    r0 = 0
                                                                                    goto L3f
                                                                                L43:
                                                                                    if (r6 != 0) goto L46
                                                                                    goto L9d
                                                                                L46:
                                                                                    androidx.compose.material3.SnackbarHostState r0 = r10.$snackbarHostState
                                                                                    r1 = 5004770(0x4c5de2, float:7.013177E-39)
                                                                                    r12.startReplaceGroup(r1)
                                                                                    boolean r1 = r12.changed(r0)
                                                                                    java.lang.Object r2 = r12.rememberedValue()
                                                                                    if (r1 != 0) goto L60
                                                                                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
                                                                                    java.lang.Object r1 = r1.getEmpty()
                                                                                    if (r2 != r1) goto L68
                                                                                L60:
                                                                                    com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$2$1$$ExternalSyntheticLambda0 r2 = new com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$2$1$$ExternalSyntheticLambda0
                                                                                    r2.<init>(r0)
                                                                                    r12.updateRememberedValue(r2)
                                                                                L68:
                                                                                    r1 = r2
                                                                                    kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                                                                                    r12.endReplaceGroup()
                                                                                    r4 = 0
                                                                                    r5 = 5
                                                                                    r0 = 0
                                                                                    r2 = 0
                                                                                    r3 = r12
                                                                                    androidx.compose.material3.SwipeToDismissBoxState r0 = androidx.compose.material3.SwipeToDismissBoxKt.rememberSwipeToDismissBoxState(r0, r1, r2, r3, r4, r5)
                                                                                    com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderScreenKt r1 = com.robinhood.shared.tradeladder.p398ui.ladder.ComposableSingletons$GenericLadderScreenKt.INSTANCE
                                                                                    kotlin.jvm.functions.Function3 r1 = r1.m26066getLambda$489536309$lib_trade_ladder_externalDebug()
                                                                                    com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$2$1$1$1 r2 = new com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$2$1$1$1
                                                                                    r2.<init>(r6)
                                                                                    r4 = 54
                                                                                    r5 = 1612933030(0x602367a6, float:4.709825E19)
                                                                                    r6 = 1
                                                                                    androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambda3.rememberComposableLambda(r5, r6, r2, r12, r4)
                                                                                    r2 = 1600560(0x186c30, float:2.242862E-39)
                                                                                    int r4 = androidx.compose.material3.SwipeToDismissBoxState.$stable
                                                                                    r8 = r4 | r2
                                                                                    r9 = 36
                                                                                    r2 = 0
                                                                                    r3 = 1
                                                                                    r4 = 1
                                                                                    r5 = 0
                                                                                    r7 = r12
                                                                                    androidx.compose.material3.SwipeToDismissBoxKt.SwipeToDismissBox(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                                                                                L9d:
                                                                                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                                                    if (r0 == 0) goto La6
                                                                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                                                                La6:
                                                                                    return
                                                                                */
                                                                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.tradeladder.p398ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1.C409322.AnonymousClass1.invoke(androidx.compose.material3.SnackbarData, androidx.compose.runtime.Composer, int):void");
                                                                            }

                                                                            /* JADX INFO: Access modifiers changed from: private */
                                                                            public static final boolean invoke$lambda$2$lambda$1$lambda$0(SnackbarHostState snackbarHostState, SwipeToDismissBoxValue value) {
                                                                                Intrinsics.checkNotNullParameter(value, "value");
                                                                                if (value == SwipeToDismissBoxValue.Settled) {
                                                                                    return false;
                                                                                }
                                                                                SnackbarData currentSnackbarData = snackbarHostState.getCurrentSnackbarData();
                                                                                if (currentSnackbarData == null) {
                                                                                    return true;
                                                                                }
                                                                                currentSnackbarData.dismiss();
                                                                                return true;
                                                                            }
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                            invoke(composer6, num.intValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        public final void invoke(Composer composer6, int i18) {
                                                                            if ((i18 & 3) == 2 && composer6.getSkipping()) {
                                                                                composer6.skipToGroupEnd();
                                                                                return;
                                                                            }
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(663117653, i18, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreen.<anonymous>.<anonymous>.<anonymous> (GenericLadderScreen.kt:58)");
                                                                            }
                                                                            SnackbarHostState snackbarHostState6 = snackbarHostState5;
                                                                            SnackbarHostKt.SnackbarHost(snackbarHostState6, null, ComposableLambda3.rememberComposableLambda(2017468770, true, new AnonymousClass1(snackbarHostState6), composer6, 54), composer6, 384, 2);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                            }
                                                                        }
                                                                    }, composer5, 54), null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(660757214, true, new C409333(ladderState, ladderGestureConfiguration, duxo, snapshotState4CollectAsStateWithLifecycle2, lazyListState2, function32, function25), composer5, 54), composer5, 805309440, 497);
                                                                    composer5.endReplaceGroup();
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }

                                                            /* compiled from: GenericLadderScreen.kt */
                                                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                            @SourceDebugExtension
                                                            /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$3 */
                                                            static final class C409333 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                                                final /* synthetic */ Function2<Composer, Integer, Unit> $bottomSheet;
                                                                final /* synthetic */ BaseLadderDuxo<?, ?, ?> $duxo;
                                                                final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> $floatingLadderItems;
                                                                final /* synthetic */ LadderGestureConfiguration $ladderGestureConfiguration;
                                                                final /* synthetic */ LadderState $ladderState;
                                                                final /* synthetic */ LazyListState $listState;
                                                                final /* synthetic */ SnapshotState4<BaseLadderDuxo5> $state$delegate;

                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                C409333(LadderState ladderState, LadderGestureConfiguration ladderGestureConfiguration, BaseLadderDuxo<?, ?, ?> baseLadderDuxo, SnapshotState4<? extends BaseLadderDuxo5> snapshotState4, LazyListState lazyListState, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2) {
                                                                    this.$ladderState = ladderState;
                                                                    this.$ladderGestureConfiguration = ladderGestureConfiguration;
                                                                    this.$duxo = baseLadderDuxo;
                                                                    this.$state$delegate = snapshotState4;
                                                                    this.$listState = lazyListState;
                                                                    this.$floatingLadderItems = function3;
                                                                    this.$bottomSheet = function2;
                                                                }

                                                                @Override // kotlin.jvm.functions.Function3
                                                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                                                    invoke(paddingValues, composer, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /*  JADX ERROR: Method code generation error
                                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0172: CONSTRUCTOR (r12v6 'objRememberedValue2' java.lang.Object) = 
                                                                      (r6v0 'baseLadderDuxo' com.robinhood.shared.tradeladder.ui.ladder.BaseLadderDuxo<?, ?, ?> A[DONT_INLINE])
                                                                      (r7v0 'snapshotState4' androidx.compose.runtime.State<com.robinhood.shared.tradeladder.ui.ladder.ILadderViewState> A[DONT_INLINE])
                                                                     A[MD:(com.robinhood.shared.tradeladder.ui.ladder.BaseLadderDuxo, androidx.compose.runtime.State):void (m)] (LINE:95) call: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$3$$ExternalSyntheticLambda0.<init>(com.robinhood.shared.tradeladder.ui.ladder.BaseLadderDuxo, androidx.compose.runtime.State):void type: CONSTRUCTOR in method: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1.3.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void, file: classes12.dex
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1$3$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                                    	... 20 more
                                                                    */
                                                                public final void invoke(androidx.compose.foundation.layout.PaddingValues r24, androidx.compose.runtime.Composer r25, int r26) {
                                                                    /*
                                                                        Method dump skipped, instructions count: 844
                                                                        To view this dump add '--comments-level debug' option
                                                                    */
                                                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.tradeladder.p398ui.ladder.GenericLadderScreenKt$GenericLadderScreen$2$1.C409333.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
                                                                }

                                                                /* JADX INFO: Access modifiers changed from: private */
                                                                public static final Unit invoke$lambda$21$lambda$20$lambda$1$lambda$0(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, boolean z, Integer num, Integer num2) {
                                                                    baseLadderDuxo.onUserInteraction(new LadderInteraction.ZoomStateChanged(z, num, num2), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* JADX INFO: Access modifiers changed from: private */
                                                                public static final Unit invoke$lambda$21$lambda$20$lambda$3$lambda$2(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, int i, int i2) {
                                                                    baseLadderDuxo.onUserInteraction(new LadderInteraction.ZoomScaleChanged(i, i2, null, null, 12, null), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* JADX INFO: Access modifiers changed from: private */
                                                                public static final Unit invoke$lambda$21$lambda$20$lambda$5$lambda$4(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, int i) {
                                                                    baseLadderDuxo.onUserInteraction(new LadderInteraction.RowClicked(i), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* JADX INFO: Access modifiers changed from: private */
                                                                public static final Unit invoke$lambda$21$lambda$20$lambda$7$lambda$6(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, LadderState.LadderData.SelectedPendingOrders selectedPendingOrders) {
                                                                    Intrinsics.checkNotNullParameter(selectedPendingOrders, "selectedPendingOrders");
                                                                    baseLadderDuxo.onUserInteraction(new LadderInteraction.PendingOrderSelected(selectedPendingOrders), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* JADX INFO: Access modifiers changed from: private */
                                                                public static final Unit invoke$lambda$21$lambda$20$lambda$9$lambda$8(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, LadderCustomGestureDetector3 ladderCustomGestureDetector3) {
                                                                    baseLadderDuxo.onUserInteraction(new LadderInteraction.PendingOrderDragDirectionChanged(ladderCustomGestureDetector3), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* JADX INFO: Access modifiers changed from: private */
                                                                public static final Unit invoke$lambda$21$lambda$20$lambda$11$lambda$10(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, int i) {
                                                                    baseLadderDuxo.onUserInteraction(new LadderInteraction.PendingOrderDraggedOverRowChanged(i), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* JADX INFO: Access modifiers changed from: private */
                                                                public static final Unit invoke$lambda$21$lambda$20$lambda$13$lambda$12(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, boolean z, boolean z2) {
                                                                    baseLadderDuxo.onUserInteraction(new LadderInteraction.PendingOrderDragEnded(z, z2), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* JADX INFO: Access modifiers changed from: private */
                                                                public static final Unit invoke$lambda$21$lambda$20$lambda$15$lambda$14(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, LadderState.LadderData.SelectedPendingOrders it) {
                                                                    Intrinsics.checkNotNullParameter(it, "it");
                                                                    baseLadderDuxo.onUserInteraction(new LadderInteraction.PendingOrderClicked(it), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* JADX INFO: Access modifiers changed from: private */
                                                                public static final Unit invoke$lambda$21$lambda$20$lambda$17$lambda$16(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, int i, OrderType type2, OrderTrigger trigger) {
                                                                    Intrinsics.checkNotNullParameter(type2, "type");
                                                                    Intrinsics.checkNotNullParameter(trigger, "trigger");
                                                                    baseLadderDuxo.onUserInteraction(new LadderInteraction.StartSideOrderClicked(i, type2, trigger), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* JADX INFO: Access modifiers changed from: private */
                                                                public static final Unit invoke$lambda$21$lambda$20$lambda$19$lambda$18(BaseLadderDuxo baseLadderDuxo, SnapshotState4 snapshotState4, int i, OrderType type2, OrderTrigger trigger) {
                                                                    Intrinsics.checkNotNullParameter(type2, "type");
                                                                    Intrinsics.checkNotNullParameter(trigger, "trigger");
                                                                    baseLadderDuxo.onUserInteraction(new LadderInteraction.EndSideOrderClicked(i, type2, trigger), GenericLadderScreenKt.GenericLadderScreen$lambda$1(snapshotState4).getUserInteractionData());
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, composer4, 54), composer4, 6);
                                                        composer4.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        Function2<? super Composer, ? super Integer, Unit> function2142 = function25;
                                                        function27 = function2122;
                                                        snackbarHostState4 = snackbarHostState3;
                                                        lazyListState3 = lazyListState2;
                                                        function33 = function32;
                                                        function28 = function2142;
                                                        function29 = function2112;
                                                        function210 = function2132;
                                                        modifier4 = modifier3;
                                                    }
                                                } else {
                                                    composerStartRestartGroup.skipToGroupEnd();
                                                    function27 = function24;
                                                    composer4 = composerStartRestartGroup;
                                                    modifier4 = modifier2;
                                                    snackbarHostState4 = snackbarHostState2;
                                                    lazyListState3 = lazyListStateRememberLazyListState;
                                                    function29 = lambda$859451270$lib_trade_ladder_externalDebug;
                                                    function210 = function2M26062getLambda$1191420810$lib_trade_ladder_externalDebug;
                                                    function33 = function3;
                                                    function28 = function23;
                                                }
                                                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                                                if (scopeUpdateScopeEndRestartGroup == null) {
                                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderScreenKt$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            return GenericLadderScreenKt.GenericLadderScreen$lambda$3(duxo, ladderGestureConfiguration, modifier4, snackbarHostState4, lazyListState3, function29, function210, function33, function28, function27, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                                        }
                                                    });
                                                    return;
                                                }
                                                return;
                                            }
                                            i3 |= 805306368;
                                            i12 = i11;
                                            int i162 = i3;
                                            if ((i3 & 306783379) == 306783378) {
                                                composerStartRestartGroup.startDefaults();
                                                if ((i & 1) != 0) {
                                                    if (i14 != 0) {
                                                    }
                                                    if (i4 != 0) {
                                                    }
                                                    if ((i2 & 16) == 0) {
                                                    }
                                                    if (i5 != 0) {
                                                    }
                                                    if (i6 != 0) {
                                                    }
                                                    if (i8 == 0) {
                                                    }
                                                    if (i10 == 0) {
                                                    }
                                                    if (i12 == 0) {
                                                    }
                                                }
                                            }
                                            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                                            if (scopeUpdateScopeEndRestartGroup == null) {
                                            }
                                        }
                                        i10 = i9;
                                        i11 = i2 & 512;
                                        if (i11 == 0) {
                                        }
                                        i12 = i11;
                                        int i1622 = i3;
                                        if ((i3 & 306783379) == 306783378) {
                                        }
                                        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup == null) {
                                        }
                                    }
                                    i8 = i7;
                                    i9 = i2 & 256;
                                    if (i9 == 0) {
                                    }
                                    i10 = i9;
                                    i11 = i2 & 512;
                                    if (i11 == 0) {
                                    }
                                    i12 = i11;
                                    int i16222 = i3;
                                    if ((i3 & 306783379) == 306783378) {
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                    }
                                }
                                function2M26062getLambda$1191420810$lib_trade_ladder_externalDebug = function22;
                                i7 = i2 & 128;
                                if (i7 != 0) {
                                }
                                i8 = i7;
                                i9 = i2 & 256;
                                if (i9 == 0) {
                                }
                                i10 = i9;
                                i11 = i2 & 512;
                                if (i11 == 0) {
                                }
                                i12 = i11;
                                int i162222 = i3;
                                if ((i3 & 306783379) == 306783378) {
                                }
                                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            lambda$859451270$lib_trade_ladder_externalDebug = function2;
                            i6 = i2 & 64;
                            if (i6 == 0) {
                            }
                            function2M26062getLambda$1191420810$lib_trade_ladder_externalDebug = function22;
                            i7 = i2 & 128;
                            if (i7 != 0) {
                            }
                            i8 = i7;
                            i9 = i2 & 256;
                            if (i9 == 0) {
                            }
                            i10 = i9;
                            i11 = i2 & 512;
                            if (i11 == 0) {
                            }
                            i12 = i11;
                            int i1622222 = i3;
                            if ((i3 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        snackbarHostState2 = snackbarHostState;
                        if ((i & 24576) == 0) {
                        }
                        i5 = i2 & 32;
                        if (i5 != 0) {
                        }
                        lambda$859451270$lib_trade_ladder_externalDebug = function2;
                        i6 = i2 & 64;
                        if (i6 == 0) {
                        }
                        function2M26062getLambda$1191420810$lib_trade_ladder_externalDebug = function22;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                        }
                        i8 = i7;
                        i9 = i2 & 256;
                        if (i9 == 0) {
                        }
                        i10 = i9;
                        i11 = i2 & 512;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        int i16222222 = i3;
                        if ((i3 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    modifier2 = modifier;
                    i4 = i2 & 8;
                    if (i4 == 0) {
                    }
                    snackbarHostState2 = snackbarHostState;
                    if ((i & 24576) == 0) {
                    }
                    i5 = i2 & 32;
                    if (i5 != 0) {
                    }
                    lambda$859451270$lib_trade_ladder_externalDebug = function2;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                    }
                    function2M26062getLambda$1191420810$lib_trade_ladder_externalDebug = function22;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i2 & 256;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    i11 = i2 & 512;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    int i162222222 = i3;
                    if ((i3 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BaseLadderDuxo5 GenericLadderScreen$lambda$1(SnapshotState4<? extends BaseLadderDuxo5> snapshotState4) {
                    return snapshotState4.getValue();
                }
            }

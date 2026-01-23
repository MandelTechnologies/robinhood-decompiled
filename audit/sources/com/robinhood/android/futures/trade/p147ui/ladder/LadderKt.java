package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.sharedfuturesui.MarketClosedHeader;
import com.robinhood.android.futures.trade.extensions.LazyListStates;
import com.robinhood.android.futures.trade.extensions.StringResources4;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.futures.trade.p147ui.ladder.LadderKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Ladder.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001a9\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0015\u001a\u00020\n*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001aA\u0010\u001d\u001a\u00020\n*\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010 \u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0003¢\u0006\u0004\b \u0010!\u001a)\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b%\u0010&¨\u0006+²\u0006\u000e\u0010\u000f\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010(\u001a\u0004\u0018\u00010'8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010)\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010*\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData;", "ladderData", "Landroidx/compose/foundation/lazy/LazyListState;", "ladderLazyListState", "", "animateQuantityBarsEntry", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderCallbacks;", "callbacks", "Landroidx/compose/ui/Modifier;", "modifier", "", "LadderUi", "(Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData;Landroidx/compose/foundation/lazy/LazyListState;ZLcom/robinhood/android/futures/trade/ui/ladder/LadderCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "isFloatingLastPriceVisible", "isFloatingLastPriceOnTop", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/futures/trade/ui/ladder/OrderPillData;", "offscreenOrders", "FloatingLadderItems", "(Landroidx/compose/foundation/layout/BoxScope;ZZLcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)V", "orderPillData", "isVisible", "hasFloatingMessageAtTop", "hasFloatingMessageAtBottom", "Lkotlin/Function0;", "onClick", "LadderOffScreenOrderPill", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/robinhood/android/futures/trade/ui/ladder/OrderPillData;ZZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "content", "FloatingHeaderAnimatedVisibilityContent", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/utils/resource/StringResource;", "lastPriceLabel", "isAnchoredToTop", "FloatingLastPrice", "(Lcom/robinhood/utils/resource/StringResource;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "previousScrollIndex", "isFloatingMessageVisibleOnTop", "isFloatingMessageVisibleOnBottom", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class LadderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingHeaderAnimatedVisibilityContent$lambda$36(Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        FloatingHeaderAnimatedVisibilityContent(modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingLadderItems$lambda$32(BoxScope boxScope, boolean z, boolean z2, FuturesLadderViewState.LadderData ladderData, CoroutineScope coroutineScope, LazyListState lazyListState, ImmutableList immutableList, int i, Composer composer, int i2) {
        FloatingLadderItems(boxScope, z, z2, ladderData, coroutineScope, lazyListState, immutableList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingLastPrice$lambda$38(StringResource stringResource, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FloatingLastPrice(stringResource, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderOffScreenOrderPill$lambda$33(BoxScope boxScope, OrderPillData orderPillData, boolean z, boolean z2, boolean z3, Function0 function0, int i, Composer composer, int i2) {
        LadderOffScreenOrderPill(boxScope, orderPillData, z, z2, z3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderUi$lambda$26(FuturesLadderViewState.LadderData ladderData, LazyListState lazyListState, boolean z, LadderCallbacks ladderCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LadderUi(ladderData, lazyListState, z, ladderCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016b  */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LadderUi(final FuturesLadderViewState.LadderData ladderData, final LazyListState lazyListState, final boolean z, final LadderCallbacks callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Object objRememberedValue2;
        SnapshotState snapshotState2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        SnapshotState snapshotState3;
        Object objRememberedValue5;
        final SnapshotState snapshotState4;
        Integer numLadderUi$lambda$10;
        int i5;
        boolean zChangedInstance;
        Object objRememberedValue6;
        int i6;
        ?? r12;
        SnapshotState snapshotState5;
        SnapshotState snapshotState6;
        boolean zChangedInstance2;
        Object objRememberedValue7;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z3;
        Object objRememberedValue8;
        boolean z4;
        Object objRememberedValue9;
        boolean z5;
        Object objRememberedValue10;
        boolean z6;
        Object objRememberedValue11;
        boolean z7;
        Object objRememberedValue12;
        boolean z8;
        Object objRememberedValue13;
        boolean zChangedInstance3;
        Object objRememberedValue14;
        final LadderCallbacks ladderCallbacks;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final FuturesLadderViewState.LadderData ladderData2 = ladderData;
        final LazyListState ladderLazyListState = lazyListState;
        Intrinsics.checkNotNullParameter(ladderData2, "ladderData");
        Intrinsics.checkNotNullParameter(ladderLazyListState, "ladderLazyListState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-21563494);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(ladderData2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(ladderLazyListState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-21563494, i4, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderUi (Ladder.kt:79)");
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
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue3;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotState3 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotState4 = (SnapshotState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                numLadderUi$lambda$10 = LadderUi$lambda$10(snapshotState4);
                composerStartRestartGroup.startReplaceGroup(752341775);
                if (numLadderUi$lambda$10 == null) {
                    int iIntValue = numLadderUi$lambda$10.intValue();
                    snapshotState4.setValue(null);
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged = ((i4 & 112) == 32) | composerStartRestartGroup.changed(iIntValue);
                    Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue15 == companion.getEmpty()) {
                        objRememberedValue15 = new LadderKt$LadderUi$1$1$1(ladderLazyListState, iIntValue, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue15, composerStartRestartGroup, 0);
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                Integer numValueOf2 = Integer.valueOf(ladderData2.getLastPriceIndex());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                i5 = i4 & 112;
                zChangedInstance = (i5 != 32) | composerStartRestartGroup.changedInstance(ladderData2);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                    i6 = i5;
                    r12 = 0;
                    LadderKt$LadderUi$2$1 ladderKt$LadderUi$2$1 = new LadderKt$LadderUi$2$1(ladderLazyListState, ladderData2, snapshotState2, snapshotState, null);
                    ladderLazyListState = ladderLazyListState;
                    ladderData2 = ladderData2;
                    snapshotState5 = snapshotState2;
                    snapshotState6 = snapshotState;
                    composerStartRestartGroup.updateRememberedValue(ladderKt$LadderUi$2$1);
                    objRememberedValue6 = ladderKt$LadderUi$2$1;
                } else {
                    i6 = i5;
                    snapshotState5 = snapshotState2;
                    r12 = 0;
                    snapshotState6 = snapshotState;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, (int) r12);
                Map<Integer, FuturesLadderViewState.LadderData.PendingOrderRow> pendingOrders = ladderData2.getPendingOrders();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                int i8 = i6;
                zChangedInstance2 = composerStartRestartGroup.changedInstance(ladderData2) | (i8 != 32 ? true : r12);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new LadderKt$LadderUi$3$1(ladderData2, snapshotState3, ladderLazyListState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(pendingOrders, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, (int) r12);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), r12);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r12);
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
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i9 = i4 & 7168;
                z3 = i9 != 2048 || ((i4 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!z3 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new LadderKt$LadderUi$4$1$1(callbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                KFunction kFunction = (KFunction) objRememberedValue8;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z4 = i9 != 2048 || ((i4 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (!z4 || objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new LadderKt$LadderUi$4$2$1(callbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                KFunction kFunction2 = (KFunction) objRememberedValue9;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z5 = i9 != 2048 || ((i4 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (!z5 || objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new LadderKt$LadderUi$4$3$1(callbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                KFunction kFunction3 = (KFunction) objRememberedValue10;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z6 = i9 != 2048 || ((i4 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (!z6 || objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new LadderKt$LadderUi$4$4$1(callbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                KFunction kFunction4 = (KFunction) objRememberedValue11;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z7 = i9 != 2048 || ((i4 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (!z7 || objRememberedValue12 == companion.getEmpty()) {
                    objRememberedValue12 = new LadderKt$LadderUi$4$5$1(callbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function1 function1 = (Function1) kFunction2;
                Function1 function12 = (Function1) kFunction;
                Function1 function13 = (Function1) kFunction3;
                Function2 function2 = (Function2) kFunction4;
                Function1 function14 = (Function1) ((KFunction) objRememberedValue12);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z8 = (i9 != 2048 || ((i4 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | (i8 != 32);
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (!z8 || objRememberedValue13 == companion.getEmpty()) {
                    objRememberedValue13 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LadderKt.LadderUi$lambda$25$lambda$22$lambda$21(ladderLazyListState, callbacks, ((Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                Function1 function15 = (Function1) objRememberedValue13;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(ladderData2) | ((i4 & 896) != 256) | (i9 != 2048 || ((i4 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | (i8 != 32);
                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue14 == companion.getEmpty()) {
                    final LazyListState lazyListState2 = ladderLazyListState;
                    final boolean z9 = z2;
                    Function1 function16 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LadderKt.LadderUi$lambda$25$lambda$24$lambda$23(ladderData2, z9, callbacks, lazyListState2, snapshotState4, (LadderLazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function16);
                    objRememberedValue14 = function16;
                }
                composerStartRestartGroup.endReplaceGroup();
                ladderCallbacks = callbacks;
                LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn(ladderData, lazyListState, function1, function12, function13, function2, function14, function15, null, (Function1) objRememberedValue14, composerStartRestartGroup, i4 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 256);
                composerStartRestartGroup = composerStartRestartGroup;
                FloatingLadderItems(boxScopeInstance, LadderUi$lambda$4(snapshotState5), LadderUi$lambda$1(snapshotState6), ladderData, coroutineScope, lazyListState, LadderUi$lambda$7(snapshotState3), composerStartRestartGroup, ((i4 << 9) & 7168) | 6 | ((i4 << 12) & 458752) | (StringResource.$stable << 18));
                boolean quantitySelectorOpen = ladderData.getQuantityPanel().getQuantitySelectorOpen();
                EnterTransition ladderFadeInAnimation = LadderAnimations.getLadderFadeInAnimation();
                ExitTransition ladderFadeOutAnimation = LadderAnimations.getLadderFadeOutAnimation();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                AnimatedVisibilityKt.AnimatedVisibility(quantitySelectorOpen, boxScopeInstance.align(companion4, companion2.getBottomCenter()), ladderFadeInAnimation, ladderFadeOutAnimation, (String) null, ComposableLambda3.rememberComposableLambda(-1350838532, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$LadderUi$4$8
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i10) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1350838532, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderUi.<anonymous>.<anonymous> (Ladder.kt:196)");
                        }
                        StringResource buyingPowerDisplayText = ladderData.getQuantityPanel().getBuyingPowerDisplayText();
                        BigDecimal quantity = ladderData.getQuantityPanel().getQuantity();
                        LadderCallbacks ladderCallbacks2 = ladderCallbacks;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composer2.changedInstance(ladderCallbacks2);
                        Object objRememberedValue16 = composer2.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue16 = new LadderKt$LadderUi$4$8$1$1(ladderCallbacks2);
                            composer2.updateRememberedValue(objRememberedValue16);
                        }
                        composer2.endReplaceGroup();
                        Function1 function17 = (Function1) ((KFunction) objRememberedValue16);
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i11 = BentoTheme.$stable;
                        QuantitySelector2.QuantitySelector(buyingPowerDisplayText, quantity, function17, PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(companion5, bentoTheme.getColors(composer2, i11).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer2, i11).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i11).m21593getSmallD9Ej5fM(), 5, null), composer2, StringResource.$stable, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
                AnimatedVisibilityKt.AnimatedVisibility(ladderData.getZoomDisplay() == null, PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(companion4, companion2.getTopCenter()), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(1398392613, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$LadderUi$4$9
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i10) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1398392613, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderUi.<anonymous>.<anonymous> (Ladder.kt:217)");
                        }
                        StringResource zoomDisplay = ladderData.getZoomDisplay();
                        composer2.startReplaceGroup(-469460242);
                        String text = zoomDisplay == null ? null : StringResources4.getText(zoomDisplay, composer2, StringResource.$stable);
                        composer2.endReplaceGroup();
                        if (text == null) {
                            text = "";
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i11 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i11).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i11).getDisplayCapsuleLarge(), composer2, 24576, 0, 8170);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                ladderCallbacks = callbacks;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final LadderCallbacks ladderCallbacks2 = ladderCallbacks;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LadderKt.LadderUi$lambda$26(ladderData, lazyListState, z, ladderCallbacks2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (i7 == 0) {
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue3;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            snapshotState3 = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            snapshotState4 = (SnapshotState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            numLadderUi$lambda$10 = LadderUi$lambda$10(snapshotState4);
            composerStartRestartGroup.startReplaceGroup(752341775);
            if (numLadderUi$lambda$10 == null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Integer numValueOf22 = Integer.valueOf(ladderData2.getLastPriceIndex());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            i5 = i4 & 112;
            zChangedInstance = (i5 != 32) | composerStartRestartGroup.changedInstance(ladderData2);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                i6 = i5;
                r12 = 0;
                LadderKt$LadderUi$2$1 ladderKt$LadderUi$2$12 = new LadderKt$LadderUi$2$1(ladderLazyListState, ladderData2, snapshotState2, snapshotState, null);
                ladderLazyListState = ladderLazyListState;
                ladderData2 = ladderData2;
                snapshotState5 = snapshotState2;
                snapshotState6 = snapshotState;
                composerStartRestartGroup.updateRememberedValue(ladderKt$LadderUi$2$12);
                objRememberedValue6 = ladderKt$LadderUi$2$12;
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, (int) r12);
                Map<Integer, FuturesLadderViewState.LadderData.PendingOrderRow> pendingOrders2 = ladderData2.getPendingOrders();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                int i82 = i6;
                zChangedInstance2 = composerStartRestartGroup.changedInstance(ladderData2) | (i82 != 32 ? true : r12);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue7 = new LadderKt$LadderUi$3$1(ladderData2, snapshotState3, ladderLazyListState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(pendingOrders2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, (int) r12);
                    Alignment.Companion companion22 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), r12);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r12);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        int i92 = i4 & 7168;
                        if (i92 != 2048) {
                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (!z3) {
                                objRememberedValue8 = new LadderKt$LadderUi$4$1$1(callbacks);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                KFunction kFunction5 = (KFunction) objRememberedValue8;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                if (i92 != 2048) {
                                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                    if (!z4) {
                                        objRememberedValue9 = new LadderKt$LadderUi$4$2$1(callbacks);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                        KFunction kFunction22 = (KFunction) objRememberedValue9;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        if (i92 != 2048) {
                                            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                            if (!z5) {
                                                objRememberedValue10 = new LadderKt$LadderUi$4$3$1(callbacks);
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                                KFunction kFunction32 = (KFunction) objRememberedValue10;
                                                composerStartRestartGroup.endReplaceGroup();
                                                composerStartRestartGroup.startReplaceGroup(5004770);
                                                if (i92 != 2048) {
                                                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                                    if (!z6) {
                                                        objRememberedValue11 = new LadderKt$LadderUi$4$4$1(callbacks);
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                                        KFunction kFunction42 = (KFunction) objRememberedValue11;
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                                        if (i92 != 2048) {
                                                            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                                            if (!z7) {
                                                                objRememberedValue12 = new LadderKt$LadderUi$4$5$1(callbacks);
                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                                Function1 function17 = (Function1) kFunction22;
                                                                Function1 function122 = (Function1) kFunction5;
                                                                Function1 function132 = (Function1) kFunction32;
                                                                Function2 function22 = (Function2) kFunction42;
                                                                Function1 function142 = (Function1) ((KFunction) objRememberedValue12);
                                                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                                                if (i82 != 32) {
                                                                }
                                                                if (i92 != 2048) {
                                                                    z8 = (i92 != 2048 || ((i4 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | (i82 != 32);
                                                                    objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                                                    if (!z8) {
                                                                        objRememberedValue13 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$$ExternalSyntheticLambda0
                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public final Object invoke(Object obj) {
                                                                                return LadderKt.LadderUi$lambda$25$lambda$22$lambda$21(ladderLazyListState, callbacks, ((Integer) obj).intValue());
                                                                            }
                                                                        };
                                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                                                                        Function1 function152 = (Function1) objRememberedValue13;
                                                                        composerStartRestartGroup.endReplaceGroup();
                                                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                                                        if (i92 != 2048) {
                                                                            zChangedInstance3 = composerStartRestartGroup.changedInstance(ladderData2) | ((i4 & 896) != 256) | (i92 != 2048 || ((i4 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | (i82 != 32);
                                                                            objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                                                                            if (!zChangedInstance3) {
                                                                                final LazyListState lazyListState22 = ladderLazyListState;
                                                                                final boolean z92 = z2;
                                                                                Function1 function162 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$$ExternalSyntheticLambda1
                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                    public final Object invoke(Object obj) {
                                                                                        return LadderKt.LadderUi$lambda$25$lambda$24$lambda$23(ladderData2, z92, callbacks, lazyListState22, snapshotState4, (LadderLazyListScope) obj);
                                                                                    }
                                                                                };
                                                                                composerStartRestartGroup.updateRememberedValue(function162);
                                                                                objRememberedValue14 = function162;
                                                                                composerStartRestartGroup.endReplaceGroup();
                                                                                ladderCallbacks = callbacks;
                                                                                LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn(ladderData, lazyListState, function17, function122, function132, function22, function142, function152, null, (Function1) objRememberedValue14, composerStartRestartGroup, i4 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 256);
                                                                                composerStartRestartGroup = composerStartRestartGroup;
                                                                                FloatingLadderItems(boxScopeInstance2, LadderUi$lambda$4(snapshotState5), LadderUi$lambda$1(snapshotState6), ladderData, coroutineScope2, lazyListState, LadderUi$lambda$7(snapshotState3), composerStartRestartGroup, ((i4 << 9) & 7168) | 6 | ((i4 << 12) & 458752) | (StringResource.$stable << 18));
                                                                                boolean quantitySelectorOpen2 = ladderData.getQuantityPanel().getQuantitySelectorOpen();
                                                                                EnterTransition ladderFadeInAnimation2 = LadderAnimations.getLadderFadeInAnimation();
                                                                                ExitTransition ladderFadeOutAnimation2 = LadderAnimations.getLadderFadeOutAnimation();
                                                                                Modifier.Companion companion42 = Modifier.INSTANCE;
                                                                                AnimatedVisibilityKt.AnimatedVisibility(quantitySelectorOpen2, boxScopeInstance2.align(companion42, companion22.getBottomCenter()), ladderFadeInAnimation2, ladderFadeOutAnimation2, (String) null, ComposableLambda3.rememberComposableLambda(-1350838532, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$LadderUi$4$8
                                                                                    @Override // kotlin.jvm.functions.Function3
                                                                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                                                                        invoke(animatedVisibilityScope, composer2, num.intValue());
                                                                                        return Unit.INSTANCE;
                                                                                    }

                                                                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i10) {
                                                                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                            ComposerKt.traceEventStart(-1350838532, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderUi.<anonymous>.<anonymous> (Ladder.kt:196)");
                                                                                        }
                                                                                        StringResource buyingPowerDisplayText = ladderData.getQuantityPanel().getBuyingPowerDisplayText();
                                                                                        BigDecimal quantity = ladderData.getQuantityPanel().getQuantity();
                                                                                        LadderCallbacks ladderCallbacks22 = ladderCallbacks;
                                                                                        composer2.startReplaceGroup(5004770);
                                                                                        boolean zChangedInstance4 = composer2.changedInstance(ladderCallbacks22);
                                                                                        Object objRememberedValue16 = composer2.rememberedValue();
                                                                                        if (zChangedInstance4 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                                                                            objRememberedValue16 = new LadderKt$LadderUi$4$8$1$1(ladderCallbacks22);
                                                                                            composer2.updateRememberedValue(objRememberedValue16);
                                                                                        }
                                                                                        composer2.endReplaceGroup();
                                                                                        Function1 function172 = (Function1) ((KFunction) objRememberedValue16);
                                                                                        Modifier.Companion companion5 = Modifier.INSTANCE;
                                                                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                                                        int i11 = BentoTheme.$stable;
                                                                                        QuantitySelector2.QuantitySelector(buyingPowerDisplayText, quantity, function172, PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(companion5, bentoTheme.getColors(composer2, i11).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer2, i11).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i11).m21593getSmallD9Ej5fM(), 5, null), composer2, StringResource.$stable, 0);
                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                            ComposerKt.traceEventEnd();
                                                                                        }
                                                                                    }
                                                                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
                                                                                if (ladderData.getZoomDisplay() == null) {
                                                                                }
                                                                                AnimatedVisibilityKt.AnimatedVisibility(ladderData.getZoomDisplay() == null, PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance2.align(companion42, companion22.getTopCenter()), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(1398392613, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$LadderUi$4$9
                                                                                    @Override // kotlin.jvm.functions.Function3
                                                                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                                                                        invoke(animatedVisibilityScope, composer2, num.intValue());
                                                                                        return Unit.INSTANCE;
                                                                                    }

                                                                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i10) {
                                                                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                            ComposerKt.traceEventStart(1398392613, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderUi.<anonymous>.<anonymous> (Ladder.kt:217)");
                                                                                        }
                                                                                        StringResource zoomDisplay = ladderData.getZoomDisplay();
                                                                                        composer2.startReplaceGroup(-469460242);
                                                                                        String text = zoomDisplay == null ? null : StringResources4.getText(zoomDisplay, composer2, StringResource.$stable);
                                                                                        composer2.endReplaceGroup();
                                                                                        if (text == null) {
                                                                                            text = "";
                                                                                        }
                                                                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                                                        int i11 = BentoTheme.$stable;
                                                                                        BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i11).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i11).getDisplayCapsuleLarge(), composer2, 24576, 0, 8170);
                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                            ComposerKt.traceEventEnd();
                                                                                        }
                                                                                    }
                                                                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LadderUi$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LadderUi$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final boolean FloatingLadderItems$lambda$27(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean FloatingLadderItems$lambda$28(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean LadderUi$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final Integer LadderUi$lambda$10(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean LadderUi$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final ImmutableList<OrderPillData> LadderUi$lambda$7(SnapshotState<ImmutableList<OrderPillData>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderUi$lambda$25$lambda$22$lambda$21(LazyListState lazyListState, LadderCallbacks ladderCallbacks, int i) {
        ladderCallbacks.onZoomScaleChanged(i, LazyListStates.getCenterIndex(lazyListState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderUi$lambda$25$lambda$24$lambda$23(FuturesLadderViewState.LadderData ladderData, boolean z, LadderCallbacks ladderCallbacks, LazyListState lazyListState, SnapshotState snapshotState, LadderLazyListScope LadderGestureAwareLazyColumn) {
        Intrinsics.checkNotNullParameter(LadderGestureAwareLazyColumn, "$this$LadderGestureAwareLazyColumn");
        int numRows = ladderData.getLadderPriceLevels().getNumRows();
        LazyListScope.items$default(LadderGestureAwareLazyColumn, numRows, null, null, ComposableLambda3.composableLambdaInstance(-1870049951, true, new LadderKt$LadderUi$4$7$1$1(ladderData, z, ladderCallbacks, LadderGestureAwareLazyColumn, lazyListState, numRows, snapshotState)), 6, null);
        return Unit.INSTANCE;
    }

    private static final void FloatingLadderItems(final BoxScope boxScope, final boolean z, final boolean z2, final FuturesLadderViewState.LadderData ladderData, final CoroutineScope coroutineScope, final LazyListState lazyListState, final ImmutableList<OrderPillData> immutableList, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(691664490);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(ladderData) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(coroutineScope) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(lazyListState) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 1048576 : 524288;
        }
        if ((599187 & i2) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(691664490, i2, -1, "com.robinhood.android.futures.trade.ui.ladder.FloatingLadderItems (Ladder.kt:235)");
            }
            boolean z3 = false;
            boolean z4 = true;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1875890694);
                Modifier.Companion companion = Modifier.INSTANCE;
                Alignment.Companion companion2 = Alignment.INSTANCE;
                FloatingHeaderAnimatedVisibilityContent(boxScope.align(companion, z2 ? companion2.getTopCenter() : companion2.getBottomCenter()), ComposableLambda3.rememberComposableLambda(-1202633494, true, new C175581(ladderData, z2, coroutineScope, lazyListState), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (ladderData.getMarketClosedHeader().getHeaderString() != null) {
                composerStartRestartGroup.startReplaceGroup(-1875088662);
                FloatingHeaderAnimatedVisibilityContent(null, ComposableLambda3.rememberComposableLambda(-1529106719, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt.FloatingLadderItems.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1529106719, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.FloatingLadderItems.<anonymous> (Ladder.kt:257)");
                        }
                        MarketClosedHeader.MarketClosedHeader(ladderData.getMarketClosedHeader().getHeaderString(), null, composer2, StringResource.$stable, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1874952200);
                composerStartRestartGroup.endReplaceGroup();
            }
            SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z && z2) || ladderData.getMarketClosedHeader().getHeaderString() != null), composerStartRestartGroup, 0);
            SnapshotState4 snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z && !z2), composerStartRestartGroup, 0);
            if (immutableList != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
                for (final OrderPillData orderPillData : immutableList) {
                    boolean fadedOut = ladderData.getFadedOut() ^ z4;
                    int i3 = i2;
                    boolean zFloatingLadderItems$lambda$27 = FloatingLadderItems$lambda$27(snapshotState4RememberUpdatedState);
                    boolean z5 = z3;
                    boolean zFloatingLadderItems$lambda$28 = FloatingLadderItems$lambda$28(snapshotState4RememberUpdatedState2);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    ArrayList arrayList2 = arrayList;
                    boolean zChangedInstance = ((i3 & 458752) == 131072 ? true : z5) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(orderPillData);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LadderKt.FloatingLadderItems$lambda$31$lambda$30$lambda$29(coroutineScope, orderPillData, lazyListState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LadderOffScreenOrderPill(boxScope, orderPillData, fadedOut, zFloatingLadderItems$lambda$27, zFloatingLadderItems$lambda$28, (Function0) objRememberedValue, composerStartRestartGroup, (i3 & 14) | (StringResource.$stable << 3));
                    arrayList2.add(Unit.INSTANCE);
                    arrayList = arrayList2;
                    i2 = i3;
                    z3 = z5;
                    z4 = true;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderKt.FloatingLadderItems$lambda$32(boxScope, z, z2, ladderData, coroutineScope, lazyListState, immutableList, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: Ladder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderKt$FloatingLadderItems$1 */
    static final class C175581 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ boolean $isFloatingLastPriceOnTop;
        final /* synthetic */ FuturesLadderViewState.LadderData $ladderData;
        final /* synthetic */ LazyListState $ladderLazyListState;

        C175581(FuturesLadderViewState.LadderData ladderData, boolean z, CoroutineScope coroutineScope, LazyListState lazyListState) {
            this.$ladderData = ladderData;
            this.$isFloatingLastPriceOnTop = z;
            this.$coroutineScope = coroutineScope;
            this.$ladderLazyListState = lazyListState;
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
                ComposerKt.traceEventStart(-1202633494, i, -1, "com.robinhood.android.futures.trade.ui.ladder.FloatingLadderItems.<anonymous> (Ladder.kt:241)");
            }
            StringResource lastPriceFloatingButtonLabel = this.$ladderData.getLastPriceFloatingButtonLabel();
            boolean z = this.$isFloatingLastPriceOnTop;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$coroutineScope) | composer.changed(this.$ladderLazyListState) | composer.changedInstance(this.$ladderData);
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final LazyListState lazyListState = this.$ladderLazyListState;
            final FuturesLadderViewState.LadderData ladderData = this.$ladderData;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$FloatingLadderItems$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LadderKt.C175581.invoke$lambda$1$lambda$0(coroutineScope, lazyListState, ladderData);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LadderKt.FloatingLastPrice(lastPriceFloatingButtonLabel, z, ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), composer, StringResource.$stable, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, LazyListState lazyListState, FuturesLadderViewState.LadderData ladderData) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LadderKt$FloatingLadderItems$1$1$1$1(lazyListState, ladderData, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingLadderItems$lambda$31$lambda$30$lambda$29(CoroutineScope coroutineScope, OrderPillData orderPillData, LazyListState lazyListState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LadderKt$FloatingLadderItems$3$1$1$1(orderPillData, lazyListState, null), 3, null);
        return Unit.INSTANCE;
    }

    private static final void LadderOffScreenOrderPill(final BoxScope boxScope, final OrderPillData orderPillData, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        boolean z4;
        boolean z5;
        Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(164711684);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(orderPillData) : composerStartRestartGroup.changedInstance(orderPillData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            z5 = z3;
            i2 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
        } else {
            z5 = z3;
        }
        if ((196608 & i) == 0) {
            function02 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
        } else {
            function02 = function0;
        }
        int i3 = i2;
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(164711684, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderOffScreenOrderPill (Ladder.kt:297)");
            }
            composerStartRestartGroup.startMovableGroup(-625853306, orderPillData.getSide());
            final boolean z6 = z4;
            final boolean z7 = z5;
            final Function0<Unit> function03 = function02;
            AnimatedVisibilityKt.AnimatedVisibility(z, boxScope.align(Modifier.INSTANCE, orderPillData.getAlignment()), LadderAnimations.getLadderFadeInAnimation(), LadderAnimations.getLadderFadeOutAnimation(), (String) null, ComposableLambda3.rememberComposableLambda(-334014177, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt.LadderOffScreenOrderPill.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-334014177, i4, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderOffScreenOrderPill.<anonymous>.<anonymous> (Ladder.kt:306)");
                    }
                    FuturesOrderSide side = orderPillData.getSide();
                    StringResource label = orderPillData.getLabel();
                    StringResource bottomLabel = orderPillData.getBottomLabel();
                    Alignment alignment = orderPillData.getAlignment();
                    ServerToBentoAssetMapper2 icon = orderPillData.getIcon();
                    composer2.startReplaceGroup(1134940790);
                    composer2.startReplaceGroup(1134935471);
                    Modifier modifierM5146paddingqDBjuR0$default = Modifier.INSTANCE;
                    Intrinsics.checkNotNull(modifierM5146paddingqDBjuR0$default, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                    boolean z8 = false;
                    if (z6 && orderPillData.isOnTop()) {
                        modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM5146paddingqDBjuR0$default, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    }
                    Modifier modifierM5146paddingqDBjuR0$default2 = modifierM5146paddingqDBjuR0$default;
                    composer2.endReplaceGroup();
                    if (z7 && !orderPillData.isOnTop()) {
                        z8 = true;
                    }
                    if (z8) {
                        modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierM5146paddingqDBjuR0$default2, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null);
                    }
                    composer2.endReplaceGroup();
                    BoxScope boxScope2 = boxScope;
                    Function0<Unit> function04 = function03;
                    int i5 = StringResource.$stable;
                    PendingOrderPillKt.PendingOrderPill(boxScope2, side, label, bottomLabel, modifierM5146paddingqDBjuR0$default2, function04, alignment, icon, false, false, composer2, (i5 << 6) | (i5 << 9), 384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 200064, 16);
            composerStartRestartGroup.endMovableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderKt.LadderOffScreenOrderPill$lambda$33(boxScope, orderPillData, z, z2, z3, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void FloatingHeaderAnimatedVisibilityContent(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-37656495);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-37656495, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.FloatingHeaderAnimatedVisibilityContent (Ladder.kt:329)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                MutableTransitionState mutableTransitionState = new MutableTransitionState(Boolean.FALSE);
                mutableTransitionState.setTargetState(Boolean.TRUE);
                composerStartRestartGroup.updateRememberedValue(mutableTransitionState);
                obj = mutableTransitionState;
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedVisibilityKt.AnimatedVisibility((MutableTransitionState<Boolean>) obj, modifier2, LadderAnimations.getLadderFadeInAnimation(), LadderAnimations.getLadderFadeOutAnimation(), (String) null, ComposableLambda3.rememberComposableLambda(-404692359, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt.FloatingHeaderAnimatedVisibilityContent.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-404692359, i5, -1, "com.robinhood.android.futures.trade.ui.ladder.FloatingHeaderAnimatedVisibilityContent.<anonymous> (Ladder.kt:343)");
                    }
                    function2.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064 | MutableTransitionState.$stable | ((i3 << 3) & 112), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LadderKt.FloatingHeaderAnimatedVisibilityContent$lambda$36(modifier, function2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FloatingLastPrice(final StringResource stringResource, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1596417973);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1596417973, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.FloatingLastPrice (Ladder.kt:505)");
                }
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(!z ? ServerToBentoAssetMapper2.ARROW_UP_12 : ServerToBentoAssetMapper2.ARROW_DOWN_12), null, bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 56);
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(StringResources4.getText(stringResource, composerStartRestartGroup, (i3 & 14) | StringResource.$stable), PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LadderKt.FloatingLastPrice$lambda$38(stringResource, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(center2, centerVertically2, composerStartRestartGroup, 54);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(!z ? ServerToBentoAssetMapper2.ARROW_UP_12 : ServerToBentoAssetMapper2.ARROW_DOWN_12), null, bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 56);
                Modifier modifier52 = modifier4;
                BentoText2.m20747BentoText38GnDrw(StringResources4.getText(stringResource, composerStartRestartGroup, (i3 & 14) | StringResource.$stable), PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}

package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BracketState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002"}, m3636d2 = {"rememberBracketState", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketState;", "initialRoundIndex", "", "bracketNavigationState", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;", "verticalScrollState", "Landroidx/compose/foundation/ScrollState;", "horizontalPagerState", "Landroidx/compose/foundation/pager/PagerState;", "bracketStateCallbacks", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketStateCallbacks;", "(ILcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/pager/PagerState;Lcom/robinhood/android/futures/eventbrackets/ui/BracketStateCallbacks;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/android/futures/eventbrackets/ui/BracketState;", "feature-event-brackets_externalDebug", "latestScrolledToInitialIndexForBracket"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BracketState8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer rememberBracketState$lambda$4(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb A[PHI: r4
      0x00fb: PHI (r4v16 int) = (r4v14 int), (r4v17 int) binds: [B:52:0x00f9, B:48:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final BracketState rememberBracketState(int i, final BracketNavigationInfo3 bracketNavigationState, ScrollState scrollState, PagerState pagerState, BracketState7 bracketStateCallbacks, Composer composer, int i2, int i3) {
        PagerState pagerStateRememberPagerState;
        int i4;
        boolean z;
        boolean z2;
        Object bracketState9;
        ScrollState scrollState2;
        SnapshotState4 snapshotState4;
        PagerState pagerState2;
        Object objRememberedValue;
        Intrinsics.checkNotNullParameter(bracketNavigationState, "bracketNavigationState");
        Intrinsics.checkNotNullParameter(bracketStateCallbacks, "bracketStateCallbacks");
        composer.startReplaceGroup(838805178);
        boolean z3 = true;
        ScrollState scrollStateRememberScrollState = (i3 & 4) != 0 ? ScrollKt.rememberScrollState(0, composer, 0, 1) : scrollState;
        if ((i3 & 8) != 0) {
            composer.startReplaceGroup(5004770);
            boolean z4 = (((i2 & 112) ^ 48) > 32 && composer.changed(bracketNavigationState)) || (i2 & 48) == 32;
            Object objRememberedValue2 = composer.rememberedValue();
            if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketStateKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(bracketNavigationState.getNumberOfRounds());
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue2, composer, 0, 3);
        } else {
            pagerStateRememberPagerState = pagerState;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(838805178, i2, -1, "com.robinhood.android.futures.eventbrackets.ui.rememberBracketState (BracketState.kt:187)");
        }
        SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(bracketStateCallbacks, composer, (i2 >> 12) & 14);
        Object[] objArr = new Object[0];
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketStateKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BracketState8.rememberBracketState$lambda$3$lambda$2();
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue3, composer, 3072, 6);
        composer.startReplaceGroup(-1224400529);
        int i5 = (i2 & 112) ^ 48;
        boolean zChanged = composer.changed(snapshotState) | ((i5 > 32 && composer.changed(bracketNavigationState)) || (i2 & 48) == 32) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(pagerStateRememberPagerState)) || (i2 & 3072) == 2048);
        if (((i2 & 14) ^ 6) > 4) {
            i4 = i;
            if (composer.changed(i4)) {
                z = true;
            }
            z2 = zChanged | z | ((((i2 & 896) ^ 384) <= 256 && composer.changed(scrollStateRememberScrollState)) || (i2 & 384) == 256);
            Object objRememberedValue4 = composer.rememberedValue();
            if (!z2 || objRememberedValue4 == companion.getEmpty()) {
                scrollState2 = scrollStateRememberScrollState;
                snapshotState4 = snapshotState4RememberUpdatedState;
                pagerState2 = pagerStateRememberPagerState;
                bracketState9 = new BracketState9(bracketNavigationState, snapshotState, pagerState2, i4, scrollState2, null);
                composer.updateRememberedValue(bracketState9);
            } else {
                ScrollState scrollState3 = scrollStateRememberScrollState;
                snapshotState4 = snapshotState4RememberUpdatedState;
                bracketState9 = objRememberedValue4;
                scrollState2 = scrollState3;
                pagerState2 = pagerStateRememberPagerState;
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(bracketNavigationState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) bracketState9, composer, (i2 >> 3) & 14);
            composer.startReplaceGroup(5004770);
            if ((i5 > 32 || !composer.changed(bracketNavigationState)) && (i2 & 48) != 32) {
            }
            objRememberedValue = composer.rememberedValue();
            if (!z3 || objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new BracketState(pagerState2, scrollState2, bracketNavigationState, snapshotState4);
                composer.updateRememberedValue(objRememberedValue);
            }
            BracketState bracketState = (BracketState) objRememberedValue;
            composer.endReplaceGroup();
            bracketState.SubscribeToScrollChanges(composer, 0);
            bracketState.SubscribeToLocationRequest(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return bracketState;
        }
        i4 = i;
        if ((i2 & 6) != 4) {
            z = false;
        }
        z2 = zChanged | z | ((((i2 & 896) ^ 384) <= 256 && composer.changed(scrollStateRememberScrollState)) || (i2 & 384) == 256);
        Object objRememberedValue42 = composer.rememberedValue();
        if (z2) {
            scrollState2 = scrollStateRememberScrollState;
            snapshotState4 = snapshotState4RememberUpdatedState;
            pagerState2 = pagerStateRememberPagerState;
            bracketState9 = new BracketState9(bracketNavigationState, snapshotState, pagerState2, i4, scrollState2, null);
            composer.updateRememberedValue(bracketState9);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(bracketNavigationState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) bracketState9, composer, (i2 >> 3) & 14);
        composer.startReplaceGroup(5004770);
        z3 = i5 > 32 ? false : false;
        objRememberedValue = composer.rememberedValue();
        if (!z3) {
            objRememberedValue = new BracketState(pagerState2, scrollState2, bracketNavigationState, snapshotState4);
            composer.updateRememberedValue(objRememberedValue);
        }
        BracketState bracketState2 = (BracketState) objRememberedValue;
        composer.endReplaceGroup();
        bracketState2.SubscribeToScrollChanges(composer, 0);
        bracketState2.SubscribeToLocationRequest(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        return bracketState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState rememberBracketState$lambda$3$lambda$2() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }
}

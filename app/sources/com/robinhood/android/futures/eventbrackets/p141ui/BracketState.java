package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.pager.PageInfo;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.util.MathHelpers;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BracketState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u00106\u001a\u000207H\u0007¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000207H\u0007¢\u0006\u0004\b;\u00109J\r\u0010<\u001a\u00020=H\u0007¢\u0006\u0002\u0010>J\r\u0010?\u001a\u00020=H\u0007¢\u0006\u0002\u0010>R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR+\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010$R\u001b\u0010'\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0015\u001a\u0004\b(\u0010\u001eR\u001b\u0010*\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0015\u001a\u0004\b+\u0010\u001eR\u001b\u0010-\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0015\u001a\u0004\b.\u0010\u001eR\u001b\u00100\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0015\u001a\u0004\b1\u0010\u001eR\u001b\u00103\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0015\u001a\u0004\b4\u0010\u001e¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/BracketState;", "", "horizontalPagerState", "Landroidx/compose/foundation/pager/PagerState;", "verticalScrollState", "Landroidx/compose/foundation/ScrollState;", "navigationState", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;", "callbacksState", "Landroidx/compose/runtime/State;", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketStateCallbacks;", "<init>", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/ScrollState;Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;Landroidx/compose/runtime/State;)V", "getHorizontalPagerState", "()Landroidx/compose/foundation/pager/PagerState;", "getVerticalScrollState", "()Landroidx/compose/foundation/ScrollState;", "callbacks", "getCallbacks", "()Lcom/robinhood/android/futures/eventbrackets/ui/BracketStateCallbacks;", "callbacks$delegate", "Landroidx/compose/runtime/State;", "firstVisibleHorizontalIndexOffsetInPercentage", "", "getFirstVisibleHorizontalIndexOffsetInPercentage", "()F", "firstVisibleHorizontalIndexOffsetInPercentage$delegate", "firstVisiblePage", "", "getFirstVisiblePage", "()I", "firstVisiblePage$delegate", "<set-?>", "latestVerticalScrollYPercentage", "getLatestVerticalScrollYPercentage", "setLatestVerticalScrollYPercentage", "(F)V", "latestVerticalScrollYPercentage$delegate", "Landroidx/compose/runtime/MutableFloatState;", "currentFirstVisibleRoundHeight", "getCurrentFirstVisibleRoundHeight", "currentFirstVisibleRoundHeight$delegate", "currentSecondVisibleRoundCardHeightWithoutSpacers", "getCurrentSecondVisibleRoundCardHeightWithoutSpacers", "currentSecondVisibleRoundCardHeightWithoutSpacers$delegate", "maxHeight", "getMaxHeight", "maxHeight$delegate", "extraEndPaddingPx", "getExtraEndPaddingPx", "extraEndPaddingPx$delegate", "extraTopPaddingPx", "getExtraTopPaddingPx", "extraTopPaddingPx$delegate", "extraEndPadding", "Landroidx/compose/ui/unit/Dp;", "extraEndPadding-chRvn1I", "(Landroidx/compose/runtime/Composer;I)F", "extraTopPadding", "extraTopPadding-chRvn1I", "SubscribeToScrollChanges", "", "(Landroidx/compose/runtime/Composer;I)V", "SubscribeToLocationRequest", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BracketState {
    public static final int $stable = 0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final SnapshotState4 callbacks;

    /* renamed from: currentFirstVisibleRoundHeight$delegate, reason: from kotlin metadata */
    private final SnapshotState4 currentFirstVisibleRoundHeight;

    /* renamed from: currentSecondVisibleRoundCardHeightWithoutSpacers$delegate, reason: from kotlin metadata */
    private final SnapshotState4 currentSecondVisibleRoundCardHeightWithoutSpacers;

    /* renamed from: extraEndPaddingPx$delegate, reason: from kotlin metadata */
    private final SnapshotState4 extraEndPaddingPx;

    /* renamed from: extraTopPaddingPx$delegate, reason: from kotlin metadata */
    private final SnapshotState4 extraTopPaddingPx;

    /* renamed from: firstVisibleHorizontalIndexOffsetInPercentage$delegate, reason: from kotlin metadata */
    private final SnapshotState4 firstVisibleHorizontalIndexOffsetInPercentage;

    /* renamed from: firstVisiblePage$delegate, reason: from kotlin metadata */
    private final SnapshotState4 firstVisiblePage;
    private final PagerState horizontalPagerState;

    /* renamed from: latestVerticalScrollYPercentage$delegate, reason: from kotlin metadata */
    private final SnapshotFloatState2 latestVerticalScrollYPercentage;

    /* renamed from: maxHeight$delegate, reason: from kotlin metadata */
    private final SnapshotState4 maxHeight;
    private final BracketNavigationInfo3 navigationState;
    private final ScrollState verticalScrollState;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubscribeToLocationRequest$lambda$14(BracketState bracketState, int i, Composer composer, int i2) {
        bracketState.SubscribeToLocationRequest(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubscribeToScrollChanges$lambda$12(BracketState bracketState, int i, Composer composer, int i2) {
        bracketState.SubscribeToScrollChanges(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public BracketState(PagerState horizontalPagerState, ScrollState verticalScrollState, BracketNavigationInfo3 navigationState, SnapshotState4<? extends BracketState7> callbacksState) {
        Intrinsics.checkNotNullParameter(horizontalPagerState, "horizontalPagerState");
        Intrinsics.checkNotNullParameter(verticalScrollState, "verticalScrollState");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(callbacksState, "callbacksState");
        this.horizontalPagerState = horizontalPagerState;
        this.verticalScrollState = verticalScrollState;
        this.navigationState = navigationState;
        this.callbacks = callbacksState;
        this.firstVisibleHorizontalIndexOffsetInPercentage = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(BracketState.firstVisibleHorizontalIndexOffsetInPercentage_delegate$lambda$0(this.f$0));
            }
        });
        this.firstVisiblePage = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(BracketState.firstVisiblePage_delegate$lambda$1(this.f$0));
            }
        });
        this.latestVerticalScrollYPercentage = SnapshotFloatState3.mutableFloatStateOf(0.0f);
        this.currentFirstVisibleRoundHeight = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(BracketState.currentFirstVisibleRoundHeight_delegate$lambda$2(this.f$0));
            }
        });
        this.currentSecondVisibleRoundCardHeightWithoutSpacers = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(BracketState.m2022x36e81ff5(this.f$0));
            }
        });
        this.maxHeight = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(BracketState.maxHeight_delegate$lambda$4(this.f$0));
            }
        });
        this.extraEndPaddingPx = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(BracketState.extraEndPaddingPx_delegate$lambda$5(this.f$0));
            }
        });
        this.extraTopPaddingPx = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(BracketState.extraTopPaddingPx_delegate$lambda$6(this.f$0));
            }
        });
    }

    public final PagerState getHorizontalPagerState() {
        return this.horizontalPagerState;
    }

    public final ScrollState getVerticalScrollState() {
        return this.verticalScrollState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BracketState7 getCallbacks() {
        return (BracketState7) this.callbacks.getValue();
    }

    public final float getFirstVisibleHorizontalIndexOffsetInPercentage() {
        return ((Number) this.firstVisibleHorizontalIndexOffsetInPercentage.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float firstVisibleHorizontalIndexOffsetInPercentage_delegate$lambda$0(BracketState bracketState) {
        if (((PageInfo) CollectionsKt.firstOrNull((List) bracketState.horizontalPagerState.getLayoutInfo().getVisiblePagesInfo())) != null) {
            return Math.abs(r0.getOffset() / bracketState.horizontalPagerState.getLayoutInfo().getPageSize());
        }
        return 0.0f;
    }

    public final int getFirstVisiblePage() {
        return ((Number) this.firstVisiblePage.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int firstVisiblePage_delegate$lambda$1(BracketState bracketState) {
        PageInfo pageInfo = (PageInfo) CollectionsKt.firstOrNull((List) bracketState.horizontalPagerState.getLayoutInfo().getVisiblePagesInfo());
        if (pageInfo != null) {
            return pageInfo.getIndex();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getLatestVerticalScrollYPercentage() {
        return this.latestVerticalScrollYPercentage.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLatestVerticalScrollYPercentage(float f) {
        this.latestVerticalScrollYPercentage.setFloatValue(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentFirstVisibleRoundHeight() {
        return ((Number) this.currentFirstVisibleRoundHeight.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int currentFirstVisibleRoundHeight_delegate$lambda$2(BracketState bracketState) {
        return bracketState.getCallbacks().calculateRoundHeightPx(bracketState.getFirstVisiblePage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentSecondVisibleRoundCardHeightWithoutSpacers() {
        return ((Number) this.currentSecondVisibleRoundCardHeightWithoutSpacers.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: currentSecondVisibleRoundCardHeightWithoutSpacers_delegate$lambda$3 */
    public static final int m2022x36e81ff5(BracketState bracketState) {
        return bracketState.getCallbacks().calculateRoundHeightPx(bracketState.getFirstVisiblePage() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMaxHeight() {
        return ((Number) this.maxHeight.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxHeight_delegate$lambda$4(BracketState bracketState) {
        return bracketState.verticalScrollState.getViewportSize();
    }

    private final int getExtraEndPaddingPx() {
        return ((Number) this.extraEndPaddingPx.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int extraEndPaddingPx_delegate$lambda$5(BracketState bracketState) {
        return RangesKt.coerceAtLeast(((int) (bracketState.horizontalPagerState.getLayoutInfo().mo5302getViewportSizeYbymL2g() >> 32)) - bracketState.horizontalPagerState.getLayoutInfo().getPageSize(), 0);
    }

    private final int getExtraTopPaddingPx() {
        return ((Number) this.extraTopPaddingPx.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int extraTopPaddingPx_delegate$lambda$6(BracketState bracketState) {
        return MathHelpers.lerp(RangesKt.coerceAtLeast(bracketState.getMaxHeight() - bracketState.getCurrentFirstVisibleRoundHeight(), 0) / 2, RangesKt.coerceAtLeast(bracketState.getMaxHeight() - bracketState.getCurrentSecondVisibleRoundCardHeightWithoutSpacers(), 0) / 2, bracketState.getFirstVisibleHorizontalIndexOffsetInPercentage());
    }

    /* renamed from: extraEndPadding-chRvn1I, reason: not valid java name */
    public final float m14642extraEndPaddingchRvn1I(Composer composer, int i) {
        composer.startReplaceGroup(-1544566795);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1544566795, i, -1, "com.robinhood.android.futures.eventbrackets.ui.BracketState.extraEndPadding (BracketState.kt:89)");
        }
        float fMo5013toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(getExtraEndPaddingPx());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fMo5013toDpu2uoSUM;
    }

    /* renamed from: extraTopPadding-chRvn1I, reason: not valid java name */
    public final float m14643extraTopPaddingchRvn1I(Composer composer, int i) {
        composer.startReplaceGroup(722928879);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(722928879, i, -1, "com.robinhood.android.futures.eventbrackets.ui.BracketState.extraTopPadding (BracketState.kt:94)");
        }
        float fMo5013toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(getExtraTopPaddingPx());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fMo5013toDpu2uoSUM;
    }

    public final void SubscribeToScrollChanges(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-666538186);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-666538186, i2, -1, "com.robinhood.android.futures.eventbrackets.ui.BracketState.SubscribeToScrollChanges (BracketState.kt:100)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new BracketState3(this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(this, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i3);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = i3 == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new BracketState4(this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(this, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i3);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z3 = i3 == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new BracketState5(this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(this, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BracketState.SubscribeToScrollChanges$lambda$12(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void SubscribeToLocationRequest(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1845575662);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1845575662, i2, -1, "com.robinhood.android.futures.eventbrackets.ui.BracketState.SubscribeToLocationRequest (BracketState.kt:156)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new BracketState2(this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(this, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketState$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BracketState.SubscribeToLocationRequest$lambda$14(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

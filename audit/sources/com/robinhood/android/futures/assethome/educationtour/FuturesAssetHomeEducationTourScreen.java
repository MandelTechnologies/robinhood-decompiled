package com.robinhood.android.futures.assethome.educationtour;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.assethomes.shared.AssetHistoryPreviewSection;
import com.robinhood.android.assethomes.shared.AssetHistoryPreviewSection2;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList2;
import com.robinhood.android.educationtour.ComposeEducationTourScreen;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.educationtour.compose.LocalEducationTourScreen;
import com.robinhood.android.futures.assethome.FuturesAssetHomeViewState;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.models.api.BrokerageAccountType;
import futures_asset_home.proto.p462v1.SectionTypeDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesAssetHomeEducationTourScreen.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u001a?\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a>\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0081@¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0015\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/FuturesAssetHomeViewState;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Lkotlinx/coroutines/CoroutineScope;", "composeScope", "Lkotlin/Function1;", "", "content", "FuturesAssetHomeEducationTourScreen", "(Lcom/robinhood/android/futures/assethome/FuturesAssetHomeViewState;Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlinx/collections/immutable/ImmutableList;", "Lfutures_asset_home/proto/v1/SectionTypeDto;", "assetHomeOrder", "", "pendingFuturesCount", "historyCount", "", "elementId", "onFocusAutoScroll", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/collections/immutable/ImmutableList;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startOfPositions", "(Lkotlinx/collections/immutable/ImmutableList;II)I", "NonFirstItemScrollOffset", "I", "feature-futures-asset-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.assethome.educationtour.FuturesAssetHomeEducationTourScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesAssetHomeEducationTourScreen {
    private static final int NonFirstItemScrollOffset = -256;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeEducationTourScreen$lambda$0(FuturesAssetHomeViewState futuresAssetHomeViewState, LazyListState lazyListState, CoroutineScope coroutineScope, Function3 function3, int i, int i2, Composer composer, int i3) {
        FuturesAssetHomeEducationTourScreen(futuresAssetHomeViewState, lazyListState, coroutineScope, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeEducationTourScreen$lambda$3(FuturesAssetHomeViewState futuresAssetHomeViewState, LazyListState lazyListState, CoroutineScope coroutineScope, Function3 function3, int i, int i2, Composer composer, int i3) {
        FuturesAssetHomeEducationTourScreen(futuresAssetHomeViewState, lazyListState, coroutineScope, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesAssetHomeEducationTourScreen(final FuturesAssetHomeViewState state, LazyListState lazyListState, CoroutineScope coroutineScope, final Function3<? super LazyListState, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        LazyListState lazyListStateRememberLazyListState;
        CoroutineScope coroutineScope2;
        final Function3<? super LazyListState, ? super Composer, ? super Integer, Unit> function3;
        final LazyListState lazyListState2;
        final CoroutineScope coroutineScope3;
        final CoroutineScope coroutineScope4;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-908903641);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListStateRememberLazyListState = lazyListState;
                int i4 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 32 : 16;
                i3 |= i4;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i3 |= i4;
        } else {
            lazyListStateRememberLazyListState = lazyListState;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                coroutineScope2 = coroutineScope;
                int i5 = composerStartRestartGroup.changedInstance(coroutineScope2) ? 256 : 128;
                i3 |= i5;
            } else {
                coroutineScope2 = coroutineScope;
            }
            i3 |= i5;
        } else {
            coroutineScope2 = coroutineScope;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    coroutineScope2 = (CoroutineScope) objRememberedValue;
                    i3 &= -897;
                }
                int i6 = i3;
                final LazyListState lazyListState3 = lazyListStateRememberLazyListState;
                final CoroutineScope coroutineScope5 = coroutineScope2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-908903641, i6, -1, "com.robinhood.android.futures.assethome.educationtour.FuturesAssetHomeEducationTourScreen (FuturesAssetHomeEducationTourScreen.kt:33)");
                }
                composerStartRestartGroup.startReplaceGroup(-1578022627);
                if (state.getAccountNumber() != null) {
                    content.invoke(lazyListState3, composerStartRestartGroup, Integer.valueOf(((i6 >> 3) & 14) | ((i6 >> 6) & 112)));
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.educationtour.FuturesAssetHomeEducationTourScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return FuturesAssetHomeEducationTourScreen.FuturesAssetHomeEducationTourScreen$lambda$0(state, lazyListState3, coroutineScope5, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function3 = content;
                composerStartRestartGroup.endReplaceGroup();
                final int iObservePositionsListItemCount = ReorderablePositionsList2.observePositionsListItemCount(state.getAccountNumber(), PositionInstrumentType.FUTURES_PENDING, PositionsLocation.ASSET_HOME, 0, 0, null, null, null, composerStartRestartGroup, 432, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                final int iObserveAssetHistoryPreviewItemCount = AssetHistoryPreviewSection.observeAssetHistoryPreviewItemCount(state.getAccountNumber(), BrokerageAccountType.INDIVIDUAL, AssetHistoryPreviewSection2.FUTURES, null, composerStartRestartGroup, 432, 8);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope5) | ((((i6 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(lazyListState3)) || (i6 & 48) == 32) | composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changed(iObservePositionsListItemCount) | composerStartRestartGroup.changed(iObserveAssetHistoryPreviewItemCount);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    lazyListState2 = lazyListState3;
                    coroutineScope3 = coroutineScope5;
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.futures.assethome.educationtour.FuturesAssetHomeEducationTourScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FuturesAssetHomeEducationTourScreen.FuturesAssetHomeEducationTourScreen$lambda$2$lambda$1(coroutineScope3, lazyListState2, state, iObservePositionsListItemCount, iObserveAssetHistoryPreviewItemCount, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue2 = function1;
                } else {
                    lazyListState2 = lazyListState3;
                    coroutineScope3 = coroutineScope5;
                }
                composerStartRestartGroup.endReplaceGroup();
                LocalEducationTourScreen.ProvideEducationTourScreens(new ComposeEducationTourScreen[]{new ComposeEducationTourScreen(EducationTourScreenNames.ASSET_HOME_FUTURES, (Function1) objRememberedValue2)}, ComposableLambda3.rememberComposableLambda(167663779, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.educationtour.FuturesAssetHomeEducationTourScreenKt.FuturesAssetHomeEducationTourScreen.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(167663779, i7, -1, "com.robinhood.android.futures.assethome.educationtour.FuturesAssetHomeEducationTourScreen.<anonymous> (FuturesAssetHomeEducationTourScreen.kt:66)");
                        }
                        function3.invoke(lazyListState2, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ComposeEducationTourScreen.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                coroutineScope4 = coroutineScope3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                int i62 = i3;
                final LazyListState lazyListState32 = lazyListStateRememberLazyListState;
                final CoroutineScope coroutineScope52 = coroutineScope2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1578022627);
                if (state.getAccountNumber() != null) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            lazyListState2 = lazyListStateRememberLazyListState;
            function3 = content;
            coroutineScope4 = coroutineScope2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final Function3<? super LazyListState, ? super Composer, ? super Integer, Unit> function32 = function3;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.educationtour.FuturesAssetHomeEducationTourScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesAssetHomeEducationTourScreen.FuturesAssetHomeEducationTourScreen$lambda$3(state, lazyListState2, coroutineScope4, function32, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeEducationTourScreen$lambda$2$lambda$1(CoroutineScope coroutineScope, LazyListState lazyListState, FuturesAssetHomeViewState futuresAssetHomeViewState, int i, int i2, String elementId) {
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FuturesAssetHomeEducationTourScreen2(lazyListState, futuresAssetHomeViewState, i, i2, elementId, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r6.equals(com.robinhood.android.educationtour.EducationTourElementIds.PERFORMANCE_CHART_TITLE) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r6.equals(com.robinhood.android.educationtour.EducationTourElementIds.FUTURES_PERFORMANCE_CHART) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        r3 = r3.indexOf(futures_asset_home.proto.p462v1.SectionTypeDto.SECTION_PERFORMANCE_CHART);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onFocusAutoScroll(LazyListState lazyListState, ImmutableList<? extends SectionTypeDto> immutableList, int i, int i2, String str, Continuation<? super Unit> continuation) {
        int iIndexOf;
        int iHashCode = str.hashCode();
        if (iHashCode != -1639817408) {
            if (iHashCode != -938829022) {
                if (iHashCode == 80384200) {
                }
            } else if (str.equals(EducationTourElementIds.ASSET_HOME_SORT_BUTTON)) {
                iIndexOf = startOfPositions(immutableList, i, i2);
            }
            return Unit.INSTANCE;
        }
        if (iIndexOf == -1) {
            return Unit.INSTANCE;
        }
        Object objAnimateScrollToItem = lazyListState.animateScrollToItem(iIndexOf, iIndexOf != 0 ? -256 : 0, continuation);
        return objAnimateScrollToItem == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem : Unit.INSTANCE;
    }

    private static final int startOfPositions(ImmutableList<? extends SectionTypeDto> immutableList, int i, int i2) {
        int iIndexOf = immutableList.indexOf(SectionTypeDto.SECTION_POSITIONS);
        int iIndexOf2 = immutableList.indexOf(SectionTypeDto.SECTION_PENDING_ORDERS);
        int iIndexOf3 = immutableList.indexOf(SectionTypeDto.SECTION_HISTORY);
        int i3 = (iIndexOf2 == -1 || iIndexOf2 >= iIndexOf) ? iIndexOf : (i - 1) + iIndexOf;
        return (iIndexOf3 == -1 || iIndexOf3 >= iIndexOf) ? i3 : i3 + (i2 - 1);
    }
}

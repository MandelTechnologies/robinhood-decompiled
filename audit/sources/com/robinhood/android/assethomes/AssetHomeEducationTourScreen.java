package com.robinhood.android.assethomes;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.assethomes.shared.AssetHistoryPreviewSection;
import com.robinhood.android.educationtour.ComposeEducationTourScreen;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.educationtour.compose.LocalEducationTourScreen;
import com.robinhood.android.models.portfolio.AssetHomeState;
import com.robinhood.android.models.portfolio.api.AssetHomeStateOrdering;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AssetHomeEducationTourScreen.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aI\u0010\u000b\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aP\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0081@¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\r8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/models/portfolio/AssetHomeState;", "assetHomeState", "Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Lkotlinx/coroutines/CoroutineScope;", "composeScope", "Lkotlin/Function1;", "", "content", "AssetHomeEducationTourScreen", "(Lcom/robinhood/android/models/portfolio/AssetHomeState;Lcom/robinhood/models/api/BrokerageAccountType;Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "pendingEquitiesCount", "equitiesCount", "pendingOptionsCount", "optionsCount", "historyCount", "", "elementId", "onFocusAutoScroll", "(Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/models/portfolio/AssetHomeState;IIIIILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SortButtonOffset", "I", "feature-asset-homes_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.assethomes.AssetHomeEducationTourScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AssetHomeEducationTourScreen {
    public static final int SortButtonOffset = -256;

    /* compiled from: AssetHomeEducationTourScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.assethomes.AssetHomeEducationTourScreenKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AssetType.values().length];
            try {
                iArr[AssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetType.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetType.FUTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AssetHomeStateOrdering.values().length];
            try {
                iArr2[AssetHomeStateOrdering.CHART.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AssetHomeStateOrdering.PNL_HUB_ENTRY_POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AssetHomeStateOrdering.OPTIONS_PORTFOLIO_RISK_ANALYZER_ENTRY_POINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AssetHomeStateOrdering.HOLDINGS_EQUITIES_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AssetHomeStateOrdering.HOLDINGS_EQUITIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AssetHomeStateOrdering.HOLDINGS_OPTIONS_PENDING.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AssetHomeStateOrdering.HOLDINGS_OPTIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AssetHomeStateOrdering.HISTORY.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[AssetHomeStateOrdering.PORTFOLIO_BREAKDOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[AssetHomeStateOrdering.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetHomeEducationTourScreen$lambda$0(AssetHomeState assetHomeState, BrokerageAccountType brokerageAccountType, LazyListState lazyListState, CoroutineScope coroutineScope, Function3 function3, int i, int i2, Composer composer, int i3) {
        AssetHomeEducationTourScreen(assetHomeState, brokerageAccountType, lazyListState, coroutineScope, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetHomeEducationTourScreen$lambda$3(AssetHomeState assetHomeState, BrokerageAccountType brokerageAccountType, LazyListState lazyListState, CoroutineScope coroutineScope, Function3 function3, int i, int i2, Composer composer, int i3) {
        AssetHomeEducationTourScreen(assetHomeState, brokerageAccountType, lazyListState, coroutineScope, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetHomeEducationTourScreen(final AssetHomeState assetHomeState, final BrokerageAccountType brokerageAccountType, LazyListState lazyListState, CoroutineScope coroutineScope, final Function3<? super LazyListState, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        LazyListState lazyListStateRememberLazyListState;
        CoroutineScope coroutineScope2;
        final Function3<? super LazyListState, ? super Composer, ? super Integer, Unit> function3;
        String str;
        Composer composer2;
        boolean z;
        final CoroutineScope coroutineScope3;
        final LazyListState lazyListState2;
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1261060010);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(assetHomeState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                lazyListStateRememberLazyListState = lazyListState;
                int i4 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 256 : 128;
                i3 |= i4;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i3 |= i4;
        } else {
            lazyListStateRememberLazyListState = lazyListState;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                coroutineScope2 = coroutineScope;
                int i5 = composerStartRestartGroup.changedInstance(coroutineScope2) ? 2048 : 1024;
                i3 |= i5;
            } else {
                coroutineScope2 = coroutineScope;
            }
            i3 |= i5;
        } else {
            coroutineScope2 = coroutineScope;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    coroutineScope2 = (CoroutineScope) objRememberedValue;
                    i3 &= -7169;
                }
                final CoroutineScope coroutineScope4 = coroutineScope2;
                int i6 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1261060010, i6, -1, "com.robinhood.android.assethomes.AssetHomeEducationTourScreen (AssetHomeEducationTourScreen.kt:34)");
                }
                if (assetHomeState != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final LazyListState lazyListState3 = lazyListStateRememberLazyListState;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.assethomes.AssetHomeEducationTourScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AssetHomeEducationTourScreen.AssetHomeEducationTourScreen$lambda$0(assetHomeState, brokerageAccountType, lazyListState3, coroutineScope4, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function3 = content;
                final LazyListState lazyListState4 = lazyListStateRememberLazyListState;
                int i7 = i6 & 14;
                final int iObservePendingEquitiesCount = AssetHomePositionListSections.observePendingEquitiesCount(assetHomeState, composerStartRestartGroup, i7);
                final int iObserveEquitiesCount = AssetHomePositionListSections.observeEquitiesCount(assetHomeState, composerStartRestartGroup, i7);
                final int iObservePendingOptionsCount = AssetHomePositionListSections.observePendingOptionsCount(assetHomeState, composerStartRestartGroup, i7);
                final int iObserveOptionsCount = AssetHomePositionListSections.observeOptionsCount(assetHomeState, composerStartRestartGroup, i7);
                final int iObserveAssetHistoryPreviewItemCount = AssetHistoryPreviewSection.observeAssetHistoryPreviewItemCount(assetHomeState.getAccountNumber(), brokerageAccountType, AssetHomeComposable.getAssetHistoryType(assetHomeState), null, composerStartRestartGroup, i6 & 112, 8);
                int i8 = WhenMappings.$EnumSwitchMapping$0[assetHomeState.getAssetType().ordinal()];
                if (i8 == 1) {
                    str = EducationTourScreenNames.ASSET_HOME_EQUITIES;
                } else {
                    if (i8 != 2) {
                        if (i8 == 3) {
                            throw new IllegalStateException("Futures not supported");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    str = EducationTourScreenNames.ASSET_HOME_OPTIONS;
                }
                String str2 = str;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope4) | ((((i6 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(lazyListState4)) || (i6 & 384) == 256) | composerStartRestartGroup.changedInstance(assetHomeState) | composerStartRestartGroup.changed(iObservePendingEquitiesCount) | composerStartRestartGroup.changed(iObserveEquitiesCount) | composerStartRestartGroup.changed(iObservePendingOptionsCount) | composerStartRestartGroup.changed(iObserveOptionsCount) | composerStartRestartGroup.changed(iObserveAssetHistoryPreviewItemCount);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    composer2 = composerStartRestartGroup;
                    z = true;
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.assethomes.AssetHomeEducationTourScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AssetHomeEducationTourScreen.AssetHomeEducationTourScreen$lambda$2$lambda$1(coroutineScope4, lazyListState4, assetHomeState, iObservePendingEquitiesCount, iObserveEquitiesCount, iObservePendingOptionsCount, iObserveOptionsCount, iObserveAssetHistoryPreviewItemCount, (String) obj);
                        }
                    };
                    composer2.updateRememberedValue(function1);
                    objRememberedValue2 = function1;
                } else {
                    composer2 = composerStartRestartGroup;
                    z = true;
                }
                composer2.endReplaceGroup();
                LocalEducationTourScreen.ProvideEducationTourScreens(new ComposeEducationTourScreen[]{new ComposeEducationTourScreen(str2, (Function1) objRememberedValue2)}, ComposableLambda3.rememberComposableLambda(1510920026, z, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeEducationTourScreenKt.AssetHomeEducationTourScreen.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1510920026, i9, -1, "com.robinhood.android.assethomes.AssetHomeEducationTourScreen.<anonymous> (AssetHomeEducationTourScreen.kt:70)");
                        }
                        function3.invoke(lazyListState4, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, ComposeEducationTourScreen.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                coroutineScope3 = coroutineScope4;
                lazyListState2 = lazyListState4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                final CoroutineScope coroutineScope42 = coroutineScope2;
                int i62 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (assetHomeState != null) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            function3 = content;
            lazyListState2 = lazyListStateRememberLazyListState;
            coroutineScope3 = coroutineScope2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final Function3<? super LazyListState, ? super Composer, ? super Integer, Unit> function32 = function3;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.assethomes.AssetHomeEducationTourScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetHomeEducationTourScreen.AssetHomeEducationTourScreen$lambda$3(assetHomeState, brokerageAccountType, lazyListState2, coroutineScope3, function32, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetHomeEducationTourScreen$lambda$2$lambda$1(CoroutineScope coroutineScope, LazyListState lazyListState, AssetHomeState assetHomeState, int i, int i2, int i3, int i4, int i5, String elementId) {
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AssetHomeEducationTourScreen2(lazyListState, assetHomeState, i, i2, i3, i4, i5, elementId, null), 3, null);
        return Unit.INSTANCE;
    }

    private static final int onFocusAutoScroll$toItemCount(AssetHomeStateOrdering assetHomeStateOrdering, int i, int i2, int i3, int i4, int i5) {
        switch (WhenMappings.$EnumSwitchMapping$1[assetHomeStateOrdering.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return i;
            case 5:
                return i2;
            case 6:
                return i3;
            case 7:
                return i4;
            case 8:
                return i5;
            case 9:
            case 10:
                return 0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final Integer onFocusAutoScroll$startIndex(AssetHomeState assetHomeState, int i, int i2, int i3, int i4, int i5, AssetHomeStateOrdering assetHomeStateOrdering) {
        int iOnFocusAutoScroll$toItemCount = 0;
        for (AssetHomeStateOrdering assetHomeStateOrdering2 : assetHomeState.getOrdering()) {
            if (assetHomeStateOrdering2 == assetHomeStateOrdering) {
                return Integer.valueOf(iOnFocusAutoScroll$toItemCount);
            }
            int i6 = i;
            iOnFocusAutoScroll$toItemCount += onFocusAutoScroll$toItemCount(assetHomeStateOrdering2, i6, i2, i3, i4, i5);
            i = i6;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object onFocusAutoScroll(LazyListState lazyListState, AssetHomeState assetHomeState, int i, int i2, int i3, int i4, int i5, String str, Continuation<? super Unit> continuation) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        AssetHomeState assetHomeState2;
        LazyListState lazyListState2;
        Continuation<? super Unit> continuation2;
        AssetHomeStateOrdering assetHomeStateOrdering;
        Object objAnimateScrollToItem;
        Integer numOnFocusAutoScroll$startIndex;
        Object objAnimateScrollToItem$default;
        switch (str.hashCode()) {
            case -1545526349:
                i6 = i5;
                i7 = i4;
                i8 = i3;
                i9 = i2;
                i10 = i;
                assetHomeState2 = assetHomeState;
                lazyListState2 = lazyListState;
                continuation2 = continuation;
                if (str.equals(EducationTourElementIds.EQUITIES_PERFORMANCE_CHART)) {
                    numOnFocusAutoScroll$startIndex = onFocusAutoScroll$startIndex(assetHomeState2, i10, i9, i8, i7, i6, AssetHomeStateOrdering.CHART);
                    if (numOnFocusAutoScroll$startIndex != null && (objAnimateScrollToItem$default = LazyListState.animateScrollToItem$default(lazyListState2, numOnFocusAutoScroll$startIndex.intValue(), 0, continuation2, 2, null)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objAnimateScrollToItem$default;
                    }
                }
                return Unit.INSTANCE;
            case -1124538729:
                if (str.equals(EducationTourElementIds.ASSET_HOME_INVEST_CTA)) {
                    Object objAnimateScrollToItem$default2 = LazyListState.animateScrollToItem$default(lazyListState, 0, 0, continuation, 2, null);
                    return objAnimateScrollToItem$default2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem$default2 : Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case -938829022:
                if (str.equals(EducationTourElementIds.ASSET_HOME_SORT_BUTTON)) {
                    int i11 = WhenMappings.$EnumSwitchMapping$0[assetHomeState.getAssetType().ordinal()];
                    if (i11 == 1) {
                        assetHomeStateOrdering = AssetHomeStateOrdering.HOLDINGS_EQUITIES;
                    } else {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalStateException("Futures not supported");
                        }
                        assetHomeStateOrdering = AssetHomeStateOrdering.HOLDINGS_OPTIONS;
                    }
                    Integer numOnFocusAutoScroll$startIndex2 = onFocusAutoScroll$startIndex(assetHomeState, i, i2, i3, i4, i5, assetHomeStateOrdering);
                    if (numOnFocusAutoScroll$startIndex2 != null && (objAnimateScrollToItem = lazyListState.animateScrollToItem(numOnFocusAutoScroll$startIndex2.intValue(), SortButtonOffset, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objAnimateScrollToItem;
                    }
                }
                return Unit.INSTANCE;
            case 143536974:
                if (str.equals(EducationTourElementIds.OPTIONS_PERFORMANCE_CHART)) {
                    i6 = i5;
                    i7 = i4;
                    i8 = i3;
                    i9 = i2;
                    i10 = i;
                    assetHomeState2 = assetHomeState;
                    lazyListState2 = lazyListState;
                    continuation2 = continuation;
                    numOnFocusAutoScroll$startIndex = onFocusAutoScroll$startIndex(assetHomeState2, i10, i9, i8, i7, i6, AssetHomeStateOrdering.CHART);
                    if (numOnFocusAutoScroll$startIndex != null) {
                        return objAnimateScrollToItem$default;
                    }
                }
                return Unit.INSTANCE;
            default:
                return Unit.INSTANCE;
        }
    }
}

package com.robinhood.android.p273ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRow2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListComposable5;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListSource;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import com.robinhood.shared.portfolio.lists.p391ui.UtilsKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WatchlistScreen.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"WatchlistScreen", "", "accountNumber", "", "modifier", "Landroidx/compose/ui/Modifier;", "enableSwipeToBuy", "", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;II)V", "feature-watchlist-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.ui.WatchlistScreenKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class WatchlistScreen4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WatchlistScreen$lambda$2(String str, Modifier modifier, boolean z, LazyListState lazyListState, int i, int i2, Composer composer, int i3) {
        WatchlistScreen(str, modifier, z, lazyListState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WatchlistScreen(final String str, Modifier modifier, boolean z, LazyListState lazyListState, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        LazyListState lazyListState2;
        int i5;
        LazyListState lazyListStateRememberLazyListState;
        final boolean z3;
        Modifier modifier3;
        final CuratedListState curatedListStateStreamAndRememberCuratedListState;
        boolean zChangedInstance;
        Object objRememberedValue;
        final boolean z4;
        Composer composer2;
        final Modifier modifier4;
        final LazyListState lazyListState3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2013762447);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        lazyListState2 = lazyListState;
                        int i7 = composerStartRestartGroup.changed(lazyListState2) ? 2048 : 1024;
                        i3 |= i7;
                    } else {
                        lazyListState2 = lazyListState;
                    }
                    i3 |= i7;
                } else {
                    lazyListState2 = lazyListState;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 8) == 0) {
                            i5 = i3 & (-7169);
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        } else {
                            i5 = i3;
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        z3 = z2;
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        i5 = i3;
                        lazyListStateRememberLazyListState = lazyListState2;
                        z3 = z2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2013762447, i5, -1, "com.robinhood.android.ui.WatchlistScreen (WatchlistScreen.kt:23)");
                    }
                    int i8 = i5 & 14;
                    curatedListStateStreamAndRememberCuratedListState = UtilsKt.streamAndRememberCuratedListState(str, null, false, CuratedListSource.WATCHLIST_TAB, composerStartRestartGroup, i8 | 3072, 6);
                    PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(curatedListStateStreamAndRememberCuratedListState) | (i8 != 4) | ((i5 & 896) == 256);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.ui.WatchlistScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return WatchlistScreen4.WatchlistScreen$lambda$1$lambda$0(curatedListStateStreamAndRememberCuratedListState, z3, str, (ReorderableLazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z5 = z3;
                    LazyListState lazyListState4 = lazyListStateRememberLazyListState;
                    Modifier modifier6 = modifier3;
                    ReorderableLazyColumnKt.ReorderableLazyColumn(modifier6, lazyListState4, paddingValuesM5139PaddingValuesa9UjIt4$default, false, null, null, null, false, (Function1) objRememberedValue, composerStartRestartGroup, ((i5 >> 3) & 14) | ((i5 >> 6) & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z5;
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier6;
                    lazyListState3 = lazyListState4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    z4 = z2;
                    lazyListState3 = lazyListState2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.ui.WatchlistScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return WatchlistScreen4.WatchlistScreen$lambda$2(str, modifier4, z4, lazyListState3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i3 & 1171) != 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) == 0) {
                    }
                    z3 = z2;
                    modifier3 = modifier5;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i5 & 14;
                    curatedListStateStreamAndRememberCuratedListState = UtilsKt.streamAndRememberCuratedListState(str, null, false, CuratedListSource.WATCHLIST_TAB, composerStartRestartGroup, i82 | 3072, 6);
                    PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default2 = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(curatedListStateStreamAndRememberCuratedListState) | (i82 != 4) | ((i5 & 896) == 256);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.ui.WatchlistScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return WatchlistScreen4.WatchlistScreen$lambda$1$lambda$0(curatedListStateStreamAndRememberCuratedListState, z3, str, (ReorderableLazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z52 = z3;
                        LazyListState lazyListState42 = lazyListStateRememberLazyListState;
                        Modifier modifier62 = modifier3;
                        ReorderableLazyColumnKt.ReorderableLazyColumn(modifier62, lazyListState42, paddingValuesM5139PaddingValuesa9UjIt4$default2, false, null, null, null, false, (Function1) objRememberedValue, composerStartRestartGroup, ((i5 >> 3) & 14) | ((i5 >> 6) & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z4 = z52;
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier62;
                        lazyListState3 = lazyListState42;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WatchlistScreen$lambda$1$lambda$0(CuratedListState curatedListState, boolean z, final String str, ReorderableLazyListScope ReorderableLazyColumn) {
        Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
        CuratedListComposable5.curatedList$default(ReorderableLazyColumn, curatedListState, WatchlistScreen2.INSTANCE.getLambda$229673513$feature_watchlist_tab_externalDebug(), ComposableLambda3.composableLambdaInstance(188394723, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.WatchlistScreenKt$WatchlistScreen$1$1$1
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
                    ComposerKt.traceEventStart(188394723, i, -1, "com.robinhood.android.ui.WatchlistScreen.<anonymous>.<anonymous>.<anonymous> (WatchlistScreen.kt:47)");
                }
                CreateScreenerOrWatchListRow2.CreateScreenerOrWatchlistRow(str, null, composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), z, null, null, 48, null);
        return Unit.INSTANCE;
    }
}

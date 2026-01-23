package com.robinhood.android.redesign.feature.accounttab.util;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AccountSelectorAnalyticsTriggers.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"AccountSelectorScrollAnalytics", "", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "accountTabRowListState", "Landroidx/compose/foundation/lazy/LazyListState;", "accountTabInfo", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "accountsLoading", "", "isProgrammaticallyScrollingTabRow", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/collections/immutable/ImmutableList;ZZLcom/robinhood/analytics/EventLogger;Landroidx/compose/runtime/Composer;I)V", "feature-account-selector_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorAnalyticsTriggersKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AccountSelectorAnalyticsTriggers {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorScrollAnalytics$lambda$1(PagerState pagerState, LazyListState lazyListState, ImmutableList immutableList, boolean z, boolean z2, EventLogger eventLogger, int i, Composer composer, int i2) {
        AccountSelectorScrollAnalytics(pagerState, lazyListState, immutableList, z, z2, eventLogger, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AccountSelectorScrollAnalytics(final PagerState pagerState, final LazyListState accountTabRowListState, final ImmutableList<AccountTabInfo.Account> accountTabInfo, final boolean z, final boolean z2, final EventLogger eventLogger, Composer composer, final int i) {
        int i2;
        boolean z3;
        boolean z4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(accountTabRowListState, "accountTabRowListState");
        Intrinsics.checkNotNullParameter(accountTabInfo, "accountTabInfo");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Composer composerStartRestartGroup = composer.startRestartGroup(1740935998);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(accountTabRowListState) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            z3 = z;
            i2 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        } else {
            z3 = z;
        }
        if ((i & 24576) == 0) {
            z4 = z2;
            i2 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
        } else {
            z4 = z2;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(eventLogger) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((74771 & i3) == 74770 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1740935998, i3, -1, "com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorScrollAnalytics (AccountSelectorAnalyticsTriggers.kt:22)");
            }
            Boolean boolValueOf = Boolean.valueOf(z3);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(eventLogger);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                AccountSelectorAnalyticsTriggers2 accountSelectorAnalyticsTriggers2 = new AccountSelectorAnalyticsTriggers2(pagerState, accountTabRowListState, z4, z, eventLogger, null);
                composerStartRestartGroup.updateRememberedValue(accountSelectorAnalyticsTriggers2);
                objRememberedValue = accountSelectorAnalyticsTriggers2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            EffectsKt.LaunchedEffect(pagerState, accountTabRowListState, boolValueOf, (Function2) objRememberedValue, composer2, (i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i3 >> 3) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorAnalyticsTriggersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectorAnalyticsTriggers.AccountSelectorScrollAnalytics$lambda$1(pagerState, accountTabRowListState, accountTabInfo, z, z2, eventLogger, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

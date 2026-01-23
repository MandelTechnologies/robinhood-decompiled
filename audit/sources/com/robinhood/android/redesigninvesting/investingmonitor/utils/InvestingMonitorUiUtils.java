package com.robinhood.android.redesigninvesting.investingmonitor.utils;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.android.search.contracts.SearchSelector;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.models.p320db.CuratedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestingMonitorUiUtils.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"WATCHLIST_NAME_LENGTH_LIMIT", "", "MAX_WATCHLIST_NAME_ENTRY_LENGTH", "launchAssetAddAction", "", "curatedList", "Lcom/robinhood/models/db/CuratedList;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "feature-investing-monitor_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.utils.InvestingMonitorUiUtilsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InvestingMonitorUiUtils {
    public static final int MAX_WATCHLIST_NAME_ENTRY_LENGTH = 67;
    public static final int WATCHLIST_NAME_LENGTH_LIMIT = 25;

    public static final void launchAssetAddAction(CuratedList curatedList, Navigator navigator, Context context) {
        Intrinsics.checkNotNullParameter(curatedList, "curatedList");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        if (curatedList.isOptionsWatchlist()) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new SearchSelector(new SearchSelectorLaunchMode.Options.Watchlist(null, OptionChainLaunchMode.WatchlistSearch.INSTANCE, false, 5, null), null, null, 6, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
        } else {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new SearchFragmentKey(curatedList.getId(), curatedList.getDisplayName(), null, null, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
    }
}

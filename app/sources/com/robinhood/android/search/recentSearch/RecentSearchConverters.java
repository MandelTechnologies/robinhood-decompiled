package com.robinhood.android.search.recentSearch;

import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.eventcontracts.models.event.api.bonfire.ApiEventContractSearchItem;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.models.futures.api.bonfire.ApiFuturesContractSearchItem;
import com.robinhood.android.models.futures.api.bonfire.ApiFuturesProductSearchItem;
import com.robinhood.android.search.search.SearchItem;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Security;
import com.robinhood.models.p320db.recentSearch.RecentSearch;
import com.robinhood.models.p320db.recentSearch.RecentSearch2;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: RecentSearchConverters.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"toRecentSearch", "Lcom/robinhood/models/db/recentSearch/RecentSearch$RecentSearchResult;", "Lcom/robinhood/models/db/Security;", "Lcom/robinhood/android/search/search/SearchItem$EducationRow;", "Lcom/robinhood/android/search/search/SearchItem$DeeplinkRow;", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "feature-search_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.recentSearch.RecentSearchConvertersKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RecentSearchConverters {
    public static final RecentSearch.RecentSearchResult toRecentSearch(Security security) {
        RecentSearch2 marketIndex;
        Intrinsics.checkNotNullParameter(security, "<this>");
        String string2 = security.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        boolean z = security instanceof ApiFuturesContractSearchItem;
        String recentSearchDisplayName = z ? ((ApiFuturesContractSearchItem) security).getRecentSearchDisplayName() : security.getDisplayName();
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        if (security instanceof Instrument) {
            marketIndex = new RecentSearch2.Instrument(((Instrument) security).getId());
        } else if (security instanceof UiCurrencyPair) {
            marketIndex = new RecentSearch2.Crypto(((UiCurrencyPair) security).getId());
        } else if (z) {
            marketIndex = new RecentSearch2.FuturesContract(((ApiFuturesContractSearchItem) security).getId());
        } else if (security instanceof ApiFuturesProductSearchItem) {
            marketIndex = new RecentSearch2.FuturesProduct(((ApiFuturesProductSearchItem) security).getId());
        } else if (security instanceof ApiEventContractSearchItem) {
            marketIndex = new RecentSearch2.EventContract(((ApiEventContractSearchItem) security).getId());
        } else if (security instanceof Index) {
            marketIndex = new RecentSearch2.MarketIndex(((Index) security).getId());
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("Unrecognized recent search security: " + security), false, null, 6, null);
            marketIndex = RecentSearch2.Unknown.INSTANCE;
        }
        return new RecentSearch.RecentSearchResult(string2, instantNow, marketIndex, recentSearchDisplayName);
    }

    public static final RecentSearch.RecentSearchResult toRecentSearch(SearchItem.EducationRow educationRow) {
        Intrinsics.checkNotNullParameter(educationRow, "<this>");
        String id = educationRow.getId();
        String title = educationRow.getTitle();
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        return new RecentSearch.RecentSearchResult(id, instantNow, new RecentSearch2.Education(educationRow.getUri()), title);
    }

    public static final RecentSearch.RecentSearchResult toRecentSearch(SearchItem.DeeplinkRow deeplinkRow) {
        Intrinsics.checkNotNullParameter(deeplinkRow, "<this>");
        String string2 = deeplinkRow.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String title = deeplinkRow.getTitle();
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        return new RecentSearch.RecentSearchResult(string2, instantNow, new RecentSearch2.Deeplink(deeplinkRow.getUri()), title);
    }

    public static final RecentSearch.RecentSearchResult toRecentSearch(CuratedListChipItem curatedListChipItem) {
        Intrinsics.checkNotNullParameter(curatedListChipItem, "<this>");
        String string2 = curatedListChipItem.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String displayName = curatedListChipItem.getDisplayName();
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        return new RecentSearch.RecentSearchResult(string2, instantNow, new RecentSearch2.CuratedListChipItem(curatedListChipItem.getId()), displayName);
    }
}

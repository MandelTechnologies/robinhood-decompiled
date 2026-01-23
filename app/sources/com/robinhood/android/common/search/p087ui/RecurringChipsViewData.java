package com.robinhood.android.common.search.p087ui;

import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.common.search.SearchItem;
import com.robinhood.models.api.ApiCuratedList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringChipsViewData.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0011HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/RecurringChipsViewData;", "", "title", "", "items", "", "Lcom/robinhood/android/common/search/SearchItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "viewModels", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "getViewModels", "chipRowCount", "", "getChipRowCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class RecurringChipsViewData {
    public static final int $stable = 8;
    private final List<SearchItem> items;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringChipsViewData copy$default(RecurringChipsViewData recurringChipsViewData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringChipsViewData.title;
        }
        if ((i & 2) != 0) {
            list = recurringChipsViewData.items;
        }
        return recurringChipsViewData.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<SearchItem> component2() {
        return this.items;
    }

    public final RecurringChipsViewData copy(String title, List<? extends SearchItem> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        return new RecurringChipsViewData(title, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringChipsViewData)) {
            return false;
        }
        RecurringChipsViewData recurringChipsViewData = (RecurringChipsViewData) other;
        return Intrinsics.areEqual(this.title, recurringChipsViewData.title) && Intrinsics.areEqual(this.items, recurringChipsViewData.items);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.items.hashCode();
    }

    public String toString() {
        return "RecurringChipsViewData(title=" + this.title + ", items=" + this.items + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecurringChipsViewData(String title, List<? extends SearchItem> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = title;
        this.items = items;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<SearchItem> getItems() {
        return this.items;
    }

    public final List<CuratedListChipItem> getViewModels() {
        CuratedListChipItem curatedListChipItem;
        List<SearchItem> list = this.items;
        ArrayList arrayList = new ArrayList();
        for (SearchItem searchItem : list) {
            if (searchItem instanceof SearchItem.InstrumentResult) {
                SearchItem.InstrumentResult instrumentResult = (SearchItem.InstrumentResult) searchItem;
                curatedListChipItem = new CuratedListChipItem(instrumentResult.getInstrument().getId(), instrumentResult.getInstrument().getDisplayName(), ApiCuratedList.OwnerType.ROBINHOOD, null, null, null, null, false, false, null, false, 1528, null);
            } else if (searchItem instanceof SearchItem.InstrumentPositionResult) {
                SearchItem.InstrumentPositionResult instrumentPositionResult = (SearchItem.InstrumentPositionResult) searchItem;
                curatedListChipItem = new CuratedListChipItem(instrumentPositionResult.getInstrument().getId(), instrumentPositionResult.getInstrument().getDisplayName(), ApiCuratedList.OwnerType.ROBINHOOD, null, null, null, null, false, false, null, false, 1528, null);
            } else if (searchItem instanceof SearchItem.CryptoResult) {
                SearchItem.CryptoResult cryptoResult = (SearchItem.CryptoResult) searchItem;
                curatedListChipItem = new CuratedListChipItem(cryptoResult.getCurrency().getId(), cryptoResult.getCurrency().getName(), ApiCuratedList.OwnerType.ROBINHOOD, null, null, null, null, false, false, null, false, 1528, null);
            } else if (searchItem instanceof SearchItem.CryptoHoldingResult) {
                SearchItem.CryptoHoldingResult cryptoHoldingResult = (SearchItem.CryptoHoldingResult) searchItem;
                curatedListChipItem = new CuratedListChipItem(cryptoHoldingResult.getCurrency().getId(), cryptoHoldingResult.getCurrency().getName(), ApiCuratedList.OwnerType.ROBINHOOD, null, null, null, null, false, false, null, false, 1528, null);
            } else {
                curatedListChipItem = null;
            }
            if (curatedListChipItem != null) {
                arrayList.add(curatedListChipItem);
            }
        }
        return arrayList;
    }

    public final int getChipRowCount() {
        if (getViewModels().size() < 4) {
            return 1;
        }
        return getViewModels().size() < 7 ? 2 : 3;
    }
}

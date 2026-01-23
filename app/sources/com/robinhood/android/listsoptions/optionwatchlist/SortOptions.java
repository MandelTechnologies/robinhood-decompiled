package com.robinhood.android.listsoptions.optionwatchlist;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.listsoptions.C20943R;
import com.robinhood.android.portfolio.curatedlist.C25624R;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p355ui.SortOption;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SortOptions.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u000f\u001a\u00020\u0010*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"optionWatchlistSortItemTitleRes", "", "Lcom/robinhood/models/api/ApiCuratedList$SortOrder;", "getOptionWatchlistSortItemTitleRes", "(Lcom/robinhood/models/api/ApiCuratedList$SortOrder;)I", "optionWatchlistSortItemSubtitleRes", "getOptionWatchlistSortItemSubtitleRes", "optionWatchlistChipRes", "getOptionWatchlistChipRes", "optionWatchlistSortItemDrawableRes", "getOptionWatchlistSortItemDrawableRes", "optionWatchlistSortDirectionDrawableRes", "Lcom/robinhood/models/api/ApiCuratedList$SortDirection;", "getOptionWatchlistSortDirectionDrawableRes", "(Lcom/robinhood/models/api/ApiCuratedList$SortDirection;)I", "serverValue", "Lcom/robinhood/models/ui/SortOption;", "getServerValue", "(Lcom/robinhood/models/ui/SortOption;)Lcom/robinhood/models/ui/SortOption;", "feature-lists-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.listsoptions.optionwatchlist.SortOptionsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SortOptions {

    /* compiled from: SortOptions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.listsoptions.optionwatchlist.SortOptionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiCuratedList.SortOrder.values().length];
            try {
                iArr[ApiCuratedList.SortOrder.SYMBOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.TOTAL_RETURN_PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.EXPIRATION_DATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiCuratedList.SortDirection.values().length];
            try {
                iArr2[ApiCuratedList.SortDirection.DESCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiCuratedList.SortDirection.ASCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiCuratedList.SortDirection.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int getOptionWatchlistSortItemTitleRes(ApiCuratedList.SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortOrder, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[sortOrder.ordinal()];
        if (i == 1) {
            return C20943R.string.option_watchlist_sort_by_company;
        }
        if (i == 2) {
            return C20943R.string.option_watchlist_sort_by_price;
        }
        if (i == 3) {
            return C20943R.string.option_watchlist_sort_by_total_return_percentage;
        }
        if (i == 4) {
            return C20943R.string.option_watchlist_sort_by_expiration;
        }
        throw new IllegalStateException(("Sort order " + sortOrder.getServerValue() + " is not supported.").toString());
    }

    public static final int getOptionWatchlistSortItemSubtitleRes(ApiCuratedList.SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortOrder, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[sortOrder.ordinal()];
        if (i == 1) {
            return C20943R.string.option_watchlist_sort_by_company_detail;
        }
        if (i == 2) {
            return C20943R.string.option_watchlist_sort_by_price_detail;
        }
        if (i == 3) {
            return C20943R.string.option_watchlist_sort_by_total_return_percentage_detail;
        }
        if (i == 4) {
            return C20943R.string.option_watchlist_sort_by_expiration_detail;
        }
        throw new IllegalStateException(("Sort order " + sortOrder.getServerValue() + " is not supported.").toString());
    }

    public static final int getOptionWatchlistChipRes(ApiCuratedList.SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortOrder, "<this>");
        if (WhenMappings.$EnumSwitchMapping$0[sortOrder.ordinal()] == 5) {
            return C25624R.string.list_item_sort_sort_by;
        }
        return getOptionWatchlistSortItemTitleRes(sortOrder);
    }

    public static final int getOptionWatchlistSortItemDrawableRes(ApiCuratedList.SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortOrder, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[sortOrder.ordinal()];
        if (i == 1) {
            return C20943R.drawable.svg_ic_etf;
        }
        if (i == 2) {
            return C20943R.drawable.svg_ic_dollar;
        }
        if (i == 3) {
            return C20943R.drawable.svg_ic_percentage;
        }
        if (i == 4) {
            return C20943R.drawable.svg_ic_calendar;
        }
        throw new IllegalStateException(("Sort order " + sortOrder.getServerValue() + " is not supported.").toString());
    }

    public static final int getOptionWatchlistSortDirectionDrawableRes(ApiCuratedList.SortDirection sortDirection) {
        Intrinsics.checkNotNullParameter(sortDirection, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[sortDirection.ordinal()];
        if (i == 1) {
            return C20690R.drawable.ic_rds_arrow_down_16dp;
        }
        if (i == 2) {
            return C20690R.drawable.ic_rds_arrow_up_16dp;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C20690R.drawable.empty;
    }

    public static final SortOption getServerValue(SortOption sortOption) {
        Intrinsics.checkNotNullParameter(sortOption, "<this>");
        return sortOption.getSortDirection() == ApiCuratedList.SortDirection.EMPTY ? new SortOption(ApiCuratedList.SortOrder.CUSTOM, ApiCuratedList.SortDirection.ASCENDING) : sortOption;
    }
}

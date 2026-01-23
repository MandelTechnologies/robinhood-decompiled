package com.robinhood.android.common.extensions;

import com.robinhood.android.common.lists.C11222R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.portfolio.curatedlist.C25624R;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p320db.CuratedListViewMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SortOrders.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"displayNameRes", "", "Lcom/robinhood/models/api/ApiCuratedList$SortOrder;", "getDisplayNameRes", "(Lcom/robinhood/models/api/ApiCuratedList$SortOrder;)I", "viewMode", "Lcom/robinhood/models/db/CuratedListViewMode;", "getViewMode", "(Lcom/robinhood/models/api/ApiCuratedList$SortOrder;)Lcom/robinhood/models/db/CuratedListViewMode;", "analyticsString", "", "getAnalyticsString", "(Lcom/robinhood/models/api/ApiCuratedList$SortOrder;)Ljava/lang/String;", "feature-lib-lists_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.extensions.SortOrdersKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class SortOrders {

    /* compiled from: SortOrders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.extensions.SortOrdersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
                iArr[ApiCuratedList.SortOrder.ONE_DAY_PERCENT_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.CREATED_AT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.NAME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.DOLLAR_CHANGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.PERCENT_CHANGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.ONE_DAY_DOLLAR_CHANGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.ONE_DAY_ROLLING_DOLLAR_CHANGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.ONE_DAY_ROLLING_PERCENT_CHANGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.MARKET_CAP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.HELD_POSITIONS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.HELD_MARKET_CAP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.EXPIRATION_DATE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.TOTAL_RETURN_PERCENTAGE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.FUTURES_RANKING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.UNKNOWN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ApiCuratedList.SortOrder.FUTURES_MARGIN_REQUIREMENT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getDisplayNameRes(ApiCuratedList.SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortOrder, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[sortOrder.ordinal()]) {
            case 1:
                return C11222R.string.list_item_sort_symbol;
            case 2:
                return C11222R.string.list_item_sort_price;
            case 3:
                return C11222R.string.list_item_sort_percent_change;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return C25624R.string.list_item_sort_sort_by;
            case 19:
                return C11222R.string.list_item_sort_margin_requirement;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final CuratedListViewMode getViewMode(ApiCuratedList.SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortOrder, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[sortOrder.ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return CuratedListViewMode.LAST_PRICE;
            case 3:
            case 8:
            case 11:
                return CuratedListViewMode.PERCENT_CHANGE;
            case 19:
                return CuratedListViewMode.FUTURES_MARGIN_REQUIREMENT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getAnalyticsString(ApiCuratedList.SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortOrder, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[sortOrder.ordinal()]) {
            case 1:
                return "symbol";
            case 2:
                return AnalyticsStrings.TAG_SORT_ORDER_PRICE;
            case 3:
            case 11:
                return "percent_change";
            case 4:
                return "custom";
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

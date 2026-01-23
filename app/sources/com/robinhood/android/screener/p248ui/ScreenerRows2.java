package com.robinhood.android.screener.p248ui;

import com.robinhood.android.screener.C27836R;
import com.robinhood.android.screener.p248ui.ScreenerRows;
import kotlin.Metadata;

/* compiled from: ScreenerRows.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m3636d2 = {"headerRow", "Lcom/robinhood/android/screener/ui/ScreenerRows$ScreenerHeader;", "defaultScreenerId", "", "expandRow", "Lcom/robinhood/android/screener/ui/ScreenerRows$ToggleTruncatedRow;", "getExpandRow", "()Lcom/robinhood/android/screener/ui/ScreenerRows$ToggleTruncatedRow;", "collapseRow", "getCollapseRow", "feature-lib-screener_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.screener.ui.ScreenerRowsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ScreenerRows2 {
    private static final ScreenerRows.ToggleTruncatedRow expandRow = new ScreenerRows.ToggleTruncatedRow(true, C27836R.string.header_show_more);
    private static final ScreenerRows.ToggleTruncatedRow collapseRow = new ScreenerRows.ToggleTruncatedRow(false, C27836R.string.header_show_less);

    public static final ScreenerRows.ScreenerHeader headerRow(String str) {
        return new ScreenerRows.ScreenerHeader(C27836R.string.header_screeners, C27836R.string.header_screener_create, str);
    }

    public static final ScreenerRows.ToggleTruncatedRow getExpandRow() {
        return expandRow;
    }

    public static final ScreenerRows.ToggleTruncatedRow getCollapseRow() {
        return collapseRow;
    }
}

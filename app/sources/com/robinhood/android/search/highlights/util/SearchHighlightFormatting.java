package com.robinhood.android.search.highlights.util;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.redesign.model.AssetQuote;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchHighlightFormatting.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"percentFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getPercentFormatter", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "formattedPercentChange", "", "Lcom/robinhood/android/redesign/model/AssetQuote;", "getFormattedPercentChange", "(Lcom/robinhood/android/redesign/model/AssetQuote;)Ljava/lang/String;", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.highlights.util.SearchHighlightFormattingKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchHighlightFormatting {
    private static final NumberFormatter percentFormatter = Formats.getNoSignWithHundredthDecimalPercentFormat();

    public static final NumberFormatter getPercentFormatter() {
        return percentFormatter;
    }

    public static final String getFormattedPercentChange(AssetQuote assetQuote) {
        Intrinsics.checkNotNullParameter(assetQuote, "<this>");
        return percentFormatter.format(assetQuote.getPercentChange());
    }
}

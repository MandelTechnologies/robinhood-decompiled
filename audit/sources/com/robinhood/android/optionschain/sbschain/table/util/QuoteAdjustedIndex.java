package com.robinhood.android.optionschain.sbschain.table.util;

import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;

/* compiled from: QuoteAdjustedIndex.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/util/QuoteAdjustedIndex;", "", "rowIndex", "", "getRowIndex", "()I", "quoteIndex", "getQuoteIndex", "()Ljava/lang/Integer;", "rowIndexWithoutQuoteRow", "getRowIndexWithoutQuoteRow", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface QuoteAdjustedIndex {
    Integer getQuoteIndex();

    int getRowIndex();

    Integer getRowIndexWithoutQuoteRow();

    /* compiled from: QuoteAdjustedIndex.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static Integer getRowIndexWithoutQuoteRow(QuoteAdjustedIndex quoteAdjustedIndex) {
            Integer quoteIndex = quoteAdjustedIndex.getQuoteIndex();
            if (quoteIndex == null) {
                return null;
            }
            int iIntValue = quoteIndex.intValue();
            if (quoteAdjustedIndex.getRowIndex() == iIntValue) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("rowIndex " + quoteAdjustedIndex.getRowIndex() + " should not be equal to quote index " + iIntValue), true, null, 4, null);
            }
            if (quoteAdjustedIndex.getRowIndex() > iIntValue) {
                return Integer.valueOf(quoteAdjustedIndex.getRowIndex() - 1);
            }
            return Integer.valueOf(quoteAdjustedIndex.getRowIndex());
        }
    }
}

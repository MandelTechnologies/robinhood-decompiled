package com.robinhood.android.optionschain.sbschain.table.gestures;

import com.robinhood.android.optionschain.sbschain.table.util.QuoteAdjustedIndex;
import com.robinhood.models.p355ui.OptionLegBundle;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DragTarget.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0003J@\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundleWithRowIndex;", "Lcom/robinhood/android/optionschain/sbschain/table/util/QuoteAdjustedIndex;", "legBundle", "Lcom/robinhood/models/ui/OptionLegBundle;", "rowIndex", "", "quoteIndex", "content", "Lkotlin/Lazy;", "", "<init>", "(Lcom/robinhood/models/ui/OptionLegBundle;ILjava/lang/Integer;Lkotlin/Lazy;)V", "getLegBundle", "()Lcom/robinhood/models/ui/OptionLegBundle;", "getRowIndex", "()I", "getQuoteIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContent", "()Lkotlin/Lazy;", "component1", "component2", "component3", "component4", "copy", "(Lcom/robinhood/models/ui/OptionLegBundle;ILjava/lang/Integer;Lkotlin/Lazy;)Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundleWithRowIndex;", "equals", "", "other", "", "hashCode", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionLegBundleWithRowIndex implements QuoteAdjustedIndex {
    public static final int $stable = 8;
    private final Lazy<String> content;
    private final OptionLegBundle legBundle;
    private final Integer quoteIndex;
    private final int rowIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionLegBundleWithRowIndex copy$default(OptionLegBundleWithRowIndex optionLegBundleWithRowIndex, OptionLegBundle optionBundles4, int i, Integer num, Lazy lazy, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            optionBundles4 = optionLegBundleWithRowIndex.legBundle;
        }
        if ((i2 & 2) != 0) {
            i = optionLegBundleWithRowIndex.rowIndex;
        }
        if ((i2 & 4) != 0) {
            num = optionLegBundleWithRowIndex.quoteIndex;
        }
        if ((i2 & 8) != 0) {
            lazy = optionLegBundleWithRowIndex.content;
        }
        return optionLegBundleWithRowIndex.copy(optionBundles4, i, num, lazy);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionLegBundle getLegBundle() {
        return this.legBundle;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRowIndex() {
        return this.rowIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getQuoteIndex() {
        return this.quoteIndex;
    }

    public final Lazy<String> component4() {
        return this.content;
    }

    public final OptionLegBundleWithRowIndex copy(OptionLegBundle legBundle, int rowIndex, Integer quoteIndex, Lazy<String> content) {
        Intrinsics.checkNotNullParameter(legBundle, "legBundle");
        Intrinsics.checkNotNullParameter(content, "content");
        return new OptionLegBundleWithRowIndex(legBundle, rowIndex, quoteIndex, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionLegBundleWithRowIndex)) {
            return false;
        }
        OptionLegBundleWithRowIndex optionLegBundleWithRowIndex = (OptionLegBundleWithRowIndex) other;
        return Intrinsics.areEqual(this.legBundle, optionLegBundleWithRowIndex.legBundle) && this.rowIndex == optionLegBundleWithRowIndex.rowIndex && Intrinsics.areEqual(this.quoteIndex, optionLegBundleWithRowIndex.quoteIndex) && Intrinsics.areEqual(this.content, optionLegBundleWithRowIndex.content);
    }

    public int hashCode() {
        int iHashCode = ((this.legBundle.hashCode() * 31) + Integer.hashCode(this.rowIndex)) * 31;
        Integer num = this.quoteIndex;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "OptionLegBundleWithRowIndex(legBundle=" + this.legBundle + ", rowIndex=" + this.rowIndex + ", quoteIndex=" + this.quoteIndex + ", content=" + this.content + ")";
    }

    public OptionLegBundleWithRowIndex(OptionLegBundle legBundle, int i, Integer num, Lazy<String> content) {
        Intrinsics.checkNotNullParameter(legBundle, "legBundle");
        Intrinsics.checkNotNullParameter(content, "content");
        this.legBundle = legBundle;
        this.rowIndex = i;
        this.quoteIndex = num;
        this.content = content;
    }

    @Override // com.robinhood.android.optionschain.sbschain.table.util.QuoteAdjustedIndex
    public Integer getRowIndexWithoutQuoteRow() {
        return QuoteAdjustedIndex.DefaultImpls.getRowIndexWithoutQuoteRow(this);
    }

    public final OptionLegBundle getLegBundle() {
        return this.legBundle;
    }

    @Override // com.robinhood.android.optionschain.sbschain.table.util.QuoteAdjustedIndex
    public int getRowIndex() {
        return this.rowIndex;
    }

    @Override // com.robinhood.android.optionschain.sbschain.table.util.QuoteAdjustedIndex
    public Integer getQuoteIndex() {
        return this.quoteIndex;
    }

    public final Lazy<String> getContent() {
        return this.content;
    }
}

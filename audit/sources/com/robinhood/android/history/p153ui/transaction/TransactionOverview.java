package com.robinhood.android.history.p153ui.transaction;

import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.utils.p409ui.images.ImageReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionDetailState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/history/ui/transaction/TransactionOverview;", "", "icon", "Lcom/robinhood/utils/ui/images/ImageReference;", "titleText", "", "amountText", "lineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "merchantName", "<init>", "(Lcom/robinhood/utils/ui/images/ImageReference;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/CharSequence;)V", "getIcon", "()Lcom/robinhood/utils/ui/images/ImageReference;", "getTitleText", "()Ljava/lang/CharSequence;", "getAmountText", "getLineItems", "()Ljava/util/List;", "getMerchantName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TransactionOverview {
    public static final int $stable = 8;
    private final CharSequence amountText;
    private final ImageReference icon;
    private final List<TransactionLineItem> lineItems;
    private final CharSequence merchantName;
    private final CharSequence titleText;

    public static /* synthetic */ TransactionOverview copy$default(TransactionOverview transactionOverview, ImageReference imageReference, CharSequence charSequence, CharSequence charSequence2, List list, CharSequence charSequence3, int i, Object obj) {
        if ((i & 1) != 0) {
            imageReference = transactionOverview.icon;
        }
        if ((i & 2) != 0) {
            charSequence = transactionOverview.titleText;
        }
        if ((i & 4) != 0) {
            charSequence2 = transactionOverview.amountText;
        }
        if ((i & 8) != 0) {
            list = transactionOverview.lineItems;
        }
        if ((i & 16) != 0) {
            charSequence3 = transactionOverview.merchantName;
        }
        CharSequence charSequence4 = charSequence3;
        CharSequence charSequence5 = charSequence2;
        return transactionOverview.copy(imageReference, charSequence, charSequence5, list, charSequence4);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageReference getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final CharSequence getTitleText() {
        return this.titleText;
    }

    /* renamed from: component3, reason: from getter */
    public final CharSequence getAmountText() {
        return this.amountText;
    }

    public final List<TransactionLineItem> component4() {
        return this.lineItems;
    }

    /* renamed from: component5, reason: from getter */
    public final CharSequence getMerchantName() {
        return this.merchantName;
    }

    public final TransactionOverview copy(ImageReference icon, CharSequence titleText, CharSequence amountText, List<TransactionLineItem> lineItems, CharSequence merchantName) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        return new TransactionOverview(icon, titleText, amountText, lineItems, merchantName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionOverview)) {
            return false;
        }
        TransactionOverview transactionOverview = (TransactionOverview) other;
        return Intrinsics.areEqual(this.icon, transactionOverview.icon) && Intrinsics.areEqual(this.titleText, transactionOverview.titleText) && Intrinsics.areEqual(this.amountText, transactionOverview.amountText) && Intrinsics.areEqual(this.lineItems, transactionOverview.lineItems) && Intrinsics.areEqual(this.merchantName, transactionOverview.merchantName);
    }

    public int hashCode() {
        int iHashCode = ((((((this.icon.hashCode() * 31) + this.titleText.hashCode()) * 31) + this.amountText.hashCode()) * 31) + this.lineItems.hashCode()) * 31;
        CharSequence charSequence = this.merchantName;
        return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public String toString() {
        ImageReference imageReference = this.icon;
        CharSequence charSequence = this.titleText;
        CharSequence charSequence2 = this.amountText;
        return "TransactionOverview(icon=" + imageReference + ", titleText=" + ((Object) charSequence) + ", amountText=" + ((Object) charSequence2) + ", lineItems=" + this.lineItems + ", merchantName=" + ((Object) this.merchantName) + ")";
    }

    public TransactionOverview(ImageReference icon, CharSequence titleText, CharSequence amountText, List<TransactionLineItem> lineItems, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        this.icon = icon;
        this.titleText = titleText;
        this.amountText = amountText;
        this.lineItems = lineItems;
        this.merchantName = charSequence;
    }

    public /* synthetic */ TransactionOverview(ImageReference imageReference, CharSequence charSequence, CharSequence charSequence2, List list, CharSequence charSequence3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageReference, charSequence, charSequence2, list, (i & 16) != 0 ? null : charSequence3);
    }

    public final ImageReference getIcon() {
        return this.icon;
    }

    public final CharSequence getTitleText() {
        return this.titleText;
    }

    public final CharSequence getAmountText() {
        return this.amountText;
    }

    public final List<TransactionLineItem> getLineItems() {
        return this.lineItems;
    }

    public final CharSequence getMerchantName() {
        return this.merchantName;
    }
}

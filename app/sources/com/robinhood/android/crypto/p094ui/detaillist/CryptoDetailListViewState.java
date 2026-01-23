package com.robinhood.android.crypto.p094ui.detaillist;

import com.robinhood.android.crypto.p094ui.detaillist.CryptoDetailListAdapter;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailListViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J@\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListViewState;", "", "viewPagerListItems", "", "Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListAdapter$Item;", "currentCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "pagePosition", "", "detailListBottomPadding", "<init>", "(Ljava/util/List;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/lang/Integer;I)V", "getViewPagerListItems", "()Ljava/util/List;", "getCurrentCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getPagePosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDetailListBottomPadding", "()I", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/lang/Integer;I)Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListViewState;", "equals", "", "other", "hashCode", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoDetailListViewState {
    public static final int $stable = 8;
    private final UiCurrencyPair currentCurrencyPair;
    private final int detailListBottomPadding;
    private final Integer pagePosition;
    private final List<CryptoDetailListAdapter.Item> viewPagerListItems;

    public CryptoDetailListViewState() {
        this(null, null, null, 0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoDetailListViewState copy$default(CryptoDetailListViewState cryptoDetailListViewState, List list, UiCurrencyPair uiCurrencyPair, Integer num, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = cryptoDetailListViewState.viewPagerListItems;
        }
        if ((i2 & 2) != 0) {
            uiCurrencyPair = cryptoDetailListViewState.currentCurrencyPair;
        }
        if ((i2 & 4) != 0) {
            num = cryptoDetailListViewState.pagePosition;
        }
        if ((i2 & 8) != 0) {
            i = cryptoDetailListViewState.detailListBottomPadding;
        }
        return cryptoDetailListViewState.copy(list, uiCurrencyPair, num, i);
    }

    public final List<CryptoDetailListAdapter.Item> component1() {
        return this.viewPagerListItems;
    }

    /* renamed from: component2, reason: from getter */
    public final UiCurrencyPair getCurrentCurrencyPair() {
        return this.currentCurrencyPair;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getPagePosition() {
        return this.pagePosition;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDetailListBottomPadding() {
        return this.detailListBottomPadding;
    }

    public final CryptoDetailListViewState copy(List<CryptoDetailListAdapter.Item> viewPagerListItems, UiCurrencyPair currentCurrencyPair, Integer pagePosition, int detailListBottomPadding) {
        Intrinsics.checkNotNullParameter(viewPagerListItems, "viewPagerListItems");
        return new CryptoDetailListViewState(viewPagerListItems, currentCurrencyPair, pagePosition, detailListBottomPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDetailListViewState)) {
            return false;
        }
        CryptoDetailListViewState cryptoDetailListViewState = (CryptoDetailListViewState) other;
        return Intrinsics.areEqual(this.viewPagerListItems, cryptoDetailListViewState.viewPagerListItems) && Intrinsics.areEqual(this.currentCurrencyPair, cryptoDetailListViewState.currentCurrencyPair) && Intrinsics.areEqual(this.pagePosition, cryptoDetailListViewState.pagePosition) && this.detailListBottomPadding == cryptoDetailListViewState.detailListBottomPadding;
    }

    public int hashCode() {
        int iHashCode = this.viewPagerListItems.hashCode() * 31;
        UiCurrencyPair uiCurrencyPair = this.currentCurrencyPair;
        int iHashCode2 = (iHashCode + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31;
        Integer num = this.pagePosition;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.detailListBottomPadding);
    }

    public String toString() {
        return "CryptoDetailListViewState(viewPagerListItems=" + this.viewPagerListItems + ", currentCurrencyPair=" + this.currentCurrencyPair + ", pagePosition=" + this.pagePosition + ", detailListBottomPadding=" + this.detailListBottomPadding + ")";
    }

    public CryptoDetailListViewState(List<CryptoDetailListAdapter.Item> viewPagerListItems, UiCurrencyPair uiCurrencyPair, Integer num, int i) {
        Intrinsics.checkNotNullParameter(viewPagerListItems, "viewPagerListItems");
        this.viewPagerListItems = viewPagerListItems;
        this.currentCurrencyPair = uiCurrencyPair;
        this.pagePosition = num;
        this.detailListBottomPadding = i;
    }

    public /* synthetic */ CryptoDetailListViewState(List list, UiCurrencyPair uiCurrencyPair, Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? null : uiCurrencyPair, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? 0 : i);
    }

    public final List<CryptoDetailListAdapter.Item> getViewPagerListItems() {
        return this.viewPagerListItems;
    }

    public final UiCurrencyPair getCurrentCurrencyPair() {
        return this.currentCurrencyPair;
    }

    public final Integer getPagePosition() {
        return this.pagePosition;
    }

    public final int getDetailListBottomPadding() {
        return this.detailListBottomPadding;
    }
}

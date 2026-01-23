package com.robinhood.android.crypto.p094ui.detaillist;

import com.robinhood.android.crypto.p094ui.detail.CryptoDetailFragment;
import com.robinhood.android.crypto.p094ui.detaillist.CryptoDetailListAdapter;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailKey;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailV2FragmentKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoDetailListDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0002\u0010,J\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÀ\u0003¢\u0006\u0002\b.J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J`\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0007HÖ\u0001J\t\u00105\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b \u0010\u0016R\u0013\u0010!\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001c¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListDataState;", "", "initialCurrencyPairId", "Ljava/util/UUID;", "overrideCryptoToolbarTheme", "", "userSelectedPagePosition", "", "tradeBarHeight", "isCryptoDetailPageV2Member", "uiCurrencyPairList", "", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "source", "", "<init>", "(Ljava/util/UUID;ZLjava/lang/Integer;ILjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)V", "getInitialCurrencyPairId", "()Ljava/util/UUID;", "getOverrideCryptoToolbarTheme", "()Z", "getUserSelectedPagePosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTradeBarHeight", "()I", "Ljava/lang/Boolean;", "getUiCurrencyPairList$feature_crypto_externalDebug", "()Ljava/util/List;", "getSource", "()Ljava/lang/String;", "pagePosition", "getPagePosition", "uiCurrencyPair", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "viewPagerListItems", "Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListAdapter$Item;", "getViewPagerListItems", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component6$feature_crypto_externalDebug", "component7", "copy", "(Ljava/util/UUID;ZLjava/lang/Integer;ILjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListDataState;", "equals", "other", "hashCode", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoDetailListDataState {
    public static final int $stable = 8;
    private final UUID initialCurrencyPairId;
    private final Boolean isCryptoDetailPageV2Member;
    private final boolean overrideCryptoToolbarTheme;
    private final String source;
    private final int tradeBarHeight;
    private final List<UiCurrencyPair> uiCurrencyPairList;
    private final Integer userSelectedPagePosition;

    /* renamed from: component5, reason: from getter */
    private final Boolean getIsCryptoDetailPageV2Member() {
        return this.isCryptoDetailPageV2Member;
    }

    public static /* synthetic */ CryptoDetailListDataState copy$default(CryptoDetailListDataState cryptoDetailListDataState, UUID uuid, boolean z, Integer num, int i, Boolean bool, List list, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = cryptoDetailListDataState.initialCurrencyPairId;
        }
        if ((i2 & 2) != 0) {
            z = cryptoDetailListDataState.overrideCryptoToolbarTheme;
        }
        if ((i2 & 4) != 0) {
            num = cryptoDetailListDataState.userSelectedPagePosition;
        }
        if ((i2 & 8) != 0) {
            i = cryptoDetailListDataState.tradeBarHeight;
        }
        if ((i2 & 16) != 0) {
            bool = cryptoDetailListDataState.isCryptoDetailPageV2Member;
        }
        if ((i2 & 32) != 0) {
            list = cryptoDetailListDataState.uiCurrencyPairList;
        }
        if ((i2 & 64) != 0) {
            str = cryptoDetailListDataState.source;
        }
        List list2 = list;
        String str2 = str;
        Boolean bool2 = bool;
        Integer num2 = num;
        return cryptoDetailListDataState.copy(uuid, z, num2, i, bool2, list2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInitialCurrencyPairId() {
        return this.initialCurrencyPairId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getOverrideCryptoToolbarTheme() {
        return this.overrideCryptoToolbarTheme;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getUserSelectedPagePosition() {
        return this.userSelectedPagePosition;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTradeBarHeight() {
        return this.tradeBarHeight;
    }

    public final List<UiCurrencyPair> component6$feature_crypto_externalDebug() {
        return this.uiCurrencyPairList;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final CryptoDetailListDataState copy(UUID initialCurrencyPairId, boolean overrideCryptoToolbarTheme, Integer userSelectedPagePosition, int tradeBarHeight, Boolean isCryptoDetailPageV2Member, List<UiCurrencyPair> uiCurrencyPairList, String source) {
        Intrinsics.checkNotNullParameter(initialCurrencyPairId, "initialCurrencyPairId");
        Intrinsics.checkNotNullParameter(uiCurrencyPairList, "uiCurrencyPairList");
        return new CryptoDetailListDataState(initialCurrencyPairId, overrideCryptoToolbarTheme, userSelectedPagePosition, tradeBarHeight, isCryptoDetailPageV2Member, uiCurrencyPairList, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDetailListDataState)) {
            return false;
        }
        CryptoDetailListDataState cryptoDetailListDataState = (CryptoDetailListDataState) other;
        return Intrinsics.areEqual(this.initialCurrencyPairId, cryptoDetailListDataState.initialCurrencyPairId) && this.overrideCryptoToolbarTheme == cryptoDetailListDataState.overrideCryptoToolbarTheme && Intrinsics.areEqual(this.userSelectedPagePosition, cryptoDetailListDataState.userSelectedPagePosition) && this.tradeBarHeight == cryptoDetailListDataState.tradeBarHeight && Intrinsics.areEqual(this.isCryptoDetailPageV2Member, cryptoDetailListDataState.isCryptoDetailPageV2Member) && Intrinsics.areEqual(this.uiCurrencyPairList, cryptoDetailListDataState.uiCurrencyPairList) && Intrinsics.areEqual(this.source, cryptoDetailListDataState.source);
    }

    public int hashCode() {
        int iHashCode = ((this.initialCurrencyPairId.hashCode() * 31) + Boolean.hashCode(this.overrideCryptoToolbarTheme)) * 31;
        Integer num = this.userSelectedPagePosition;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.tradeBarHeight)) * 31;
        Boolean bool = this.isCryptoDetailPageV2Member;
        int iHashCode3 = (((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + this.uiCurrencyPairList.hashCode()) * 31;
        String str = this.source;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CryptoDetailListDataState(initialCurrencyPairId=" + this.initialCurrencyPairId + ", overrideCryptoToolbarTheme=" + this.overrideCryptoToolbarTheme + ", userSelectedPagePosition=" + this.userSelectedPagePosition + ", tradeBarHeight=" + this.tradeBarHeight + ", isCryptoDetailPageV2Member=" + this.isCryptoDetailPageV2Member + ", uiCurrencyPairList=" + this.uiCurrencyPairList + ", source=" + this.source + ")";
    }

    public CryptoDetailListDataState(UUID initialCurrencyPairId, boolean z, Integer num, int i, Boolean bool, List<UiCurrencyPair> uiCurrencyPairList, String str) {
        Intrinsics.checkNotNullParameter(initialCurrencyPairId, "initialCurrencyPairId");
        Intrinsics.checkNotNullParameter(uiCurrencyPairList, "uiCurrencyPairList");
        this.initialCurrencyPairId = initialCurrencyPairId;
        this.overrideCryptoToolbarTheme = z;
        this.userSelectedPagePosition = num;
        this.tradeBarHeight = i;
        this.isCryptoDetailPageV2Member = bool;
        this.uiCurrencyPairList = uiCurrencyPairList;
        this.source = str;
    }

    public final UUID getInitialCurrencyPairId() {
        return this.initialCurrencyPairId;
    }

    public final boolean getOverrideCryptoToolbarTheme() {
        return this.overrideCryptoToolbarTheme;
    }

    public final Integer getUserSelectedPagePosition() {
        return this.userSelectedPagePosition;
    }

    public final int getTradeBarHeight() {
        return this.tradeBarHeight;
    }

    public /* synthetic */ CryptoDetailListDataState(UUID uuid, boolean z, Integer num, int i, Boolean bool, List list, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, z, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? null : str);
    }

    public final List<UiCurrencyPair> getUiCurrencyPairList$feature_crypto_externalDebug() {
        return this.uiCurrencyPairList;
    }

    public final String getSource() {
        return this.source;
    }

    public final Integer getPagePosition() {
        Integer num = this.userSelectedPagePosition;
        if (num != null) {
            return num;
        }
        Iterator<UiCurrencyPair> it = this.uiCurrencyPairList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().getId(), this.initialCurrencyPairId)) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public final UiCurrencyPair getUiCurrencyPair() {
        Integer pagePosition = getPagePosition();
        if (pagePosition != null) {
            return this.uiCurrencyPairList.get(pagePosition.intValue());
        }
        return null;
    }

    public final List<CryptoDetailListAdapter.Item> getViewPagerListItems() {
        CryptoDetailKey args;
        List<UiCurrencyPair> list = this.uiCurrencyPairList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (UiCurrencyPair uiCurrencyPair : list) {
            if (uiCurrencyPair.isTokenizedStock()) {
                args = new CryptoDetailV2FragmentKey.Tokenized(uiCurrencyPair.getId(), this.source);
            } else if (Intrinsics.areEqual(this.isCryptoDetailPageV2Member, Boolean.TRUE)) {
                args = new CryptoDetailV2FragmentKey.Crypto(uiCurrencyPair.getId(), this.source);
            } else {
                args = new CryptoDetailFragment.Args(uiCurrencyPair, this.overrideCryptoToolbarTheme, this.source);
            }
            arrayList.add(new CryptoDetailListAdapter.Item(uiCurrencyPair, args));
        }
        return arrayList;
    }
}

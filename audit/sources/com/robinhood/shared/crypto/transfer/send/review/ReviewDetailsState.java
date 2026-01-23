package com.robinhood.shared.crypto.transfer.send.review;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.shared.crypto.transfer.model.NetworkFeeData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendReviewComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\t\u00103\u001a\u00020\u0010HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u0099\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0005HÆ\u0001J\u0013\u00109\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001a¨\u0006>"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/ReviewDetailsState;", "", "currencyCode", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "totalFeesRowVisible", "", PlaceTypes.ADDRESS, "networkName", "networkTypeName", "networkFeeMeta1", "Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;", "networkFeeMeta2", "networkFeeSheetContentState", "Lcom/robinhood/shared/crypto/transfer/send/review/NetworkFeeSheetContentState;", "totalMeta1", "totalMeta2", "memoVisible", MemoInputActivity.EXTRA_MEMO, "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;Lcom/robinhood/shared/crypto/transfer/send/review/NetworkFeeSheetContentState;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/utils/resource/StringResource;)V", "getCurrencyCode", "()Ljava/lang/String;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getTotalFeesRowVisible", "()Z", "getAddress", "getNetworkName", "getNetworkTypeName", "getNetworkFeeMeta1", "()Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;", "getNetworkFeeMeta2", "getNetworkFeeSheetContentState", "()Lcom/robinhood/shared/crypto/transfer/send/review/NetworkFeeSheetContentState;", "getTotalMeta1", "getTotalMeta2", "getMemoVisible", "getMemo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ReviewDetailsState {
    public static final int $stable = StringResource.$stable;
    private final String address;
    private final String currencyCode;
    private final StringResource memo;
    private final boolean memoVisible;
    private final NetworkFeeData networkFeeMeta1;
    private final NetworkFeeData networkFeeMeta2;
    private final NetworkFeeSheetContentState networkFeeSheetContentState;
    private final String networkName;
    private final String networkTypeName;
    private final StringResource subtitle;
    private final StringResource title;
    private final boolean totalFeesRowVisible;
    private final String totalMeta1;
    private final String totalMeta2;

    /* renamed from: component1, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component10, reason: from getter */
    public final NetworkFeeSheetContentState getNetworkFeeSheetContentState() {
        return this.networkFeeSheetContentState;
    }

    /* renamed from: component11, reason: from getter */
    public final String getTotalMeta1() {
        return this.totalMeta1;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTotalMeta2() {
        return this.totalMeta2;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getMemoVisible() {
        return this.memoVisible;
    }

    /* renamed from: component14, reason: from getter */
    public final StringResource getMemo() {
        return this.memo;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getTotalFeesRowVisible() {
        return this.totalFeesRowVisible;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component6, reason: from getter */
    public final String getNetworkName() {
        return this.networkName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getNetworkTypeName() {
        return this.networkTypeName;
    }

    /* renamed from: component8, reason: from getter */
    public final NetworkFeeData getNetworkFeeMeta1() {
        return this.networkFeeMeta1;
    }

    /* renamed from: component9, reason: from getter */
    public final NetworkFeeData getNetworkFeeMeta2() {
        return this.networkFeeMeta2;
    }

    public final ReviewDetailsState copy(String currencyCode, StringResource title, StringResource subtitle, boolean totalFeesRowVisible, String address, String networkName, String networkTypeName, NetworkFeeData networkFeeMeta1, NetworkFeeData networkFeeMeta2, NetworkFeeSheetContentState networkFeeSheetContentState, String totalMeta1, String totalMeta2, boolean memoVisible, StringResource memo) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(networkFeeMeta1, "networkFeeMeta1");
        Intrinsics.checkNotNullParameter(networkFeeMeta2, "networkFeeMeta2");
        Intrinsics.checkNotNullParameter(networkFeeSheetContentState, "networkFeeSheetContentState");
        Intrinsics.checkNotNullParameter(totalMeta1, "totalMeta1");
        Intrinsics.checkNotNullParameter(totalMeta2, "totalMeta2");
        Intrinsics.checkNotNullParameter(memo, "memo");
        return new ReviewDetailsState(currencyCode, title, subtitle, totalFeesRowVisible, address, networkName, networkTypeName, networkFeeMeta1, networkFeeMeta2, networkFeeSheetContentState, totalMeta1, totalMeta2, memoVisible, memo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewDetailsState)) {
            return false;
        }
        ReviewDetailsState reviewDetailsState = (ReviewDetailsState) other;
        return Intrinsics.areEqual(this.currencyCode, reviewDetailsState.currencyCode) && Intrinsics.areEqual(this.title, reviewDetailsState.title) && Intrinsics.areEqual(this.subtitle, reviewDetailsState.subtitle) && this.totalFeesRowVisible == reviewDetailsState.totalFeesRowVisible && Intrinsics.areEqual(this.address, reviewDetailsState.address) && Intrinsics.areEqual(this.networkName, reviewDetailsState.networkName) && Intrinsics.areEqual(this.networkTypeName, reviewDetailsState.networkTypeName) && Intrinsics.areEqual(this.networkFeeMeta1, reviewDetailsState.networkFeeMeta1) && Intrinsics.areEqual(this.networkFeeMeta2, reviewDetailsState.networkFeeMeta2) && Intrinsics.areEqual(this.networkFeeSheetContentState, reviewDetailsState.networkFeeSheetContentState) && Intrinsics.areEqual(this.totalMeta1, reviewDetailsState.totalMeta1) && Intrinsics.areEqual(this.totalMeta2, reviewDetailsState.totalMeta2) && this.memoVisible == reviewDetailsState.memoVisible && Intrinsics.areEqual(this.memo, reviewDetailsState.memo);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.currencyCode.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.totalFeesRowVisible)) * 31) + this.address.hashCode()) * 31;
        String str = this.networkName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.networkTypeName;
        return ((((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.networkFeeMeta1.hashCode()) * 31) + this.networkFeeMeta2.hashCode()) * 31) + this.networkFeeSheetContentState.hashCode()) * 31) + this.totalMeta1.hashCode()) * 31) + this.totalMeta2.hashCode()) * 31) + Boolean.hashCode(this.memoVisible)) * 31) + this.memo.hashCode();
    }

    public String toString() {
        return "ReviewDetailsState(currencyCode=" + this.currencyCode + ", title=" + this.title + ", subtitle=" + this.subtitle + ", totalFeesRowVisible=" + this.totalFeesRowVisible + ", address=" + this.address + ", networkName=" + this.networkName + ", networkTypeName=" + this.networkTypeName + ", networkFeeMeta1=" + this.networkFeeMeta1 + ", networkFeeMeta2=" + this.networkFeeMeta2 + ", networkFeeSheetContentState=" + this.networkFeeSheetContentState + ", totalMeta1=" + this.totalMeta1 + ", totalMeta2=" + this.totalMeta2 + ", memoVisible=" + this.memoVisible + ", memo=" + this.memo + ")";
    }

    public ReviewDetailsState(String currencyCode, StringResource title, StringResource subtitle, boolean z, String address, String str, String str2, NetworkFeeData networkFeeMeta1, NetworkFeeData networkFeeMeta2, NetworkFeeSheetContentState networkFeeSheetContentState, String totalMeta1, String totalMeta2, boolean z2, StringResource memo) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(networkFeeMeta1, "networkFeeMeta1");
        Intrinsics.checkNotNullParameter(networkFeeMeta2, "networkFeeMeta2");
        Intrinsics.checkNotNullParameter(networkFeeSheetContentState, "networkFeeSheetContentState");
        Intrinsics.checkNotNullParameter(totalMeta1, "totalMeta1");
        Intrinsics.checkNotNullParameter(totalMeta2, "totalMeta2");
        Intrinsics.checkNotNullParameter(memo, "memo");
        this.currencyCode = currencyCode;
        this.title = title;
        this.subtitle = subtitle;
        this.totalFeesRowVisible = z;
        this.address = address;
        this.networkName = str;
        this.networkTypeName = str2;
        this.networkFeeMeta1 = networkFeeMeta1;
        this.networkFeeMeta2 = networkFeeMeta2;
        this.networkFeeSheetContentState = networkFeeSheetContentState;
        this.totalMeta1 = totalMeta1;
        this.totalMeta2 = totalMeta2;
        this.memoVisible = z2;
        this.memo = memo;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final boolean getTotalFeesRowVisible() {
        return this.totalFeesRowVisible;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    public final String getNetworkTypeName() {
        return this.networkTypeName;
    }

    public final NetworkFeeData getNetworkFeeMeta1() {
        return this.networkFeeMeta1;
    }

    public final NetworkFeeData getNetworkFeeMeta2() {
        return this.networkFeeMeta2;
    }

    public final NetworkFeeSheetContentState getNetworkFeeSheetContentState() {
        return this.networkFeeSheetContentState;
    }

    public final String getTotalMeta1() {
        return this.totalMeta1;
    }

    public final String getTotalMeta2() {
        return this.totalMeta2;
    }

    public final boolean getMemoVisible() {
        return this.memoVisible;
    }

    public final StringResource getMemo() {
        return this.memo;
    }
}

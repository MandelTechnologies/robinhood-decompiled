package com.robinhood.android.crypto.tab.p093ui.rewards.banner;

import com.robinhood.android.car.result.CarResultComposable2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: CryptoHomeRewardsDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsDataState;", "", "title", "", CarResultComposable2.BODY, "headerImageUrl", "Lokhttp3/HttpUrl;", "primaryCtaDeepLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/HttpUrl;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getHeaderImageUrl", "()Lokhttp3/HttpUrl;", "getPrimaryCtaDeepLink", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeRewardsDataState {
    public static final int $stable = 8;
    private final String body;
    private final HttpUrl headerImageUrl;
    private final String primaryCtaDeepLink;
    private final String title;

    public CryptoHomeRewardsDataState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CryptoHomeRewardsDataState copy$default(CryptoHomeRewardsDataState cryptoHomeRewardsDataState, String str, String str2, HttpUrl httpUrl, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoHomeRewardsDataState.title;
        }
        if ((i & 2) != 0) {
            str2 = cryptoHomeRewardsDataState.body;
        }
        if ((i & 4) != 0) {
            httpUrl = cryptoHomeRewardsDataState.headerImageUrl;
        }
        if ((i & 8) != 0) {
            str3 = cryptoHomeRewardsDataState.primaryCtaDeepLink;
        }
        return cryptoHomeRewardsDataState.copy(str, str2, httpUrl, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final HttpUrl getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrimaryCtaDeepLink() {
        return this.primaryCtaDeepLink;
    }

    public final CryptoHomeRewardsDataState copy(String title, String body, HttpUrl headerImageUrl, String primaryCtaDeepLink) {
        return new CryptoHomeRewardsDataState(title, body, headerImageUrl, primaryCtaDeepLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeRewardsDataState)) {
            return false;
        }
        CryptoHomeRewardsDataState cryptoHomeRewardsDataState = (CryptoHomeRewardsDataState) other;
        return Intrinsics.areEqual(this.title, cryptoHomeRewardsDataState.title) && Intrinsics.areEqual(this.body, cryptoHomeRewardsDataState.body) && Intrinsics.areEqual(this.headerImageUrl, cryptoHomeRewardsDataState.headerImageUrl) && Intrinsics.areEqual(this.primaryCtaDeepLink, cryptoHomeRewardsDataState.primaryCtaDeepLink);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.body;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        HttpUrl httpUrl = this.headerImageUrl;
        int iHashCode3 = (iHashCode2 + (httpUrl == null ? 0 : httpUrl.hashCode())) * 31;
        String str3 = this.primaryCtaDeepLink;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "CryptoHomeRewardsDataState(title=" + this.title + ", body=" + this.body + ", headerImageUrl=" + this.headerImageUrl + ", primaryCtaDeepLink=" + this.primaryCtaDeepLink + ")";
    }

    public CryptoHomeRewardsDataState(String str, String str2, HttpUrl httpUrl, String str3) {
        this.title = str;
        this.body = str2;
        this.headerImageUrl = httpUrl;
        this.primaryCtaDeepLink = str3;
    }

    public /* synthetic */ CryptoHomeRewardsDataState(String str, String str2, HttpUrl httpUrl, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : httpUrl, (i & 8) != 0 ? null : str3);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final HttpUrl getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public final String getPrimaryCtaDeepLink() {
        return this.primaryCtaDeepLink;
    }
}

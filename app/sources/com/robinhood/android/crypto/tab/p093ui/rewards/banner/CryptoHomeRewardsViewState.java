package com.robinhood.android.crypto.tab.p093ui.rewards.banner;

import android.net.Uri;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.navigation.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: CryptoHomeRewardsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsViewState$Loaded;", "Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsViewState$Loading;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface CryptoHomeRewardsViewState {

    /* compiled from: CryptoHomeRewardsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsViewState$Loading;", "Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements CryptoHomeRewardsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1260164570;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: CryptoHomeRewardsViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÂ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsViewState$Loaded;", "Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsViewState;", "title", "", CarResultComposable2.BODY, "headerImageUrl", "Lokhttp3/HttpUrl;", DeepLink.INTENT_ARG_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/HttpUrl;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getHeaderImageUrl", "()Lokhttp3/HttpUrl;", "deepLinkUri", "Landroid/net/Uri;", "getDeepLinkUri", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Loaded implements CryptoHomeRewardsViewState {
        public static final int $stable = 8;
        private final String body;
        private final String deepLink;
        private final HttpUrl headerImageUrl;
        private final String title;

        /* renamed from: component4, reason: from getter */
        private final String getDeepLink() {
            return this.deepLink;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, HttpUrl httpUrl, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.title;
            }
            if ((i & 2) != 0) {
                str2 = loaded.body;
            }
            if ((i & 4) != 0) {
                httpUrl = loaded.headerImageUrl;
            }
            if ((i & 8) != 0) {
                str3 = loaded.deepLink;
            }
            return loaded.copy(str, str2, httpUrl, str3);
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

        public final Loaded copy(String title, String body, HttpUrl headerImageUrl, String deepLink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(headerImageUrl, "headerImageUrl");
            Intrinsics.checkNotNullParameter(deepLink, "deepLink");
            return new Loaded(title, body, headerImageUrl, deepLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.body, loaded.body) && Intrinsics.areEqual(this.headerImageUrl, loaded.headerImageUrl) && Intrinsics.areEqual(this.deepLink, loaded.deepLink);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.body;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.headerImageUrl.hashCode()) * 31) + this.deepLink.hashCode();
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", body=" + this.body + ", headerImageUrl=" + this.headerImageUrl + ", deepLink=" + this.deepLink + ")";
        }

        public Loaded(String title, String str, HttpUrl headerImageUrl, String deepLink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(headerImageUrl, "headerImageUrl");
            Intrinsics.checkNotNullParameter(deepLink, "deepLink");
            this.title = title;
            this.body = str;
            this.headerImageUrl = headerImageUrl;
            this.deepLink = deepLink;
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

        public final Uri getDeepLinkUri() {
            return Uri.parse(this.deepLink);
        }
    }
}

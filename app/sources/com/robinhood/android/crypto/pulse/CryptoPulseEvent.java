package com.robinhood.android.crypto.pulse;

import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedRefreshResponseDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedResponseDto;
import com.robinhood.android.cortex.contracts.AssetDigestFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoPulseEvent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent;", "", "<init>", "()V", "ShowFeed", "ShowAgreementForFeed", "ShowPrimerForFeed", "ShowPrimerForDigestFragment", "ShowDigestFragment", "ShowErrorAlert", "Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent$ShowAgreementForFeed;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent$ShowDigestFragment;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent$ShowErrorAlert;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent$ShowFeed;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent$ShowPrimerForDigestFragment;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent$ShowPrimerForFeed;", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class CryptoPulseEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoPulseEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoPulseEvent() {
    }

    /* compiled from: CryptoPulseEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent$ShowFeed;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent;", "feedResponse", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "refreshResponse", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;)V", "getFeedResponse", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "getRefreshResponse", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFeed extends CryptoPulseEvent {
        public static final int $stable = 8;
        private final GetCryptoPulseFeedResponseDto feedResponse;
        private final GetCryptoPulseFeedRefreshResponseDto refreshResponse;

        public static /* synthetic */ ShowFeed copy$default(ShowFeed showFeed, GetCryptoPulseFeedResponseDto getCryptoPulseFeedResponseDto, GetCryptoPulseFeedRefreshResponseDto getCryptoPulseFeedRefreshResponseDto, int i, Object obj) {
            if ((i & 1) != 0) {
                getCryptoPulseFeedResponseDto = showFeed.feedResponse;
            }
            if ((i & 2) != 0) {
                getCryptoPulseFeedRefreshResponseDto = showFeed.refreshResponse;
            }
            return showFeed.copy(getCryptoPulseFeedResponseDto, getCryptoPulseFeedRefreshResponseDto);
        }

        /* renamed from: component1, reason: from getter */
        public final GetCryptoPulseFeedResponseDto getFeedResponse() {
            return this.feedResponse;
        }

        /* renamed from: component2, reason: from getter */
        public final GetCryptoPulseFeedRefreshResponseDto getRefreshResponse() {
            return this.refreshResponse;
        }

        public final ShowFeed copy(GetCryptoPulseFeedResponseDto feedResponse, GetCryptoPulseFeedRefreshResponseDto refreshResponse) {
            Intrinsics.checkNotNullParameter(feedResponse, "feedResponse");
            Intrinsics.checkNotNullParameter(refreshResponse, "refreshResponse");
            return new ShowFeed(feedResponse, refreshResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowFeed)) {
                return false;
            }
            ShowFeed showFeed = (ShowFeed) other;
            return Intrinsics.areEqual(this.feedResponse, showFeed.feedResponse) && Intrinsics.areEqual(this.refreshResponse, showFeed.refreshResponse);
        }

        public int hashCode() {
            return (this.feedResponse.hashCode() * 31) + this.refreshResponse.hashCode();
        }

        public String toString() {
            return "ShowFeed(feedResponse=" + this.feedResponse + ", refreshResponse=" + this.refreshResponse + ")";
        }

        public final GetCryptoPulseFeedResponseDto getFeedResponse() {
            return this.feedResponse;
        }

        public final GetCryptoPulseFeedRefreshResponseDto getRefreshResponse() {
            return this.refreshResponse;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowFeed(GetCryptoPulseFeedResponseDto feedResponse, GetCryptoPulseFeedRefreshResponseDto refreshResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(feedResponse, "feedResponse");
            Intrinsics.checkNotNullParameter(refreshResponse, "refreshResponse");
            this.feedResponse = feedResponse;
            this.refreshResponse = refreshResponse;
        }
    }

    /* compiled from: CryptoPulseEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent$ShowAgreementForFeed;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAgreementForFeed extends CryptoPulseEvent {
        public static final int $stable = 0;
        public static final ShowAgreementForFeed INSTANCE = new ShowAgreementForFeed();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowAgreementForFeed);
        }

        public int hashCode() {
            return 214167832;
        }

        public String toString() {
            return "ShowAgreementForFeed";
        }

        private ShowAgreementForFeed() {
            super(null);
        }
    }

    /* compiled from: CryptoPulseEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent$ShowPrimerForFeed;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowPrimerForFeed extends CryptoPulseEvent {
        public static final int $stable = 0;
        public static final ShowPrimerForFeed INSTANCE = new ShowPrimerForFeed();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowPrimerForFeed);
        }

        public int hashCode() {
            return -1329583591;
        }

        public String toString() {
            return "ShowPrimerForFeed";
        }

        private ShowPrimerForFeed() {
            super(null);
        }
    }

    /* compiled from: CryptoPulseEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent$ShowPrimerForDigestFragment;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent;", "fragmentKey", "Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "<init>", "(Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowPrimerForDigestFragment extends CryptoPulseEvent {
        public static final int $stable = 8;
        private final AssetDigestFragmentKey fragmentKey;

        public static /* synthetic */ ShowPrimerForDigestFragment copy$default(ShowPrimerForDigestFragment showPrimerForDigestFragment, AssetDigestFragmentKey assetDigestFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                assetDigestFragmentKey = showPrimerForDigestFragment.fragmentKey;
            }
            return showPrimerForDigestFragment.copy(assetDigestFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final AssetDigestFragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final ShowPrimerForDigestFragment copy(AssetDigestFragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new ShowPrimerForDigestFragment(fragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowPrimerForDigestFragment) && Intrinsics.areEqual(this.fragmentKey, ((ShowPrimerForDigestFragment) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "ShowPrimerForDigestFragment(fragmentKey=" + this.fragmentKey + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowPrimerForDigestFragment(AssetDigestFragmentKey fragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }

        public final AssetDigestFragmentKey getFragmentKey() {
            return this.fragmentKey;
        }
    }

    /* compiled from: CryptoPulseEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent$ShowDigestFragment;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent;", "fragmentKey", "Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "<init>", "(Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowDigestFragment extends CryptoPulseEvent {
        public static final int $stable = 8;
        private final AssetDigestFragmentKey fragmentKey;

        public static /* synthetic */ ShowDigestFragment copy$default(ShowDigestFragment showDigestFragment, AssetDigestFragmentKey assetDigestFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                assetDigestFragmentKey = showDigestFragment.fragmentKey;
            }
            return showDigestFragment.copy(assetDigestFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final AssetDigestFragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final ShowDigestFragment copy(AssetDigestFragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new ShowDigestFragment(fragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowDigestFragment) && Intrinsics.areEqual(this.fragmentKey, ((ShowDigestFragment) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "ShowDigestFragment(fragmentKey=" + this.fragmentKey + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowDigestFragment(AssetDigestFragmentKey fragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }

        public final AssetDigestFragmentKey getFragmentKey() {
            return this.fragmentKey;
        }
    }

    /* compiled from: CryptoPulseEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent$ShowErrorAlert;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowErrorAlert extends CryptoPulseEvent {
        public static final int $stable = 0;
        public static final ShowErrorAlert INSTANCE = new ShowErrorAlert();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowErrorAlert);
        }

        public int hashCode() {
            return -2142219025;
        }

        public String toString() {
            return "ShowErrorAlert";
        }

        private ShowErrorAlert() {
            super(null);
        }
    }
}

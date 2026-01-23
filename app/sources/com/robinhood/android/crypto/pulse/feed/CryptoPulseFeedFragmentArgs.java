package com.robinhood.android.crypto.pulse.feed;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedRefreshResponseDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedResponseDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoPulseFeedFragmentArgs.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedFragmentArgs;", "Landroid/os/Parcelable;", "feedResponse", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "refreshResponse", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;)V", "getFeedResponse", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "getRefreshResponse", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoPulseFeedFragmentArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CryptoPulseFeedFragmentArgs> CREATOR = new Creator();
    private final GetCryptoPulseFeedResponseDto feedResponse;
    private final GetCryptoPulseFeedRefreshResponseDto refreshResponse;

    /* compiled from: CryptoPulseFeedFragmentArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoPulseFeedFragmentArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoPulseFeedFragmentArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoPulseFeedFragmentArgs((GetCryptoPulseFeedResponseDto) parcel.readParcelable(CryptoPulseFeedFragmentArgs.class.getClassLoader()), (GetCryptoPulseFeedRefreshResponseDto) parcel.readParcelable(CryptoPulseFeedFragmentArgs.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoPulseFeedFragmentArgs[] newArray(int i) {
            return new CryptoPulseFeedFragmentArgs[i];
        }
    }

    public static /* synthetic */ CryptoPulseFeedFragmentArgs copy$default(CryptoPulseFeedFragmentArgs cryptoPulseFeedFragmentArgs, GetCryptoPulseFeedResponseDto getCryptoPulseFeedResponseDto, GetCryptoPulseFeedRefreshResponseDto getCryptoPulseFeedRefreshResponseDto, int i, Object obj) {
        if ((i & 1) != 0) {
            getCryptoPulseFeedResponseDto = cryptoPulseFeedFragmentArgs.feedResponse;
        }
        if ((i & 2) != 0) {
            getCryptoPulseFeedRefreshResponseDto = cryptoPulseFeedFragmentArgs.refreshResponse;
        }
        return cryptoPulseFeedFragmentArgs.copy(getCryptoPulseFeedResponseDto, getCryptoPulseFeedRefreshResponseDto);
    }

    /* renamed from: component1, reason: from getter */
    public final GetCryptoPulseFeedResponseDto getFeedResponse() {
        return this.feedResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final GetCryptoPulseFeedRefreshResponseDto getRefreshResponse() {
        return this.refreshResponse;
    }

    public final CryptoPulseFeedFragmentArgs copy(GetCryptoPulseFeedResponseDto feedResponse, GetCryptoPulseFeedRefreshResponseDto refreshResponse) {
        Intrinsics.checkNotNullParameter(feedResponse, "feedResponse");
        Intrinsics.checkNotNullParameter(refreshResponse, "refreshResponse");
        return new CryptoPulseFeedFragmentArgs(feedResponse, refreshResponse);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoPulseFeedFragmentArgs)) {
            return false;
        }
        CryptoPulseFeedFragmentArgs cryptoPulseFeedFragmentArgs = (CryptoPulseFeedFragmentArgs) other;
        return Intrinsics.areEqual(this.feedResponse, cryptoPulseFeedFragmentArgs.feedResponse) && Intrinsics.areEqual(this.refreshResponse, cryptoPulseFeedFragmentArgs.refreshResponse);
    }

    public int hashCode() {
        return (this.feedResponse.hashCode() * 31) + this.refreshResponse.hashCode();
    }

    public String toString() {
        return "CryptoPulseFeedFragmentArgs(feedResponse=" + this.feedResponse + ", refreshResponse=" + this.refreshResponse + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.feedResponse, flags);
        dest.writeParcelable(this.refreshResponse, flags);
    }

    public CryptoPulseFeedFragmentArgs(GetCryptoPulseFeedResponseDto feedResponse, GetCryptoPulseFeedRefreshResponseDto refreshResponse) {
        Intrinsics.checkNotNullParameter(feedResponse, "feedResponse");
        Intrinsics.checkNotNullParameter(refreshResponse, "refreshResponse");
        this.feedResponse = feedResponse;
        this.refreshResponse = refreshResponse;
    }

    public final GetCryptoPulseFeedResponseDto getFeedResponse() {
        return this.feedResponse;
    }

    public final GetCryptoPulseFeedRefreshResponseDto getRefreshResponse() {
        return this.refreshResponse;
    }
}

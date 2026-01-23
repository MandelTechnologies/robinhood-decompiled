package com.robinhood.android.referral.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.ColorTheme;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardOfferIntentKey.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "<init>", "()V", "source", "", "getSource", "()Ljava/lang/String;", "theme", "Lcom/robinhood/models/api/ColorTheme;", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "OffersList", "Platform", "ReferralOffer", "PastReferrals", "Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey$OffersList;", "Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey$ReferralOffer;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class RewardOfferIntentKey implements IntentKey, Parcelable {
    public /* synthetic */ RewardOfferIntentKey(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getSource();

    public abstract ColorTheme getTheme();

    private RewardOfferIntentKey() {
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    /* compiled from: RewardOfferIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey$OffersList;", "Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey;", "<init>", "()V", "Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey$PastReferrals;", "Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey$Platform;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class OffersList extends RewardOfferIntentKey {
        public /* synthetic */ OffersList(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private OffersList() {
            super(null);
        }
    }

    /* compiled from: RewardOfferIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey$Platform;", "Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey$OffersList;", "source", "", "theme", "Lcom/robinhood/models/api/ColorTheme;", "rewardOfferId", "Ljava/util/UUID;", "isFromRhfOnboarding", "", "useContentfulApi", "initialSource", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/ColorTheme;Ljava/util/UUID;ZZLjava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "getRewardOfferId", "()Ljava/util/UUID;", "()Z", "getUseContentfulApi", "getInitialSource", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Platform extends OffersList {
        public static final Parcelable.Creator<Platform> CREATOR = new Creator();
        private final String initialSource;
        private final boolean isFromRhfOnboarding;
        private final UUID rewardOfferId;
        private final String source;
        private final ColorTheme theme;
        private final boolean useContentfulApi;

        /* compiled from: RewardOfferIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes5.dex */
        public static final class Creator implements Parcelable.Creator<Platform> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Platform createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                ColorTheme colorThemeValueOf = ColorTheme.valueOf(parcel.readString());
                UUID uuid = (UUID) parcel.readSerializable();
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new Platform(string2, colorThemeValueOf, uuid, z2, parcel.readInt() == 0 ? z : true, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Platform[] newArray(int i) {
                return new Platform[i];
            }
        }

        public Platform() {
            this(null, null, null, false, false, null, 63, null);
        }

        public static /* synthetic */ Platform copy$default(Platform platform, String str, ColorTheme colorTheme, UUID uuid, boolean z, boolean z2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = platform.source;
            }
            if ((i & 2) != 0) {
                colorTheme = platform.theme;
            }
            if ((i & 4) != 0) {
                uuid = platform.rewardOfferId;
            }
            if ((i & 8) != 0) {
                z = platform.isFromRhfOnboarding;
            }
            if ((i & 16) != 0) {
                z2 = platform.useContentfulApi;
            }
            if ((i & 32) != 0) {
                str2 = platform.initialSource;
            }
            boolean z3 = z2;
            String str3 = str2;
            return platform.copy(str, colorTheme, uuid, z, z3, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final ColorTheme getTheme() {
            return this.theme;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getRewardOfferId() {
            return this.rewardOfferId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsFromRhfOnboarding() {
            return this.isFromRhfOnboarding;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getUseContentfulApi() {
            return this.useContentfulApi;
        }

        /* renamed from: component6, reason: from getter */
        public final String getInitialSource() {
            return this.initialSource;
        }

        public final Platform copy(String source, ColorTheme theme, UUID rewardOfferId, boolean isFromRhfOnboarding, boolean useContentfulApi, String initialSource) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new Platform(source, theme, rewardOfferId, isFromRhfOnboarding, useContentfulApi, initialSource);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Platform)) {
                return false;
            }
            Platform platform = (Platform) other;
            return Intrinsics.areEqual(this.source, platform.source) && this.theme == platform.theme && Intrinsics.areEqual(this.rewardOfferId, platform.rewardOfferId) && this.isFromRhfOnboarding == platform.isFromRhfOnboarding && this.useContentfulApi == platform.useContentfulApi && Intrinsics.areEqual(this.initialSource, platform.initialSource);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.theme.hashCode()) * 31;
            UUID uuid = this.rewardOfferId;
            int iHashCode2 = (((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + Boolean.hashCode(this.isFromRhfOnboarding)) * 31) + Boolean.hashCode(this.useContentfulApi)) * 31;
            String str2 = this.initialSource;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Platform(source=" + this.source + ", theme=" + this.theme + ", rewardOfferId=" + this.rewardOfferId + ", isFromRhfOnboarding=" + this.isFromRhfOnboarding + ", useContentfulApi=" + this.useContentfulApi + ", initialSource=" + this.initialSource + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeString(this.theme.name());
            dest.writeSerializable(this.rewardOfferId);
            dest.writeInt(this.isFromRhfOnboarding ? 1 : 0);
            dest.writeInt(this.useContentfulApi ? 1 : 0);
            dest.writeString(this.initialSource);
        }

        @Override // com.robinhood.android.referral.contracts.RewardOfferIntentKey
        public String getSource() {
            return this.source;
        }

        public /* synthetic */ Platform(String str, ColorTheme colorTheme, UUID uuid, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ColorTheme.DEFAULT : colorTheme, (i & 4) != 0 ? null : uuid, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : str2);
        }

        @Override // com.robinhood.android.referral.contracts.RewardOfferIntentKey
        public ColorTheme getTheme() {
            return this.theme;
        }

        public final UUID getRewardOfferId() {
            return this.rewardOfferId;
        }

        public final boolean isFromRhfOnboarding() {
            return this.isFromRhfOnboarding;
        }

        public final boolean getUseContentfulApi() {
            return this.useContentfulApi;
        }

        public final String getInitialSource() {
            return this.initialSource;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Platform(String str, ColorTheme theme, UUID uuid, boolean z, boolean z2, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.source = str;
            this.theme = theme;
            this.rewardOfferId = uuid;
            this.isFromRhfOnboarding = z;
            this.useContentfulApi = z2;
            this.initialSource = str2;
        }
    }

    /* compiled from: RewardOfferIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey$ReferralOffer;", "Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey;", "source", "", "theme", "Lcom/robinhood/models/api/ColorTheme;", "rewardOfferId", "Ljava/util/UUID;", "instrumentId", "initialSource", "isFromRhfOnboarding", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/ColorTheme;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Z)V", "getSource", "()Ljava/lang/String;", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "getRewardOfferId", "()Ljava/util/UUID;", "getInstrumentId", "getInitialSource", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ReferralOffer extends RewardOfferIntentKey {
        public static final Parcelable.Creator<ReferralOffer> CREATOR = new Creator();
        private final String initialSource;
        private final UUID instrumentId;
        private final boolean isFromRhfOnboarding;
        private final UUID rewardOfferId;
        private final String source;
        private final ColorTheme theme;

        /* compiled from: RewardOfferIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes5.dex */
        public static final class Creator implements Parcelable.Creator<ReferralOffer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReferralOffer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReferralOffer(parcel.readString(), ColorTheme.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReferralOffer[] newArray(int i) {
                return new ReferralOffer[i];
            }
        }

        public static /* synthetic */ ReferralOffer copy$default(ReferralOffer referralOffer, String str, ColorTheme colorTheme, UUID uuid, UUID uuid2, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = referralOffer.source;
            }
            if ((i & 2) != 0) {
                colorTheme = referralOffer.theme;
            }
            if ((i & 4) != 0) {
                uuid = referralOffer.rewardOfferId;
            }
            if ((i & 8) != 0) {
                uuid2 = referralOffer.instrumentId;
            }
            if ((i & 16) != 0) {
                str2 = referralOffer.initialSource;
            }
            if ((i & 32) != 0) {
                z = referralOffer.isFromRhfOnboarding;
            }
            String str3 = str2;
            boolean z2 = z;
            return referralOffer.copy(str, colorTheme, uuid, uuid2, str3, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final ColorTheme getTheme() {
            return this.theme;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getRewardOfferId() {
            return this.rewardOfferId;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getInitialSource() {
            return this.initialSource;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsFromRhfOnboarding() {
            return this.isFromRhfOnboarding;
        }

        public final ReferralOffer copy(String source, ColorTheme theme, UUID rewardOfferId, UUID instrumentId, String initialSource, boolean isFromRhfOnboarding) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(rewardOfferId, "rewardOfferId");
            return new ReferralOffer(source, theme, rewardOfferId, instrumentId, initialSource, isFromRhfOnboarding);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReferralOffer)) {
                return false;
            }
            ReferralOffer referralOffer = (ReferralOffer) other;
            return Intrinsics.areEqual(this.source, referralOffer.source) && this.theme == referralOffer.theme && Intrinsics.areEqual(this.rewardOfferId, referralOffer.rewardOfferId) && Intrinsics.areEqual(this.instrumentId, referralOffer.instrumentId) && Intrinsics.areEqual(this.initialSource, referralOffer.initialSource) && this.isFromRhfOnboarding == referralOffer.isFromRhfOnboarding;
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.theme.hashCode()) * 31) + this.rewardOfferId.hashCode()) * 31;
            UUID uuid = this.instrumentId;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            String str2 = this.initialSource;
            return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFromRhfOnboarding);
        }

        public String toString() {
            return "ReferralOffer(source=" + this.source + ", theme=" + this.theme + ", rewardOfferId=" + this.rewardOfferId + ", instrumentId=" + this.instrumentId + ", initialSource=" + this.initialSource + ", isFromRhfOnboarding=" + this.isFromRhfOnboarding + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeString(this.theme.name());
            dest.writeSerializable(this.rewardOfferId);
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.initialSource);
            dest.writeInt(this.isFromRhfOnboarding ? 1 : 0);
        }

        @Override // com.robinhood.android.referral.contracts.RewardOfferIntentKey
        public String getSource() {
            return this.source;
        }

        public /* synthetic */ ReferralOffer(String str, ColorTheme colorTheme, UUID uuid, UUID uuid2, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ColorTheme.DEFAULT : colorTheme, uuid, (i & 8) != 0 ? null : uuid2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z);
        }

        @Override // com.robinhood.android.referral.contracts.RewardOfferIntentKey
        public ColorTheme getTheme() {
            return this.theme;
        }

        public final UUID getRewardOfferId() {
            return this.rewardOfferId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getInitialSource() {
            return this.initialSource;
        }

        public final boolean isFromRhfOnboarding() {
            return this.isFromRhfOnboarding;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReferralOffer(String str, ColorTheme theme, UUID rewardOfferId, UUID uuid, String str2, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(rewardOfferId, "rewardOfferId");
            this.source = str;
            this.theme = theme;
            this.rewardOfferId = rewardOfferId;
            this.instrumentId = uuid;
            this.initialSource = str2;
            this.isFromRhfOnboarding = z;
        }
    }

    /* compiled from: RewardOfferIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey$PastReferrals;", "Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey$OffersList;", "source", "", "theme", "Lcom/robinhood/models/api/ColorTheme;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/ColorTheme;)V", "getSource", "()Ljava/lang/String;", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PastReferrals extends OffersList {
        public static final Parcelable.Creator<PastReferrals> CREATOR = new Creator();
        private final String source;
        private final ColorTheme theme;

        /* compiled from: RewardOfferIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes5.dex */
        public static final class Creator implements Parcelable.Creator<PastReferrals> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PastReferrals createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PastReferrals(parcel.readString(), ColorTheme.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PastReferrals[] newArray(int i) {
                return new PastReferrals[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PastReferrals() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ PastReferrals copy$default(PastReferrals pastReferrals, String str, ColorTheme colorTheme, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pastReferrals.source;
            }
            if ((i & 2) != 0) {
                colorTheme = pastReferrals.theme;
            }
            return pastReferrals.copy(str, colorTheme);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final ColorTheme getTheme() {
            return this.theme;
        }

        public final PastReferrals copy(String source, ColorTheme theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new PastReferrals(source, theme);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PastReferrals)) {
                return false;
            }
            PastReferrals pastReferrals = (PastReferrals) other;
            return Intrinsics.areEqual(this.source, pastReferrals.source) && this.theme == pastReferrals.theme;
        }

        public int hashCode() {
            String str = this.source;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.theme.hashCode();
        }

        public String toString() {
            return "PastReferrals(source=" + this.source + ", theme=" + this.theme + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeString(this.theme.name());
        }

        @Override // com.robinhood.android.referral.contracts.RewardOfferIntentKey
        public String getSource() {
            return this.source;
        }

        public /* synthetic */ PastReferrals(String str, ColorTheme colorTheme, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ColorTheme.DEFAULT : colorTheme);
        }

        @Override // com.robinhood.android.referral.contracts.RewardOfferIntentKey
        public ColorTheme getTheme() {
            return this.theme;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PastReferrals(String str, ColorTheme theme) {
            super(null);
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.source = str;
            this.theme = theme;
        }
    }
}

package com.robinhood.android.referral.rewardoffers.referralOffer.sdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReferralOfferV2SduiFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/sdui/ReferralOfferV2SduiFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "offerId", "Ljava/util/UUID;", "content", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;)V", "getOfferId", "()Ljava/util/UUID;", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ReferralOfferV2SduiFragmentKey implements FragmentKey, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReferralOfferV2SduiFragmentKey> CREATOR = new Creator();
    private final StandardPageTemplate<GenericAction> content;
    private final UUID offerId;

    /* compiled from: ReferralOfferV2SduiFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ReferralOfferV2SduiFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralOfferV2SduiFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReferralOfferV2SduiFragmentKey((UUID) parcel.readSerializable(), (StandardPageTemplate) parcel.readParcelable(ReferralOfferV2SduiFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralOfferV2SduiFragmentKey[] newArray(int i) {
            return new ReferralOfferV2SduiFragmentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReferralOfferV2SduiFragmentKey copy$default(ReferralOfferV2SduiFragmentKey referralOfferV2SduiFragmentKey, UUID uuid, StandardPageTemplate standardPageTemplate, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = referralOfferV2SduiFragmentKey.offerId;
        }
        if ((i & 2) != 0) {
            standardPageTemplate = referralOfferV2SduiFragmentKey.content;
        }
        return referralOfferV2SduiFragmentKey.copy(uuid, standardPageTemplate);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOfferId() {
        return this.offerId;
    }

    public final StandardPageTemplate<GenericAction> component2() {
        return this.content;
    }

    public final ReferralOfferV2SduiFragmentKey copy(UUID offerId, StandardPageTemplate<? extends GenericAction> content) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(content, "content");
        return new ReferralOfferV2SduiFragmentKey(offerId, content);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralOfferV2SduiFragmentKey)) {
            return false;
        }
        ReferralOfferV2SduiFragmentKey referralOfferV2SduiFragmentKey = (ReferralOfferV2SduiFragmentKey) other;
        return Intrinsics.areEqual(this.offerId, referralOfferV2SduiFragmentKey.offerId) && Intrinsics.areEqual(this.content, referralOfferV2SduiFragmentKey.content);
    }

    public int hashCode() {
        return (this.offerId.hashCode() * 31) + this.content.hashCode();
    }

    public String toString() {
        return "ReferralOfferV2SduiFragmentKey(offerId=" + this.offerId + ", content=" + this.content + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.offerId);
        dest.writeParcelable(this.content, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReferralOfferV2SduiFragmentKey(UUID offerId, StandardPageTemplate<? extends GenericAction> content) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(content, "content");
        this.offerId = offerId;
        this.content = content;
    }

    public final UUID getOfferId() {
        return this.offerId;
    }

    public final StandardPageTemplate<GenericAction> getContent() {
        return this.content;
    }
}

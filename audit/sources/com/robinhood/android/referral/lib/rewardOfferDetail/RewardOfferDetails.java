package com.robinhood.android.referral.lib.rewardOfferDetail;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferButtonAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardOfferDetails.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetails;", "Landroid/os/Parcelable;", "id", "Ljava/util/UUID;", "viewTypes", "", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType;", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferButtonAction;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "<init>", "(Ljava/util/UUID;Ljava/util/List;Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferButtonAction;Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferButtonAction;)V", "getId", "()Ljava/util/UUID;", "getViewTypes", "()Ljava/util/List;", "getPrimaryButton", "()Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferButtonAction;", "getSecondaryButton", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RewardOfferDetails implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RewardOfferDetails> CREATOR = new Creator();
    private final UUID id;
    private final ApiRewardOfferButtonAction primaryButton;
    private final ApiRewardOfferButtonAction secondaryButton;
    private final List<RewardOfferDetailsSectionViewType> viewTypes;

    /* compiled from: RewardOfferDetails.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardOfferDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardOfferDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UUID uuid = (UUID) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(RewardOfferDetails.class.getClassLoader()));
            }
            return new RewardOfferDetails(uuid, arrayList, (ApiRewardOfferButtonAction) parcel.readParcelable(RewardOfferDetails.class.getClassLoader()), (ApiRewardOfferButtonAction) parcel.readParcelable(RewardOfferDetails.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardOfferDetails[] newArray(int i) {
            return new RewardOfferDetails[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.id);
        List<RewardOfferDetailsSectionViewType> list = this.viewTypes;
        dest.writeInt(list.size());
        Iterator<RewardOfferDetailsSectionViewType> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeParcelable(this.primaryButton, flags);
        dest.writeParcelable(this.secondaryButton, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RewardOfferDetails(UUID id, List<? extends RewardOfferDetailsSectionViewType> viewTypes, ApiRewardOfferButtonAction apiRewardOfferButtonAction, ApiRewardOfferButtonAction apiRewardOfferButtonAction2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
        this.id = id;
        this.viewTypes = viewTypes;
        this.primaryButton = apiRewardOfferButtonAction;
        this.secondaryButton = apiRewardOfferButtonAction2;
    }

    public final UUID getId() {
        return this.id;
    }

    public final List<RewardOfferDetailsSectionViewType> getViewTypes() {
        return this.viewTypes;
    }

    public final ApiRewardOfferButtonAction getPrimaryButton() {
        return this.primaryButton;
    }

    public final ApiRewardOfferButtonAction getSecondaryButton() {
        return this.secondaryButton;
    }
}

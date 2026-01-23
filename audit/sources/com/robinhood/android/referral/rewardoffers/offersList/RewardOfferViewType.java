package com.robinhood.android.referral.rewardoffers.offersList;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferRenderingType;
import com.robinhood.models.api.rewardoffer.CompletedData;
import com.robinhood.models.api.rewardoffer.LargeData;
import com.robinhood.models.api.rewardoffer.StandardData;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardOfferViewType.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType;", "Landroid/os/Parcelable;", "type", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferRenderingType$Type;", "<init>", "(Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferRenderingType$Type;)V", "getType", "()Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferRenderingType$Type;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "Large", "Standard", "Completed", "Unsupported", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType$Completed;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType$Large;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType$Standard;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType$Unsupported;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class RewardOfferViewType implements Parcelable {
    public static final int $stable = 0;
    private final ApiRewardOfferRenderingType.Type type;

    public /* synthetic */ RewardOfferViewType(ApiRewardOfferRenderingType.Type type2, DefaultConstructorMarker defaultConstructorMarker) {
        this(type2);
    }

    public abstract UUID getId();

    private RewardOfferViewType(ApiRewardOfferRenderingType.Type type2) {
        this.type = type2;
    }

    public final ApiRewardOfferRenderingType.Type getType() {
        return this.type;
    }

    /* compiled from: RewardOfferViewType.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType$Large;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType;", "id", "Ljava/util/UUID;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/rewardoffer/LargeData;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/rewardoffer/LargeData;)V", "getId", "()Ljava/util/UUID;", "getData", "()Lcom/robinhood/models/api/rewardoffer/LargeData;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Large extends RewardOfferViewType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Large> CREATOR = new Creator();
        private final LargeData data;
        private final UUID id;

        /* compiled from: RewardOfferViewType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Large> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Large createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Large((UUID) parcel.readSerializable(), (LargeData) parcel.readParcelable(Large.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Large[] newArray(int i) {
                return new Large[i];
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
            dest.writeParcelable(this.data, flags);
        }

        @Override // com.robinhood.android.referral.rewardoffers.offersList.RewardOfferViewType
        public UUID getId() {
            return this.id;
        }

        public final LargeData getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Large(UUID id, LargeData data) {
            super(ApiRewardOfferRenderingType.Type.LARGE, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(data, "data");
            this.id = id;
            this.data = data;
        }
    }

    /* compiled from: RewardOfferViewType.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType$Standard;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType;", "id", "Ljava/util/UUID;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/rewardoffer/StandardData;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/rewardoffer/StandardData;)V", "getId", "()Ljava/util/UUID;", "getData", "()Lcom/robinhood/models/api/rewardoffer/StandardData;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Standard extends RewardOfferViewType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Standard> CREATOR = new Creator();
        private final StandardData data;
        private final UUID id;

        /* compiled from: RewardOfferViewType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Standard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Standard createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Standard((UUID) parcel.readSerializable(), (StandardData) parcel.readParcelable(Standard.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Standard[] newArray(int i) {
                return new Standard[i];
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
            dest.writeParcelable(this.data, flags);
        }

        @Override // com.robinhood.android.referral.rewardoffers.offersList.RewardOfferViewType
        public UUID getId() {
            return this.id;
        }

        public final StandardData getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Standard(UUID id, StandardData data) {
            super(ApiRewardOfferRenderingType.Type.STANDARD, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(data, "data");
            this.id = id;
            this.data = data;
        }
    }

    /* compiled from: RewardOfferViewType.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType$Completed;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType;", "id", "Ljava/util/UUID;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/rewardoffer/CompletedData;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/rewardoffer/CompletedData;)V", "getId", "()Ljava/util/UUID;", "getData", "()Lcom/robinhood/models/api/rewardoffer/CompletedData;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Completed extends RewardOfferViewType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Completed> CREATOR = new Creator();
        private final CompletedData data;
        private final UUID id;

        /* compiled from: RewardOfferViewType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Completed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Completed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Completed((UUID) parcel.readSerializable(), (CompletedData) parcel.readParcelable(Completed.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Completed[] newArray(int i) {
                return new Completed[i];
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
            dest.writeParcelable(this.data, flags);
        }

        @Override // com.robinhood.android.referral.rewardoffers.offersList.RewardOfferViewType
        public UUID getId() {
            return this.id;
        }

        public final CompletedData getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(UUID id, CompletedData data) {
            super(ApiRewardOfferRenderingType.Type.COMPLETED, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(data, "data");
            this.id = id;
            this.data = data;
        }
    }

    /* compiled from: RewardOfferViewType.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType$Unsupported;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType;", "id", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Unsupported extends RewardOfferViewType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Unsupported> CREATOR = new Creator();
        private final UUID id;

        /* compiled from: RewardOfferViewType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Unsupported> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unsupported createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unsupported((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unsupported[] newArray(int i) {
                return new Unsupported[i];
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
        }

        @Override // com.robinhood.android.referral.rewardoffers.offersList.RewardOfferViewType
        public UUID getId() {
            return this.id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unsupported(UUID id) {
            super(ApiRewardOfferRenderingType.Type.UNSUPPORTED, null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }
    }
}

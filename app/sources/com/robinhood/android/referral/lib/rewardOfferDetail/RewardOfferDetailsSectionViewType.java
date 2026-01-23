package com.robinhood.android.referral.lib.rewardOfferDetail;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.rewardoffer.AnimatedHeaderData;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetailsSectionRenderingType;
import com.robinhood.models.api.rewardoffer.BulletData;
import com.robinhood.models.api.rewardoffer.ImageHeaderData;
import com.robinhood.models.api.rewardoffer.MarqueeRowData;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardOfferDetailsSectionViewType.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType;", "Landroid/os/Parcelable;", "type", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferDetailsSectionRenderingType$Type;", "<init>", "(Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferDetailsSectionRenderingType$Type;)V", "getType", "()Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferDetailsSectionRenderingType$Type;", "AnimatedHeader", "ImageHeader", "MarqueeRow", "Bullet", "Disclosure", "Unsupported", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType$AnimatedHeader;", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType$Bullet;", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType$Disclosure;", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType$ImageHeader;", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType$MarqueeRow;", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType$Unsupported;", "feature-lib-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class RewardOfferDetailsSectionViewType implements Parcelable {
    public static final int $stable = 0;
    private final ApiRewardOfferDetailsSectionRenderingType.Type type;

    public /* synthetic */ RewardOfferDetailsSectionViewType(ApiRewardOfferDetailsSectionRenderingType.Type type2, DefaultConstructorMarker defaultConstructorMarker) {
        this(type2);
    }

    private RewardOfferDetailsSectionViewType(ApiRewardOfferDetailsSectionRenderingType.Type type2) {
        this.type = type2;
    }

    public final ApiRewardOfferDetailsSectionRenderingType.Type getType() {
        return this.type;
    }

    /* compiled from: RewardOfferDetailsSectionViewType.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType$AnimatedHeader;", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/rewardoffer/AnimatedHeaderData;", "<init>", "(Lcom/robinhood/models/api/rewardoffer/AnimatedHeaderData;)V", "getData", "()Lcom/robinhood/models/api/rewardoffer/AnimatedHeaderData;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AnimatedHeader extends RewardOfferDetailsSectionViewType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<AnimatedHeader> CREATOR = new Creator();
        private final AnimatedHeaderData data;

        /* compiled from: RewardOfferDetailsSectionViewType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AnimatedHeader> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AnimatedHeader createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AnimatedHeader((AnimatedHeaderData) parcel.readParcelable(AnimatedHeader.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AnimatedHeader[] newArray(int i) {
                return new AnimatedHeader[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.data, flags);
        }

        public final AnimatedHeaderData getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimatedHeader(AnimatedHeaderData data) {
            super(ApiRewardOfferDetailsSectionRenderingType.Type.ANIMATED_HEADER, null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }
    }

    /* compiled from: RewardOfferDetailsSectionViewType.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType$ImageHeader;", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/rewardoffer/ImageHeaderData;", "<init>", "(Lcom/robinhood/models/api/rewardoffer/ImageHeaderData;)V", "getData", "()Lcom/robinhood/models/api/rewardoffer/ImageHeaderData;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ImageHeader extends RewardOfferDetailsSectionViewType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ImageHeader> CREATOR = new Creator();
        private final ImageHeaderData data;

        /* compiled from: RewardOfferDetailsSectionViewType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ImageHeader> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ImageHeader createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ImageHeader((ImageHeaderData) parcel.readParcelable(ImageHeader.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ImageHeader[] newArray(int i) {
                return new ImageHeader[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.data, flags);
        }

        public final ImageHeaderData getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageHeader(ImageHeaderData data) {
            super(ApiRewardOfferDetailsSectionRenderingType.Type.IMAGE_HEADER, null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }
    }

    /* compiled from: RewardOfferDetailsSectionViewType.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType$MarqueeRow;", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/rewardoffer/MarqueeRowData;", "<init>", "(Lcom/robinhood/models/api/rewardoffer/MarqueeRowData;)V", "getData", "()Lcom/robinhood/models/api/rewardoffer/MarqueeRowData;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MarqueeRow extends RewardOfferDetailsSectionViewType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<MarqueeRow> CREATOR = new Creator();
        private final MarqueeRowData data;

        /* compiled from: RewardOfferDetailsSectionViewType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MarqueeRow> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarqueeRow createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarqueeRow((MarqueeRowData) parcel.readParcelable(MarqueeRow.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarqueeRow[] newArray(int i) {
                return new MarqueeRow[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.data, flags);
        }

        public final MarqueeRowData getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarqueeRow(MarqueeRowData data) {
            super(ApiRewardOfferDetailsSectionRenderingType.Type.MARQUEE_ROW, null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }
    }

    /* compiled from: RewardOfferDetailsSectionViewType.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType$Bullet;", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/rewardoffer/BulletData;", "<init>", "(Lcom/robinhood/models/api/rewardoffer/BulletData;)V", "getData", "()Lcom/robinhood/models/api/rewardoffer/BulletData;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Bullet extends RewardOfferDetailsSectionViewType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Bullet> CREATOR = new Creator();
        private final BulletData data;

        /* compiled from: RewardOfferDetailsSectionViewType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Bullet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Bullet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bullet((BulletData) parcel.readParcelable(Bullet.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Bullet[] newArray(int i) {
                return new Bullet[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.data, flags);
        }

        public final BulletData getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bullet(BulletData data) {
            super(ApiRewardOfferDetailsSectionRenderingType.Type.BULLET, null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }
    }

    /* compiled from: RewardOfferDetailsSectionViewType.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType$Disclosure;", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/serverdriven/db/RichText;", "<init>", "(Lcom/robinhood/models/serverdriven/db/RichText;)V", "getData", "()Lcom/robinhood/models/serverdriven/db/RichText;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Disclosure extends RewardOfferDetailsSectionViewType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Disclosure> CREATOR = new Creator();
        private final RichText data;

        /* compiled from: RewardOfferDetailsSectionViewType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Disclosure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Disclosure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Disclosure((RichText) parcel.readParcelable(Disclosure.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Disclosure[] newArray(int i) {
                return new Disclosure[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.data, flags);
        }

        public final RichText getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disclosure(RichText data) {
            super(ApiRewardOfferDetailsSectionRenderingType.Type.DISCLOSURE, null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }
    }

    /* compiled from: RewardOfferDetailsSectionViewType.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType$Unsupported;", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Unsupported extends RewardOfferDetailsSectionViewType {
        public static final int $stable = 0;
        public static final Unsupported INSTANCE = new Unsupported();
        public static final Parcelable.Creator<Unsupported> CREATOR = new Creator();

        /* compiled from: RewardOfferDetailsSectionViewType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Unsupported> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unsupported createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unsupported.INSTANCE;
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
            dest.writeInt(1);
        }

        private Unsupported() {
            super(ApiRewardOfferDetailsSectionRenderingType.Type.UNSUPPORTED, null);
        }
    }
}

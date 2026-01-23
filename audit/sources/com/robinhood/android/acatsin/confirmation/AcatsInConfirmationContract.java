package com.robinhood.android.acatsin.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.parceler.EitherParceler;
import com.robinhood.utils.Either;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInConfirmationContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationContract;", "", "<init>", "()V", "Key", "Callbacks", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInConfirmationContract {
    public static final int $stable = 0;
    public static final AcatsInConfirmationContract INSTANCE = new AcatsInConfirmationContract();

    /* compiled from: AcatsInConfirmationContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationContract$Callbacks;", "", "onConfirmationDoneClicked", "", "onViewDetailsClicked", "acatsTransferId", "Ljava/util/UUID;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onConfirmationDoneClicked();

        void onViewDetailsClicked(UUID acatsTransferId);
    }

    private AcatsInConfirmationContract() {
    }

    /* compiled from: AcatsInConfirmationContract.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u000fHÆ\u0003J\t\u0010$\u001a\u00020\u000fHÆ\u0003J[\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\bHÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "acatsTransferId", "Ljava/util/UUID;", "title", "Lcom/robinhood/utils/resource/StringResource;", "description", "showGoldPromoScreen", "", "isFromTransferDetails", "<init>", "(Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;Lcom/robinhood/utils/Either;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZZ)V", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getAcatsTransferId", "()Ljava/util/UUID;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getDescription", "getShowGoldPromoScreen", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final UUID acatsTransferId;
        private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
        private final StringResource description;
        private final boolean isFromTransferDetails;
        private final AcatsInScreenContext screenContext;
        private final boolean showGoldPromoScreen;
        private final StringResource title;

        /* compiled from: AcatsInConfirmationContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                AcatsInScreenContext acatsInScreenContextCreateFromParcel = AcatsInScreenContext.CREATOR.createFromParcel(parcel);
                Either<?, ?> eitherM23663create = EitherParceler.INSTANCE.m23663create(parcel);
                UUID uuid = (UUID) parcel.readSerializable();
                StringResource stringResource = (StringResource) parcel.readParcelable(Key.class.getClassLoader());
                StringResource stringResource2 = (StringResource) parcel.readParcelable(Key.class.getClassLoader());
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new Key(acatsInScreenContextCreateFromParcel, eitherM23663create, uuid, stringResource, stringResource2, z2, parcel.readInt() == 0 ? z : true);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, AcatsInScreenContext acatsInScreenContext, Either either, UUID uuid, StringResource stringResource, StringResource stringResource2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsInScreenContext = key.screenContext;
            }
            if ((i & 2) != 0) {
                either = key.brokerageOrDtcNumber;
            }
            if ((i & 4) != 0) {
                uuid = key.acatsTransferId;
            }
            if ((i & 8) != 0) {
                stringResource = key.title;
            }
            if ((i & 16) != 0) {
                stringResource2 = key.description;
            }
            if ((i & 32) != 0) {
                z = key.showGoldPromoScreen;
            }
            if ((i & 64) != 0) {
                z2 = key.isFromTransferDetails;
            }
            boolean z3 = z;
            boolean z4 = z2;
            StringResource stringResource3 = stringResource2;
            UUID uuid2 = uuid;
            return key.copy(acatsInScreenContext, either, uuid2, stringResource, stringResource3, z3, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Either<ApiBrokerage, String> component2() {
            return this.brokerageOrDtcNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getAcatsTransferId() {
            return this.acatsTransferId;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final StringResource getDescription() {
            return this.description;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowGoldPromoScreen() {
            return this.showGoldPromoScreen;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsFromTransferDetails() {
            return this.isFromTransferDetails;
        }

        public final Key copy(AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, UUID acatsTransferId, StringResource title, StringResource description, boolean showGoldPromoScreen, boolean isFromTransferDetails) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            return new Key(screenContext, brokerageOrDtcNumber, acatsTransferId, title, description, showGoldPromoScreen, isFromTransferDetails);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.screenContext, key.screenContext) && Intrinsics.areEqual(this.brokerageOrDtcNumber, key.brokerageOrDtcNumber) && Intrinsics.areEqual(this.acatsTransferId, key.acatsTransferId) && Intrinsics.areEqual(this.title, key.title) && Intrinsics.areEqual(this.description, key.description) && this.showGoldPromoScreen == key.showGoldPromoScreen && this.isFromTransferDetails == key.isFromTransferDetails;
        }

        public int hashCode() {
            return (((((((((((this.screenContext.hashCode() * 31) + this.brokerageOrDtcNumber.hashCode()) * 31) + this.acatsTransferId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.showGoldPromoScreen)) * 31) + Boolean.hashCode(this.isFromTransferDetails);
        }

        public String toString() {
            return "Key(screenContext=" + this.screenContext + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", acatsTransferId=" + this.acatsTransferId + ", title=" + this.title + ", description=" + this.description + ", showGoldPromoScreen=" + this.showGoldPromoScreen + ", isFromTransferDetails=" + this.isFromTransferDetails + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.screenContext.writeToParcel(dest, flags);
            EitherParceler.INSTANCE.write((Either<?, ?>) this.brokerageOrDtcNumber, dest, flags);
            dest.writeSerializable(this.acatsTransferId);
            dest.writeParcelable(this.title, flags);
            dest.writeParcelable(this.description, flags);
            dest.writeInt(this.showGoldPromoScreen ? 1 : 0);
            dest.writeInt(this.isFromTransferDetails ? 1 : 0);
        }

        public Key(AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, UUID acatsTransferId, StringResource title, StringResource description, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.screenContext = screenContext;
            this.brokerageOrDtcNumber = brokerageOrDtcNumber;
            this.acatsTransferId = acatsTransferId;
            this.title = title;
            this.description = description;
            this.showGoldPromoScreen = z;
            this.isFromTransferDetails = z2;
        }

        public /* synthetic */ Key(AcatsInScreenContext acatsInScreenContext, Either either, UUID uuid, StringResource stringResource, StringResource stringResource2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(acatsInScreenContext, either, uuid, stringResource, stringResource2, z, (i & 64) != 0 ? false : z2);
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
            return this.brokerageOrDtcNumber;
        }

        public final UUID getAcatsTransferId() {
            return this.acatsTransferId;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getDescription() {
            return this.description;
        }

        public final boolean getShowGoldPromoScreen() {
            return this.showGoldPromoScreen;
        }

        public final boolean isFromTransferDetails() {
            return this.isFromTransferDetails;
        }
    }
}

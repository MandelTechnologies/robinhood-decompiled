package com.robinhood.shared.support.contracts.pathfinder;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailConfirmationFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/pathfinder/EmailConfirmationFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "ObfuscatedEmailV3", "ShowFullEmailV3", "Lcom/robinhood/shared/support/contracts/pathfinder/EmailConfirmationFragmentKey$ObfuscatedEmailV3;", "Lcom/robinhood/shared/support/contracts/pathfinder/EmailConfirmationFragmentKey$ShowFullEmailV3;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public abstract class EmailConfirmationFragmentKey implements FragmentKey {
    private final UUID inquiryId;
    private final UserViewState.Page<?> userViewState;

    public /* synthetic */ EmailConfirmationFragmentKey(UUID uuid, UserViewState.Page page, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, page);
    }

    private EmailConfirmationFragmentKey(UUID uuid, UserViewState.Page<?> page) {
        this.inquiryId = uuid;
        this.userViewState = page;
    }

    public UUID getInquiryId() {
        return this.inquiryId;
    }

    public UserViewState.Page<?> getUserViewState() {
        return this.userViewState;
    }

    /* compiled from: EmailConfirmationFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/pathfinder/EmailConfirmationFragmentKey$ObfuscatedEmailV3;", "Lcom/robinhood/shared/support/contracts/pathfinder/EmailConfirmationFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$ObfuscatedEmailV3;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ObfuscatedEmailV3 extends EmailConfirmationFragmentKey {
        public static final Parcelable.Creator<ObfuscatedEmailV3> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.ObfuscatedEmailV3> userViewState;

        /* compiled from: EmailConfirmationFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<ObfuscatedEmailV3> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ObfuscatedEmailV3 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ObfuscatedEmailV3((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(ObfuscatedEmailV3.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ObfuscatedEmailV3[] newArray(int i) {
                return new ObfuscatedEmailV3[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        @Override // com.robinhood.shared.support.contracts.pathfinder.EmailConfirmationFragmentKey
        public UUID getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.robinhood.shared.support.contracts.pathfinder.EmailConfirmationFragmentKey
        public UserViewState.Page<UserViewStatePageContext.ObfuscatedEmailV3> getUserViewState() {
            return this.userViewState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ObfuscatedEmailV3(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.ObfuscatedEmailV3> userViewState) {
            super(inquiryId, userViewState, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }
    }

    /* compiled from: EmailConfirmationFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/pathfinder/EmailConfirmationFragmentKey$ShowFullEmailV3;", "Lcom/robinhood/shared/support/contracts/pathfinder/EmailConfirmationFragmentKey;", "inquiryId", "Ljava/util/UUID;", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$ShowFullEmailV3;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowFullEmailV3 extends EmailConfirmationFragmentKey {
        public static final Parcelable.Creator<ShowFullEmailV3> CREATOR = new Creator();
        private final UUID inquiryId;
        private final UserViewState.Page<UserViewStatePageContext.ShowFullEmailV3> userViewState;

        /* compiled from: EmailConfirmationFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<ShowFullEmailV3> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowFullEmailV3 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowFullEmailV3((UUID) parcel.readSerializable(), (UserViewState.Page) parcel.readParcelable(ShowFullEmailV3.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowFullEmailV3[] newArray(int i) {
                return new ShowFullEmailV3[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.userViewState, flags);
        }

        @Override // com.robinhood.shared.support.contracts.pathfinder.EmailConfirmationFragmentKey
        public UUID getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.robinhood.shared.support.contracts.pathfinder.EmailConfirmationFragmentKey
        public UserViewState.Page<UserViewStatePageContext.ShowFullEmailV3> getUserViewState() {
            return this.userViewState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowFullEmailV3(UUID inquiryId, UserViewState.Page<UserViewStatePageContext.ShowFullEmailV3> userViewState) {
            super(inquiryId, userViewState, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(userViewState, "userViewState");
            this.inquiryId = inquiryId;
            this.userViewState = userViewState;
        }
    }
}

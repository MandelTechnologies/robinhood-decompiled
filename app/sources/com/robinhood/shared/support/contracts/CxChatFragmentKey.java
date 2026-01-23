package com.robinhood.shared.support.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CxChatFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0012\u0010\u0007\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/CxChatFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "isFromInitializationFlow", "", "()Z", "hideBackButton", "getHideBackButton", "navigateBackWhenChatEnded", "getNavigateBackWhenChatEnded", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "Pathfinder", "InquiryId", "NewChat", "Lcom/robinhood/shared/support/contracts/CxChatFragmentKey$InquiryId;", "Lcom/robinhood/shared/support/contracts/CxChatFragmentKey$NewChat;", "Lcom/robinhood/shared/support/contracts/CxChatFragmentKey$Pathfinder;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface CxChatFragmentKey extends FragmentKey {
    String getAccountNumber();

    boolean getHideBackButton();

    boolean getNavigateBackWhenChatEnded();

    /* renamed from: isFromInitializationFlow */
    boolean getIsFromInitializationFlow();

    /* compiled from: CxChatFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020!HÖ\u0001J\t\u0010&\u001a\u00020\nHÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00158F¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006,"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/CxChatFragmentKey$Pathfinder;", "Lcom/robinhood/shared/support/contracts/CxChatFragmentKey;", "page", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SupportChat;", "isFromInitializationFlow", "", "hideBackButton", "navigateBackWhenChatEnded", "accountNumber", "", "<init>", "(Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;ZZZLjava/lang/String;)V", "getPage", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "()Z", "getHideBackButton", "getNavigateBackWhenChatEnded", "getAccountNumber", "()Ljava/lang/String;", "inquiryId", "Ljava/util/UUID;", "getInquiryId$annotations", "()V", "getInquiryId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Pathfinder implements CxChatFragmentKey {
        public static final Parcelable.Creator<Pathfinder> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean hideBackButton;
        private final boolean isFromInitializationFlow;
        private final boolean navigateBackWhenChatEnded;
        private final UserViewState.Page<UserViewStatePageContext.SupportChat> page;

        /* compiled from: CxChatFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Pathfinder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Pathfinder createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UserViewState.Page page = (UserViewState.Page) parcel.readParcelable(Pathfinder.class.getClassLoader());
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new Pathfinder(page, z3, z4, z2, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Pathfinder[] newArray(int i) {
                return new Pathfinder[i];
            }
        }

        public static /* synthetic */ Pathfinder copy$default(Pathfinder pathfinder, UserViewState.Page page, boolean z, boolean z2, boolean z3, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                page = pathfinder.page;
            }
            if ((i & 2) != 0) {
                z = pathfinder.isFromInitializationFlow;
            }
            if ((i & 4) != 0) {
                z2 = pathfinder.hideBackButton;
            }
            if ((i & 8) != 0) {
                z3 = pathfinder.navigateBackWhenChatEnded;
            }
            if ((i & 16) != 0) {
                str = pathfinder.accountNumber;
            }
            String str2 = str;
            boolean z4 = z2;
            return pathfinder.copy(page, z, z4, z3, str2);
        }

        public static /* synthetic */ void getInquiryId$annotations() {
        }

        public final UserViewState.Page<UserViewStatePageContext.SupportChat> component1() {
            return this.page;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFromInitializationFlow() {
            return this.isFromInitializationFlow;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHideBackButton() {
            return this.hideBackButton;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getNavigateBackWhenChatEnded() {
            return this.navigateBackWhenChatEnded;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Pathfinder copy(UserViewState.Page<UserViewStatePageContext.SupportChat> page, boolean isFromInitializationFlow, boolean hideBackButton, boolean navigateBackWhenChatEnded, String accountNumber) {
            Intrinsics.checkNotNullParameter(page, "page");
            return new Pathfinder(page, isFromInitializationFlow, hideBackButton, navigateBackWhenChatEnded, accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pathfinder)) {
                return false;
            }
            Pathfinder pathfinder = (Pathfinder) other;
            return Intrinsics.areEqual(this.page, pathfinder.page) && this.isFromInitializationFlow == pathfinder.isFromInitializationFlow && this.hideBackButton == pathfinder.hideBackButton && this.navigateBackWhenChatEnded == pathfinder.navigateBackWhenChatEnded && Intrinsics.areEqual(this.accountNumber, pathfinder.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((((((this.page.hashCode() * 31) + Boolean.hashCode(this.isFromInitializationFlow)) * 31) + Boolean.hashCode(this.hideBackButton)) * 31) + Boolean.hashCode(this.navigateBackWhenChatEnded)) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Pathfinder(page=" + this.page + ", isFromInitializationFlow=" + this.isFromInitializationFlow + ", hideBackButton=" + this.hideBackButton + ", navigateBackWhenChatEnded=" + this.navigateBackWhenChatEnded + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.page, flags);
            dest.writeInt(this.isFromInitializationFlow ? 1 : 0);
            dest.writeInt(this.hideBackButton ? 1 : 0);
            dest.writeInt(this.navigateBackWhenChatEnded ? 1 : 0);
            dest.writeString(this.accountNumber);
        }

        public Pathfinder(UserViewState.Page<UserViewStatePageContext.SupportChat> page, boolean z, boolean z2, boolean z3, String str) {
            Intrinsics.checkNotNullParameter(page, "page");
            this.page = page;
            this.isFromInitializationFlow = z;
            this.hideBackButton = z2;
            this.navigateBackWhenChatEnded = z3;
            this.accountNumber = str;
        }

        public /* synthetic */ Pathfinder(UserViewState.Page page, boolean z, boolean z2, boolean z3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(page, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : str);
        }

        public final UserViewState.Page<UserViewStatePageContext.SupportChat> getPage() {
            return this.page;
        }

        @Override // com.robinhood.shared.support.contracts.CxChatFragmentKey
        /* renamed from: isFromInitializationFlow */
        public boolean getIsFromInitializationFlow() {
            return this.isFromInitializationFlow;
        }

        @Override // com.robinhood.shared.support.contracts.CxChatFragmentKey
        public boolean getHideBackButton() {
            return this.hideBackButton;
        }

        @Override // com.robinhood.shared.support.contracts.CxChatFragmentKey
        public boolean getNavigateBackWhenChatEnded() {
            return this.navigateBackWhenChatEnded;
        }

        @Override // com.robinhood.shared.support.contracts.CxChatFragmentKey
        public String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getInquiryId() {
            return ((UserViewStatePageContext.SupportChat) this.page.getTypeContext()).getContext().getSupportChat().getInquiryId();
        }
    }

    /* compiled from: CxChatFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/CxChatFragmentKey$InquiryId;", "Lcom/robinhood/shared/support/contracts/CxChatFragmentKey;", "inquiryId", "Ljava/util/UUID;", "isFromInitializationFlow", "", "hideBackButton", "navigateBackWhenChatEnded", "accountNumber", "", "<init>", "(Ljava/util/UUID;ZZZLjava/lang/String;)V", "getInquiryId", "()Ljava/util/UUID;", "()Z", "getHideBackButton", "getNavigateBackWhenChatEnded", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InquiryId implements CxChatFragmentKey {
        public static final Parcelable.Creator<InquiryId> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean hideBackButton;
        private final UUID inquiryId;
        private final boolean isFromInitializationFlow;
        private final boolean navigateBackWhenChatEnded;

        /* compiled from: CxChatFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<InquiryId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InquiryId createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new InquiryId(uuid, z3, z4, z2, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InquiryId[] newArray(int i) {
                return new InquiryId[i];
            }
        }

        public static /* synthetic */ InquiryId copy$default(InquiryId inquiryId, UUID uuid, boolean z, boolean z2, boolean z3, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = inquiryId.inquiryId;
            }
            if ((i & 2) != 0) {
                z = inquiryId.isFromInitializationFlow;
            }
            if ((i & 4) != 0) {
                z2 = inquiryId.hideBackButton;
            }
            if ((i & 8) != 0) {
                z3 = inquiryId.navigateBackWhenChatEnded;
            }
            if ((i & 16) != 0) {
                str = inquiryId.accountNumber;
            }
            String str2 = str;
            boolean z4 = z2;
            return inquiryId.copy(uuid, z, z4, z3, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFromInitializationFlow() {
            return this.isFromInitializationFlow;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHideBackButton() {
            return this.hideBackButton;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getNavigateBackWhenChatEnded() {
            return this.navigateBackWhenChatEnded;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final InquiryId copy(UUID inquiryId, boolean isFromInitializationFlow, boolean hideBackButton, boolean navigateBackWhenChatEnded, String accountNumber) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            return new InquiryId(inquiryId, isFromInitializationFlow, hideBackButton, navigateBackWhenChatEnded, accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryId)) {
                return false;
            }
            InquiryId inquiryId = (InquiryId) other;
            return Intrinsics.areEqual(this.inquiryId, inquiryId.inquiryId) && this.isFromInitializationFlow == inquiryId.isFromInitializationFlow && this.hideBackButton == inquiryId.hideBackButton && this.navigateBackWhenChatEnded == inquiryId.navigateBackWhenChatEnded && Intrinsics.areEqual(this.accountNumber, inquiryId.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((((((this.inquiryId.hashCode() * 31) + Boolean.hashCode(this.isFromInitializationFlow)) * 31) + Boolean.hashCode(this.hideBackButton)) * 31) + Boolean.hashCode(this.navigateBackWhenChatEnded)) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "InquiryId(inquiryId=" + this.inquiryId + ", isFromInitializationFlow=" + this.isFromInitializationFlow + ", hideBackButton=" + this.hideBackButton + ", navigateBackWhenChatEnded=" + this.navigateBackWhenChatEnded + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeInt(this.isFromInitializationFlow ? 1 : 0);
            dest.writeInt(this.hideBackButton ? 1 : 0);
            dest.writeInt(this.navigateBackWhenChatEnded ? 1 : 0);
            dest.writeString(this.accountNumber);
        }

        public InquiryId(UUID inquiryId, boolean z, boolean z2, boolean z3, String str) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            this.inquiryId = inquiryId;
            this.isFromInitializationFlow = z;
            this.hideBackButton = z2;
            this.navigateBackWhenChatEnded = z3;
            this.accountNumber = str;
        }

        public /* synthetic */ InquiryId(UUID uuid, boolean z, boolean z2, boolean z3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : str);
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.robinhood.shared.support.contracts.CxChatFragmentKey
        /* renamed from: isFromInitializationFlow */
        public boolean getIsFromInitializationFlow() {
            return this.isFromInitializationFlow;
        }

        @Override // com.robinhood.shared.support.contracts.CxChatFragmentKey
        public boolean getHideBackButton() {
            return this.hideBackButton;
        }

        @Override // com.robinhood.shared.support.contracts.CxChatFragmentKey
        public boolean getNavigateBackWhenChatEnded() {
            return this.navigateBackWhenChatEnded;
        }

        @Override // com.robinhood.shared.support.contracts.CxChatFragmentKey
        public String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: CxChatFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0003X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\n¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/CxChatFragmentKey$NewChat;", "Lcom/robinhood/shared/support/contracts/CxChatFragmentKey;", "isChatbot", "", "hideBackButton", "navigateBackWhenChatEnded", "accountNumber", "", "<init>", "(ZZZLjava/lang/String;)V", "()Z", "getHideBackButton", "getNavigateBackWhenChatEnded", "getAccountNumber", "()Ljava/lang/String;", "isFromInitializationFlow", "isFromInitializationFlow$annotations", "()V", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NewChat implements CxChatFragmentKey {
        public static final Parcelable.Creator<NewChat> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean hideBackButton;
        private final boolean isChatbot;
        private final boolean isFromInitializationFlow;
        private final boolean navigateBackWhenChatEnded;

        /* compiled from: CxChatFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<NewChat> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewChat createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewChat(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewChat[] newArray(int i) {
                return new NewChat[i];
            }
        }

        public NewChat() {
            this(false, false, false, null, 15, null);
        }

        public static /* synthetic */ NewChat copy$default(NewChat newChat, boolean z, boolean z2, boolean z3, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = newChat.isChatbot;
            }
            if ((i & 2) != 0) {
                z2 = newChat.hideBackButton;
            }
            if ((i & 4) != 0) {
                z3 = newChat.navigateBackWhenChatEnded;
            }
            if ((i & 8) != 0) {
                str = newChat.accountNumber;
            }
            return newChat.copy(z, z2, z3, str);
        }

        public static /* synthetic */ void isFromInitializationFlow$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsChatbot() {
            return this.isChatbot;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHideBackButton() {
            return this.hideBackButton;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getNavigateBackWhenChatEnded() {
            return this.navigateBackWhenChatEnded;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final NewChat copy(boolean isChatbot, boolean hideBackButton, boolean navigateBackWhenChatEnded, String accountNumber) {
            return new NewChat(isChatbot, hideBackButton, navigateBackWhenChatEnded, accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewChat)) {
                return false;
            }
            NewChat newChat = (NewChat) other;
            return this.isChatbot == newChat.isChatbot && this.hideBackButton == newChat.hideBackButton && this.navigateBackWhenChatEnded == newChat.navigateBackWhenChatEnded && Intrinsics.areEqual(this.accountNumber, newChat.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isChatbot) * 31) + Boolean.hashCode(this.hideBackButton)) * 31) + Boolean.hashCode(this.navigateBackWhenChatEnded)) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "NewChat(isChatbot=" + this.isChatbot + ", hideBackButton=" + this.hideBackButton + ", navigateBackWhenChatEnded=" + this.navigateBackWhenChatEnded + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isChatbot ? 1 : 0);
            dest.writeInt(this.hideBackButton ? 1 : 0);
            dest.writeInt(this.navigateBackWhenChatEnded ? 1 : 0);
            dest.writeString(this.accountNumber);
        }

        public NewChat(boolean z, boolean z2, boolean z3, String str) {
            this.isChatbot = z;
            this.hideBackButton = z2;
            this.navigateBackWhenChatEnded = z3;
            this.accountNumber = str;
            this.isFromInitializationFlow = true;
        }

        public /* synthetic */ NewChat(boolean z, boolean z2, boolean z3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : str);
        }

        public final boolean isChatbot() {
            return this.isChatbot;
        }

        @Override // com.robinhood.shared.support.contracts.CxChatFragmentKey
        public boolean getHideBackButton() {
            return this.hideBackButton;
        }

        @Override // com.robinhood.shared.support.contracts.CxChatFragmentKey
        public boolean getNavigateBackWhenChatEnded() {
            return this.navigateBackWhenChatEnded;
        }

        @Override // com.robinhood.shared.support.contracts.CxChatFragmentKey
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.shared.support.contracts.CxChatFragmentKey
        /* renamed from: isFromInitializationFlow, reason: from getter */
        public boolean getIsFromInitializationFlow() {
            return this.isFromInitializationFlow;
        }
    }
}

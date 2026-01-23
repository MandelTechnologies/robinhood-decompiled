package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IraContributionQuestionnaireLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode;", "Landroid/os/Parcelable;", "AccountRequired", "FullQuestionnaire", "EditContributionType", "EditTaxYear", "SelectionStyle", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$AccountRequired;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$EditTaxYear;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface IraContributionQuestionnaireLaunchMode extends Parcelable {

    /* compiled from: IraContributionQuestionnaireLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$AccountRequired;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode;", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$EditContributionType;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$FullQuestionnaire;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface AccountRequired extends IraContributionQuestionnaireLaunchMode {
        TransferAccount getTransferAccount();
    }

    /* compiled from: IraContributionQuestionnaireLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$FullQuestionnaire;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$AccountRequired;", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FullQuestionnaire implements AccountRequired {
        public static final Parcelable.Creator<FullQuestionnaire> CREATOR = new Creator();
        private final TransferAccount transferAccount;

        /* compiled from: IraContributionQuestionnaireLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FullQuestionnaire> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FullQuestionnaire createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FullQuestionnaire((TransferAccount) parcel.readParcelable(FullQuestionnaire.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FullQuestionnaire[] newArray(int i) {
                return new FullQuestionnaire[i];
            }
        }

        public static /* synthetic */ FullQuestionnaire copy$default(FullQuestionnaire fullQuestionnaire, TransferAccount transferAccount, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccount = fullQuestionnaire.transferAccount;
            }
            return fullQuestionnaire.copy(transferAccount);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccount getTransferAccount() {
            return this.transferAccount;
        }

        public final FullQuestionnaire copy(TransferAccount transferAccount) {
            Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
            return new FullQuestionnaire(transferAccount);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FullQuestionnaire) && Intrinsics.areEqual(this.transferAccount, ((FullQuestionnaire) other).transferAccount);
        }

        public int hashCode() {
            return this.transferAccount.hashCode();
        }

        public String toString() {
            return "FullQuestionnaire(transferAccount=" + this.transferAccount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.transferAccount, flags);
        }

        public FullQuestionnaire(TransferAccount transferAccount) {
            Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
            this.transferAccount = transferAccount;
        }

        @Override // com.robinhood.android.transfers.contracts.IraContributionQuestionnaireLaunchMode.AccountRequired
        public TransferAccount getTransferAccount() {
            return this.transferAccount;
        }
    }

    /* compiled from: IraContributionQuestionnaireLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$EditContributionType;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$AccountRequired;", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "currentContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/IraContributionType;)V", "getTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getCurrentContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EditContributionType implements AccountRequired {
        public static final Parcelable.Creator<EditContributionType> CREATOR = new Creator();
        private final IraContributionType currentContributionType;
        private final TransferAccount transferAccount;

        /* compiled from: IraContributionQuestionnaireLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<EditContributionType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EditContributionType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditContributionType((TransferAccount) parcel.readParcelable(EditContributionType.class.getClassLoader()), IraContributionType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EditContributionType[] newArray(int i) {
                return new EditContributionType[i];
            }
        }

        public static /* synthetic */ EditContributionType copy$default(EditContributionType editContributionType, TransferAccount transferAccount, IraContributionType iraContributionType, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccount = editContributionType.transferAccount;
            }
            if ((i & 2) != 0) {
                iraContributionType = editContributionType.currentContributionType;
            }
            return editContributionType.copy(transferAccount, iraContributionType);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccount getTransferAccount() {
            return this.transferAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final IraContributionType getCurrentContributionType() {
            return this.currentContributionType;
        }

        public final EditContributionType copy(TransferAccount transferAccount, IraContributionType currentContributionType) {
            Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
            Intrinsics.checkNotNullParameter(currentContributionType, "currentContributionType");
            return new EditContributionType(transferAccount, currentContributionType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditContributionType)) {
                return false;
            }
            EditContributionType editContributionType = (EditContributionType) other;
            return Intrinsics.areEqual(this.transferAccount, editContributionType.transferAccount) && this.currentContributionType == editContributionType.currentContributionType;
        }

        public int hashCode() {
            return (this.transferAccount.hashCode() * 31) + this.currentContributionType.hashCode();
        }

        public String toString() {
            return "EditContributionType(transferAccount=" + this.transferAccount + ", currentContributionType=" + this.currentContributionType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.transferAccount, flags);
            dest.writeString(this.currentContributionType.name());
        }

        public EditContributionType(TransferAccount transferAccount, IraContributionType currentContributionType) {
            Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
            Intrinsics.checkNotNullParameter(currentContributionType, "currentContributionType");
            this.transferAccount = transferAccount;
            this.currentContributionType = currentContributionType;
        }

        @Override // com.robinhood.android.transfers.contracts.IraContributionQuestionnaireLaunchMode.AccountRequired
        public TransferAccount getTransferAccount() {
            return this.transferAccount;
        }

        public final IraContributionType getCurrentContributionType() {
            return this.currentContributionType;
        }
    }

    /* compiled from: IraContributionQuestionnaireLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$EditTaxYear;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode;", "selectionStyle", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;", "<init>", "(Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;)V", "getSelectionStyle", "()Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EditTaxYear implements IraContributionQuestionnaireLaunchMode {
        public static final Parcelable.Creator<EditTaxYear> CREATOR = new Creator();
        private final SelectionStyle selectionStyle;

        /* compiled from: IraContributionQuestionnaireLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<EditTaxYear> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EditTaxYear createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditTaxYear(SelectionStyle.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EditTaxYear[] newArray(int i) {
                return new EditTaxYear[i];
            }
        }

        public static /* synthetic */ EditTaxYear copy$default(EditTaxYear editTaxYear, SelectionStyle selectionStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                selectionStyle = editTaxYear.selectionStyle;
            }
            return editTaxYear.copy(selectionStyle);
        }

        /* renamed from: component1, reason: from getter */
        public final SelectionStyle getSelectionStyle() {
            return this.selectionStyle;
        }

        public final EditTaxYear copy(SelectionStyle selectionStyle) {
            Intrinsics.checkNotNullParameter(selectionStyle, "selectionStyle");
            return new EditTaxYear(selectionStyle);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EditTaxYear) && this.selectionStyle == ((EditTaxYear) other).selectionStyle;
        }

        public int hashCode() {
            return this.selectionStyle.hashCode();
        }

        public String toString() {
            return "EditTaxYear(selectionStyle=" + this.selectionStyle + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.selectionStyle.name());
        }

        public EditTaxYear(SelectionStyle selectionStyle) {
            Intrinsics.checkNotNullParameter(selectionStyle, "selectionStyle");
            this.selectionStyle = selectionStyle;
        }

        public final SelectionStyle getSelectionStyle() {
            return this.selectionStyle;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IraContributionQuestionnaireLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;", "", "<init>", "(Ljava/lang/String;I)V", "NAVIGATION_ROW", "RADIO_BUTTON", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SelectionStyle {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SelectionStyle[] $VALUES;
        public static final SelectionStyle NAVIGATION_ROW = new SelectionStyle("NAVIGATION_ROW", 0);
        public static final SelectionStyle RADIO_BUTTON = new SelectionStyle("RADIO_BUTTON", 1);

        private static final /* synthetic */ SelectionStyle[] $values() {
            return new SelectionStyle[]{NAVIGATION_ROW, RADIO_BUTTON};
        }

        public static EnumEntries<SelectionStyle> getEntries() {
            return $ENTRIES;
        }

        private SelectionStyle(String str, int i) {
        }

        static {
            SelectionStyle[] selectionStyleArr$values = $values();
            $VALUES = selectionStyleArr$values;
            $ENTRIES = EnumEntries2.enumEntries(selectionStyleArr$values);
        }

        public static SelectionStyle valueOf(String str) {
            return (SelectionStyle) Enum.valueOf(SelectionStyle.class, str);
        }

        public static SelectionStyle[] values() {
            return (SelectionStyle[]) $VALUES.clone();
        }
    }
}

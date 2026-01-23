package com.robinhood.android.equities.contracts.screeners;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SaveScreenerContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract;", "", "<init>", "()V", "Key", "SaveType", "Callbacks", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class SaveScreenerContract {
    public static final SaveScreenerContract INSTANCE = new SaveScreenerContract();

    /* compiled from: SaveScreenerContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$Callbacks;", "", "onScreenerSaved", "", "id", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onScreenerSaved(String id);
    }

    private SaveScreenerContract() {
    }

    /* compiled from: SaveScreenerContract.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$Key;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "saveType", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType;", "<init>", "(Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType;)V", "getSaveType", "()Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements DialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final SaveType saveType;

        /* compiled from: SaveScreenerContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key((SaveType) parcel.readParcelable(Key.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, SaveType saveType, int i, Object obj) {
            if ((i & 1) != 0) {
                saveType = key.saveType;
            }
            return key.copy(saveType);
        }

        /* renamed from: component1, reason: from getter */
        public final SaveType getSaveType() {
            return this.saveType;
        }

        public final Key copy(SaveType saveType) {
            Intrinsics.checkNotNullParameter(saveType, "saveType");
            return new Key(saveType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Key) && Intrinsics.areEqual(this.saveType, ((Key) other).saveType);
        }

        public int hashCode() {
            return this.saveType.hashCode();
        }

        public String toString() {
            return "Key(saveType=" + this.saveType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.saveType, flags);
        }

        public Key(SaveType saveType) {
            Intrinsics.checkNotNullParameter(saveType, "saveType");
            this.saveType = saveType;
        }

        public final SaveType getSaveType() {
            return this.saveType;
        }
    }

    /* compiled from: SaveScreenerContract.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType;", "Landroid/os/Parcelable;", "Save", "SaveAs", "EditName", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType$EditName;", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType$Save;", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType$SaveAs;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface SaveType extends Parcelable {

        /* compiled from: SaveScreenerContract.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType$Save;", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType;", "localScreenerId", "", "<init>", "(Ljava/lang/String;)V", "getLocalScreenerId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Save implements SaveType {
            public static final Parcelable.Creator<Save> CREATOR = new Creator();
            private final String localScreenerId;

            /* compiled from: SaveScreenerContract.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Save> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Save createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Save(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Save[] newArray(int i) {
                    return new Save[i];
                }
            }

            public static /* synthetic */ Save copy$default(Save save, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = save.localScreenerId;
                }
                return save.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getLocalScreenerId() {
                return this.localScreenerId;
            }

            public final Save copy(String localScreenerId) {
                return new Save(localScreenerId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Save) && Intrinsics.areEqual(this.localScreenerId, ((Save) other).localScreenerId);
            }

            public int hashCode() {
                String str = this.localScreenerId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Save(localScreenerId=" + this.localScreenerId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.localScreenerId);
            }

            public Save(String str) {
                this.localScreenerId = str;
            }

            public final String getLocalScreenerId() {
                return this.localScreenerId;
            }
        }

        /* compiled from: SaveScreenerContract.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType$SaveAs;", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType;", "localScreenerId", "", "<init>", "(Ljava/lang/String;)V", "getLocalScreenerId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SaveAs implements SaveType {
            public static final Parcelable.Creator<SaveAs> CREATOR = new Creator();
            private final String localScreenerId;

            /* compiled from: SaveScreenerContract.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<SaveAs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SaveAs createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SaveAs(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SaveAs[] newArray(int i) {
                    return new SaveAs[i];
                }
            }

            public static /* synthetic */ SaveAs copy$default(SaveAs saveAs, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = saveAs.localScreenerId;
                }
                return saveAs.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getLocalScreenerId() {
                return this.localScreenerId;
            }

            public final SaveAs copy(String localScreenerId) {
                Intrinsics.checkNotNullParameter(localScreenerId, "localScreenerId");
                return new SaveAs(localScreenerId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SaveAs) && Intrinsics.areEqual(this.localScreenerId, ((SaveAs) other).localScreenerId);
            }

            public int hashCode() {
                return this.localScreenerId.hashCode();
            }

            public String toString() {
                return "SaveAs(localScreenerId=" + this.localScreenerId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.localScreenerId);
            }

            public SaveAs(String localScreenerId) {
                Intrinsics.checkNotNullParameter(localScreenerId, "localScreenerId");
                this.localScreenerId = localScreenerId;
            }

            public final String getLocalScreenerId() {
                return this.localScreenerId;
            }
        }

        /* compiled from: SaveScreenerContract.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType$EditName;", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$SaveType;", "screenerId", "", "<init>", "(Ljava/lang/String;)V", "getScreenerId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EditName implements SaveType {
            public static final Parcelable.Creator<EditName> CREATOR = new Creator();
            private final String screenerId;

            /* compiled from: SaveScreenerContract.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<EditName> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EditName createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new EditName(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EditName[] newArray(int i) {
                    return new EditName[i];
                }
            }

            public static /* synthetic */ EditName copy$default(EditName editName, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = editName.screenerId;
                }
                return editName.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getScreenerId() {
                return this.screenerId;
            }

            public final EditName copy(String screenerId) {
                Intrinsics.checkNotNullParameter(screenerId, "screenerId");
                return new EditName(screenerId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EditName) && Intrinsics.areEqual(this.screenerId, ((EditName) other).screenerId);
            }

            public int hashCode() {
                return this.screenerId.hashCode();
            }

            public String toString() {
                return "EditName(screenerId=" + this.screenerId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.screenerId);
            }

            public EditName(String screenerId) {
                Intrinsics.checkNotNullParameter(screenerId, "screenerId");
                this.screenerId = screenerId;
            }

            public final String getScreenerId() {
                return this.screenerId;
            }
        }
    }
}

package com.robinhood.android.portfolio.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.portfolio.api.AccountMarketValuesType;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountMarketValuesContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/robinhood/android/portfolio/contracts/AccountMarketValuesContract;", "", "Key", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface AccountMarketValuesContract {

    /* compiled from: AccountMarketValuesContract.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/contracts/AccountMarketValuesContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "accountNumber", "", "type", "Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "displaySpan", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getType", "()Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "getDisplaySpan", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey {
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final String accountNumber;
        private final String displaySpan;
        private final AccountMarketValuesType type;

        /* compiled from: AccountMarketValuesContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key(parcel.readString(), AccountMarketValuesType.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, String str, AccountMarketValuesType accountMarketValuesType, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = key.accountNumber;
            }
            if ((i & 2) != 0) {
                accountMarketValuesType = key.type;
            }
            if ((i & 4) != 0) {
                str2 = key.displaySpan;
            }
            return key.copy(str, accountMarketValuesType, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final AccountMarketValuesType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisplaySpan() {
            return this.displaySpan;
        }

        public final Key copy(String accountNumber, AccountMarketValuesType type2, String displaySpan) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
            return new Key(accountNumber, type2, displaySpan);
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
            return Intrinsics.areEqual(this.accountNumber, key.accountNumber) && this.type == key.type && Intrinsics.areEqual(this.displaySpan, key.displaySpan);
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.type.hashCode()) * 31) + this.displaySpan.hashCode();
        }

        public String toString() {
            return "Key(accountNumber=" + this.accountNumber + ", type=" + this.type + ", displaySpan=" + this.displaySpan + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.type.name());
            dest.writeString(this.displaySpan);
        }

        public Key(String accountNumber, AccountMarketValuesType type2, String displaySpan) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
            this.accountNumber = accountNumber;
            this.type = type2;
            this.displaySpan = displaySpan;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final AccountMarketValuesType getType() {
            return this.type;
        }

        public final String getDisplaySpan() {
            return this.displaySpan;
        }
    }
}

package com.robinhood.shared.agreements.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentiAgreementKey.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J+\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/shared/agreements/contracts/IdentiAgreementKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "agreementType", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;", "accountNumber", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getAgreementType", "()Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;", "getAccountNumber", "()Ljava/lang/String;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Callbacks", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class IdentiAgreementKey implements Parcelable, TabFragmentKey {
    public static final Parcelable.Creator<IdentiAgreementKey> CREATOR = new Creator();
    private final String accountNumber;
    private final IdentiAgreementType agreementType;
    private final Screen screen;

    /* compiled from: IdentiAgreementKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/agreements/contracts/IdentiAgreementKey$Callbacks;", "", "onSubmissionStateChanged", "", "isSubmitting", "", "onAgreementAccepted", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public interface Callbacks {

        /* compiled from: IdentiAgreementKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void onSubmissionStateChanged(Callbacks callbacks, boolean z) {
            }
        }

        void onAgreementAccepted();

        void onSubmissionStateChanged(boolean isSubmitting);
    }

    /* compiled from: IdentiAgreementKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Creator implements Parcelable.Creator<IdentiAgreementKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentiAgreementKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IdentiAgreementKey((IdentiAgreementType) parcel.readParcelable(IdentiAgreementKey.class.getClassLoader()), parcel.readString(), (Screen) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentiAgreementKey[] newArray(int i) {
            return new IdentiAgreementKey[i];
        }
    }

    public static /* synthetic */ IdentiAgreementKey copy$default(IdentiAgreementKey identiAgreementKey, IdentiAgreementType identiAgreementType, String str, Screen screen, int i, Object obj) {
        if ((i & 1) != 0) {
            identiAgreementType = identiAgreementKey.agreementType;
        }
        if ((i & 2) != 0) {
            str = identiAgreementKey.accountNumber;
        }
        if ((i & 4) != 0) {
            screen = identiAgreementKey.screen;
        }
        return identiAgreementKey.copy(identiAgreementType, str, screen);
    }

    /* renamed from: component1, reason: from getter */
    public final IdentiAgreementType getAgreementType() {
        return this.agreementType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final Screen getScreen() {
        return this.screen;
    }

    public final IdentiAgreementKey copy(IdentiAgreementType agreementType, String accountNumber, Screen screen) {
        Intrinsics.checkNotNullParameter(agreementType, "agreementType");
        return new IdentiAgreementKey(agreementType, accountNumber, screen);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentiAgreementKey)) {
            return false;
        }
        IdentiAgreementKey identiAgreementKey = (IdentiAgreementKey) other;
        return Intrinsics.areEqual(this.agreementType, identiAgreementKey.agreementType) && Intrinsics.areEqual(this.accountNumber, identiAgreementKey.accountNumber) && Intrinsics.areEqual(this.screen, identiAgreementKey.screen);
    }

    public int hashCode() {
        int iHashCode = this.agreementType.hashCode() * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Screen screen = this.screen;
        return iHashCode2 + (screen != null ? screen.hashCode() : 0);
    }

    public String toString() {
        return "IdentiAgreementKey(agreementType=" + this.agreementType + ", accountNumber=" + this.accountNumber + ", screen=" + this.screen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.agreementType, flags);
        dest.writeString(this.accountNumber);
        dest.writeSerializable(this.screen);
    }

    public IdentiAgreementKey(IdentiAgreementType agreementType, String str, Screen screen) {
        Intrinsics.checkNotNullParameter(agreementType, "agreementType");
        this.agreementType = agreementType;
        this.accountNumber = str;
        this.screen = screen;
    }

    public /* synthetic */ IdentiAgreementKey(IdentiAgreementType identiAgreementType, String str, Screen screen, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identiAgreementType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : screen);
    }

    public final IdentiAgreementType getAgreementType() {
        return this.agreementType;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Screen getScreen() {
        return this.screen;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.SHOULD_NOT_BE_IN_TAB;
    }
}

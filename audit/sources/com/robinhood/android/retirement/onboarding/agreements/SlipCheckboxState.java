package com.robinhood.android.retirement.onboarding.agreements;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: RetirementAgreementsDataState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/agreements/SlipCheckboxState;", "Landroid/os/Parcelable;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", AnnotatedPrivateKey.LABEL, "", "isChecked", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Z)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getLabel", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SlipCheckboxState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SlipCheckboxState> CREATOR = new Creator();
    private final BrokerageAccountType accountType;
    private final boolean isChecked;
    private final String label;

    /* compiled from: RetirementAgreementsDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SlipCheckboxState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlipCheckboxState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlipCheckboxState(BrokerageAccountType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlipCheckboxState[] newArray(int i) {
            return new SlipCheckboxState[i];
        }
    }

    public static /* synthetic */ SlipCheckboxState copy$default(SlipCheckboxState slipCheckboxState, BrokerageAccountType brokerageAccountType, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = slipCheckboxState.accountType;
        }
        if ((i & 2) != 0) {
            str = slipCheckboxState.label;
        }
        if ((i & 4) != 0) {
            z = slipCheckboxState.isChecked;
        }
        return slipCheckboxState.copy(brokerageAccountType, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public final SlipCheckboxState copy(BrokerageAccountType accountType, String label, boolean isChecked) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(label, "label");
        return new SlipCheckboxState(accountType, label, isChecked);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlipCheckboxState)) {
            return false;
        }
        SlipCheckboxState slipCheckboxState = (SlipCheckboxState) other;
        return this.accountType == slipCheckboxState.accountType && Intrinsics.areEqual(this.label, slipCheckboxState.label) && this.isChecked == slipCheckboxState.isChecked;
    }

    public int hashCode() {
        return (((this.accountType.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.isChecked);
    }

    public String toString() {
        return "SlipCheckboxState(accountType=" + this.accountType + ", label=" + this.label + ", isChecked=" + this.isChecked + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountType.name());
        dest.writeString(this.label);
        dest.writeInt(this.isChecked ? 1 : 0);
    }

    public SlipCheckboxState(BrokerageAccountType accountType, String label, boolean z) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(label, "label");
        this.accountType = accountType;
        this.label = label;
        this.isChecked = z;
    }

    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }
}

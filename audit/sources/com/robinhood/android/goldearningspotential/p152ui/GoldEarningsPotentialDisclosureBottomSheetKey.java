package com.robinhood.android.goldearningspotential.p152ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsCalculatorAlertContentUiModel;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldEarningsPotentialDisclosureBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/goldearningspotential/ui/GoldEarningsPotentialDisclosureBottomSheetKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "alert", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorAlertContentUiModel;", "<init>", "(Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorAlertContentUiModel;)V", "getAlert", "()Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorAlertContentUiModel;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-earnings-potential-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GoldEarningsPotentialDisclosureBottomSheetKey implements Parcelable, DialogFragmentKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GoldEarningsPotentialDisclosureBottomSheetKey> CREATOR = new Creator();
    private final GoldEarningsCalculatorAlertContentUiModel alert;

    /* compiled from: GoldEarningsPotentialDisclosureBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<GoldEarningsPotentialDisclosureBottomSheetKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldEarningsPotentialDisclosureBottomSheetKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldEarningsPotentialDisclosureBottomSheetKey(GoldEarningsCalculatorAlertContentUiModel.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldEarningsPotentialDisclosureBottomSheetKey[] newArray(int i) {
            return new GoldEarningsPotentialDisclosureBottomSheetKey[i];
        }
    }

    public static /* synthetic */ GoldEarningsPotentialDisclosureBottomSheetKey copy$default(GoldEarningsPotentialDisclosureBottomSheetKey goldEarningsPotentialDisclosureBottomSheetKey, GoldEarningsCalculatorAlertContentUiModel goldEarningsCalculatorAlertContentUiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            goldEarningsCalculatorAlertContentUiModel = goldEarningsPotentialDisclosureBottomSheetKey.alert;
        }
        return goldEarningsPotentialDisclosureBottomSheetKey.copy(goldEarningsCalculatorAlertContentUiModel);
    }

    /* renamed from: component1, reason: from getter */
    public final GoldEarningsCalculatorAlertContentUiModel getAlert() {
        return this.alert;
    }

    public final GoldEarningsPotentialDisclosureBottomSheetKey copy(GoldEarningsCalculatorAlertContentUiModel alert) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        return new GoldEarningsPotentialDisclosureBottomSheetKey(alert);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GoldEarningsPotentialDisclosureBottomSheetKey) && Intrinsics.areEqual(this.alert, ((GoldEarningsPotentialDisclosureBottomSheetKey) other).alert);
    }

    public int hashCode() {
        return this.alert.hashCode();
    }

    public String toString() {
        return "GoldEarningsPotentialDisclosureBottomSheetKey(alert=" + this.alert + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.alert.writeToParcel(dest, flags);
    }

    public GoldEarningsPotentialDisclosureBottomSheetKey(GoldEarningsCalculatorAlertContentUiModel alert) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        this.alert = alert;
    }

    public final GoldEarningsCalculatorAlertContentUiModel getAlert() {
        return this.alert;
    }
}

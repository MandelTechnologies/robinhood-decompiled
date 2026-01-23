package com.robinhood.android.retirement.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpEligibility2;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementIneligibleBottomSheetKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "bottomSheetState", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;", "hostScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "shouldFinishActivityOnDismiss", "", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;Lcom/robinhood/rosetta/eventlogging/Screen;Z)V", "getBottomSheetState", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;", "getHostScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getShouldFinishActivityOnDismiss", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementIneligibleBottomSheetKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<RetirementIneligibleBottomSheetKey> CREATOR = new Creator();
    private final ApiRetirementSignUpEligibility2 bottomSheetState;
    private final Screen hostScreen;
    private final boolean shouldFinishActivityOnDismiss;

    /* compiled from: RetirementFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RetirementIneligibleBottomSheetKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementIneligibleBottomSheetKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RetirementIneligibleBottomSheetKey((ApiRetirementSignUpEligibility2) parcel.readParcelable(RetirementIneligibleBottomSheetKey.class.getClassLoader()), (Screen) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementIneligibleBottomSheetKey[] newArray(int i) {
            return new RetirementIneligibleBottomSheetKey[i];
        }
    }

    public static /* synthetic */ RetirementIneligibleBottomSheetKey copy$default(RetirementIneligibleBottomSheetKey retirementIneligibleBottomSheetKey, ApiRetirementSignUpEligibility2 apiRetirementSignUpEligibility2, Screen screen, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            apiRetirementSignUpEligibility2 = retirementIneligibleBottomSheetKey.bottomSheetState;
        }
        if ((i & 2) != 0) {
            screen = retirementIneligibleBottomSheetKey.hostScreen;
        }
        if ((i & 4) != 0) {
            z = retirementIneligibleBottomSheetKey.shouldFinishActivityOnDismiss;
        }
        return retirementIneligibleBottomSheetKey.copy(apiRetirementSignUpEligibility2, screen, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiRetirementSignUpEligibility2 getBottomSheetState() {
        return this.bottomSheetState;
    }

    /* renamed from: component2, reason: from getter */
    public final Screen getHostScreen() {
        return this.hostScreen;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldFinishActivityOnDismiss() {
        return this.shouldFinishActivityOnDismiss;
    }

    public final RetirementIneligibleBottomSheetKey copy(ApiRetirementSignUpEligibility2 bottomSheetState, Screen hostScreen, boolean shouldFinishActivityOnDismiss) {
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        return new RetirementIneligibleBottomSheetKey(bottomSheetState, hostScreen, shouldFinishActivityOnDismiss);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementIneligibleBottomSheetKey)) {
            return false;
        }
        RetirementIneligibleBottomSheetKey retirementIneligibleBottomSheetKey = (RetirementIneligibleBottomSheetKey) other;
        return Intrinsics.areEqual(this.bottomSheetState, retirementIneligibleBottomSheetKey.bottomSheetState) && Intrinsics.areEqual(this.hostScreen, retirementIneligibleBottomSheetKey.hostScreen) && this.shouldFinishActivityOnDismiss == retirementIneligibleBottomSheetKey.shouldFinishActivityOnDismiss;
    }

    public int hashCode() {
        int iHashCode = this.bottomSheetState.hashCode() * 31;
        Screen screen = this.hostScreen;
        return ((iHashCode + (screen == null ? 0 : screen.hashCode())) * 31) + Boolean.hashCode(this.shouldFinishActivityOnDismiss);
    }

    public String toString() {
        return "RetirementIneligibleBottomSheetKey(bottomSheetState=" + this.bottomSheetState + ", hostScreen=" + this.hostScreen + ", shouldFinishActivityOnDismiss=" + this.shouldFinishActivityOnDismiss + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.bottomSheetState, flags);
        dest.writeSerializable(this.hostScreen);
        dest.writeInt(this.shouldFinishActivityOnDismiss ? 1 : 0);
    }

    public RetirementIneligibleBottomSheetKey(ApiRetirementSignUpEligibility2 bottomSheetState, Screen screen, boolean z) {
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        this.bottomSheetState = bottomSheetState;
        this.hostScreen = screen;
        this.shouldFinishActivityOnDismiss = z;
    }

    public /* synthetic */ RetirementIneligibleBottomSheetKey(ApiRetirementSignUpEligibility2 apiRetirementSignUpEligibility2, Screen screen, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiRetirementSignUpEligibility2, (i & 2) != 0 ? null : screen, (i & 4) != 0 ? false : z);
    }

    public final ApiRetirementSignUpEligibility2 getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final Screen getHostScreen() {
        return this.hostScreen;
    }

    public final boolean getShouldFinishActivityOnDismiss() {
        return this.shouldFinishActivityOnDismiss;
    }
}

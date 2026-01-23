package com.robinhood.android.onboarding.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.onboardingupsell.ApiChooseApyScreenContent;
import com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingUpsellGoldRateSelectionFragmentContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellGoldRateSelectionFragmentContract;", "", "<init>", "()V", "Key", "Callbacks", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class OnboardingUpsellGoldRateSelectionFragmentContract {
    public static final OnboardingUpsellGoldRateSelectionFragmentContract INSTANCE = new OnboardingUpsellGoldRateSelectionFragmentContract();

    /* compiled from: OnboardingUpsellGoldRateSelectionFragmentContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellGoldRateSelectionFragmentContract$Callbacks;", "", "onOnboardingUpsellAction", "", "action", "Lcom/robinhood/models/serverdriven/experimental/api/OnboardingFundingUpsellAction;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        boolean onOnboardingUpsellAction(OnboardingFundingUpsellAction action);
    }

    private OnboardingUpsellGoldRateSelectionFragmentContract() {
    }

    /* compiled from: OnboardingUpsellGoldRateSelectionFragmentContract.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellGoldRateSelectionFragmentContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "accountSelection", "Lcom/robinhood/models/onboardingupsell/ApiChooseApyScreenContent;", "isRhfMaxOnboardingStyle", "", "<init>", "(Lcom/robinhood/models/onboardingupsell/ApiChooseApyScreenContent;Z)V", "getAccountSelection", "()Lcom/robinhood/models/onboardingupsell/ApiChooseApyScreenContent;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final ApiChooseApyScreenContent accountSelection;
        private final boolean isRhfMaxOnboardingStyle;

        /* compiled from: OnboardingUpsellGoldRateSelectionFragmentContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes10.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key((ApiChooseApyScreenContent) parcel.readParcelable(Key.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, ApiChooseApyScreenContent apiChooseApyScreenContent, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                apiChooseApyScreenContent = key.accountSelection;
            }
            if ((i & 2) != 0) {
                z = key.isRhfMaxOnboardingStyle;
            }
            return key.copy(apiChooseApyScreenContent, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiChooseApyScreenContent getAccountSelection() {
            return this.accountSelection;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRhfMaxOnboardingStyle() {
            return this.isRhfMaxOnboardingStyle;
        }

        public final Key copy(ApiChooseApyScreenContent accountSelection, boolean isRhfMaxOnboardingStyle) {
            Intrinsics.checkNotNullParameter(accountSelection, "accountSelection");
            return new Key(accountSelection, isRhfMaxOnboardingStyle);
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
            return Intrinsics.areEqual(this.accountSelection, key.accountSelection) && this.isRhfMaxOnboardingStyle == key.isRhfMaxOnboardingStyle;
        }

        public int hashCode() {
            return (this.accountSelection.hashCode() * 31) + Boolean.hashCode(this.isRhfMaxOnboardingStyle);
        }

        public String toString() {
            return "Key(accountSelection=" + this.accountSelection + ", isRhfMaxOnboardingStyle=" + this.isRhfMaxOnboardingStyle + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.accountSelection, flags);
            dest.writeInt(this.isRhfMaxOnboardingStyle ? 1 : 0);
        }

        public Key(ApiChooseApyScreenContent accountSelection, boolean z) {
            Intrinsics.checkNotNullParameter(accountSelection, "accountSelection");
            this.accountSelection = accountSelection;
            this.isRhfMaxOnboardingStyle = z;
        }

        public /* synthetic */ Key(ApiChooseApyScreenContent apiChooseApyScreenContent, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(apiChooseApyScreenContent, (i & 2) != 0 ? false : z);
        }

        public final ApiChooseApyScreenContent getAccountSelection() {
            return this.accountSelection;
        }

        public final boolean isRhfMaxOnboardingStyle() {
            return this.isRhfMaxOnboardingStyle;
        }
    }
}

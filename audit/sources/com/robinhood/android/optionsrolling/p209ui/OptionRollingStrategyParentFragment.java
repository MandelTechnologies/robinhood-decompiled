package com.robinhood.android.optionsrolling.p209ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.optionsrolling.p209ui.OptionRollingNuxFragment;
import com.robinhood.android.optionsrolling.p209ui.OptionRollingStrategyFragment;
import com.robinhood.android.optionsrolling.prefs.HasShownRollingNuxPref;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionRollingStrategyParentFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\t\u0010\u0011\u001a\u00020\u0012H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingNuxFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "hasShownRollingNux", "Lcom/robinhood/prefs/BooleanPreference;", "getHasShownRollingNux", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasShownRollingNux", "(Lcom/robinhood/prefs/BooleanPreference;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onGetStartedClicked", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionRollingStrategyParentFragment extends BaseFragment implements OptionRollingNuxFragment.Callbacks, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    @HasShownRollingNuxPref
    public BooleanPreference hasShownRollingNux;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionRollingStrategyParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
    }

    public final BooleanPreference getHasShownRollingNux() {
        BooleanPreference booleanPreference = this.hasShownRollingNux;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasShownRollingNux");
        return null;
    }

    public final void setHasShownRollingNux(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasShownRollingNux = booleanPreference;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            if (!getHasShownRollingNux().get()) {
                getHasShownRollingNux().set(true);
                setFragment(C11048R.id.fragment_container, OptionRollingNuxFragment.INSTANCE.newInstance(INSTANCE.getArgs((Fragment) this)));
            } else {
                int i = C11048R.id.fragment_container;
                OptionRollingStrategyFragment.Companion companion = OptionRollingStrategyFragment.INSTANCE;
                Companion companion2 = INSTANCE;
                setFragment(i, companion.newInstance((Parcelable) new OptionRollingStrategyFragment.Args(((Args) companion2.getArgs((Fragment) this)).getAccountNumber(), ((Args) companion2.getArgs((Fragment) this)).getStrategyCode())));
            }
        }
    }

    @Override // com.robinhood.android.optionsrolling.ui.OptionRollingNuxFragment.Callbacks
    public void onGetStartedClicked() {
        OptionRollingStrategyFragment.Companion companion = OptionRollingStrategyFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragmentWithoutBackStack(companion.newInstance((Parcelable) new OptionRollingStrategyFragment.Args(((Args) companion2.getArgs((Fragment) this)).getAccountNumber(), ((Args) companion2.getArgs((Fragment) this)).getStrategyCode())));
    }

    /* compiled from: OptionRollingStrategyParentFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyParentFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "strategyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getStrategyCode", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String strategyCode;

        /* compiled from: OptionRollingStrategyParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = args.strategyCode;
            }
            return args.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStrategyCode() {
            return this.strategyCode;
        }

        public final Args copy(String accountNumber, String strategyCode) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
            return new Args(accountNumber, strategyCode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.strategyCode, args.strategyCode);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.strategyCode.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", strategyCode=" + this.strategyCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.strategyCode);
        }

        public Args(String accountNumber, String strategyCode) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
            this.accountNumber = accountNumber;
            this.strategyCode = strategyCode;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getStrategyCode() {
            return this.strategyCode;
        }
    }

    /* compiled from: OptionRollingStrategyParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyParentFragment;", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyParentFragment$Args;", "<init>", "()V", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionRollingStrategyParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionRollingStrategyParentFragment optionRollingStrategyParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionRollingStrategyParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionRollingStrategyParentFragment newInstance(Args args) {
            return (OptionRollingStrategyParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionRollingStrategyParentFragment optionRollingStrategyParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionRollingStrategyParentFragment, args);
        }
    }
}

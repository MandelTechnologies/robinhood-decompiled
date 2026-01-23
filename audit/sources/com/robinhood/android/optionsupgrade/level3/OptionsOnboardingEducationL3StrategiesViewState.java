package com.robinhood.android.optionsupgrade.level3;

import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsUpgradeContract.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/level3/OptionsOnboardingEducationL3StrategiesViewState;", "", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsOnboardingEducationL3StrategiesViewState {
    public static final int $stable = 8;
    private final CountryCode.Supported locality;

    public static /* synthetic */ OptionsOnboardingEducationL3StrategiesViewState copy$default(OptionsOnboardingEducationL3StrategiesViewState optionsOnboardingEducationL3StrategiesViewState, CountryCode.Supported supported, int i, Object obj) {
        if ((i & 1) != 0) {
            supported = optionsOnboardingEducationL3StrategiesViewState.locality;
        }
        return optionsOnboardingEducationL3StrategiesViewState.copy(supported);
    }

    /* renamed from: component1, reason: from getter */
    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final OptionsOnboardingEducationL3StrategiesViewState copy(CountryCode.Supported locality) {
        Intrinsics.checkNotNullParameter(locality, "locality");
        return new OptionsOnboardingEducationL3StrategiesViewState(locality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OptionsOnboardingEducationL3StrategiesViewState) && Intrinsics.areEqual(this.locality, ((OptionsOnboardingEducationL3StrategiesViewState) other).locality);
    }

    public int hashCode() {
        return this.locality.hashCode();
    }

    public String toString() {
        return "OptionsOnboardingEducationL3StrategiesViewState(locality=" + this.locality + ")";
    }

    public OptionsOnboardingEducationL3StrategiesViewState(CountryCode.Supported locality) {
        Intrinsics.checkNotNullParameter(locality, "locality");
        this.locality = locality;
    }

    public final CountryCode.Supported getLocality() {
        return this.locality;
    }
}

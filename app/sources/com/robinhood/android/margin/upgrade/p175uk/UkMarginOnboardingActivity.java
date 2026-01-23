package com.robinhood.android.margin.upgrade.p175uk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.lib.margin.api.ApiMarginOnboardingSplash;
import com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import com.robinhood.utils.p409ui.activity.ActivityCompanion3;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: UkMarginOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0016J\t\u0010\u000b\u001a\u00020\fH\u0096\u0001R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeSplashFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSplashContinue", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UkMarginOnboardingActivity extends BaseActivity implements RegionGated, MarginUpgradeSplashFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

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

    public UkMarginOnboardingActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(LeveredMarginRegionGate.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        initEdgeToEdge(false);
        super.onCreate(savedInstanceState);
        ScarletManager2.getScarletManager(this).putOverlay(AchromaticOverlay.INSTANCE, Boolean.FALSE);
        if (savedInstanceState == null) {
            replaceFragmentWithoutBackStack(MarginUpgradeSplashFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeSplashFragment.Args(((Args) INSTANCE.getExtras((Activity) this)).getSplash(), CountryCode.Supported.UnitedKingdom.INSTANCE)));
        }
    }

    @Override // com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment.Callbacks
    public void onSplashContinue() {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(getNavigator(), this, new MicrogramRouterFragmentKey(new RemoteMicrogramApplication("app-margin-uk-intro", null, 2, null), new Uri.Builder().scheme(DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD()).authority("margin_uk_intro").appendQueryParameter("account_number", ((Args) INSTANCE.getExtras((Activity) this)).getAccountNumber()).build().toString(), null, null, null, 28, null), false, false, false, false, null, true, null, null, 892, null);
        finish();
    }

    /* compiled from: UkMarginOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingActivity$Args;", "Landroid/os/Parcelable;", "splash", "Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;", "accountNumber", "", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;Ljava/lang/String;)V", "getSplash", "()Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final ApiMarginOnboardingSplash splash;

        /* compiled from: UkMarginOnboardingActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiMarginOnboardingSplash) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiMarginOnboardingSplash apiMarginOnboardingSplash, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                apiMarginOnboardingSplash = args.splash;
            }
            if ((i & 2) != 0) {
                str = args.accountNumber;
            }
            return args.copy(apiMarginOnboardingSplash, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiMarginOnboardingSplash getSplash() {
            return this.splash;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(ApiMarginOnboardingSplash splash, String accountNumber) {
            Intrinsics.checkNotNullParameter(splash, "splash");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Args(splash, accountNumber);
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
            return Intrinsics.areEqual(this.splash, args.splash) && Intrinsics.areEqual(this.accountNumber, args.accountNumber);
        }

        public int hashCode() {
            return (this.splash.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "Args(splash=" + this.splash + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.splash, flags);
            dest.writeString(this.accountNumber);
        }

        public Args(ApiMarginOnboardingSplash splash, String accountNumber) {
            Intrinsics.checkNotNullParameter(splash, "splash");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.splash = splash;
            this.accountNumber = accountNumber;
        }

        public final ApiMarginOnboardingSplash getSplash() {
            return this.splash;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: UkMarginOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingActivity$Companion;", "Lcom/robinhood/utils/ui/activity/ActivityWithExtrasCompanion;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingActivity;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingActivity$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements ActivityCompanion3<UkMarginOnboardingActivity, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public Args getExtras(UkMarginOnboardingActivity ukMarginOnboardingActivity) {
            return (Args) ActivityCompanion3.DefaultImpls.getExtras(this, ukMarginOnboardingActivity);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, Args args) {
            return ActivityCompanion3.DefaultImpls.getIntentWithExtras(this, context, args);
        }
    }
}

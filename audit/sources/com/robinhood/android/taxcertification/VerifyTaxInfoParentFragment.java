package com.robinhood.android.taxcertification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.BackEventCompat;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.onboarding.contracts.DocumentUpload;
import com.robinhood.android.taxcertification.VerifyTaxInfoDestination;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerifyTaxInfoParentFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/VerifyTaxInfoParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$Receiver;", "<init>", "()V", "backstackListener", "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "navigateToDestination", "destination", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination;", "getMainIntent", "Landroid/content/Intent;", "Companion", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class VerifyTaxInfoParentFragment extends BaseFragment implements VerifyTaxInfoDestination.Receiver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final FragmentManager.OnBackStackChangedListener backstackListener;

    public VerifyTaxInfoParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.backstackListener = new FragmentManager.OnBackStackChangedListener() { // from class: com.robinhood.android.taxcertification.VerifyTaxInfoParentFragment$backstackListener$1
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public /* bridge */ /* synthetic */ void onBackStackChangeCancelled() {
                super.onBackStackChangeCancelled();
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public /* bridge */ /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
                super.onBackStackChangeCommitted(fragment, z);
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public /* bridge */ /* synthetic */ void onBackStackChangeProgressed(BackEventCompat backEventCompat) {
                super.onBackStackChangeProgressed(backEventCompat);
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public /* bridge */ /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
                super.onBackStackChangeStarted(fragment, z);
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
                if (this.this$0.getChildFragmentManager().getBackStackEntryCount() == 0) {
                    this.this$0.requireBaseActivity().showCloseIcon();
                } else {
                    this.this$0.requireBaseActivity().showBackArrowIcon();
                }
            }
        };
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, TaxInfoConfirmFragment.INSTANCE.newInstance(INSTANCE.getArgs((Fragment) this)));
            getChildFragmentManager().addOnBackStackChangedListener(this.backstackListener);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getChildFragmentManager().removeOnBackStackChangedListener(this.backstackListener);
    }

    @Override // com.robinhood.android.taxcertification.VerifyTaxInfoDestination.Receiver
    public void navigateToDestination(VerifyTaxInfoDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (Intrinsics.areEqual(destination, VerifyTaxInfoDestination.CheckSsn.INSTANCE)) {
            replaceFragment(CheckSsnFragment.INSTANCE.newInstance());
            return;
        }
        if (Intrinsics.areEqual(destination, VerifyTaxInfoDestination.SsnLockout.INSTANCE)) {
            replaceFragment(SsnLockoutFragment.INSTANCE.newInstance());
            return;
        }
        if (destination instanceof VerifyTaxInfoDestination.DocUpload) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            requireContext().startActivities(new Intent[]{getMainIntent(), Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, DocumentUpload.Companion.singleDocStandaloneActivityIntent$default(DocumentUpload.INSTANCE, ((VerifyTaxInfoDestination.DocUpload) destination).getRequest(), false, null, false, null, 30, null), null, false, 12, null)});
            return;
        }
        if (Intrinsics.areEqual(destination, VerifyTaxInfoDestination.Exit.INSTANCE)) {
            requireBaseActivity().finish();
        } else {
            if (!Intrinsics.areEqual(destination, VerifyTaxInfoDestination.GoHome.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            startActivity(getMainIntent());
        }
    }

    private final Intent getMainIntent() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, MainActivityIntentKey.INSTANCE, null, false, 12, null);
        intentCreateIntent$default.setFlags(268468224);
        return intentCreateIntent$default;
    }

    /* compiled from: VerifyTaxInfoParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/VerifyTaxInfoParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$VerifyTaxInfo;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoParentFragment;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.VerifyTaxInfo>, FragmentWithArgsCompanion<VerifyTaxInfoParentFragment, LegacyFragmentKey.VerifyTaxInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.VerifyTaxInfo getArgs(VerifyTaxInfoParentFragment verifyTaxInfoParentFragment) {
            return (LegacyFragmentKey.VerifyTaxInfo) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, verifyTaxInfoParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public VerifyTaxInfoParentFragment newInstance(LegacyFragmentKey.VerifyTaxInfo verifyTaxInfo) {
            return (VerifyTaxInfoParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, verifyTaxInfo);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(VerifyTaxInfoParentFragment verifyTaxInfoParentFragment, LegacyFragmentKey.VerifyTaxInfo verifyTaxInfo) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, verifyTaxInfoParentFragment, verifyTaxInfo);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.VerifyTaxInfo key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) key);
        }
    }
}

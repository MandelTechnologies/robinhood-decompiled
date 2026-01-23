package com.robinhood.shared.unverifiedaccountrecovery;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.lib.pathfinder.PathfinderFragmentCallbacks;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.p355ui.pathfinder.contexts.AppMfaEnrollPageContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.lib.challenge.BackupCodeVerificationResult;
import com.robinhood.shared.lib.challenge.BackupCodeVerificationResultContract;
import com.robinhood.shared.security.contracts.BackupCodeVerificationInput;
import com.robinhood.shared.security.contracts.BackupCodeVerificationIntentKey;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PathfinderAppMfaEnrollFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R(\u0010\n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u000e*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/PathfinderAppMfaEnrollFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "pathfinderCallbacks", "Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", "getPathfinderCallbacks", "()Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", "pathfinderCallbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "launchReEnrollment", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/shared/security/contracts/BackupCodeVerificationIntentKey;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PathfinderAppMfaEnrollFragment extends BaseFragment {
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<BackupCodeVerificationIntentKey>> launchReEnrollment;

    /* renamed from: pathfinderCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 pathfinderCallbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PathfinderAppMfaEnrollFragment.class, "pathfinderCallbacks", "getPathfinderCallbacks()Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public PathfinderAppMfaEnrollFragment() {
        super(C41128R.layout.fragment_pathfinder_app_mfa_enroll);
        this.pathfinderCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(PathfinderFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.unverifiedaccountrecovery.PathfinderAppMfaEnrollFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<BackupCodeVerificationIntentKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new BackupCodeVerificationResultContract(new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.PathfinderAppMfaEnrollFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.shared.unverifiedaccountrecovery.PathfinderAppMfaEnrollFragment$launchReEnrollment$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(BackupCodeVerificationResult backupCodeVerificationResult) {
                this.this$0.getPathfinderCallbacks().dismissFlow();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.launchReEnrollment = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PathfinderFragmentCallbacks getPathfinderCallbacks() {
        return (PathfinderFragmentCallbacks) this.pathfinderCallbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            AppMfaEnrollPageContext context = ((UserViewStatePageContext.AppMfaEnroll) ((LegacyFragmentKey.PathfinderAppMfaEnroll) INSTANCE.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext();
            NavigationActivityResultContract3.launch$default(this.launchReEnrollment, new BackupCodeVerificationIntentKey(new BackupCodeVerificationInput(Challenge.Flow.UNVERIFIED_ACCOUNT_RECOVERY_APP_MFA.getId(), null, null, context.getTotpToken(), context.getEnrollmentToken(), null, 36, null)), null, false, 6, null);
        }
    }

    /* compiled from: PathfinderAppMfaEnrollFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/PathfinderAppMfaEnrollFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/PathfinderAppMfaEnrollFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderAppMfaEnroll;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PathfinderAppMfaEnrollFragment, LegacyFragmentKey.PathfinderAppMfaEnroll> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.PathfinderAppMfaEnroll pathfinderAppMfaEnroll) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, pathfinderAppMfaEnroll);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.PathfinderAppMfaEnroll getArgs(PathfinderAppMfaEnrollFragment pathfinderAppMfaEnrollFragment) {
            return (LegacyFragmentKey.PathfinderAppMfaEnroll) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, pathfinderAppMfaEnrollFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PathfinderAppMfaEnrollFragment newInstance(LegacyFragmentKey.PathfinderAppMfaEnroll pathfinderAppMfaEnroll) {
            return (PathfinderAppMfaEnrollFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pathfinderAppMfaEnroll);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PathfinderAppMfaEnrollFragment pathfinderAppMfaEnrollFragment, LegacyFragmentKey.PathfinderAppMfaEnroll pathfinderAppMfaEnroll) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, pathfinderAppMfaEnrollFragment, pathfinderAppMfaEnroll);
        }
    }
}

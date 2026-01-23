package com.robinhood.android.generic.p149ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.tooltips.TooltipActivity;
import com.robinhood.tooltips.TooltipManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericFragmentActivity.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/generic/ui/GenericFragmentActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/tooltips/TooltipActivity;", "<init>", "()V", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "getTooltipManager", "()Lcom/robinhood/tooltips/TooltipManager;", "setTooltipManager", "(Lcom/robinhood/tooltips/TooltipManager;)V", "requiresAuthentication", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onAttachFragment", "fragment", "Landroidx/fragment/app/Fragment;", "Companion", "feature-fragment-and-activity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GenericFragmentActivity extends BaseActivity implements TooltipActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public TooltipManager tooltipManager;

    public GenericFragmentActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.tooltips.TooltipActivity
    public TooltipManager getTooltipManager() {
        TooltipManager tooltipManager = this.tooltipManager;
        if (tooltipManager != null) {
            return tooltipManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tooltipManager");
        return null;
    }

    public void setTooltipManager(TooltipManager tooltipManager) {
        Intrinsics.checkNotNullParameter(tooltipManager, "<set-?>");
        this.tooltipManager = tooltipManager;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return ((HostIntentKey.ShowFragmentInStandaloneActivity) INSTANCE.getExtras((Activity) this)).getRequiresAuthentication();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), ((HostIntentKey.ShowFragmentInStandaloneActivity) INSTANCE.getExtras((Activity) this)).getFragmentKey(), null, 2, null));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onAttachFragment(Fragment fragment) {
        RhToolbar rhToolbar;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        super.onAttachFragment(fragment);
        BaseFragment baseFragment = fragment instanceof BaseFragment ? (BaseFragment) fragment : null;
        if (!Intrinsics.areEqual(baseFragment != null ? Boolean.valueOf(baseFragment.getUseDesignSystemToolbar()) : null, Boolean.TRUE) || (rhToolbar = getRhToolbar()) == null) {
            return;
        }
        rhToolbar.setUseDesignSystemTheme(true);
    }

    /* compiled from: GenericFragmentActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/generic/ui/GenericFragmentActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/generic/ui/GenericFragmentActivity;", "Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneActivity;", "<init>", "()V", "feature-fragment-and-activity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<GenericFragmentActivity, HostIntentKey.ShowFragmentInStandaloneActivity> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public HostIntentKey.ShowFragmentInStandaloneActivity getExtras(GenericFragmentActivity genericFragmentActivity) {
            return (HostIntentKey.ShowFragmentInStandaloneActivity) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, genericFragmentActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, HostIntentKey.ShowFragmentInStandaloneActivity showFragmentInStandaloneActivity) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, showFragmentInStandaloneActivity);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, HostIntentKey.ShowFragmentInStandaloneActivity showFragmentInStandaloneActivity) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, showFragmentInStandaloneActivity);
        }
    }
}

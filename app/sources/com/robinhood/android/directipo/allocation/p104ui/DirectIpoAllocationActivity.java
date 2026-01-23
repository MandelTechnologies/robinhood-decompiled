package com.robinhood.android.directipo.allocation.p104ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.directipo.allocation.p104ui.DirectIpoAllocatedFragment;
import com.robinhood.android.directipo.allocation.p104ui.DirectIpoAllocationLoadingFragment;
import com.robinhood.android.directipo.allocation.p104ui.DirectIpoNotAllocatedFragment;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.directipo.models.p293ui.UiDirectIpoAllocation;
import com.robinhood.utils.extensions.Activity;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoAllocationActivity.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001%B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\t\u0010\u001e\u001a\u00020\u001fH\u0096\u0001R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocationActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocationLoadingFragment$Callbacks;", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedFragment$Callbacks;", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoNotAllocatedFragment$Callbacks;", "<init>", "()V", DirectIpoAllocationActivity.EXTRA_DIRECT_IPO_ALLOCATION, "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoAllocation;", "getDirectIpoAllocation", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoAllocation;", "directIpoAllocation$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onDialogDismissed", "id", "", "onLoadAllocationSuccess", "allocation", "Lcom/robinhood/directipo/models/ui/UiDirectIpoAllocation;", "onLoadAllocationFailure", "throwable", "", "onAllocationComplete", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class DirectIpoAllocationActivity extends BaseActivity implements RegionGated, RhDialogFragment.OnDismissListener, DirectIpoAllocationLoadingFragment.Callbacks, DirectIpoAllocatedFragment.Callbacks, DirectIpoNotAllocatedFragment.Callbacks {
    private static final String EXTRA_DIRECT_IPO_ALLOCATION = "directIpoAllocation";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: directIpoAllocation$delegate, reason: from kotlin metadata */
    private final Lazy directIpoAllocation;

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

    public DirectIpoAllocationActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.directIpoAllocation = Activity.intentExtra(this, EXTRA_DIRECT_IPO_ALLOCATION);
    }

    private final LegacyIntentKey.DirectIpoAllocation getDirectIpoAllocation() {
        return (LegacyIntentKey.DirectIpoAllocation) this.directIpoAllocation.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, DirectIpoAllocationLoadingFragment.INSTANCE.newInstance((Parcelable) getDirectIpoAllocation()));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment currentFragment = getCurrentFragment();
        if ((currentFragment instanceof DirectIpoAllocatedFragment) || (currentFragment instanceof DirectIpoNotAllocatedFragment)) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
        }
    }

    @Override // com.robinhood.android.directipo.allocation.ui.DirectIpoAllocationLoadingFragment.Callbacks
    public void onLoadAllocationSuccess(UiDirectIpoAllocation allocation) {
        Fragment fragmentNewInstance;
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        if (allocation instanceof UiDirectIpoAllocation.Allocated) {
            fragmentNewInstance = DirectIpoAllocatedFragment.INSTANCE.newInstance((Parcelable) allocation);
        } else {
            if (!(allocation instanceof UiDirectIpoAllocation.NotAllocated)) {
                throw new NoWhenBranchMatchedException();
            }
            fragmentNewInstance = DirectIpoNotAllocatedFragment.INSTANCE.newInstance((Parcelable) allocation);
        }
        replaceFragmentWithoutAnimation(fragmentNewInstance);
    }

    @Override // com.robinhood.android.directipo.allocation.ui.DirectIpoAllocationLoadingFragment.Callbacks
    public void onLoadAllocationFailure(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, throwable, true, false, 0, null, 56, null);
    }

    @Override // com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment.Callbacks, com.robinhood.android.directipo.allocation.ui.DirectIpoNotAllocatedFragment.Callbacks
    public void onAllocationComplete() {
        finish();
    }

    /* compiled from: DirectIpoAllocationActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocationActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoAllocation;", "<init>", "()V", "EXTRA_DIRECT_IPO_ALLOCATION", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.DirectIpoAllocation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.DirectIpoAllocation key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) DirectIpoAllocationActivity.class);
            intent.putExtra(DirectIpoAllocationActivity.EXTRA_DIRECT_IPO_ALLOCATION, key);
            return intent;
        }
    }
}

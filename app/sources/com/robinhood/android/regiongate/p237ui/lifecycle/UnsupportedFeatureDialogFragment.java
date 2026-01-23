package com.robinhood.android.regiongate.p237ui.lifecycle;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.regiongate.p237ui.C26918R;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.fragment.PrimaryFragmentHost;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnsupportedFeatureDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/regiongate/ui/lifecycle/UnsupportedFeatureDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "<init>", "()V", "onAttach", "", "context", "Landroid/content/Context;", "onDismiss", "activity", "Landroid/app/Activity;", "Builder", "Companion", "lib-region-gate-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class UnsupportedFeatureDialogFragment extends RhDialogFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG_UNSUPPORTED_FEATURE_DIALOG = "unsupported-feature-dialog";

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment
    public void onDismiss(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onDismiss(activity);
        PrimaryFragmentHost baseActivity = Fragments2.getBaseActivity(this);
        ActivityResultCaller currentFragment = baseActivity.getCurrentFragment();
        RegionGated regionGated = currentFragment instanceof RegionGated ? (RegionGated) currentFragment : null;
        if (regionGated == null || !regionGated.onDismissUnsupportedFeatureDialog()) {
            RegionGated regionGated2 = baseActivity instanceof RegionGated ? (RegionGated) baseActivity : null;
            if (regionGated2 == null || !regionGated2.onDismissUnsupportedFeatureDialog()) {
                activity.onBackPressed();
            }
        }
    }

    /* compiled from: UnsupportedFeatureDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/regiongate/ui/lifecycle/UnsupportedFeatureDialogFragment$Builder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "createDialogFragment", "Lcom/robinhood/android/regiongate/ui/lifecycle/UnsupportedFeatureDialogFragment;", "lib-region-gate-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class Builder extends RhDialogFragment.Builder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        public UnsupportedFeatureDialogFragment createDialogFragment() {
            return new UnsupportedFeatureDialogFragment();
        }
    }

    /* compiled from: UnsupportedFeatureDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/regiongate/ui/lifecycle/UnsupportedFeatureDialogFragment$Companion;", "", "<init>", "()V", "TAG_UNSUPPORTED_FEATURE_DIALOG", "", "show", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "lib-region-gate-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RhDialogFragment show(Context context, FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            return RhDialogFragment.Builder.show$default(new Builder(context).setId(C26918R.id.dialog_id_unsupported_region).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C26918R.string.unsupported_region_message, new Object[0]).setCancelable(false), fragmentManager, UnsupportedFeatureDialogFragment.TAG_UNSUPPORTED_FEATURE_DIALOG, false, 4, null);
        }
    }
}

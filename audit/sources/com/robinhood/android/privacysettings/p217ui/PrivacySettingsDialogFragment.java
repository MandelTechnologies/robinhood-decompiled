package com.robinhood.android.privacysettings.p217ui;

import android.content.Context;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrivacySettingsDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\b\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/privacysettings/ui/PrivacySettingsDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "<init>", "()V", "onAttach", "", "context", "Landroid/content/Context;", "PrivacySettingsDialogBuilder", "Companion", "feature-privacy-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PrivacySettingsDialogFragment extends RhDialogFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = RhDialogFragment.$stable;

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    /* compiled from: PrivacySettingsDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/privacysettings/ui/PrivacySettingsDialogFragment$PrivacySettingsDialogBuilder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "createDialogFragment", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "feature-privacy-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PrivacySettingsDialogBuilder extends RhDialogFragment.Builder {
        public static final int $stable = RhDialogFragment.Builder.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrivacySettingsDialogBuilder(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        protected RhDialogFragment createDialogFragment() {
            return new PrivacySettingsDialogFragment();
        }
    }

    /* compiled from: PrivacySettingsDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/privacysettings/ui/PrivacySettingsDialogFragment$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/privacysettings/ui/PrivacySettingsDialogFragment$PrivacySettingsDialogBuilder;", "context", "Landroid/content/Context;", "feature-privacy-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PrivacySettingsDialogBuilder create(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new PrivacySettingsDialogBuilder(context);
        }
    }
}

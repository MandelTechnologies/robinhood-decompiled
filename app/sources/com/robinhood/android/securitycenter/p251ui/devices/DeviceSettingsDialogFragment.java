package com.robinhood.android.securitycenter.p251ui.devices;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DeviceSettingsDialogFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devices/DeviceSettingsDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "overlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "<init>", "(Lcom/robinhood/scarlet/ScarletOverlay;)V", "negativeButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getNegativeButton", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "negativeButton$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "DeviceSettingsDialogBuilder", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class DeviceSettingsDialogFragment extends RhDialogFragment {

    /* renamed from: negativeButton$delegate, reason: from kotlin metadata */
    private final Interfaces2 negativeButton;
    private final ScarletOverlay overlay;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DeviceSettingsDialogFragment.class, "negativeButton", "getNegativeButton()Lcom/robinhood/android/designsystem/button/RdsButton;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DeviceSettingsDialogFragment(ScarletOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        this.overlay = overlay;
        this.negativeButton = bindView(C11048R.id.dialog_fragment_negative_btn);
    }

    private final RdsButton getNegativeButton() {
        return (RdsButton) this.negativeButton.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), this.overlay, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton negativeButton = getNegativeButton();
        if (negativeButton != null) {
            ViewGroup.LayoutParams layoutParams = negativeButton.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.constrainedWidth = false;
                }
                negativeButton.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        RdsPogView pogView = getPogView();
        if (pogView != null) {
            ScarletManager2.overrideAttribute(pogView, R.attr.backgroundTint, ThemeAttributes.INSTANCE.getCOLOR_NEGATIVE());
        }
    }

    /* compiled from: DeviceSettingsDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devices/DeviceSettingsDialogFragment$DeviceSettingsDialogBuilder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "overlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "context", "Landroid/content/Context;", "<init>", "(Lcom/robinhood/scarlet/ScarletOverlay;Landroid/content/Context;)V", "createDialogFragment", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DeviceSettingsDialogBuilder extends RhDialogFragment.Builder {
        public static final int $stable = 8;
        private final ScarletOverlay overlay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceSettingsDialogBuilder(ScarletOverlay overlay, Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            Intrinsics.checkNotNullParameter(context, "context");
            this.overlay = overlay;
        }

        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        protected RhDialogFragment createDialogFragment() {
            return new DeviceSettingsDialogFragment(this.overlay);
        }
    }

    /* compiled from: DeviceSettingsDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devices/DeviceSettingsDialogFragment$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/securitycenter/ui/devices/DeviceSettingsDialogFragment$DeviceSettingsDialogBuilder;", "context", "Landroid/content/Context;", "overlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DeviceSettingsDialogBuilder create$default(Companion companion, Context context, ScarletOverlay scarletOverlay, int i, Object obj) {
            if ((i & 2) != 0) {
                scarletOverlay = DeviceSettingsScarletOverlays2.INSTANCE;
            }
            return companion.create(context, scarletOverlay);
        }

        public final DeviceSettingsDialogBuilder create(Context context, ScarletOverlay overlay) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            return new DeviceSettingsDialogBuilder(overlay, context);
        }
    }
}

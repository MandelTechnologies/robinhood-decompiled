package com.robinhood.android.common.mcduckling.p084ui;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.common.mcduckling.location.LocationProtectionManager;
import com.robinhood.android.common.mcduckling.p084ui.AdjustLocationSettingsDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: LocationProtectionDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003+,-B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J-\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020\u0013H\u0016J\b\u0010$\u001a\u00020\u0013H\u0002J\t\u0010%\u001a\u00020\u001fH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/mcduckling/ui/AdjustLocationSettingsDialogFragment$Callbacks;", "<init>", "()V", "locationProtectionManager", "Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;", "getLocationProtectionManager", "()Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;", "setLocationProtectionManager", "(Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;)V", "callbacks", "Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onNegativeButtonClick", "", "onPositiveButtonClick", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "missingCoarsePermission", "", "missingBackgroundPermission", "requestCoarsePermission", "requestBackgroundPermission", "onAdjustLocationSettingsDismissed", "onLocationPermissionConfirmed", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Builder", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LocationProtectionDialogFragment extends RhDialogFragment implements RegionGated, AdjustLocationSettingsDialogFragment.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LocationProtectionDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int REQUEST_BACKGROUND_PERMISSION = 0;
    private static final int REQUEST_FINE_PERMISSION = 1;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.mcduckling.ui.LocationProtectionDialogFragment$special$$inlined$targetFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment targetFragment = CallbacksProperty.getTargetFragment();
            if (targetFragment != null) {
                return targetFragment;
            }
            throw new IllegalStateException("Required value was null.");
        }
    });
    public LocationProtectionManager locationProtectionManager;

    /* compiled from: LocationProtectionDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment$Callbacks;", "", "onLocationProtectionConfirmed", "", "onLocationProtectionDismissed", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onLocationProtectionConfirmed();

        void onLocationProtectionDismissed();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public final LocationProtectionManager getLocationProtectionManager() {
        LocationProtectionManager locationProtectionManager = this.locationProtectionManager;
        if (locationProtectionManager != null) {
            return locationProtectionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationProtectionManager");
        return null;
    }

    public final void setLocationProtectionManager(LocationProtectionManager locationProtectionManager) {
        Intrinsics.checkNotNullParameter(locationProtectionManager, "<set-?>");
        this.locationProtectionManager = locationProtectionManager;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* compiled from: LocationProtectionDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment$Builder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "targetedFragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "createDialogFragment", "Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment;", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class Builder extends RhDialogFragment.Builder {
        private final Fragment targetedFragment;

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(Fragment targetedFragment) {
            Intrinsics.checkNotNullParameter(targetedFragment, "targetedFragment");
            Context contextRequireContext = targetedFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            super(contextRequireContext);
            this.targetedFragment = targetedFragment;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        public LocationProtectionDialogFragment createDialogFragment() {
            LocationProtectionDialogFragment locationProtectionDialogFragment = new LocationProtectionDialogFragment();
            locationProtectionDialogFragment.setTargetFragment(this.targetedFragment, 0);
            return locationProtectionDialogFragment;
        }
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onNegativeButtonClick() {
        dismiss();
        getCallbacks().onLocationProtectionDismissed();
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onPositiveButtonClick() {
        if (missingCoarsePermission()) {
            requestCoarsePermission();
        } else if (missingBackgroundPermission()) {
            requestBackgroundPermission();
        } else {
            onLocationPermissionConfirmed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (!getLocationProtectionManager().onRequestPermissionResult(grantResults)) {
            AdjustLocationSettingsDialogFragment.INSTANCE.showAdjustLocationSettings(this);
            return;
        }
        if (requestCode == 0) {
            onLocationPermissionConfirmed();
        } else {
            if (requestCode != 1) {
                return;
            }
            if (missingBackgroundPermission()) {
                requestBackgroundPermission();
            } else {
                onLocationPermissionConfirmed();
            }
        }
    }

    private final boolean missingCoarsePermission() {
        return !getLocationProtectionManager().hasCoarseLocation();
    }

    private final boolean missingBackgroundPermission() {
        return !getLocationProtectionManager().hasBackgroundLocation();
    }

    private final void requestCoarsePermission() {
        getLocationProtectionManager().requestCoarsePermission(this, 1);
    }

    private final void requestBackgroundPermission() {
        getLocationProtectionManager().requestBackgroundPermission(this, 0);
    }

    @Override // com.robinhood.android.common.mcduckling.ui.AdjustLocationSettingsDialogFragment.Callbacks
    public void onAdjustLocationSettingsDismissed() {
        dismiss();
    }

    private final void onLocationPermissionConfirmed() {
        dismiss();
        getCallbacks().onLocationProtectionConfirmed();
    }

    /* compiled from: LocationProtectionDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\b\"\f\b\u0000\u0010\t*\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\t¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment$Companion;", "", "<init>", "()V", "REQUEST_BACKGROUND_PERMISSION", "", "REQUEST_FINE_PERMISSION", "showLocationProtectionConfirmation", "", "C", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment$Callbacks;", "fragment", "(Landroidx/fragment/app/Fragment;)V", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <C extends Fragment & Callbacks> void showLocationProtectionConfirmation(C fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            RhDialogFragment.Builder positiveButton = new Builder(fragment).setUseDesignSystemOverlay(true).setId(C11257R.id.dialog_card_activation_location_protection_confirmation).setTitle(C11257R.string.card_activation_location_protection_confirmation_dialog_title, new Object[0]).setMessage(C11257R.string.card_activation_location_protection_confirmation_dialog_message, new Object[0]).setNegativeButton(C11048R.string.general_label_no_thanks, new Object[0]).setPositiveButton(C11257R.string.f3990xdfb98b8e, new Object[0]);
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "location-protection-confirmation", false, 4, null);
        }
    }
}

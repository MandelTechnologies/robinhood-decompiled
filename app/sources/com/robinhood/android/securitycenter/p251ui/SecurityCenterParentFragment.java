package com.robinhood.android.securitycenter.p251ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.security.contracts.MfaSettingsFragmentKey;
import com.robinhood.android.security.contracts.SecurityCenterLaunchType;
import com.robinhood.android.security.contracts.SecurityCenterTabFragmentKey;
import com.robinhood.android.securitycenter.p251ui.SecurityCenterFragment;
import com.robinhood.android.securitycenter.p251ui.data.ManageDataFragment;
import com.robinhood.android.securitycenter.p251ui.devices.DeviceDetailsFragment;
import com.robinhood.android.securitycenter.p251ui.devices.DeviceSettingsFragment;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.shared.gdpr.contracts.PrivacySettingsFragmentKey;
import com.robinhood.shared.security.contracts.PersonalDataIntentKey;
import com.robinhood.shared.security.contracts.PersonalDataRequestType;
import com.robinhood.shared.security.contracts.UpdatePasswordIntentKey;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SecurityCenterParentFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001%B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\u0018\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000eH\u0016J\b\u0010$\u001a\u00020\u0012H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterFragment$Callbacks;", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceSettingsFragment$Callbacks;", "Lcom/robinhood/android/securitycenter/ui/data/ManageDataFragment$Callbacks;", "<init>", "()V", SecurityCenterParentFragment.EXTRA_LAUNCH_TYPE, "Lcom/robinhood/android/security/contracts/SecurityCenterLaunchType;", "getLaunchType", "()Lcom/robinhood/android/security/contracts/SecurityCenterLaunchType;", "launchType$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onUpdatePasswordClicked", "onDeviceSecurityClicked", "onMfaSettingsClicked", "onTrustedDeviceListClicked", "onProfileVisibilityClicked", "onBlockingClicked", "onDataSharingPermissionsClicked", "onGdprSettingClicked", "onDataRequestClicked", "onDataDeletionClicked", "onManageDataClicked", "onDeviceClicked", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "Ljava/util/UUID;", "isRemoveDevicesEnabled", "handleLaunchType", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SecurityCenterParentFragment extends BaseFragment implements SecurityCenterFragment.Callbacks, DeviceSettingsFragment.Callbacks, ManageDataFragment.Callbacks {
    private static final String EXTRA_LAUNCH_TYPE = "launchType";

    /* renamed from: launchType$delegate, reason: from kotlin metadata */
    private final Lazy launchType;
    private final boolean useDesignSystemToolbar;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SecurityCenterParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecurityCenterLaunchType.values().length];
            try {
                iArr[SecurityCenterLaunchType.DATA_SHARING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecurityCenterLaunchType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecurityCenterLaunchType.DEVICE_SECURITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SecurityCenterLaunchType.MFA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SecurityCenterLaunchType.TRUSTED_DEVICES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SecurityCenterParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.launchType = Fragments2.argument(this, EXTRA_LAUNCH_TYPE);
        this.useDesignSystemToolbar = true;
    }

    private final SecurityCenterLaunchType getLaunchType() {
        return (SecurityCenterLaunchType) this.launchType.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, new SecurityCenterFragment());
            handleLaunchType();
        }
    }

    @Override // com.robinhood.android.securitycenter.ui.SecurityCenterFragment.Callbacks
    public void onUpdatePasswordClicked() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, UpdatePasswordIntentKey.INSTANCE, null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.securitycenter.ui.SecurityCenterFragment.Callbacks
    public void onDeviceSecurityClicked() {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), LegacyFragmentKey.DeviceSecurityFragment.INSTANCE, null, 2, null));
    }

    @Override // com.robinhood.android.securitycenter.ui.SecurityCenterFragment.Callbacks
    public void onMfaSettingsClicked() {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new MfaSettingsFragmentKey(null, null, null, null, null, null, 63, null), null, 2, null));
    }

    @Override // com.robinhood.android.securitycenter.ui.SecurityCenterFragment.Callbacks
    public void onTrustedDeviceListClicked() {
        replaceFragment(DeviceSettingsFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.securitycenter.ui.SecurityCenterFragment.Callbacks
    public void onProfileVisibilityClicked() {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new LegacyFragmentKey.ProfileVisibility(false, 1, null), null, 2, null));
    }

    @Override // com.robinhood.android.securitycenter.ui.SecurityCenterFragment.Callbacks
    public void onBlockingClicked() {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), LegacyFragmentKey.BlockedProfiles.INSTANCE, null, 2, null));
    }

    @Override // com.robinhood.android.securitycenter.ui.data.ManageDataFragment.Callbacks
    public void onDataSharingPermissionsClicked() {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), LegacyFragmentKey.DataSharingPermissionsFragment.INSTANCE, null, 2, null));
    }

    @Override // com.robinhood.android.securitycenter.ui.data.ManageDataFragment.Callbacks
    public void onGdprSettingClicked() {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new PrivacySettingsFragmentKey(PrivacySettingsFragmentKey.EntryPoint.MANAGE_YOUR_DATA), null, 2, null));
    }

    @Override // com.robinhood.android.securitycenter.ui.data.ManageDataFragment.Callbacks
    public void onDataRequestClicked() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new PersonalDataIntentKey(PersonalDataRequestType.ACCESS), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.securitycenter.ui.data.ManageDataFragment.Callbacks
    public void onDataDeletionClicked() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new PersonalDataIntentKey(PersonalDataRequestType.DELETE), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.securitycenter.ui.SecurityCenterFragment.Callbacks
    public void onManageDataClicked() {
        replaceFragment(ManageDataFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.securitycenter.ui.devices.DeviceSettingsFragment.Callbacks
    public void onDeviceClicked(UUID deviceId, boolean isRemoveDevicesEnabled) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        replaceFragment(DeviceDetailsFragment.INSTANCE.newInstance((Parcelable) new DeviceDetailsFragment.Args(deviceId, isRemoveDevicesEnabled)));
    }

    private final void handleLaunchType() {
        int i = WhenMappings.$EnumSwitchMapping$0[getLaunchType().ordinal()];
        if (i == 1) {
            onDataSharingPermissionsClicked();
            return;
        }
        if (i != 2) {
            if (i == 3) {
                onDeviceSecurityClicked();
            } else if (i == 4) {
                onMfaSettingsClicked();
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                onTrustedDeviceListClicked();
            }
        }
    }

    /* compiled from: SecurityCenterParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/security/contracts/SecurityCenterTabFragmentKey;", "<init>", "()V", "EXTRA_LAUNCH_TYPE", "", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements FragmentResolver<SecurityCenterTabFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(SecurityCenterTabFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            SecurityCenterParentFragment securityCenterParentFragment = new SecurityCenterParentFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(SecurityCenterParentFragment.EXTRA_LAUNCH_TYPE, key.getLaunchType());
            securityCenterParentFragment.setArguments(bundle);
            return securityCenterParentFragment;
        }
    }
}

package com.robinhood.android.privacysettings.p217ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.privacysettings.p217ui.visibility.ProfileVisibilityFragment;
import com.robinhood.android.social.contracts.EditProfileAndVisibilityFragmentKey;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditProfileAndVisibilityParentFragment.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/privacysettings/ui/EditProfileAndVisibilityParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityFragment$Callbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "setupProfile", "Companion", "feature-privacy-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class EditProfileAndVisibilityParentFragment extends BaseFragment implements ProfileVisibilityFragment.Callbacks {
    private final boolean useDesignSystemToolbar;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseFragment.$stable;

    public EditProfileAndVisibilityParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.useDesignSystemToolbar = true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, ProfileVisibilityFragment.INSTANCE.newInstance((Parcelable) new LegacyFragmentKey.ProfileVisibility(true)));
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityFragment.Callbacks
    public void setupProfile() {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new LegacyFragmentKey.ProfileEdit(LegacyFragmentKey.ProfileEdit.Context.FROM_EDIT_VISIBILITY), null, 2, null));
    }

    /* compiled from: EditProfileAndVisibilityParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/privacysettings/ui/EditProfileAndVisibilityParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/privacysettings/ui/EditProfileAndVisibilityParentFragment;", "Lcom/robinhood/android/social/contracts/EditProfileAndVisibilityFragmentKey;", "<init>", "()V", "feature-privacy-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<EditProfileAndVisibilityParentFragment, EditProfileAndVisibilityFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(EditProfileAndVisibilityFragmentKey editProfileAndVisibilityFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, editProfileAndVisibilityFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EditProfileAndVisibilityFragmentKey getArgs(EditProfileAndVisibilityParentFragment editProfileAndVisibilityParentFragment) {
            return (EditProfileAndVisibilityFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, editProfileAndVisibilityParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EditProfileAndVisibilityParentFragment newInstance(EditProfileAndVisibilityFragmentKey editProfileAndVisibilityFragmentKey) {
            return (EditProfileAndVisibilityParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, editProfileAndVisibilityFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EditProfileAndVisibilityParentFragment editProfileAndVisibilityParentFragment, EditProfileAndVisibilityFragmentKey editProfileAndVisibilityFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, editProfileAndVisibilityParentFragment, editProfileAndVisibilityFragmentKey);
        }
    }
}

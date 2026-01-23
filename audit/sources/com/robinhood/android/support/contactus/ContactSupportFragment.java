package com.robinhood.android.support.contactus;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.webkit.WebStorage;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.lib.webview.C20684R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.support.C28777R;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.shared.support.contracts.ContactSupportHybridFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactSupportFragment.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0017J\b\u0010\u0011\u001a\u00020\tH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/support/contactus/ContactSupportFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "onPositiveButtonClicked", "passthroughArgs", "showNpfFragment", "Companion", "feature-support_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ContactSupportFragment extends BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean useDesignSystemToolbar;

    public ContactSupportFragment() {
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
        try {
            WebStorage.getInstance();
            if (getCurrentFragment(C11048R.id.fragment_container) == null) {
                showNpfFragment();
            }
        } catch (AndroidRuntimeException unused) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setId(C28777R.id.dialog_id_support_no_webview).setTitle(C20684R.string.error_no_webview_title, new Object[0]).setMessage(C20684R.string.error_no_webview_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "no_system_webview", false, 4, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C28777R.id.dialog_id_support_no_webview) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    @SuppressLint({"QueryPermissionsNeeded"})
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C28777R.id.dialog_id_support_no_webview) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intent intent = new Intent("android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS");
            if (intent.resolveActivity(fragmentActivityRequireActivity.getPackageManager()) != null) {
                fragmentActivityRequireActivity.startActivity(intent);
            }
            fragmentActivityRequireActivity.finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    private final void showNpfFragment() {
        setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new ContactSupportHybridFragmentKey((ContactSupportFragmentKey) INSTANCE.getArgs((Fragment) this)), null, 2, null));
    }

    /* compiled from: ContactSupportFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/contactus/ContactSupportFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/support/contactus/ContactSupportFragment;", "Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey;", "<init>", "()V", "feature-support_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ContactSupportFragment, ContactSupportFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(ContactSupportFragmentKey contactSupportFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, contactSupportFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ContactSupportFragmentKey getArgs(ContactSupportFragment contactSupportFragment) {
            return (ContactSupportFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, contactSupportFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ContactSupportFragment newInstance(ContactSupportFragmentKey contactSupportFragmentKey) {
            return (ContactSupportFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, contactSupportFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ContactSupportFragment contactSupportFragment, ContactSupportFragmentKey contactSupportFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, contactSupportFragment, contactSupportFragmentKey);
        }
    }
}

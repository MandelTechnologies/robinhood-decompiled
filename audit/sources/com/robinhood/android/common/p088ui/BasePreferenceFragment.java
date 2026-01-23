package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.TypefaceUtils;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.font.CustomTypefaceSpan2;
import com.robinhood.android.font.RhTypeface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: BasePreferenceFragment.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0016J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001a\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0004J\u001a\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0004J\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001a2\u0006\u0010!\u001a\u00020\"H\u0004J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(H\u0017J\b\u0010)\u001a\u00020\"H\u0016J\u0018\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020-H\u0014R\u0014\u0010/\u001a\u000200X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BasePreferenceFragment;", "Lcom/robinhood/android/common/ui/RxPreferenceFragment;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "<init>", "()V", "onCreateHeaderView", "", "inflater", "Landroid/view/LayoutInflater;", "headerContainer", "Landroid/view/ViewGroup;", "onCreateFooterView", "footerContainer", "onCreateView", "Landroid/view/View;", "container", "savedInstanceState", "Landroid/os/Bundle;", "addPreferencesFromResource", "preferencesResId", "", "applyFontToPreferenceGroup", "preferenceGroup", "Landroidx/preference/PreferenceGroup;", "setTitle", "pref", "Landroidx/preference/Preference;", "title", "", "setSummary", ErrorBundle.SUMMARY_ENTRY, "setPreferenceVisibility", "preference", "visible", "", "onResume", "onCreateLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "Landroid/view/MenuInflater;", "createOptionsMenu", "screenName", "", "getScreenName", "()Ljava/lang/String;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class BasePreferenceFragment extends Hammer_BasePreferenceFragment implements UiCallbacks.ScreenViewAnalyticable {
    public static final int $stable = 8;
    private final String screenName;

    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }

    @Override // com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return false;
    }

    public void onCreateFooterView(LayoutInflater inflater, ViewGroup footerContainer) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(footerContainer, "footerContainer");
    }

    public void onCreateHeaderView(LayoutInflater inflater, ViewGroup headerContainer) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(headerContainer, "headerContainer");
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getAndResetTransitionReason() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getAndResetTransitionReason(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getEntityId() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getEntityId(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getExcludeFromAnalyticsLogging(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromSourceLogging() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getExcludeFromSourceLogging(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public Integer getScreenDepth() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenDepth(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenDescription(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenMessageType() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenMessageType(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenSource(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenTag(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenType() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenType(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean isParentScreen() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.isParentScreen(this);
    }

    public BasePreferenceFragment() {
        super(null);
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.screenName = simpleName;
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(viewOnCreateView, "onCreateView(...)");
        View viewFindViewById = viewOnCreateView.findViewById(C13997R.id.preferences_header_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        onCreateHeaderView(inflater, (ViewGroup) viewFindViewById);
        View viewFindViewById2 = viewOnCreateView.findViewById(C13997R.id.preferences_footer_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        onCreateFooterView(inflater, (ViewGroup) viewFindViewById2);
        return viewOnCreateView;
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public void addPreferencesFromResource(int preferencesResId) {
        super.addPreferencesFromResource(preferencesResId);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        Intrinsics.checkNotNullExpressionValue(preferenceScreen, "getPreferenceScreen(...)");
        applyFontToPreferenceGroup(preferenceScreen);
    }

    private final void applyFontToPreferenceGroup(PreferenceGroup preferenceGroup) {
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            Preference preference = preferenceGroup.getPreference(i);
            Intrinsics.checkNotNullExpressionValue(preference, "getPreference(...)");
            setTitle(preference, preference.getTitle());
            setSummary(preference, preference.getSummary());
            if (preference instanceof PreferenceGroup) {
                applyFontToPreferenceGroup((PreferenceGroup) preference);
            }
        }
    }

    protected final void setTitle(Preference pref, CharSequence title) {
        Intrinsics.checkNotNullParameter(pref, "pref");
        if (title != null && title.length() != 0) {
            RhTypeface rhTypeface = RhTypeface.MEDIUM;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            pref.setTitle(CustomTypefaceSpan2.withTypeface(title, rhTypeface.load(contextRequireContext)));
            return;
        }
        pref.setTitle(title);
    }

    protected final void setSummary(Preference pref, CharSequence summary) {
        Intrinsics.checkNotNullParameter(pref, "pref");
        if (summary != null && summary.length() != 0) {
            RhTypeface rhTypeface = RhTypeface.REGULAR;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            pref.setSummary(CustomTypefaceSpan2.withTypeface(summary, rhTypeface.load(contextRequireContext)));
            return;
        }
        pref.setSummary(summary);
    }

    protected final void setPreferenceVisibility(Preference preference, boolean visible) {
        if (preference == null) {
            return;
        }
        if (visible) {
            getPreferenceScreen().addPreference(preference);
        } else {
            getPreferenceScreen().removePreference(preference);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxPreferenceFragment, androidx.fragment.app.Fragment
    public void onResume() {
        RhToolbar rhToolbar;
        super.onResume();
        FragmentActivity activity = getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity == null || (rhToolbar = baseActivity.getRhToolbar()) == null) {
            return;
        }
        configureToolbar(rhToolbar);
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public LinearLayoutManager onCreateLayoutManager() {
        return new LinearLayoutManager(getContext()) { // from class: com.robinhood.android.common.ui.BasePreferenceFragment.onCreateLayoutManager.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
    }

    @Override // com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        toolbar.reset();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        createOptionsMenu(menu, inflater);
        TypefaceUtils typefaceUtils = TypefaceUtils.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        TypefaceUtils.applyFontToMenu$default(typefaceUtils, fragmentActivityRequireActivity, menu, null, 4, null);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }
}

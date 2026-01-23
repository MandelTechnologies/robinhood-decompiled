package com.robinhood.android.common.tabs;

import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseTabFragment;
import kotlin.Metadata;

/* compiled from: TabManager.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/tabs/TabManager;", "", "replaceFragmentInActiveTab", "", "fragment", "Landroidx/fragment/app/Fragment;", "onFragmentChanged", "tabFragment", "Lcom/robinhood/android/common/ui/BaseTabFragment;", "reThemeToolbar", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface TabManager {
    void onFragmentChanged(BaseTabFragment tabFragment);

    void reThemeToolbar();

    void replaceFragmentInActiveTab(Fragment fragment);
}

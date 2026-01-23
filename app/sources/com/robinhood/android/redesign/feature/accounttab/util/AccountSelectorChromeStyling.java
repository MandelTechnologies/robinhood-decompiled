package com.robinhood.android.redesign.feature.accounttab.util;

import android.content.Context;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.libs.tabs.ChromeStyleController;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectorChromeStyling.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, m3636d2 = {"updateChromeStyle", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "currentTabInfo", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo;", "context", "Landroid/content/Context;", "feature-account-selector_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorChromeStylingKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AccountSelectorChromeStyling {
    public static final void updateChromeStyle(FragmentManager fragmentManager, AccountTabInfo currentTabInfo, Context context) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(currentTabInfo, "currentTabInfo");
        Intrinsics.checkNotNullParameter(context, "context");
        Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(currentTabInfo.getId());
        BaseFragment baseFragment = fragmentFindFragmentByTag instanceof BaseFragment ? (BaseFragment) fragmentFindFragmentByTag : null;
        if (baseFragment != null) {
            KeyEventDispatcher.Component componentFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
            ChromeStyleController chromeStyleController = componentFindActivityBaseContext instanceof ChromeStyleController ? (ChromeStyleController) componentFindActivityBaseContext : null;
            if (chromeStyleController != null) {
                chromeStyleController.updateChromeStyling(baseFragment);
            }
        }
    }
}

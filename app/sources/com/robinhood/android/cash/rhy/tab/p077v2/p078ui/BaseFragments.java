package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import android.content.Context;
import android.view.ViewGroup;
import com.robinhood.android.assethomes.AssetHomeTopAppBar;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.logging.RhyEventLoggingUtils;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.p088ui.view.TopNavButtonView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseFragments.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"configureRhyToolbar", "", "Lcom/robinhood/android/common/ui/BaseFragment;", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.BaseFragmentsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BaseFragments {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureRhyToolbar$lambda$0(BaseFragment baseFragment) {
        Navigator navigator = baseFragment.getNavigator();
        Context contextRequireContext = baseFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, LegacyFragmentKey.InboxThreadList.INSTANCE, false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor configureRhyToolbar$lambda$3$lambda$1() {
        return new UserInteractionEventDescriptor(null, RhyEventLoggingUtils.INSTANCE.getRhyTabScreen(), UserInteractionEventData.Action.VIEW_SEARCH, null, new Component(Component.ComponentType.BUTTON, AssetHomeTopAppBar.SEARCH_IDENTIFIER, null, 4, null), null, 41, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureRhyToolbar$lambda$3$lambda$2(BaseFragment baseFragment) {
        if (baseFragment.isAdded()) {
            Navigator navigator = baseFragment.getNavigator();
            Context contextRequireContext = baseFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new SearchFragmentKey(null, null, null, null, null, null, false, null, 255, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        return Unit.INSTANCE;
    }

    public static final void configureRhyToolbar(final BaseFragment baseFragment, RhToolbar toolbar) {
        RhToolbar rhToolbar;
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        toolbar.setVisibility(0);
        if (((ViewGroup) toolbar.findViewById(C10285R.id.rhy_common_toolbar_container)) == null) {
            rhToolbar = toolbar;
            RhToolbar.addCustomView$default(rhToolbar, C10285R.layout.rhy_common_fragment_toolbar, false, 8388613, 2, null);
            TopNavButtonView topNavButtonView = (TopNavButtonView) rhToolbar.findViewById(C10285R.id.rhy_common_toolbar_inbox_button);
            if (topNavButtonView != null) {
                OnClickListeners.onClick(topNavButtonView, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.BaseFragmentsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseFragments.configureRhyToolbar$lambda$0(baseFragment);
                    }
                });
            }
        } else {
            rhToolbar = toolbar;
        }
        TopNavButtonView topNavButtonView2 = (TopNavButtonView) rhToolbar.findViewById(C10285R.id.rhy_common_toolbar_search_button);
        if (topNavButtonView2 != null) {
            topNavButtonView2.setVisibility(0);
            ViewsKt.setLoggingConfig(topNavButtonView2, new AutoLoggingConfig(false, false, 2, null));
            ViewsKt.eventData$default(topNavButtonView2, false, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.BaseFragmentsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseFragments.configureRhyToolbar$lambda$3$lambda$1();
                }
            }, 1, null);
            OnClickListeners.onClick(topNavButtonView2, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.BaseFragmentsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseFragments.configureRhyToolbar$lambda$3$lambda$2(baseFragment);
                }
            });
        }
    }
}

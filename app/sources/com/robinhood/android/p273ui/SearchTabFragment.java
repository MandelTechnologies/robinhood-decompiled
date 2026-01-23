package com.robinhood.android.p273ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCaller;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseTabFragment;
import com.robinhood.android.common.p088ui.tabs.Scrollable;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.android.search.highlights.interactions.SearchHighlightInteractable;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchTabFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0014J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/ui/SearchTabFragment;", "Lcom/robinhood/android/common/ui/BaseTabFragment;", "Lcom/robinhood/android/common/ui/tabs/Scrollable;", "Lcom/robinhood/android/search/highlights/interactions/SearchHighlightInteractable;", "<init>", "()V", "handler", "Landroid/os/Handler;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showRootFragment", "processDeeplink", "tabIntentKey", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey$Search;", "Companion", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SearchTabFragment extends BaseTabFragment implements Scrollable, SearchHighlightInteractable {
    private final Handler handler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SearchTabFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.handler = new Handler(Looper.getMainLooper());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            showRootFragment();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getRootFragment() != null) {
            handleDeeplink();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseTabFragment
    protected void showRootFragment() {
        setRootFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new SearchFragmentKey(null, null, null, SearchFragmentKey.Source.UNIVERSAL, null, null, true, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, null), null, 2, null));
    }

    @Override // com.robinhood.android.search.highlights.interactions.SearchHighlightInteractable
    public void processDeeplink(final TabLinkIntentKey.Search tabIntentKey) {
        Intrinsics.checkNotNullParameter(tabIntentKey, "tabIntentKey");
        this.handler.post(new Runnable() { // from class: com.robinhood.android.ui.SearchTabFragment.processDeeplink.1
            @Override // java.lang.Runnable
            public final void run() {
                Fragment rootFragment = SearchTabFragment.this.getRootFragment();
                if (rootFragment == null || !rootFragment.isAdded()) {
                    return;
                }
                ActivityResultCaller rootFragment2 = SearchTabFragment.this.getRootFragment();
                SearchHighlightInteractable searchHighlightInteractable = rootFragment2 instanceof SearchHighlightInteractable ? (SearchHighlightInteractable) rootFragment2 : null;
                if (searchHighlightInteractable != null) {
                    searchHighlightInteractable.processDeeplink(tabIntentKey);
                }
            }
        });
    }

    /* compiled from: SearchTabFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/ui/SearchTabFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/ui/SearchTabFragment;", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SearchTabFragment newInstance() {
            return new SearchTabFragment();
        }
    }
}

package com.robinhood.android.search.deeplinks;

import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.home.contracts.WatchListIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.android.search.deeplinks.SearchDeeplinkTarget;
import com.robinhood.hammer.android.EntryPoints;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"buildIntentsForSearchOrBrowse", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplinks_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.deeplinks.SearchDeeplinkTargetKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchDeeplinkTarget2 {
    public static final Intent[] buildIntentsForSearchOrBrowse(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Uri uri = deeplinkContext.getUri();
        String queryParameter = uri.getQueryParameter("account_number");
        String queryParameter2 = uri.getQueryParameter("activate_search_bar");
        boolean z = queryParameter2 != null && Boolean.parseBoolean(queryParameter2);
        String queryParameter3 = uri.getQueryParameter("subpage");
        SearchFragmentKey.TargetSection targetSection = (SearchFragmentKey.TargetSection) SearchFragmentKey.TargetSection.INSTANCE.fromServerValue(deeplinkContext.getUri().getQueryParameter("target_section"));
        SearchFragmentKey.Source source = (SearchFragmentKey.Source) SearchFragmentKey.Source.INSTANCE.fromServerValue(uri.getQueryParameter("context"));
        if (source == null) {
            source = SearchFragmentKey.Source.UNIVERSAL;
        }
        SearchFragmentKey.Source source2 = source;
        if (((SearchDeeplinkTarget.DeeplinkEntryPoint) EntryPoints.applicationEntryPoint(deeplinkContext.getContext())).accountSelectorHomeManager().isAccountSelectorEnabled()) {
            return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new TabLinkIntentKey.Search(queryParameter3), null, false, 12, null)};
        }
        if (z) {
            return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new WatchListIntentKey(WatchListIntentKey2.SEARCH), null, false, 12, null)};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new SearchFragmentKey(null, null, queryParameter, source2, null, targetSection, false, queryParameter3, 83, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null)};
    }
}

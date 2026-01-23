package com.robinhood.android.newsfeed.extensions;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.view.util.LoggedCustomTabs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggedCustomTabs.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, m3636d2 = {"showNewsFeedArticle", "", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "context", "Landroid/content/Context;", "article", "Lcom/robinhood/android/newsfeed/model/Content$Article;", "analyticsPrefix", "", "sourceScreenName", "feature-lib-newsfeed_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.newsfeed.extensions.LoggedCustomTabsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class LoggedCustomTabs2 {
    public static final void showNewsFeedArticle(LoggedCustomTabs loggedCustomTabs, Context context, Content.Article article, String analyticsPrefix, String sourceScreenName) {
        Intrinsics.checkNotNullParameter(loggedCustomTabs, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(article, "article");
        Intrinsics.checkNotNullParameter(analyticsPrefix, "analyticsPrefix");
        Intrinsics.checkNotNullParameter(sourceScreenName, "sourceScreenName");
        LoggedCustomTabs.viewUrl$default(loggedCustomTabs, context, article.getUrl(), analyticsPrefix + AnalyticsStrings.NEWS_FEED_SNIPPET, article.getId().toString(), null, null, article.getParentElement().getTemplate(), article.getAnalyticsContentType(), null, null, sourceScreenName, 816, null);
    }
}

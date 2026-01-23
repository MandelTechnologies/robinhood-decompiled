package com.robinhood.android.lib.pathfinder;

import android.app.Application;
import com.robinhood.targetbackend.TargetBackend;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import okhttp3.HttpUrl;

/* compiled from: PathfinderUrlProvider.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderUrlProvider;", "", "app", "Landroid/app/Application;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "<init>", "(Landroid/app/Application;Lcom/robinhood/targetbackend/TargetBackend;)V", "url", "Lokhttp3/HttpUrl;", "getUrl", "()Lokhttp3/HttpUrl;", "debugUrl", "getDebugUrl", "hostedUrl", "getHostedUrl", "Companion", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class PathfinderUrlProvider {
    private final Application app;
    private final TargetBackend targetBackend;
    public static final int $stable = 8;
    private static final Regex EXTERNAL_TEST_NAMESPACE_REGEX = new Regex("https://api--(.*)\\.apollo\\.rhinternal\\.net/");

    public PathfinderUrlProvider(Application app, TargetBackend targetBackend) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        this.app = app;
        this.targetBackend = targetBackend;
    }

    public final HttpUrl getUrl() {
        String string2;
        List<String> groupValues;
        TargetBackend targetBackend = this.targetBackend;
        TargetBackend.Companion companion = TargetBackend.INSTANCE;
        if (Intrinsics.areEqual(targetBackend, companion.getEXTERNAL_TEST()) || Intrinsics.areEqual(this.targetBackend, companion.getEXTERNAL_TEST_DEGRADED())) {
            String apolloNamespace = this.targetBackend.getEndpoint().getApolloNamespace();
            Intrinsics.checkNotNull(apolloNamespace);
            String str = null;
            MatchResult matchResultFind$default = Regex.find$default(EXTERNAL_TEST_NAMESPACE_REGEX, apolloNamespace, 0, 2, null);
            if (matchResultFind$default != null && (groupValues = matchResultFind$default.getGroupValues()) != null) {
                str = (String) CollectionsKt.last((List) groupValues);
            }
            string2 = this.app.getString(C20366R.string.url_contact_support_apollo, str);
        } else if (this.targetBackend.isApollo()) {
            Application application = this.app;
            int i = C20366R.string.url_contact_support_apollo;
            String apolloNamespace2 = this.targetBackend.getEndpoint().getApolloNamespace();
            Intrinsics.checkNotNull(apolloNamespace2);
            string2 = application.getString(i, apolloNamespace2);
        } else {
            string2 = this.app.getString(C20366R.string.url_contact_support);
        }
        Intrinsics.checkNotNull(string2);
        return HttpUrl.INSTANCE.get(string2);
    }

    public final HttpUrl getDebugUrl() {
        String string2;
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        if (this.targetBackend.isApollo()) {
            Application application = this.app;
            int i = C20366R.string.url_contact_support_debug_apollo;
            String apolloNamespace = this.targetBackend.getEndpoint().getApolloNamespace();
            Intrinsics.checkNotNull(apolloNamespace);
            string2 = application.getString(i, apolloNamespace);
        } else {
            string2 = this.app.getString(C20366R.string.url_contact_support_debug);
        }
        Intrinsics.checkNotNull(string2);
        return companion.get(string2);
    }

    public final HttpUrl getHostedUrl() {
        String string2;
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        if (this.targetBackend.isApollo()) {
            Application application = this.app;
            int i = C20366R.string.url_contact_support_hosted_apollo;
            String apolloNamespace = this.targetBackend.getEndpoint().getApolloNamespace();
            Intrinsics.checkNotNull(apolloNamespace);
            string2 = application.getString(i, apolloNamespace);
        } else {
            string2 = this.app.getString(C20366R.string.url_contact_support_hosted);
        }
        Intrinsics.checkNotNull(string2);
        return companion.get(string2);
    }
}

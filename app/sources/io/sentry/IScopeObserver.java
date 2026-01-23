package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.User;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes21.dex */
public interface IScopeObserver {
    void addBreadcrumb(Breadcrumb breadcrumb);

    void setBreadcrumbs(Collection<Breadcrumb> collection);

    void setContexts(Contexts contexts);

    void setTag(String str, String str2);

    void setTags(Map<String, String> map);

    void setTrace(SpanContext spanContext, IScope iScope);

    void setTransaction(String str);

    void setUser(User user);
}

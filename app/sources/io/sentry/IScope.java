package io.sentry;

import io.sentry.Scope;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes21.dex */
public interface IScope {
    void addBreadcrumb(Breadcrumb breadcrumb, Hint hint);

    void clear();

    void clearTransaction();

    /* renamed from: clone */
    IScope m28501clone();

    Session endSession();

    List<Attachment> getAttachments();

    Queue<Breadcrumb> getBreadcrumbs();

    Contexts getContexts();

    List<EventProcessor> getEventProcessors();

    Map<String, Object> getExtras();

    List<String> getFingerprint();

    SentryLevel getLevel();

    PropagationContext getPropagationContext();

    SentryId getReplayId();

    Request getRequest();

    Session getSession();

    ISpan getSpan();

    Map<String, String> getTags();

    ITransaction getTransaction();

    String getTransactionName();

    User getUser();

    void setContexts(String str, String str2);

    void setPropagationContext(PropagationContext propagationContext);

    void setScreen(String str);

    void setTag(String str, String str2);

    void setTransaction(ITransaction iTransaction);

    void setUser(User user);

    Scope.SessionPair startSession();

    PropagationContext withPropagationContext(Scope.IWithPropagationContext iWithPropagationContext);

    Session withSession(Scope.IWithSession iWithSession);

    void withTransaction(Scope.IWithTransaction iWithTransaction);
}

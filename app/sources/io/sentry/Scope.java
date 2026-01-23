package io.sentry;

import io.sentry.protocol.App;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes21.dex */
public final class Scope implements IScope {
    private List<Attachment> attachments;
    private final Queue<Breadcrumb> breadcrumbs;
    private Contexts contexts;
    private List<EventProcessor> eventProcessors;
    private Map<String, Object> extra;
    private List<String> fingerprint;
    private SentryLevel level;
    private final SentryOptions options;
    private PropagationContext propagationContext;
    private final Object propagationContextLock;
    private SentryId replayId;
    private Request request;
    private String screen;
    private volatile Session session;
    private final Object sessionLock;
    private Map<String, String> tags;
    private ITransaction transaction;
    private final Object transactionLock;
    private String transactionName;
    private User user;

    public interface IWithPropagationContext {
        void accept(PropagationContext propagationContext);
    }

    /* loaded from: classes14.dex */
    interface IWithSession {
        void accept(Session session);
    }

    public interface IWithTransaction {
        void accept(ITransaction iTransaction);
    }

    public Scope(SentryOptions sentryOptions) {
        this.fingerprint = new ArrayList();
        this.tags = new ConcurrentHashMap();
        this.extra = new ConcurrentHashMap();
        this.eventProcessors = new CopyOnWriteArrayList();
        this.sessionLock = new Object();
        this.transactionLock = new Object();
        this.propagationContextLock = new Object();
        this.contexts = new Contexts();
        this.attachments = new CopyOnWriteArrayList();
        this.replayId = SentryId.EMPTY_ID;
        SentryOptions sentryOptions2 = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        this.options = sentryOptions2;
        this.breadcrumbs = createBreadcrumbsList(sentryOptions2.getMaxBreadcrumbs());
        this.propagationContext = new PropagationContext();
    }

    private Scope(Scope scope) {
        this.fingerprint = new ArrayList();
        this.tags = new ConcurrentHashMap();
        this.extra = new ConcurrentHashMap();
        this.eventProcessors = new CopyOnWriteArrayList();
        this.sessionLock = new Object();
        this.transactionLock = new Object();
        this.propagationContextLock = new Object();
        this.contexts = new Contexts();
        this.attachments = new CopyOnWriteArrayList();
        this.replayId = SentryId.EMPTY_ID;
        this.transaction = scope.transaction;
        this.transactionName = scope.transactionName;
        this.session = scope.session;
        this.options = scope.options;
        this.level = scope.level;
        User user = scope.user;
        this.user = user != null ? new User(user) : null;
        this.screen = scope.screen;
        this.replayId = scope.replayId;
        Request request = scope.request;
        this.request = request != null ? new Request(request) : null;
        this.fingerprint = new ArrayList(scope.fingerprint);
        this.eventProcessors = new CopyOnWriteArrayList(scope.eventProcessors);
        Breadcrumb[] breadcrumbArr = (Breadcrumb[]) scope.breadcrumbs.toArray(new Breadcrumb[0]);
        Queue<Breadcrumb> queueCreateBreadcrumbsList = createBreadcrumbsList(scope.options.getMaxBreadcrumbs());
        for (Breadcrumb breadcrumb : breadcrumbArr) {
            queueCreateBreadcrumbsList.add(new Breadcrumb(breadcrumb));
        }
        this.breadcrumbs = queueCreateBreadcrumbsList;
        Map<String, String> map = scope.tags;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.tags = concurrentHashMap;
        Map<String, Object> map2 = scope.extra;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.extra = concurrentHashMap2;
        this.contexts = new Contexts(scope.contexts);
        this.attachments = new CopyOnWriteArrayList(scope.attachments);
        this.propagationContext = new PropagationContext(scope.propagationContext);
    }

    @Override // io.sentry.IScope
    public SentryLevel getLevel() {
        return this.level;
    }

    @Override // io.sentry.IScope
    public String getTransactionName() {
        ITransaction iTransaction = this.transaction;
        return iTransaction != null ? iTransaction.getName() : this.transactionName;
    }

    @Override // io.sentry.IScope
    public ISpan getSpan() {
        Span latestActiveSpan;
        ITransaction iTransaction = this.transaction;
        return (iTransaction == null || (latestActiveSpan = iTransaction.getLatestActiveSpan()) == null) ? iTransaction : latestActiveSpan;
    }

    @Override // io.sentry.IScope
    public void setTransaction(ITransaction iTransaction) {
        synchronized (this.transactionLock) {
            try {
                this.transaction = iTransaction;
                for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
                    if (iTransaction != null) {
                        iScopeObserver.setTransaction(iTransaction.getName());
                        iScopeObserver.setTrace(iTransaction.getSpanContext(), this);
                    } else {
                        iScopeObserver.setTransaction(null);
                        iScopeObserver.setTrace(null, this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.sentry.IScope
    public User getUser() {
        return this.user;
    }

    @Override // io.sentry.IScope
    public void setUser(User user) {
        this.user = user;
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setUser(user);
        }
    }

    @Override // io.sentry.IScope
    public void setScreen(String str) {
        this.screen = str;
        Contexts contexts = getContexts();
        App app = contexts.getApp();
        if (app == null) {
            app = new App();
            contexts.setApp(app);
        }
        if (str == null) {
            app.setViewNames(null);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            app.setViewNames(arrayList);
        }
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setContexts(contexts);
        }
    }

    @Override // io.sentry.IScope
    public SentryId getReplayId() {
        return this.replayId;
    }

    @Override // io.sentry.IScope
    public Request getRequest() {
        return this.request;
    }

    @Override // io.sentry.IScope
    public List<String> getFingerprint() {
        return this.fingerprint;
    }

    @Override // io.sentry.IScope
    public Queue<Breadcrumb> getBreadcrumbs() {
        return this.breadcrumbs;
    }

    @Override // io.sentry.IScope
    public void addBreadcrumb(Breadcrumb breadcrumb, Hint hint) {
        if (breadcrumb == null) {
            return;
        }
        if (hint == null) {
            new Hint();
        }
        this.options.getBeforeBreadcrumb();
        this.breadcrumbs.add(breadcrumb);
        for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
            iScopeObserver.addBreadcrumb(breadcrumb);
            iScopeObserver.setBreadcrumbs(this.breadcrumbs);
        }
    }

    public void clearBreadcrumbs() {
        this.breadcrumbs.clear();
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setBreadcrumbs(this.breadcrumbs);
        }
    }

    @Override // io.sentry.IScope
    public void clearTransaction() {
        synchronized (this.transactionLock) {
            this.transaction = null;
        }
        this.transactionName = null;
        for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
            iScopeObserver.setTransaction(null);
            iScopeObserver.setTrace(null, this);
        }
    }

    @Override // io.sentry.IScope
    public ITransaction getTransaction() {
        return this.transaction;
    }

    @Override // io.sentry.IScope
    public void clear() {
        this.level = null;
        this.user = null;
        this.request = null;
        this.screen = null;
        this.fingerprint.clear();
        clearBreadcrumbs();
        this.tags.clear();
        this.extra.clear();
        this.eventProcessors.clear();
        clearTransaction();
        clearAttachments();
    }

    @Override // io.sentry.IScope
    public Map<String, String> getTags() {
        return CollectionUtils.newConcurrentHashMap(this.tags);
    }

    @Override // io.sentry.IScope
    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
        for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
            iScopeObserver.setTag(str, str2);
            iScopeObserver.setTags(this.tags);
        }
    }

    @Override // io.sentry.IScope
    public Map<String, Object> getExtras() {
        return this.extra;
    }

    @Override // io.sentry.IScope
    public Contexts getContexts() {
        return this.contexts;
    }

    public void setContexts(String str, Object obj) {
        this.contexts.put(str, obj);
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setContexts(this.contexts);
        }
    }

    @Override // io.sentry.IScope
    public void setContexts(String str, String str2) {
        HashMap map = new HashMap();
        map.put("value", str2);
        setContexts(str, map);
    }

    @Override // io.sentry.IScope
    public List<Attachment> getAttachments() {
        return new CopyOnWriteArrayList(this.attachments);
    }

    public void clearAttachments() {
        this.attachments.clear();
    }

    private Queue<Breadcrumb> createBreadcrumbsList(int i) {
        return SynchronizedQueue.synchronizedQueue(new CircularFifoQueue(i));
    }

    @Override // io.sentry.IScope
    public List<EventProcessor> getEventProcessors() {
        return this.eventProcessors;
    }

    @Override // io.sentry.IScope
    public Session withSession(IWithSession iWithSession) {
        Session sessionM28513clone;
        synchronized (this.sessionLock) {
            try {
                iWithSession.accept(this.session);
                sessionM28513clone = this.session != null ? this.session.m28513clone() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sessionM28513clone;
    }

    @Override // io.sentry.IScope
    public SessionPair startSession() {
        SessionPair sessionPair;
        synchronized (this.sessionLock) {
            try {
                if (this.session != null) {
                    this.session.end();
                }
                Session session = this.session;
                sessionPair = null;
                if (this.options.getRelease() != null) {
                    this.session = new Session(this.options.getDistinctId(), this.user, this.options.getEnvironment(), this.options.getRelease());
                    sessionPair = new SessionPair(this.session.m28513clone(), session != null ? session.m28513clone() : null);
                } else {
                    this.options.getLogger().log(SentryLevel.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sessionPair;
    }

    static final class SessionPair {
        private final Session current;
        private final Session previous;

        public SessionPair(Session session, Session session2) {
            this.current = session;
            this.previous = session2;
        }

        public Session getPrevious() {
            return this.previous;
        }

        public Session getCurrent() {
            return this.current;
        }
    }

    @Override // io.sentry.IScope
    public Session endSession() {
        Session session;
        synchronized (this.sessionLock) {
            try {
                session = null;
                if (this.session != null) {
                    this.session.end();
                    Session sessionM28513clone = this.session.m28513clone();
                    this.session = null;
                    session = sessionM28513clone;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return session;
    }

    @Override // io.sentry.IScope
    public void withTransaction(IWithTransaction iWithTransaction) {
        synchronized (this.transactionLock) {
            iWithTransaction.accept(this.transaction);
        }
    }

    @Override // io.sentry.IScope
    public Session getSession() {
        return this.session;
    }

    @Override // io.sentry.IScope
    public void setPropagationContext(PropagationContext propagationContext) {
        this.propagationContext = propagationContext;
        SpanContext spanContext = propagationContext.toSpanContext();
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setTrace(spanContext, this);
        }
    }

    @Override // io.sentry.IScope
    public PropagationContext getPropagationContext() {
        return this.propagationContext;
    }

    @Override // io.sentry.IScope
    public PropagationContext withPropagationContext(IWithPropagationContext iWithPropagationContext) {
        PropagationContext propagationContext;
        synchronized (this.propagationContextLock) {
            iWithPropagationContext.accept(this.propagationContext);
            propagationContext = new PropagationContext(this.propagationContext);
        }
        return propagationContext;
    }

    @Override // io.sentry.IScope
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IScope m28501clone() {
        return new Scope(this);
    }
}

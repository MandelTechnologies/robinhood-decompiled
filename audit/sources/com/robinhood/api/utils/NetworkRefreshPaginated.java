package com.robinhood.api.utils;

import com.robinhood.models.PaginatedResult;
import io.reactivex.Maybe;
import io.reactivex.Scheduler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: NetworkRefreshPaginated.kt */
@kotlin.Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001B#\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001bJ!\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"R(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010$R*\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010)¨\u0006*"}, m3636d2 = {"Lcom/robinhood/api/utils/NetworkRefreshPaginated;", "", "T", "Lkotlin/Function2;", "", "j$/time/Instant", "", "staleDecider", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Lcom/robinhood/api/utils/PaginationFactory;", "paginationFactory", "(Lcom/robinhood/api/utils/PaginationFactory;)Lcom/robinhood/api/utils/NetworkRefreshPaginated;", "Lcom/robinhood/api/utils/SaveAction;", "Lcom/robinhood/models/PaginatedResult;", "saveAction", "(Lcom/robinhood/api/utils/SaveAction;)Lcom/robinhood/api/utils/NetworkRefreshPaginated;", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)Lcom/robinhood/api/utils/NetworkRefreshPaginated;", "Lio/reactivex/Scheduler;", "subscribeOnScheduler", "(Lio/reactivex/Scheduler;)Lcom/robinhood/api/utils/NetworkRefreshPaginated;", "paginationScheduler", "key", "(Ljava/lang/String;)Lcom/robinhood/api/utils/NetworkRefreshPaginated;", "force", "(Z)Lcom/robinhood/api/utils/NetworkRefreshPaginated;", "allow", "allowErrors", "Lcom/robinhood/api/utils/NetworkWrapper;", "networkWrapper", "Lio/reactivex/Maybe;", "toMaybe", "(Lcom/robinhood/api/utils/NetworkWrapper;)Lio/reactivex/Maybe;", "Lkotlin/jvm/functions/Function2;", "Lcom/robinhood/api/utils/PaginationFactory;", "Lkotlin/jvm/functions/Function1;", "Lio/reactivex/Scheduler;", "Ljava/lang/String;", "Ljava/lang/Boolean;", "Z", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class NetworkRefreshPaginated<T> {
    private boolean allowErrors;
    private Boolean force;
    private String key;
    private PaginationFactory<T> paginationFactory;
    private Scheduler paginationScheduler;
    private Function1<? super PaginatedResult<? extends T>, Unit> saveAction;
    private final Function2<String, Instant, Boolean> staleDecider;
    private Scheduler subscribeOnScheduler;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkRefreshPaginated(Function2<? super String, ? super Instant, Boolean> staleDecider) {
        Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
        this.staleDecider = staleDecider;
    }

    public final NetworkRefreshPaginated<T> paginationFactory(PaginationFactory<T> paginationFactory) {
        Intrinsics.checkNotNullParameter(paginationFactory, "paginationFactory");
        this.paginationFactory = paginationFactory;
        return this;
    }

    public final NetworkRefreshPaginated<T> saveAction(SaveAction<PaginatedResult<T>> saveAction) {
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        this.saveAction = new NetworkRefreshPaginated2(saveAction);
        return this;
    }

    public final NetworkRefreshPaginated<T> saveAction(Function1<? super PaginatedResult<? extends T>, Unit> saveAction) {
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        this.saveAction = saveAction;
        return this;
    }

    public final NetworkRefreshPaginated<T> subscribeOnScheduler(Scheduler subscribeOnScheduler) {
        Intrinsics.checkNotNullParameter(subscribeOnScheduler, "subscribeOnScheduler");
        this.subscribeOnScheduler = subscribeOnScheduler;
        return this;
    }

    public final NetworkRefreshPaginated<T> paginationScheduler(Scheduler paginationScheduler) {
        Intrinsics.checkNotNullParameter(paginationScheduler, "paginationScheduler");
        this.paginationScheduler = paginationScheduler;
        return this;
    }

    public final NetworkRefreshPaginated<T> key(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        return this;
    }

    public final NetworkRefreshPaginated<T> force(boolean force) {
        this.force = Boolean.valueOf(force);
        return this;
    }

    public final NetworkRefreshPaginated<T> allowErrors(boolean allow) {
        this.allowErrors = allow;
        return this;
    }

    public final Maybe<PaginatedResult<T>> toMaybe(NetworkWrapper networkWrapper) {
        Intrinsics.checkNotNullParameter(networkWrapper, "networkWrapper");
        PaginationFactory<T> paginationFactory = this.paginationFactory;
        Intrinsics.checkNotNull(paginationFactory);
        Function1<? super PaginatedResult<? extends T>, Unit> function1 = this.saveAction;
        Intrinsics.checkNotNull(function1);
        Function2<String, Instant, Boolean> function2 = this.staleDecider;
        Scheduler scheduler = this.subscribeOnScheduler;
        Intrinsics.checkNotNull(scheduler);
        Scheduler scheduler2 = this.paginationScheduler;
        Intrinsics.checkNotNull(scheduler2);
        String str = this.key;
        Intrinsics.checkNotNull(str);
        Boolean bool = this.force;
        Intrinsics.checkNotNull(bool);
        return networkWrapper.refreshPaginated(paginationFactory, function1, function2, scheduler, scheduler2, str, bool.booleanValue(), this.allowErrors);
    }
}

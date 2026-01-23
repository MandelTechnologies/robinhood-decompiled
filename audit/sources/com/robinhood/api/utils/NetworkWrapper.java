package com.robinhood.api.utils;

import com.robinhood.models.PaginatedResult;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;

/* compiled from: NetworkWrapper.kt */
@kotlin.Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J}\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\b*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000b2\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u008d\u0001\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\t\"\u0004\b\u0000\u0010\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u00020\f0\u000b2\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#JC\u0010$\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006("}, m3636d2 = {"Lcom/robinhood/api/utils/NetworkWrapper;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/api/utils/MetadataMap;", "metadataMap", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/api/utils/MetadataMap;)V", "T", "Lio/reactivex/Maybe;", "networkMaybe", "Lkotlin/Function1;", "", "saveAction", "Lkotlin/Function2;", "", "j$/time/Instant", "", "staleDecider", "Lio/reactivex/Scheduler;", "subscribeOnScheduler", "key", "force", "allowErrors", "refresh", "(Lio/reactivex/Maybe;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lio/reactivex/Scheduler;Ljava/lang/String;ZZ)Lio/reactivex/Maybe;", "Lcom/robinhood/api/utils/PaginationFactory;", "paginationFactory", "Lcom/robinhood/models/PaginatedResult;", "paginationScheduler", "refreshPaginated", "(Lcom/robinhood/api/utils/PaginationFactory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Ljava/lang/String;ZZ)Lio/reactivex/Maybe;", "Lio/reactivex/Observable;", "Lcom/robinhood/api/utils/Metadata;", "getMetadata", "(Ljava/lang/String;)Lio/reactivex/Observable;", "shouldRefresh", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lcom/robinhood/api/utils/MetadataMap;)Z", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/robinhood/api/utils/MetadataMap;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public class NetworkWrapper {
    private final CoroutineScope coroutineScope;
    private final MetadataMap metadataMap;

    public NetworkWrapper(@RootCoroutineScope CoroutineScope coroutineScope, MetadataMap metadataMap) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(metadataMap, "metadataMap");
        this.coroutineScope = coroutineScope;
        this.metadataMap = metadataMap;
    }

    public <T> Maybe<T> refresh(Maybe<T> networkMaybe, Function1<? super T, Unit> saveAction, Function2<? super String, ? super Instant, Boolean> staleDecider, Scheduler subscribeOnScheduler, String key, boolean force, boolean allowErrors) {
        Intrinsics.checkNotNullParameter(networkMaybe, "networkMaybe");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
        Intrinsics.checkNotNullParameter(subscribeOnScheduler, "subscribeOnScheduler");
        Intrinsics.checkNotNullParameter(key, "key");
        if (shouldRefresh(key, force, staleDecider, this.metadataMap)) {
            Maybe<T> maybe = (Maybe<T>) networkMaybe.subscribeOn(subscribeOnScheduler).compose(new NetworkTransformer(this.metadataMap.getMetadata(key), this.metadataMap.getMetadataSubject(key), saveAction, allowErrors));
            Intrinsics.checkNotNull(maybe);
            return maybe;
        }
        Maybe<T> maybeEmpty = Maybe.empty();
        Intrinsics.checkNotNull(maybeEmpty);
        return maybeEmpty;
    }

    public static /* synthetic */ Maybe refreshPaginated$default(NetworkWrapper networkWrapper, PaginationFactory paginationFactory, Function1 function1, Function2 function2, Scheduler scheduler, Scheduler scheduler2, String str, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            return networkWrapper.refreshPaginated(paginationFactory, function1, function2, scheduler, scheduler2, str, z, (i & 128) != 0 ? false : z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshPaginated");
    }

    public final <T> Maybe<PaginatedResult<T>> refreshPaginated(PaginationFactory<T> paginationFactory, Function1<? super PaginatedResult<? extends T>, Unit> saveAction, Function2<? super String, ? super Instant, Boolean> staleDecider, Scheduler subscribeOnScheduler, Scheduler paginationScheduler, String key, boolean force, boolean allowErrors) {
        Intrinsics.checkNotNullParameter(paginationFactory, "paginationFactory");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
        Intrinsics.checkNotNullParameter(subscribeOnScheduler, "subscribeOnScheduler");
        Intrinsics.checkNotNullParameter(paginationScheduler, "paginationScheduler");
        Intrinsics.checkNotNullParameter(key, "key");
        if (shouldRefresh(key, force, staleDecider, this.metadataMap)) {
            Maybe<T> maybe = paginationFactory.generate(null).compose(new PaginationTransformer(this.coroutineScope, this, paginationFactory, saveAction, allowErrors, key, subscribeOnScheduler, paginationScheduler, null, 256, null)).toMaybe();
            Intrinsics.checkNotNull(maybe);
            return refresh(maybe, saveAction, staleDecider, subscribeOnScheduler, key, true, allowErrors);
        }
        Maybe<PaginatedResult<T>> maybeEmpty = Maybe.empty();
        Intrinsics.checkNotNullExpressionValue(maybeEmpty, "empty(...)");
        return maybeEmpty;
    }

    public final Observable<Metadata> getMetadata(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.metadataMap.getMetadataSubject(key);
    }

    public final boolean shouldRefresh(String key, boolean force, Function2<? super String, ? super Instant, Boolean> staleDecider, MetadataMap metadataMap) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
        Intrinsics.checkNotNullParameter(metadataMap, "metadataMap");
        Metadata metadata = metadataMap.getMetadata(key);
        if (force) {
            return true;
        }
        return staleDecider.invoke(key, metadata.getLastUpdatedAt()).booleanValue() && !metadata.getIsInFlight();
    }
}

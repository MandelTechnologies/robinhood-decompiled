package com.robinhood.android.lib.store.margin;

import androidx.room.RoomDatabase;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.subscription.api.ApiMarginSubscription;
import com.robinhood.models.subscription.dao.MarginSubscriptionDao;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: MarginSubscriptionStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0007J\u0010\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u0011J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0011J&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u001e2\u0006\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "Lcom/robinhood/store/Store;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/subscription/dao/MarginSubscriptionDao;", "<init>", "(Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/subscription/dao/MarginSubscriptionDao;)V", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/subscription/api/ApiMarginSubscription;", "", "hasRefreshedRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "kotlin.jvm.PlatformType", "streamCurrentMarginSubscription", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/subscription/db/MarginSubscription;", "getCurrentMarginSubscriptionOptional", "refreshCurrentMarginSubscription", "force", "checkCurrentMarginSubscription", "Lio/reactivex/Single;", "allowErrors", "refresh", "Lio/reactivex/Maybe;", "lib-store-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class MarginSubscriptionStore extends Store {
    private final Brokeback brokeback;
    private final MarginSubscriptionDao dao;
    private final BehaviorRelay<Boolean> hasRefreshedRelay;
    private final Function1<PaginatedResult<ApiMarginSubscription>, Unit> saveAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginSubscriptionStore(Brokeback brokeback, StoreBundle storeBundle, final MarginSubscriptionDao dao) {
        super(storeBundle, MarginSubscription.INSTANCE);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.brokeback = brokeback;
        this.dao = dao;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<PaginatedResult<? extends ApiMarginSubscription>, Unit>() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaginatedResult<? extends ApiMarginSubscription> paginatedResult) {
                m15907invoke(paginatedResult);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m15907invoke(PaginatedResult<? extends ApiMarginSubscription> paginatedResult) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert((PaginatedResult<ApiMarginSubscription>) paginatedResult);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
        BehaviorRelay<Boolean> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.hasRefreshedRelay = behaviorRelayCreateDefault;
    }

    public final Observable<Optional<MarginSubscription>> streamCurrentMarginSubscription() {
        Observable<Optional<MarginSubscription>> observableDefer = Observable.defer(new Callable() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionStore.streamCurrentMarginSubscription.1
            @Override // java.util.concurrent.Callable
            public final ObservableSource<? extends Optional<MarginSubscription>> call() {
                MarginSubscriptionStore.refreshCurrentMarginSubscription$default(MarginSubscriptionStore.this, false, 1, null);
                return ObservablesKt.connectWhen$default(MarginSubscriptionStore.this.getCurrentMarginSubscriptionOptional(), MarginSubscriptionStore.this.hasRefreshedRelay, null, 2, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDefer, "defer(...)");
        return observableDefer;
    }

    @Deprecated
    public final Observable<Optional<MarginSubscription>> getCurrentMarginSubscriptionOptional() {
        return asObservable(Operators.toOptionals(Operators.mapFirstItemOrNull(this.dao.getMarginSubscriptions())));
    }

    public static /* synthetic */ void refreshCurrentMarginSubscription$default(MarginSubscriptionStore marginSubscriptionStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        marginSubscriptionStore.refreshCurrentMarginSubscription(z);
    }

    public final void refreshCurrentMarginSubscription(boolean force) {
        ScopedSubscriptionKt.subscribeIn(refresh$default(this, force, false, 2, null), getStoreScope(), new Function1() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginSubscriptionStore.refreshCurrentMarginSubscription$lambda$0(this.f$0, (PaginatedResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshCurrentMarginSubscription$lambda$0(MarginSubscriptionStore marginSubscriptionStore, PaginatedResult paginatedResult) {
        Intrinsics.checkNotNullParameter(paginatedResult, "<unused var>");
        marginSubscriptionStore.hasRefreshedRelay.accept(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Single checkCurrentMarginSubscription$default(MarginSubscriptionStore marginSubscriptionStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return marginSubscriptionStore.checkCurrentMarginSubscription(z);
    }

    public final Single<Optional<MarginSubscription>> checkCurrentMarginSubscription(boolean allowErrors) {
        Single<Optional<MarginSubscription>> single = refresh(true, allowErrors).map(new Function() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionStore.checkCurrentMarginSubscription.1
            @Override // io.reactivex.functions.Function
            public final Optional<MarginSubscription> apply(PaginatedResult<ApiMarginSubscription> subscription) {
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                ApiMarginSubscription apiMarginSubscription = (ApiMarginSubscription) CollectionsKt.firstOrNull((List) subscription.getResults());
                return Optional3.asOptional(apiMarginSubscription != null ? apiMarginSubscription.toDbMarginSubscription() : null);
            }
        }).toSingle(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(single, "toSingle(...)");
        return single;
    }

    static /* synthetic */ Maybe refresh$default(MarginSubscriptionStore marginSubscriptionStore, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return marginSubscriptionStore.refresh(z, z2);
    }

    private final Maybe<PaginatedResult<ApiMarginSubscription>> refresh(boolean force, boolean allowErrors) {
        return refreshPaginated(new Function1() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginSubscriptionStore.refresh$lambda$1(this.f$0, (String) obj);
            }
        }).allowErrors(allowErrors).saveAction(this.saveAction).force(force).toMaybe(getNetworkWrapper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single refresh$lambda$1(MarginSubscriptionStore marginSubscriptionStore, String str) {
        return RxFactory.DefaultImpls.rxSingle$default(marginSubscriptionStore, null, new MarginSubscriptionStore2(marginSubscriptionStore, str, null), 1, null);
    }
}

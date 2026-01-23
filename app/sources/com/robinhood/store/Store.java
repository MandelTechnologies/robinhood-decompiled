package com.robinhood.store;

import androidx.room.RoomDatabase;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.Reactor;
import com.robinhood.api.utils.NetworkRefresh;
import com.robinhood.api.utils.NetworkRefreshPaginated;
import com.robinhood.api.utils.NetworkWrapper;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.p320db.StaleConfig;
import com.robinhood.util.LastUpdatedAtManager;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Inference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: Store.kt */
@Metadata(m3635d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0007\b\u0016\u0018\u0000 f2\u00020\u0001:\u0001fB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0005¢\u0006\u0004\b\u000e\u0010\u0012JE\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\t2\"\u0010\u0016\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0012\u0012\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u000b0\u0013H\u0005¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\u0013\"\u0006\b\u0000\u0010\n\u0018\u00012\u0014\b\u0004\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\u0013H\u0085\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0087\u0001\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020)\".\b\u0000\u0010 *\u0016\u0012\u0004\u0012\u00028\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u001e0\u0013*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u001e0\u001f\"\b\b\u0001\u0010!*\u00020\t\"\b\b\u0002\u0010\n*\u00020\t*\u00020\"2\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010$0#2\u0006\u0010&\u001a\u00028\u00002\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+Js\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)\"\b\b\u0000\u0010!*\u00020\t\"\b\b\u0001\u0010\n*\u00020\t*\u00020\"2\u0006\u0010,\u001a\u00020\u00142\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0#2\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u001e0\u00132\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010-Jy\u0010/\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010.0)\"\b\b\u0000\u0010!*\u00020\t\"\b\b\u0001\u0010\n*\u00020\t*\u00020\"2\u0006\u0010,\u001a\u00020\u00142\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0#2\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u001e0\u00132\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b/\u0010-J'\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\b\b\u0000\u0010\n*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b0\u00101J-\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001e\"\b\b\u0000\u0010\n*\u00020\t*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001eH\u0007¢\u0006\u0004\b2\u00101JQ\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u00104\u001a\u0002032'\u00109\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000007\u0012\u0006\u0012\u0004\u0018\u00010\t05¢\u0006\u0002\b8H\u0096\u0001¢\u0006\u0004\b:\u0010;JA\u0010=\u001a\u00020<2\u0006\u00104\u001a\u0002032'\u00109\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a07\u0012\u0006\u0012\u0004\u0018\u00010\t05¢\u0006\u0002\b8H\u0096\u0001¢\u0006\u0004\b=\u0010>JU\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\t2\u0006\u00104\u001a\u0002032)\u00109\u001a%\b\u0001\u0012\u0004\u0012\u000206\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u000007\u0012\u0006\u0012\u0004\u0018\u00010\t05¢\u0006\u0002\b8H\u0096\u0001¢\u0006\u0004\b?\u0010@JY\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u00104\u001a\u0002032/\b\u0001\u00109\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a07\u0012\u0006\u0012\u0004\u0018\u00010\t05¢\u0006\u0002\b8H\u0096\u0001¢\u0006\u0004\bC\u0010DJ.\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096\u0001¢\u0006\u0004\bF\u0010GJ*\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\b\b\u0000\u0010\n*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096\u0001¢\u0006\u0004\bH\u0010GR\u001a\u0010J\u001a\u00020I8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010O\u001a\u00020N8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020S8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010Y\u001a\u00020X8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010]\u001a\u0002068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R.\u0010b\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010a\u0012\u0004\u0012\u00020'058\u0014X\u0094\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006g"}, m3636d2 = {"Lcom/robinhood/store/Store;", "Lcom/robinhood/coroutines/rx/RxFactory;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/db/StaleConfig;", "staleableSpecification", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/db/StaleConfig;)V", "(Lcom/robinhood/store/StoreBundle;)V", "", "T", "Lio/reactivex/Single;", "networkSingle", "Lcom/robinhood/api/utils/NetworkRefresh;", "refresh", "(Lio/reactivex/Single;)Lcom/robinhood/api/utils/NetworkRefresh;", "Lio/reactivex/Maybe;", "networkMaybe", "(Lio/reactivex/Maybe;)Lcom/robinhood/api/utils/NetworkRefresh;", "Lkotlin/Function1;", "", "Lcom/robinhood/models/PaginatedResult;", "factory", "Lcom/robinhood/api/utils/NetworkRefreshPaginated;", "refreshPaginated", "(Lkotlin/jvm/functions/Function1;)Lcom/robinhood/api/utils/NetworkRefreshPaginated;", "", AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "safeSave", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/reflect/KCallable;", "F", "P", "Lcom/robinhood/android/moria/db/Query$Companion;", "", "Lcom/robinhood/android/moria/db/reactor/Reactor;", "reactors", "function", "", "enableDebugLogging", "Lcom/robinhood/android/moria/db/Query;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lcom/robinhood/android/moria/db/Query$Companion;Ljava/util/List;Lkotlin/jvm/functions/Function1;Z)Lcom/robinhood/android/moria/db/Query;", "name", "(Lcom/robinhood/android/moria/db/Query$Companion;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Z)Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/utils/Optional;", "createOptional", "takeWhileLoggedIn", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "takeWhileLoggedInNullable", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "rxSingle", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Single;", "Lio/reactivex/Completable;", "rxCompletable", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Completable;", "rxMaybe", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Maybe;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/reactivex/Observable;", "rxObservable", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Observable;", "flow", "convertToObservable", "(Lkotlinx/coroutines/flow/Flow;)Lio/reactivex/Observable;", "asObservable", "Landroidx/room/RoomDatabase;", "roomDatabase", "Landroidx/room/RoomDatabase;", "getRoomDatabase", "()Landroidx/room/RoomDatabase;", "Lcom/robinhood/api/utils/NetworkWrapper;", "networkWrapper", "Lcom/robinhood/api/utils/NetworkWrapper;", "getNetworkWrapper", "()Lcom/robinhood/api/utils/NetworkWrapper;", "Lcom/robinhood/utils/LogoutKillswitch;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "getLogoutKillswitch", "()Lcom/robinhood/utils/LogoutKillswitch;", "Lcom/robinhood/util/LastUpdatedAtManager;", "lastUpdatedAtManager", "Lcom/robinhood/util/LastUpdatedAtManager;", "getLastUpdatedAtManager", "()Lcom/robinhood/util/LastUpdatedAtManager;", "storeScope", "Lkotlinx/coroutines/CoroutineScope;", "getStoreScope", "()Lkotlinx/coroutines/CoroutineScope;", "j$/time/Instant", "staleDecider", "Lkotlin/jvm/functions/Function2;", "getStaleDecider", "()Lkotlin/jvm/functions/Function2;", "Companion", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public class Store implements RxFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String KEY_DEFAULT = "defaultStoreKey";
    public static final String KEY_DEFAULT_PAGINATED = "defaultPaginatedStoreKey";
    private final /* synthetic */ RxFactory $$delegate_0;
    private final LastUpdatedAtManager lastUpdatedAtManager;
    private final LogoutKillswitch logoutKillswitch;
    private final NetworkWrapper networkWrapper;
    private final RoomDatabase roomDatabase;
    private final Function2<String, Instant, Boolean> staleDecider;
    private final CoroutineScope storeScope;

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> asObservable(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return this.$$delegate_0.asObservable(flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> convertToObservable(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        return this.$$delegate_0.convertToObservable(flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public Completable rxCompletable(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.$$delegate_0.rxCompletable(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Maybe<T> rxMaybe(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.$$delegate_0.rxMaybe(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> rxObservable(CoroutineContext context, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.$$delegate_0.rxObservable(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Single<T> rxSingle(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.$$delegate_0.rxSingle(context, block);
    }

    @Deprecated
    public Store(StoreBundle storeBundle, final StaleConfig staleableSpecification) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(staleableSpecification, "staleableSpecification");
        this.$$delegate_0 = storeBundle.getRxFactory();
        this.roomDatabase = storeBundle.getRoomDatabase();
        this.networkWrapper = storeBundle.getNetworkWrapper();
        LogoutKillswitch logoutKillswitch = storeBundle.getLogoutKillswitch();
        this.logoutKillswitch = logoutKillswitch;
        this.lastUpdatedAtManager = storeBundle.getLastUpdatedAtManager();
        this.storeScope = logoutKillswitch.getLoggedInScope();
        this.staleDecider = new Function2() { // from class: com.robinhood.store.Store$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(Store.staleDecider$lambda$0(staleableSpecification, (String) obj, (Instant) obj2));
            }
        };
    }

    protected final RoomDatabase getRoomDatabase() {
        return this.roomDatabase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final NetworkWrapper getNetworkWrapper() {
        return this.networkWrapper;
    }

    protected final LogoutKillswitch getLogoutKillswitch() {
        return this.logoutKillswitch;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final LastUpdatedAtManager getLastUpdatedAtManager() {
        return this.lastUpdatedAtManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final CoroutineScope getStoreScope() {
        return this.storeScope;
    }

    protected Function2<String, Instant, Boolean> getStaleDecider() {
        return this.staleDecider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean staleDecider$lambda$0(StaleConfig staleConfig, String str, Instant instant) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return instant == null || Durations.since(instant).compareTo(staleConfig.getNormalStaleTimeout()) >= 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Store(StoreBundle storeBundle) {
        this(storeBundle, StaleConfig.INSTANCE.getZERO());
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public final <T> NetworkRefresh<T> refresh(Single<T> networkSingle) {
        Intrinsics.checkNotNullParameter(networkSingle, "networkSingle");
        Maybe<T> maybe = networkSingle.toMaybe();
        Intrinsics.checkNotNullExpressionValue(maybe, "toMaybe(...)");
        return refresh(maybe);
    }

    @Deprecated
    protected final <T> NetworkRefresh<T> refresh(Maybe<T> networkMaybe) {
        Intrinsics.checkNotNullParameter(networkMaybe, "networkMaybe");
        NetworkRefresh<T> networkRefreshNetworkMaybe = new NetworkRefresh(getStaleDecider()).networkMaybe(networkMaybe);
        Scheduler schedulerM3346io = Schedulers.m3346io();
        Intrinsics.checkNotNullExpressionValue(schedulerM3346io, "io(...)");
        return networkRefreshNetworkMaybe.subscribeOnScheduler(schedulerM3346io).key(KEY_DEFAULT);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public final <T> NetworkRefreshPaginated<T> refreshPaginated(Function1<? super String, ? extends Single<? extends PaginatedResult<? extends T>>> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        NetworkRefreshPaginated<T> networkRefreshPaginatedPaginationFactory = new NetworkRefreshPaginated(getStaleDecider()).paginationFactory(new Store$sam$com_robinhood_api_utils_PaginationFactory$0(factory));
        Scheduler schedulerM3346io = Schedulers.m3346io();
        Intrinsics.checkNotNullExpressionValue(schedulerM3346io, "io(...)");
        NetworkRefreshPaginated<T> networkRefreshPaginatedSubscribeOnScheduler = networkRefreshPaginatedPaginationFactory.subscribeOnScheduler(schedulerM3346io);
        Scheduler schedulerM3346io2 = Schedulers.m3346io();
        Intrinsics.checkNotNullExpressionValue(schedulerM3346io2, "io(...)");
        return networkRefreshPaginatedSubscribeOnScheduler.paginationScheduler(schedulerM3346io2).key(KEY_DEFAULT_PAGINATED);
    }

    @Deprecated
    protected final /* synthetic */ <T> Function1<T, Unit> safeSave(final Function1<? super T, Unit> save) {
        Intrinsics.checkNotNullParameter(save, "save");
        final LogoutKillswitch logoutKillswitch = this.logoutKillswitch;
        final RoomDatabase roomDatabase = this.roomDatabase;
        Intrinsics.needClassReification();
        return new Function1<T, Unit>() { // from class: com.robinhood.store.Store$safeSave$$inlined$safeSave$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((Store$safeSave$$inlined$safeSave$1<T>) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t) {
                if (logoutKillswitch.isLoggedOut()) {
                    Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
                    return;
                }
                try {
                    save.invoke(t);
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
        };
    }

    public static /* synthetic */ Query create$default(Store store, Query.Companion companion, List list, Function1 function1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return store.create(companion, list, function1, z);
    }

    /* JADX WARN: Incorrect types in method signature: <F::Lkotlin/jvm/functions/Function1<-TP;+Lkotlinx/coroutines/flow/Flow<+TT;>;>;:Lkotlin/reflect/KCallable<+Lkotlinx/coroutines/flow/Flow<+TT;>;>;P:Ljava/lang/Object;T:Ljava/lang/Object;>(Lcom/robinhood/android/moria/db/Query$Companion;Ljava/util/List<+Lcom/robinhood/android/moria/db/reactor/Reactor<-TP;>;>;TF;Z)Lcom/robinhood/android/moria/db/Query<TP;TT;>; */
    public final Query create(Query.Companion companion, List reactors, Function1 function, boolean z) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(reactors, "reactors");
        Intrinsics.checkNotNullParameter(function, "function");
        return companion.create(this, reactors, function, z);
    }

    public static /* synthetic */ Query create$default(Store store, Query.Companion companion, String str, List list, Function1 function1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return store.create(companion, str, list, function1, z);
    }

    public final <P, T> Query<P, T> create(Query.Companion companion, String name, List<? extends Reactor<? super P>> reactors, Function1<? super P, ? extends Flow<? extends T>> function, boolean z) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactors, "reactors");
        Intrinsics.checkNotNullParameter(function, "function");
        return companion.create(this, name, reactors, function, z);
    }

    public static /* synthetic */ Query createOptional$default(Store store, Query.Companion companion, String str, List list, Function1 function1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createOptional");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return store.createOptional(companion, str, list, function1, z);
    }

    public final <P, T> Query<P, Optional<T>> createOptional(Query.Companion companion, String name, List<? extends Reactor<? super P>> reactors, Function1<? super P, ? extends Flow<? extends T>> function, boolean z) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactors, "reactors");
        Intrinsics.checkNotNullParameter(function, "function");
        return companion.createOptional(this, name, reactors, function, z);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Store.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n"}, m3636d2 = {"<anonymous>", "", "T", "", "<unused var>"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.Store$takeWhileLoggedIn$1", m3645f = "Store.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.Store$takeWhileLoggedIn$1 */
    static final class C412801<T> extends ContinuationImpl7 implements Function2<T, Continuation<? super Boolean>, Object> {
        int label;

        C412801(Continuation<? super C412801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Store.this.new C412801(continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return invoke2((C412801<T>) obj, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t, Continuation<? super Boolean> continuation) {
            return ((C412801) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(!Store.this.getLogoutKillswitch().isLoggedOut());
        }
    }

    public final <T> Flow<T> takeWhileLoggedIn(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return FlowKt.takeWhile(flow, new C412801(null));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Store.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\n"}, m3636d2 = {"<anonymous>", "", "T", "", "<unused var>"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.Store$takeWhileLoggedIn$2", m3645f = "Store.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.Store$takeWhileLoggedIn$2 */
    /* loaded from: classes12.dex */
    static final class C412812<T> extends ContinuationImpl7 implements Function2<T, Continuation<? super Boolean>, Object> {
        int label;

        C412812(Continuation<? super C412812> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Store.this.new C412812(continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return invoke2((C412812<T>) obj, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t, Continuation<? super Boolean> continuation) {
            return ((C412812) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(!Store.this.getLogoutKillswitch().isLoggedOut());
        }
    }

    @JvmName
    public final <T> Flow<T> takeWhileLoggedInNullable(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return FlowKt.takeWhile(flow, new C412812(null));
    }

    /* compiled from: Store.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\n0\b\"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\n0\bH\u0086\bø\u0001\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/store/Store$Companion;", "", "<init>", "()V", "KEY_DEFAULT", "", "KEY_DEFAULT_PAGINATED", "safeSave", "Lkotlin/Function1;", "T", "", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "roomDatabase", "Landroidx/room/RoomDatabase;", AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ <T> Function1<T, Unit> safeSave(final LogoutKillswitch logoutKillswitch, final RoomDatabase roomDatabase, final Function1<? super T, Unit> save) {
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(roomDatabase, "roomDatabase");
            Intrinsics.checkNotNullParameter(save, "save");
            Intrinsics.needClassReification();
            return new Function1<T, Unit>() { // from class: com.robinhood.store.Store$Companion$safeSave$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2((Store$Companion$safeSave$1<T>) obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t) {
                    if (logoutKillswitch.isLoggedOut()) {
                        Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
                        return;
                    }
                    try {
                        save.invoke(t);
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
            };
        }
    }
}

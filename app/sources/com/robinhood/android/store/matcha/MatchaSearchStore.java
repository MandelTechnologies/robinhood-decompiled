package com.robinhood.android.store.matcha;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.models.matcha.api.ApiContactMethod;
import com.robinhood.android.models.matcha.api.ApiSearchUsersResponse;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.p320db.matcha.MatchaSearchUser;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchaSearchStore.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\u0016J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u0014*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaSearchStore;", "Lcom/robinhood/store/Store;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/store/StoreBundle;)V", "searchEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/models/matcha/api/ApiSearchUsersResponse;", "search", "Lio/reactivex/Single;", "Lcom/robinhood/android/store/matcha/MatchaSearchStore$SearchResponse;", "query", "emptyStateConnections", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "Lcom/robinhood/models/db/matcha/MatchaSearchUser;", "kotlin.jvm.PlatformType", "searchEmptyStateEndpoint", "", "refreshEmptyState", "streamEmptyState", "Lio/reactivex/Observable;", "SearchResponse", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MatchaSearchStore extends Store {
    private final BehaviorRelay<List<MatchaSearchUser>> emptyStateConnections;
    private final MatchaApi matchaApi;
    private final Endpoint<Unit, ApiSearchUsersResponse> searchEmptyStateEndpoint;
    private final Endpoint<String, ApiSearchUsersResponse> searchEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaSearchStore(MatchaApi matchaApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.matchaApi = matchaApi;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.searchEndpoint = Endpoint.Companion.create$default(companion, new MatchaSearchStore4(this, null), getLogoutKillswitch(), new MatchaSearchStore5(null), storeBundle.getClock(), null, 16, null);
        BehaviorRelay<List<MatchaSearchUser>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(CollectionsKt.emptyList());
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.emptyStateConnections = behaviorRelayCreateDefault;
        this.searchEmptyStateEndpoint = companion.create(new MatchaSearchStore2(this, null), getLogoutKillswitch(), new MatchaSearchStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getONE_MINUTE(), storeBundle.getClock()));
    }

    /* compiled from: MatchaSearchStore.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaSearchStore$SearchResponse;", "", "connections", "", "Lcom/robinhood/models/db/matcha/MatchaSearchUser;", "users", "contactMethods", "Lcom/robinhood/android/models/matcha/api/ApiContactMethod;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getConnections", "()Ljava/util/List;", "getUsers", "getContactMethods", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SearchResponse {
        private final List<MatchaSearchUser> connections;
        private final List<ApiContactMethod> contactMethods;
        private final List<MatchaSearchUser> users;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchResponse copy$default(SearchResponse searchResponse, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = searchResponse.connections;
            }
            if ((i & 2) != 0) {
                list2 = searchResponse.users;
            }
            if ((i & 4) != 0) {
                list3 = searchResponse.contactMethods;
            }
            return searchResponse.copy(list, list2, list3);
        }

        public final List<MatchaSearchUser> component1() {
            return this.connections;
        }

        public final List<MatchaSearchUser> component2() {
            return this.users;
        }

        public final List<ApiContactMethod> component3() {
            return this.contactMethods;
        }

        public final SearchResponse copy(List<MatchaSearchUser> connections, List<MatchaSearchUser> users, List<ApiContactMethod> contactMethods) {
            Intrinsics.checkNotNullParameter(connections, "connections");
            Intrinsics.checkNotNullParameter(users, "users");
            Intrinsics.checkNotNullParameter(contactMethods, "contactMethods");
            return new SearchResponse(connections, users, contactMethods);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchResponse)) {
                return false;
            }
            SearchResponse searchResponse = (SearchResponse) other;
            return Intrinsics.areEqual(this.connections, searchResponse.connections) && Intrinsics.areEqual(this.users, searchResponse.users) && Intrinsics.areEqual(this.contactMethods, searchResponse.contactMethods);
        }

        public int hashCode() {
            return (((this.connections.hashCode() * 31) + this.users.hashCode()) * 31) + this.contactMethods.hashCode();
        }

        public String toString() {
            return "SearchResponse(connections=" + this.connections + ", users=" + this.users + ", contactMethods=" + this.contactMethods + ")";
        }

        public SearchResponse(List<MatchaSearchUser> connections, List<MatchaSearchUser> users, List<ApiContactMethod> contactMethods) {
            Intrinsics.checkNotNullParameter(connections, "connections");
            Intrinsics.checkNotNullParameter(users, "users");
            Intrinsics.checkNotNullParameter(contactMethods, "contactMethods");
            this.connections = connections;
            this.users = users;
            this.contactMethods = contactMethods;
        }

        public final List<MatchaSearchUser> getConnections() {
            return this.connections;
        }

        public final List<MatchaSearchUser> getUsers() {
            return this.users;
        }

        public final List<ApiContactMethod> getContactMethods() {
            return this.contactMethods;
        }
    }

    /* compiled from: MatchaSearchStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/store/matcha/MatchaSearchStore$SearchResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaSearchStore$search$1", m3645f = "MatchaSearchStore.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.store.matcha.MatchaSearchStore$search$1 */
    static final class C287531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super SearchResponse>, Object> {
        final /* synthetic */ String $query;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C287531(String str, Continuation<? super C287531> continuation) {
            super(2, continuation);
            this.$query = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaSearchStore.this.new C287531(this.$query, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SearchResponse> continuation) {
            return ((C287531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = MatchaSearchStore.this.searchEndpoint;
                String str = this.$query;
                this.label = 1;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return MatchaSearchStore6.toSearchResponse((ApiSearchUsersResponse) obj);
        }
    }

    public final Single<SearchResponse> search(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C287531(query, null), 1, null);
    }

    public final void refreshEmptyState() {
        Endpoint8.refresh$default(this.searchEmptyStateEndpoint, false, null, 3, null);
    }

    public final Observable<List<MatchaSearchUser>> streamEmptyState() {
        Observable<List<MatchaSearchUser>> observableHide = this.emptyStateConnections.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }
}

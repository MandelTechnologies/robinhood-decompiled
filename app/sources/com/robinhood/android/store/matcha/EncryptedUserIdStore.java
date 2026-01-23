package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiEncryptedUserId;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.models.p320db.matcha.EncryptedUserId;
import com.robinhood.models.p320db.matcha.dao.EncryptedUserIdDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: EncryptedUserIdStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/EncryptedUserIdStore;", "Lcom/robinhood/store/Store;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "dao", "Lcom/robinhood/models/db/matcha/dao/EncryptedUserIdDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/models/db/matcha/dao/EncryptedUserIdDao;Lcom/robinhood/store/StoreBundle;)V", "getEncryptedUserId", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/models/matcha/api/ApiEncryptedUserId;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/matcha/EncryptedUserId;", "stream", "Lio/reactivex/Observable;", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class EncryptedUserIdStore extends Store {
    private final EncryptedUserIdDao dao;
    private final Endpoint<Unit, ApiEncryptedUserId> getEncryptedUserId;
    private final MatchaApi matchaApi;
    private final Query<Unit, EncryptedUserId> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptedUserIdStore(MatchaApi matchaApi, EncryptedUserIdDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.matchaApi = matchaApi;
        this.dao = dao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Duration durationOfDays = Duration.ofDays(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfDays, "ofDays(...)");
        Endpoint<Unit, ApiEncryptedUserId> endpointCreate = companion.create(new EncryptedUserIdStore2(this, null), logoutKillswitch, new EncryptedUserIdStore3(this, null), clock, new DefaultStaleDecider(durationOfDays, storeBundle.getClock()));
        this.getEncryptedUserId = endpointCreate;
        this.query = Store.create$default(this, Query.INSTANCE, "streamEncryptedUserId", CollectionsKt.listOf(new RefreshEach(new EncryptedUserIdStore4(endpointCreate))), new Function1() { // from class: com.robinhood.android.store.matcha.EncryptedUserIdStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EncryptedUserIdStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(EncryptedUserIdStore encryptedUserIdStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return encryptedUserIdStore.dao.getEncryptedUserId();
    }

    public final Observable<EncryptedUserId> stream() {
        return this.query.asObservable(Unit.INSTANCE);
    }
}

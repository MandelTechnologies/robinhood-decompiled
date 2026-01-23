package com.robinhood.android.store.matcha;

import android.util.Base64;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.models.matcha.api.ApiMemoBanList;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* compiled from: MemoBanListStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000bJ\u0006\u0010\u0014\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MemoBanListStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/api/matcha/MatchaApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/store/StoreBundle;)V", "banListRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "", "getBanList", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/models/matcha/api/ApiMemoBanList;", "containsBannedWord", "Lio/reactivex/Single;", "", MemoInputActivity.EXTRA_MEMO, "refresh", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MemoBanListStore extends Store {
    private final MatchaApi api;
    private final BehaviorRelay<List<String>> banListRelay;
    private final Endpoint<Unit, ApiMemoBanList> getBanList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoBanListStore(MatchaApi api, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        BehaviorRelay<List<String>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.banListRelay = behaviorRelayCreate;
        this.getBanList = Endpoint.INSTANCE.create(new MemoBanListStore2(this, null), getLogoutKillswitch(), new MemoBanListStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.FIVE_MINUTES, storeBundle.getClock()));
    }

    public final Single<Boolean> containsBannedWord(final String memo) {
        Intrinsics.checkNotNullParameter(memo, "memo");
        Single map = this.banListRelay.firstOrError().timeout(1L, TimeUnit.SECONDS).onErrorReturn(new Function() { // from class: com.robinhood.android.store.matcha.MemoBanListStore.containsBannedWord.1
            @Override // io.reactivex.functions.Function
            public final List<String> apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CollectionsKt.emptyList();
            }
        }).map(new Function() { // from class: com.robinhood.android.store.matcha.MemoBanListStore.containsBannedWord.2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<String> banList) {
                Intrinsics.checkNotNullParameter(banList, "banList");
                List<String> list = banList;
                String str = memo;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        byte[] bArrDecode = Base64.decode((String) it.next(), 0);
                        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                        if (new Regex("^(.*[^a-zA-Z])?(?i)" + new String(bArrDecode, Charsets.UTF_8) + "([^a-zA-Z].*)?$").matches(str)) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void refresh() {
        Endpoint8.refresh$default(this.getBanList, false, null, 3, null);
    }
}

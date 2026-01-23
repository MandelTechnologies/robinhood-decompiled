package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaLaunchPromo;
import com.robinhood.android.models.matcha.api.ApiMatchaTreatment;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.models.p320db.matcha.MatchaLaunchPromo;
import com.robinhood.models.p320db.matcha.MatchaTreatment2;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: MatchaPromotionStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaPromotionStore;", "Lcom/robinhood/store/Store;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "acknowledgedPref", "Lcom/robinhood/prefs/BooleanPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/store/StoreBundle;)V", "matchaPromoState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/models/matcha/api/ApiMatchaLaunchPromo;", "getMatchaPromoEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "streamMatchaPromotion", "Lcom/robinhood/android/moria/db/Query;", "setPromoAcknowledged", "getPromo", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/matcha/MatchaLaunchPromo;", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MatchaPromotionStore extends Store {
    private final BooleanPreference acknowledgedPref;
    private final Endpoint<Unit, ApiMatchaLaunchPromo> getMatchaPromoEndpoint;
    private final MatchaApi matchaApi;
    private final StateFlow2<ApiMatchaLaunchPromo> matchaPromoState;
    private final Query<Unit, ApiMatchaLaunchPromo> streamMatchaPromotion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaPromotionStore(MatchaApi matchaApi, @MatchaPromotionAcknowledgedPref BooleanPreference acknowledgedPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(acknowledgedPref, "acknowledgedPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.matchaApi = matchaApi;
        this.acknowledgedPref = acknowledgedPref;
        this.matchaPromoState = StateFlow4.MutableStateFlow(null);
        this.getMatchaPromoEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new MatchaPromotionStore2(this, null), getLogoutKillswitch(), new MatchaPromotionStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.streamMatchaPromotion = Store.create$default(this, Query.INSTANCE, "streamMatchaPromotion", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.android.store.matcha.MatchaPromotionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaPromotionStore.streamMatchaPromotion$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.store.matcha.MatchaPromotionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaPromotionStore.streamMatchaPromotion$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamMatchaPromotion$lambda$0(MatchaPromotionStore matchaPromotionStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(matchaPromotionStore.getMatchaPromoEndpoint, Unit.INSTANCE, false, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamMatchaPromotion$lambda$1(MatchaPromotionStore matchaPromotionStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return matchaPromotionStore.matchaPromoState;
    }

    public final void setPromoAcknowledged() {
        this.acknowledgedPref.set(true);
    }

    public final Observable<Optional<MatchaLaunchPromo>> getPromo() {
        Observable<Optional<MatchaLaunchPromo>> map = Observables.INSTANCE.combineLatest(QueryKt.asObservable(this.streamMatchaPromotion), this.acknowledgedPref.getChanges()).map(new Function() { // from class: com.robinhood.android.store.matcha.MatchaPromotionStore.getPromo.1
            @Override // io.reactivex.functions.Function
            public final Optional<ApiMatchaLaunchPromo> apply(Tuples2<ApiMatchaLaunchPromo, Boolean> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                ApiMatchaLaunchPromo apiMatchaLaunchPromoComponent1 = tuples2.component1();
                if (!tuples2.component2().booleanValue()) {
                    return Optional3.asOptional(apiMatchaLaunchPromoComponent1);
                }
                return Optional2.INSTANCE;
            }
        }).map(new Function() { // from class: com.robinhood.android.store.matcha.MatchaPromotionStore.getPromo.2
            @Override // io.reactivex.functions.Function
            public final Optional<MatchaLaunchPromo> apply(Optional<ApiMatchaLaunchPromo> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                ApiMatchaLaunchPromo apiMatchaLaunchPromoComponent1 = optional.component1();
                ApiMatchaLaunchPromo.ViewModel card = apiMatchaLaunchPromoComponent1 != null ? apiMatchaLaunchPromoComponent1.getCard() : null;
                ApiMatchaTreatment treatment = apiMatchaLaunchPromoComponent1 != null ? apiMatchaLaunchPromoComponent1.getTreatment() : null;
                if (card != null && treatment != null) {
                    return Optional3.asOptional(new MatchaLaunchPromo(card, MatchaTreatment2.toDbModel(treatment)));
                }
                return Optional2.INSTANCE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}

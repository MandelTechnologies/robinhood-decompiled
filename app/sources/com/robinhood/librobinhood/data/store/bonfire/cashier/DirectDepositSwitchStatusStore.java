package com.robinhood.librobinhood.data.store.bonfire.cashier;

import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.prefs.HasSetupDirectDepositSwitchPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: DirectDepositSwitchStatusStore.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/cashier/DirectDepositSwitchStatusStore;", "Lcom/robinhood/store/Store;", "cashier", "Lcom/robinhood/android/api/cashier/Cashier;", "hasSetupDirectDepositSwitchPref", "Lcom/robinhood/prefs/BooleanPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/cashier/Cashier;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "", "getDirectDepositSwitchStatus", "Lio/reactivex/Observable;", "forceFetchDirectDepositSwitchStatusIfNotCached", "Lio/reactivex/Single;", "lib-store-direct-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class DirectDepositSwitchStatusStore extends Store {
    private final Endpoint<Unit, Boolean> endpoint;
    private final BooleanPreference hasSetupDirectDepositSwitchPref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectDepositSwitchStatusStore(Cashier cashier, @HasSetupDirectDepositSwitchPref BooleanPreference hasSetupDirectDepositSwitchPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cashier, "cashier");
        Intrinsics.checkNotNullParameter(hasSetupDirectDepositSwitchPref, "hasSetupDirectDepositSwitchPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.hasSetupDirectDepositSwitchPref = hasSetupDirectDepositSwitchPref;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        DirectDepositSwitchStatusStore2 directDepositSwitchStatusStore2 = new DirectDepositSwitchStatusStore2(hasSetupDirectDepositSwitchPref);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        this.endpoint = companion.create(new DirectDepositSwitchStatusStore3(cashier, null), logoutKillswitch, directDepositSwitchStatusStore2, clock, new DefaultStaleDecider(durationOfSeconds, storeBundle.getClock()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object endpoint$set(BooleanPreference booleanPreference, boolean z, Continuation continuation) {
        booleanPreference.set(z);
        return Unit.INSTANCE;
    }

    public final Observable<Boolean> getDirectDepositSwitchStatus() {
        Endpoint8.refresh$default(this.endpoint, false, null, 2, null);
        Observable<Boolean> observableSubscribeOn = this.hasSetupDirectDepositSwitchPref.getChanges().subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    public final Single<Boolean> forceFetchDirectDepositSwitchStatusIfNotCached() {
        Single<Boolean> singleOnErrorReturnItem = this.hasSetupDirectDepositSwitchPref.getChanges().firstOrError().subscribeOn(Schedulers.m3346io()).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.cashier.DirectDepositSwitchStatusStore.forceFetchDirectDepositSwitchStatusIfNotCached.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Boolean> apply(Boolean hasSetupDirectDepositSwitch) {
                Intrinsics.checkNotNullParameter(hasSetupDirectDepositSwitch, "hasSetupDirectDepositSwitch");
                if (hasSetupDirectDepositSwitch.booleanValue()) {
                    Single singleJust = Single.just(hasSetupDirectDepositSwitch);
                    Intrinsics.checkNotNull(singleJust);
                    return singleJust;
                }
                DirectDepositSwitchStatusStore directDepositSwitchStatusStore = DirectDepositSwitchStatusStore.this;
                return RxFactory.DefaultImpls.rxSingle$default(directDepositSwitchStatusStore, null, new AnonymousClass1(directDepositSwitchStatusStore, null), 1, null);
            }

            /* compiled from: DirectDepositSwitchStatusStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.cashier.DirectDepositSwitchStatusStore$forceFetchDirectDepositSwitchStatusIfNotCached$1$1", m3645f = "DirectDepositSwitchStatusStore.kt", m3646l = {54}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.cashier.DirectDepositSwitchStatusStore$forceFetchDirectDepositSwitchStatusIfNotCached$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
                int label;
                final /* synthetic */ DirectDepositSwitchStatusStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(DirectDepositSwitchStatusStore directDepositSwitchStatusStore, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = directDepositSwitchStatusStore;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    Endpoint endpoint = this.this$0.endpoint;
                    this.label = 1;
                    Object objForceFetch$default = Endpoint8.forceFetch$default(endpoint, null, this, 1, null);
                    return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
                }
            }
        }).onErrorReturnItem(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturnItem, "onErrorReturnItem(...)");
        return singleOnErrorReturnItem;
    }
}

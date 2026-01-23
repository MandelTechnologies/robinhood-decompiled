package com.robinhood.android.cash.lib.atm.p072ui;

import android.annotation.SuppressLint;
import android.app.Application;
import android.location.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.cash.lib.atm.extensions.FusedLocationProviderClients;
import com.robinhood.android.common.util.Compat;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.minerva.Atm;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.Doubles2;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AtmMiniFinderV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0016H\u0003J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderV2Duxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderDataState;", "Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderV2ViewState;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "app", "Landroid/app/Application;", "stateProvider", "Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/api/retrofit/Minerva;Landroid/app/Application;Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "locationProvider", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationDisposable", "Lio/reactivex/disposables/Disposable;", "lastLocationRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Landroid/location/Location;", "onStart", "", "setLocationStatus", "granted", "", "streamLocation", "streamAtms", "hasCoarseLocation", "lib-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AtmMiniFinderV2Duxo extends BaseDuxo<AtmMiniFinderDataState, AtmMiniFinderV2ViewState> {
    public static final int $stable = 8;
    private final Application app;
    private final PublishRelay<Location> lastLocationRelay;
    private Disposable locationDisposable;
    private final FusedLocationProviderClient locationProvider;
    private final Minerva minerva;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtmMiniFinderV2Duxo(Minerva minerva, Application app, AtmMiniFinderStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new AtmMiniFinderDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.minerva = minerva;
        this.app = app;
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(app.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        this.locationProvider = fusedLocationProviderClient;
        PublishRelay<Location> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.lastLocationRelay = publishRelayCreate;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        if (hasCoarseLocation()) {
            streamLocation();
        }
        streamAtms();
    }

    public final void setLocationStatus(boolean granted) {
        if (granted && hasCoarseLocation()) {
            streamLocation();
        }
    }

    @SuppressLint({"MissingPermission"})
    private final void streamLocation() {
        Disposable disposable = this.locationDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable map = FusedLocationProviderClients.locationUpdates$default(this.locationProvider, TimeUnit.HOURS.toMillis(1L), Long.valueOf(TimeUnit.SECONDS.toMillis(10L)), null, null, 2, null, null, 108, null).map(new Function() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderV2Duxo$streamLocation$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((LocationResult) it).getLastLocation());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((AtmMiniFinderV2Duxo$streamLocation$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        this.locationDisposable = ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null), new C101222(this.lastLocationRelay), new Function1() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderV2Duxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtmMiniFinderV2Duxo.streamLocation$lambda$1((Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: AtmMiniFinderV2Duxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderV2Duxo$streamLocation$2 */
    /* synthetic */ class C101222 extends FunctionReferenceImpl implements Function1<Location, Unit> {
        C101222(Object obj) {
            super(1, obj, PublishRelay.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Location p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PublishRelay) this.receiver).accept(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamLocation$lambda$1(Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!Throwables.isNetworkRelated(t)) {
            throw t;
        }
        return Unit.INSTANCE;
    }

    private final void streamAtms() {
        Observable<R> observableSwitchMapSingle = this.lastLocationRelay.take(1L).switchMapSingle(new Function() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderV2Duxo.streamAtms.1

            /* compiled from: AtmMiniFinderV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/minerva/Atm;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderV2Duxo$streamAtms$1$1", m3645f = "AtmMiniFinderV2Duxo.kt", m3646l = {81}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderV2Duxo$streamAtms$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends Atm>>, Object> {
                final /* synthetic */ Location $location;
                int label;
                final /* synthetic */ AtmMiniFinderV2Duxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AtmMiniFinderV2Duxo atmMiniFinderV2Duxo, Location location, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = atmMiniFinderV2Duxo;
                    this.$location = location;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$location, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends Atm>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super PaginatedResult<Atm>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<Atm>> continuation) {
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
                    Minerva minerva = this.this$0.minerva;
                    double dRound = Doubles2.round(this.$location.getLatitude(), 6);
                    double dRound2 = Doubles2.round(this.$location.getLongitude(), 6);
                    this.label = 1;
                    Object atmLocations = minerva.getAtmLocations(dRound, dRound2, this);
                    return atmLocations == coroutine_suspended ? coroutine_suspended : atmLocations;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples2<Location, List<Atm>>> apply(final Location location) {
                Intrinsics.checkNotNullParameter(location, "location");
                AtmMiniFinderV2Duxo atmMiniFinderV2Duxo = AtmMiniFinderV2Duxo.this;
                return RxFactory.DefaultImpls.rxSingle$default(atmMiniFinderV2Duxo, null, new AnonymousClass1(atmMiniFinderV2Duxo, location, null), 1, null).map(new Function() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderV2Duxo.streamAtms.1.2
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<Location, List<Atm>> apply(PaginatedResult<Atm> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Tuples4.m3642to(location, it.getResults());
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderV2Duxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtmMiniFinderV2Duxo.streamAtms$lambda$2(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderV2Duxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtmMiniFinderV2Duxo.streamAtms$lambda$3((Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAtms$lambda$2(AtmMiniFinderV2Duxo atmMiniFinderV2Duxo, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        atmMiniFinderV2Duxo.applyMutation(new AtmMiniFinderV2Duxo2((List) tuples2.component2(), (Location) objComponent1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAtms$lambda$3(Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!Throwables.isNetworkRelated(t)) {
            throw t;
        }
        return Unit.INSTANCE;
    }

    private final boolean hasCoarseLocation() {
        return Compat.INSTANCE.checkSelfPermission(this.app, "android.permission.ACCESS_COARSE_LOCATION");
    }
}

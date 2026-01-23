package com.robinhood.android.cash.atm.p069ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.Task;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.cash.atm.p069ui.AtmFinderDuxo;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.minerva.Atm;
import com.robinhood.utils.extensions.Doubles2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Notification;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.InterruptedIOException;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AtmFinderDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0011H\u0007J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/cash/atm/ui/AtmFinderDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/atm/ui/AtmFinderViewState;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "<init>", "(Lcom/robinhood/api/retrofit/Minerva;)V", "mapScrolls", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/google/android/gms/maps/model/LatLngBounds;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "locationProvider", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "onResume", "", "onPause", "setLocationSettingEnabled", "settingEnabled", "", "locationPermissionGranted", "context", "Landroid/content/Context;", "startLocationUpdates", "onLocationUpdated", "location", "Landroid/location/Location;", "onMapScrolled", "mapBounds", "feature-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AtmFinderDuxo extends OldBaseDuxo<AtmFinderViewState> {
    public static final int $stable = 8;
    private final LocationCallback locationCallback;
    private FusedLocationProviderClient locationProvider;
    private final LocationRequest locationRequest;
    private final BehaviorRelay<LatLngBounds> mapScrolls;
    private final Minerva minerva;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AtmFinderDuxo(Minerva minerva) {
        super(new AtmFinderViewState(null, null, null, false, false, false, 63, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        this.minerva = minerva;
        BehaviorRelay<LatLngBounds> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.mapScrolls = behaviorRelayCreate;
        LocationRequest locationRequestBuild = new LocationRequest.Builder(TimeUnit.HOURS.toMillis(1L)).build();
        Intrinsics.checkNotNullExpressionValue(locationRequestBuild, "build(...)");
        this.locationRequest = locationRequestBuild;
        this.locationCallback = new LocationCallback() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderDuxo$locationCallback$1
            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(LocationResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                Location lastLocation = result.getLastLocation();
                if (lastLocation != null) {
                    this.this$0.onLocationUpdated(lastLocation);
                }
            }
        };
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        Observable<R> observableSwitchMapSingle = this.mapScrolls.distinctUntilChanged().doOnEach(new C99571()).debounce(500L, TimeUnit.MILLISECONDS).switchMapSingle(new Function() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderDuxo.onResume.2

            /* compiled from: AtmFinderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/minerva/Atm;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cash.atm.ui.AtmFinderDuxo$onResume$2$1", m3645f = "AtmFinderDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cash.atm.ui.AtmFinderDuxo$onResume$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends Atm>>, Object> {
                final /* synthetic */ LatLng $center;
                int label;
                final /* synthetic */ AtmFinderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AtmFinderDuxo atmFinderDuxo, LatLng latLng, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = atmFinderDuxo;
                    this.$center = latLng;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$center, continuation);
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
                    double dRound = Doubles2.round(this.$center.latitude, 8);
                    double dRound2 = Doubles2.round(this.$center.longitude, 8);
                    this.label = 1;
                    Object atmLocations = minerva.getAtmLocations(dRound, dRound2, this);
                    return atmLocations == coroutine_suspended ? coroutine_suspended : atmLocations;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples2<LatLngBounds, List<Atm>>> apply(final LatLngBounds bounds) {
                Intrinsics.checkNotNullParameter(bounds, "bounds");
                LatLng center = bounds.getCenter();
                Intrinsics.checkNotNullExpressionValue(center, "getCenter(...)");
                AtmFinderDuxo atmFinderDuxo = AtmFinderDuxo.this;
                return RxFactory.DefaultImpls.rxSingle$default(atmFinderDuxo, null, new AnonymousClass1(atmFinderDuxo, center, null), 1, null).map(new Function() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderDuxo.onResume.2.2
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<LatLngBounds, List<Atm>> apply(PaginatedResult<Atm> paginatedResult) {
                        Intrinsics.checkNotNullParameter(paginatedResult, "paginatedResult");
                        return Tuples4.m3642to(bounds, paginatedResult.getResults());
                    }
                }).onErrorResumeNext(new Function() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderDuxo.onResume.2.3
                    @Override // io.reactivex.functions.Function
                    public final SingleSource<? extends Tuples2<LatLngBounds, List<Atm>>> apply(Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        if (error instanceof InterruptedIOException) {
                            return Single.never();
                        }
                        return Single.error(error);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSwitchMapSingle), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtmFinderDuxo.onResume$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
        startLocationUpdates();
    }

    /* compiled from: AtmFinderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.atm.ui.AtmFinderDuxo$onResume$1 */
    static final class C99571<T> implements Consumer {
        C99571() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Notification<LatLngBounds> notification) {
            AtmFinderDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderDuxo$onResume$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AtmFinderDuxo.C99571.accept$lambda$0((AtmFinderViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AtmFinderViewState accept$lambda$0(AtmFinderViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return AtmFinderViewState.copy$default(applyMutation, null, null, null, true, false, false, 55, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(AtmFinderDuxo atmFinderDuxo, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        final LatLngBounds latLngBounds = (LatLngBounds) objComponent1;
        final List list = (List) tuples2.component2();
        atmFinderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtmFinderDuxo.onResume$lambda$1$lambda$0(list, latLngBounds, (AtmFinderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AtmFinderViewState onResume$lambda$1$lambda$0(List list, LatLngBounds latLngBounds, AtmFinderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AtmFinderViewState.copy$default(applyMutation, list, latLngBounds, null, false, false, false, 52, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onPause() {
        super.onPause();
        FusedLocationProviderClient fusedLocationProviderClient = this.locationProvider;
        if (fusedLocationProviderClient != null) {
            fusedLocationProviderClient.removeLocationUpdates(this.locationCallback);
        }
    }

    public final void setLocationSettingEnabled(final boolean settingEnabled) {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtmFinderDuxo.setLocationSettingEnabled$lambda$2(settingEnabled, (AtmFinderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AtmFinderViewState setLocationSettingEnabled$lambda$2(boolean z, AtmFinderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AtmFinderViewState.copy$default(applyMutation, null, null, null, false, false, z, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AtmFinderViewState locationPermissionGranted$lambda$3(AtmFinderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AtmFinderViewState.copy$default(applyMutation, null, null, null, false, true, false, 47, null);
    }

    public final void locationPermissionGranted(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtmFinderDuxo.locationPermissionGranted$lambda$3((AtmFinderViewState) obj);
            }
        });
        this.locationProvider = LocationServices.getFusedLocationProviderClient(context);
        startLocationUpdates();
    }

    @SuppressLint({"MissingPermission"})
    public final void startLocationUpdates() {
        FusedLocationProviderClient fusedLocationProviderClient = this.locationProvider;
        if (fusedLocationProviderClient != null) {
            Task<Location> lastLocation = fusedLocationProviderClient.getLastLocation();
            Intrinsics.checkNotNullExpressionValue(lastLocation, "getLastLocation(...)");
            if (lastLocation.isComplete() && lastLocation.isSuccessful() && lastLocation.getResult() != null) {
                Location result = lastLocation.getResult();
                Intrinsics.checkNotNull(result);
                onLocationUpdated(result);
            }
            fusedLocationProviderClient.removeLocationUpdates(this.locationCallback);
            fusedLocationProviderClient.requestLocationUpdates(this.locationRequest, this.locationCallback, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLocationUpdated(final Location location) {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtmFinderDuxo.onLocationUpdated$lambda$5(location, (AtmFinderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AtmFinderViewState onLocationUpdated$lambda$5(Location location, AtmFinderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AtmFinderViewState.copy$default(applyMutation, null, null, location, false, false, false, 59, null);
    }

    public final void onMapScrolled(LatLngBounds mapBounds) {
        Intrinsics.checkNotNullParameter(mapBounds, "mapBounds");
        this.mapScrolls.accept(mapBounds);
    }
}

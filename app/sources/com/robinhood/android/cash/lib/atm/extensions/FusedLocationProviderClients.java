package com.robinhood.android.cash.lib.atm.extensions;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FusedLocationProviderClients.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001ao\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"locationUpdates", "Lio/reactivex/Observable;", "Lcom/google/android/gms/location/LocationResult;", "kotlin.jvm.PlatformType", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "intervalMillis", "", "durationMillis", "minUpdateIntervalMillis", "maxUpdateDelayMillis", "maxUpdates", "", "priority", "minUpdateDistanceMeters", "", "(Lcom/google/android/gms/location/FusedLocationProviderClient;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)Lio/reactivex/Observable;", "lib-cash-atm_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.lib.atm.extensions.FusedLocationProviderClientsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class FusedLocationProviderClients {
    public static /* synthetic */ Observable locationUpdates$default(FusedLocationProviderClient fusedLocationProviderClient, long j, Long l, Long l2, Long l3, Integer num, Integer num2, Float f, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            l2 = null;
        }
        if ((i & 8) != 0) {
            l3 = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        if ((i & 64) != 0) {
            f = null;
        }
        return locationUpdates(fusedLocationProviderClient, j, l, l2, l3, num, num2, f);
    }

    public static final Observable<LocationResult> locationUpdates(final FusedLocationProviderClient fusedLocationProviderClient, final long j, final Long l, final Long l2, final Long l3, final Integer num, final Integer num2, final Float f) {
        Intrinsics.checkNotNullParameter(fusedLocationProviderClient, "<this>");
        Observable<LocationResult> observableCreate = Observable.create(new ObservableOnSubscribe() { // from class: com.robinhood.android.cash.lib.atm.extensions.FusedLocationProviderClientsKt.locationUpdates.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.location.LocationCallback, com.robinhood.android.cash.lib.atm.extensions.FusedLocationProviderClientsKt$locationUpdates$1$callback$1] */
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<LocationResult> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                LocationRequest.Builder builder = new LocationRequest.Builder(j);
                Long l4 = l;
                Long l5 = l2;
                Long l6 = l3;
                Integer num3 = num;
                Integer num4 = num2;
                Float f2 = f;
                if (l4 != null) {
                    builder.setDurationMillis(l4.longValue());
                }
                if (l5 != null) {
                    builder.setMinUpdateIntervalMillis(l5.longValue());
                }
                if (l6 != null) {
                    builder.setMaxUpdateDelayMillis(l6.longValue());
                }
                if (num3 != null) {
                    builder.setMaxUpdates(num3.intValue());
                }
                if (num4 != null) {
                    builder.setPriority(num4.intValue());
                }
                if (f2 != null) {
                    builder.setMinUpdateDistanceMeters(f2.floatValue());
                }
                LocationRequest locationRequestBuild = builder.build();
                Intrinsics.checkNotNullExpressionValue(locationRequestBuild, "build(...)");
                final ?? r1 = new LocationCallback() { // from class: com.robinhood.android.cash.lib.atm.extensions.FusedLocationProviderClientsKt$locationUpdates$1$callback$1
                    @Override // com.google.android.gms.location.LocationCallback
                    public void onLocationResult(LocationResult locationResult) {
                        Intrinsics.checkNotNullParameter(locationResult, "locationResult");
                        super.onLocationResult(locationResult);
                        emitter.onNext(locationResult);
                    }
                };
                fusedLocationProviderClient.requestLocationUpdates(locationRequestBuild, r1, null);
                final FusedLocationProviderClient fusedLocationProviderClient2 = fusedLocationProviderClient;
                emitter.setDisposable(new MainThreadDisposable() { // from class: com.robinhood.android.cash.lib.atm.extensions.FusedLocationProviderClientsKt.locationUpdates.1.1
                    @Override // io.reactivex.android.MainThreadDisposable
                    protected void onDispose() {
                        fusedLocationProviderClient2.removeLocationUpdates(r1);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCreate, "create(...)");
        return observableCreate;
    }
}

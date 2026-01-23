package com.robinhood.shared.advertisingid;

import android.app.Application;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.robinhood.analytics.AdIdProvider;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvertisingIdModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/advertisingid/AdvertisingIdModule;", "", "<init>", "()V", "provideAdIdProvider", "Lcom/robinhood/analytics/AdIdProvider;", "app", "Landroid/app/Application;", "lib-advertising-id_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class AdvertisingIdModule {
    public static final AdvertisingIdModule INSTANCE = new AdvertisingIdModule();

    private AdvertisingIdModule() {
    }

    public final AdIdProvider provideAdIdProvider(final Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        return new AdIdProvider() { // from class: com.robinhood.shared.advertisingid.AdvertisingIdModule$provideAdIdProvider$$inlined$AdIdProvider$1
            @Override // com.robinhood.analytics.AdIdProvider
            public Observable<String> getAdId() {
                final Application application = app;
                Observable<String> observableSubscribeOn = Observable.create(new ObservableOnSubscribe() { // from class: com.robinhood.shared.advertisingid.AdvertisingIdModule$provideAdIdProvider$1$1
                    @Override // io.reactivex.ObservableOnSubscribe
                    public final void subscribe(ObservableEmitter<String> emitter) {
                        Intrinsics.checkNotNullParameter(emitter, "emitter");
                        try {
                            String id = AdvertisingIdClient.getAdvertisingIdInfo(application).getId();
                            if (id != null) {
                                emitter.onNext(id);
                            }
                        } catch (Exception unused) {
                        }
                        emitter.onComplete();
                    }
                }).subscribeOn(Schedulers.m3346io());
                Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
                return observableSubscribeOn;
            }
        };
    }
}

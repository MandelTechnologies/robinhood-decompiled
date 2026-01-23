package com.robinhood.analytics.firebaseappinstanceid;

import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import kotlin.Metadata;

/* compiled from: FirebaseAppInstanceIdProvider.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "", "firebaseAppInstanceId", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "", "getFirebaseAppInstanceId", "()Lio/reactivex/Observable;", "refreshFirebaseAppInstanceId", "", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface FirebaseAppInstanceIdProvider {
    Observable<Optional<String>> getFirebaseAppInstanceId();

    void refreshFirebaseAppInstanceId();
}

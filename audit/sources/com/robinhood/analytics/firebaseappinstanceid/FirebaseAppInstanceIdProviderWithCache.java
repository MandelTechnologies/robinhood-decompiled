package com.robinhood.analytics.firebaseappinstanceid;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.FirebaseAppInstanceIdPref;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FirebaseAppInstanceIdProviderWithCache.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProviderWithCache;", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "applicationContext", "Landroid/content/Context;", "appInstanceIdPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Landroid/content/Context;Lcom/robinhood/prefs/StringPreference;)V", "firebaseAppInstanceId", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "", "getFirebaseAppInstanceId", "()Lio/reactivex/Observable;", "refreshFirebaseAppInstanceId", "", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FirebaseAppInstanceIdProviderWithCache implements FirebaseAppInstanceIdProvider {
    private final StringPreference appInstanceIdPref;
    private final Context applicationContext;
    private final Observable<Optional<String>> firebaseAppInstanceId;

    public FirebaseAppInstanceIdProviderWithCache(Context applicationContext, @FirebaseAppInstanceIdPref StringPreference appInstanceIdPref) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(appInstanceIdPref, "appInstanceIdPref");
        this.applicationContext = applicationContext;
        this.appInstanceIdPref = appInstanceIdPref;
        refreshFirebaseAppInstanceId();
        this.firebaseAppInstanceId = appInstanceIdPref.changes();
    }

    @Override // com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProvider
    public Observable<Optional<String>> getFirebaseAppInstanceId() {
        return this.firebaseAppInstanceId;
    }

    @Override // com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProvider
    public void refreshFirebaseAppInstanceId() {
        FirebaseAnalytics.getInstance(this.applicationContext).getAppInstanceId().addOnSuccessListener(new OnSuccessListener() { // from class: com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProviderWithCache.refreshFirebaseAppInstanceId.1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(String str) {
                FirebaseAppInstanceIdProviderWithCache.this.appInstanceIdPref.set(str);
            }
        });
    }
}

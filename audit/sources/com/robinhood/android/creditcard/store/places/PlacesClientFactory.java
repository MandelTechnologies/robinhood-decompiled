package com.robinhood.android.creditcard.store.places;

import android.app.Application;
import android.content.Context;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.googlemaps.C18328R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlacesClientFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/creditcard/store/places/PlacesClientFactory;", "", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/google/android/libraries/places/api/net/PlacesClient;", "locale", "Ljava/util/Locale;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PlacesClientFactory {
    public static final int $stable = 8;
    private final Application application;

    public PlacesClientFactory(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
    }

    public static /* synthetic */ PlacesClient create$default(PlacesClientFactory placesClientFactory, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.US;
        }
        return placesClientFactory.create(locale);
    }

    public final PlacesClient create(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Context applicationContext = this.application.getApplicationContext();
        if (!Places.isInitialized()) {
            Places.initialize(applicationContext, applicationContext.getString(C18328R.string.maps_sdk_api_key), locale);
        }
        PlacesClient placesClientCreateClient = Places.createClient(applicationContext);
        Intrinsics.checkNotNullExpressionValue(placesClientCreateClient, "createClient(...)");
        return placesClientCreateClient;
    }
}

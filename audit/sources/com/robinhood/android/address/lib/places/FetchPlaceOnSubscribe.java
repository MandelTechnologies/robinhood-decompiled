package com.robinhood.android.address.lib.places;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.robinhood.android.address.lib.C8334R;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FetchPlaceOnSubscribe.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/address/lib/places/FetchPlaceOnSubscribe;", "Lio/reactivex/SingleOnSubscribe;", "Lcom/google/android/libraries/places/api/net/FetchPlaceResponse;", "context", "Landroid/content/Context;", "placeId", "", "sessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "locale", "Ljava/util/Locale;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;Ljava/util/Locale;)V", "subscribe", "", "emitter", "Lio/reactivex/SingleEmitter;", "feature-lib-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class FetchPlaceOnSubscribe implements SingleOnSubscribe<FetchPlaceResponse> {
    private final Context context;
    private final Locale locale;
    private final String placeId;
    private final AutocompleteSessionToken sessionToken;

    public FetchPlaceOnSubscribe(Context context, String placeId, AutocompleteSessionToken sessionToken, Locale locale) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.context = context;
        this.placeId = placeId;
        this.sessionToken = sessionToken;
        this.locale = locale;
    }

    public /* synthetic */ FetchPlaceOnSubscribe(Context context, String str, AutocompleteSessionToken autocompleteSessionToken, Locale locale, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, autocompleteSessionToken, (i & 8) != 0 ? Locale.US : locale);
    }

    @Override // io.reactivex.SingleOnSubscribe
    public void subscribe(final SingleEmitter<FetchPlaceResponse> emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        IdlingResourceCounters2.increment(IdlingResourceType.ADDRESS_MAP_LOADING_COMPLETE_ADDRESS);
        Context applicationContext = this.context.getApplicationContext();
        if (!Places.isInitialized()) {
            Places.initialize(applicationContext, applicationContext.getString(C8334R.string.maps_sdk_api_key), this.locale);
        }
        Task<FetchPlaceResponse> taskFetchPlace = Places.createClient(applicationContext).fetchPlace(FetchPlaceRequest.builder(this.placeId, CollectionsKt.listOf((Object[]) new Place.Field[]{Place.Field.ID, Place.Field.ADDRESS, Place.Field.ADDRESS_COMPONENTS, Place.Field.NAME, Place.Field.LAT_LNG})).setSessionToken(this.sessionToken).build());
        taskFetchPlace.addOnSuccessListener(new OnSuccessListener() { // from class: com.robinhood.android.address.lib.places.FetchPlaceOnSubscribe.subscribe.1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(FetchPlaceResponse fetchPlaceResponse) {
                emitter.onSuccess(fetchPlaceResponse);
                IdlingResourceCounters2.decrement(IdlingResourceType.ADDRESS_MAP_LOADING_COMPLETE_ADDRESS);
            }
        });
        taskFetchPlace.addOnFailureListener(new OnFailureListener() { // from class: com.robinhood.android.address.lib.places.FetchPlaceOnSubscribe.subscribe.2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (!emitter.getDisposed()) {
                    emitter.onError(it);
                }
                IdlingResourceCounters2.decrement(IdlingResourceType.ADDRESS_MAP_LOADING_COMPLETE_ADDRESS);
            }
        });
    }
}

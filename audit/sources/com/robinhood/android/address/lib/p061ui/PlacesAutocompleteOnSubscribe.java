package com.robinhood.android.address.lib.p061ui;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.robinhood.android.address.lib.C8334R;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlacesAutocompleteOnSubscribe.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/address/lib/ui/PlacesAutocompleteOnSubscribe;", "Lio/reactivex/SingleOnSubscribe;", "Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;", "context", "Landroid/content/Context;", "query", "", "sessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "location", "Landroid/location/Location;", "countryCodes", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;Landroid/location/Location;Ljava/util/List;)V", "defaultCountryCodes", "subscribe", "", "emitter", "Lio/reactivex/SingleEmitter;", "feature-lib-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class PlacesAutocompleteOnSubscribe implements SingleOnSubscribe<FindAutocompletePredictionsResponse> {
    private final Context context;
    private final List<String> countryCodes;
    private final List<String> defaultCountryCodes;
    private final Location location;
    private final String query;
    private final AutocompleteSessionToken sessionToken;

    public PlacesAutocompleteOnSubscribe(Context context, String str, AutocompleteSessionToken sessionToken, Location location, List<String> list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        this.context = context;
        this.query = str;
        this.sessionToken = sessionToken;
        this.location = location;
        this.countryCodes = list;
        this.defaultCountryCodes = CollectionsKt.listOf((Object[]) new String[]{CountryCode.Supported.UnitedStates.INSTANCE.getIso3166CountryCode(), "PR"});
    }

    public /* synthetic */ PlacesAutocompleteOnSubscribe(Context context, String str, AutocompleteSessionToken autocompleteSessionToken, Location location, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, autocompleteSessionToken, (i & 8) != 0 ? null : location, (i & 16) != 0 ? null : list);
    }

    @Override // io.reactivex.SingleOnSubscribe
    public void subscribe(final SingleEmitter<FindAutocompletePredictionsResponse> emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Context applicationContext = this.context.getApplicationContext();
        if (!Places.isInitialized()) {
            Places.initialize(applicationContext, applicationContext.getString(C8334R.string.maps_sdk_api_key), Locale.US);
        }
        PlacesClient placesClientCreateClient = Places.createClient(applicationContext);
        FindAutocompletePredictionsRequest.Builder builder = FindAutocompletePredictionsRequest.builder();
        List<String> list = this.countryCodes;
        if (list == null) {
            list = this.defaultCountryCodes;
        }
        FindAutocompletePredictionsRequest.Builder sessionToken = builder.setCountries(list).setQuery(this.query).setSessionToken(this.sessionToken);
        if (this.location != null) {
            LatLng latLng = new LatLng(this.location.getLatitude(), this.location.getLongitude());
            sessionToken.setLocationBias(RectangularBounds.newInstance(latLng, latLng));
        }
        Task<FindAutocompletePredictionsResponse> taskFindAutocompletePredictions = placesClientCreateClient.findAutocompletePredictions(sessionToken.build());
        IdlingResourceCounters2.increment(IdlingResourceType.ADDRESS_AUTOCOMPLETE);
        taskFindAutocompletePredictions.addOnCompleteListener(new OnCompleteListener() { // from class: com.robinhood.android.address.lib.ui.PlacesAutocompleteOnSubscribe.subscribe.1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<FindAutocompletePredictionsResponse> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                IdlingResourceCounters2.decrement(IdlingResourceType.ADDRESS_AUTOCOMPLETE);
            }
        });
        taskFindAutocompletePredictions.addOnSuccessListener(new OnSuccessListener() { // from class: com.robinhood.android.address.lib.ui.PlacesAutocompleteOnSubscribe.subscribe.2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(FindAutocompletePredictionsResponse p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                emitter.onSuccess(p0);
            }
        });
        taskFindAutocompletePredictions.addOnFailureListener(new OnFailureListener() { // from class: com.robinhood.android.address.lib.ui.PlacesAutocompleteOnSubscribe.subscribe.3
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception e) {
                Exception exc;
                Intrinsics.checkNotNullParameter(e, "e");
                if (e instanceof ApiException) {
                    int statusCode = ((ApiException) e).getStatusCode();
                    if (statusCode == 7 || statusCode == 15) {
                        exc = e;
                    } else {
                        exc = e;
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, exc, false, null, 6, null);
                    }
                } else {
                    exc = e;
                    if (!Throwables.isNetworkRelated(exc)) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, exc, false, null, 6, null);
                    }
                }
                emitter.tryOnError(exc);
            }
        });
    }
}

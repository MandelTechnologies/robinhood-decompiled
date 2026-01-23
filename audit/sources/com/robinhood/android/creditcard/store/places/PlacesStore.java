package com.robinhood.android.creditcard.store.places;

import android.location.Location;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: PlacesStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012J>\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0086@¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/creditcard/store/places/PlacesStore;", "Lcom/robinhood/store/Store;", "placesClientFactory", "Lcom/robinhood/android/creditcard/store/places/PlacesClientFactory;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/creditcard/store/places/PlacesClientFactory;Lcom/robinhood/store/StoreBundle;)V", "defaultCountryCodes", "", "", "fetchPlaceDetails", "Lcom/google/android/libraries/places/api/net/FetchPlaceResponse;", "placeId", "sessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "locale", "Ljava/util/Locale;", "(Ljava/lang/String;Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "autocomplete", "Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;", "query", "location", "Landroid/location/Location;", "countryCodes", "(Ljava/lang/String;Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;Landroid/location/Location;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PlacesStore extends Store {
    public static final int $stable = 8;
    private final List<String> defaultCountryCodes;
    private final PlacesClientFactory placesClientFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesStore(PlacesClientFactory placesClientFactory, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(placesClientFactory, "placesClientFactory");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.placesClientFactory = placesClientFactory;
        this.defaultCountryCodes = CollectionsKt.listOf((Object[]) new String[]{CountryCode.Supported.UnitedStates.INSTANCE.getIso3166CountryCode(), "PR"});
    }

    public static /* synthetic */ Object fetchPlaceDetails$default(PlacesStore placesStore, String str, AutocompleteSessionToken autocompleteSessionToken, Locale locale, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            locale = Locale.US;
        }
        return placesStore.fetchPlaceDetails(str, autocompleteSessionToken, locale, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object autocomplete$default(PlacesStore placesStore, String str, AutocompleteSessionToken autocompleteSessionToken, Location location, List list, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            location = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        return placesStore.autocomplete(str, autocompleteSessionToken, location, list, continuation);
    }

    public final Object fetchPlaceDetails(String str, AutocompleteSessionToken autocompleteSessionToken, Locale locale, Continuation<? super FetchPlaceResponse> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        IdlingResourceCounters2.increment(IdlingResourceType.ADDRESS_MAP_LOADING_COMPLETE_ADDRESS);
        Task<FetchPlaceResponse> taskFetchPlace = this.placesClientFactory.create(locale).fetchPlace(FetchPlaceRequest.builder(str, CollectionsKt.listOf((Object[]) new Place.Field[]{Place.Field.ID, Place.Field.ADDRESS, Place.Field.ADDRESS_COMPONENTS, Place.Field.NAME, Place.Field.LAT_LNG})).setSessionToken(autocompleteSessionToken).build());
        taskFetchPlace.addOnSuccessListener(new OnSuccessListener() { // from class: com.robinhood.android.creditcard.store.places.PlacesStore$fetchPlaceDetails$2$1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(FetchPlaceResponse fetchPlaceResponse) {
                if (cancellableContinuationImpl.isActive()) {
                    cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(fetchPlaceResponse));
                }
                IdlingResourceCounters2.decrement(IdlingResourceType.ADDRESS_MAP_LOADING_COMPLETE_ADDRESS);
            }
        });
        taskFetchPlace.addOnFailureListener(new OnFailureListener() { // from class: com.robinhood.android.creditcard.store.places.PlacesStore$fetchPlaceDetails$2$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (cancellableContinuationImpl.isActive()) {
                    CancellableContinuation<FetchPlaceResponse> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(it)));
                }
                IdlingResourceCounters2.decrement(IdlingResourceType.ADDRESS_MAP_LOADING_COMPLETE_ADDRESS);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final Object autocomplete(String str, AutocompleteSessionToken autocompleteSessionToken, Location location, List<String> list, Continuation<? super FindAutocompletePredictionsResponse> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        PlacesClient placesClientCreate$default = PlacesClientFactory.create$default(this.placesClientFactory, null, 1, null);
        FindAutocompletePredictionsRequest.Builder builder = FindAutocompletePredictionsRequest.builder();
        if (list == null) {
            list = this.defaultCountryCodes;
        }
        FindAutocompletePredictionsRequest.Builder sessionToken = builder.setCountries(list).setQuery(str).setSessionToken(autocompleteSessionToken);
        if (location != null) {
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            sessionToken.setLocationBias(RectangularBounds.newInstance(latLng, latLng));
        }
        Task<FindAutocompletePredictionsResponse> taskFindAutocompletePredictions = placesClientCreate$default.findAutocompletePredictions(sessionToken.build());
        IdlingResourceCounters2.increment(IdlingResourceType.ADDRESS_AUTOCOMPLETE);
        taskFindAutocompletePredictions.addOnCompleteListener(new OnCompleteListener() { // from class: com.robinhood.android.creditcard.store.places.PlacesStore$autocomplete$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<FindAutocompletePredictionsResponse> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                IdlingResourceCounters2.decrement(IdlingResourceType.ADDRESS_AUTOCOMPLETE);
            }
        });
        taskFindAutocompletePredictions.addOnSuccessListener(new OnSuccessListener() { // from class: com.robinhood.android.creditcard.store.places.PlacesStore$autocomplete$2$2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(FindAutocompletePredictionsResponse findAutocompletePredictionsResponse) {
                if (cancellableContinuationImpl.isActive()) {
                    cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(findAutocompletePredictionsResponse));
                }
            }
        });
        taskFindAutocompletePredictions.addOnFailureListener(new OnFailureListener() { // from class: com.robinhood.android.creditcard.store.places.PlacesStore$autocomplete$2$3
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
                if (cancellableContinuationImpl.isActive()) {
                    CancellableContinuation<FindAutocompletePredictionsResponse> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(exc)));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}

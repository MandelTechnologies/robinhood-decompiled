package com.robinhood.android.creditcard.p091ui.creditapplication.address.search.utils;

import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AddressComponents;
import com.google.android.libraries.places.api.model.Place;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: Places.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u001d\u001a\u0004\u0018\u00010\u0001*\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\"\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u0001*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\"\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010\"\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010\"\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010\"\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u0001*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010¨\u0006!"}, m3636d2 = {"TYPE_STREET_NUMBER", "", "TYPE_STREET_NAME", "TYPE_CITY", "TYPE_CITY_US_FALLBACK_1", "TYPE_CITY_US_FALLBACK_2", "TYPE_CITY_FOREIGN_COUNTRIES_FALLBACK", "TYPE_STATE", "TYPE_COUNTRY", "TYPE_ZIPCODE", "PUERTO_RICO", "UNITED_KINGDOM", "PUERTO_RICO_CODE", "streetAddress", "Lcom/google/android/libraries/places/api/model/Place;", "getStreetAddress", "(Lcom/google/android/libraries/places/api/model/Place;)Ljava/lang/String;", "streetNumber", "getStreetNumber", "streetName", "getStreetName", "city", "getCity", "state", "getState", "zipcode", "getZipcode", "country", "getCountry", "getComponent", "type", "useShortName", "", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.utils.PlacesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Places3 {
    private static final String PUERTO_RICO = "Puerto Rico";
    public static final String PUERTO_RICO_CODE = "PR";
    private static final String TYPE_CITY = "locality";
    private static final String TYPE_CITY_FOREIGN_COUNTRIES_FALLBACK = "postal_town";
    private static final String TYPE_CITY_US_FALLBACK_1 = "sublocality_level_1";
    private static final String TYPE_CITY_US_FALLBACK_2 = "administrative_area_level_3";
    private static final String TYPE_COUNTRY = "country";
    private static final String TYPE_STATE = "administrative_area_level_1";
    private static final String TYPE_STREET_NAME = "route";
    private static final String TYPE_STREET_NUMBER = "street_number";
    private static final String TYPE_ZIPCODE = "postal_code";
    private static final String UNITED_KINGDOM = "United Kingdom";

    public static final String getStreetAddress(Place place) {
        Intrinsics.checkNotNullParameter(place, "<this>");
        if (getStreetNumber(place) == null) {
            return getStreetName(place);
        }
        if (getStreetName(place) == null) {
            return getStreetNumber(place);
        }
        return getStreetNumber(place) + PlaceholderUtils.XXShortPlaceholderText + getStreetName(place);
    }

    public static final String getStreetNumber(Place place) {
        Intrinsics.checkNotNullParameter(place, "<this>");
        return getComponent$default(place, "street_number", false, 2, null);
    }

    public static final String getStreetName(Place place) {
        Intrinsics.checkNotNullParameter(place, "<this>");
        return getComponent(place, "route", true);
    }

    public static final String getCity(Place place) {
        Intrinsics.checkNotNullParameter(place, "<this>");
        String component$default = getComponent$default(place, "locality", false, 2, null);
        return (component$default == null && (component$default = getComponent$default(place, "sublocality_level_1", false, 2, null)) == null && (component$default = getComponent$default(place, "administrative_area_level_3", false, 2, null)) == null) ? getComponent$default(place, "postal_town", false, 2, null) : component$default;
    }

    public static final String getState(Place place) {
        Intrinsics.checkNotNullParameter(place, "<this>");
        if (StringsKt.equals(PUERTO_RICO, getComponent$default(place, "country", false, 2, null), true)) {
            return "PR";
        }
        return getComponent(place, "administrative_area_level_1", true);
    }

    public static final String getZipcode(Place place) {
        Intrinsics.checkNotNullParameter(place, "<this>");
        return getComponent$default(place, "postal_code", false, 2, null);
    }

    public static final String getCountry(Place place) {
        Intrinsics.checkNotNullParameter(place, "<this>");
        return getComponent$default(place, "country", false, 2, null);
    }

    static /* synthetic */ String getComponent$default(Place place, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getComponent(place, str, z);
    }

    private static final String getComponent(Place place, String str, boolean z) {
        AddressComponent addressComponent;
        List<AddressComponent> listAsList;
        Object next;
        AddressComponents addressComponents = place.getAddressComponents();
        if (addressComponents == null || (listAsList = addressComponents.asList()) == null) {
            addressComponent = null;
        } else {
            Iterator<T> it = listAsList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AddressComponent) next).getTypes().contains(str)) {
                    break;
                }
            }
            addressComponent = (AddressComponent) next;
        }
        if (z) {
            if (addressComponent != null) {
                return addressComponent.getShortName();
            }
            return null;
        }
        if (addressComponent != null) {
            return addressComponent.getName();
        }
        return null;
    }
}

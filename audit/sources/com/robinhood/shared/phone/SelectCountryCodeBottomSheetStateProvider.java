package com.robinhood.shared.phone;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.shared.phone.SelectCountryCodeBottomSheetViewState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectCountryCodeBottomSheetStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetDataState;", "Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetViewState;", "<init>", "()V", "reduce", "dataState", "feature-phone_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SelectCountryCodeBottomSheetStateProvider implements StateProvider<SelectCountryCodeBottomSheetDataState, SelectCountryCodeBottomSheetViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SelectCountryCodeBottomSheetViewState reduce(SelectCountryCodeBottomSheetDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.isLoading()) {
            return SelectCountryCodeBottomSheetViewState.Loading.INSTANCE;
        }
        List<CountryCode> countryCodes = dataState.getCountryCodes();
        List<CountryCode> prohibitedCountryCodes = dataState.getProhibitedCountryCodes();
        if (prohibitedCountryCodes == null) {
            prohibitedCountryCodes = CollectionsKt.emptyList();
        }
        return new SelectCountryCodeBottomSheetViewState.Loaded(countryCodes, prohibitedCountryCodes, dataState.getShowCallingCode());
    }
}

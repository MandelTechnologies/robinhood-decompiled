package com.robinhood.android.doc.serverdriven.country;

import com.robinhood.android.doc.p109ui.docorigin.UtilKt;
import com.robinhood.android.doc.serverdriven.country.SddrCountryViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrCountryStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/country/SddrCountryStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryDataState;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryViewState;", "<init>", "()V", "reduce", "dataState", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class SddrCountryStateProvider implements StateProvider<SddrCountryDataState, SddrCountryViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SddrCountryViewState reduce(SddrCountryDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getUserLocale() == null || dataState.getInNewPickerExperiment() == null) {
            return SddrCountryViewState.Loading.INSTANCE;
        }
        List<CountryCode> listAllCountriesExcept = UtilKt.allCountriesExcept(dataState.getContent().getExcludedCountries(), dataState.getContent().getExcludedCountries().contains(dataState.getUserLocale()) ? null : dataState.getUserLocale());
        if (dataState.getInNewPickerExperiment().booleanValue()) {
            return new SddrCountryViewState.NewPicker(dataState.getContent().getTitle(), dataState.getContent().getDescription(), dataState.getSelected(), listAllCountriesExcept);
        }
        return new SddrCountryViewState.OldPicker(dataState.getContent().getTitle(), dataState.getContent().getDescription(), listAllCountriesExcept);
    }
}

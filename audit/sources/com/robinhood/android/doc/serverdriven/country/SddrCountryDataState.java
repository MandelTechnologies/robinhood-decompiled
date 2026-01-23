package com.robinhood.android.doc.serverdriven.country;

import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.identi.ApiDocumentRequestContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrCountryDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J<\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/country/SddrCountryDataState;", "", "content", "Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$CountryScreen;", "inNewPickerExperiment", "", "userLocale", "Lcom/robinhood/iso/countrycode/CountryCode;", "selected", "<init>", "(Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$CountryScreen;Ljava/lang/Boolean;Lcom/robinhood/iso/countrycode/CountryCode;Lcom/robinhood/iso/countrycode/CountryCode;)V", "getContent", "()Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$CountryScreen;", "getInNewPickerExperiment", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUserLocale", "()Lcom/robinhood/iso/countrycode/CountryCode;", "getSelected", "component1", "component2", "component3", "component4", "copy", "(Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$CountryScreen;Ljava/lang/Boolean;Lcom/robinhood/iso/countrycode/CountryCode;Lcom/robinhood/iso/countrycode/CountryCode;)Lcom/robinhood/android/doc/serverdriven/country/SddrCountryDataState;", "equals", "other", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SddrCountryDataState {
    public static final int $stable = 8;
    private final ApiDocumentRequestContent.CountryScreen content;
    private final Boolean inNewPickerExperiment;
    private final CountryCode selected;
    private final CountryCode userLocale;

    public static /* synthetic */ SddrCountryDataState copy$default(SddrCountryDataState sddrCountryDataState, ApiDocumentRequestContent.CountryScreen countryScreen, Boolean bool, CountryCode countryCode, CountryCode countryCode2, int i, Object obj) {
        if ((i & 1) != 0) {
            countryScreen = sddrCountryDataState.content;
        }
        if ((i & 2) != 0) {
            bool = sddrCountryDataState.inNewPickerExperiment;
        }
        if ((i & 4) != 0) {
            countryCode = sddrCountryDataState.userLocale;
        }
        if ((i & 8) != 0) {
            countryCode2 = sddrCountryDataState.selected;
        }
        return sddrCountryDataState.copy(countryScreen, bool, countryCode, countryCode2);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiDocumentRequestContent.CountryScreen getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getInNewPickerExperiment() {
        return this.inNewPickerExperiment;
    }

    /* renamed from: component3, reason: from getter */
    public final CountryCode getUserLocale() {
        return this.userLocale;
    }

    /* renamed from: component4, reason: from getter */
    public final CountryCode getSelected() {
        return this.selected;
    }

    public final SddrCountryDataState copy(ApiDocumentRequestContent.CountryScreen content, Boolean inNewPickerExperiment, CountryCode userLocale, CountryCode selected) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new SddrCountryDataState(content, inNewPickerExperiment, userLocale, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SddrCountryDataState)) {
            return false;
        }
        SddrCountryDataState sddrCountryDataState = (SddrCountryDataState) other;
        return Intrinsics.areEqual(this.content, sddrCountryDataState.content) && Intrinsics.areEqual(this.inNewPickerExperiment, sddrCountryDataState.inNewPickerExperiment) && Intrinsics.areEqual(this.userLocale, sddrCountryDataState.userLocale) && Intrinsics.areEqual(this.selected, sddrCountryDataState.selected);
    }

    public int hashCode() {
        int iHashCode = this.content.hashCode() * 31;
        Boolean bool = this.inNewPickerExperiment;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        CountryCode countryCode = this.userLocale;
        int iHashCode3 = (iHashCode2 + (countryCode == null ? 0 : countryCode.hashCode())) * 31;
        CountryCode countryCode2 = this.selected;
        return iHashCode3 + (countryCode2 != null ? countryCode2.hashCode() : 0);
    }

    public String toString() {
        return "SddrCountryDataState(content=" + this.content + ", inNewPickerExperiment=" + this.inNewPickerExperiment + ", userLocale=" + this.userLocale + ", selected=" + this.selected + ")";
    }

    public SddrCountryDataState(ApiDocumentRequestContent.CountryScreen content, Boolean bool, CountryCode countryCode, CountryCode countryCode2) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.inNewPickerExperiment = bool;
        this.userLocale = countryCode;
        this.selected = countryCode2;
    }

    public /* synthetic */ SddrCountryDataState(ApiDocumentRequestContent.CountryScreen countryScreen, Boolean bool, CountryCode countryCode, CountryCode countryCode2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(countryScreen, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : countryCode, (i & 8) != 0 ? null : countryCode2);
    }

    public final ApiDocumentRequestContent.CountryScreen getContent() {
        return this.content;
    }

    public final Boolean getInNewPickerExperiment() {
        return this.inNewPickerExperiment;
    }

    public final CountryCode getUserLocale() {
        return this.userLocale;
    }

    public final CountryCode getSelected() {
        return this.selected;
    }
}

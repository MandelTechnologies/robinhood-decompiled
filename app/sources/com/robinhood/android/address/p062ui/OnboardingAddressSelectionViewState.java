package com.robinhood.android.address.p062ui;

import android.location.Location;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.address.p062ui.AddressSelectionViewState2;
import com.robinhood.android.address.p062ui.extensions.ChooseAddressSources;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AddressSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\t\u0010%\u001a\u00020\u0006HÂ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÂ\u0003Jc\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020!HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/address/ui/OnboardingAddressSelectionViewState;", "", "predictions", "", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "isLoading", "", "isInInitialState", "location", "Landroid/location/Location;", "error", "Lcom/robinhood/udf/UiEvent;", "", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "<init>", "(Ljava/util/List;ZZLandroid/location/Location;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;)V", "()Z", "getLocation", "()Landroid/location/Location;", "getError", "()Lcom/robinhood/udf/UiEvent;", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "showProgressBar", "getShowProgressBar", "viewTypes", "Lcom/robinhood/android/address/ui/ViewType;", "getViewTypes", "()Ljava/util/List;", "addressPromptRes", "", "getAddressPromptRes", "()Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class OnboardingAddressSelectionViewState {
    private final CountryCode.Supported countryCode;
    private final UiEvent<Throwable> error;
    private final boolean isInInitialState;
    private final boolean isLoading;
    private final Location location;
    private final List<AutocompletePrediction> predictions;
    private final boolean showProgressBar;
    private final ChooseAddressSource source;

    public OnboardingAddressSelectionViewState() {
        this(null, false, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    private final List<AutocompletePrediction> component1() {
        return this.predictions;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component7, reason: from getter */
    private final ChooseAddressSource getSource() {
        return this.source;
    }

    public static /* synthetic */ OnboardingAddressSelectionViewState copy$default(OnboardingAddressSelectionViewState onboardingAddressSelectionViewState, List list, boolean z, boolean z2, Location location, UiEvent uiEvent, CountryCode.Supported supported, ChooseAddressSource chooseAddressSource, int i, Object obj) {
        if ((i & 1) != 0) {
            list = onboardingAddressSelectionViewState.predictions;
        }
        if ((i & 2) != 0) {
            z = onboardingAddressSelectionViewState.isLoading;
        }
        if ((i & 4) != 0) {
            z2 = onboardingAddressSelectionViewState.isInInitialState;
        }
        if ((i & 8) != 0) {
            location = onboardingAddressSelectionViewState.location;
        }
        if ((i & 16) != 0) {
            uiEvent = onboardingAddressSelectionViewState.error;
        }
        if ((i & 32) != 0) {
            supported = onboardingAddressSelectionViewState.countryCode;
        }
        if ((i & 64) != 0) {
            chooseAddressSource = onboardingAddressSelectionViewState.source;
        }
        CountryCode.Supported supported2 = supported;
        ChooseAddressSource chooseAddressSource2 = chooseAddressSource;
        UiEvent uiEvent2 = uiEvent;
        boolean z3 = z2;
        return onboardingAddressSelectionViewState.copy(list, z, z3, location, uiEvent2, supported2, chooseAddressSource2);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsInInitialState() {
        return this.isInInitialState;
    }

    /* renamed from: component4, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    public final UiEvent<Throwable> component5() {
        return this.error;
    }

    /* renamed from: component6, reason: from getter */
    public final CountryCode.Supported getCountryCode() {
        return this.countryCode;
    }

    public final OnboardingAddressSelectionViewState copy(List<? extends AutocompletePrediction> predictions, boolean isLoading, boolean isInInitialState, Location location, UiEvent<Throwable> error, CountryCode.Supported countryCode, ChooseAddressSource source) {
        Intrinsics.checkNotNullParameter(predictions, "predictions");
        return new OnboardingAddressSelectionViewState(predictions, isLoading, isInInitialState, location, error, countryCode, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingAddressSelectionViewState)) {
            return false;
        }
        OnboardingAddressSelectionViewState onboardingAddressSelectionViewState = (OnboardingAddressSelectionViewState) other;
        return Intrinsics.areEqual(this.predictions, onboardingAddressSelectionViewState.predictions) && this.isLoading == onboardingAddressSelectionViewState.isLoading && this.isInInitialState == onboardingAddressSelectionViewState.isInInitialState && Intrinsics.areEqual(this.location, onboardingAddressSelectionViewState.location) && Intrinsics.areEqual(this.error, onboardingAddressSelectionViewState.error) && Intrinsics.areEqual(this.countryCode, onboardingAddressSelectionViewState.countryCode) && this.source == onboardingAddressSelectionViewState.source;
    }

    public int hashCode() {
        int iHashCode = ((((this.predictions.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isInInitialState)) * 31;
        Location location = this.location;
        int iHashCode2 = (iHashCode + (location == null ? 0 : location.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        CountryCode.Supported supported = this.countryCode;
        int iHashCode4 = (iHashCode3 + (supported == null ? 0 : supported.hashCode())) * 31;
        ChooseAddressSource chooseAddressSource = this.source;
        return iHashCode4 + (chooseAddressSource != null ? chooseAddressSource.hashCode() : 0);
    }

    public String toString() {
        return "OnboardingAddressSelectionViewState(predictions=" + this.predictions + ", isLoading=" + this.isLoading + ", isInInitialState=" + this.isInInitialState + ", location=" + this.location + ", error=" + this.error + ", countryCode=" + this.countryCode + ", source=" + this.source + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingAddressSelectionViewState(List<? extends AutocompletePrediction> predictions, boolean z, boolean z2, Location location, UiEvent<Throwable> uiEvent, CountryCode.Supported supported, ChooseAddressSource chooseAddressSource) {
        Intrinsics.checkNotNullParameter(predictions, "predictions");
        this.predictions = predictions;
        this.isLoading = z;
        this.isInInitialState = z2;
        this.location = location;
        this.error = uiEvent;
        this.countryCode = supported;
        this.source = chooseAddressSource;
        this.showProgressBar = z && predictions.isEmpty();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OnboardingAddressSelectionViewState(java.util.List r2, boolean r3, boolean r4, android.location.Location r5, com.robinhood.udf.UiEvent r6, com.robinhood.iso.countrycode.CountryCode.Supported r7, com.robinhood.android.navigation.app.keys.data.ChooseAddressSource r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r10 = r9 & 2
            if (r10 == 0) goto Ld
            r3 = 0
        Ld:
            r10 = r9 & 4
            if (r10 == 0) goto L12
            r4 = 1
        L12:
            r10 = r9 & 8
            r0 = 0
            if (r10 == 0) goto L18
            r5 = r0
        L18:
            r10 = r9 & 16
            if (r10 == 0) goto L1d
            r6 = r0
        L1d:
            r10 = r9 & 32
            if (r10 == 0) goto L22
            r7 = r0
        L22:
            r9 = r9 & 64
            if (r9 == 0) goto L2f
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L37
        L2f:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L37:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.address.p062ui.OnboardingAddressSelectionViewState.<init>(java.util.List, boolean, boolean, android.location.Location, com.robinhood.udf.UiEvent, com.robinhood.iso.countrycode.CountryCode$Supported, com.robinhood.android.navigation.app.keys.data.ChooseAddressSource, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean isInInitialState() {
        return this.isInInitialState;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final CountryCode.Supported getCountryCode() {
        return this.countryCode;
    }

    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    public final List<AddressSelectionViewState2> getViewTypes() {
        if (this.isInInitialState) {
            return CollectionsKt.emptyList();
        }
        List<AutocompletePrediction> list = this.predictions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AddressSelectionViewState2.Prediction((AutocompletePrediction) it.next()));
        }
        return CollectionsKt.plus((Collection<? extends AddressSelectionViewState2.ManualInput>) arrayList, AddressSelectionViewState2.ManualInput.INSTANCE);
    }

    public final Integer getAddressPromptRes() {
        ChooseAddressSource chooseAddressSource;
        CountryCode.Supported supported = this.countryCode;
        if (supported == null || (chooseAddressSource = this.source) == null) {
            return null;
        }
        return Integer.valueOf(ChooseAddressSources.getAddressPromptRes(chooseAddressSource, supported));
    }
}

package com.robinhood.android.odyssey.lib.template.citizen;

import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: SdSearchCitizenSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorViewState;", "", "title", "", "placeholder", "selectedOption", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "selectableOptions", "Lkotlinx/collections/immutable/PersistentList;", "allAvailableOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;Lkotlinx/collections/immutable/PersistentList;Lkotlinx/collections/immutable/PersistentList;)V", "getTitle", "()Ljava/lang/String;", "getPlaceholder", "getSelectedOption", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "getSelectableOptions", "()Lkotlinx/collections/immutable/PersistentList;", "getAllAvailableOptions", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SdSearchCitizenSelectorViewState {
    public static final int $stable = 8;
    private final ImmutableList3<ApiSdOption> allAvailableOptions;
    private final String placeholder;
    private final ImmutableList3<ApiSdOption> selectableOptions;
    private final ApiSdOption selectedOption;
    private final String title;

    public static /* synthetic */ SdSearchCitizenSelectorViewState copy$default(SdSearchCitizenSelectorViewState sdSearchCitizenSelectorViewState, String str, String str2, ApiSdOption apiSdOption, ImmutableList3 immutableList3, ImmutableList3 immutableList32, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdSearchCitizenSelectorViewState.title;
        }
        if ((i & 2) != 0) {
            str2 = sdSearchCitizenSelectorViewState.placeholder;
        }
        if ((i & 4) != 0) {
            apiSdOption = sdSearchCitizenSelectorViewState.selectedOption;
        }
        if ((i & 8) != 0) {
            immutableList3 = sdSearchCitizenSelectorViewState.selectableOptions;
        }
        if ((i & 16) != 0) {
            immutableList32 = sdSearchCitizenSelectorViewState.allAvailableOptions;
        }
        ImmutableList3 immutableList33 = immutableList32;
        ApiSdOption apiSdOption2 = apiSdOption;
        return sdSearchCitizenSelectorViewState.copy(str, str2, apiSdOption2, immutableList3, immutableList33);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiSdOption getSelectedOption() {
        return this.selectedOption;
    }

    public final ImmutableList3<ApiSdOption> component4() {
        return this.selectableOptions;
    }

    public final ImmutableList3<ApiSdOption> component5() {
        return this.allAvailableOptions;
    }

    public final SdSearchCitizenSelectorViewState copy(String title, String placeholder, ApiSdOption selectedOption, ImmutableList3<ApiSdOption> selectableOptions, ImmutableList3<ApiSdOption> allAvailableOptions) {
        Intrinsics.checkNotNullParameter(selectableOptions, "selectableOptions");
        Intrinsics.checkNotNullParameter(allAvailableOptions, "allAvailableOptions");
        return new SdSearchCitizenSelectorViewState(title, placeholder, selectedOption, selectableOptions, allAvailableOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdSearchCitizenSelectorViewState)) {
            return false;
        }
        SdSearchCitizenSelectorViewState sdSearchCitizenSelectorViewState = (SdSearchCitizenSelectorViewState) other;
        return Intrinsics.areEqual(this.title, sdSearchCitizenSelectorViewState.title) && Intrinsics.areEqual(this.placeholder, sdSearchCitizenSelectorViewState.placeholder) && Intrinsics.areEqual(this.selectedOption, sdSearchCitizenSelectorViewState.selectedOption) && Intrinsics.areEqual(this.selectableOptions, sdSearchCitizenSelectorViewState.selectableOptions) && Intrinsics.areEqual(this.allAvailableOptions, sdSearchCitizenSelectorViewState.allAvailableOptions);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.placeholder;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ApiSdOption apiSdOption = this.selectedOption;
        return ((((iHashCode2 + (apiSdOption != null ? apiSdOption.hashCode() : 0)) * 31) + this.selectableOptions.hashCode()) * 31) + this.allAvailableOptions.hashCode();
    }

    public String toString() {
        return "SdSearchCitizenSelectorViewState(title=" + this.title + ", placeholder=" + this.placeholder + ", selectedOption=" + this.selectedOption + ", selectableOptions=" + this.selectableOptions + ", allAvailableOptions=" + this.allAvailableOptions + ")";
    }

    public SdSearchCitizenSelectorViewState(String str, String str2, ApiSdOption apiSdOption, ImmutableList3<ApiSdOption> selectableOptions, ImmutableList3<ApiSdOption> allAvailableOptions) {
        Intrinsics.checkNotNullParameter(selectableOptions, "selectableOptions");
        Intrinsics.checkNotNullParameter(allAvailableOptions, "allAvailableOptions");
        this.title = str;
        this.placeholder = str2;
        this.selectedOption = apiSdOption;
        this.selectableOptions = selectableOptions;
        this.allAvailableOptions = allAvailableOptions;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final ApiSdOption getSelectedOption() {
        return this.selectedOption;
    }

    public final ImmutableList3<ApiSdOption> getSelectableOptions() {
        return this.selectableOptions;
    }

    public final ImmutableList3<ApiSdOption> getAllAvailableOptions() {
        return this.allAvailableOptions;
    }
}

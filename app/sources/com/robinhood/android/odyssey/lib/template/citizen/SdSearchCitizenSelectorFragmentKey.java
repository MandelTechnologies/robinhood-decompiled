package com.robinhood.android.odyssey.lib.template.citizen;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SdSearchCitizenSelectorFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorFragmentKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "title", "", "placeholder", "selectedInput", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "searchInputOptions", "Lkotlinx/collections/immutable/PersistentList;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;Lkotlinx/collections/immutable/PersistentList;)V", "getTitle", "()Ljava/lang/String;", "getPlaceholder", "getSelectedInput", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "getSearchInputOptions", "()Lkotlinx/collections/immutable/PersistentList;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SdSearchCitizenSelectorFragmentKey implements DialogFragmentKey, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SdSearchCitizenSelectorFragmentKey> CREATOR = new Creator();
    private final String placeholder;
    private final ImmutableList3<ApiSdOption> searchInputOptions;
    private final ApiSdOption selectedInput;
    private final String title;

    /* compiled from: SdSearchCitizenSelectorFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<SdSearchCitizenSelectorFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SdSearchCitizenSelectorFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ApiSdOption apiSdOption = (ApiSdOption) parcel.readParcelable(SdSearchCitizenSelectorFragmentKey.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(SdSearchCitizenSelectorFragmentKey.class.getClassLoader()));
            }
            return new SdSearchCitizenSelectorFragmentKey(string2, string3, apiSdOption, extensions2.toPersistentList(arrayList));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SdSearchCitizenSelectorFragmentKey[] newArray(int i) {
            return new SdSearchCitizenSelectorFragmentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SdSearchCitizenSelectorFragmentKey copy$default(SdSearchCitizenSelectorFragmentKey sdSearchCitizenSelectorFragmentKey, String str, String str2, ApiSdOption apiSdOption, ImmutableList3 immutableList3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdSearchCitizenSelectorFragmentKey.title;
        }
        if ((i & 2) != 0) {
            str2 = sdSearchCitizenSelectorFragmentKey.placeholder;
        }
        if ((i & 4) != 0) {
            apiSdOption = sdSearchCitizenSelectorFragmentKey.selectedInput;
        }
        if ((i & 8) != 0) {
            immutableList3 = sdSearchCitizenSelectorFragmentKey.searchInputOptions;
        }
        return sdSearchCitizenSelectorFragmentKey.copy(str, str2, apiSdOption, immutableList3);
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
    public final ApiSdOption getSelectedInput() {
        return this.selectedInput;
    }

    public final ImmutableList3<ApiSdOption> component4() {
        return this.searchInputOptions;
    }

    public final SdSearchCitizenSelectorFragmentKey copy(String title, String placeholder, ApiSdOption selectedInput, ImmutableList3<ApiSdOption> searchInputOptions) {
        Intrinsics.checkNotNullParameter(searchInputOptions, "searchInputOptions");
        return new SdSearchCitizenSelectorFragmentKey(title, placeholder, selectedInput, searchInputOptions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdSearchCitizenSelectorFragmentKey)) {
            return false;
        }
        SdSearchCitizenSelectorFragmentKey sdSearchCitizenSelectorFragmentKey = (SdSearchCitizenSelectorFragmentKey) other;
        return Intrinsics.areEqual(this.title, sdSearchCitizenSelectorFragmentKey.title) && Intrinsics.areEqual(this.placeholder, sdSearchCitizenSelectorFragmentKey.placeholder) && Intrinsics.areEqual(this.selectedInput, sdSearchCitizenSelectorFragmentKey.selectedInput) && Intrinsics.areEqual(this.searchInputOptions, sdSearchCitizenSelectorFragmentKey.searchInputOptions);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.placeholder;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ApiSdOption apiSdOption = this.selectedInput;
        return ((iHashCode2 + (apiSdOption != null ? apiSdOption.hashCode() : 0)) * 31) + this.searchInputOptions.hashCode();
    }

    public String toString() {
        return "SdSearchCitizenSelectorFragmentKey(title=" + this.title + ", placeholder=" + this.placeholder + ", selectedInput=" + this.selectedInput + ", searchInputOptions=" + this.searchInputOptions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.placeholder);
        dest.writeParcelable(this.selectedInput, flags);
        ImmutableList3<ApiSdOption> immutableList3 = this.searchInputOptions;
        dest.writeInt(immutableList3.size());
        Iterator<ApiSdOption> it = immutableList3.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    public SdSearchCitizenSelectorFragmentKey(String str, String str2, ApiSdOption apiSdOption, ImmutableList3<ApiSdOption> searchInputOptions) {
        Intrinsics.checkNotNullParameter(searchInputOptions, "searchInputOptions");
        this.title = str;
        this.placeholder = str2;
        this.selectedInput = apiSdOption;
        this.searchInputOptions = searchInputOptions;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final ApiSdOption getSelectedInput() {
        return this.selectedInput;
    }

    public final ImmutableList3<ApiSdOption> getSearchInputOptions() {
        return this.searchInputOptions;
    }
}

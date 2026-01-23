package com.salesforce.android.smi.network.data.domain.prechat.choicelist;

import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChoiceListConfiguration.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceListConfiguration;", "", "choiceList", "", "Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceList;", "choiceListValueDependencies", "Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceListValueDependency;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getChoiceList", "()Ljava/util/List;", "getChoiceListValueDependencies", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChoiceListConfiguration {
    private final List<ChoiceList> choiceList;
    private final List<ChoiceListValueDependency> choiceListValueDependencies;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChoiceListConfiguration copy$default(ChoiceListConfiguration choiceListConfiguration, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = choiceListConfiguration.choiceList;
        }
        if ((i & 2) != 0) {
            list2 = choiceListConfiguration.choiceListValueDependencies;
        }
        return choiceListConfiguration.copy(list, list2);
    }

    public final List<ChoiceList> component1() {
        return this.choiceList;
    }

    public final List<ChoiceListValueDependency> component2() {
        return this.choiceListValueDependencies;
    }

    public final ChoiceListConfiguration copy(List<ChoiceList> choiceList, List<ChoiceListValueDependency> choiceListValueDependencies) {
        Intrinsics.checkNotNullParameter(choiceList, "choiceList");
        Intrinsics.checkNotNullParameter(choiceListValueDependencies, "choiceListValueDependencies");
        return new ChoiceListConfiguration(choiceList, choiceListValueDependencies);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChoiceListConfiguration)) {
            return false;
        }
        ChoiceListConfiguration choiceListConfiguration = (ChoiceListConfiguration) other;
        return Intrinsics.areEqual(this.choiceList, choiceListConfiguration.choiceList) && Intrinsics.areEqual(this.choiceListValueDependencies, choiceListConfiguration.choiceListValueDependencies);
    }

    public int hashCode() {
        return (this.choiceList.hashCode() * 31) + this.choiceListValueDependencies.hashCode();
    }

    public String toString() {
        return "ChoiceListConfiguration(choiceList=" + this.choiceList + ", choiceListValueDependencies=" + this.choiceListValueDependencies + ")";
    }

    public ChoiceListConfiguration(List<ChoiceList> choiceList, List<ChoiceListValueDependency> choiceListValueDependencies) {
        Intrinsics.checkNotNullParameter(choiceList, "choiceList");
        Intrinsics.checkNotNullParameter(choiceListValueDependencies, "choiceListValueDependencies");
        this.choiceList = choiceList;
        this.choiceListValueDependencies = choiceListValueDependencies;
    }

    public final List<ChoiceList> getChoiceList() {
        return this.choiceList;
    }

    public final List<ChoiceListValueDependency> getChoiceListValueDependencies() {
        return this.choiceListValueDependencies;
    }
}

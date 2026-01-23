package com.salesforce.android.smi.network.data.domain.prechat.choicelist;

import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChoiceList.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceList;", "", "choiceListId", "", "choiceListValues", "", "Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceListValue;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getChoiceListId", "()Ljava/lang/String;", "getChoiceListValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChoiceList {
    private final String choiceListId;
    private final List<ChoiceListValue> choiceListValues;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChoiceList copy$default(ChoiceList choiceList, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = choiceList.choiceListId;
        }
        if ((i & 2) != 0) {
            list = choiceList.choiceListValues;
        }
        return choiceList.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChoiceListId() {
        return this.choiceListId;
    }

    public final List<ChoiceListValue> component2() {
        return this.choiceListValues;
    }

    public final ChoiceList copy(String choiceListId, List<ChoiceListValue> choiceListValues) {
        Intrinsics.checkNotNullParameter(choiceListId, "choiceListId");
        Intrinsics.checkNotNullParameter(choiceListValues, "choiceListValues");
        return new ChoiceList(choiceListId, choiceListValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChoiceList)) {
            return false;
        }
        ChoiceList choiceList = (ChoiceList) other;
        return Intrinsics.areEqual(this.choiceListId, choiceList.choiceListId) && Intrinsics.areEqual(this.choiceListValues, choiceList.choiceListValues);
    }

    public int hashCode() {
        return (this.choiceListId.hashCode() * 31) + this.choiceListValues.hashCode();
    }

    public String toString() {
        return "ChoiceList(choiceListId=" + this.choiceListId + ", choiceListValues=" + this.choiceListValues + ")";
    }

    public ChoiceList(String choiceListId, List<ChoiceListValue> choiceListValues) {
        Intrinsics.checkNotNullParameter(choiceListId, "choiceListId");
        Intrinsics.checkNotNullParameter(choiceListValues, "choiceListValues");
        this.choiceListId = choiceListId;
        this.choiceListValues = choiceListValues;
    }

    public final String getChoiceListId() {
        return this.choiceListId;
    }

    public /* synthetic */ ChoiceList(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<ChoiceListValue> getChoiceListValues() {
        return this.choiceListValues;
    }
}

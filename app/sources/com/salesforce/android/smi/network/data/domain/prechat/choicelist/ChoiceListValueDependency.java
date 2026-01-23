package com.salesforce.android.smi.network.data.domain.prechat.choicelist;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChoiceListValueDependency.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceListValueDependency;", "", "parentChoiceListValueId", "", "childChoiceListValueId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getParentChoiceListValueId", "()Ljava/lang/String;", "getChildChoiceListValueId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChoiceListValueDependency {
    private final String childChoiceListValueId;
    private final String parentChoiceListValueId;

    public static /* synthetic */ ChoiceListValueDependency copy$default(ChoiceListValueDependency choiceListValueDependency, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = choiceListValueDependency.parentChoiceListValueId;
        }
        if ((i & 2) != 0) {
            str2 = choiceListValueDependency.childChoiceListValueId;
        }
        return choiceListValueDependency.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getParentChoiceListValueId() {
        return this.parentChoiceListValueId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChildChoiceListValueId() {
        return this.childChoiceListValueId;
    }

    public final ChoiceListValueDependency copy(String parentChoiceListValueId, String childChoiceListValueId) {
        Intrinsics.checkNotNullParameter(parentChoiceListValueId, "parentChoiceListValueId");
        Intrinsics.checkNotNullParameter(childChoiceListValueId, "childChoiceListValueId");
        return new ChoiceListValueDependency(parentChoiceListValueId, childChoiceListValueId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChoiceListValueDependency)) {
            return false;
        }
        ChoiceListValueDependency choiceListValueDependency = (ChoiceListValueDependency) other;
        return Intrinsics.areEqual(this.parentChoiceListValueId, choiceListValueDependency.parentChoiceListValueId) && Intrinsics.areEqual(this.childChoiceListValueId, choiceListValueDependency.childChoiceListValueId);
    }

    public int hashCode() {
        return (this.parentChoiceListValueId.hashCode() * 31) + this.childChoiceListValueId.hashCode();
    }

    public String toString() {
        return "ChoiceListValueDependency(parentChoiceListValueId=" + this.parentChoiceListValueId + ", childChoiceListValueId=" + this.childChoiceListValueId + ")";
    }

    public ChoiceListValueDependency(String parentChoiceListValueId, String childChoiceListValueId) {
        Intrinsics.checkNotNullParameter(parentChoiceListValueId, "parentChoiceListValueId");
        Intrinsics.checkNotNullParameter(childChoiceListValueId, "childChoiceListValueId");
        this.parentChoiceListValueId = parentChoiceListValueId;
        this.childChoiceListValueId = childChoiceListValueId;
    }

    public final String getParentChoiceListValueId() {
        return this.parentChoiceListValueId;
    }

    public final String getChildChoiceListValueId() {
        return this.childChoiceListValueId;
    }
}

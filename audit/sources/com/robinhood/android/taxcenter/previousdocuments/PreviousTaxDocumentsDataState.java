package com.robinhood.android.taxcenter.previousdocuments;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreviousTaxDocumentsDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\"\b\u0002\u0010\u0002\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\"\b\u0002\u0010\u0002\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R+\u0010\u0002\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsDataState;", "", "allContent", "", "", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "selectedYear", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "getAllContent", "()Ljava/util/Map;", "getSelectedYear", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PreviousTaxDocumentsDataState {
    public static final int $stable = 8;
    private final Map<String, List<UIComponent<GenericAction>>> allContent;
    private final String selectedYear;

    /* JADX WARN: Multi-variable type inference failed */
    public PreviousTaxDocumentsDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreviousTaxDocumentsDataState copy$default(PreviousTaxDocumentsDataState previousTaxDocumentsDataState, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = previousTaxDocumentsDataState.allContent;
        }
        if ((i & 2) != 0) {
            str = previousTaxDocumentsDataState.selectedYear;
        }
        return previousTaxDocumentsDataState.copy(map, str);
    }

    public final Map<String, List<UIComponent<GenericAction>>> component1() {
        return this.allContent;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedYear() {
        return this.selectedYear;
    }

    public final PreviousTaxDocumentsDataState copy(Map<String, ? extends List<? extends UIComponent<? extends GenericAction>>> allContent, String selectedYear) {
        return new PreviousTaxDocumentsDataState(allContent, selectedYear);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviousTaxDocumentsDataState)) {
            return false;
        }
        PreviousTaxDocumentsDataState previousTaxDocumentsDataState = (PreviousTaxDocumentsDataState) other;
        return Intrinsics.areEqual(this.allContent, previousTaxDocumentsDataState.allContent) && Intrinsics.areEqual(this.selectedYear, previousTaxDocumentsDataState.selectedYear);
    }

    public int hashCode() {
        Map<String, List<UIComponent<GenericAction>>> map = this.allContent;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.selectedYear;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PreviousTaxDocumentsDataState(allContent=" + this.allContent + ", selectedYear=" + this.selectedYear + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreviousTaxDocumentsDataState(Map<String, ? extends List<? extends UIComponent<? extends GenericAction>>> map, String str) {
        this.allContent = map;
        this.selectedYear = str;
    }

    public /* synthetic */ PreviousTaxDocumentsDataState(Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : str);
    }

    public final Map<String, List<UIComponent<GenericAction>>> getAllContent() {
        return this.allContent;
    }

    public final String getSelectedYear() {
        return this.selectedYear;
    }
}

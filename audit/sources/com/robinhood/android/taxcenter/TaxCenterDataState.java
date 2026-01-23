package com.robinhood.android.taxcenter;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxCenterDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0010\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0006\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/TaxCenterDataState;", "", "content", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isTaxCenterFeatureEnabled", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getContent", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/robinhood/android/taxcenter/TaxCenterDataState;", "equals", "other", "hashCode", "", "toString", "", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TaxCenterDataState {
    public static final int $stable = 8;
    private final List<UIComponent<GenericAction>> content;
    private final Boolean isTaxCenterFeatureEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public TaxCenterDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxCenterDataState copy$default(TaxCenterDataState taxCenterDataState, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = taxCenterDataState.content;
        }
        if ((i & 2) != 0) {
            bool = taxCenterDataState.isTaxCenterFeatureEnabled;
        }
        return taxCenterDataState.copy(list, bool);
    }

    public final List<UIComponent<GenericAction>> component1() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsTaxCenterFeatureEnabled() {
        return this.isTaxCenterFeatureEnabled;
    }

    public final TaxCenterDataState copy(List<? extends UIComponent<? extends GenericAction>> content, Boolean isTaxCenterFeatureEnabled) {
        return new TaxCenterDataState(content, isTaxCenterFeatureEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxCenterDataState)) {
            return false;
        }
        TaxCenterDataState taxCenterDataState = (TaxCenterDataState) other;
        return Intrinsics.areEqual(this.content, taxCenterDataState.content) && Intrinsics.areEqual(this.isTaxCenterFeatureEnabled, taxCenterDataState.isTaxCenterFeatureEnabled);
    }

    public int hashCode() {
        List<UIComponent<GenericAction>> list = this.content;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.isTaxCenterFeatureEnabled;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "TaxCenterDataState(content=" + this.content + ", isTaxCenterFeatureEnabled=" + this.isTaxCenterFeatureEnabled + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaxCenterDataState(List<? extends UIComponent<? extends GenericAction>> list, Boolean bool) {
        this.content = list;
        this.isTaxCenterFeatureEnabled = bool;
    }

    public /* synthetic */ TaxCenterDataState(List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool);
    }

    public final List<UIComponent<GenericAction>> getContent() {
        return this.content;
    }

    public final Boolean isTaxCenterFeatureEnabled() {
        return this.isTaxCenterFeatureEnabled;
    }
}

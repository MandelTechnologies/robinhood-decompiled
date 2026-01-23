package com.robinhood.android.alldaytrading.infosheet.instrumentinfo;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdtInstrumentInfoViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoViewState;", "", "sduiComponents", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Ljava/util/List;)V", "getSduiComponents", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-all-day-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdtInstrumentInfoViewState {
    public static final int $stable = 8;
    private final List<UIComponent<GenericAction>> sduiComponents;

    /* JADX WARN: Multi-variable type inference failed */
    public AdtInstrumentInfoViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdtInstrumentInfoViewState copy$default(AdtInstrumentInfoViewState adtInstrumentInfoViewState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = adtInstrumentInfoViewState.sduiComponents;
        }
        return adtInstrumentInfoViewState.copy(list);
    }

    public final List<UIComponent<GenericAction>> component1() {
        return this.sduiComponents;
    }

    public final AdtInstrumentInfoViewState copy(List<? extends UIComponent<? extends GenericAction>> sduiComponents) {
        Intrinsics.checkNotNullParameter(sduiComponents, "sduiComponents");
        return new AdtInstrumentInfoViewState(sduiComponents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AdtInstrumentInfoViewState) && Intrinsics.areEqual(this.sduiComponents, ((AdtInstrumentInfoViewState) other).sduiComponents);
    }

    public int hashCode() {
        return this.sduiComponents.hashCode();
    }

    public String toString() {
        return "AdtInstrumentInfoViewState(sduiComponents=" + this.sduiComponents + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdtInstrumentInfoViewState(List<? extends UIComponent<? extends GenericAction>> sduiComponents) {
        Intrinsics.checkNotNullParameter(sduiComponents, "sduiComponents");
        this.sduiComponents = sduiComponents;
    }

    public /* synthetic */ AdtInstrumentInfoViewState(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<UIComponent<GenericAction>> getSduiComponents() {
        return this.sduiComponents;
    }
}

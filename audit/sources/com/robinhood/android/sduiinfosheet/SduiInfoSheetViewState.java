package com.robinhood.android.sduiinfosheet;

import com.robinhood.models.api.ApiSduiInfoSheetResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiInfoSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/sduiinfosheet/SduiInfoSheetViewState;", "", "response", "Lcom/robinhood/models/api/ApiSduiInfoSheetResponse;", "<init>", "(Lcom/robinhood/models/api/ApiSduiInfoSheetResponse;)V", "getResponse", "()Lcom/robinhood/models/api/ApiSduiInfoSheetResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-sdui-info-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SduiInfoSheetViewState {
    public static final int $stable = 8;
    private final ApiSduiInfoSheetResponse response;

    /* JADX WARN: Multi-variable type inference failed */
    public SduiInfoSheetViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SduiInfoSheetViewState copy$default(SduiInfoSheetViewState sduiInfoSheetViewState, ApiSduiInfoSheetResponse apiSduiInfoSheetResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            apiSduiInfoSheetResponse = sduiInfoSheetViewState.response;
        }
        return sduiInfoSheetViewState.copy(apiSduiInfoSheetResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiSduiInfoSheetResponse getResponse() {
        return this.response;
    }

    public final SduiInfoSheetViewState copy(ApiSduiInfoSheetResponse response) {
        return new SduiInfoSheetViewState(response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SduiInfoSheetViewState) && Intrinsics.areEqual(this.response, ((SduiInfoSheetViewState) other).response);
    }

    public int hashCode() {
        ApiSduiInfoSheetResponse apiSduiInfoSheetResponse = this.response;
        if (apiSduiInfoSheetResponse == null) {
            return 0;
        }
        return apiSduiInfoSheetResponse.hashCode();
    }

    public String toString() {
        return "SduiInfoSheetViewState(response=" + this.response + ")";
    }

    public SduiInfoSheetViewState(ApiSduiInfoSheetResponse apiSduiInfoSheetResponse) {
        this.response = apiSduiInfoSheetResponse;
    }

    public /* synthetic */ SduiInfoSheetViewState(ApiSduiInfoSheetResponse apiSduiInfoSheetResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiSduiInfoSheetResponse);
    }

    public final ApiSduiInfoSheetResponse getResponse() {
        return this.response;
    }
}

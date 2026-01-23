package com.robinhood.shared.equities.subzero;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiEquitySsr.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/equities/subzero/ApiEquitySsrData;", "", "instrument_id", "", "ssr_on", "", "<init>", "(Ljava/lang/String;Z)V", "getInstrument_id", "()Ljava/lang/String;", "getSsr_on", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "lib-equity-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ApiEquitySsrData {
    private final String instrument_id;
    private final boolean ssr_on;

    public static /* synthetic */ ApiEquitySsrData copy$default(ApiEquitySsrData apiEquitySsrData, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiEquitySsrData.instrument_id;
        }
        if ((i & 2) != 0) {
            z = apiEquitySsrData.ssr_on;
        }
        return apiEquitySsrData.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInstrument_id() {
        return this.instrument_id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSsr_on() {
        return this.ssr_on;
    }

    public final ApiEquitySsrData copy(String instrument_id, boolean ssr_on) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        return new ApiEquitySsrData(instrument_id, ssr_on);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiEquitySsrData)) {
            return false;
        }
        ApiEquitySsrData apiEquitySsrData = (ApiEquitySsrData) other;
        return Intrinsics.areEqual(this.instrument_id, apiEquitySsrData.instrument_id) && this.ssr_on == apiEquitySsrData.ssr_on;
    }

    public int hashCode() {
        return (this.instrument_id.hashCode() * 31) + Boolean.hashCode(this.ssr_on);
    }

    public String toString() {
        return "ApiEquitySsrData(instrument_id=" + this.instrument_id + ", ssr_on=" + this.ssr_on + ")";
    }

    public ApiEquitySsrData(String instrument_id, boolean z) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        this.instrument_id = instrument_id;
        this.ssr_on = z;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final boolean getSsr_on() {
        return this.ssr_on;
    }
}

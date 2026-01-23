package com.robinhood.lib.sweep.enrollment.api;

import com.robinhood.lib.sweep.enrollment.SweepEnrollmentAction;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiSweepEnrollmentRequestBody.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollmentRequestBody;", "", "sweepEnrollmentAction", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentAction;", "<init>", "(Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentAction;)V", "getSweepEnrollmentAction", "()Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentAction;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-sweep-enrollment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class ApiSweepEnrollmentRequestBody {
    private final SweepEnrollmentAction sweepEnrollmentAction;

    public static /* synthetic */ ApiSweepEnrollmentRequestBody copy$default(ApiSweepEnrollmentRequestBody apiSweepEnrollmentRequestBody, SweepEnrollmentAction sweepEnrollmentAction, int i, Object obj) {
        if ((i & 1) != 0) {
            sweepEnrollmentAction = apiSweepEnrollmentRequestBody.sweepEnrollmentAction;
        }
        return apiSweepEnrollmentRequestBody.copy(sweepEnrollmentAction);
    }

    /* renamed from: component1, reason: from getter */
    public final SweepEnrollmentAction getSweepEnrollmentAction() {
        return this.sweepEnrollmentAction;
    }

    public final ApiSweepEnrollmentRequestBody copy(@Json(name = "sweep_enrollment_action") SweepEnrollmentAction sweepEnrollmentAction) {
        Intrinsics.checkNotNullParameter(sweepEnrollmentAction, "sweepEnrollmentAction");
        return new ApiSweepEnrollmentRequestBody(sweepEnrollmentAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApiSweepEnrollmentRequestBody) && this.sweepEnrollmentAction == ((ApiSweepEnrollmentRequestBody) other).sweepEnrollmentAction;
    }

    public int hashCode() {
        return this.sweepEnrollmentAction.hashCode();
    }

    public String toString() {
        return "ApiSweepEnrollmentRequestBody(sweepEnrollmentAction=" + this.sweepEnrollmentAction + ")";
    }

    public ApiSweepEnrollmentRequestBody(@Json(name = "sweep_enrollment_action") SweepEnrollmentAction sweepEnrollmentAction) {
        Intrinsics.checkNotNullParameter(sweepEnrollmentAction, "sweepEnrollmentAction");
        this.sweepEnrollmentAction = sweepEnrollmentAction;
    }

    public final SweepEnrollmentAction getSweepEnrollmentAction() {
        return this.sweepEnrollmentAction;
    }
}

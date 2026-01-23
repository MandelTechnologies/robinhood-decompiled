package com.google.android.gms.common.internal;

import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes27.dex */
public interface TelemetryLoggingClient {
    @ResultIgnorabilityUnspecified
    Task<Void> log(TelemetryData telemetryData);
}

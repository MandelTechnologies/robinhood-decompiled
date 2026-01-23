package microgram.annotation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManagedServices.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"clientTargetName", "", "Lmicrogram/annotation/Contract;", "getClientTargetName", "(Lmicrogram/annotation/Contract;)Ljava/lang/String;", "implementationTargetName", "getImplementationTargetName", "microgram-annotations"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: microgram.annotation.ManagedServicesKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ManagedServices2 {
    public static final String getClientTargetName(ManagedServices managedServices) {
        Intrinsics.checkNotNullParameter(managedServices, "<this>");
        return managedServices.serviceName() + "#client";
    }

    public static final String getImplementationTargetName(ManagedServices managedServices) {
        Intrinsics.checkNotNullParameter(managedServices, "<this>");
        return managedServices.serviceName() + "#implementation";
    }
}

package com.robinhood.android.transfers.p271ui.max.wires;

import com.robinhood.android.microgramsdui.MicrogramManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.MicrogramLaunchId;
import microgram.android.MicrogramSource;
import microgram.android.service.ServiceLocator;

/* compiled from: MicrogramManagerHelpers.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\b¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"getWireService", "ServiceType", "", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "microgramSource", "Lmicrogram/android/MicrogramSource;", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lkotlinx/coroutines/CoroutineScope;Lmicrogram/android/MicrogramSource;)Ljava/lang/Object;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.wires.MicrogramManagerHelpersKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class MicrogramManagerHelpers {
    public static final /* synthetic */ <ServiceType> ServiceType getWireService(MicrogramManager microgramManager, CoroutineScope scope, MicrogramSource microgramSource) {
        Intrinsics.checkNotNullParameter(microgramManager, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(microgramSource, "microgramSource");
        ServiceLocator serviceLocator = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, scope, new MicrogramLaunchId(microgramSource, null, 2, null), null, 4, null).getComponent().getServiceLocator();
        Intrinsics.reifiedOperationMarker(4, "ServiceType");
        return (ServiceType) serviceLocator.getHostImplementation(Object.class);
    }
}

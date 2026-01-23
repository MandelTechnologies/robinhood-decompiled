package com.robinhood.microgram.haptic;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: HapticManager.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/microgram/haptic/MicrogramHapticManager;", "", "perform", "", "haptic", "Lcom/robinhood/microgram/haptic/HapticType;", "(Lcom/robinhood/microgram/haptic/HapticType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "mg.ui.haptic")
/* renamed from: com.robinhood.microgram.haptic.MicrogramHapticManager, reason: use source file name */
/* loaded from: classes13.dex */
public interface HapticManager {
    Object perform(HapticType hapticType, Continuation<? super Unit> continuation);
}

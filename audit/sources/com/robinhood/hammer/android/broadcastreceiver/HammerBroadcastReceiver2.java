package com.robinhood.hammer.android.broadcastreceiver;

import android.content.BroadcastReceiver;
import com.robinhood.hammer.core.internal.DynamicInjector;
import com.robinhood.hammer.core.internal.InternalHammerApi;
import kotlin.Metadata;

/* compiled from: HammerBroadcastReceiver.kt */
@InternalHammerApi
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/hammer/android/broadcastreceiver/HammerBroadcastReceiverComponent;", "", "broadcastReceiverInjector", "Lcom/robinhood/hammer/core/internal/DynamicInjector;", "Landroid/content/BroadcastReceiver;", "getBroadcastReceiverInjector", "()Lcom/robinhood/hammer/core/internal/DynamicInjector;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.hammer.android.broadcastreceiver.HammerBroadcastReceiverComponent, reason: use source file name */
/* loaded from: classes20.dex */
public interface HammerBroadcastReceiver2 {
    DynamicInjector<BroadcastReceiver> getBroadcastReceiverInjector();
}

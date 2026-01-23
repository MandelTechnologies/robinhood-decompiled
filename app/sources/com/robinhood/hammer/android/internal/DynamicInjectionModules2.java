package com.robinhood.hammer.android.internal;

import android.content.BroadcastReceiver;
import com.robinhood.hammer.core.internal.DynamicInjector;
import com.robinhood.hammer.core.internal.DynamicInjector2;
import com.robinhood.hammer.core.internal.InternalHammerApi;
import dagger.MembersInjector;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicInjectionModules.kt */
@InternalHammerApi
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001f\u0010\u0007\u001a\u001b\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\n0\b¢\u0006\u0002\b\u000bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/hammer/android/internal/AppDynamicInjectionModule;", "", "<init>", "()V", "provideDynamicBroadcastReceiverInjector", "Lcom/robinhood/hammer/core/internal/DynamicInjector;", "Landroid/content/BroadcastReceiver;", "injectors", "", "", "Ldagger/MembersInjector;", "Lkotlin/jvm/JvmSuppressWildcards;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.hammer.android.internal.AppDynamicInjectionModule, reason: use source file name */
/* loaded from: classes15.dex */
public final class DynamicInjectionModules2 {
    public static final DynamicInjectionModules2 INSTANCE = new DynamicInjectionModules2();

    private DynamicInjectionModules2() {
    }

    public final DynamicInjector<BroadcastReceiver> provideDynamicBroadcastReceiverInjector(Map<String, MembersInjector<? extends BroadcastReceiver>> injectors) {
        Intrinsics.checkNotNullParameter(injectors, "injectors");
        return new DynamicInjector2(injectors);
    }
}

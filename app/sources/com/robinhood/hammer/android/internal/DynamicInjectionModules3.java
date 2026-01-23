package com.robinhood.hammer.android.internal;

import androidx.fragment.app.Fragment;
import com.robinhood.hammer.core.internal.DynamicInjector;
import com.robinhood.hammer.core.internal.DynamicInjector2;
import com.robinhood.hammer.core.internal.InternalHammerApi;
import dagger.MembersInjector;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicInjectionModules.kt */
@InternalHammerApi
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001f\u0010\u0007\u001a\u001b\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\n0\b¢\u0006\u0002\b\u000bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/hammer/android/internal/FragmentDynamicInjectionModule;", "", "<init>", "()V", "provideDynamicFragmentInjector", "Lcom/robinhood/hammer/core/internal/DynamicInjector;", "Landroidx/fragment/app/Fragment;", "injectors", "", "", "Ldagger/MembersInjector;", "Lkotlin/jvm/JvmSuppressWildcards;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.hammer.android.internal.FragmentDynamicInjectionModule, reason: use source file name */
/* loaded from: classes20.dex */
public final class DynamicInjectionModules3 {
    public static final DynamicInjectionModules3 INSTANCE = new DynamicInjectionModules3();

    private DynamicInjectionModules3() {
    }

    public final DynamicInjector<Fragment> provideDynamicFragmentInjector(Map<String, MembersInjector<? extends Fragment>> injectors) {
        Intrinsics.checkNotNullParameter(injectors, "injectors");
        return new DynamicInjector2(injectors);
    }
}

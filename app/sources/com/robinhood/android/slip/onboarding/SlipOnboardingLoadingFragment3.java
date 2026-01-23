package com.robinhood.android.slip.onboarding;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipOnboardingLoadingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.SlipOnboardingLoadingFragment$sam$com_robinhood_android_libdesignsystem_serverui_experimental_compose_ActionHandler$0, reason: use source file name */
/* loaded from: classes5.dex */
final class SlipOnboardingLoadingFragment3 implements SduiActionHandler, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    SlipOnboardingLoadingFragment3(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof SduiActionHandler) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle */
    public final /* synthetic */ boolean mo15941handle(Object obj) {
        return ((Boolean) this.function.invoke(obj)).booleanValue();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}

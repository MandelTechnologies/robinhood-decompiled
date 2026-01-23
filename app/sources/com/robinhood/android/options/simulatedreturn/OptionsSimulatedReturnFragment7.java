package com.robinhood.android.options.simulatedreturn;

import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnFragment$ComposeContent$7$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionsSimulatedReturnFragment7 extends FunctionReferenceImpl implements Function1<FragmentKey, Unit> {
    OptionsSimulatedReturnFragment7(Object obj) {
        super(1, obj, OptionsSimulatedReturnFragment.class, "onToolbarMenuItemTapped", "onToolbarMenuItemTapped(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentKey fragmentKey) {
        invoke2(fragmentKey);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FragmentKey p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionsSimulatedReturnFragment) this.receiver).onToolbarMenuItemTapped(p0);
    }
}

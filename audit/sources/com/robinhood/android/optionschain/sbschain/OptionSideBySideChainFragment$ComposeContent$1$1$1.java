package com.robinhood.android.optionschain.sbschain;

import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionSideBySideChainFragment$ComposeContent$1$1$1 extends FunctionReferenceImpl implements Function1<FragmentKey, Unit> {
    OptionSideBySideChainFragment$ComposeContent$1$1$1(Object obj) {
        super(1, obj, OptionSideBySideChainFragment.class, "openChainSettings", "openChainSettings(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentKey fragmentKey) {
        invoke2(fragmentKey);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FragmentKey p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionSideBySideChainFragment) this.receiver).openChainSettings(p0);
    }
}

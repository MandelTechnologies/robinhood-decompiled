package com.robinhood.android.options.p208ui.detail;

import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionsDetailPageFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$13$1 extends FunctionReferenceImpl implements Function2<FragmentKey, Boolean, Unit> {
    OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$13$1(Object obj) {
        super(2, obj, OptionsDetailPageFragment.class, "showFragment", "showFragment(Lcom/robinhood/android/navigation/keys/FragmentKey;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FragmentKey fragmentKey, Boolean bool) {
        invoke(fragmentKey, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(FragmentKey fragmentKey, boolean z) {
        ((OptionsDetailPageFragment) this.receiver).showFragment(fragmentKey, z);
    }
}

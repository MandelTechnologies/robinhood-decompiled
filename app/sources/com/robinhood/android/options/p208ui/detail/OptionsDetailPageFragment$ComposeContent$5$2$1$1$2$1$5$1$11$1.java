package com.robinhood.android.options.p208ui.detail;

import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionsDetailPageFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$11$1 extends FunctionReferenceImpl implements Function1<FragmentKey, Unit> {
    OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$11$1(Object obj) {
        super(1, obj, OptionsDetailPageFragment.class, "onShowAllHistoryClicked", "onShowAllHistoryClicked(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentKey fragmentKey) {
        invoke2(fragmentKey);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FragmentKey fragmentKey) {
        ((OptionsDetailPageFragment) this.receiver).onShowAllHistoryClicked(fragmentKey);
    }
}

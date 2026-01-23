package com.robinhood.android.options.p208ui.detail;

import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionsDetailPageFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$12$1 extends FunctionReferenceImpl implements Function1<IntentKey, Unit> {
    OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$12$1(Object obj) {
        super(1, obj, OptionsDetailPageFragment.class, "startActivity", "startActivity(Lcom/robinhood/android/navigation/keys/IntentKey;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntentKey intentKey) {
        invoke2(intentKey);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IntentKey intentKey) {
        ((OptionsDetailPageFragment) this.receiver).startActivity(intentKey);
    }
}

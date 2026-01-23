package com.robinhood.android.recommendations.lib.p221ui.recurringhook.intro;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RecommendationsRecurringHookIntroFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.lib.ui.recurringhook.intro.RecommendationsRecurringHookIntroFragment$ComposeContent$1$1$1$2$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsRecurringHookIntroFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    RecommendationsRecurringHookIntroFragment3(Object obj) {
        super(0, obj, FragmentActivity.class, "finish", "finish()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FragmentActivity) this.receiver).finish();
    }
}

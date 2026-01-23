package com.robinhood.android.advisory.onboarding.marketing;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StrategiesValuePropsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsFragment$ComposeContent$1$3$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class StrategiesValuePropsFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    StrategiesValuePropsFragment2(Object obj) {
        super(0, obj, StrategiesValuePropsDuxo.class, AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "retry()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((StrategiesValuePropsDuxo) this.receiver).retry();
    }
}

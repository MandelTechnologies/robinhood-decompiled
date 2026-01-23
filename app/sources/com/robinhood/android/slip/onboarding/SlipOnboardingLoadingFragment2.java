package com.robinhood.android.slip.onboarding;

import com.robinhood.models.serverdriven.experimental.api.DeeplinkOrDismissAction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipOnboardingLoadingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.SlipOnboardingLoadingFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SlipOnboardingLoadingFragment2 extends FunctionReferenceImpl implements Function1<DeeplinkOrDismissAction, Boolean> {
    SlipOnboardingLoadingFragment2(Object obj) {
        super(1, obj, SlipOnboardingLoadingFragment.class, "handleAction", "handleAction(Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkOrDismissAction;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(DeeplinkOrDismissAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(((SlipOnboardingLoadingFragment) this.receiver).handleAction(p0));
    }
}

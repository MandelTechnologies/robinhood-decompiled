package com.robinhood.android.slip.onboarding.hub;

import com.robinhood.android.slip.onboarding.hub.SlipHubFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SlipHubFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubFragment$ComposeContent$2$2$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SlipHubFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    SlipHubFragment3(Object obj) {
        super(0, obj, SlipHubFragment.Callbacks.class, "onSettingsTap", "onSettingsTap()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SlipHubFragment.Callbacks) this.receiver).onSettingsTap();
    }
}

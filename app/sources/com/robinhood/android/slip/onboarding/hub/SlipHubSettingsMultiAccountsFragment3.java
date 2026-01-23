package com.robinhood.android.slip.onboarding.hub;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipHubSettingsMultiAccountsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SlipHubSettingsMultiAccountsFragment3 extends FunctionReferenceImpl implements Function2<String, Boolean, Unit> {
    SlipHubSettingsMultiAccountsFragment3(Object obj) {
        super(2, obj, SlipHubSettingsMultiAccountsDuxo.class, "setAccountStatus", "setAccountStatus(Ljava/lang/String;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
        invoke(str, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(String p0, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((SlipHubSettingsMultiAccountsDuxo) this.receiver).setAccountStatus(p0, z);
    }
}

package com.robinhood.android.advanced.alert.alerthubsettings;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertHubSettingsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AlertHubSettingsFragment2 extends FunctionReferenceImpl implements Function1<Intent, Unit> {
    AlertHubSettingsFragment2(Object obj) {
        super(1, obj, AlertHubSettingsFragment.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
        invoke2(intent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Intent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AlertHubSettingsFragment) this.receiver).startActivity(p0);
    }
}

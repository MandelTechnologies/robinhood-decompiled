package com.robinhood.android.gdpr.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PrivacySettingsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class PrivacySettingsFragmentKt$BottomBar$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    PrivacySettingsFragmentKt$BottomBar$1$2$1(Object obj) {
        super(0, obj, PrivacySettingsFragmentDuxo.class, "onSaveAndContinueButtonTapped", "onSaveAndContinueButtonTapped()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PrivacySettingsFragmentDuxo) this.receiver).onSaveAndContinueButtonTapped();
    }
}

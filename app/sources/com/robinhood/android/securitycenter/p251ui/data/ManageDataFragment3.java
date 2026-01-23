package com.robinhood.android.securitycenter.p251ui.data;

import com.robinhood.android.securitycenter.p251ui.data.ManageDataFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ManageDataFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.data.ManageDataFragmentKt$ManageDataComposable$1$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class ManageDataFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    ManageDataFragment3(Object obj) {
        super(0, obj, ManageDataFragment.Callbacks.class, "onGdprSettingClicked", "onGdprSettingClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ManageDataFragment.Callbacks) this.receiver).onGdprSettingClicked();
    }
}

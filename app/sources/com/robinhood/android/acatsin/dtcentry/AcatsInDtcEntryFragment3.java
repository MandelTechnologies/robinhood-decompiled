package com.robinhood.android.acatsin.dtcentry;

import android.view.KeyEvent;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInDtcEntryFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryFragment$onViewCreated$3$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInDtcEntryFragment3 extends AdaptedFunctionReference implements Function1<KeyEvent, Unit> {
    AcatsInDtcEntryFragment3(Object obj) {
        super(1, obj, RdsTextInputEditText.class, "dispatchKeyEvent", "dispatchKeyEvent(Landroid/view/KeyEvent;)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
        invoke2(keyEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeyEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((RdsTextInputEditText) this.receiver).dispatchKeyEvent(p0);
    }
}

package com.robinhood.android.acatsin.partials.equity;

import android.view.KeyEvent;
import com.robinhood.android.common.p088ui.view.RhEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: AcatsInPartialEquityAssetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$onViewCreated$3$5, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInPartialEquityAssetFragment3 extends AdaptedFunctionReference implements Function1<KeyEvent, Unit> {
    AcatsInPartialEquityAssetFragment3(Object obj) {
        super(1, obj, RhEditText.class, "dispatchKeyEvent", "dispatchKeyEvent(Landroid/view/KeyEvent;)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
        invoke2(keyEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeyEvent keyEvent) {
        ((RhEditText) this.receiver).dispatchKeyEvent(keyEvent);
    }
}

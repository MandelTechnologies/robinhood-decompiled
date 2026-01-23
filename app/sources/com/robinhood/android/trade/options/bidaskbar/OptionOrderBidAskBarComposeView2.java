package com.robinhood.android.trade.options.bidaskbar;

import com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionOrderBidAskBarComposeView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposeView$Content$1$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class OptionOrderBidAskBarComposeView2 extends FunctionReferenceImpl implements Function1<Float, Unit> {
    OptionOrderBidAskBarComposeView2(Object obj) {
        super(1, obj, OptionOrderBidAskBarComposeView.Callbacks.class, "onCanvasWidthUpdated", "onCanvasWidthUpdated(F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        ((OptionOrderBidAskBarComposeView.Callbacks) this.receiver).onCanvasWidthUpdated(f);
    }
}

package com.robinhood.android.engagement.goldevent.p115ui;

import com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LiveEventStreamComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$LiveEventVideoStreamComposable$isInPipMode$1$1 */
/* loaded from: classes7.dex */
/* synthetic */ class C14574xd1a5c3bb extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    C14574xd1a5c3bb(Object obj) {
        super(1, obj, LiveEventStreamDuxo.class, "onPipModeChanged", "onPipModeChanged(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((LiveEventStreamDuxo) this.receiver).onPipModeChanged(z);
    }
}

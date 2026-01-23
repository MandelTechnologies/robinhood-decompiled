package com.robinhood.android.microgramsdui;

import com.robinhood.microgram.sdui.MicrogramAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrogramEmbeddedSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt$MicrogramEmbeddedSection$2$1$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MicrogramEmbeddedSection4 extends FunctionReferenceImpl implements Function1<MicrogramAction, Unit> {
    MicrogramEmbeddedSection4(Object obj) {
        super(1, obj, EmbeddedSectionDuxo.class, "onAction", "onAction(Lcom/robinhood/microgram/sdui/MicrogramAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MicrogramAction microgramAction) {
        invoke2(microgramAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MicrogramAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EmbeddedSectionDuxo) this.receiver).onAction(p0);
    }
}

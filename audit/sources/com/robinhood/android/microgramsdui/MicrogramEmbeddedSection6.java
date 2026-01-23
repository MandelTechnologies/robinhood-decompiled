package com.robinhood.android.microgramsdui;

import com.robinhood.microgram.sdui.MicrogramAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrogramEmbeddedSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt$MicrogramEmbeddedSection$4$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MicrogramEmbeddedSection6 extends FunctionReferenceImpl implements Function2<String, MicrogramAction, Unit> {
    MicrogramEmbeddedSection6(Object obj) {
        super(2, obj, EmbeddedSectionDuxo.class, "onToastAction", "onToastAction(Ljava/lang/String;Lcom/robinhood/microgram/sdui/MicrogramAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, MicrogramAction microgramAction) {
        invoke2(str, microgramAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, MicrogramAction p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((EmbeddedSectionDuxo) this.receiver).onToastAction(p0, p1);
    }
}

package com.robinhood.android.acatsin.dtcentry;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInDtcEntryFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryFragment$onViewCreated$3$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInDtcEntryFragment4 extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
    AcatsInDtcEntryFragment4(Object obj) {
        super(1, obj, AcatsInDtcEntryDuxo.class, "onTextUpdated", "onTextUpdated(Ljava/lang/CharSequence;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AcatsInDtcEntryDuxo) this.receiver).onTextUpdated(p0);
    }
}

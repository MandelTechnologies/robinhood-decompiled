package com.robinhood.android.feature.linking;

import com.robinhood.android.linking.MobileLinkingData2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MobileLinkingErrorFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.linking.MobileLinkingErrorFragment$ComposeContent$1$1$1$1$2$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class MobileLinkingErrorFragment6 extends FunctionReferenceImpl implements Function0<Unit> {
    MobileLinkingErrorFragment6(Object obj) {
        super(0, obj, MobileLinkingData2.class, "openSelectGroupSheet", "openSelectGroupSheet()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MobileLinkingData2) this.receiver).openSelectGroupSheet();
    }
}

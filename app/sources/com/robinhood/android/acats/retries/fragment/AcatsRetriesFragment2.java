package com.robinhood.android.acats.retries.fragment;

import com.robinhood.android.acats.retries.fragment.AcatsRetriesFragmentContract;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsRetriesFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.retries.fragment.AcatsRetriesFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsRetriesFragment2 extends FunctionReferenceImpl implements Function3<String, String, AcatsInScreenContext, Unit> {
    AcatsRetriesFragment2(Object obj) {
        super(3, obj, AcatsRetriesFragmentContract.Callbacks.class, "showAgreement", "showAgreement(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, AcatsInScreenContext acatsInScreenContext) {
        invoke2(str, str2, acatsInScreenContext);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, String p1, AcatsInScreenContext p2) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((AcatsRetriesFragmentContract.Callbacks) this.receiver).showAgreement(p0, p1, p2);
    }
}

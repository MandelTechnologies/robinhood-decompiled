package com.robinhood.shared.stepupverification.support;

import com.robinhood.android.common.util.InternationalInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RequestPhoneCallComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.stepupverification.support.RequestPhoneCallComposableKt$RequestPhoneCallComposable$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class RequestPhoneCallComposable2 extends FunctionReferenceImpl implements Function2<InternationalInfo, String, Unit> {
    RequestPhoneCallComposable2(Object obj) {
        super(2, obj, RequestPhoneCallDuxo.class, "savePhoneNumber", "savePhoneNumber(Lcom/robinhood/android/common/util/InternationalInfo;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InternationalInfo internationalInfo, String str) {
        invoke2(internationalInfo, str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InternationalInfo p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((RequestPhoneCallDuxo) this.receiver).savePhoneNumber(p0, p1);
    }
}

package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import com.robinhood.android.lib.formats.NumberFormatter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AboutV2StateProvider.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.about.v2.AboutV2StateProvider$getFundamentalInfoList$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class AboutV2StateProvider4 extends FunctionReferenceImpl implements Function1<Number, String> {
    AboutV2StateProvider4(Object obj) {
        super(1, obj, NumberFormatter.class, "format", "format(Ljava/lang/Number;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Number p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((NumberFormatter) this.receiver).format(p0);
    }
}

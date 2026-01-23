package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import com.robinhood.utils.datetime.format.LocalDateFormatter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: AboutV2StateProvider.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.about.v2.AboutV2StateProvider$getEtpDetailsInfoList$1$4, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class AboutV2StateProvider3 extends FunctionReferenceImpl implements Function1<LocalDate, String> {
    AboutV2StateProvider3(Object obj) {
        super(1, obj, LocalDateFormatter.class, "format", "format(Ljava/time/LocalDate;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(LocalDate p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((LocalDateFormatter) this.receiver).format(p0);
    }
}

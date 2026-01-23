package com.robinhood.android.rollover401k.steps.accountdetails;

import androidx.compose.p011ui.platform.UriHandler;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FoundAccountDetailsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$AccountDetailPortfolioDisclaimers$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class FoundAccountDetailsScreen7 extends FunctionReferenceImpl implements Function1<String, Unit> {
    FoundAccountDetailsScreen7(Object obj) {
        super(1, obj, UriHandler.class, Constants.PREF_CSI_REFERRER_KEY, "openUri(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((UriHandler) this.receiver).openUri(p0);
    }
}

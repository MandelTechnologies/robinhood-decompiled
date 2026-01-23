package com.robinhood.android.odyssey.lib.view;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdInitialPopupFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.view.SdInitialPopupFragment$bind$1$messageString$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdInitialPopupFragment2 extends FunctionReferenceImpl implements Function1<Uri, Unit> {
    SdInitialPopupFragment2(Object obj) {
        super(1, obj, SdInitialPopupFragment.class, "handleDeepLink", "handleDeepLink(Landroid/net/Uri;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
        invoke2(uri);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Uri p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((SdInitialPopupFragment) this.receiver).handleDeepLink(p0);
    }
}

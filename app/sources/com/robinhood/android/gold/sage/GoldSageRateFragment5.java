package com.robinhood.android.gold.sage;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GoldSageRateFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.sage.GoldSageRateFragment$ComposeContent$2$1$4$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldSageRateFragment5 extends FunctionReferenceImpl implements Function1<Uri, Unit> {
    GoldSageRateFragment5(Object obj) {
        super(1, obj, GoldSageRateFragment.class, "openUrlInApp", "openUrlInApp(Landroid/net/Uri;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
        invoke2(uri);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Uri uri) {
        ((GoldSageRateFragment) this.receiver).openUrlInApp(uri);
    }
}

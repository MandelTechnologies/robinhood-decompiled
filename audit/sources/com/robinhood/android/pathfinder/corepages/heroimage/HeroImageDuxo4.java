package com.robinhood.android.pathfinder.corepages.heroimage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeroImageDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageDuxo$updateInquiry$1$result$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class HeroImageDuxo4 extends FunctionReferenceImpl implements Function1<Throwable, Boolean> {
    HeroImageDuxo4(Object obj) {
        super(1, obj, HeroImageDuxo.class, "handleInputError", "handleInputError$feature_pathfinder_core_pages_externalDebug(Ljava/lang/Throwable;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Throwable p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(((HeroImageDuxo) this.receiver).handleInputError$feature_pathfinder_core_pages_externalDebug(p0));
    }
}

package com.robinhood.android.acatsin.coowner.review;

import com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewContract;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInCoOwnerReviewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewFragment$ComposeContent$3$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInCoOwnerReviewFragment2 extends FunctionReferenceImpl implements Function1<UUID, Unit> {
    AcatsInCoOwnerReviewFragment2(Object obj) {
        super(1, obj, AcatsInCoOwnerReviewContract.Callbacks.class, "onReviewAssets", "onReviewAssets(Ljava/util/UUID;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid) {
        invoke2(uuid);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AcatsInCoOwnerReviewContract.Callbacks) this.receiver).onReviewAssets(p0);
    }
}

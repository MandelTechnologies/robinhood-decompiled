package com.withpersona.sdk2.inquiry.governmentid;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidReviewSelectedImageBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewSelectedImageView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$viewFactory$1, reason: use source file name */
/* loaded from: classes18.dex */
/* synthetic */ class ReviewSelectedImageView2 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2GovernmentidReviewSelectedImageBinding> {
    public static final ReviewSelectedImageView2 INSTANCE = new ReviewSelectedImageView2();

    ReviewSelectedImageView2() {
        super(3, Pi2GovernmentidReviewSelectedImageBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewSelectedImageBinding;", 0);
    }

    public final Pi2GovernmentidReviewSelectedImageBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Pi2GovernmentidReviewSelectedImageBinding.inflate(p0, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Pi2GovernmentidReviewSelectedImageBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }
}

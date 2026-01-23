package com.withpersona.sdk2.inquiry.selfie;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieReviewItemBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelfieReviewCapturesRunner.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$SelfieImageAdapter$adapterHelper$2$1, reason: use source file name */
/* loaded from: classes18.dex */
/* synthetic */ class SelfieReviewCapturesRunner2 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2SelfieReviewItemBinding> {
    public static final SelfieReviewCapturesRunner2 INSTANCE = new SelfieReviewCapturesRunner2();

    SelfieReviewCapturesRunner2() {
        super(3, Pi2SelfieReviewItemBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewItemBinding;", 0);
    }

    public final Pi2SelfieReviewItemBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Pi2SelfieReviewItemBinding.inflate(p0, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Pi2SelfieReviewItemBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }
}

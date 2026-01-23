package com.withpersona.sdk2.inquiry;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InquiryUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0007\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0001H\u0007¨\u0006\u0006"}, m3636d2 = {"toInlineInquiryBuilder", "Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "createFragment", "Landroidx/fragment/app/Fragment;", "inquiry-dynamic-feature_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.InquiryUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InquiryUtils {
    @ExperimentalInlineApi
    public static final InlineInquiryBuilder toInlineInquiryBuilder(InquiryTemplateBuilder inquiryTemplateBuilder) {
        Intrinsics.checkNotNullParameter(inquiryTemplateBuilder, "<this>");
        return inquiryTemplateBuilder.build().buildInlineInquiry();
    }

    @ExperimentalInlineApi
    public static final InlineInquiryBuilder toInlineInquiryBuilder(InquiryBuilder inquiryBuilder) {
        Intrinsics.checkNotNullParameter(inquiryBuilder, "<this>");
        return inquiryBuilder.build().buildInlineInquiry();
    }

    @ExperimentalInlineApi
    public static final Fragment createFragment(InlineInquiryBuilder inlineInquiryBuilder) {
        Intrinsics.checkNotNullParameter(inlineInquiryBuilder, "<this>");
        return inlineInquiryBuilder.build().createFragment();
    }
}

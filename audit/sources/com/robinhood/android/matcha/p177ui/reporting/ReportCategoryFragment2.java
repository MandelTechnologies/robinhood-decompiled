package com.robinhood.android.matcha.p177ui.reporting;

import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.models.matcha.api.ApiCreateAbuseReportRequest;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ReportCategoryFragment.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest$ReportCategory;", "getLabelResId", "(Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest$ReportCategory;)I", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.reporting.ReportCategoryFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ReportCategoryFragment2 {

    /* compiled from: ReportCategoryFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.reporting.ReportCategoryFragmentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCreateAbuseReportRequest.ReportCategory.values().length];
            try {
                iArr[ApiCreateAbuseReportRequest.ReportCategory.SPAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCreateAbuseReportRequest.ReportCategory.NUDITY_OR_SEXUAL_MISCONDUCT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCreateAbuseReportRequest.ReportCategory.HATE_SPEECH_OR_VULGARITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiCreateAbuseReportRequest.ReportCategory.BULLYING_OR_HARASSMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiCreateAbuseReportRequest.ReportCategory.VIOLENCE_OR_DANGEROUS_ORGANIZATIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiCreateAbuseReportRequest.ReportCategory.SCAM_OR_FRAUD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiCreateAbuseReportRequest.ReportCategory.SALE_OF_ILLEGAL_OR_REGULATED_GOODS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiCreateAbuseReportRequest.ReportCategory.INTELLECTUAL_PROPERTY_VIOLATIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiCreateAbuseReportRequest.ReportCategory.SUICIDE_OR_SELF_HARM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiCreateAbuseReportRequest.ReportCategory.I_DO_NOT_LIKE_IT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApiCreateAbuseReportRequest.ReportCategory.SOMETHING_ELSE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getLabelResId(ApiCreateAbuseReportRequest.ReportCategory reportCategory) {
        switch (WhenMappings.$EnumSwitchMapping$0[reportCategory.ordinal()]) {
            case 1:
                return C21284R.string.matcha_report_category_spam;
            case 2:
                return C21284R.string.matcha_report_category_nudity;
            case 3:
                return C21284R.string.matcha_report_category_hate;
            case 4:
                return C21284R.string.matcha_report_category_harassment;
            case 5:
                return C21284R.string.matcha_report_category_violence;
            case 6:
                return C21284R.string.matcha_report_category_scam;
            case 7:
                return C21284R.string.matcha_report_category_illegal_goods;
            case 8:
                return C21284R.string.matcha_report_category_ip_violations;
            case 9:
                return C21284R.string.matcha_report_category_suicide;
            case 10:
                return C21284R.string.matcha_report_category_i_dont_like;
            case 11:
                return C21284R.string.matcha_report_category_other;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

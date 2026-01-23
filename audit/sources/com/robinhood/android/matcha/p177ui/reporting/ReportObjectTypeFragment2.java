package com.robinhood.android.matcha.p177ui.reporting;

import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.models.matcha.api.ApiCreateAbuseReportRequest;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ReportObjectTypeFragment.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest$ObjectType;", "getLabelResId", "(Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest$ObjectType;)I", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.reporting.ReportObjectTypeFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ReportObjectTypeFragment2 {

    /* compiled from: ReportObjectTypeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.reporting.ReportObjectTypeFragmentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCreateAbuseReportRequest.ObjectType.values().length];
            try {
                iArr[ApiCreateAbuseReportRequest.ObjectType.PROFILE_PIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCreateAbuseReportRequest.ObjectType.USERNAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCreateAbuseReportRequest.ObjectType.MEMO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getLabelResId(ApiCreateAbuseReportRequest.ObjectType objectType) {
        int i = WhenMappings.$EnumSwitchMapping$0[objectType.ordinal()];
        if (i == 1) {
            return C21284R.string.matcha_report_object_type_profile_image;
        }
        if (i == 2) {
            return C21284R.string.matcha_report_object_type_username;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C21284R.string.matcha_report_object_type_memo;
    }
}

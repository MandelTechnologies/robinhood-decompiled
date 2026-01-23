package com.robinhood.shared.documents.statements;

import android.content.res.Resources;
import com.robinhood.models.p320db.Document;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Documents.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"getCategoryTitleString", "", "Lcom/robinhood/models/db/Document$Category;", "res", "Landroid/content/res/Resources;", "labelResId", "", "getLabelResId", "(Lcom/robinhood/models/db/Document$Category;)I", "getTitle", "Lcom/robinhood/models/db/Document;", "getTypeString", "getIssuingEntityString", "getSubtitle", "getFileTypeString", "getCategoryInfoString", "feature-statements_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.documents.statements.DocumentsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class Documents {

    /* compiled from: Documents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.documents.statements.DocumentsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[Document.Category.values().length];
            try {
                iArr[Document.Category.TAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Document.Category.ACCOUNT_STATEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Document.Category.IRA_STATEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Document.Category.JOINT_ACCOUNT_STATEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Document.Category.MANAGED_INDIVIDUAL_STATEMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Document.Category.MANAGED_IRA_STATEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Document.Category.MANAGED_JOINT_STATEMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Document.Category.RHY_ACCOUNT_STATEMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Document.Category.RHC_STATEMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Document.Category.RHC_EU_STATEMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Document.Category.RHD_DAILY_STATEMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Document.Category.RHD_MONTHLY_STATEMENT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Document.Category.TRADE_CONFIRM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Document.Category.IRA_TRADE_CONFIRM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Document.Category.JOINT_TRADE_CONFIRM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Document.Category.ACCOUNT_ACTIVITY_REPORT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Document.Category.ADHOC_DOCUMENT_UPLOAD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Document.Type.values().length];
            try {
                iArr2[Document.Type.TYPE_1099.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[Document.Type.TYPE_1099C.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[Document.Type.TYPE_1099Q.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[Document.Type.TYPE_1099R.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[Document.Type.TYPE_1099_CANCELLATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[Document.Type.TYPE_1099_CRYPTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[Document.Type.TYPE_1099_CRYPTO_CORRECTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[Document.Type.TYPE_REMICS.ordinal()] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[Document.Type.TYPE_1042.ordinal()] = 9;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[Document.Type.TYPE_1042S.ordinal()] = 10;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[Document.Type.TYPE_5498.ordinal()] = 11;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[Document.Type.TYPE_5498_ESA.ordinal()] = 12;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[Document.Type.TYPE_480_6ABCD.ordinal()] = 13;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[Document.Type.TYPE_480_6ABCD_CORRECTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[Document.Type.TYPE_2439.ordinal()] = 15;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[Document.Type.TYPE_FMV.ordinal()] = 16;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[Document.Type.TYPE_SDIRA.ordinal()] = 17;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[Document.Type.TYPE_ACCOUNT_STATEMENT.ordinal()] = 18;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[Document.Type.TYPE_TRADE_CONFIRM.ordinal()] = 19;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[Document.Type.TYPE_ACCOUNT_ACTIVITY_REPORT.ordinal()] = 20;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[Document.Type.UNKNOWN.ordinal()] = 21;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[Document.Type.TYPE_ADHOC.ordinal()] = 22;
            } catch (NoSuchFieldError unused39) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Document.IssuingEntity.values().length];
            try {
                iArr3[Document.IssuingEntity.APEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[Document.IssuingEntity.ROBINHOOD_SECURITIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[Document.IssuingEntity.ROBINHOOD_CRYPTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused42) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Document.FileType.values().length];
            try {
                iArr4[Document.FileType.PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr4[Document.FileType.CSV.ordinal()] = 2;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr4[Document.FileType.HTML.ordinal()] = 3;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr4[Document.FileType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused46) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final String getCategoryTitleString(Document.Category category, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(category, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        String string2 = res.getString(getLabelResId(category));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final int getLabelResId(Document.Category category) {
        Intrinsics.checkNotNullParameter(category, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[category.ordinal()]) {
            case 1:
                return C38788R.string.documents_tax_documents_action;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return C38788R.string.documents_account_statements_action;
            case 8:
                return C38788R.string.documents_rhy_account_statements_action;
            case 9:
            case 10:
                return C38788R.string.gated_crypto_documents_rhc_account_statements_action;
            case 11:
                return C38788R.string.documents_rhd_account_daily_statements_action;
            case 12:
                return C38788R.string.documents_rhd_account_monthly_statements_action;
            case 13:
            case 14:
            case 15:
                return C38788R.string.documents_trade_confirms_action;
            case 16:
                return C38788R.string.documents_trade_account_activity_report_action;
            case 17:
                throw new IllegalStateException("Unsupported category in labelResId");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getTitle(Document document, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(document, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        switch (WhenMappings.$EnumSwitchMapping$0[document.getCategory().ordinal()]) {
            case 1:
                String string2 = res.getString(C38788R.string.documents_row_tax_title, document.getTaxYear(), getIssuingEntityString(document, res), getTypeString(document, res));
                Intrinsics.checkNotNull(string2);
                return string2;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return LocalDateFormatter.LONG_WITHOUT_DAY.format(document.getDate());
            case 11:
                return LocalDateFormatter.LONG.format(document.getDate());
            case 17:
                throw new IllegalStateException("Unsupported in getTitle");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final String getTypeString(Document document, Resources resources) throws Resources.NotFoundException {
        int i;
        switch (WhenMappings.$EnumSwitchMapping$1[document.getType().ordinal()]) {
            case 1:
                i = C38788R.string.documents_type_1099;
                break;
            case 2:
                i = C38788R.string.documents_type_1099c;
                break;
            case 3:
                i = C38788R.string.documents_type_1099q;
                break;
            case 4:
                i = C38788R.string.documents_type_1099r;
                break;
            case 5:
                i = C38788R.string.documents_type_1099_cancellation;
                break;
            case 6:
                i = C38788R.string.documents_type_1099_crypto;
                break;
            case 7:
                i = C38788R.string.documents_type_1099_crypto_correction;
                break;
            case 8:
                i = C38788R.string.documents_type_remics;
                break;
            case 9:
                i = C38788R.string.documents_type_1042;
                break;
            case 10:
                i = C38788R.string.documents_type_1042s;
                break;
            case 11:
                i = C38788R.string.documents_type_5498;
                break;
            case 12:
                i = C38788R.string.documents_type_5498_esa;
                break;
            case 13:
                i = C38788R.string.documents_type_480_6abcd;
                break;
            case 14:
                i = C38788R.string.documents_type_480_6abcd_correction;
                break;
            case 15:
                i = C38788R.string.documents_type_2439;
                break;
            case 16:
                i = C38788R.string.documents_type_fmv;
                break;
            case 17:
                i = C38788R.string.documents_type_sdira;
                break;
            case 18:
                i = C38788R.string.documents_type_account_statement;
                break;
            case 19:
                i = C38788R.string.documents_type_trade_confirm;
                break;
            case 20:
                i = C38788R.string.documents_type_account_activity_report;
                break;
            case 21:
            case 22:
                i = C38788R.string.documents_type_unkown;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private static final String getIssuingEntityString(Document document, Resources resources) throws Resources.NotFoundException {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$2[document.getIssuingEntity().ordinal()];
        if (i2 == 1) {
            i = C38788R.string.documents_issuer_apex;
        } else if (i2 == 2) {
            i = C38788R.string.documents_issuer_robinhood_securities;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C38788R.string.gated_crypto_documents_issuer_robinhood_crypto;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getSubtitle(Document document, Resources res) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(document, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        if (document.getCategory() != Document.Category.TAX) {
            return null;
        }
        String fileTypeString = getFileTypeString(document, res);
        String str = LocalDateFormatter.MEDIUM.format(document.getDate());
        if (document.getType().getIsCorrection()) {
            i = C38788R.string.documents_row_tax_subtitle_corrected;
        } else {
            i = C38788R.string.documents_row_tax_subtitle_issued;
        }
        return res.getString(i, fileTypeString, str);
    }

    public static final String getFileTypeString(Document document, Resources res) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(document, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        int i2 = WhenMappings.$EnumSwitchMapping$3[document.getFiletype().ordinal()];
        if (i2 == 1) {
            i = C38788R.string.documents_filetype_pdf;
        } else if (i2 == 2) {
            i = C38788R.string.documents_filetype_csv;
        } else if (i2 == 3) {
            i = C38788R.string.documents_filetype_html;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = C38788R.string.documents_filetype_unknown;
        }
        String string2 = res.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getCategoryInfoString(Document.Category category, Resources res) {
        String string2;
        Intrinsics.checkNotNullParameter(category, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Integer numValueOf = null;
        switch (WhenMappings.$EnumSwitchMapping$0[category.ordinal()]) {
            case 1:
                numValueOf = Integer.valueOf(C38788R.string.documents_tax_document_summary);
                break;
            case 2:
                numValueOf = Integer.valueOf(C38788R.string.documents_account_statement_summary);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                numValueOf = Integer.valueOf(C38788R.string.documents_account_statement_summary);
                break;
            case 8:
                numValueOf = Integer.valueOf(C38788R.string.documents_rhy_account_statement_summary);
                break;
            case 9:
            case 10:
                numValueOf = Integer.valueOf(C38788R.string.documents_rhc_account_statement_summary);
                break;
            case 11:
                numValueOf = Integer.valueOf(C38788R.string.documents_rhd_daily_statement_summary);
                break;
            case 12:
                numValueOf = Integer.valueOf(C38788R.string.documents_rhd_monthly_statement_summary);
                break;
            case 13:
            case 14:
            case 15:
                numValueOf = Integer.valueOf(C38788R.string.documents_trade_confirmation_summary);
                break;
            case 16:
            case 17:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return (numValueOf == null || (string2 = res.getString(numValueOf.intValue())) == null) ? "" : string2;
    }
}

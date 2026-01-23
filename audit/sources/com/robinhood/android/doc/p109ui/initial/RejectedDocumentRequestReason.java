package com.robinhood.android.doc.p109ui.initial;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.doc.C14254R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RejectedDocumentRequestReason.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/initial/RejectedDocumentRequestReason;", "", "<init>", "(Ljava/lang/String;I)V", "ALREADY_UPLOADED", "OUT_OF_DATE", "EMAIL_ONLY", "UPDATE_APP_REQUIRED", "dialogResources", "Lcom/robinhood/android/doc/ui/initial/DialogResources;", "getDialogResources", "()Lcom/robinhood/android/doc/ui/initial/DialogResources;", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RejectedDocumentRequestReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RejectedDocumentRequestReason[] $VALUES;
    private static final String TAG_ALREADY_UPLOADED = "document-already-uploaded";
    private static final String TAG_EMAIL_ONLY = "document-email-only";
    private static final String TAG_OUT_OF_DATE = "document-out-of-date";
    private static final String TAG_UPDATE_APP = "update-app";
    public static final RejectedDocumentRequestReason ALREADY_UPLOADED = new RejectedDocumentRequestReason("ALREADY_UPLOADED", 0);
    public static final RejectedDocumentRequestReason OUT_OF_DATE = new RejectedDocumentRequestReason("OUT_OF_DATE", 1);
    public static final RejectedDocumentRequestReason EMAIL_ONLY = new RejectedDocumentRequestReason("EMAIL_ONLY", 2);
    public static final RejectedDocumentRequestReason UPDATE_APP_REQUIRED = new RejectedDocumentRequestReason("UPDATE_APP_REQUIRED", 3);

    /* compiled from: RejectedDocumentRequestReason.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RejectedDocumentRequestReason.values().length];
            try {
                iArr[RejectedDocumentRequestReason.ALREADY_UPLOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RejectedDocumentRequestReason.OUT_OF_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RejectedDocumentRequestReason.EMAIL_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RejectedDocumentRequestReason.UPDATE_APP_REQUIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ RejectedDocumentRequestReason[] $values() {
        return new RejectedDocumentRequestReason[]{ALREADY_UPLOADED, OUT_OF_DATE, EMAIL_ONLY, UPDATE_APP_REQUIRED};
    }

    public static EnumEntries<RejectedDocumentRequestReason> getEntries() {
        return $ENTRIES;
    }

    private RejectedDocumentRequestReason(String str, int i) {
    }

    static {
        RejectedDocumentRequestReason[] rejectedDocumentRequestReasonArr$values = $values();
        $VALUES = rejectedDocumentRequestReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rejectedDocumentRequestReasonArr$values);
        INSTANCE = new Companion(null);
    }

    public final DialogResources getDialogResources() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return new DialogResources(C14254R.id.dialog_id_document_already_uploaded, C14254R.string.doc_upload_dialog_already_uploaded_title, C14254R.string.doc_upload_dialog_already_uploaded_message, TAG_ALREADY_UPLOADED, Integer.valueOf(C14254R.drawable.ic_warning), false, 32, null);
        }
        if (i == 2) {
            return new DialogResources(C14254R.id.dialog_id_document_out_of_date, C11048R.string.general_error_title, C14254R.string.doc_upload_dialog_out_of_date_message, TAG_OUT_OF_DATE, null, false, 48, null);
        }
        if (i == 3) {
            return new DialogResources(C14254R.id.dialog_id_document_email_only, C11048R.string.general_error_title, C14254R.string.doc_upload_dialog_email_only_message, TAG_EMAIL_ONLY, null, false, 48, null);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new DialogResources(C14254R.id.dialog_id_update_app, C14254R.string.doc_upload_dialog_update_required_title, C14254R.string.doc_upload_dialog_update_required_message, TAG_UPDATE_APP, null, true, 16, null);
    }

    public static RejectedDocumentRequestReason valueOf(String str) {
        return (RejectedDocumentRequestReason) Enum.valueOf(RejectedDocumentRequestReason.class, str);
    }

    public static RejectedDocumentRequestReason[] values() {
        return (RejectedDocumentRequestReason[]) $VALUES.clone();
    }
}

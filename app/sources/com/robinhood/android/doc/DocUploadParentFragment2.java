package com.robinhood.android.doc;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.doc.event.DocUploadWizardState;
import com.robinhood.android.doc.event.UtilKt;
import com.robinhood.android.doc.p109ui.LoggingUtil2;
import com.robinhood.android.doc.p109ui.PersonaClientLogStatus;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadParentFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\"\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, m3636d2 = {"logDocUploadEvent", "", "Lcom/robinhood/analytics/AnalyticsLogger;", "event", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent;", "wizardState", "Lcom/robinhood/android/doc/event/DocUploadWizardState;", "logPersonaClientStatus", "status", "Lcom/robinhood/android/doc/ui/PersonaClientLogStatus;", "logGenericEvent", "logEntryDestination", "activeDocRequest", "", "Lcom/robinhood/models/ui/DocumentRequest;", "destination", "Lcom/robinhood/android/doc/event/DocUploadDestination;", "feature-doc-upload_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.DocUploadParentFragmentKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DocUploadParentFragment2 {
    public static final void logDocUploadEvent(AnalyticsLogger analyticsLogger, DocUploadEvent event, DocUploadWizardState wizardState) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(wizardState, "wizardState");
        if (event instanceof DocUploadEvent.WizardMutator.Submission.Success) {
            AnalyticsLogger.DefaultImpls.logUserAction$default(analyticsLogger, AnalyticsStrings.USER_ACTION_IDENTITY_DOCUMENT_UPLOADED, null, LoggingUtil2.getLoggingTag(wizardState.getRequireActiveRequest()), DocUploadParentFragment.V2_TAG, 2, null);
            if (wizardState.isRequestCompleted()) {
                logPersonaClientStatus(analyticsLogger, PersonaClientLogStatus.COMPLETED, wizardState);
            }
            logGenericEvent(analyticsLogger, event);
            return;
        }
        if (event instanceof DocUploadEvent.WizardMutator.Submission.Error) {
            logPersonaClientStatus(analyticsLogger, PersonaClientLogStatus.FAILED, wizardState);
            logGenericEvent(analyticsLogger, event);
            return;
        }
        if (event instanceof DocUploadEvent.Exit) {
            if (((DocUploadEvent.Exit) event).getSuccessful()) {
                return;
            }
            logPersonaClientStatus(analyticsLogger, PersonaClientLogStatus.CANCELED, wizardState);
            logGenericEvent(analyticsLogger, event);
            return;
        }
        if (event instanceof DocUploadEvent.ActiveDocRequestEvent.PersonaClientError) {
            logPersonaClientStatus(analyticsLogger, PersonaClientLogStatus.FAILED, wizardState);
            logGenericEvent(analyticsLogger, event);
        } else {
            logGenericEvent(analyticsLogger, event);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logPersonaClientStatus(AnalyticsLogger analyticsLogger, PersonaClientLogStatus personaClientLogStatus, DocUploadWizardState docUploadWizardState) {
        LoggingUtil2.logPersonaClientStatus(analyticsLogger, docUploadWizardState.getLoggingActiveRequest(), personaClientLogStatus);
    }

    private static final void logGenericEvent(AnalyticsLogger analyticsLogger, DocUploadEvent docUploadEvent) {
        AnalyticsLogger.DefaultImpls.logUserAction$default(analyticsLogger, DocUploadParentFragment.USER_ACTION_DOC_UPLOAD_EVENT, null, UtilKt.getAnalyticsString(docUploadEvent), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logEntryDestination(AnalyticsLogger analyticsLogger, List<DocumentRequest> list, DocUploadDestination docUploadDestination) {
        String str;
        DocumentRequest documentRequest = (DocumentRequest) CollectionsKt.firstOrNull((List) list);
        if (documentRequest == null || !documentRequest.getForCrypto()) {
            str = docUploadDestination instanceof DocUploadDestination.SelectType ? "type_selection" : "immediate";
        } else {
            str = AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO;
        }
        AnalyticsLogger.DefaultImpls.logUserAction$default(analyticsLogger, AnalyticsStrings.USER_ACTION_DOC_REQUEST_UPLOAD_ROUTE, null, str, com.robinhood.android.doc.p109ui.UtilKt.getType(list), 2, null);
    }
}

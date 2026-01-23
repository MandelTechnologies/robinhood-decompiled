package com.robinhood.android.doc.event;

import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: util.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"analyticsString", "", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent;", "getAnalyticsString", "(Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent;)Ljava/lang/String;", "feature-doc-upload_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class UtilKt {
    public static final String getAnalyticsString(DocUploadEvent docUploadEvent) {
        Intrinsics.checkNotNullParameter(docUploadEvent, "<this>");
        if (Intrinsics.areEqual(docUploadEvent, DocUploadEvent.ActiveDocRequestEvent.CameraPermissionDenied.INSTANCE)) {
            return "camera_permission_denied";
        }
        if (docUploadEvent instanceof DocUploadEvent.ActiveDocRequestEvent.OriginSelected) {
            return "origin_selected";
        }
        if (docUploadEvent instanceof DocUploadEvent.ActiveDocRequestEvent.StartPrism) {
            return "start_prism";
        }
        if (docUploadEvent instanceof DocUploadEvent.ActiveDocRequestEvent.PersonaStarted) {
            return "persona_started";
        }
        if (docUploadEvent instanceof DocUploadEvent.WizardMutator.PersonaClientCancelled) {
            return "persona_web_view_cancelled";
        }
        if (docUploadEvent instanceof DocUploadEvent.ActiveDocRequestEvent.DocumentCaptured) {
            return "photo_captured";
        }
        if (docUploadEvent instanceof DocUploadEvent.ActiveDocRequestEvent.DocumentReview.Confirmed) {
            return "photo_review_confirmed";
        }
        if (Intrinsics.areEqual(docUploadEvent, DocUploadEvent.ActiveDocRequestEvent.DocumentReview.Rejected.INSTANCE)) {
            return "photo_review_rejected";
        }
        if (docUploadEvent instanceof DocUploadEvent.ActiveDocRequestEvent.Residency.Confirmed) {
            return "residency_confirmed";
        }
        if (Intrinsics.areEqual(docUploadEvent, DocUploadEvent.ActiveDocRequestEvent.Residency.Rejected.INSTANCE)) {
            return "residency_rejected";
        }
        if (docUploadEvent instanceof DocUploadEvent.ActiveDocRequestEvent.SelfieContinue) {
            return "selfie_continue";
        }
        if (docUploadEvent instanceof DocUploadEvent.ActiveDocRequestEvent.SplashContinue) {
            return "splash_continue";
        }
        if (Intrinsics.areEqual(docUploadEvent, DocUploadEvent.ActiveDocRequestEvent.SplashDismiss.INSTANCE)) {
            return "splash_dismiss";
        }
        if (docUploadEvent instanceof DocUploadEvent.ActiveDocRequestEvent.TypeSelected) {
            return "type_selected";
        }
        if (docUploadEvent instanceof DocUploadEvent.ActiveDocRequestEvent.PersonaClientError) {
            return "persona_web_view_error";
        }
        if (docUploadEvent instanceof DocUploadEvent.Exit) {
            return "exit";
        }
        if (docUploadEvent instanceof DocUploadEvent.WizardMutator.Start) {
            return "start";
        }
        if (docUploadEvent instanceof DocUploadEvent.WizardMutator.Skip) {
            return "skip";
        }
        if (docUploadEvent instanceof DocUploadEvent.WizardMutator.Submission.Error) {
            return "error";
        }
        if (docUploadEvent instanceof DocUploadEvent.WizardMutator.Submission.Success) {
            return "success";
        }
        if (Intrinsics.areEqual(docUploadEvent, DocUploadEvent.ActiveDocRequestEvent.PersonaClientSucceeded.INSTANCE)) {
            return "persona_webview_succeeded";
        }
        throw new NoWhenBranchMatchedException();
    }
}

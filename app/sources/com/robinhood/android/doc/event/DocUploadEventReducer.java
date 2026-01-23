package com.robinhood.android.doc.event;

import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.doc.event.DocUploadResult;
import com.robinhood.android.doc.p109ui.persona.PersonaStartStyle;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.DocUploadCapturedDocument;
import com.robinhood.models.api.DocUploadThanksContext;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.PdfDocument;
import com.robinhood.models.api.PhotoDocument;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.api.identi.ApiDocumentRequestContent;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.UploadFlowDetails;
import com.robinhood.utils.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: DocUploadEventReducer.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J&\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u001aH\u0002J0\u0010\u001b\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0002J(\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/doc/event/DocUploadEventReducer;", "", "<init>", "()V", "reduce", "Lcom/robinhood/android/doc/event/DocUploadResult;", "event", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent;", "wizardState", "Lcom/robinhood/android/doc/event/DocUploadWizardState;", "reduceWizardMutatorEvent", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$WizardMutator;", "reduceActiveDocRequestsEvent", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent;", "activeRequests", "", "Lcom/robinhood/models/ui/DocumentRequest;", "determineDocumentReviewDestination", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$DocumentCaptured;", "activeRequest", "determineCapturePhotoDestinationFromSide", "Lcom/robinhood/android/doc/event/DocUploadDestination;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "originalRequest", "fromTypeSelected", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent$ActiveDocRequestEvent$TypeSelected;", "determineEntryDestination", "requests", "personaFailedFallback", "", "skipInquiryVerificationForUnauthedSelfieConsent", "isGdpr", "determineSingletonEntryDestination", "request", "mapToIdDocumentType", "Lcom/robinhood/models/api/IdDocument$Type;", "requestType", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocUploadEventReducer {
    public static final int $stable = 0;
    public static final DocUploadEventReducer INSTANCE = new DocUploadEventReducer();

    /* compiled from: DocUploadEventReducer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IdDocument.Side.values().length];
            try {
                iArr[IdDocument.Side.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdDocument.Side.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdDocument.Side.SELFIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdDocument.Side.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiDocumentRequest.Type.values().length];
            try {
                iArr2[ApiDocumentRequest.Type.PHOTO_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.PHOTO_ID_WITH_SELFIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.VIDEO_SELFIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.NATIONAL_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.LETTER_407.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.BANK_STATEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.BROKERAGE_STATEMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.NAME_CHANGE_LEGAL_DOCUMENTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.SIGNED_CUSTOMER_DOCUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.PERMANENT_RESIDENT_CARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.FOREIGN_BANK_STATEMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.THIRD_PARTY_WIRE.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.WIRE_REQUEST.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.UTILITY_BILL.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.FOREIGN_PASSPORT.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.THREE_POINT_SELFIE.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[ApiDocumentRequest.Type.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private DocUploadEventReducer() {
    }

    public final DocUploadResult reduce(DocUploadEvent event, DocUploadWizardState wizardState) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(wizardState, "wizardState");
        if (event instanceof DocUploadEvent.WizardMutator) {
            return reduceWizardMutatorEvent((DocUploadEvent.WizardMutator) event, wizardState);
        }
        if (event instanceof DocUploadEvent.ActiveDocRequestEvent) {
            return reduceActiveDocRequestsEvent((DocUploadEvent.ActiveDocRequestEvent) event, wizardState, wizardState.getRequireActiveRequest());
        }
        if (!(event instanceof DocUploadEvent.Exit)) {
            throw new NoWhenBranchMatchedException();
        }
        return new DocUploadResult.NonMutatingResult(new DocUploadDestination.Finish(((DocUploadEvent.Exit) event).getSuccessful()));
    }

    private final DocUploadResult reduceWizardMutatorEvent(DocUploadEvent.WizardMutator event, DocUploadWizardState wizardState) {
        if (event instanceof DocUploadEvent.WizardMutator.Start) {
            DocUploadEvent.WizardMutator.Start start = (DocUploadEvent.WizardMutator.Start) event;
            DocUploadWizardState docUploadWizardStateStartNextRequest = DocUploadWizardState.copy$default(wizardState, start.getRequests(), null, null, false, false, start.isGdpr(), false, null, null, null, false, 2014, null).startNextRequest(false);
            return new DocUploadResult.WizardStateMutatorResult(docUploadWizardStateStartNextRequest, determineEntryDestination(docUploadWizardStateStartNextRequest.getActiveRequests(), docUploadWizardStateStartNextRequest.getPersonaFailed(), docUploadWizardStateStartNextRequest.getSkipInquiryVerificationForUnauthedSelfieConsent(), docUploadWizardStateStartNextRequest.isGdpr()));
        }
        if (event instanceof DocUploadEvent.WizardMutator.Submission.Error) {
            return new DocUploadResult.NonMutatingResult(new DocUploadDestination.Finish(false));
        }
        boolean z = event instanceof DocUploadEvent.WizardMutator.Submission.Success;
        if (!z && !(event instanceof DocUploadEvent.WizardMutator.Skip) && !(event instanceof DocUploadEvent.WizardMutator.PersonaClientCancelled)) {
            throw new NoWhenBranchMatchedException();
        }
        DocUploadWizardState docUploadWizardStateStartNextRequest2 = wizardState.startNextRequest(z);
        DocUploadThanksContext thanksScreen = docUploadWizardStateStartNextRequest2.getThanksScreen();
        if (docUploadWizardStateStartNextRequest2.getActiveRequests().isEmpty()) {
            if (z && ((DocUploadEvent.WizardMutator.Submission.Success) event).getForCrypto() && wizardState.getShowUnderReview()) {
                return new DocUploadResult.WizardStateMutatorResult(docUploadWizardStateStartNextRequest2, DocUploadDestination.CryptoUpgradeUnderReview.INSTANCE);
            }
            if (thanksScreen != null) {
                return new DocUploadResult.WizardStateMutatorResult(docUploadWizardStateStartNextRequest2, new DocUploadDestination.Thanks(thanksScreen));
            }
            return new DocUploadResult.WizardStateMutatorResult(docUploadWizardStateStartNextRequest2, new DocUploadDestination.Finish(true));
        }
        return new DocUploadResult.WizardStateMutatorResult(docUploadWizardStateStartNextRequest2, determineEntryDestination(docUploadWizardStateStartNextRequest2.getActiveRequests(), docUploadWizardStateStartNextRequest2.getPersonaFailed(), docUploadWizardStateStartNextRequest2.getSkipInquiryVerificationForUnauthedSelfieConsent(), docUploadWizardStateStartNextRequest2.isGdpr()));
    }

    private final DocUploadResult reduceActiveDocRequestsEvent(DocUploadEvent.ActiveDocRequestEvent event, DocUploadWizardState wizardState, List<DocumentRequest> activeRequests) {
        Object obj;
        Object next;
        DocumentRequest documentRequest = (DocumentRequest) CollectionsKt.first((List) activeRequests);
        if (Intrinsics.areEqual(event, DocUploadEvent.ActiveDocRequestEvent.CameraPermissionDenied.INSTANCE)) {
            return new DocUploadResult.NonMutatingResult(DocUploadDestination.DelayedPopBack.INSTANCE);
        }
        if (event instanceof DocUploadEvent.ActiveDocRequestEvent.OriginSelected) {
            return new DocUploadResult.NonMutatingResult(new DocUploadDestination.Splash(((DocUploadEvent.ActiveDocRequestEvent.OriginSelected) event).getDetails(), false, null, 6, null));
        }
        if (event instanceof DocUploadEvent.ActiveDocRequestEvent.DocumentCaptured) {
            return determineDocumentReviewDestination((DocUploadEvent.ActiveDocRequestEvent.DocumentCaptured) event, documentRequest);
        }
        if (event instanceof DocUploadEvent.ActiveDocRequestEvent.DocumentReview.Confirmed) {
            DocUploadEvent.ActiveDocRequestEvent.DocumentReview.Confirmed confirmed = (DocUploadEvent.ActiveDocRequestEvent.DocumentReview.Confirmed) event;
            return new DocUploadResult.NonMutatingResult(determineCapturePhotoDestinationFromSide(confirmed.getDetails().copyConfirmingCapture(confirmed.getDocument()), documentRequest));
        }
        if (Intrinsics.areEqual(event, DocUploadEvent.ActiveDocRequestEvent.DocumentReview.Rejected.INSTANCE)) {
            return new DocUploadResult.NonMutatingResult(DocUploadDestination.PopBack.INSTANCE);
        }
        if (event instanceof DocUploadEvent.ActiveDocRequestEvent.Residency.Confirmed) {
            return new DocUploadResult.NonMutatingResult(new DocUploadDestination.SelectType(((DocUploadEvent.ActiveDocRequestEvent.Residency.Confirmed) event).getRequestType(), true, false, 4, null));
        }
        if (Intrinsics.areEqual(event, DocUploadEvent.ActiveDocRequestEvent.Residency.Rejected.INSTANCE)) {
            return new DocUploadResult.NonMutatingResult(DocUploadDestination.ChooseAddress.INSTANCE);
        }
        if (event instanceof DocUploadEvent.ActiveDocRequestEvent.SelfieContinue) {
            return new DocUploadResult.NonMutatingResult(new DocUploadDestination.CaptureDocument(((DocUploadEvent.ActiveDocRequestEvent.SelfieContinue) event).getDetails(), IdDocument.Side.SELFIE));
        }
        if (event instanceof DocUploadEvent.ActiveDocRequestEvent.SplashContinue) {
            return new DocUploadResult.NonMutatingResult(determineCapturePhotoDestinationFromSide(((DocUploadEvent.ActiveDocRequestEvent.SplashContinue) event).getDetails(), documentRequest));
        }
        if (Intrinsics.areEqual(event, DocUploadEvent.ActiveDocRequestEvent.SplashDismiss.INSTANCE)) {
            return new DocUploadResult.NonMutatingResult(DocUploadDestination.PopBack.INSTANCE);
        }
        if (event instanceof DocUploadEvent.ActiveDocRequestEvent.TypeSelected) {
            return new DocUploadResult.NonMutatingResult(fromTypeSelected((DocUploadEvent.ActiveDocRequestEvent.TypeSelected) event));
        }
        if (event instanceof DocUploadEvent.ActiveDocRequestEvent.StartPrism) {
            UUID id = documentRequest.getId();
            if (id == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            return new DocUploadResult.NonMutatingResult(new DocUploadDestination.Prism(id, ((DocUploadEvent.ActiveDocRequestEvent.StartPrism) event).isCollection()));
        }
        if (event instanceof DocUploadEvent.ActiveDocRequestEvent.PersonaStarted) {
            List<DocumentRequest> list = activeRequests;
            Iterator<T> it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((DocumentRequest) next).getType() == ApiDocumentRequest.Type.PHOTO_ID) {
                    break;
                }
            }
            DocumentRequest documentRequest2 = (DocumentRequest) next;
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((DocumentRequest) next2).getType() == ApiDocumentRequest.Type.THREE_POINT_SELFIE) {
                    obj = next2;
                    break;
                }
            }
            return new DocUploadResult.NonMutatingResult(new DocUploadDestination.PersonaClient(documentRequest2, (DocumentRequest) obj, com.robinhood.android.doc.p109ui.UtilKt.isInPersonaClient(activeRequests), ((DocUploadEvent.ActiveDocRequestEvent.PersonaStarted) event).getSkipBiometric(), false, 16, null));
        }
        if (event instanceof DocUploadEvent.ActiveDocRequestEvent.PersonaClientSucceeded) {
            return new DocUploadResult.NonMutatingResult(DocUploadDestination.PersonaSubmittedReport.INSTANCE);
        }
        if (!(event instanceof DocUploadEvent.ActiveDocRequestEvent.PersonaClientError)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((DocUploadEvent.ActiveDocRequestEvent.PersonaClientError) event).getExitImmediately()) {
            return new DocUploadResult.NonMutatingResult(new DocUploadDestination.Finish(false));
        }
        DocUploadWizardState docUploadWizardStateBreakRequestOnPersonaClientError = wizardState.breakRequestOnPersonaClientError();
        return new DocUploadResult.WizardStateMutatorResult(docUploadWizardStateBreakRequestOnPersonaClientError, determineEntryDestination(docUploadWizardStateBreakRequestOnPersonaClientError.getActiveRequests(), docUploadWizardStateBreakRequestOnPersonaClientError.getPersonaFailed(), docUploadWizardStateBreakRequestOnPersonaClientError.getSkipInquiryVerificationForUnauthedSelfieConsent(), docUploadWizardStateBreakRequestOnPersonaClientError.isGdpr()));
    }

    private final DocUploadResult determineDocumentReviewDestination(DocUploadEvent.ActiveDocRequestEvent.DocumentCaptured event, DocumentRequest activeRequest) {
        DocUploadCapturedDocument document = event.getDocument();
        if (document instanceof PhotoDocument) {
            PhotoDocument photoDocument = (PhotoDocument) document;
            int i = WhenMappings.$EnumSwitchMapping$0[photoDocument.getSide().ordinal()];
            if (i == 1 || i == 2) {
                return new DocUploadResult.NonMutatingResult(new DocUploadDestination.PhotoReview(event.getDetails(), photoDocument));
            }
            if (i == 3) {
                return new DocUploadResult.NonMutatingResult(new DocUploadDestination.Submission(event.getDetails().copyConfirmingCapture(document), activeRequest));
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(document);
            throw new ExceptionsH();
        }
        if (!(document instanceof PdfDocument)) {
            throw new NoWhenBranchMatchedException();
        }
        return new DocUploadResult.NonMutatingResult(new DocUploadDestination.PdfReview(event.getDetails(), (PdfDocument) document));
    }

    private final DocUploadDestination determineCapturePhotoDestinationFromSide(UploadFlowDetails details, DocumentRequest originalRequest) {
        IdDocument.Side side = (IdDocument.Side) CollectionsKt.firstOrNull((List) details.getCaptureQueue());
        int i = side == null ? -1 : WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == -1) {
            return new DocUploadDestination.Submission(details, originalRequest);
        }
        if (i == 1 || i == 2) {
            return new DocUploadDestination.CaptureDocument(details.copyPoppingCaptureQueue(), side);
        }
        if (i == 3) {
            return new DocUploadDestination.SelfieSplash(details.copyPoppingCaptureQueue());
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(side);
        throw new ExceptionsH();
    }

    private final DocUploadDestination fromTypeSelected(DocUploadEvent.ActiveDocRequestEvent.TypeSelected event) {
        if (event.getForCrypto() || event.getDocumentType() == IdDocument.Type.DRIVING_LICENSE || event.getDocumentType() == IdDocument.Type.ID_CARD) {
            return new DocUploadDestination.Splash(new UploadFlowDetails(event.getDocumentType(), event.getRequestType(), event.getForCrypto(), null, null, CountryCode.Supported.UnitedStates.INSTANCE, null, 88, null), false, null, 6, null);
        }
        return new DocUploadDestination.SelectOrigin(event.getDocumentType(), event.getRequestType(), null, false, null, 28, null);
    }

    static /* synthetic */ DocUploadDestination determineEntryDestination$default(DocUploadEventReducer docUploadEventReducer, List list, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return docUploadEventReducer.determineEntryDestination(list, z, z2, z3);
    }

    private final DocUploadDestination determineEntryDestination(List<DocumentRequest> requests, boolean personaFailedFallback, boolean skipInquiryVerificationForUnauthedSelfieConsent, boolean isGdpr) {
        UUID uuid;
        ApiDocumentRequestContent serverContent;
        if (requests.isEmpty()) {
            return new DocUploadDestination.Finish(false);
        }
        DocumentRequest documentRequest = (DocumentRequest) CollectionsKt.firstOrNull((List) requests);
        if (documentRequest != null && (serverContent = documentRequest.getServerContent()) != null) {
            return new DocUploadDestination.ServerDrivenFlow(serverContent);
        }
        if (com.robinhood.android.doc.p109ui.UtilKt.isPhotoIdAndSelfie(requests)) {
            Iterator<T> it = requests.iterator();
            do {
                uuid = null;
                if (!it.hasNext()) {
                    break;
                }
                DocumentRequest.User user = ((DocumentRequest) it.next()).getUser();
                if (user != null) {
                    uuid = user.getUuid();
                }
            } while (uuid == null);
            return new DocUploadDestination.PersonaStart(uuid, skipInquiryVerificationForUnauthedSelfieConsent, PersonaStartStyle.PHOTO_ID, isGdpr, false, 16, null);
        }
        return determineSingletonEntryDestination((DocumentRequest) CollectionsKt.first((List) requests), personaFailedFallback, skipInquiryVerificationForUnauthedSelfieConsent, isGdpr);
    }

    private final DocUploadDestination determineSingletonEntryDestination(DocumentRequest request, boolean personaFailedFallback, boolean skipInquiryVerificationForUnauthedSelfieConsent, boolean isGdpr) {
        switch (WhenMappings.$EnumSwitchMapping$1[request.getType().ordinal()]) {
            case 1:
            case 2:
                if (request.getForCrypto()) {
                    return new DocUploadDestination.VerifyResidency(request.getType());
                }
                if (com.robinhood.android.doc.p109ui.UtilKt.isInPersonaClient(request) && !personaFailedFallback) {
                    DocumentRequest.User user = request.getUser();
                    return new DocUploadDestination.PersonaStart(user != null ? user.getUuid() : null, skipInquiryVerificationForUnauthedSelfieConsent, PersonaStartStyle.PHOTO_ID, isGdpr, false, 16, null);
                }
                return new DocUploadDestination.SelectType(request.getType(), false, true);
            case 3:
                DocumentRequest.User user2 = request.getUser();
                return new DocUploadDestination.PersonaStart(user2 != null ? user2.getUuid() : null, skipInquiryVerificationForUnauthedSelfieConsent, PersonaStartStyle.SELFIE, isGdpr, true);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return new DocUploadDestination.Splash(new UploadFlowDetails(mapToIdDocumentType(request.getType()), request.getType(), request.getForCrypto(), null, null, request.getCountry(), request.getAllowedCaptureMethods(), 24, null), true, request.getBackRequired());
            case 14:
                IdDocument.Type type2 = IdDocument.Type.UTILITY_BILL;
                ApiDocumentRequest.Type type3 = request.getType();
                List listEmptyList = CollectionsKt.emptyList();
                DocumentRequest.User user3 = request.getUser();
                return new DocUploadDestination.SelectOrigin(type2, type3, listEmptyList, true, user3 != null ? user3.getOrigin() : null);
            case 15:
                return new DocUploadDestination.SelectOrigin(IdDocument.Type.FOREIGN_PASSPORT, request.getType(), CollectionsKt.listOf(CountryCode.Supported.UnitedStates.INSTANCE), true, null, 16, null);
            case 16:
                DocumentRequest.User user4 = request.getUser();
                return new DocUploadDestination.PersonaStart(user4 != null ? user4.getUuid() : null, skipInquiryVerificationForUnauthedSelfieConsent, PersonaStartStyle.SELFIE, isGdpr, false, 16, null);
            case 17:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(request.getType());
                throw new ExceptionsH();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final IdDocument.Type mapToIdDocumentType(ApiDocumentRequest.Type requestType) {
        switch (WhenMappings.$EnumSwitchMapping$1[requestType.ordinal()]) {
            case 4:
                return IdDocument.Type.NATIONAL_ID;
            case 5:
                return IdDocument.Type.LETTER_407;
            case 6:
                return IdDocument.Type.BANK_STATEMENT;
            case 7:
                return IdDocument.Type.BROKERAGE_STATEMENT;
            case 8:
                return IdDocument.Type.NAME_CHANGE_LEGAL_DOCUMENTS;
            case 9:
                return IdDocument.Type.SIGNED_CUSTOMER_DOCUMENT;
            case 10:
                return IdDocument.Type.PERMANENT_RESIDENT_CARD;
            case 11:
                return IdDocument.Type.FOREIGN_BANK_STATEMENT;
            case 12:
            default:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(requestType);
                throw new ExceptionsH();
            case 13:
                return IdDocument.Type.THIRD_PARTY_WIRE;
            case 14:
                return IdDocument.Type.UTILITY_BILL;
        }
    }
}

package com.robinhood.android.doc.serverdriven.parent;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.doc.serverdriven.parent.SddrDestination;
import com.robinhood.android.doc.serverdriven.parent.SddrDestinationEvent;
import com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.identi.ApiDocumentRequestContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SddrParentStateProvider.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ \u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J8\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrParentStateProvider;", "", "<init>", "()V", "reduce", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestinationEvent;", "event", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "content", "Lcom/robinhood/models/api/identi/ApiDocumentRequestContent;", "mockRequests", "", "getNextPhotoDestination", "newState", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "getNextPrepDestination", "documentTypeToUpload", "", "ignoreDocType", "ignoreCountry", "addToBackStack", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SddrParentStateProvider {
    public static final int $stable = 0;
    public static final SddrParentStateProvider INSTANCE = new SddrParentStateProvider();

    /* compiled from: SddrParentStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    private SddrParentStateProvider() {
    }

    public final SddrDestinationEvent reduce(SddrFlowEvent event, ApiDocumentRequestContent content, boolean mockRequests) throws SddrException {
        SddrFlowState sddrFlowStateCopy$default;
        List<ApiDocumentRequestContent.CaptureScreen.CaptureSide> sides;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(content, "content");
        if (event instanceof SddrFlowEvent.CountrySelected) {
            SddrFlowEvent.CountrySelected countrySelected = (SddrFlowEvent.CountrySelected) event;
            SddrFlowState sddrFlowStateCopy$default2 = SddrFlowState.copy$default(countrySelected.getState(), null, null, null, countrySelected.getCountry(), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
            return getNextPrepDestination(sddrFlowStateCopy$default2.getDocumentTypeToUpload(), content, sddrFlowStateCopy$default2, true, true, true);
        }
        if (event instanceof SddrFlowEvent.DocumentTypeSelected) {
            SddrFlowEvent.DocumentTypeSelected documentTypeSelected = (SddrFlowEvent.DocumentTypeSelected) event;
            SddrFlowState sddrFlowStateCopy$default3 = SddrFlowState.copy$default(documentTypeSelected.getState(), null, null, documentTypeSelected.getType(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
            return getNextPrepDestination(sddrFlowStateCopy$default3.getDocumentTypeToUpload(), content, sddrFlowStateCopy$default3, true, false, true);
        }
        if (event instanceof SddrFlowEvent.PdfAccepted) {
            return new SddrDestinationEvent.Next(new SddrDestination.Submission(((SddrFlowEvent.PdfAccepted) event).getState(), content.getId(), content.getRequestDocumentType(), mockRequests), true);
        }
        if (event instanceof SddrFlowEvent.PdfUploaded) {
            SddrFlowEvent.PdfUploaded pdfUploaded = (SddrFlowEvent.PdfUploaded) event;
            ApiDocumentRequestContent.PdfUploadScreen pdfUploadScreen = content.getPdfUploadScreen().get(pdfUploaded.getState().getDocumentTypeToUpload());
            if (pdfUploadScreen == null) {
                throw new SddrException("No pdf review screen found for " + pdfUploaded.getState().getDocumentTypeToUpload());
            }
            return new SddrDestinationEvent.Next(new SddrDestination.PdfReview(SddrFlowState.copy$default(pdfUploaded.getState(), null, null, null, null, pdfUploaded.getDocument(), null, null, null, 239, null), pdfUploaded.getDocument(), pdfUploadScreen), true);
        }
        if (event instanceof SddrFlowEvent.PhotoAccepted) {
            SddrFlowEvent.PhotoAccepted photoAccepted = (SddrFlowEvent.PhotoAccepted) event;
            return getNextPhotoDestination(SddrFlowState.copy$default(photoAccepted.getState(), null, null, null, null, null, CollectionsKt.drop(photoAccepted.getState().getCaptureQueue(), 1), null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null), content, mockRequests);
        }
        if (event instanceof SddrFlowEvent.PhotoRequested) {
            SddrFlowEvent.PhotoRequested photoRequested = (SddrFlowEvent.PhotoRequested) event;
            ApiDocumentRequestContent.CaptureScreen captureScreen = content.getCaptureScreen().get(photoRequested.getState().getDocumentTypeToUpload());
            if (captureScreen == null || (sides = captureScreen.getSides()) == null) {
                throw new SddrException("No capture screen found for " + photoRequested.getState().getDocumentTypeToUpload());
            }
            List<ApiDocumentRequestContent.CaptureScreen.CaptureSide> list = sides;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ApiDocumentRequestContent.CaptureScreen.CaptureSide) it.next()).getSide());
            }
            return getNextPhotoDestination(SddrFlowState.copy$default(photoRequested.getState(), null, null, null, null, null, arrayList, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null), content, mockRequests);
        }
        if (event instanceof SddrFlowEvent.PhotoTaken) {
            SddrFlowEvent.PhotoTaken photoTaken = (SddrFlowEvent.PhotoTaken) event;
            int i = WhenMappings.$EnumSwitchMapping$0[photoTaken.getDocument().getSide().ordinal()];
            if (i == 1) {
                sddrFlowStateCopy$default = SddrFlowState.copy$default(photoTaken.getState(), null, null, null, null, null, null, photoTaken.getDocument(), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
            } else {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new SddrException("Expected either FRONT of BACK side but found " + photoTaken.getDocument().getSide());
                }
                sddrFlowStateCopy$default = SddrFlowState.copy$default(photoTaken.getState(), null, null, null, null, null, null, null, photoTaken.getDocument(), EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
            return new SddrDestinationEvent.Next(new SddrDestination.PhotoReview(sddrFlowStateCopy$default, photoTaken.getDocument()), true);
        }
        if (event instanceof SddrFlowEvent.Start) {
            SddrFlowEvent.Start start = (SddrFlowEvent.Start) event;
            return getNextPrepDestination(start.getState().getDocumentTypeToUpload(), content, start.getState(), false, false, false);
        }
        if (event instanceof SddrFlowEvent.SubmissionError) {
            return SddrDestinationEvent.Error.INSTANCE;
        }
        if (event instanceof SddrFlowEvent.SubmissionSuccess) {
            return SddrDestinationEvent.Finish.INSTANCE;
        }
        if (Intrinsics.areEqual(event, SddrFlowEvent.PopBack.INSTANCE)) {
            return SddrDestinationEvent.Prev.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final SddrDestinationEvent getNextPhotoDestination(SddrFlowState newState, ApiDocumentRequestContent content, boolean mockRequests) throws SddrException {
        Object next;
        ApiDocumentRequestContent.CaptureScreen captureScreen = content.getCaptureScreen().get(newState.getDocumentTypeToUpload());
        if (captureScreen == null) {
            throw new SddrException("No capture screen found for " + newState.getDocumentTypeToUpload());
        }
        IdDocument.Side side = (IdDocument.Side) CollectionsKt.firstOrNull((List) newState.getCaptureQueue());
        if (side != null) {
            Iterator<T> it = captureScreen.getSides().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ApiDocumentRequestContent.CaptureScreen.CaptureSide) next).getSide() == side) {
                    break;
                }
            }
            ApiDocumentRequestContent.CaptureScreen.CaptureSide captureSide = (ApiDocumentRequestContent.CaptureScreen.CaptureSide) next;
            if (captureSide == null) {
                throw new SddrException("Capture screen does not have " + side + " in list of sides");
            }
            return new SddrDestinationEvent.Next(new SddrDestination.Capture(newState, captureSide, captureScreen.getRequirementsButtonTitle(), captureScreen.getRequirementsSheetContent()), true);
        }
        if (newState.getFrontPhotoToUpload() == null) {
            throw new SddrException("Capture queue is empty but no front side was uploaded");
        }
        return new SddrDestinationEvent.Next(new SddrDestination.Submission(newState, content.getId(), content.getRequestDocumentType(), mockRequests), true);
    }

    private final SddrDestinationEvent getNextPrepDestination(String documentTypeToUpload, ApiDocumentRequestContent content, SddrFlowState newState, boolean ignoreDocType, boolean ignoreCountry, boolean addToBackStack) throws SddrException {
        ApiDocumentRequestContent.DocumentTypeScreen documentTypeScreen = content.getDocumentTypeScreen();
        if (!ignoreDocType && documentTypeScreen != null) {
            return new SddrDestinationEvent.Next(new SddrDestination.DocumentType(newState, documentTypeScreen), addToBackStack);
        }
        ApiDocumentRequestContent.CountryScreen countryScreen = content.getCountryScreen().get(documentTypeToUpload);
        if (countryScreen != null && !ignoreCountry && countryScreen.getRequired()) {
            return new SddrDestinationEvent.Next(new SddrDestination.Country(newState, countryScreen), addToBackStack);
        }
        ApiDocumentRequestContent.SplashScreen splashScreen = content.getSplashScreen().get(documentTypeToUpload);
        if (splashScreen != null) {
            return new SddrDestinationEvent.Next(new SddrDestination.Splash(newState, splashScreen), addToBackStack);
        }
        throw new SddrException("No splash screen found for " + documentTypeToUpload);
    }
}

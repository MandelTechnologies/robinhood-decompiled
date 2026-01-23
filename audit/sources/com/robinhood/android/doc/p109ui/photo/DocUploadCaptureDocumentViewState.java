package com.robinhood.android.doc.p109ui.photo;

import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.IdDocument;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadCaptureDocumentViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/DocUploadCaptureDocumentViewState;", "", "loading", "", "userLocality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "activeSide", "Lcom/robinhood/models/api/IdDocument$Side;", "requirementsTitle", "", "requirementsMarkdownBody", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/doc/ui/photo/PhotoEvent;", "<init>", "(ZLcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/models/api/IdDocument$Side;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/udf/UiEvent;)V", "getLoading", "()Z", "getUserLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getActiveSide", "()Lcom/robinhood/models/api/IdDocument$Side;", "getRequirementsTitle", "()Ljava/lang/String;", "getRequirementsMarkdownBody", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "enableRequirementsButton", "getEnableRequirementsButton", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DocUploadCaptureDocumentViewState {
    public static final int $stable = 8;
    private final IdDocument.Side activeSide;
    private final boolean enableRequirementsButton;
    private final UiEvent<PhotoEvent> event;
    private final boolean loading;
    private final String requirementsMarkdownBody;
    private final String requirementsTitle;
    private final CountryCode.Supported userLocality;

    public static /* synthetic */ DocUploadCaptureDocumentViewState copy$default(DocUploadCaptureDocumentViewState docUploadCaptureDocumentViewState, boolean z, CountryCode.Supported supported, IdDocument.Side side, String str, String str2, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = docUploadCaptureDocumentViewState.loading;
        }
        if ((i & 2) != 0) {
            supported = docUploadCaptureDocumentViewState.userLocality;
        }
        if ((i & 4) != 0) {
            side = docUploadCaptureDocumentViewState.activeSide;
        }
        if ((i & 8) != 0) {
            str = docUploadCaptureDocumentViewState.requirementsTitle;
        }
        if ((i & 16) != 0) {
            str2 = docUploadCaptureDocumentViewState.requirementsMarkdownBody;
        }
        if ((i & 32) != 0) {
            uiEvent = docUploadCaptureDocumentViewState.event;
        }
        String str3 = str2;
        UiEvent uiEvent2 = uiEvent;
        return docUploadCaptureDocumentViewState.copy(z, supported, side, str, str3, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component2, reason: from getter */
    public final CountryCode.Supported getUserLocality() {
        return this.userLocality;
    }

    /* renamed from: component3, reason: from getter */
    public final IdDocument.Side getActiveSide() {
        return this.activeSide;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRequirementsTitle() {
        return this.requirementsTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRequirementsMarkdownBody() {
        return this.requirementsMarkdownBody;
    }

    public final UiEvent<PhotoEvent> component6() {
        return this.event;
    }

    public final DocUploadCaptureDocumentViewState copy(boolean loading, CountryCode.Supported userLocality, IdDocument.Side activeSide, String requirementsTitle, String requirementsMarkdownBody, UiEvent<PhotoEvent> event) {
        Intrinsics.checkNotNullParameter(activeSide, "activeSide");
        Intrinsics.checkNotNullParameter(requirementsTitle, "requirementsTitle");
        Intrinsics.checkNotNullParameter(requirementsMarkdownBody, "requirementsMarkdownBody");
        return new DocUploadCaptureDocumentViewState(loading, userLocality, activeSide, requirementsTitle, requirementsMarkdownBody, event);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocUploadCaptureDocumentViewState)) {
            return false;
        }
        DocUploadCaptureDocumentViewState docUploadCaptureDocumentViewState = (DocUploadCaptureDocumentViewState) other;
        return this.loading == docUploadCaptureDocumentViewState.loading && Intrinsics.areEqual(this.userLocality, docUploadCaptureDocumentViewState.userLocality) && this.activeSide == docUploadCaptureDocumentViewState.activeSide && Intrinsics.areEqual(this.requirementsTitle, docUploadCaptureDocumentViewState.requirementsTitle) && Intrinsics.areEqual(this.requirementsMarkdownBody, docUploadCaptureDocumentViewState.requirementsMarkdownBody) && Intrinsics.areEqual(this.event, docUploadCaptureDocumentViewState.event);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.loading) * 31;
        CountryCode.Supported supported = this.userLocality;
        int iHashCode2 = (((((((iHashCode + (supported == null ? 0 : supported.hashCode())) * 31) + this.activeSide.hashCode()) * 31) + this.requirementsTitle.hashCode()) * 31) + this.requirementsMarkdownBody.hashCode()) * 31;
        UiEvent<PhotoEvent> uiEvent = this.event;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "DocUploadCaptureDocumentViewState(loading=" + this.loading + ", userLocality=" + this.userLocality + ", activeSide=" + this.activeSide + ", requirementsTitle=" + this.requirementsTitle + ", requirementsMarkdownBody=" + this.requirementsMarkdownBody + ", event=" + this.event + ")";
    }

    public DocUploadCaptureDocumentViewState(boolean z, CountryCode.Supported supported, IdDocument.Side activeSide, String requirementsTitle, String requirementsMarkdownBody, UiEvent<PhotoEvent> uiEvent) {
        Intrinsics.checkNotNullParameter(activeSide, "activeSide");
        Intrinsics.checkNotNullParameter(requirementsTitle, "requirementsTitle");
        Intrinsics.checkNotNullParameter(requirementsMarkdownBody, "requirementsMarkdownBody");
        this.loading = z;
        this.userLocality = supported;
        this.activeSide = activeSide;
        this.requirementsTitle = requirementsTitle;
        this.requirementsMarkdownBody = requirementsMarkdownBody;
        this.event = uiEvent;
        this.enableRequirementsButton = requirementsTitle.length() > 0 && requirementsMarkdownBody.length() > 0;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final CountryCode.Supported getUserLocality() {
        return this.userLocality;
    }

    public /* synthetic */ DocUploadCaptureDocumentViewState(boolean z, CountryCode.Supported supported, IdDocument.Side side, String str, String str2, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, supported, (i & 4) != 0 ? IdDocument.Side.UNKNOWN : side, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : uiEvent);
    }

    public final IdDocument.Side getActiveSide() {
        return this.activeSide;
    }

    public final String getRequirementsTitle() {
        return this.requirementsTitle;
    }

    public final String getRequirementsMarkdownBody() {
        return this.requirementsMarkdownBody;
    }

    public final UiEvent<PhotoEvent> getEvent() {
        return this.event;
    }

    public final boolean getEnableRequirementsButton() {
        return this.enableRequirementsButton;
    }
}

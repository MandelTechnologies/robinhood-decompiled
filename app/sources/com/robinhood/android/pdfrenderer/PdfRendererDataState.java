package com.robinhood.android.pdfrenderer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PdfRendererDataState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/PdfRendererDataState;", "", "title", "", "rhPdfRenderer", "Lcom/robinhood/android/pdfrenderer/RhPdfRenderer;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/pdfrenderer/RhPdfRenderer;)V", "getTitle", "()Ljava/lang/String;", "getRhPdfRenderer", "()Lcom/robinhood/android/pdfrenderer/RhPdfRenderer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PdfRendererDataState {
    public static final int $stable = 8;
    private final RhPdfRenderer rhPdfRenderer;
    private final String title;

    public static /* synthetic */ PdfRendererDataState copy$default(PdfRendererDataState pdfRendererDataState, String str, RhPdfRenderer rhPdfRenderer, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdfRendererDataState.title;
        }
        if ((i & 2) != 0) {
            rhPdfRenderer = pdfRendererDataState.rhPdfRenderer;
        }
        return pdfRendererDataState.copy(str, rhPdfRenderer);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final RhPdfRenderer getRhPdfRenderer() {
        return this.rhPdfRenderer;
    }

    public final PdfRendererDataState copy(String title, RhPdfRenderer rhPdfRenderer) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new PdfRendererDataState(title, rhPdfRenderer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfRendererDataState)) {
            return false;
        }
        PdfRendererDataState pdfRendererDataState = (PdfRendererDataState) other;
        return Intrinsics.areEqual(this.title, pdfRendererDataState.title) && Intrinsics.areEqual(this.rhPdfRenderer, pdfRendererDataState.rhPdfRenderer);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        RhPdfRenderer rhPdfRenderer = this.rhPdfRenderer;
        return iHashCode + (rhPdfRenderer == null ? 0 : rhPdfRenderer.hashCode());
    }

    public String toString() {
        return "PdfRendererDataState(title=" + this.title + ", rhPdfRenderer=" + this.rhPdfRenderer + ")";
    }

    public PdfRendererDataState(String title, RhPdfRenderer rhPdfRenderer) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.rhPdfRenderer = rhPdfRenderer;
    }

    public /* synthetic */ PdfRendererDataState(String str, RhPdfRenderer rhPdfRenderer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : rhPdfRenderer);
    }

    public final String getTitle() {
        return this.title;
    }

    public final RhPdfRenderer getRhPdfRenderer() {
        return this.rhPdfRenderer;
    }
}

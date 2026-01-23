package com.robinhood.android.doc.serverdriven.pdfupload;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrPdfUploadDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadDataState;", "", "pageCount", "", "currentIndex", "currentPage", "Landroid/graphics/Bitmap;", "isPagePending", "", "<init>", "(IILandroid/graphics/Bitmap;Z)V", "getPageCount", "()I", "getCurrentIndex", "getCurrentPage", "()Landroid/graphics/Bitmap;", "()Z", "isLoading", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SddrPdfUploadDataState {
    public static final int $stable = 8;
    private final int currentIndex;
    private final Bitmap currentPage;
    private final boolean isPagePending;
    private final int pageCount;

    public SddrPdfUploadDataState() {
        this(0, 0, null, false, 15, null);
    }

    public static /* synthetic */ SddrPdfUploadDataState copy$default(SddrPdfUploadDataState sddrPdfUploadDataState, int i, int i2, Bitmap bitmap, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sddrPdfUploadDataState.pageCount;
        }
        if ((i3 & 2) != 0) {
            i2 = sddrPdfUploadDataState.currentIndex;
        }
        if ((i3 & 4) != 0) {
            bitmap = sddrPdfUploadDataState.currentPage;
        }
        if ((i3 & 8) != 0) {
            z = sddrPdfUploadDataState.isPagePending;
        }
        return sddrPdfUploadDataState.copy(i, i2, bitmap, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPageCount() {
        return this.pageCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final Bitmap getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPagePending() {
        return this.isPagePending;
    }

    public final SddrPdfUploadDataState copy(int pageCount, int currentIndex, Bitmap currentPage, boolean isPagePending) {
        return new SddrPdfUploadDataState(pageCount, currentIndex, currentPage, isPagePending);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SddrPdfUploadDataState)) {
            return false;
        }
        SddrPdfUploadDataState sddrPdfUploadDataState = (SddrPdfUploadDataState) other;
        return this.pageCount == sddrPdfUploadDataState.pageCount && this.currentIndex == sddrPdfUploadDataState.currentIndex && Intrinsics.areEqual(this.currentPage, sddrPdfUploadDataState.currentPage) && this.isPagePending == sddrPdfUploadDataState.isPagePending;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.pageCount) * 31) + Integer.hashCode(this.currentIndex)) * 31;
        Bitmap bitmap = this.currentPage;
        return ((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Boolean.hashCode(this.isPagePending);
    }

    public String toString() {
        return "SddrPdfUploadDataState(pageCount=" + this.pageCount + ", currentIndex=" + this.currentIndex + ", currentPage=" + this.currentPage + ", isPagePending=" + this.isPagePending + ")";
    }

    public SddrPdfUploadDataState(int i, int i2, Bitmap bitmap, boolean z) {
        this.pageCount = i;
        this.currentIndex = i2;
        this.currentPage = bitmap;
        this.isPagePending = z;
    }

    public /* synthetic */ SddrPdfUploadDataState(int i, int i2, Bitmap bitmap, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : bitmap, (i3 & 8) != 0 ? false : z);
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final Bitmap getCurrentPage() {
        return this.currentPage;
    }

    public final boolean isPagePending() {
        return this.isPagePending;
    }

    public final boolean isLoading() {
        return this.pageCount == -1 || this.currentPage == null;
    }
}

package com.robinhood.android.doc.p109ui.photo;

import android.graphics.Bitmap;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DocUploadReviewPdfViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J^\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u001c\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/DocUploadReviewPdfViewState;", "", "pageCount", "", "selectedPage", "currentPage", "Landroid/graphics/Bitmap;", "isLoading", "", "exceedsFileSizeLimit", "Lcom/robinhood/udf/UiEvent;", "errors", "", "<init>", "(Ljava/lang/Integer;ILandroid/graphics/Bitmap;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getPageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelectedPage", "()I", "getCurrentPage", "()Landroid/graphics/Bitmap;", "()Z", "getExceedsFileSizeLimit", "()Lcom/robinhood/udf/UiEvent;", "getErrors", "prevBtnEnabled", "getPrevBtnEnabled", "nextBtnEnabled", "getNextBtnEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;ILandroid/graphics/Bitmap;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)Lcom/robinhood/android/doc/ui/photo/DocUploadReviewPdfViewState;", "equals", "other", "hashCode", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class DocUploadReviewPdfViewState {
    public static final int $stable = 8;
    private final Bitmap currentPage;
    private final UiEvent<Throwable> errors;
    private final UiEvent<Boolean> exceedsFileSizeLimit;
    private final boolean isLoading;
    private final Integer pageCount;
    private final int selectedPage;

    public DocUploadReviewPdfViewState() {
        this(null, 0, null, false, null, null, 63, null);
    }

    public static /* synthetic */ DocUploadReviewPdfViewState copy$default(DocUploadReviewPdfViewState docUploadReviewPdfViewState, Integer num, int i, Bitmap bitmap, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = docUploadReviewPdfViewState.pageCount;
        }
        if ((i2 & 2) != 0) {
            i = docUploadReviewPdfViewState.selectedPage;
        }
        if ((i2 & 4) != 0) {
            bitmap = docUploadReviewPdfViewState.currentPage;
        }
        if ((i2 & 8) != 0) {
            z = docUploadReviewPdfViewState.isLoading;
        }
        if ((i2 & 16) != 0) {
            uiEvent = docUploadReviewPdfViewState.exceedsFileSizeLimit;
        }
        if ((i2 & 32) != 0) {
            uiEvent2 = docUploadReviewPdfViewState.errors;
        }
        UiEvent uiEvent3 = uiEvent;
        UiEvent uiEvent4 = uiEvent2;
        return docUploadReviewPdfViewState.copy(num, i, bitmap, z, uiEvent3, uiEvent4);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getPageCount() {
        return this.pageCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSelectedPage() {
        return this.selectedPage;
    }

    /* renamed from: component3, reason: from getter */
    public final Bitmap getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<Boolean> component5() {
        return this.exceedsFileSizeLimit;
    }

    public final UiEvent<Throwable> component6() {
        return this.errors;
    }

    public final DocUploadReviewPdfViewState copy(Integer pageCount, int selectedPage, Bitmap currentPage, boolean isLoading, UiEvent<Boolean> exceedsFileSizeLimit, UiEvent<Throwable> errors) {
        return new DocUploadReviewPdfViewState(pageCount, selectedPage, currentPage, isLoading, exceedsFileSizeLimit, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocUploadReviewPdfViewState)) {
            return false;
        }
        DocUploadReviewPdfViewState docUploadReviewPdfViewState = (DocUploadReviewPdfViewState) other;
        return Intrinsics.areEqual(this.pageCount, docUploadReviewPdfViewState.pageCount) && this.selectedPage == docUploadReviewPdfViewState.selectedPage && Intrinsics.areEqual(this.currentPage, docUploadReviewPdfViewState.currentPage) && this.isLoading == docUploadReviewPdfViewState.isLoading && Intrinsics.areEqual(this.exceedsFileSizeLimit, docUploadReviewPdfViewState.exceedsFileSizeLimit) && Intrinsics.areEqual(this.errors, docUploadReviewPdfViewState.errors);
    }

    public int hashCode() {
        Integer num = this.pageCount;
        int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.selectedPage)) * 31;
        Bitmap bitmap = this.currentPage;
        int iHashCode2 = (((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        UiEvent<Boolean> uiEvent = this.exceedsFileSizeLimit;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.errors;
        return iHashCode3 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "DocUploadReviewPdfViewState(pageCount=" + this.pageCount + ", selectedPage=" + this.selectedPage + ", currentPage=" + this.currentPage + ", isLoading=" + this.isLoading + ", exceedsFileSizeLimit=" + this.exceedsFileSizeLimit + ", errors=" + this.errors + ")";
    }

    public DocUploadReviewPdfViewState(Integer num, int i, Bitmap bitmap, boolean z, UiEvent<Boolean> uiEvent, UiEvent<Throwable> uiEvent2) {
        this.pageCount = num;
        this.selectedPage = i;
        this.currentPage = bitmap;
        this.isLoading = z;
        this.exceedsFileSizeLimit = uiEvent;
        this.errors = uiEvent2;
    }

    public /* synthetic */ DocUploadReviewPdfViewState(Integer num, int i, Bitmap bitmap, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : bitmap, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? null : uiEvent, (i2 & 32) != 0 ? null : uiEvent2);
    }

    public final Integer getPageCount() {
        return this.pageCount;
    }

    public final int getSelectedPage() {
        return this.selectedPage;
    }

    public final Bitmap getCurrentPage() {
        return this.currentPage;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Boolean> getExceedsFileSizeLimit() {
        return this.exceedsFileSizeLimit;
    }

    public final UiEvent<Throwable> getErrors() {
        return this.errors;
    }

    public final boolean getPrevBtnEnabled() {
        return this.selectedPage > 0 && !this.isLoading;
    }

    public final boolean getNextBtnEnabled() {
        if (this.isLoading) {
            return false;
        }
        return this.pageCount == null || this.selectedPage < this.pageCount.intValue() - 1;
    }
}

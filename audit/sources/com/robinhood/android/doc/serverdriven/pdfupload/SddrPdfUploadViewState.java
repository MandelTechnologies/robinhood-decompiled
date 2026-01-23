package com.robinhood.android.doc.serverdriven.pdfupload;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrPdfUploadViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadViewState;", "", "page", "Landroid/graphics/Bitmap;", "showPrevButton", "", "showNextButton", "enablePageButtons", "<init>", "(Landroid/graphics/Bitmap;ZZZ)V", "getPage", "()Landroid/graphics/Bitmap;", "getShowPrevButton", "()Z", "getShowNextButton", "getEnablePageButtons", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SddrPdfUploadViewState {
    public static final int $stable = 8;
    private final boolean enablePageButtons;
    private final Bitmap page;
    private final boolean showNextButton;
    private final boolean showPrevButton;

    public static /* synthetic */ SddrPdfUploadViewState copy$default(SddrPdfUploadViewState sddrPdfUploadViewState, Bitmap bitmap, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = sddrPdfUploadViewState.page;
        }
        if ((i & 2) != 0) {
            z = sddrPdfUploadViewState.showPrevButton;
        }
        if ((i & 4) != 0) {
            z2 = sddrPdfUploadViewState.showNextButton;
        }
        if ((i & 8) != 0) {
            z3 = sddrPdfUploadViewState.enablePageButtons;
        }
        return sddrPdfUploadViewState.copy(bitmap, z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final Bitmap getPage() {
        return this.page;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowPrevButton() {
        return this.showPrevButton;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowNextButton() {
        return this.showNextButton;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnablePageButtons() {
        return this.enablePageButtons;
    }

    public final SddrPdfUploadViewState copy(Bitmap page, boolean showPrevButton, boolean showNextButton, boolean enablePageButtons) {
        return new SddrPdfUploadViewState(page, showPrevButton, showNextButton, enablePageButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SddrPdfUploadViewState)) {
            return false;
        }
        SddrPdfUploadViewState sddrPdfUploadViewState = (SddrPdfUploadViewState) other;
        return Intrinsics.areEqual(this.page, sddrPdfUploadViewState.page) && this.showPrevButton == sddrPdfUploadViewState.showPrevButton && this.showNextButton == sddrPdfUploadViewState.showNextButton && this.enablePageButtons == sddrPdfUploadViewState.enablePageButtons;
    }

    public int hashCode() {
        Bitmap bitmap = this.page;
        return ((((((bitmap == null ? 0 : bitmap.hashCode()) * 31) + Boolean.hashCode(this.showPrevButton)) * 31) + Boolean.hashCode(this.showNextButton)) * 31) + Boolean.hashCode(this.enablePageButtons);
    }

    public String toString() {
        return "SddrPdfUploadViewState(page=" + this.page + ", showPrevButton=" + this.showPrevButton + ", showNextButton=" + this.showNextButton + ", enablePageButtons=" + this.enablePageButtons + ")";
    }

    public SddrPdfUploadViewState(Bitmap bitmap, boolean z, boolean z2, boolean z3) {
        this.page = bitmap;
        this.showPrevButton = z;
        this.showNextButton = z2;
        this.enablePageButtons = z3;
    }

    public final Bitmap getPage() {
        return this.page;
    }

    public final boolean getShowPrevButton() {
        return this.showPrevButton;
    }

    public final boolean getShowNextButton() {
        return this.showNextButton;
    }

    public final boolean getEnablePageButtons() {
        return this.enablePageButtons;
    }
}

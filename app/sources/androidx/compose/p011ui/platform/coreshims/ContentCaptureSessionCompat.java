package androidx.compose.p011ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* loaded from: classes.dex */
public class ContentCaptureSessionCompat {
    private final View mView;
    private final Object mWrappedObj;

    public static ContentCaptureSessionCompat toContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        return new ContentCaptureSessionCompat(contentCaptureSession, view);
    }

    private ContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        this.mWrappedObj = contentCaptureSession;
        this.mView = view;
    }

    public AutofillId newAutofillId(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionM317m = ContentCaptureSessionCompat$$ExternalSyntheticApiModelOutline0.m317m(this.mWrappedObj);
        AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(this.mView);
        Objects.requireNonNull(autofillId);
        return Api29Impl.newAutofillId(contentCaptureSessionM317m, autofillId.toAutofillId(), j);
    }

    public ViewStructureCompat newVirtualViewStructure(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ViewStructureCompat.toViewStructureCompat(Api29Impl.newVirtualViewStructure(ContentCaptureSessionCompat$$ExternalSyntheticApiModelOutline0.m317m(this.mWrappedObj), autofillId, j));
        }
        return null;
    }

    public void notifyViewAppeared(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.notifyViewAppeared(ContentCaptureSessionCompat$$ExternalSyntheticApiModelOutline0.m317m(this.mWrappedObj), viewStructure);
        }
    }

    public void notifyViewDisappeared(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.notifyViewDisappeared(ContentCaptureSessionCompat$$ExternalSyntheticApiModelOutline0.m317m(this.mWrappedObj), autofillId);
        }
    }

    public void flush() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionM317m = ContentCaptureSessionCompat$$ExternalSyntheticApiModelOutline0.m317m(this.mWrappedObj);
            AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(this.mView);
            Objects.requireNonNull(autofillId);
            Api29Impl.notifyViewsDisappeared(contentCaptureSessionM317m, autofillId.toAutofillId(), new long[]{Long.MIN_VALUE});
        }
    }

    public void notifyViewTextChanged(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.notifyViewTextChanged(ContentCaptureSessionCompat$$ExternalSyntheticApiModelOutline0.m317m(this.mWrappedObj), autofillId, charSequence);
        }
    }

    /* loaded from: classes4.dex */
    private static class Api29Impl {
        static void notifyViewsDisappeared(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }

        static void notifyViewDisappeared(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        static void notifyViewAppeared(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        static ViewStructure newVirtualViewStructure(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        static AutofillId newAutofillId(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        public static void notifyViewTextChanged(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }
    }
}

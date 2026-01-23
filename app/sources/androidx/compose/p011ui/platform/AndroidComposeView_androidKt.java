package androidx.compose.p011ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p011ui.graphics.Matrix;
import androidx.compose.p011ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.p011ui.platform.coreshims.ViewCompatShims;
import androidx.compose.p011ui.text.input.TextInputService2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\f\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a2\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\".\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m3636d2 = {"Landroidx/compose/ui/graphics/Matrix;", "other", "", "preTransform-JiSxe2E", "([F[F)V", "preTransform", "", "x", "y", "tmpMatrix", "preTranslate-cG2Xzmc", "([FFF[F)V", "preTranslate", "m1", "", "row", "m2", "column", "dot-p89u6pk", "([FI[FI)F", "dot", "Landroid/view/View;", "", "containsDescendant", "(Landroid/view/View;Landroid/view/View;)Z", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSessionCompat", "(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "platformTextInputServiceInterceptor", "Lkotlin/jvm/functions/Function1;", "getPlatformTextInputServiceInterceptor", "()Lkotlin/jvm/functions/Function1;", "setPlatformTextInputServiceInterceptor", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidComposeView_androidKt {
    private static Function1<? super TextInputService2, ? extends TextInputService2> platformTextInputServiceInterceptor = new Function1<TextInputService2, TextInputService2>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // kotlin.jvm.functions.Function1
        public final TextInputService2 invoke(TextInputService2 textInputService2) {
            return textInputService2;
        }
    };

    /* renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m7432dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    public static final Function1<TextInputService2, TextInputService2> getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m7433preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM7432dotp89u6pk = m7432dotp89u6pk(fArr2, 0, fArr, 0);
        float fM7432dotp89u6pk2 = m7432dotp89u6pk(fArr2, 0, fArr, 1);
        float fM7432dotp89u6pk3 = m7432dotp89u6pk(fArr2, 0, fArr, 2);
        float fM7432dotp89u6pk4 = m7432dotp89u6pk(fArr2, 0, fArr, 3);
        float fM7432dotp89u6pk5 = m7432dotp89u6pk(fArr2, 1, fArr, 0);
        float fM7432dotp89u6pk6 = m7432dotp89u6pk(fArr2, 1, fArr, 1);
        float fM7432dotp89u6pk7 = m7432dotp89u6pk(fArr2, 1, fArr, 2);
        float fM7432dotp89u6pk8 = m7432dotp89u6pk(fArr2, 1, fArr, 3);
        float fM7432dotp89u6pk9 = m7432dotp89u6pk(fArr2, 2, fArr, 0);
        float fM7432dotp89u6pk10 = m7432dotp89u6pk(fArr2, 2, fArr, 1);
        float fM7432dotp89u6pk11 = m7432dotp89u6pk(fArr2, 2, fArr, 2);
        float fM7432dotp89u6pk12 = m7432dotp89u6pk(fArr2, 2, fArr, 3);
        float fM7432dotp89u6pk13 = m7432dotp89u6pk(fArr2, 3, fArr, 0);
        float fM7432dotp89u6pk14 = m7432dotp89u6pk(fArr2, 3, fArr, 1);
        float fM7432dotp89u6pk15 = m7432dotp89u6pk(fArr2, 3, fArr, 2);
        float fM7432dotp89u6pk16 = m7432dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM7432dotp89u6pk;
        fArr[1] = fM7432dotp89u6pk2;
        fArr[2] = fM7432dotp89u6pk3;
        fArr[3] = fM7432dotp89u6pk4;
        fArr[4] = fM7432dotp89u6pk5;
        fArr[5] = fM7432dotp89u6pk6;
        fArr[6] = fM7432dotp89u6pk7;
        fArr[7] = fM7432dotp89u6pk8;
        fArr[8] = fM7432dotp89u6pk9;
        fArr[9] = fM7432dotp89u6pk10;
        fArr[10] = fM7432dotp89u6pk11;
        fArr[11] = fM7432dotp89u6pk12;
        fArr[12] = fM7432dotp89u6pk13;
        fArr[13] = fM7432dotp89u6pk14;
        fArr[14] = fM7432dotp89u6pk15;
        fArr[15] = fM7432dotp89u6pk16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTranslate-cG2Xzmc, reason: not valid java name */
    public static final void m7434preTranslatecG2Xzmc(float[] fArr, float f, float f2, float[] fArr2) {
        Matrix.m6786resetimpl(fArr2);
        Matrix.m6793translateimpl$default(fArr2, f, f2, 0.0f, 4, null);
        m7433preTransformJiSxe2E(fArr, fArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsDescendant(View view, View view2) {
        if (Intrinsics.areEqual(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentCaptureSessionCompat getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }
}

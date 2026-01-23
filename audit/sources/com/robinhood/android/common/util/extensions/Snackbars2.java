package com.robinhood.android.common.util.extensions;

import android.widget.TextView;
import com.google.android.material.R$id;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Snackbars.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"setMaxTextViewLines", "Lcom/google/android/material/snackbar/Snackbar;", "textViewLines", "", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.util.extensions.SnackbarsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Snackbars2 {
    public static final Snackbar setMaxTextViewLines(Snackbar snackbar, int i) {
        Intrinsics.checkNotNullParameter(snackbar, "<this>");
        ((TextView) snackbar.getView().findViewById(R$id.snackbar_text)).setMaxLines(i);
        return snackbar;
    }
}

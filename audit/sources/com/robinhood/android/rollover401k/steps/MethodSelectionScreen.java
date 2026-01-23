package com.robinhood.android.rollover401k.steps;

import android.net.Uri;
import kotlin.Metadata;

/* compiled from: MethodSelectionScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/MethodSelectionCallbacks;", "", "onMethodSelected", "", "deeplink", "Landroid/net/Uri;", "onBackTapped", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.MethodSelectionCallbacks, reason: use source file name */
/* loaded from: classes5.dex */
public interface MethodSelectionScreen {
    void onBackTapped();

    void onMethodSelected(Uri deeplink);
}

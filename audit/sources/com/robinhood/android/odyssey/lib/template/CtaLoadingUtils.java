package com.robinhood.android.odyssey.lib.template;

import com.robinhood.android.odyssey.lib.view.SdBaseButtonView;
import com.robinhood.android.odyssey.lib.view.SdButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.chrono.ChronoLocalDateTime;

/* compiled from: CtaLoadingUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"configCtasOnLoading", "", "primaryCta", "Lcom/robinhood/android/odyssey/lib/view/SdButton;", "secondaryCta", "Lcom/robinhood/android/odyssey/lib/view/SdBaseButtonView;", "isLoading", "", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.CtaLoadingUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class CtaLoadingUtils {
    public static final void configCtasOnLoading(SdButton primaryCta, SdBaseButtonView secondaryCta, boolean z) {
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(secondaryCta, "secondaryCta");
        if (primaryCta.getLastClickTime().compareTo((ChronoLocalDateTime<?>) secondaryCta.getLastClickTime()) > 0) {
            primaryCta.setLoading(z);
        } else if (primaryCta.getLastClickTime().compareTo((ChronoLocalDateTime<?>) secondaryCta.getLastClickTime()) < 0) {
            if (secondaryCta instanceof SdButton) {
                ((SdButton) secondaryCta).setLoading(z);
            }
        } else {
            primaryCta.setLoading(false);
            if (secondaryCta instanceof SdButton) {
                ((SdButton) secondaryCta).setLoading(false);
            }
        }
        primaryCta.setEnabled(!z);
        secondaryCta.requireSdView().setEnabled(!z);
        primaryCta.setClickable(!z);
        secondaryCta.requireSdView().setClickable(!z);
    }
}

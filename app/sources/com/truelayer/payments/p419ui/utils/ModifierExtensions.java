package com.truelayer.payments.p419ui.utils;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModifierExtensions.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, m3636d2 = {"systemBarSafeAreaAndImePadding", "Landroidx/compose/ui/Modifier;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.utils.ModifierExtensionsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ModifierExtensions {
    public static final Modifier systemBarSafeAreaAndImePadding(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return WindowInsetsPadding_androidKt.mandatorySystemGesturesPadding(WindowInsetsPadding_androidKt.displayCutoutPadding(WindowInsetsPadding_androidKt.safeGesturesPadding(WindowInsetsPadding_androidKt.safeContentPadding(WindowInsetsPadding_androidKt.systemBarsPadding(WindowInsetsPadding_androidKt.statusBarsPadding(WindowInsetsPadding_androidKt.imePadding(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier))))))));
    }
}

package com.robinhood.android.supportchat.thread.compose;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.supportchat.thread.compose.CxChatSuggestedResponse;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CxChatSuggestedResponse.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/ChatbotChipDefaults;", "", "<init>", "()V", "shapeRadius", "Landroidx/compose/ui/unit/Dp;", "getShapeRadius-D9Ej5fM", "()F", "F", "outlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "paddingHorizontal", "getPaddingHorizontal-D9Ej5fM", "paddingVertical", "getPaddingVertical-D9Ej5fM", "defaultColors", "Lcom/robinhood/android/supportchat/thread/compose/ChatbotChip$Colors;", "getDefaultColors", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/supportchat/thread/compose/ChatbotChip$Colors;", "pressedColors", "getPressedColors", "disabledColors", "getDisabledColors", "colors", "Lcom/robinhood/android/supportchat/thread/compose/ChatbotChip$StatefulColors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/supportchat/thread/compose/ChatbotChip$StatefulColors;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.supportchat.thread.compose.ChatbotChipDefaults, reason: use source file name */
/* loaded from: classes9.dex */
final class CxChatSuggestedResponse2 {
    public static final CxChatSuggestedResponse2 INSTANCE = new CxChatSuggestedResponse2();
    private static final float shapeRadius = C2002Dp.m7995constructorimpl(20);
    private static final float outlinedBorderSize = C2002Dp.m7995constructorimpl(1);
    private static final float paddingHorizontal = C2002Dp.m7995constructorimpl(16);
    private static final float paddingVertical = C2002Dp.m7995constructorimpl(8);

    private CxChatSuggestedResponse2() {
    }

    /* renamed from: getShapeRadius-D9Ej5fM, reason: not valid java name */
    public final float m19157getShapeRadiusD9Ej5fM() {
        return shapeRadius;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m19154getOutlinedBorderSizeD9Ej5fM() {
        return outlinedBorderSize;
    }

    /* renamed from: getPaddingHorizontal-D9Ej5fM, reason: not valid java name */
    public final float m19155getPaddingHorizontalD9Ej5fM() {
        return paddingHorizontal;
    }

    /* renamed from: getPaddingVertical-D9Ej5fM, reason: not valid java name */
    public final float m19156getPaddingVerticalD9Ej5fM() {
        return paddingVertical;
    }

    @JvmName
    public final CxChatSuggestedResponse.Colors getDefaultColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(806113700, i, -1, "com.robinhood.android.supportchat.thread.compose.ChatbotChipDefaults.<get-defaultColors> (CxChatSuggestedResponse.kt:121)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        CxChatSuggestedResponse.Colors colors = new CxChatSuggestedResponse.Colors(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colors;
    }

    @JvmName
    public final CxChatSuggestedResponse.Colors getPressedColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032354244, i, -1, "com.robinhood.android.supportchat.thread.compose.ChatbotChipDefaults.<get-pressedColors> (CxChatSuggestedResponse.kt:130)");
        }
        CxChatSuggestedResponse.Colors colorsM19142copyt635Npw$default = CxChatSuggestedResponse.Colors.m19142copyt635Npw$default(getDefaultColors(composer, i & 14), 0L, 0L, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU(), 0L, 0L, 27, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colorsM19142copyt635Npw$default;
    }

    @JvmName
    public final CxChatSuggestedResponse.Colors getDisabledColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1970698162, i, -1, "com.robinhood.android.supportchat.thread.compose.ChatbotChipDefaults.<get-disabledColors> (CxChatSuggestedResponse.kt:134)");
        }
        CxChatSuggestedResponse.Colors colorsM19142copyt635Npw$default = CxChatSuggestedResponse.Colors.m19142copyt635Npw$default(getDefaultColors(composer, i & 14), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU(), 0L, 0L, 0L, 0L, 30, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colorsM19142copyt635Npw$default;
    }

    @JvmName
    public final CxChatSuggestedResponse.StatefulColors getColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1008303374, i, -1, "com.robinhood.android.supportchat.thread.compose.ChatbotChipDefaults.<get-colors> (CxChatSuggestedResponse.kt:138)");
        }
        int i2 = i & 14;
        CxChatSuggestedResponse.StatefulColors statefulColors = new CxChatSuggestedResponse.StatefulColors(getDefaultColors(composer, i2), getPressedColors(composer, i2), getDisabledColors(composer, i2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return statefulColors;
    }
}

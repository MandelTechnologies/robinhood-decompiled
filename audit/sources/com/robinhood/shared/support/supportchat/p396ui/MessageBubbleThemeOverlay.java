package com.robinhood.shared.support.supportchat.p396ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.p306v2.ActionMessageStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageBubbleThemeOverlay.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lkotlin/Function0;", "", "content", "UserMessageBubbleThemeOverlay", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/models/api/v2/ActionMessageStyle;", ResourceTypes.STYLE, "", "isSelection", "AgentMessageBubbleThemeOverlay", "(Lcom/robinhood/models/api/v2/ActionMessageStyle;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "lib-support-chat_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.support.supportchat.ui.MessageBubbleThemeOverlayKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MessageBubbleThemeOverlay {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentMessageBubbleThemeOverlay$lambda$1(ActionMessageStyle actionMessageStyle, boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        AgentMessageBubbleThemeOverlay(actionMessageStyle, z, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserMessageBubbleThemeOverlay$lambda$0(Function2 function2, int i, Composer composer, int i2) {
        UserMessageBubbleThemeOverlay(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UserMessageBubbleThemeOverlay(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> content = function2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1932159002);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(content) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1932159002, i2, -1, "com.robinhood.shared.support.supportchat.ui.UserMessageBubbleThemeOverlay (MessageBubbleThemeOverlay.kt:10)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoTheme.getColors(composerStartRestartGroup, i3).getNova(), bentoTheme.getColors(composerStartRestartGroup, i3).getNova(), 0L, 0L, bentoTheme.getColors(composerStartRestartGroup, i3).getPrime(), 0L, 0L, 0L, 0L, function2, composer2, (i2 << 27) & 1879048192, 492);
            content = function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.MessageBubbleThemeOverlayKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageBubbleThemeOverlay.UserMessageBubbleThemeOverlay$lambda$0(content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AgentMessageBubbleThemeOverlay(ActionMessageStyle actionMessageStyle, boolean z, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        boolean z3;
        long jM21371getBg0d7_KjU;
        Composer composer2;
        final boolean z4;
        final ActionMessageStyle actionMessageStyle2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1557096650);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(actionMessageStyle == null ? -1 : actionMessageStyle.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                ActionMessageStyle actionMessageStyle3 = i4 == 0 ? null : actionMessageStyle;
                z3 = i5 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1557096650, i3, -1, "com.robinhood.shared.support.supportchat.ui.AgentMessageBubbleThemeOverlay (MessageBubbleThemeOverlay.kt:24)");
                }
                if (!z3) {
                    composerStartRestartGroup.startReplaceGroup(1721269068);
                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (actionMessageStyle3 == ActionMessageStyle.CARD || actionMessageStyle3 == ActionMessageStyle.CARD_MULTI_SELECT) {
                    composerStartRestartGroup.startReplaceGroup(1721273100);
                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1721274285);
                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                int i6 = (i3 << 21) & 1879048192;
                composer2 = composerStartRestartGroup;
                ActionMessageStyle actionMessageStyle4 = actionMessageStyle3;
                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, 0L, 0L, 0L, jM21371getBg0d7_KjU, 0L, 0L, 0L, 0L, content, composer2, i6, 495);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
                actionMessageStyle2 = actionMessageStyle4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                actionMessageStyle2 = actionMessageStyle;
                composer2 = composerStartRestartGroup;
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.MessageBubbleThemeOverlayKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MessageBubbleThemeOverlay.AgentMessageBubbleThemeOverlay$lambda$1(actionMessageStyle2, z4, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        z2 = z;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!z3) {
            }
            int i62 = (i3 << 21) & 1879048192;
            composer2 = composerStartRestartGroup;
            ActionMessageStyle actionMessageStyle42 = actionMessageStyle3;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, 0L, 0L, 0L, jM21371getBg0d7_KjU, 0L, 0L, 0L, 0L, content, composer2, i62, 495);
            if (ComposerKt.isTraceInProgress()) {
            }
            z4 = z3;
            actionMessageStyle2 = actionMessageStyle42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}

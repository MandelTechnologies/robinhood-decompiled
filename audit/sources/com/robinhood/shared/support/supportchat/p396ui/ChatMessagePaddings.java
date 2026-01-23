package com.robinhood.shared.support.supportchat.p396ui;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.platform.ValueElementSequence;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChatMessagePaddings.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007\u001a\"\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"chatMessageVerticalPadding", "Landroidx/compose/ui/Modifier;", "position", "", "lastMessageIndex", "currentMessage", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage;", "previousMessage", "getMessageTopPadding", "getMessageBottomPadding", "ChatbotMessageSpacingXsmall", "ChatbotMessageSpacingSmall", "ChatbotMessageSpacingDefault", "ChatbotMessageSpacingMedium", "lib-support-chat_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.support.supportchat.ui.ChatMessagePaddingsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ChatMessagePaddings {
    public static final int ChatbotMessageSpacingDefault = 16;
    public static final int ChatbotMessageSpacingMedium = 24;
    public static final int ChatbotMessageSpacingSmall = 12;
    public static final int ChatbotMessageSpacingXsmall = 4;

    public static final int getMessageBottomPadding(int i, int i2) {
        return i == i2 ? 24 : 0;
    }

    @SuppressLint({"UnnecessaryComposedModifier"})
    public static final Modifier chatMessageVerticalPadding(Modifier modifier, int i, int i2, final UiChatMessage currentMessage, final UiChatMessage uiChatMessage) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(currentMessage, "currentMessage");
        final int messageTopPadding = getMessageTopPadding(i, currentMessage, uiChatMessage);
        final int messageBottomPadding = getMessageBottomPadding(i, i2);
        return ComposedModifier2.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessagePaddingsKt$chatMessageVerticalPadding$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("chatbotMessageVerticalPadding");
                inspectorInfo.setValue("Top: " + messageTopPadding + ", Bottom: " + messageBottomPadding);
                inspectorInfo.getProperties().set("curr", currentMessage.getClass().getSimpleName());
                ValueElementSequence properties = inspectorInfo.getProperties();
                UiChatMessage uiChatMessage2 = uiChatMessage;
                properties.set("prev", uiChatMessage2 != null ? uiChatMessage2.getClass().getSimpleName() : null);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessagePaddingsKt.chatMessageVerticalPadding.2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i3) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(1071584561);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1071584561, i3, -1, "com.robinhood.shared.support.supportchat.ui.chatMessageVerticalPadding.<anonymous> (ChatMessagePaddings.kt:34)");
                }
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(composed, 0.0f, C2002Dp.m7995constructorimpl(messageTopPadding), 0.0f, C2002Dp.m7995constructorimpl(messageBottomPadding), 5, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM5146paddingqDBjuR0$default;
            }
        });
    }

    public static final int getMessageTopPadding(int i, UiChatMessage currentMessage, UiChatMessage uiChatMessage) {
        Intrinsics.checkNotNullParameter(currentMessage, "currentMessage");
        if (i == 0 || uiChatMessage == null) {
            return 16;
        }
        if ((currentMessage instanceof UiChatMessage.Metadata.SystemInfo) || (currentMessage instanceof UiChatMessage.Metadata.SystemUploadReceipt)) {
            return 4;
        }
        if ((currentMessage instanceof UiChatMessage.Metadata.Disclaimer) || (currentMessage instanceof UiChatMessage.Metadata.Timestamp) || (currentMessage instanceof UiChatMessage.Unknown)) {
            return 24;
        }
        if (!(currentMessage instanceof UiChatMessage.Regular)) {
            throw new NoWhenBranchMatchedException();
        }
        if (uiChatMessage instanceof UiChatMessage.Metadata.Timestamp) {
            return 12;
        }
        if (uiChatMessage instanceof UiChatMessage.Metadata) {
            return 24;
        }
        return ((uiChatMessage instanceof UiChatMessage.Regular) && ((UiChatMessage.Regular) uiChatMessage).isEndOfMessageBlock()) ? 24 : 4;
    }
}

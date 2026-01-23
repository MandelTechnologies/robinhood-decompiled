package com.robinhood.shared.support.supportchat.p396ui;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.models.p355ui.p356v2.SelectionMenuRowModel;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatAction;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: ChatMessageComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$AgentMessage$2$2$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ChatMessageComposable3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ RoundedCornerShape $bubbleShape;
    final /* synthetic */ UUID $inquiryId;
    final /* synthetic */ UiChatMessage.Regular $message;
    final /* synthetic */ Function1<UiChatAction, Unit> $onClickAction;
    final /* synthetic */ Function1<UiChatMessage.Regular, Unit> $onClickMessageBubble;
    final /* synthetic */ Function1<SelectionMenuRowModel, Unit> $onClickUserSelectionRow;

    /* JADX WARN: Multi-variable type inference failed */
    ChatMessageComposable3(UiChatMessage.Regular regular, UUID uuid, RoundedCornerShape roundedCornerShape, Function1<? super UiChatMessage.Regular, Unit> function1, Function1<? super UiChatAction, Unit> function12, Function1<? super SelectionMenuRowModel, Unit> function13) {
        this.$message = regular;
        this.$inquiryId = uuid;
        this.$bubbleShape = roundedCornerShape;
        this.$onClickMessageBubble = function1;
        this.$onClickAction = function12;
        this.$onClickUserSelectionRow = function13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(781888662, i, -1, "com.robinhood.shared.support.supportchat.ui.AgentMessage.<anonymous>.<anonymous>.<anonymous> (ChatMessageComposable.kt:284)");
        }
        ChatMessageComposable.Bubble(this.$inquiryId, this.$message, ChatMessageComposable.toBubbleBorder(this.$message, composer, 0), this.$bubbleShape, this.$onClickMessageBubble, this.$onClickAction, null, this.$onClickUserSelectionRow, composer, 0, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

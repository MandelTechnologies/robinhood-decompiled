package com.robinhood.shared.support.supportchat.p396ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.shared.models.chat.common.api.ParticipantType;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: SelectionMessageView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.support.supportchat.ui.ComposableSingletons$SelectionMessageViewKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SelectionMessageView {
    public static final SelectionMessageView INSTANCE = new SelectionMessageView();
    private static Function2<Composer, Integer, Unit> lambda$1633236384 = ComposableLambda3.composableLambdaInstance(1633236384, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ComposableSingletons$SelectionMessageViewKt$lambda$1633236384$1
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
                ComposerKt.traceEventStart(1633236384, i, -1, "com.robinhood.shared.support.supportchat.ui.ComposableSingletons$SelectionMessageViewKt.lambda$1633236384.<anonymous> (SelectionMessageView.kt:109)");
            }
            ParticipantType participantType = ParticipantType.USER;
            Instant instant = Instant.parse("2020-03-10T18:35:24.00Z");
            Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
            SelectionMessageView4.SelectionMessageView(new UiChatMessage.Regular.SelectionMessage("preview-sid", 0L, participantType, false, true, instant, null, "2025", new RichText("Current tax year", CollectionsKt.emptyList()), null, null, null), PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(16), 1, null), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$794420876 = ComposableLambda3.composableLambdaInstance(794420876, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ComposableSingletons$SelectionMessageViewKt$lambda$794420876$1
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
                ComposerKt.traceEventStart(794420876, i, -1, "com.robinhood.shared.support.supportchat.ui.ComposableSingletons$SelectionMessageViewKt.lambda$794420876.<anonymous> (SelectionMessageView.kt:136)");
            }
            ParticipantType participantType = ParticipantType.USER;
            Instant instant = Instant.parse("2020-03-10T18:35:24.00Z");
            Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
            SelectionMessageView4.SelectionMessageView(new UiChatMessage.Regular.SelectionMessage("preview-sid", 0L, participantType, false, true, instant, null, "2025", new RichText("Current tax year", CollectionsKt.emptyList()), "300000", ServerToBentoAssetMapper2.CHECKMARK_24.getServerValue(), null), PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(16), 1, null), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1633236384$lib_support_chat_externalDebug() {
        return lambda$1633236384;
    }

    public final Function2<Composer, Integer, Unit> getLambda$794420876$lib_support_chat_externalDebug() {
        return lambda$794420876;
    }
}

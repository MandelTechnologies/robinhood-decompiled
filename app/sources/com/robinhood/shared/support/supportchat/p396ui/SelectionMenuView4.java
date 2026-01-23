package com.robinhood.shared.support.supportchat.p396ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.p355ui.p356v2.SelectionMenuRowModel;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.shared.models.chat.common.api.ParticipantType;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: SelectionMenuView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.support.supportchat.ui.ComposableSingletons$SelectionMenuViewKt$lambda$-2089741662$1, reason: use source file name */
/* loaded from: classes6.dex */
final class SelectionMenuView4 implements Function2<Composer, Integer, Unit> {
    public static final SelectionMenuView4 INSTANCE = new SelectionMenuView4();

    SelectionMenuView4() {
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
            ComposerKt.traceEventStart(-2089741662, i, -1, "com.robinhood.shared.support.supportchat.ui.ComposableSingletons$SelectionMenuViewKt.lambda$-2089741662.<anonymous> (SelectionMenuView.kt:438)");
        }
        RichText richText = new RichText("Current tax year", CollectionsKt.emptyList());
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CHECKMARK_24;
        List listListOf = CollectionsKt.listOf((Object[]) new SelectionMenuRowModel[]{new SelectionMenuRowModel("2025", "2025", richText, serverToBentoAssetMapper2.getServerValue(), null), new SelectionMenuRowModel("2024", "2024", new RichText("Previous tax year", CollectionsKt.emptyList()), serverToBentoAssetMapper2.getServerValue(), null)});
        ParticipantType participantType = ParticipantType.CHATBOT;
        Instant instant = Instant.parse("2020-03-10T18:35:24.00Z");
        Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
        UiChatMessage.Regular.SelectionMenu selectionMenu = new UiChatMessage.Regular.SelectionMenu(listListOf, 1, "test", "preview-sid", false, true, null, 0L, participantType, instant);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.support.supportchat.ui.ComposableSingletons$SelectionMenuViewKt$lambda$-2089741662$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelectionMenuView4.invoke$lambda$1$lambda$0((SelectionMenuRowModel) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SelectionMenuView6.SelectionMenuView(selectionMenu, null, (Function1) objRememberedValue, composer, 384, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SelectionMenuRowModel selectionMenuRowModel) {
        Intrinsics.checkNotNullParameter(selectionMenuRowModel, "<unused var>");
        return Unit.INSTANCE;
    }
}

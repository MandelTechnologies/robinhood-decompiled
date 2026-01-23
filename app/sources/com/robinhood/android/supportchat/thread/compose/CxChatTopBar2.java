package com.robinhood.android.supportchat.thread.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.supportchat.thread.compose.CxChatTopBar4;
import com.robinhood.android.supportchat.thread.compose.CxChatTopBar5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CxChatTopBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatTopBarKt$Preview$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class CxChatTopBar2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ CxChatTopBar4.Args $args;

    CxChatTopBar2(CxChatTopBar4.Args args) {
        this.$args = args;
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
            ComposerKt.traceEventStart(1112315745, i, -1, "com.robinhood.android.supportchat.thread.compose.Preview.<anonymous>.<anonymous> (CxChatTopBar.kt:242)");
        }
        String title = this.$args.getTitle();
        ServerToBentoAssetMapper3 avatarIcon = this.$args.getAvatarIcon();
        String avatarSliverColorHex = this.$args.getAvatarSliverColorHex();
        CxChatTopBar5.AvatarStatus avatarStatus = this.$args.getAvatarStatus();
        CxChatTopBar5.EndButtonStatus endButtonStatus = this.$args.getEndButtonStatus();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatTopBarKt$Preview$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CxChatTopBar.CxChatTopBar(title, avatarIcon, avatarSliverColorHex, null, null, avatarStatus, endButtonStatus, (Function0) objRememberedValue, composer, 12582912, 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

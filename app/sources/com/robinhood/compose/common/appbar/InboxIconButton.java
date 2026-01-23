package com.robinhood.compose.common.appbar;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InboxIconButton.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.common.appbar.ComposableSingletons$InboxIconButtonKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class InboxIconButton {
    public static final InboxIconButton INSTANCE = new InboxIconButton();

    /* renamed from: lambda$-880042805, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9355lambda$880042805 = ComposableLambda3.composableLambdaInstance(-880042805, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.appbar.ComposableSingletons$InboxIconButtonKt$lambda$-880042805$1
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
                ComposerKt.traceEventStart(-880042805, i, -1, "com.robinhood.compose.common.appbar.ComposableSingletons$InboxIconButtonKt.lambda$-880042805.<anonymous> (InboxIconButton.kt:33)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.NOTIFICATION_24), StringResources_androidKt.stringResource(C11048R.string.top_nav_inbox_button_description, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-263358290, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9354lambda$263358290 = ComposableLambda3.composableLambdaInstance(-263358290, false, InboxIconButton2.INSTANCE);

    /* renamed from: getLambda$-263358290$lib_compose_common_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21666getLambda$263358290$lib_compose_common_externalDebug() {
        return f9354lambda$263358290;
    }

    /* renamed from: getLambda$-880042805$lib_compose_common_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21667getLambda$880042805$lib_compose_common_externalDebug() {
        return f9355lambda$880042805;
    }
}

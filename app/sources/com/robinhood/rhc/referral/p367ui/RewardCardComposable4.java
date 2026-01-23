package com.robinhood.rhc.referral.p367ui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: RewardCardComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rhc.referral.ui.RewardCardComposableKt$RewardCardComposable$1$1$3$1, reason: use source file name */
/* loaded from: classes26.dex */
final class RewardCardComposable4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ RewardCardComposableState $state;

    RewardCardComposable4(RewardCardComposableState rewardCardComposableState) {
        this.$state = rewardCardComposableState;
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
            ComposerKt.traceEventStart(-409319603, i, -1, "com.robinhood.rhc.referral.ui.RewardCardComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RewardCardComposable.kt:92)");
        }
        String subtitle = this.$state.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        BentoMarkdownText2.BentoMarkdownText(subtitle, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, 0, 30);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

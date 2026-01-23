package com.robinhood.android.crypto.tab.p093ui.rewards.card.sheet;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.crypto.tab.p093ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetViewState;
import com.robinhood.contentful.markdown.MarkdownContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoHomeRewardsCardBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.ComposableSingletons$CryptoHomeRewardsCardBottomSheetFragmentKt$lambda$-1989558374$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHomeRewardsCardBottomSheetFragment3 implements Function2<Composer, Integer, Unit> {
    public static final CryptoHomeRewardsCardBottomSheetFragment3 INSTANCE = new CryptoHomeRewardsCardBottomSheetFragment3();

    CryptoHomeRewardsCardBottomSheetFragment3() {
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
            ComposerKt.traceEventStart(-1989558374, i, -1, "com.robinhood.android.crypto.tab.ui.rewards.card.sheet.ComposableSingletons$CryptoHomeRewardsCardBottomSheetFragmentKt.lambda$-1989558374.<anonymous> (CryptoHomeRewardsCardBottomSheetFragment.kt:87)");
        }
        CryptoHomeRewardsCardBottomSheetViewState.Loaded loaded = new CryptoHomeRewardsCardBottomSheetViewState.Loaded("----- ----------", new MarkdownContent("-------- --------- ------- -------------"), "---- --");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.ComposableSingletons$CryptoHomeRewardsCardBottomSheetFragmentKt$lambda$-1989558374$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoHomeRewardsCardBottomSheetFragment6.Loaded(loaded, (Function0) objRememberedValue, Modifier.INSTANCE, composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

package com.robinhood.android.linking;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.store.linking.LinkingGroup;
import com.robinhood.compose.bento.theme.BentoTheme;
import hippo.model.p469v1.InstrumentTypeDto;
import hippo.model.p469v1.LinkingGroupColorsDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MobileLinkingCollapsedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.linking.ComposableSingletons$MobileLinkingCollapsedComposableKt$lambda$1500872922$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MobileLinkingCollapsedComposable2 implements Function2<Composer, Integer, Unit> {
    public static final MobileLinkingCollapsedComposable2 INSTANCE = new MobileLinkingCollapsedComposable2();

    MobileLinkingCollapsedComposable2() {
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
            ComposerKt.traceEventStart(1500872922, i, -1, "com.robinhood.android.linking.ComposableSingletons$MobileLinkingCollapsedComposableKt.lambda$1500872922.<anonymous> (MobileLinkingCollapsedComposable.kt:163)");
        }
        LinkingGroup linkingGroup = new LinkingGroup("", Boolean.TRUE, LinkingGroupColorsDto.COLORS_EXTENDED_SOLDARK, "", InstrumentTypeDto.INSTRUMENT_TYPE_EQUITY, "AAPL", CollectionsKt.emptyList());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.linking.ComposableSingletons$MobileLinkingCollapsedComposableKt$lambda$1500872922$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.linking.ComposableSingletons$MobileLinkingCollapsedComposableKt$lambda$1500872922$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        MobileLinkingCollapsedComposable3.Content(linkingGroup, function0, (Function0) objRememberedValue2, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null), composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

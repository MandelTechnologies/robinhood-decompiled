package com.robinhood.compose.bento.component.cards;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.cards.BentoCommunicationCard7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoCommunicationCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.cards.ComposableSingletons$BentoCommunicationCardKt$lambda$949661877$1, reason: use source file name */
/* loaded from: classes15.dex */
final class BentoCommunicationCard9 implements Function2<Composer, Integer, Unit> {
    public static final BentoCommunicationCard9 INSTANCE = new BentoCommunicationCard9();

    BentoCommunicationCard9() {
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
            ComposerKt.traceEventStart(949661877, i, -1, "com.robinhood.compose.bento.component.cards.ComposableSingletons$BentoCommunicationCardKt.lambda$949661877.<anonymous> (BentoCommunicationCard.kt:219)");
        }
        BentoCommunicationCard7.DismissIconType dismissIconType = BentoCommunicationCard7.DismissIconType.Dark;
        AnnotatedString annotatedString = new AnnotatedString("This text upsells the product and leads with a verb. Max 4 lines (80-90 characters).", null, 2, null);
        BentoCommunicationCard7.Type.Standard standard = BentoCommunicationCard7.Type.Standard.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.cards.ComposableSingletons$BentoCommunicationCardKt$lambda$949661877$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function0() { // from class: com.robinhood.compose.bento.component.cards.ComposableSingletons$BentoCommunicationCardKt$lambda$949661877$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoCommunicationCard.BentoCommunicationCard(null, standard, annotatedString, "Call to action", null, function0, (Function0) objRememberedValue2, dismissIconType, composer, 14380080, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

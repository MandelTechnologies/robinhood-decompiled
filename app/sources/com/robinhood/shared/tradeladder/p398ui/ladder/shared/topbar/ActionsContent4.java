package com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.tradeladder.C40888R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ActionsContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$ActionsContentKt$lambda$-1655571281$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ActionsContent4 implements Function2<Composer, Integer, Unit> {
    public static final ActionsContent4 INSTANCE = new ActionsContent4();

    ActionsContent4() {
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
            ComposerKt.traceEventStart(-1655571281, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$ActionsContentKt.lambda$-1655571281.<anonymous> (ActionsContent.kt:256)");
        }
        FlattenAlertContent flattenAlertContent = new FlattenAlertContent(new AnnotatedString(StringResources_androidKt.stringResource(C40888R.string.ladder_flatten_dialog_desc, composer, 0), null, 2, null), extensions2.persistentMapOf());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$ActionsContentKt$lambda$-1655571281$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$ActionsContentKt$lambda$-1655571281$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        ActionsContent.FlattenAlert(flattenAlertContent, true, function0, (Function0) objRememberedValue2, composer, 3504);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

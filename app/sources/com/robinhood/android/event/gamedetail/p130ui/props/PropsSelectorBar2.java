package com.robinhood.android.event.gamedetail.p130ui.props;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PropsSelectorBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.ui.props.ComposableSingletons$PropsSelectorBarKt$lambda$1915842829$1, reason: use source file name */
/* loaded from: classes3.dex */
final class PropsSelectorBar2 implements Function2<Composer, Integer, Unit> {
    public static final PropsSelectorBar2 INSTANCE = new PropsSelectorBar2();

    PropsSelectorBar2() {
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
            ComposerKt.traceEventStart(1915842829, i, -1, "com.robinhood.android.event.gamedetail.ui.props.ComposableSingletons$PropsSelectorBarKt.lambda$1915842829.<anonymous> (PropsSelectorBar.kt:60)");
        }
        PropsSelectionBarState propsSelectionBarState = new PropsSelectionBarState(extensions2.persistentListOf(new PropsOption("Touchdown", true), new PropsOption("Passing yards", false), new PropsOption("Receiving yards", false)));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.props.ComposableSingletons$PropsSelectorBarKt$lambda$1915842829$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PropsSelectorBar2.invoke$lambda$1$lambda$0(((Integer) obj).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        PropsSelectorBar5.PropsSelectorBar(propsSelectionBarState, null, (Function1) objRememberedValue, composer, 390, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(int i) {
        return Unit.INSTANCE;
    }
}

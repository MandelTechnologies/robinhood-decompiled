package com.robinhood.android.transfers.p271ui.composecomponents;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OutgoingWireMemoEntryScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.composecomponents.ComposableSingletons$OutgoingWireMemoEntryScreenKt$lambda$-298897063$1, reason: use source file name */
/* loaded from: classes9.dex */
final class OutgoingWireMemoEntryScreen2 implements Function2<Composer, Integer, Unit> {
    public static final OutgoingWireMemoEntryScreen2 INSTANCE = new OutgoingWireMemoEntryScreen2();

    OutgoingWireMemoEntryScreen2() {
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
            ComposerKt.traceEventStart(-298897063, i, -1, "com.robinhood.android.transfers.ui.composecomponents.ComposableSingletons$OutgoingWireMemoEntryScreenKt.lambda$-298897063.<anonymous> (OutgoingWireMemoEntryScreen.kt:26)");
        }
        OutgoingWireMemoEntryData outgoingWireMemoEntryDataWithMemoText = OutgoingWireMemoEntryData.INSTANCE.withMemoText(null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.ui.composecomponents.ComposableSingletons$OutgoingWireMemoEntryScreenKt$lambda$-298897063$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OutgoingWireMemoEntryScreen2.invoke$lambda$1$lambda$0((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.ui.composecomponents.ComposableSingletons$OutgoingWireMemoEntryScreenKt$lambda$-298897063$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.transfers.ui.composecomponents.ComposableSingletons$OutgoingWireMemoEntryScreenKt$lambda$-298897063$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        OutgoingWireMemoEntryScreen5.OutgoingWireMemoEntryScreen(outgoingWireMemoEntryDataWithMemoText, function1, function0, null, (Function0) objRememberedValue3, composer, StringResource.$stable | 25008, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}

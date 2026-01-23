package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import android.view.KeyEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoQuickTradeSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.ComposableSingletons$CryptoQuickTradeSheetComposableKt$lambda$833587634$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoQuickTradeSheetComposable2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoQuickTradeSheetComposable2 INSTANCE = new CryptoQuickTradeSheetComposable2();

    CryptoQuickTradeSheetComposable2() {
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
            ComposerKt.traceEventStart(833587634, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.ComposableSingletons$CryptoQuickTradeSheetComposableKt.lambda$833587634.<anonymous> (CryptoQuickTradeSheetComposable.kt:119)");
        }
        CryptoQuickTradeSheetViewState cryptoQuickTradeSheetViewState = CryptoQuickTradeSheetComposable3.testViewState;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.ComposableSingletons$CryptoQuickTradeSheetComposableKt$lambda$833587634$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoQuickTradeSheetComposable2.invoke$lambda$1$lambda$0((KeyEvent) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.ComposableSingletons$CryptoQuickTradeSheetComposableKt$lambda$833587634$1$$ExternalSyntheticLambda1
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
            objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.ComposableSingletons$CryptoQuickTradeSheetComposableKt$lambda$833587634$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoQuickTradeSheetComposable2.invoke$lambda$5$lambda$4((CryptoOrderIntentKey.OrderType) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function12 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.ComposableSingletons$CryptoQuickTradeSheetComposableKt$lambda$833587634$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Function0 function02 = (Function0) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.ComposableSingletons$CryptoQuickTradeSheetComposableKt$lambda$833587634$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeSheetComposable2.invoke$lambda$9$lambda$8((ActionViewState) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        Function2 function2 = (Function2) objRememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.ComposableSingletons$CryptoQuickTradeSheetComposableKt$lambda$833587634$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoQuickTradeSheetComposable2.invoke$lambda$11$lambda$10((CryptoOrderReviewRowState.TapAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        CryptoQuickTradeSheetComposable3.Content(cryptoQuickTradeSheetViewState, null, function1, function0, function12, function02, function2, (Function1) objRememberedValue6, null, composer, 14380464, 256);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(CryptoOrderIntentKey.OrderType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(ActionViewState actionViewState, int i) {
        Intrinsics.checkNotNullParameter(actionViewState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(CryptoOrderReviewRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}

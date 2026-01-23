package com.robinhood.android.equities.taxlots.table;

import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV22;
import com.singular.sdk.internal.Constants;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TaxLotShareAndCheckBoxCell.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1, reason: use source file name */
/* loaded from: classes3.dex */
final class TaxLotShareAndCheckBoxCell2 implements Function2<Composer, Integer, Unit> {
    public static final TaxLotShareAndCheckBoxCell2 INSTANCE = new TaxLotShareAndCheckBoxCell2();

    TaxLotShareAndCheckBoxCell2() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(BigDecimal bigDecimal) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(BigDecimal bigDecimal) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12(BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$14(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$16(BigDecimal bigDecimal) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$18(BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$21$lambda$20(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$23$lambda$22(BigDecimal bigDecimal) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$25$lambda$24(BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$27$lambda$26(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$29$lambda$28(BigDecimal bigDecimal) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$31$lambda$30(BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$33$lambda$32(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$35$lambda$34(BigDecimal bigDecimal) {
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(847676516, i, -1, "com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt.lambda$847676516.<anonymous> (TaxLotShareAndCheckBoxCell.kt:336)");
        }
        BigDecimal bigDecimal = new BigDecimal("100");
        ToggleableState toggleableState = ToggleableState.Off;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$1$lambda$0((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell = new TaxLotsShareAndCheckBoxCell(Constants.SdidMigrationStatusCodes.ALREADY_SDID, "101", true, 0, bigDecimal, (Function1) objRememberedValue, toggleableState, false, false, 30);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
            composer.updateRememberedValue(objRememberedValue2);
        }
        BentoNumpadScopeV22 bentoNumpadScopeV22 = new BentoNumpadScopeV22((CoroutineScope) objRememberedValue2);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$3$lambda$2(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function1 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$5$lambda$4((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        int i2 = BentoNumpadScopeV22.$stable;
        TaxLotShareAndCheckBoxCell3.m13636TaxLotsShareAndCheckBoxComposablePA9ru4M(0, false, taxLotsShareAndCheckBoxCell, null, null, bentoNumpadScopeV22, function1, null, (Function1) objRememberedValue4, composer, (i2 << 15) | 102263862, 128);
        BigDecimal bigDecimal2 = new BigDecimal("100");
        ToggleableState toggleableState2 = ToggleableState.f174On;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$7$lambda$6((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell2 = new TaxLotsShareAndCheckBoxCell(Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, "100", true, 1, bigDecimal2, (Function1) objRememberedValue5, toggleableState2, false, false, 30);
        float f = 150;
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(f);
        float f2 = 75;
        float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(f2);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
            composer.updateRememberedValue(objRememberedValue6);
        }
        BentoNumpadScopeV22 bentoNumpadScopeV222 = new BentoNumpadScopeV22((CoroutineScope) objRememberedValue6);
        C2002Dp c2002DpM7993boximpl = C2002Dp.m7993boximpl(fM7995constructorimpl);
        C2002Dp c2002DpM7993boximpl2 = C2002Dp.m7993boximpl(fM7995constructorimpl2);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$9$lambda$8(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue7);
        }
        Function1 function12 = (Function1) objRememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$11$lambda$10((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        TaxLotShareAndCheckBoxCell3.m13636TaxLotsShareAndCheckBoxComposablePA9ru4M(1, false, taxLotsShareAndCheckBoxCell2, c2002DpM7993boximpl, c2002DpM7993boximpl2, bentoNumpadScopeV222, function12, null, (Function1) objRememberedValue8, composer, (i2 << 15) | 102263862, 128);
        BigDecimal bigDecimal3 = new BigDecimal("123456789123456789");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$13$lambda$12((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue9);
        }
        composer.endReplaceGroup();
        TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell3 = new TaxLotsShareAndCheckBoxCell(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET, "123456789123456789", true, 2, bigDecimal3, (Function1) objRememberedValue9, toggleableState2, false, false, 30);
        float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(f);
        float fM7995constructorimpl4 = C2002Dp.m7995constructorimpl(f2);
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == companion.getEmpty()) {
            objRememberedValue10 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
            composer.updateRememberedValue(objRememberedValue10);
        }
        BentoNumpadScopeV22 bentoNumpadScopeV223 = new BentoNumpadScopeV22((CoroutineScope) objRememberedValue10);
        C2002Dp c2002DpM7993boximpl3 = C2002Dp.m7993boximpl(fM7995constructorimpl3);
        C2002Dp c2002DpM7993boximpl4 = C2002Dp.m7993boximpl(fM7995constructorimpl4);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == companion.getEmpty()) {
            objRememberedValue11 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$15$lambda$14(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue11);
        }
        Function1 function13 = (Function1) objRememberedValue11;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue12 = composer.rememberedValue();
        if (objRememberedValue12 == companion.getEmpty()) {
            objRememberedValue12 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$17$lambda$16((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue12);
        }
        composer.endReplaceGroup();
        TaxLotShareAndCheckBoxCell3.m13636TaxLotsShareAndCheckBoxComposablePA9ru4M(2, false, taxLotsShareAndCheckBoxCell3, c2002DpM7993boximpl3, c2002DpM7993boximpl4, bentoNumpadScopeV223, function13, null, (Function1) objRememberedValue12, composer, (i2 << 15) | 102263862, 128);
        BigDecimal bigDecimal4 = new BigDecimal("100");
        ToggleableState toggleableState3 = ToggleableState.Indeterminate;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue13 = composer.rememberedValue();
        if (objRememberedValue13 == companion.getEmpty()) {
            objRememberedValue13 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$19$lambda$18((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue13);
        }
        composer.endReplaceGroup();
        TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell4 = new TaxLotsShareAndCheckBoxCell(Constants.SdidMigrationStatusCodes.MISSING_PARAMS, "50", true, 3, bigDecimal4, (Function1) objRememberedValue13, toggleableState3, false, false, 30);
        float fM7995constructorimpl5 = C2002Dp.m7995constructorimpl(f);
        float fM7995constructorimpl6 = C2002Dp.m7995constructorimpl(f2);
        Object objRememberedValue14 = composer.rememberedValue();
        if (objRememberedValue14 == companion.getEmpty()) {
            objRememberedValue14 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
            composer.updateRememberedValue(objRememberedValue14);
        }
        BentoNumpadScopeV22 bentoNumpadScopeV224 = new BentoNumpadScopeV22((CoroutineScope) objRememberedValue14);
        C2002Dp c2002DpM7993boximpl5 = C2002Dp.m7993boximpl(fM7995constructorimpl5);
        C2002Dp c2002DpM7993boximpl6 = C2002Dp.m7993boximpl(fM7995constructorimpl6);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue15 = composer.rememberedValue();
        if (objRememberedValue15 == companion.getEmpty()) {
            objRememberedValue15 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$21$lambda$20(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue15);
        }
        Function1 function14 = (Function1) objRememberedValue15;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue16 = composer.rememberedValue();
        if (objRememberedValue16 == companion.getEmpty()) {
            objRememberedValue16 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$23$lambda$22((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue16);
        }
        composer.endReplaceGroup();
        TaxLotShareAndCheckBoxCell3.m13636TaxLotsShareAndCheckBoxComposablePA9ru4M(3, false, taxLotsShareAndCheckBoxCell4, c2002DpM7993boximpl5, c2002DpM7993boximpl6, bentoNumpadScopeV224, function14, null, (Function1) objRememberedValue16, composer, (i2 << 15) | 102263862, 128);
        BigDecimal bigDecimal5 = new BigDecimal("25");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue17 = composer.rememberedValue();
        if (objRememberedValue17 == companion.getEmpty()) {
            objRememberedValue17 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$25$lambda$24((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue17);
        }
        composer.endReplaceGroup();
        TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell5 = new TaxLotsShareAndCheckBoxCell(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION, "25", true, 4, bigDecimal5, (Function1) objRememberedValue17, toggleableState, true, false, 30);
        float fM7995constructorimpl7 = C2002Dp.m7995constructorimpl(f);
        float fM7995constructorimpl8 = C2002Dp.m7995constructorimpl(f2);
        Object objRememberedValue18 = composer.rememberedValue();
        if (objRememberedValue18 == companion.getEmpty()) {
            objRememberedValue18 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
            composer.updateRememberedValue(objRememberedValue18);
        }
        BentoNumpadScopeV22 bentoNumpadScopeV225 = new BentoNumpadScopeV22((CoroutineScope) objRememberedValue18);
        C2002Dp c2002DpM7993boximpl7 = C2002Dp.m7993boximpl(fM7995constructorimpl7);
        C2002Dp c2002DpM7993boximpl8 = C2002Dp.m7993boximpl(fM7995constructorimpl8);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue19 = composer.rememberedValue();
        if (objRememberedValue19 == companion.getEmpty()) {
            objRememberedValue19 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$27$lambda$26(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue19);
        }
        Function1 function15 = (Function1) objRememberedValue19;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue20 = composer.rememberedValue();
        if (objRememberedValue20 == companion.getEmpty()) {
            objRememberedValue20 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$29$lambda$28((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue20);
        }
        composer.endReplaceGroup();
        TaxLotShareAndCheckBoxCell3.m13636TaxLotsShareAndCheckBoxComposablePA9ru4M(4, false, taxLotsShareAndCheckBoxCell5, c2002DpM7993boximpl7, c2002DpM7993boximpl8, bentoNumpadScopeV225, function15, null, (Function1) objRememberedValue20, composer, (i2 << 15) | 102263862, 128);
        BigDecimal bigDecimal6 = new BigDecimal("83");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue21 = composer.rememberedValue();
        if (objRememberedValue21 == companion.getEmpty()) {
            objRememberedValue21 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$31$lambda$30((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue21);
        }
        composer.endReplaceGroup();
        TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell6 = new TaxLotsShareAndCheckBoxCell("6", "83", true, 5, bigDecimal6, (Function1) objRememberedValue21, toggleableState, false, true, 30);
        float fM7995constructorimpl9 = C2002Dp.m7995constructorimpl(f);
        float fM7995constructorimpl10 = C2002Dp.m7995constructorimpl(f2);
        Object objRememberedValue22 = composer.rememberedValue();
        if (objRememberedValue22 == companion.getEmpty()) {
            objRememberedValue22 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
            composer.updateRememberedValue(objRememberedValue22);
        }
        BentoNumpadScopeV22 bentoNumpadScopeV226 = new BentoNumpadScopeV22((CoroutineScope) objRememberedValue22);
        C2002Dp c2002DpM7993boximpl9 = C2002Dp.m7993boximpl(fM7995constructorimpl9);
        C2002Dp c2002DpM7993boximpl10 = C2002Dp.m7993boximpl(fM7995constructorimpl10);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue23 = composer.rememberedValue();
        if (objRememberedValue23 == companion.getEmpty()) {
            objRememberedValue23 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$33$lambda$32(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue23);
        }
        Function1 function16 = (Function1) objRememberedValue23;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue24 = composer.rememberedValue();
        if (objRememberedValue24 == companion.getEmpty()) {
            objRememberedValue24 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$35$lambda$34((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue24);
        }
        composer.endReplaceGroup();
        TaxLotShareAndCheckBoxCell3.m13636TaxLotsShareAndCheckBoxComposablePA9ru4M(5, true, taxLotsShareAndCheckBoxCell6, c2002DpM7993boximpl9, c2002DpM7993boximpl10, bentoNumpadScopeV226, function16, null, (Function1) objRememberedValue24, composer, (i2 << 15) | 102263862, 128);
        BigDecimal bigDecimal7 = new BigDecimal("73");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue25 = composer.rememberedValue();
        if (objRememberedValue25 == companion.getEmpty()) {
            objRememberedValue25 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$37$lambda$36((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue25);
        }
        composer.endReplaceGroup();
        TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell7 = new TaxLotsShareAndCheckBoxCell("7", "73", false, 6, bigDecimal7, (Function1) objRememberedValue25, toggleableState, false, false, 30);
        float fM7995constructorimpl11 = C2002Dp.m7995constructorimpl(f);
        float fM7995constructorimpl12 = C2002Dp.m7995constructorimpl(f2);
        Object objRememberedValue26 = composer.rememberedValue();
        if (objRememberedValue26 == companion.getEmpty()) {
            objRememberedValue26 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
            composer.updateRememberedValue(objRememberedValue26);
        }
        BentoNumpadScopeV22 bentoNumpadScopeV227 = new BentoNumpadScopeV22((CoroutineScope) objRememberedValue26);
        C2002Dp c2002DpM7993boximpl11 = C2002Dp.m7993boximpl(fM7995constructorimpl11);
        C2002Dp c2002DpM7993boximpl12 = C2002Dp.m7993boximpl(fM7995constructorimpl12);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue27 = composer.rememberedValue();
        if (objRememberedValue27 == companion.getEmpty()) {
            objRememberedValue27 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$39$lambda$38(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue27);
        }
        Function1 function17 = (Function1) objRememberedValue27;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue28 = composer.rememberedValue();
        if (objRememberedValue28 == companion.getEmpty()) {
            objRememberedValue28 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotShareAndCheckBoxCellKt$lambda$847676516$1$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell2.invoke$lambda$41$lambda$40((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue28);
        }
        composer.endReplaceGroup();
        TaxLotShareAndCheckBoxCell3.m13636TaxLotsShareAndCheckBoxComposablePA9ru4M(6, true, taxLotsShareAndCheckBoxCell7, c2002DpM7993boximpl11, c2002DpM7993boximpl12, bentoNumpadScopeV227, function17, null, (Function1) objRememberedValue28, composer, (i2 << 15) | 102263862, 128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$37$lambda$36(BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$39$lambda$38(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$41$lambda$40(BigDecimal bigDecimal) {
        return Unit.INSTANCE;
    }
}

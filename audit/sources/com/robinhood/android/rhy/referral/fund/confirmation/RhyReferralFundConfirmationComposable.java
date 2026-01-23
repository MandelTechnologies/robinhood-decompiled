package com.robinhood.android.rhy.referral.fund.confirmation;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.rhy.referral.C27406R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralFundConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aI\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a)\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {RhyReferralFundConfirmationComposable.RhyReferralFundConfirmationImage, "", "RhyReferralFundConfirmationComposable", "", "showDebugAddCardToGooglePayDialog", "", "onClickCta", "Lkotlin/Function0;", "debugAddCardToGooglePayDialogDismissed", "debugOnlyClickAddToGoogleWallet", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DebugAddCardToGooglePayDialog", "onActionConfirmed", "onActionCancelled", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-rhy-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyReferralFundConfirmationComposable {
    public static final String RhyReferralFundConfirmationImage = "RhyReferralFundConfirmationImage";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DebugAddCardToGooglePayDialog$lambda$1(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        DebugAddCardToGooglePayDialog(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyReferralFundConfirmationComposable$lambda$0(boolean z, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RhyReferralFundConfirmationComposable(z, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhyReferralFundConfirmationComposable(final boolean z, final Function0<Unit> onClickCta, final Function0<Unit> debugAddCardToGooglePayDialogDismissed, final Function0<Unit> debugOnlyClickAddToGoogleWallet, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Intrinsics.checkNotNullParameter(debugAddCardToGooglePayDialogDismissed, "debugAddCardToGooglePayDialogDismissed");
        Intrinsics.checkNotNullParameter(debugOnlyClickAddToGoogleWallet, "debugOnlyClickAddToGoogleWallet");
        Composer composerStartRestartGroup = composer.startRestartGroup(1054050631);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickCta) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(debugAddCardToGooglePayDialogDismissed) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(debugOnlyClickAddToGoogleWallet) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1054050631, i3, -1, "com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposable (RhyReferralFundConfirmationComposable.kt:37)");
                }
                final Modifier modifier5 = modifier4;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1910848156, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposableKt.RhyReferralFundConfirmationComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1910848156, i5, -1, "com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposable.<anonymous> (RhyReferralFundConfirmationComposable.kt:39)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(modifier5, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
                        final Function0<Unit> function0 = onClickCta;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1686146193, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposableKt.RhyReferralFundConfirmationComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                                invoke(bentoButtonBar3, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1686146193, i6, -1, "com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposable.<anonymous>.<anonymous> (RhyReferralFundConfirmationComposable.kt:44)");
                                }
                                BentoButtonBar2.BentoButtonBar(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer3, 6, 1), null, null, false, null, null, function0, StringResources_androidKt.stringResource(C27406R.string.rhy_referral_set_up_google_pay, composer3, 0), false, null, false, null, null, false, null, false, composer3, 0, 0, 65342);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final boolean z2 = z;
                        final Function0<Unit> function02 = debugOnlyClickAddToGoogleWallet;
                        final Function0<Unit> function03 = debugAddCardToGooglePayDialogDismissed;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierFillMaxSize$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(515680132, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposableKt.RhyReferralFundConfirmationComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(515680132, i6, -1, "com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposable.<anonymous>.<anonymous> (RhyReferralFundConfirmationComposable.kt:52)");
                                }
                                composer3.startReplaceGroup(1647368532);
                                if (z2) {
                                    RhyReferralFundConfirmationComposable.DebugAddCardToGooglePayDialog(function02, function03, composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                                ImageKt.Image(PainterResources_androidKt.painterResource(C27406R.drawable.rhy_referral_account_ready, composer3, 0), (String) null, column6.align(TestTag3.testTag(companion, RhyReferralFundConfirmationComposable.RhyReferralFundConfirmationImage), companion2.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, 120);
                                Modifier modifierAlign = column6.align(companion, companion2.getCenterHorizontally());
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierAlign, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 0.0f, composer3, 0, 2);
                                String strStringResource = StringResources_androidKt.stringResource(C27406R.string.rhy_referral_add_google_pay_title, composer3, 0);
                                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer3, i7).getDisplayCapsuleMedium();
                                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer3, 0, 0, 8124);
                                Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(column6.align(companion, companion2.getCenterHorizontally()), bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), 0.0f, composer3, 0, 2);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_add_google_pay_subtitle, composer3, 0), modifierM21622defaultHorizontalPaddingWMci_g02, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8124);
                                Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3456, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RhyReferralFundConfirmationComposable.RhyReferralFundConfirmationComposable$lambda$0(z, onClickCta, debugAddCardToGooglePayDialogDismissed, debugOnlyClickAddToGoogleWallet, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Modifier modifier52 = modifier4;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1910848156, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposableKt.RhyReferralFundConfirmationComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1910848156, i5, -1, "com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposable.<anonymous> (RhyReferralFundConfirmationComposable.kt:39)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(modifier52, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
                    final Function0<Unit> function0 = onClickCta;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1686146193, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposableKt.RhyReferralFundConfirmationComposable.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                            invoke(bentoButtonBar3, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1686146193, i6, -1, "com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposable.<anonymous>.<anonymous> (RhyReferralFundConfirmationComposable.kt:44)");
                            }
                            BentoButtonBar2.BentoButtonBar(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer3, 6, 1), null, null, false, null, null, function0, StringResources_androidKt.stringResource(C27406R.string.rhy_referral_set_up_google_pay, composer3, 0), false, null, false, null, null, false, null, false, composer3, 0, 0, 65342);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final boolean z2 = z;
                    final Function0<Unit> function02 = debugOnlyClickAddToGoogleWallet;
                    final Function0<Unit> function03 = debugAddCardToGooglePayDialogDismissed;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierFillMaxSize$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(515680132, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposableKt.RhyReferralFundConfirmationComposable.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(515680132, i6, -1, "com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposable.<anonymous>.<anonymous> (RhyReferralFundConfirmationComposable.kt:52)");
                            }
                            composer3.startReplaceGroup(1647368532);
                            if (z2) {
                                RhyReferralFundConfirmationComposable.DebugAddCardToGooglePayDialog(function02, function03, composer3, 0);
                            }
                            composer3.endReplaceGroup();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                            ImageKt.Image(PainterResources_androidKt.painterResource(C27406R.drawable.rhy_referral_account_ready, composer3, 0), (String) null, column6.align(TestTag3.testTag(companion, RhyReferralFundConfirmationComposable.RhyReferralFundConfirmationImage), companion2.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, 120);
                            Modifier modifierAlign = column6.align(companion, companion2.getCenterHorizontally());
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierAlign, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 0.0f, composer3, 0, 2);
                            String strStringResource = StringResources_androidKt.stringResource(C27406R.string.rhy_referral_add_google_pay_title, composer3, 0);
                            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer3, i7).getDisplayCapsuleMedium();
                            TextAlign.Companion companion4 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer3, 0, 0, 8124);
                            Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(column6.align(companion, companion2.getCenterHorizontally()), bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), 0.0f, composer3, 0, 2);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_add_google_pay_subtitle, composer3, 0), modifierM21622defaultHorizontalPaddingWMci_g02, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8124);
                            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 3456, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void DebugAddCardToGooglePayDialog(final Function0<Unit> onActionConfirmed, final Function0<Unit> onActionCancelled, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onActionConfirmed, "onActionConfirmed");
        Intrinsics.checkNotNullParameter(onActionCancelled, "onActionCancelled");
        Composer composerStartRestartGroup = composer.startRestartGroup(-335316435);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onActionConfirmed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onActionCancelled) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-335316435, i2, -1, "com.robinhood.android.rhy.referral.fund.confirmation.DebugAddCardToGooglePayDialog (RhyReferralFundConfirmationComposable.kt:94)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(449592568, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposableKt.DebugAddCardToGooglePayDialog.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(449592568, i3, -1, "com.robinhood.android.rhy.referral.fund.confirmation.DebugAddCardToGooglePayDialog.<anonymous> (RhyReferralFundConfirmationComposable.kt:96)");
                    }
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text("Fake adding a card to Google Wallet");
                    ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.PAYMENT_CARD;
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), onActionConfirmed);
                    BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composer2, 0), onActionCancelled);
                    Function0<Unit> function0 = onActionCancelled;
                    int i4 = (BentoAlertDialog2.Body.Text.$stable << 3) | 196614;
                    int i5 = BentoAlertButton.$stable;
                    BentoAlertDialog.BentoAlertDialog("Test Add Card to Google Wallet", text, bentoAlertButton, null, bentoAlertButton2, serverToBentoAssetMapper3, false, null, function0, composer2, i4 | (i5 << 6) | (i5 << 12), 200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralFundConfirmationComposable.DebugAddCardToGooglePayDialog$lambda$1(onActionConfirmed, onActionCancelled, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

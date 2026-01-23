package com.robinhood.android.creditcard.p091ui.creditapplication.creditfrozen;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.creditfrozen.CreditFrozenComposable;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreditFrozenComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aS\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\"\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"CreditFrozen", "", "onHelpPress", "Lkotlin/Function0;", "onClose", "onUnfreezeUrlClick", "Lkotlin/Function1;", "", "onContinue", "isLoading", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "CREDIT_FROZEN_TITLE_TEST_TAG", "CREDIT_FROZEN_SUBTITLE_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CreditFrozenComposable {
    public static final String CREDIT_FROZEN_SUBTITLE_TEST_TAG = "credit-frozen-subtitle-test-tag";
    public static final String CREDIT_FROZEN_TITLE_TEST_TAG = "credit-frozen-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreditFrozen$lambda$0(Function0 function0, Function0 function02, Function1 function1, Function0 function03, boolean z, int i, Composer composer, int i2) {
        CreditFrozen(function0, function02, function1, function03, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CreditFrozen(final Function0<Unit> onHelpPress, final Function0<Unit> onClose, final Function1<? super String, Unit> onUnfreezeUrlClick, final Function0<Unit> onContinue, final boolean z, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onHelpPress, "onHelpPress");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(onUnfreezeUrlClick, "onUnfreezeUrlClick");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(189829403);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onHelpPress) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClose) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onUnfreezeUrlClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinue) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(189829403, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozen (CreditFrozenComposable.kt:46)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_CREDIT_FROZEN, null, null, null, 14, null), null, null, null, null, onHelpPress, null, ComposableLambda3.rememberComposableLambda(672487734, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenComposableKt.CreditFrozen.1

                /* compiled from: CreditFrozenComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenComposableKt$CreditFrozen$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ EventLogger $eventLogger;
                    final /* synthetic */ boolean $isLoading;
                    final /* synthetic */ Function0<Unit> $onClose;
                    final /* synthetic */ Function0<Unit> $onContinue;

                    AnonymousClass1(EventLogger eventLogger, Function0<Unit> function0, boolean z, Function0<Unit> function02) {
                        this.$eventLogger = eventLogger;
                        this.$onContinue = function0;
                        this.$isLoading = z;
                        this.$onClose = function02;
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
                            ComposerKt.traceEventStart(-1128178808, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozen.<anonymous>.<anonymous> (CreditFrozenComposable.kt:54)");
                        }
                        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_credit_frozen_cta, composer, 0);
                        BentoButtons.Icon.Size16 size16 = new BentoButtons.Icon.Size16(ServerToBentoAssetMapper2.RECURRING_16, BentoButtons.Icon.Position.Trailing);
                        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue);
                        final EventLogger eventLogger = this.$eventLogger;
                        final Function0<Unit> function0 = this.$onContinue;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenComposableKt$CreditFrozen$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreditFrozenComposable.C123201.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, function0);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function02 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        boolean z = this.$isLoading;
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onClose);
                        final EventLogger eventLogger2 = this.$eventLogger;
                        final Function0<Unit> function03 = this.$onClose;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenComposableKt$CreditFrozen$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreditFrozenComposable.C123201.AnonymousClass1.invoke$lambda$3$lambda$2(eventLogger2, function03);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, function02, strStringResource, z, size16, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer, BentoButtons.Icon.Size16.$stable << 27, 0, 58430);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
                        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.RETRY, loggingUtils.getCcScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
                        function0.invoke();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, Function0 function0) {
                        loggingUtils.logDismiss$default(eventLogger, null, 1, null);
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(672487734, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozen.<anonymous> (CreditFrozenComposable.kt:53)");
                    }
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1128178808, true, new AnonymousClass1(current, onContinue, z, onClose), composer2, 54), composer2, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, true, false, ComposableLambda3.rememberComposableLambda(1847112167, true, new C123212(current, onUnfreezeUrlClick), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 15) & 458752) | 12582912, 390, 2910);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreditFrozenComposable.CreditFrozen$lambda$0(onHelpPress, onClose, onUnfreezeUrlClick, onContinue, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CreditFrozenComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenComposableKt$CreditFrozen$2 */
    static final class C123212 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Function1<String, Unit> $onUnfreezeUrlClick;

        /* JADX WARN: Multi-variable type inference failed */
        C123212(EventLogger eventLogger, Function1<? super String, Unit> function1) {
            this.$eventLogger = eventLogger;
            this.$onUnfreezeUrlClick = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1847112167, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozen.<anonymous> (CreditFrozenComposable.kt:81)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues), 0.0f, composer, 0, 1);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            final EventLogger eventLogger = this.$eventLogger;
            final Function1<String, Unit> function1 = this.$onUnfreezeUrlClick;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(50));
            BentoIcon4.Size40 size40 = new BentoIcon4.Size40(ServerToBentoAssetMapper2.UNLOCK_24);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoIcon2.m20644BentoIconFU0evQE(size40, "null", bentoTheme.getColors(composer, i3).m21368getAccent0d7_KjU(), modifierM5169size3ABfNKs, null, true, composer, BentoIcon4.Size40.$stable | 199728, 16);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21591getLargeD9Ej5fM()), composer, 0);
            Modifier modifierTestTag = TestTag3.testTag(companion, CreditFrozenComposable.CREDIT_FROZEN_TITLE_TEST_TAG);
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_credit_frozen_title, composer, 0);
            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer, i3).getDisplayCapsuleLarge();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 48, 0, 8124);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), composer, 0);
            final String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_app_credit_frozen_link, composer, 0);
            Modifier modifierTestTag2 = TestTag3.testTag(companion, CreditFrozenComposable.CREDIT_FROZEN_SUBTITLE_TEST_TAG);
            String strStringResource3 = StringResources_androidKt.stringResource(C12201R.string.credit_app_credit_frozen_subtitle, composer, 0);
            String strStringResource4 = StringResources_androidKt.stringResource(C12201R.string.credit_app_credit_frozen_link_text, composer, 0);
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
            TextStyle textM = bentoTheme.getTypography(composer, i3).getTextM();
            int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(eventLogger) | composer.changed(strStringResource2) | composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenComposableKt$CreditFrozen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreditFrozenComposable.C123212.invoke$lambda$2$lambda$1$lambda$0(eventLogger, strStringResource2, function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextWithLink.m20753BentoTextWithSubstringLinkXkG1Q0A(strStringResource3, strStringResource4, (Function0) objRememberedValue, modifierTestTag2, jM21425getFg0d7_KjU, 0L, textM, iM7919getCentere0LSkKk, composer, 3072, 32);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(EventLogger eventLogger, String str, Function1 function1) {
            loggingUtils.logLinkClick$default(eventLogger, str, null, 2, null);
            function1.invoke(str);
            return Unit.INSTANCE;
        }
    }
}

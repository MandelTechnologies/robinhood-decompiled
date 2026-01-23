package com.robinhood.android.creditcard.p091ui.waitlist.screens.intro;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.Font2;
import androidx.compose.p011ui.text.font.FontFamily4;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.ComponentActivity;
import androidx.view.compose.LocalActivity;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.SolidGoldIntroComposable;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.sections.TermsApply;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SolidGoldIntroComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aE\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"SolidGoldIntro", "", "onClose", "Lkotlin/Function0;", "onContinue", "onTermsApply", "accountSelectorTabArgs", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;Landroidx/compose/runtime/Composer;II)V", "SOLID_GOLD_INTRO_TITLE_TEST_TAG", "", "SOLID_GOLD_INTRO_SUBTITLE_TEST_TAG", "SOLID_GOLD_INTRO_TERMS_TEST_TAG", "SOLID_GOLD_INTRO_CTA_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntroComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class SolidGoldIntroComposable {
    public static final String SOLID_GOLD_INTRO_CTA_TEST_TAG = "solid-gold-intro-cta-test-tag";
    public static final String SOLID_GOLD_INTRO_SUBTITLE_TEST_TAG = "solid-gold-intro-subtitle-test-tag";
    public static final String SOLID_GOLD_INTRO_TERMS_TEST_TAG = "solid-gold-intro-terms-test-tag";
    public static final String SOLID_GOLD_INTRO_TITLE_TEST_TAG = "solid-gold-intro-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SolidGoldIntro$lambda$1(Function0 function0, Function0 function02, Function0 function03, AccountSelectorTabArgs accountSelectorTabArgs, int i, int i2, Composer composer, int i3) {
        SolidGoldIntro(function0, function02, function03, accountSelectorTabArgs, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SolidGoldIntro(final Function0<Unit> function0, final Function0<Unit> onContinue, final Function0<Unit> onTermsApply, AccountSelectorTabArgs accountSelectorTabArgs, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        AccountSelectorTabArgs accountSelectorTabArgs2;
        ComponentActivity componentActivity;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final AccountSelectorTabArgs accountSelectorTabArgs3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onTermsApply, "onTermsApply");
        Composer composerStartRestartGroup = composer.startRestartGroup(-223932138);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTermsApply) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                accountSelectorTabArgs2 = accountSelectorTabArgs;
                i3 |= composerStartRestartGroup.changedInstance(accountSelectorTabArgs2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                final AccountSelectorTabArgs accountSelectorTabArgs4 = i4 == 0 ? null : accountSelectorTabArgs2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-223932138, i3, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntro (SolidGoldIntroComposable.kt:55)");
                }
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                componentActivity = !(objConsume instanceof ComponentActivity) ? (ComponentActivity) objConsume : null;
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(componentActivity);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new SolidGoldIntroComposable2(componentActivity, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                AccountSelectorTabArgs accountSelectorTabArgs5 = accountSelectorTabArgs4;
                composer2 = composerStartRestartGroup;
                CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_WAITLIST_INTRO, null, null, null, 14, null), null, "SOLID_GOLD_CREDIT_CARD", null, function02, null, null, ComposableLambda3.rememberComposableLambda(1853574235, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntroComposableKt.SolidGoldIntro.2

                    /* compiled from: SolidGoldIntroComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntroComposableKt$SolidGoldIntro$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ Function0<Unit> $onContinue;

                        AnonymousClass1(EventLogger eventLogger, Function0<Unit> function0) {
                            this.$eventLogger = eventLogger;
                            this.$onContinue = function0;
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
                                ComposerKt.traceEventStart(1867486281, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntro.<anonymous>.<anonymous> (SolidGoldIntroComposable.kt:72)");
                            }
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), SolidGoldIntroComposable.SOLID_GOLD_INTRO_CTA_TEST_TAG);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue);
                            final EventLogger eventLogger = this.$eventLogger;
                            final Function0<Unit> function0 = this.$onContinue;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntroComposableKt$SolidGoldIntro$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SolidGoldIntroComposable.C127292.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierTestTag, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
                            loggingUtils.logContinue$default(eventLogger, null, 1, null);
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1853574235, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntro.<anonymous> (SolidGoldIntroComposable.kt:71)");
                        }
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoColor.INSTANCE.m21143getCCGoldFG0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1867486281, true, new AnonymousClass1(current, onContinue), composer3, 54), composer3, 805306368, 510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, false, false, ComposableLambda3.rememberComposableLambda(-387774006, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntroComposableKt.SolidGoldIntro.3
                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-387774006, i6, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntro.<anonymous> (SolidGoldIntroComposable.kt:87)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues);
                        AccountSelectorTabArgs accountSelectorTabArgs6 = accountSelectorTabArgs4;
                        Function0<Unit> function03 = onTermsApply;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer3, i7).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.solid_gold), null, null, null, 0, null, composer3, 0, 62);
                        ContentScale.Companion companion4 = ContentScale.INSTANCE;
                        ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, modifierM5146paddingqDBjuR0$default, (Alignment) null, companion4.getFillWidth(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getCenter(), centerHorizontally, composer3, 54);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer3.startReplaceGroup(-549140189);
                        if (accountSelectorTabArgs6 != null) {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(accountSelectorTabArgs6.getInitialSpacerHeight())), composer3, 0);
                        }
                        composer3.endReplaceGroup();
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_rh_gold_card_logo), null, null, null, 0, null, composer3, 0, 62), (String) null, SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(18), 0.0f, 2, null), (Alignment) null, companion4.getFit(), 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU(), 0, 2, null), composer3, 25008, 40);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21594getXlargeD9Ej5fM()), composer3, 0);
                        Modifier modifierTestTag = TestTag3.testTag(companion, SolidGoldIntroComposable.SOLID_GOLD_INTRO_TITLE_TEST_TAG);
                        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.solid_gold_intro_title, composer3, 0);
                        int i8 = C12201R.font.itc_garamond_std_book_condensed;
                        FontWeight.Companion companion5 = FontWeight.INSTANCE;
                        TextStyle textStyle = new TextStyle(0L, TextUnit2.getSp(50), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i8, companion5.getNormal(), 0, 0, 12, null)), (String) null, TextUnit2.getSp(-1), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(60), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
                        TextAlign.Companion companion6 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle, composer3, 48, 0, 8124);
                        composer3.endNode();
                        Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                        Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getBottomCenter());
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composer3, 48);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.solid_gold_intro_subtitle, composer3, 0), TestTag3.testTag(companion, SolidGoldIntroComposable.SOLID_GOLD_INTRO_SUBTITLE_TEST_TAG), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getDisplayCapsuleSmall(), composer3, 48, 0, 8120);
                        TermsApply.m12906TermsApplygKt5lHk(function03, TestTag3.testTag(companion, SolidGoldIntroComposable.SOLID_GOLD_INTRO_TERMS_TEST_TAG), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), composer3, 48, 0);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21594getXlargeD9Ej5fM()), composer3, 0);
                        composer3.endNode();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, ((i3 << 12) & 57344) | 12583296, 384, 3946);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                accountSelectorTabArgs3 = accountSelectorTabArgs5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                accountSelectorTabArgs3 = accountSelectorTabArgs2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntroComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SolidGoldIntroComposable.SolidGoldIntro$lambda$1(function0, onContinue, onTermsApply, accountSelectorTabArgs3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        accountSelectorTabArgs2 = accountSelectorTabArgs;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
            if (!(objConsume2 instanceof ComponentActivity)) {
            }
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(componentActivity);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new SolidGoldIntroComposable2(componentActivity, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                AccountSelectorTabArgs accountSelectorTabArgs52 = accountSelectorTabArgs4;
                composer2 = composerStartRestartGroup;
                CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_WAITLIST_INTRO, null, null, null, 14, null), null, "SOLID_GOLD_CREDIT_CARD", null, function02, null, null, ComposableLambda3.rememberComposableLambda(1853574235, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntroComposableKt.SolidGoldIntro.2

                    /* compiled from: SolidGoldIntroComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntroComposableKt$SolidGoldIntro$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ Function0<Unit> $onContinue;

                        AnonymousClass1(EventLogger eventLogger, Function0<Unit> function0) {
                            this.$eventLogger = eventLogger;
                            this.$onContinue = function0;
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
                                ComposerKt.traceEventStart(1867486281, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntro.<anonymous>.<anonymous> (SolidGoldIntroComposable.kt:72)");
                            }
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), SolidGoldIntroComposable.SOLID_GOLD_INTRO_CTA_TEST_TAG);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue);
                            final EventLogger eventLogger = this.$eventLogger;
                            final Function0 function0 = this.$onContinue;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntroComposableKt$SolidGoldIntro$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SolidGoldIntroComposable.C127292.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierTestTag, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
                            loggingUtils.logContinue$default(eventLogger, null, 1, null);
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1853574235, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntro.<anonymous> (SolidGoldIntroComposable.kt:71)");
                        }
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoColor.INSTANCE.m21143getCCGoldFG0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1867486281, true, new AnonymousClass1(current2, onContinue), composer3, 54), composer3, 805306368, 510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, false, false, ComposableLambda3.rememberComposableLambda(-387774006, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntroComposableKt.SolidGoldIntro.3
                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-387774006, i6, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.SolidGoldIntro.<anonymous> (SolidGoldIntroComposable.kt:87)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues);
                        AccountSelectorTabArgs accountSelectorTabArgs6 = accountSelectorTabArgs4;
                        Function0<Unit> function03 = onTermsApply;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer3, i7).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.solid_gold), null, null, null, 0, null, composer3, 0, 62);
                        ContentScale.Companion companion4 = ContentScale.INSTANCE;
                        ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, modifierM5146paddingqDBjuR0$default, (Alignment) null, companion4.getFillWidth(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getCenter(), centerHorizontally, composer3, 54);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer3.startReplaceGroup(-549140189);
                        if (accountSelectorTabArgs6 != null) {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(accountSelectorTabArgs6.getInitialSpacerHeight())), composer3, 0);
                        }
                        composer3.endReplaceGroup();
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_rh_gold_card_logo), null, null, null, 0, null, composer3, 0, 62), (String) null, SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(18), 0.0f, 2, null), (Alignment) null, companion4.getFit(), 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU(), 0, 2, null), composer3, 25008, 40);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21594getXlargeD9Ej5fM()), composer3, 0);
                        Modifier modifierTestTag = TestTag3.testTag(companion, SolidGoldIntroComposable.SOLID_GOLD_INTRO_TITLE_TEST_TAG);
                        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.solid_gold_intro_title, composer3, 0);
                        int i8 = C12201R.font.itc_garamond_std_book_condensed;
                        FontWeight.Companion companion5 = FontWeight.INSTANCE;
                        TextStyle textStyle = new TextStyle(0L, TextUnit2.getSp(50), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i8, companion5.getNormal(), 0, 0, 12, null)), (String) null, TextUnit2.getSp(-1), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(60), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
                        TextAlign.Companion companion6 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle, composer3, 48, 0, 8124);
                        composer3.endNode();
                        Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                        Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getBottomCenter());
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composer3, 48);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.solid_gold_intro_subtitle, composer3, 0), TestTag3.testTag(companion, SolidGoldIntroComposable.SOLID_GOLD_INTRO_SUBTITLE_TEST_TAG), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getDisplayCapsuleSmall(), composer3, 48, 0, 8120);
                        TermsApply.m12906TermsApplygKt5lHk(function03, TestTag3.testTag(companion, SolidGoldIntroComposable.SOLID_GOLD_INTRO_TERMS_TEST_TAG), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), composer3, 48, 0);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21594getXlargeD9Ej5fM()), composer3, 0);
                        composer3.endNode();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, ((i3 << 12) & 57344) | 12583296, 384, 3946);
                if (ComposerKt.isTraceInProgress()) {
                }
                accountSelectorTabArgs3 = accountSelectorTabArgs52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}

package com.robinhood.feature.sweep.onboarding.fragments;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
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
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.gold.LegacyGoldWelcomeLottieComposable;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.feature.sweep.onboarding.C33184R;
import com.robinhood.models.api.bonfire.ApiSweepFlow;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SweepOnboardingWelcomeComposable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a^\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001aN\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0013\u001aF\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0015\u001a5\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\u0010\u001d\u001ab\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0002\u0010\"¨\u0006#"}, m3636d2 = {"SweepOnboardingWelcomeComposable", "", "onClickDone", "Lkotlin/Function0;", "onClickDepositCta", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "url", "sweepWelcome", "Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepWelcome;", "sweepWelcomeGold", "Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepWelcomeGold;", "isGold", "", "isWelcomeGold", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepWelcome;Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepWelcomeGold;ZZLandroidx/compose/runtime/Composer;I)V", "SweepOnboardingWelcome", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepWelcome;ZLandroidx/compose/runtime/Composer;I)V", "SweepOnboardingWelcomeGold", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepWelcomeGold;Landroidx/compose/runtime/Composer;I)V", "PrimaryButton", "primaryButtonType", "Lcom/robinhood/feature/sweep/onboarding/fragments/PrimaryButtonType;", "onClick", "text", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/feature/sweep/onboarding/fragments/PrimaryButtonType;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SweepOnboardingWelcomeBottomBar", "doneCtaText", "depositCtaText", "depositCtaDeeplink", "(Lcom/robinhood/feature/sweep/onboarding/fragments/PrimaryButtonType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "feature-sweep-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeComposableKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class SweepOnboardingWelcomeComposable2 {

    /* compiled from: SweepOnboardingWelcomeComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SweepOnboardingWelcomeComposable.values().length];
            try {
                iArr[SweepOnboardingWelcomeComposable.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SweepOnboardingWelcomeComposable.GOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SweepOnboardingWelcomeComposable.SPARKLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButton$lambda$3(SweepOnboardingWelcomeComposable sweepOnboardingWelcomeComposable, Function0 function0, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PrimaryButton(sweepOnboardingWelcomeComposable, function0, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepOnboardingWelcome$lambda$1(Function0 function0, Function1 function1, ApiSweepFlow.SweepWelcome sweepWelcome, boolean z, int i, Composer composer, int i2) {
        SweepOnboardingWelcome(function0, function1, sweepWelcome, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepOnboardingWelcomeBottomBar$lambda$7(SweepOnboardingWelcomeComposable sweepOnboardingWelcomeComposable, Function0 function0, Function1 function1, String str, String str2, String str3, int i, Composer composer, int i2) {
        SweepOnboardingWelcomeBottomBar(sweepOnboardingWelcomeComposable, function0, function1, str, str2, str3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepOnboardingWelcomeComposable$lambda$0(Function0 function0, Function1 function1, ApiSweepFlow.SweepWelcome sweepWelcome, ApiSweepFlow.SweepWelcomeGold sweepWelcomeGold, boolean z, boolean z2, int i, Composer composer, int i2) {
        SweepOnboardingWelcomeComposable(function0, function1, sweepWelcome, sweepWelcomeGold, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepOnboardingWelcomeGold$lambda$2(Function0 function0, Function1 function1, ApiSweepFlow.SweepWelcomeGold sweepWelcomeGold, int i, Composer composer, int i2) {
        SweepOnboardingWelcomeGold(function0, function1, sweepWelcomeGold, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SweepOnboardingWelcomeComposable(Function0<Unit> onClickDone, Function1<? super String, Unit> onClickDepositCta, ApiSweepFlow.SweepWelcome sweepWelcome, final ApiSweepFlow.SweepWelcomeGold sweepWelcomeGold, boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        ApiSweepFlow.SweepWelcome sweepWelcome2;
        boolean z3;
        final Function0<Unit> function0;
        final Function1<? super String, Unit> function1;
        Intrinsics.checkNotNullParameter(onClickDone, "onClickDone");
        Intrinsics.checkNotNullParameter(onClickDepositCta, "onClickDepositCta");
        Intrinsics.checkNotNullParameter(sweepWelcome, "sweepWelcome");
        Intrinsics.checkNotNullParameter(sweepWelcomeGold, "sweepWelcomeGold");
        Composer composerStartRestartGroup = composer.startRestartGroup(-155283904);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onClickDone) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickDepositCta) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sweepWelcome) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sweepWelcomeGold) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-155283904, i2, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeComposable (SweepOnboardingWelcomeComposable.kt:42)");
            }
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-382703710);
                SweepOnboardingWelcomeGold(onClickDone, onClickDepositCta, sweepWelcomeGold, composerStartRestartGroup, ((i2 >> 3) & 896) | (i2 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
                composerStartRestartGroup.endReplaceGroup();
                sweepWelcome2 = sweepWelcome;
                z3 = z;
                function1 = onClickDepositCta;
                function0 = onClickDone;
            } else {
                composerStartRestartGroup.startReplaceGroup(-382506767);
                sweepWelcome2 = sweepWelcome;
                z3 = z;
                SweepOnboardingWelcome(onClickDone, onClickDepositCta, sweepWelcome2, z3, composerStartRestartGroup, (i2 & 1022) | ((i2 >> 3) & 7168));
                function0 = onClickDone;
                function1 = onClickDepositCta;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            sweepWelcome2 = sweepWelcome;
            z3 = z;
            function1 = onClickDepositCta;
            function0 = onClickDone;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final ApiSweepFlow.SweepWelcome sweepWelcome3 = sweepWelcome2;
            final boolean z4 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SweepOnboardingWelcomeComposable2.SweepOnboardingWelcomeComposable$lambda$0(function0, function1, sweepWelcome3, sweepWelcomeGold, z4, z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SweepOnboardingWelcome(final Function0<Unit> function0, final Function1<? super String, Unit> function1, final ApiSweepFlow.SweepWelcome sweepWelcome, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2083965331);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sweepWelcome) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2083965331, i2, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcome (SweepOnboardingWelcomeComposable.kt:65)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-2018760376, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeComposableKt.SweepOnboardingWelcome.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2018760376, i3, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcome.<anonymous> (SweepOnboardingWelcomeComposable.kt:68)");
                    }
                    SweepOnboardingWelcomeComposable2.SweepOnboardingWelcomeBottomBar(z ? SweepOnboardingWelcomeComposable.GOLD : SweepOnboardingWelcomeComposable.STANDARD, function0, function1, sweepWelcome.getDoneCtaText(), sweepWelcome.getDepositCtaText(), sweepWelcome.getDepositCtaDeeplink(), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(602543227, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeComposableKt.SweepOnboardingWelcome.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(602543227, i3, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcome.<anonymous> (SweepOnboardingWelcomeComposable.kt:82)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, composer2, 6, 1);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    ApiSweepFlow.SweepWelcome sweepWelcome2 = sweepWelcome;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(C33184R.drawable.sweep_welcome_checkmark, composer2, 0), (String) null, TestTag3.testTag(companion, String.valueOf(C33184R.drawable.sweep_welcome_checkmark)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(C33184R.dimen.sweep_welcome_checkmark_bottom_margin, composer2, 0)), composer2, 0);
                    String title = sweepWelcome2.getTitle();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getDisplayCapsuleMedium(), composer2, 0, 0, 8190);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM()), composer2, 0);
                    BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(sweepWelcome2.getDescriptionMarkdown(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, C20690R.attr.textAppearanceRegularMedium, 17, 0, 0, null, composer2, 196656, 460);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SweepOnboardingWelcomeComposable2.SweepOnboardingWelcome$lambda$1(function0, function1, sweepWelcome, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SweepOnboardingWelcomeGold(final Function0<Unit> function0, final Function1<? super String, Unit> function1, final ApiSweepFlow.SweepWelcomeGold sweepWelcomeGold, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1717675759);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sweepWelcomeGold) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1717675759, i2, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeGold (SweepOnboardingWelcomeComposable.kt:112)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(1909917348, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeComposableKt.SweepOnboardingWelcomeGold.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1909917348, i3, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeGold.<anonymous> (SweepOnboardingWelcomeComposable.kt:115)");
                    }
                    SweepOnboardingWelcomeComposable2.SweepOnboardingWelcomeBottomBar(SweepOnboardingWelcomeComposable.SPARKLE, function0, function1, sweepWelcomeGold.getDoneCtaText(), sweepWelcomeGold.getDepositCtaText(), sweepWelcomeGold.getDepositCtaDeeplink(), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(236253655, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeComposableKt.SweepOnboardingWelcomeGold.2
                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(236253655, i3, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeGold.<anonymous> (SweepOnboardingWelcomeComposable.kt:125)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, composer2, 6, 1);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    ApiSweepFlow.SweepWelcomeGold sweepWelcomeGold2 = sweepWelcomeGold;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    LegacyGoldWelcomeLottieComposable.GoldWelcomeLottie(sweepWelcomeGold2.getLottieAnimationPath(), TestTag3.testTag(AspectRatio3.aspectRatio$default(SizeKt.fillMaxHeight(companion, 0.4f), 1.0f, false, 2, null), sweepWelcomeGold2.getLottieAnimationPath()), 0, composer2, 0, 4);
                    String title = sweepWelcomeGold2.getTitle();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(title, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getDisplayCapsuleMedium(), composer2, 48, 0, 8124);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM()), composer2, 0);
                    BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(sweepWelcomeGold2.getDescriptionMarkdown(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, C20690R.attr.textAppearanceRegularMedium, 1, 0, 0, null, composer2, 196656, 460);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SweepOnboardingWelcomeComposable2.SweepOnboardingWelcomeGold$lambda$2(function0, function1, sweepWelcomeGold, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrimaryButton(final SweepOnboardingWelcomeComposable primaryButtonType, final Function0<Unit> onClick, final String text, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(primaryButtonType, "primaryButtonType");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(386160973);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(primaryButtonType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(386160973, i3, -1, "com.robinhood.feature.sweep.onboarding.fragments.PrimaryButton (SweepOnboardingWelcomeComposable.kt:168)");
                }
                Modifier modifierTestTag = TestTag3.testTag(modifier5, primaryButtonType.toString());
                i4 = WhenMappings.$EnumSwitchMapping$0[primaryButtonType.ordinal()];
                if (i4 == 1) {
                    if (i4 == 2) {
                        composerStartRestartGroup.startReplaceGroup(1733522471);
                        BentoButtonKt.BentoGoldButton(onClick, text, modifierTestTag, (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, false, (String) null, composerStartRestartGroup, (i3 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i4 != 3) {
                            composerStartRestartGroup.startReplaceGroup(1733515852);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(1733527626);
                        BentoSparkleButton2.BentoSparkleButton(onClick, text, modifierTestTag, null, false, false, false, composerStartRestartGroup, (i3 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 120);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1733517539);
                    modifier3 = modifier5;
                    BentoButtonKt.m20586BentoButtonEikTQX8(onClick, text, modifierTestTag, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i3 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0, 8184);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SweepOnboardingWelcomeComposable2.PrimaryButton$lambda$3(primaryButtonType, onClick, text, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierTestTag2 = TestTag3.testTag(modifier5, primaryButtonType.toString());
            i4 = WhenMappings.$EnumSwitchMapping$0[primaryButtonType.ordinal()];
            if (i4 == 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SweepOnboardingWelcomeBottomBar(final SweepOnboardingWelcomeComposable sweepOnboardingWelcomeComposable, final Function0<Unit> function0, final Function1<? super String, Unit> function1, final String str, final String str2, final String str3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-323108500);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(sweepOnboardingWelcomeComposable.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-323108500, i2, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeBottomBar (SweepOnboardingWelcomeComposable.kt:200)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (str2 != null && str3 != null) {
                composerStartRestartGroup.startReplaceGroup(-466279417);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z = ((i2 & 896) == 256) | ((458752 & i2) == 131072);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SweepOnboardingWelcomeComposable2.SweepOnboardingWelcomeBottomBar$lambda$6$lambda$5$lambda$4(function1, str3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                PrimaryButton(sweepOnboardingWelcomeComposable, (Function0) objRememberedValue, str2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, (i2 & 14) | 3072 | ((i2 >> 6) & 896), 0);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2072669496, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeComposableKt$SweepOnboardingWelcomeBottomBar$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2072669496, i4, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeBottomBar.<anonymous>.<anonymous> (SweepOnboardingWelcomeComposable.kt:211)");
                        }
                        BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, type2, false, false, null, null, null, null, false, null, composer2, 24960, 0, 8168);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-465657898);
                PrimaryButton(sweepOnboardingWelcomeComposable, function0, str, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | ((i2 >> 3) & 896), 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SweepOnboardingWelcomeComposable2.SweepOnboardingWelcomeBottomBar$lambda$7(sweepOnboardingWelcomeComposable, function0, function1, str, str2, str3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepOnboardingWelcomeBottomBar$lambda$6$lambda$5$lambda$4(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }
}

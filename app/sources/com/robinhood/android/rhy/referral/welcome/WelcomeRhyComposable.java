package com.robinhood.android.rhy.referral.welcome;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContent2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.FixedScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.pager.Pager;
import com.google.accompanist.pager.PagerIndicator;
import com.google.accompanist.pager.PagerScope;
import com.google.accompanist.pager.PagerState;
import com.google.accompanist.pager.PagerStateKt;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.HtmlCompat2;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.rhy.referral.C27406R;
import com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposable;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.InlineAnnotatedString;
import com.robinhood.compose.bento.util.InlineAnnotatedString2;
import com.robinhood.rhy.referral.RhyReferralOnboardingStore4;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.ImmutableMap3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: WelcomeRhyComposable.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u009d\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\u0010\u0016\u001a5\u0010\u0017\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0011H\u0001¢\u0006\u0002\u0010\u0018\u001a=\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u001e\u001a!\u0010 \u001a\u00020\u00032\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0011H\u0001¢\u0006\u0002\u0010\"\u001aY\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b-\u0010.\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006/²\u0006\n\u00100\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u00020\u0005X\u008a\u0084\u0002"}, m3636d2 = {WelcomeRhyComposable.RhyWelcomeValuePropImage, "", "WelcomeRhyComposable", "", "ctaLoading", "", "ctaEnabled", "showContinue", "disclosureContent", "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "dialog", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;", "onLoginClick", "Lkotlin/Function0;", "onSignupClick", "onContinueClick", "onDisclosureClick", "Lkotlin/Function1;", "onDialogPrimaryCta", "onDialogSecondaryCta", "modifier", "Landroidx/compose/ui/Modifier;", "(ZZZLcom/robinhood/staticcontent/model/disclosure/DisclosureContent;Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "RhyWelcomePage", "(Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "WelcomeDisclosure", "disclosureText", "disclosureLink", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CashBackPage", "(Landroidx/compose/runtime/Composer;I)V", "RoundUpPage", "SafetyFirstPage", "onClickTerms", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ValuePropPage", "title", "subtitle", PlaceTypes.PAINTER, "Landroidx/compose/ui/graphics/painter/Painter;", "imageBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "subtitleInlineLinkText", "subtitleInlineLinkTextOnClick", "imageContentDescription", "ValuePropPage-hYmLsZ8", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;JLjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "feature-rhy-referral_externalDebug", "forceDayButtonBar", "pressed"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class WelcomeRhyComposable {
    public static final String RhyWelcomeValuePropImage = "RhyWelcomeValuePropImage";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CashBackPage$lambda$9(int i, Composer composer, int i2) {
        CashBackPage(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyWelcomePage$lambda$1(DisclosureContent disclosureContent, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        RhyWelcomePage(disclosureContent, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RoundUpPage$lambda$10(int i, Composer composer, int i2) {
        RoundUpPage(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SafetyFirstPage$lambda$13(Function1 function1, int i, Composer composer, int i2) {
        SafetyFirstPage(function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValuePropPage_hYmLsZ8$lambda$17(String str, String str2, Painter painter, long j, String str3, Function0 function0, String str4, int i, int i2, Composer composer, int i3) {
        m18320ValuePropPagehYmLsZ8(str, str2, painter, j, str3, function0, str4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WelcomeDisclosure$lambda$8(String str, String str2, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        WelcomeDisclosure(str, str2, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WelcomeRhyComposable$lambda$0(boolean z, boolean z2, boolean z3, DisclosureContent disclosureContent, RhyReferralOnboardingStore4.Dialog.DialogContent dialogContent, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function0 function04, Function0 function05, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        WelcomeRhyComposable(z, z2, z3, disclosureContent, dialogContent, function0, function02, function03, function1, function04, function05, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* compiled from: WelcomeRhyComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt$WelcomeRhyComposable$1 */
    static final class C275521 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $ctaEnabled;
        final /* synthetic */ boolean $ctaLoading;
        final /* synthetic */ RhyReferralOnboardingStore4.Dialog.DialogContent $dialog;
        final /* synthetic */ DisclosureContent $disclosureContent;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onContinueClick;
        final /* synthetic */ Function0<Unit> $onDialogPrimaryCta;
        final /* synthetic */ Function0<Unit> $onDialogSecondaryCta;
        final /* synthetic */ Function1<String, Unit> $onDisclosureClick;
        final /* synthetic */ Function0<Unit> $onLoginClick;
        final /* synthetic */ Function0<Unit> $onSignupClick;
        final /* synthetic */ boolean $showContinue;

        /* JADX WARN: Multi-variable type inference failed */
        C275521(Modifier modifier, RhyReferralOnboardingStore4.Dialog.DialogContent dialogContent, Function0<Unit> function0, Function0<Unit> function02, DisclosureContent disclosureContent, Function1<? super String, Unit> function1, boolean z, Function0<Unit> function03, boolean z2, boolean z3, Function0<Unit> function04, Function0<Unit> function05) {
            this.$modifier = modifier;
            this.$dialog = dialogContent;
            this.$onDialogPrimaryCta = function0;
            this.$onDialogSecondaryCta = function02;
            this.$disclosureContent = disclosureContent;
            this.$onDisclosureClick = function1;
            this.$showContinue = z;
            this.$onContinueClick = function03;
            this.$ctaLoading = z2;
            this.$ctaEnabled = z3;
            this.$onSignupClick = function04;
            this.$onLoginClick = function05;
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
                ComposerKt.traceEventStart(1987801480, i, -1, "com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposable.<anonymous> (WelcomeRhyComposable.kt:76)");
            }
            Modifier modifier = this.$modifier;
            RhyReferralOnboardingStore4.Dialog.DialogContent dialogContent = this.$dialog;
            Function0<Unit> function0 = this.$onDialogPrimaryCta;
            Function0<Unit> function02 = this.$onDialogSecondaryCta;
            final DisclosureContent disclosureContent = this.$disclosureContent;
            final Function1<String, Unit> function1 = this.$onDisclosureClick;
            final boolean z = this.$showContinue;
            final Function0<Unit> function03 = this.$onContinueClick;
            final boolean z2 = this.$ctaLoading;
            final boolean z3 = this.$ctaEnabled;
            final Function0<Unit> function04 = this.$onSignupClick;
            final Function0<Unit> function05 = this.$onLoginClick;
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifier);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceGroup(-325406079);
            if (dialogContent != null) {
                RhyReferralOnboardingActionDialog.RhyReferralOnboardingActionDialog(dialogContent, function0, function02, composer, 0);
            }
            composer.endReplaceGroup();
            final PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, composer, 0, 1);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt$WelcomeRhyComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(WelcomeRhyComposable.C275521.invoke$lambda$4$lambda$1$lambda$0(pagerStateRememberPagerState));
                    }
                });
                composer.updateRememberedValue(objRememberedValue);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composer.endReplaceGroup();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Pager.m9191HorizontalPager7SJwSw(4, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), pagerStateRememberPagerState, false, 0.0f, null, null, null, null, false, ComposableLambda3.rememberComposableLambda(404300061, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt$WelcomeRhyComposable$1$1$1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer2, Integer num2) {
                    invoke(pagerScope, num.intValue(), composer2, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PagerScope HorizontalPager, int i2, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                    if ((i3 & 48) == 0) {
                        i3 |= composer2.changed(i2) ? 32 : 16;
                    }
                    if ((i3 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(404300061, i3, -1, "com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposable.<anonymous>.<anonymous>.<anonymous> (WelcomeRhyComposable.kt:91)");
                    }
                    if (i2 == 0) {
                        composer2.startReplaceGroup(1985304224);
                        WelcomeRhyComposable.RhyWelcomePage(disclosureContent, null, function1, composer2, 0, 2);
                        composer2.endReplaceGroup();
                    } else if (i2 == 1) {
                        composer2.startReplaceGroup(1985310123);
                        WelcomeRhyComposable.CashBackPage(composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (i2 == 2) {
                        composer2.startReplaceGroup(1985311402);
                        WelcomeRhyComposable.RoundUpPage(composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (i2 != 3) {
                        composer2.startReplaceGroup(1415216069);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1985312686);
                        WelcomeRhyComposable.SafetyFirstPage(function1, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 54, 6, 1016);
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierAlign = boxScopeInstance.align(WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null)), companion.getBottomCenter());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierAlign);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            float f = 6;
            PagerIndicator.m9199HorizontalPagerIndicatorK_mkGiw(pagerStateRememberPagerState, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0, (Function1<? super Integer, Integer>) null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), 0.0f, (Shape) null, composer, 14155776, 780);
            composer.startReplaceGroup(-1981321372);
            boolean isDay = invoke$lambda$4$lambda$2(snapshotState4) ? true : bentoTheme.getColors(composer, i2).getIsDay();
            composer.endReplaceGroup();
            BentoTheme2.BentoTheme(Boolean.valueOf(isDay), null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1372070828, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt$WelcomeRhyComposable$1$1$2$1
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
                        ComposerKt.traceEventStart(-1372070828, i3, -1, "com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeRhyComposable.kt:121)");
                    }
                    if (z) {
                        composer2.startReplaceGroup(-158229299);
                        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function03, StringResources_androidKt.stringResource(C27406R.string.rhy_welcome_continue_action, composer2, 0), z2, null, z3, null, null, false, null, false, composer2, 0, 0, 64063);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-157830236);
                        Orientation orientation = Orientation.Horizontal;
                        String strStringResource = StringResources_androidKt.stringResource(C27406R.string.rhy_welcome_sign_up_action, composer2, 0);
                        String strStringResource2 = StringResources_androidKt.stringResource(C27406R.string.rhy_welcome_login_action, composer2, 0);
                        Function0<Unit> function06 = function04;
                        boolean z4 = z2;
                        boolean z5 = z3;
                        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, orientation, function06, strStringResource, z4, null, z5, function05, strStringResource2, z4, null, z5, composer2, 196608, 0, 16927);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 100859904, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        private static final boolean invoke$lambda$4$lambda$2(SnapshotState4<Boolean> snapshotState4) {
            return snapshotState4.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$4$lambda$1$lambda$0(PagerState pagerState) {
            return pagerState.getCurrentPage() == 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WelcomeRhyComposable(final boolean z, final boolean z2, final boolean z3, final DisclosureContent disclosureContent, final RhyReferralOnboardingStore4.Dialog.DialogContent dialogContent, final Function0<Unit> onLoginClick, final Function0<Unit> onSignupClick, final Function0<Unit> onContinueClick, final Function1<? super String, Unit> onDisclosureClick, final Function0<Unit> onDialogPrimaryCta, final Function0<Unit> onDialogSecondaryCta, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z4;
        DisclosureContent disclosureContent2;
        RhyReferralOnboardingStore4.Dialog.DialogContent dialogContent2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onLoginClick, "onLoginClick");
        Intrinsics.checkNotNullParameter(onSignupClick, "onSignupClick");
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Intrinsics.checkNotNullParameter(onDisclosureClick, "onDisclosureClick");
        Intrinsics.checkNotNullParameter(onDialogPrimaryCta, "onDialogPrimaryCta");
        Intrinsics.checkNotNullParameter(onDialogSecondaryCta, "onDialogSecondaryCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(1159615859);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                z4 = z2;
                i4 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i4 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        disclosureContent2 = disclosureContent;
                        i4 |= composerStartRestartGroup.changedInstance(disclosureContent2) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            dialogContent2 = dialogContent;
                            i4 |= composerStartRestartGroup.changedInstance(dialogContent2) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i4 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(onLoginClick) ? 131072 : 65536;
                        }
                        if ((i3 & 64) != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(onSignupClick) ? 1048576 : 524288;
                        }
                        if ((i3 & 128) != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(onContinueClick) ? 8388608 : 4194304;
                        }
                        if ((i3 & 256) != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(onDisclosureClick) ? 67108864 : 33554432;
                        }
                        if ((i3 & 512) != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(onDialogPrimaryCta) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i5 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i5 = i2 | (composerStartRestartGroup.changedInstance(onDialogSecondaryCta) ? 4 : 2);
                        } else {
                            i5 = i2;
                        }
                        int i10 = i5;
                        i6 = i3 & 2048;
                        if (i6 != 0) {
                            i9 = i10 | 48;
                            i7 = i6;
                        } else {
                            if ((i2 & 48) != 0) {
                                i7 = i6;
                                i8 = i10;
                                if ((i4 & 306783379) == 306783378 || (i8 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                                    Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier;
                                    if (ComposerKt.isTraceInProgress()) {
                                        modifier2 = modifier4;
                                    } else {
                                        modifier2 = modifier4;
                                        ComposerKt.traceEventStart(1159615859, i4, i8, "com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposable (WelcomeRhyComposable.kt:74)");
                                    }
                                    Modifier modifier5 = modifier2;
                                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1987801480, true, new C275521(modifier5, dialogContent2, onDialogPrimaryCta, onDialogSecondaryCta, disclosureContent2, onDisclosureClick, z3, onContinueClick, z, z4, onSignupClick, onLoginClick), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier5;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return WelcomeRhyComposable.WelcomeRhyComposable$lambda$0(z, z2, z3, disclosureContent, dialogContent, onLoginClick, onSignupClick, onContinueClick, onDisclosureClick, onDialogPrimaryCta, onDialogSecondaryCta, modifier3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i7 = i6;
                            i9 = i10 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
                        }
                        i8 = i9;
                        if ((i4 & 306783379) == 306783378) {
                            if (i7 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier modifier52 = modifier2;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1987801480, true, new C275521(modifier52, dialogContent2, onDialogPrimaryCta, onDialogSecondaryCta, disclosureContent2, onDisclosureClick, z3, onContinueClick, z, z4, onSignupClick, onLoginClick), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    dialogContent2 = dialogContent;
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if ((i3 & 512) != 0) {
                    }
                    if ((i3 & 1024) != 0) {
                    }
                    int i102 = i5;
                    i6 = i3 & 2048;
                    if (i6 != 0) {
                    }
                    i8 = i9;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                disclosureContent2 = disclosureContent;
                if ((i3 & 16) == 0) {
                }
                dialogContent2 = dialogContent;
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if ((i3 & 512) != 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                int i1022 = i5;
                i6 = i3 & 2048;
                if (i6 != 0) {
                }
                i8 = i9;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 8) != 0) {
            }
            disclosureContent2 = disclosureContent;
            if ((i3 & 16) == 0) {
            }
            dialogContent2 = dialogContent;
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            int i10222 = i5;
            i6 = i3 & 2048;
            if (i6 != 0) {
            }
            i8 = i9;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z4 = z2;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        disclosureContent2 = disclosureContent;
        if ((i3 & 16) == 0) {
        }
        dialogContent2 = dialogContent;
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        int i102222 = i5;
        i6 = i3 & 2048;
        if (i6 != 0) {
        }
        i8 = i9;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean WelcomeDisclosure$lambda$3(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhyWelcomePage(final DisclosureContent disclosureContent, Modifier modifier, final Function1<? super String, Unit> onDisclosureClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDisclosureClick, "onDisclosureClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1326333308);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(disclosureContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onDisclosureClick) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1326333308, i3, -1, "com.robinhood.android.rhy.referral.welcome.RhyWelcomePage (WelcomeRhyComposable.kt:153)");
                }
                Boolean bool = Boolean.TRUE;
                Modifier modifier5 = modifier4;
                BentoTheme2.BentoTheme(bool, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(-1363144756, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt.RhyWelcomePage.1
                    public final void invoke(Composer composer2, int i5) {
                        BentoTheme bentoTheme;
                        int i6;
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1363144756, i5, -1, "com.robinhood.android.rhy.referral.welcome.RhyWelcomePage.<anonymous> (WelcomeRhyComposable.kt:155)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme2.getColors(composer2, i7).getCosmonautLight(), null, 2, null);
                        DisclosureContent disclosureContent2 = disclosureContent;
                        Function1<String, Unit> function1 = onDisclosureClick;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme2.getSpacing(composer2, i7).m21596getXxlargeD9Ej5fM(), 0.0f, composer2, 6, 2);
                        String strStringResource = StringResources_androidKt.stringResource(C27406R.string.rhy_welcome_landing_title, composer2, 0);
                        TextStyle displayCapsuleLarge = bentoTheme2.getTypography(composer2, i7).getDisplayCapsuleLarge();
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer2, 0, 0, 8124);
                        Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme2.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 0.0f, composer2, 6, 2);
                        Resources resources = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        BentoText2.m20747BentoText38GnDrw(HtmlCompat2.fromHtml$default(resources, C27406R.string.rhy_welcome_landing_subtitle, 0, 2, null).toString(), modifierM21622defaultHorizontalPaddingWMci_g02, null, null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i7).getTextS(), composer2, 24576, 0, 8108);
                        Composer composer3 = composer2;
                        composer3.startReplaceGroup(-513370265);
                        if (disclosureContent2 == null) {
                            bentoTheme = bentoTheme2;
                            i6 = i7;
                        } else {
                            bentoTheme = bentoTheme2;
                            i6 = i7;
                            WelcomeRhyComposable.WelcomeDisclosure(disclosureContent2.getTitle(), disclosureContent2.getContent().toString(), function1, com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composer3, i6).m21593getSmallD9Ej5fM(), 0.0f, composer3, 6, 2), composer2, 0, 0);
                            composer3 = composer2;
                        }
                        composer3.endReplaceGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(C27406R.drawable.rhy_welcome_landing_swipe, composer3, 0), (String) null, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer3, i6).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), (Alignment) null, new FixedScale(1.1f), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WelcomeRhyComposable.RhyWelcomePage$lambda$1(disclosureContent, modifier3, onDisclosureClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Boolean bool2 = Boolean.TRUE;
            Modifier modifier52 = modifier4;
            BentoTheme2.BentoTheme(bool2, null, null, null, null, bool2, null, null, ComposableLambda3.rememberComposableLambda(-1363144756, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt.RhyWelcomePage.1
                public final void invoke(Composer composer2, int i5) {
                    BentoTheme bentoTheme;
                    int i6;
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1363144756, i5, -1, "com.robinhood.android.rhy.referral.welcome.RhyWelcomePage.<anonymous> (WelcomeRhyComposable.kt:155)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme2.getColors(composer2, i7).getCosmonautLight(), null, 2, null);
                    DisclosureContent disclosureContent2 = disclosureContent;
                    Function1<String, Unit> function1 = onDisclosureClick;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme2.getSpacing(composer2, i7).m21596getXxlargeD9Ej5fM(), 0.0f, composer2, 6, 2);
                    String strStringResource = StringResources_androidKt.stringResource(C27406R.string.rhy_welcome_landing_title, composer2, 0);
                    TextStyle displayCapsuleLarge = bentoTheme2.getTypography(composer2, i7).getDisplayCapsuleLarge();
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer2, 0, 0, 8124);
                    Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme2.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 0.0f, composer2, 6, 2);
                    Resources resources = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    BentoText2.m20747BentoText38GnDrw(HtmlCompat2.fromHtml$default(resources, C27406R.string.rhy_welcome_landing_subtitle, 0, 2, null).toString(), modifierM21622defaultHorizontalPaddingWMci_g02, null, null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i7).getTextS(), composer2, 24576, 0, 8108);
                    Composer composer3 = composer2;
                    composer3.startReplaceGroup(-513370265);
                    if (disclosureContent2 == null) {
                        bentoTheme = bentoTheme2;
                        i6 = i7;
                    } else {
                        bentoTheme = bentoTheme2;
                        i6 = i7;
                        WelcomeRhyComposable.WelcomeDisclosure(disclosureContent2.getTitle(), disclosureContent2.getContent().toString(), function1, com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composer3, i6).m21593getSmallD9Ej5fM(), 0.0f, composer3, 6, 2), composer2, 0, 0);
                        composer3 = composer2;
                    }
                    composer3.endReplaceGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(C27406R.drawable.rhy_welcome_landing_swipe, composer3, 0), (String) null, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer3, i6).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), (Alignment) null, new FixedScale(1.1f), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WelcomeDisclosure(final String disclosureText, final String str, final Function1<? super String, Unit> onDisclosureClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        InteractionSource3 interactionSource3;
        long jM6705copywmQWz5c$default;
        ImmutableMap3 immutableMap3PersistentMapOf;
        InlineAnnotatedString inlineAnnotatedString;
        long j;
        int i4;
        Modifier modifierM4891clickableO2vRcR0$default;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(disclosureText, "disclosureText");
        Intrinsics.checkNotNullParameter(onDisclosureClick, "onDisclosureClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1409354525);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(disclosureText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisclosureClick) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1409354525, i3, -1, "com.robinhood.android.rhy.referral.welcome.WelcomeDisclosure (WelcomeRhyComposable.kt:204)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                interactionSource3 = (InteractionSource3) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (!WelcomeDisclosure$lambda$3(PressInteraction2.collectIsPressedAsState(interactionSource3, composerStartRestartGroup, 6))) {
                    jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(BentoColor.INSTANCE.m21219getDayJade0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(BentoColor.INSTANCE.m21219getDayJade0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                if (str != null) {
                    builder.append(disclosureText);
                } else {
                    builder.append(disclosureText + PlaceholderUtils.XXShortPlaceholderText);
                    InlineTextContent2.appendInlineContent(builder, "popOutIcon", "[pop out icon]");
                }
                AnnotatedString annotatedString = builder.toAnnotatedString();
                if (str != null) {
                    immutableMap3PersistentMapOf = extensions2.persistentMapOf();
                } else {
                    immutableMap3PersistentMapOf = extensions2.persistentMapOf(InlineAnnotatedString2.m21615inlineContentPairg2O1Hgs("popOutIcon", new BentoIcon4.Size16(ServerToBentoAssetMapper2.POP_OUT_16), "", jM6705copywmQWz5c$default));
                }
                InlineAnnotatedString inlineAnnotatedString2 = new InlineAnnotatedString(annotatedString, immutableMap3PersistentMapOf);
                composerStartRestartGroup.startReplaceGroup(-1474954514);
                if (str != null) {
                    modifierM4891clickableO2vRcR0$default = Modifier.INSTANCE;
                    inlineAnnotatedString = inlineAnnotatedString2;
                    j = jM6705copywmQWz5c$default;
                    i4 = 0;
                } else {
                    inlineAnnotatedString = inlineAnnotatedString2;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Role roleM7472boximpl = Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WelcomeRhyComposable.WelcomeDisclosure$lambda$6$lambda$5(onDisclosureClick, str);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    j = jM6705copywmQWz5c$default;
                    i4 = 0;
                    modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(companion2, interactionSource3, null, false, null, roleM7472boximpl, function0, 12, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen = modifier4.then(modifierM4891clickableO2vRcR0$default);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM(), 0.0f, 11, null);
                AnnotatedString annotatedString2 = inlineAnnotatedString.getAnnotatedString();
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS();
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                ImmutableMap<String, InlineTextContent> inlineContent = inlineAnnotatedString.getInlineContent();
                Color colorM6701boximpl = Color.m6701boximpl(j);
                TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7919getCentere0LSkKk);
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoText2.m20748BentoTextQnj7Zds(annotatedString2, modifierM5146paddingqDBjuR0$default, colorM6701boximpl, null, null, null, textAlignM7912boximpl, 0, false, 0, 0, inlineContent, null, textS, composer2, 0, 0, 6072);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WelcomeRhyComposable.WelcomeDisclosure$lambda$8(disclosureText, str, onDisclosureClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            interactionSource3 = (InteractionSource3) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (!WelcomeDisclosure$lambda$3(PressInteraction2.collectIsPressedAsState(interactionSource3, composerStartRestartGroup, 6))) {
            }
            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
            if (str != null) {
            }
            AnnotatedString annotatedString3 = builder2.toAnnotatedString();
            if (str != null) {
            }
            InlineAnnotatedString inlineAnnotatedString22 = new InlineAnnotatedString(annotatedString3, immutableMap3PersistentMapOf);
            composerStartRestartGroup.startReplaceGroup(-1474954514);
            if (str != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen2 = modifier4.then(modifierM4891clickableO2vRcR0$default);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Modifier.Companion companion42 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM(), 0.0f, 11, null);
                AnnotatedString annotatedString22 = inlineAnnotatedString.getAnnotatedString();
                TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS();
                int iM7919getCentere0LSkKk2 = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                ImmutableMap<String, InlineTextContent> inlineContent2 = inlineAnnotatedString.getInlineContent();
                Color colorM6701boximpl2 = Color.m6701boximpl(j);
                TextAlign textAlignM7912boximpl2 = TextAlign.m7912boximpl(iM7919getCentere0LSkKk2);
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoText2.m20748BentoTextQnj7Zds(annotatedString22, modifierM5146paddingqDBjuR0$default2, colorM6701boximpl2, null, null, null, textAlignM7912boximpl2, 0, false, 0, 0, inlineContent2, null, textS2, composer2, 0, 0, 6072);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WelcomeDisclosure$lambda$6$lambda$5(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public static final void CashBackPage(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2128678429);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2128678429, i, -1, "com.robinhood.android.rhy.referral.welcome.CashBackPage (WelcomeRhyComposable.kt:267)");
            }
            m18320ValuePropPagehYmLsZ8(StringResources_androidKt.stringResource(C27406R.string.rhy_welcome_swipe_first_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C27406R.string.rhy_welcome_swipe_first_subtitle, composerStartRestartGroup, 0), PainterResources_androidKt.painterResource(C27406R.drawable.rhy_welcome_first_swipe, composerStartRestartGroup, 0), BentoColor.INSTANCE.m21255getDayXrayLight0d7_KjU(), null, null, null, composerStartRestartGroup, 0, 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WelcomeRhyComposable.CashBackPage$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void RoundUpPage(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1710079850);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1710079850, i, -1, "com.robinhood.android.rhy.referral.welcome.RoundUpPage (WelcomeRhyComposable.kt:278)");
            }
            m18320ValuePropPagehYmLsZ8(StringResources_androidKt.stringResource(C27406R.string.rhy_welcome_swipe_second_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C27406R.string.rhy_welcome_swipe_second_subtitle, composerStartRestartGroup, 0), PainterResources_androidKt.painterResource(C27406R.drawable.rhy_welcome_second_swipe, composerStartRestartGroup, 0), BentoColor.INSTANCE.m21224getDayLumen0d7_KjU(), null, null, null, composerStartRestartGroup, 0, 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WelcomeRhyComposable.RoundUpPage$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SafetyFirstPage(final Function1<? super String, Unit> onClickTerms, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onClickTerms, "onClickTerms");
        Composer composerStartRestartGroup = composer.startRestartGroup(198551844);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onClickTerms) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(198551844, i2, -1, "com.robinhood.android.rhy.referral.welcome.SafetyFirstPage (WelcomeRhyComposable.kt:289)");
            }
            final String strStringResource = StringResources_androidKt.stringResource(C27406R.string.rhy_welcome_swipe_third_subtitle_link, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C27406R.string.rhy_welcome_swipe_third_title, composerStartRestartGroup, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(C27406R.string.rhy_welcome_swipe_third_subtitle, composerStartRestartGroup, 0);
            String strStringResource4 = StringResources_androidKt.stringResource(C27406R.string.rhy_welcome_swipe_third_subtitle_link_text, composerStartRestartGroup, 0);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(C27406R.drawable.rhy_welcome_third_swipe, composerStartRestartGroup, 0);
            long jM21214getDayHydroLight0d7_KjU = BentoColor.INSTANCE.m21214getDayHydroLight0d7_KjU();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(strStringResource) | ((i2 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WelcomeRhyComposable.SafetyFirstPage$lambda$12$lambda$11(onClickTerms, strStringResource);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            m18320ValuePropPagehYmLsZ8(strStringResource2, strStringResource3, painterPainterResource, jM21214getDayHydroLight0d7_KjU, strStringResource4, (Function0) objRememberedValue, null, composerStartRestartGroup, 0, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WelcomeRhyComposable.SafetyFirstPage$lambda$13(onClickTerms, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SafetyFirstPage$lambda$12$lambda$11(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0154  */
    /* renamed from: ValuePropPage-hYmLsZ8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18320ValuePropPagehYmLsZ8(final String title, final String subtitle, final Painter painter, final long j, String str, Function0<Unit> function0, String str2, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        final String str3;
        int i4;
        Function0<Unit> function02;
        int i5;
        String str4;
        int i6;
        String str5;
        Modifier.Companion companion;
        BentoTheme bentoTheme;
        int i7;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        TextAlign.Companion companion2;
        Composer composer2;
        final Function0<Unit> function03;
        final String str6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(painter, "painter");
        Composer composerStartRestartGroup = composer.startRestartGroup(-566659119);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(subtitle) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(painter) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                str3 = str;
                i3 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        str4 = str2;
                        i3 |= composerStartRestartGroup.changed(str4) ? 1048576 : 524288;
                    }
                    i6 = i3;
                    if ((599187 & i6) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        str5 = i8 == 0 ? null : str3;
                        Function0<Unit> function04 = i4 == 0 ? null : function02;
                        if (i5 != 0) {
                            str4 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-566659119, i6, -1, "com.robinhood.android.rhy.referral.welcome.ValuePropPage (WelcomeRhyComposable.kt:311)");
                        }
                        companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        bentoTheme = BentoTheme.INSTANCE;
                        i7 = BentoTheme.$stable;
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU(), null, 2, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor);
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Alignment center = companion3.getCenter();
                        Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), j2, null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor2);
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        String str7 = str4;
                        ImageKt.Image(painter, str7, TestTag3.testTag(companion, RhyWelcomeValuePropImage), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i6 >> 6) & 14) | 384 | ((i6 >> 15) & 112), 120);
                        composerStartRestartGroup.endNode();
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, 0L, 0.0f, composerStartRestartGroup, 0, 7);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Column5.weight$default(column6, companion, 1.0f, false, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor3);
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                        TextStyle bookCoverCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i7).getBookCoverCapsuleSmall();
                        companion2 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion2.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bookCoverCapsuleSmall, composerStartRestartGroup, i6 & 14, 0, 8126);
                        if (str5 != null || function04 == null) {
                            composerStartRestartGroup.startReplaceGroup(1828373089);
                            BentoText2.m20747BentoText38GnDrw(subtitle, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion2.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, (i6 >> 3) & 14, 0, 8124);
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1827898975);
                            int i9 = i6 >> 9;
                            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(subtitle, str5, function04, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU(), 0L, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), companion2.m7924getStarte0LSkKk(), composerStartRestartGroup, ((i6 >> 3) & 14) | (i9 & 112) | (i9 & 896), 32);
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup = composer2;
                        str3 = str5;
                        function03 = function04;
                        str6 = str7;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function03 = function02;
                        str6 = str4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return WelcomeRhyComposable.ValuePropPage_hYmLsZ8$lambda$17(title, subtitle, painter, j, str3, function03, str6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                str4 = str2;
                i6 = i3;
                if ((599187 & i6) == 599186) {
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    bentoTheme = BentoTheme.INSTANCE;
                    i7 = BentoTheme.$stable;
                    Modifier modifierM4872backgroundbw27NRU$default3 = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default2, bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU(), null, 2, null);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion32 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion32.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default3);
                    ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion42.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion42.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion42.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion42.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Alignment center2 = companion32.getCenter();
                        Modifier modifierM4872backgroundbw27NRU$default22 = Background3.m4872backgroundbw27NRU$default(Column5.weight$default(column62, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), j2, null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default22);
                        Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            String str72 = str4;
                            ImageKt.Image(painter, str72, TestTag3.testTag(companion, RhyWelcomeValuePropImage), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i6 >> 6) & 14) | 384 | ((i6 >> 15) & 112), 120);
                            composerStartRestartGroup.endNode();
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, 0L, 0.0f, composerStartRestartGroup, 0, 7);
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Column5.weight$default(column62, companion, 1.0f, false, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0);
                            MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion32.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                            Function0<ComposeUiNode> constructor32 = companion42.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion42.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion42.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion42.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting()) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion42.getSetModifier());
                                TextStyle bookCoverCapsuleSmall2 = bentoTheme.getTypography(composerStartRestartGroup, i7).getBookCoverCapsuleSmall();
                                companion2 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion2.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bookCoverCapsuleSmall2, composerStartRestartGroup, i6 & 14, 0, 8126);
                                if (str5 != null) {
                                    composerStartRestartGroup.startReplaceGroup(1828373089);
                                    BentoText2.m20747BentoText38GnDrw(subtitle, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion2.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, (i6 >> 3) & 14, 0, 8124);
                                    composer2 = composerStartRestartGroup;
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup = composer2;
                                    str3 = str5;
                                    function03 = function04;
                                    str6 = str72;
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            str4 = str2;
            i6 = i3;
            if ((599187 & i6) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str3 = str;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        str4 = str2;
        i6 = i3;
        if ((599187 & i6) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}

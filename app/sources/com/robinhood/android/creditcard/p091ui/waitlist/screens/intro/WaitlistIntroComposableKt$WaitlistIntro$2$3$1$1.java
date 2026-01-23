package com.robinhood.android.creditcard.p091ui.waitlist.screens.intro;

import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.source.MediaSource;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.google.common.collect.ImmutableMap;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.sections.Benefits;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.sections.Features4;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.sections.Footer2;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.sections.Footnotes;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.sections.Hero2;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.sections.RewardsKt;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.sections.TermsApply;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WaitlistIntroComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class WaitlistIntroComposableKt$WaitlistIntro$2$3$1$1 implements Function4<ScrollState, NestedScrollModifier, Composer, Integer, Unit> {
    final /* synthetic */ AccountSelectorTabArgs $accountSelectorTabArgs;
    final /* synthetic */ String $entryPointSource;
    final /* synthetic */ boolean $hasInvite;
    final /* synthetic */ SnapshotIntState2 $navBreakpoint$delegate;
    final /* synthetic */ List<Integer> $navBreakpoints;
    final /* synthetic */ Function0<Unit> $onClose;
    final /* synthetic */ Function0<Unit> $onTermsApply;
    final /* synthetic */ String $referrerFirstName;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ ImmutableMap<String, Tuples2<MediaSource, MediaItem>> $videos;

    WaitlistIntroComposableKt$WaitlistIntro$2$3$1$1(ScrollState scrollState, AccountSelectorTabArgs accountSelectorTabArgs, ImmutableMap<String, Tuples2<MediaSource, MediaItem>> immutableMap, List<Integer> list, SnapshotIntState2 snapshotIntState2, boolean z, String str, Function0<Unit> function0, Function0<Unit> function02, String str2) {
        this.$scrollState = scrollState;
        this.$accountSelectorTabArgs = accountSelectorTabArgs;
        this.$videos = immutableMap;
        this.$navBreakpoints = list;
        this.$navBreakpoint$delegate = snapshotIntState2;
        this.$hasInvite = z;
        this.$referrerFirstName = str;
        this.$onTermsApply = function0;
        this.$onClose = function02;
        this.$entryPointSource = str2;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(ScrollState scrollState, NestedScrollModifier nestedScrollModifier, Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(scrollState, nestedScrollModifier, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ScrollState unused$var$, NestedScrollModifier nestedScrollModifier, Composer composer, int i) throws Resources.NotFoundException {
        boolean z;
        String str;
        String strStringResource;
        Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-459745560, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntro.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WaitlistIntroComposable.kt:197)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), this.$scrollState, false, null, false, 14, null);
        AccountSelectorTabArgs accountSelectorTabArgs = this.$accountSelectorTabArgs;
        ImmutableMap<String, Tuples2<MediaSource, MediaItem>> immutableMap = this.$videos;
        final List<Integer> list = this.$navBreakpoints;
        final SnapshotIntState2 snapshotIntState2 = this.$navBreakpoint$delegate;
        boolean z2 = this.$hasInvite;
        String str2 = this.$referrerFirstName;
        final Function0<Unit> function0 = this.$onTermsApply;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
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
        composer.startReplaceGroup(-262539541);
        if (accountSelectorTabArgs != null) {
            z = false;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(accountSelectorTabArgs.getInitialSpacerHeight())), composer, 0);
        } else {
            z = false;
        }
        composer.endReplaceGroup();
        ComposableSingletons$WaitlistIntroComposableKt composableSingletons$WaitlistIntroComposableKt = ComposableSingletons$WaitlistIntroComposableKt.INSTANCE;
        BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableSingletons$WaitlistIntroComposableKt.getLambda$1382352779$feature_credit_card_externalDebug(), null, composableSingletons$WaitlistIntroComposableKt.m12887getLambda$818060321$feature_credit_card_externalDebug(), null, null, true, false, null, null, 0L, null, composer, 196998, 0, 2010);
        Modifier modifierM5158heightInVpY3zN4$default = SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(18), 0.0f, 2, null);
        AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_rh_gold_card_logo), null, null, null, 0, null, composer, 0, 62);
        ContentScale fit = ContentScale.INSTANCE.getFit();
        ColorFilter.Companion companion3 = ColorFilter.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, modifierM5158heightInVpY3zN4$default, (Alignment) null, fit, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(companion3, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0, 2, null), composer, 25008, 40);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
        Tuples2<MediaSource, MediaItem> tuples2 = immutableMap.get("card_reveal");
        Intrinsics.checkNotNull(tuples2);
        Tuples2<MediaSource, MediaItem> tuples22 = tuples2;
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(list) | composer.changed(snapshotIntState2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$WaitlistIntro$2$3$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WaitlistIntroComposableKt$WaitlistIntro$2$3$1$1.invoke$lambda$6$lambda$1$lambda$0(list, snapshotIntState2, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        if (z2) {
            composer.startReplaceGroup(452404338);
            str = str2;
            strStringResource = WaitlistIntroComposableKt.genAcceptInviteSubtitle(str, composer, 0);
            composer.endReplaceGroup();
        } else {
            str = str2;
            composer.startReplaceGroup(452523564);
            strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_subtitle, composer, 0);
            composer.endReplaceGroup();
        }
        composer.startReplaceGroup(-262491965);
        String strGenAcceptInviteDisclaimer = z2 ? WaitlistIntroComposableKt.genAcceptInviteDisclaimer(str, composer, 0) : null;
        composer.endReplaceGroup();
        Hero2.Hero(tuples22, function1, null, strStringResource, strGenAcceptInviteDisclaimer, composer, 0, 4);
        Hero2.HeroFooter(null, ComposableLambda3.rememberComposableLambda(-577293599, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$WaitlistIntro$2$3$1$1$1$2
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
                    ComposerKt.traceEventStart(-577293599, i3, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntro.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WaitlistIntroComposable.kt:233)");
                }
                TermsApply.m12906TermsApplygKt5lHk(function0, null, null, composer2, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 48, 1);
        WaitlistIntroComposableKt.Headline(composer, 0);
        RewardsKt.Rewards(null, composer, 0, 1);
        Benefits.Benefits(null, composer, 0, 1);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(list) | composer.changed(snapshotIntState2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$WaitlistIntro$2$3$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WaitlistIntroComposableKt$WaitlistIntro$2$3$1$1.invoke$lambda$6$lambda$3$lambda$2(list, snapshotIntState2, (LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BoxKt.Box(OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue2), composer, 0);
        Tuples2<MediaSource, MediaItem> tuples23 = immutableMap.get("virtual_cards");
        Intrinsics.checkNotNull(tuples23);
        Features4.VirtualCards(tuples23, null, composer, 0, 2);
        Tuples2<MediaSource, MediaItem> tuples24 = immutableMap.get("family");
        Intrinsics.checkNotNull(tuples24);
        Tuples2<MediaSource, MediaItem> tuples25 = immutableMap.get("keys");
        Intrinsics.checkNotNull(tuples25);
        Features4.Family(tuples24, tuples25, null, composer, 0, 4);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance3 = composer.changedInstance(list) | composer.changed(snapshotIntState2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$WaitlistIntro$2$3$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WaitlistIntroComposableKt$WaitlistIntro$2$3$1$1.invoke$lambda$6$lambda$5$lambda$4(list, snapshotIntState2, (LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        BoxKt.Box(OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue3), composer, 0);
        Footer2.Footer(null, ComposableLambda3.rememberComposableLambda(-1835857849, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$WaitlistIntro$2$3$1$1$1$5
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
                    ComposerKt.traceEventStart(-1835857849, i3, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntro.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WaitlistIntroComposable.kt:250)");
                }
                TermsApply.m12906TermsApplygKt5lHk(function0, null, null, composer2, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 48, 1);
        BoxKt.Box(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(100)), BentoColor.INSTANCE.m21142getCCGoldBGLight0d7_KjU(), null, 2, null), 0.0f, 1, null), composer, 0);
        Footnotes.Footnotes(null, composer, 0, 1);
        composer.endNode();
        long value = WaitlistIntroComposableKt.NAV_COLORS[this.$navBreakpoint$delegate.getIntValue() % 2].getValue();
        final Function0<Unit> function02 = this.$onClose;
        final String str3 = this.$entryPointSource;
        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, value, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1480995158, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt$WaitlistIntro$2$3$1$1.2
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
                    ComposerKt.traceEventStart(1480995158, i3, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntro.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WaitlistIntroComposable.kt:260)");
                }
                Function2<Composer, Integer, Unit> function2M12886getLambda$1185536381$feature_credit_card_externalDebug = ComposableSingletons$WaitlistIntroComposableKt.INSTANCE.m12886getLambda$1185536381$feature_credit_card_externalDebug();
                final Function0<Unit> function03 = function02;
                final String str4 = str3;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M12886getLambda$1185536381$feature_credit_card_externalDebug, null, ComposableLambda3.rememberComposableLambda(909017815, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntroComposableKt.WaitlistIntro.2.3.1.1.2.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i4) {
                        int i5;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i4 & 6) == 0) {
                            i5 = i4 | ((i4 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2);
                        } else {
                            i5 = i4;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(909017815, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.WaitlistIntro.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WaitlistIntroComposable.kt:264)");
                        }
                        if (function03 != null) {
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            Screen screen = new Screen(Screen.Name.CC_WAITLIST_INTRO, null, null, null, 14, null);
                            UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
                            Component component = new Component(Component.ComponentType.CLOSE_BUTTON, null, null, 6, null);
                            String str5 = str4;
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(ModifiersKt.autoLogEvents$default(companion4, new UserInteractionEventDescriptor(null, screen, action, str5 != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, str5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, component, null, 33, null), false, false, false, true, false, null, 110, null), WaitlistIntroComposableKt.WAITLIST_INTRO_CLOSE_BUTTON_TEST_TAG), false, 0L, function03, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 6);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, null, true, false, null, null, 0L, null, composer2, 196998, 0, 2010);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 805306368, 509);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$1$lambda$0(List list, SnapshotIntState2 snapshotIntState2, boolean z) {
        WaitlistIntroComposableKt.WaitlistIntro$setNavBreakpoint(list, snapshotIntState2, 0, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$3$lambda$2(List list, SnapshotIntState2 snapshotIntState2, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WaitlistIntroComposableKt.WaitlistIntro$setNavBreakpoint(list, snapshotIntState2, 1, Float.intBitsToFloat((int) (LayoutCoordinates2.positionInWindow(it) & 4294967295L)) <= 300.0f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4(List list, SnapshotIntState2 snapshotIntState2, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WaitlistIntroComposableKt.WaitlistIntro$setNavBreakpoint(list, snapshotIntState2, 2, Float.intBitsToFloat((int) (LayoutCoordinates2.positionInWindow(it) & 4294967295L)) <= 150.0f);
        return Unit.INSTANCE;
    }
}

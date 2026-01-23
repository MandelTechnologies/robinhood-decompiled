package com.robinhood.android.creditcard.p091ui.waitlist.screens;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
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
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.waitlist.UpgradeEligibility;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.WaitlistConfirmationComposable3;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.AspectRatioAwareExoPlayer;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WaitlistConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aa\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"WaitlistConfirmation", "", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "onClose", "Lkotlin/Function0;", "upgradeEligibility", "Lcom/robinhood/android/creditcard/ui/waitlist/UpgradeEligibility;", "video", "Lkotlin/Pair;", "Landroidx/media3/exoplayer/source/MediaSource;", "Landroidx/media3/common/MediaItem;", "onContinue", "accountSelectorTabArgs", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "(Lcom/robinhood/rosetta/eventlogging/Context;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/creditcard/ui/waitlist/UpgradeEligibility;Lkotlin/Pair;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;Landroidx/compose/runtime/Composer;II)V", "WAITLIST_CONFIRMATION_TITLE_TEST_TAG", "", "WAITLIST_CONFIRMATION_SUBTITLE_TEST_TAG", "WAITLIST_CONFIRMATION_CLOSE_CTA_TEST_TAG", "WAITLIST_CONFIRMATION_CTA_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class WaitlistConfirmationComposable3 {
    public static final String WAITLIST_CONFIRMATION_CLOSE_CTA_TEST_TAG = "waitlist-confirmation-close-cta-test-tag";
    public static final String WAITLIST_CONFIRMATION_CTA_TEST_TAG = "waitlist-confirmation-cta-test-tag";
    public static final String WAITLIST_CONFIRMATION_SUBTITLE_TEST_TAG = "waitlist-confirmation-subtitle-test-tag";
    public static final String WAITLIST_CONFIRMATION_TITLE_TEST_TAG = "waitlist-confirmation-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WaitlistConfirmation$lambda$0(Context context, Function0 function0, UpgradeEligibility upgradeEligibility, Tuples2 tuples2, Function0 function02, AccountSelectorTabArgs accountSelectorTabArgs, int i, int i2, Composer composer, int i3) {
        WaitlistConfirmation(context, function0, upgradeEligibility, tuples2, function02, accountSelectorTabArgs, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WaitlistConfirmation(final Context eventContext, final Function0<Unit> function0, final UpgradeEligibility upgradeEligibility, final Tuples2<? extends MediaSource, MediaItem> video, final Function0<Unit> onContinue, AccountSelectorTabArgs accountSelectorTabArgs, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        AccountSelectorTabArgs accountSelectorTabArgs2;
        Composer composer2;
        final AccountSelectorTabArgs accountSelectorTabArgs3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Intrinsics.checkNotNullParameter(upgradeEligibility, "upgradeEligibility");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2057015244);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventContext) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(upgradeEligibility.ordinal()) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(video) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onContinue) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    accountSelectorTabArgs2 = accountSelectorTabArgs;
                    i3 |= composerStartRestartGroup.changedInstance(accountSelectorTabArgs2) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    AccountSelectorTabArgs accountSelectorTabArgs4 = i4 == 0 ? null : accountSelectorTabArgs2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2057015244, i3, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmation (WaitlistConfirmationComposable.kt:63)");
                    }
                    final Function0<Unit> function03 = function02;
                    final AccountSelectorTabArgs accountSelectorTabArgs5 = accountSelectorTabArgs4;
                    composer2 = composerStartRestartGroup;
                    BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-2010874500, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt.WaitlistConfirmation.1
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
                                ComposerKt.traceEventStart(-2010874500, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmation.<anonymous> (WaitlistConfirmationComposable.kt:65)");
                            }
                            Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_CONFIRMATION, null, null, null, 14, null), null, eventContext, null, null, 53, null));
                            long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU();
                            final Context context = eventContext;
                            final Function0<Unit> function04 = onContinue;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions, null, ComposableLambda3.rememberComposableLambda(-919957865, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt.WaitlistConfirmation.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i6) {
                                    if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-919957865, i6, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmation.<anonymous>.<anonymous> (WaitlistConfirmationComposable.kt:74)");
                                    }
                                    long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU();
                                    final Context context2 = context;
                                    final Function0<Unit> function05 = function04;
                                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(jM21425getFg0d7_KjU, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1689029911, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt.WaitlistConfirmation.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i7) {
                                            if ((i7 & 3) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1689029911, i7, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmation.<anonymous>.<anonymous>.<anonymous> (WaitlistConfirmationComposable.kt:75)");
                                            }
                                            Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer5, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer5, 6, 0), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_CONFIRMATION, null, null, null, 14, null), UserInteractionEventData.Action.CONTINUE, context2, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 33, null), false, false, false, true, false, null, 110, null), WaitlistConfirmationComposable3.WAITLIST_CONFIRMATION_CTA_TEST_TAG);
                                            BentoButtonKt.m20586BentoButtonEikTQX8(function05, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer5, 0), modifierTestTag, null, null, false, false, null, null, null, null, false, null, composer5, 0, 0, 8184);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), composer4, 805306368, 510);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, 0, jM21371getBg0d7_KjU, 0L, null, ComposableLambda3.rememberComposableLambda(1367711117, true, new AnonymousClass2(video, function03, eventContext, accountSelectorTabArgs5, upgradeEligibility), composer3, 54), composer3, 805306752, 442);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: WaitlistConfirmationComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt$WaitlistConfirmation$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ AccountSelectorTabArgs $accountSelectorTabArgs;
                            final /* synthetic */ Context $eventContext;
                            final /* synthetic */ Function0<Unit> $onClose;
                            final /* synthetic */ UpgradeEligibility $upgradeEligibility;
                            final /* synthetic */ Tuples2<MediaSource, MediaItem> $video;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass2(Tuples2<? extends MediaSource, MediaItem> tuples2, Function0<Unit> function0, Context context, AccountSelectorTabArgs accountSelectorTabArgs, UpgradeEligibility upgradeEligibility) {
                                this.$video = tuples2;
                                this.$onClose = function0;
                                this.$eventContext = context;
                                this.$accountSelectorTabArgs = accountSelectorTabArgs;
                                this.$upgradeEligibility = upgradeEligibility;
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
                                    ComposerKt.traceEventStart(1367711117, i2, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmation.<anonymous>.<anonymous> (WaitlistConfirmationComposable.kt:95)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                Brush.Companion companion2 = Brush.INSTANCE;
                                Color colorM6701boximpl = Color.m6701boximpl(Color2.Color(4279045389L));
                                Color colorM6701boximpl2 = Color.m6701boximpl(Color2.Color(4279045389L));
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i3 = BentoTheme.$stable;
                                Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Background3.background$default(modifierFillMaxSize$default, Brush.Companion.m6682verticalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl, colorM6701boximpl2, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), paddingValues);
                                final Tuples2<MediaSource, MediaItem> tuples2 = this.$video;
                                final Function0<Unit> function0 = this.$onClose;
                                final Context context = this.$eventContext;
                                AccountSelectorTabArgs accountSelectorTabArgs = this.$accountSelectorTabArgs;
                                UpgradeEligibility upgradeEligibility = this.$upgradeEligibility;
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                                ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
                                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null)), 0.0f, C2002Dp.m7995constructorimpl(40), 0.0f, 0.0f, 13, null);
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(tuples2);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt$WaitlistConfirmation$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return WaitlistConfirmationComposable3.C127091.AnonymousClass2.invoke$lambda$6$lambda$4$lambda$1$lambda$0(tuples2, (ExoPlayer) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                AspectRatioAwareExoPlayer.AspectRatioAwareExoPlayer(1, modifierM5146paddingqDBjuR0$default, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (Function1) objRememberedValue, composer, 3462, 0);
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(WaitlistConfirmationComposable.INSTANCE.getLambda$472051206$feature_credit_card_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-2005779110, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt$WaitlistConfirmation$1$2$1$1$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                                        invoke(bentoAppBarScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i4) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i4 & 6) == 0) {
                                            i4 |= (i4 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i4 & 19) == 18 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2005779110, i4, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WaitlistConfirmationComposable.kt:133)");
                                        }
                                        if (function0 != null) {
                                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_CONFIRMATION, null, null, null, 14, null), UserInteractionEventData.Action.DISMISS, context, new Component(Component.ComponentType.CLOSE_BUTTON, null, null, 6, null), null, 33, null), false, false, false, true, false, null, 110, null), WaitlistConfirmationComposable3.WAITLIST_CONFIRMATION_CLOSE_CTA_TEST_TAG), false, 0L, function0, composer2, (BentoAppBarScope.$stable << 12) | ((i4 << 12) & 57344), 6);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), null, null, true, false, null, null, 0L, null, composer, 196998, 0, 2010);
                                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion3.getBottomCenter()), 0.0f, 1, null), C2002Dp.m7995constructorimpl(120));
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt$WaitlistConfirmation$1$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return WaitlistConfirmationComposable3.C127091.AnonymousClass2.invoke$lambda$6$lambda$4$lambda$3$lambda$2((DrawScope) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                BoxKt.Box(DrawModifierKt.drawBehind(modifierM5156height3ABfNKs, (Function1) objRememberedValue2), composer, 0);
                                composer.endNode();
                                Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(boxScopeInstance.align(companion, companion3.getBottomCenter()), 0.0f, composer, 0, 1), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 7, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getCenterHorizontally(), composer, 48);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default2);
                                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                if (composer.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor3);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composer.startReplaceGroup(315941806);
                                if (accountSelectorTabArgs != null) {
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(accountSelectorTabArgs.getInitialSpacerHeight())), composer, 0);
                                }
                                composer.endReplaceGroup();
                                Modifier modifierTestTag = TestTag3.testTag(companion, WaitlistConfirmationComposable3.WAITLIST_CONFIRMATION_TITLE_TEST_TAG);
                                String strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_confirmation_title, composer, 0);
                                int i4 = C12201R.font.itc_garamond_std_book_condensed;
                                FontWeight.Companion companion5 = FontWeight.INSTANCE;
                                TextStyle textStyle = new TextStyle(0L, TextUnit2.getSp(44), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i4, companion5.getNormal(), 0, 0, 12, null)), (String) null, TextUnit2.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(35.2d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
                                TextAlign.Companion companion6 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle, composer, 48, 0, 8124);
                                Modifier modifierTestTag2 = TestTag3.testTag(companion, WaitlistConfirmationComposable3.WAITLIST_CONFIRMATION_SUBTITLE_TEST_TAG);
                                composer.startReplaceGroup(315981290);
                                String strStringResource2 = (upgradeEligibility == UpgradeEligibility.ELIGIBLE || upgradeEligibility == UpgradeEligibility.INELIGIBLE) ? StringResources_androidKt.stringResource(C12201R.string.waitlist_confirmation_gold_upgrade_subtitle, composer, 0) : "";
                                composer.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierTestTag2, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextL(), composer, 48, 0, 8124);
                                composer.endNode();
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$4$lambda$1$lambda$0(Tuples2 tuples2, ExoPlayer AspectRatioAwareExoPlayer) {
                                Intrinsics.checkNotNullParameter(AspectRatioAwareExoPlayer, "$this$AspectRatioAwareExoPlayer");
                                MediaSource mediaSource = (MediaSource) tuples2.getFirst();
                                if (mediaSource != null) {
                                    AspectRatioAwareExoPlayer.setMediaSource(mediaSource);
                                } else {
                                    AspectRatioAwareExoPlayer.setMediaItem((MediaItem) tuples2.getSecond());
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$4$lambda$3$lambda$2(DrawScope drawBehind) {
                                Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                                Brush.Companion companion = Brush.INSTANCE;
                                Float fValueOf = Float.valueOf(0.0f);
                                BentoColor bentoColor = BentoColor.INSTANCE;
                                DrawScope.m6957drawRectAsUm42w$default(drawBehind, Brush.Companion.m6683verticalGradient8A3gB4$default(companion, new Tuples2[]{new Tuples2(fValueOf, Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoColor.m21139getCCGoldBG0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), new Tuples2(Float.valueOf(1.0f), Color.m6701boximpl(bentoColor.m21139getCCGoldBG0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 100663686, 250);
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
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return WaitlistConfirmationComposable3.WaitlistConfirmation$lambda$0(eventContext, function0, upgradeEligibility, video, onContinue, accountSelectorTabArgs3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            accountSelectorTabArgs2 = accountSelectorTabArgs;
            if ((74899 & i3) != 74898) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final Function0<Unit> function032 = function02;
                final AccountSelectorTabArgs accountSelectorTabArgs52 = accountSelectorTabArgs4;
                composer2 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-2010874500, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt.WaitlistConfirmation.1
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
                            ComposerKt.traceEventStart(-2010874500, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmation.<anonymous> (WaitlistConfirmationComposable.kt:65)");
                        }
                        Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_CONFIRMATION, null, null, null, 14, null), null, eventContext, null, null, 53, null));
                        long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU();
                        final Context context = eventContext;
                        final Function0<Unit> function04 = onContinue;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions, null, ComposableLambda3.rememberComposableLambda(-919957865, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt.WaitlistConfirmation.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i6) {
                                if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-919957865, i6, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmation.<anonymous>.<anonymous> (WaitlistConfirmationComposable.kt:74)");
                                }
                                long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU();
                                final Context context2 = context;
                                final Function0<Unit> function05 = function04;
                                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(jM21425getFg0d7_KjU, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1689029911, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt.WaitlistConfirmation.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i7) {
                                        if ((i7 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1689029911, i7, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmation.<anonymous>.<anonymous>.<anonymous> (WaitlistConfirmationComposable.kt:75)");
                                        }
                                        Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer5, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer5, 6, 0), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_CONFIRMATION, null, null, null, 14, null), UserInteractionEventData.Action.CONTINUE, context2, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 33, null), false, false, false, true, false, null, 110, null), WaitlistConfirmationComposable3.WAITLIST_CONFIRMATION_CTA_TEST_TAG);
                                        BentoButtonKt.m20586BentoButtonEikTQX8(function05, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer5, 0), modifierTestTag, null, null, false, false, null, null, null, null, false, null, composer5, 0, 0, 8184);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, 805306368, 510);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, 0, jM21371getBg0d7_KjU, 0L, null, ComposableLambda3.rememberComposableLambda(1367711117, true, new AnonymousClass2(video, function032, eventContext, accountSelectorTabArgs52, upgradeEligibility), composer3, 54), composer3, 805306752, 442);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: WaitlistConfirmationComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt$WaitlistConfirmation$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ AccountSelectorTabArgs $accountSelectorTabArgs;
                        final /* synthetic */ Context $eventContext;
                        final /* synthetic */ Function0<Unit> $onClose;
                        final /* synthetic */ UpgradeEligibility $upgradeEligibility;
                        final /* synthetic */ Tuples2<MediaSource, MediaItem> $video;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass2(Tuples2<? extends MediaSource, MediaItem> tuples2, Function0<Unit> function0, Context context, AccountSelectorTabArgs accountSelectorTabArgs, UpgradeEligibility upgradeEligibility) {
                            this.$video = tuples2;
                            this.$onClose = function0;
                            this.$eventContext = context;
                            this.$accountSelectorTabArgs = accountSelectorTabArgs;
                            this.$upgradeEligibility = upgradeEligibility;
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
                                ComposerKt.traceEventStart(1367711117, i2, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmation.<anonymous>.<anonymous> (WaitlistConfirmationComposable.kt:95)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                            Brush.Companion companion2 = Brush.INSTANCE;
                            Color colorM6701boximpl = Color.m6701boximpl(Color2.Color(4279045389L));
                            Color colorM6701boximpl2 = Color.m6701boximpl(Color2.Color(4279045389L));
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Background3.background$default(modifierFillMaxSize$default, Brush.Companion.m6682verticalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl, colorM6701boximpl2, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), paddingValues);
                            final Tuples2 tuples2 = this.$video;
                            final Function0<Unit> function0 = this.$onClose;
                            final Context context = this.$eventContext;
                            AccountSelectorTabArgs accountSelectorTabArgs = this.$accountSelectorTabArgs;
                            UpgradeEligibility upgradeEligibility = this.$upgradeEligibility;
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                            EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                            ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null)), 0.0f, C2002Dp.m7995constructorimpl(40), 0.0f, 0.0f, 13, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(tuples2);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt$WaitlistConfirmation$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return WaitlistConfirmationComposable3.C127091.AnonymousClass2.invoke$lambda$6$lambda$4$lambda$1$lambda$0(tuples2, (ExoPlayer) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            AspectRatioAwareExoPlayer.AspectRatioAwareExoPlayer(1, modifierM5146paddingqDBjuR0$default, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (Function1) objRememberedValue, composer, 3462, 0);
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(WaitlistConfirmationComposable.INSTANCE.getLambda$472051206$feature_credit_card_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-2005779110, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt$WaitlistConfirmation$1$2$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                                    invoke(bentoAppBarScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i4) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i4 & 6) == 0) {
                                        i4 |= (i4 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i4 & 19) == 18 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2005779110, i4, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WaitlistConfirmationComposable.kt:133)");
                                    }
                                    if (function0 != null) {
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_CONFIRMATION, null, null, null, 14, null), UserInteractionEventData.Action.DISMISS, context, new Component(Component.ComponentType.CLOSE_BUTTON, null, null, 6, null), null, 33, null), false, false, false, true, false, null, 110, null), WaitlistConfirmationComposable3.WAITLIST_CONFIRMATION_CLOSE_CTA_TEST_TAG), false, 0L, function0, composer2, (BentoAppBarScope.$stable << 12) | ((i4 << 12) & 57344), 6);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), null, null, true, false, null, null, 0L, null, composer, 196998, 0, 2010);
                            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion3.getBottomCenter()), 0.0f, 1, null), C2002Dp.m7995constructorimpl(120));
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistConfirmationComposableKt$WaitlistConfirmation$1$2$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return WaitlistConfirmationComposable3.C127091.AnonymousClass2.invoke$lambda$6$lambda$4$lambda$3$lambda$2((DrawScope) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BoxKt.Box(DrawModifierKt.drawBehind(modifierM5156height3ABfNKs, (Function1) objRememberedValue2), composer, 0);
                            composer.endNode();
                            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(boxScopeInstance.align(companion, companion3.getBottomCenter()), 0.0f, composer, 0, 1), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 7, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getCenterHorizontally(), composer, 48);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default2);
                            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor3);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composer.startReplaceGroup(315941806);
                            if (accountSelectorTabArgs != null) {
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(accountSelectorTabArgs.getInitialSpacerHeight())), composer, 0);
                            }
                            composer.endReplaceGroup();
                            Modifier modifierTestTag = TestTag3.testTag(companion, WaitlistConfirmationComposable3.WAITLIST_CONFIRMATION_TITLE_TEST_TAG);
                            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_confirmation_title, composer, 0);
                            int i4 = C12201R.font.itc_garamond_std_book_condensed;
                            FontWeight.Companion companion5 = FontWeight.INSTANCE;
                            TextStyle textStyle = new TextStyle(0L, TextUnit2.getSp(44), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i4, companion5.getNormal(), 0, 0, 12, null)), (String) null, TextUnit2.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(35.2d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
                            TextAlign.Companion companion6 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle, composer, 48, 0, 8124);
                            Modifier modifierTestTag2 = TestTag3.testTag(companion, WaitlistConfirmationComposable3.WAITLIST_CONFIRMATION_SUBTITLE_TEST_TAG);
                            composer.startReplaceGroup(315981290);
                            String strStringResource2 = (upgradeEligibility == UpgradeEligibility.ELIGIBLE || upgradeEligibility == UpgradeEligibility.INELIGIBLE) ? StringResources_androidKt.stringResource(C12201R.string.waitlist_confirmation_gold_upgrade_subtitle, composer, 0) : "";
                            composer.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierTestTag2, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextL(), composer, 48, 0, 8124);
                            composer.endNode();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$4$lambda$1$lambda$0(Tuples2 tuples2, ExoPlayer AspectRatioAwareExoPlayer) {
                            Intrinsics.checkNotNullParameter(AspectRatioAwareExoPlayer, "$this$AspectRatioAwareExoPlayer");
                            MediaSource mediaSource = (MediaSource) tuples2.getFirst();
                            if (mediaSource != null) {
                                AspectRatioAwareExoPlayer.setMediaSource(mediaSource);
                            } else {
                                AspectRatioAwareExoPlayer.setMediaItem((MediaItem) tuples2.getSecond());
                            }
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$4$lambda$3$lambda$2(DrawScope drawBehind) {
                            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                            Brush.Companion companion = Brush.INSTANCE;
                            Float fValueOf = Float.valueOf(0.0f);
                            BentoColor bentoColor = BentoColor.INSTANCE;
                            DrawScope.m6957drawRectAsUm42w$default(drawBehind, Brush.Companion.m6683verticalGradient8A3gB4$default(companion, new Tuples2[]{new Tuples2(fValueOf, Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoColor.m21139getCCGoldBG0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), new Tuples2(Float.valueOf(1.0f), Color.m6701boximpl(bentoColor.m21139getCCGoldBG0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 100663686, 250);
                if (ComposerKt.isTraceInProgress()) {
                }
                accountSelectorTabArgs3 = accountSelectorTabArgs52;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        accountSelectorTabArgs2 = accountSelectorTabArgs;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}

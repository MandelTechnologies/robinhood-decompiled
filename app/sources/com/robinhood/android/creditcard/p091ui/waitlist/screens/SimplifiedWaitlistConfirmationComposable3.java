package com.robinhood.android.creditcard.p091ui.waitlist.screens;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
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
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
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
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.SimplifiedWaitlistConfirmationComposable3;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
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

/* compiled from: SimplifiedWaitlistConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aK\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0002\u0010\r\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"SimplifiedWaitlistConfirmation", "", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "onClose", "Lkotlin/Function0;", "video", "Lkotlin/Pair;", "Landroidx/media3/exoplayer/source/MediaSource;", "Landroidx/media3/common/MediaItem;", "accountSelectorTabArgs", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "(Lcom/robinhood/rosetta/eventlogging/Context;Lkotlin/jvm/functions/Function0;Lkotlin/Pair;Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;Landroidx/compose/runtime/Composer;II)V", "SIMPLIFIED_WAITLIST_CONFIRMATION_TITLE_TEST_TAG", "", "SIMPLIFIED_WAITLIST_CONFIRMATION_SUBTITLE_TEST_TAG", "SIMPLIFIED_WAITLIST_CONFIRMATION_CTA_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class SimplifiedWaitlistConfirmationComposable3 {
    public static final String SIMPLIFIED_WAITLIST_CONFIRMATION_CTA_TEST_TAG = "simplified-waitlist-confirmation-cta-test-tag";
    public static final String SIMPLIFIED_WAITLIST_CONFIRMATION_SUBTITLE_TEST_TAG = "simplified-waitlist-confirmation-subtitle-test-tag";
    public static final String SIMPLIFIED_WAITLIST_CONFIRMATION_TITLE_TEST_TAG = "simplified-waitlist-confirmation-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimplifiedWaitlistConfirmation$lambda$0(Context context, Function0 function0, Tuples2 tuples2, AccountSelectorTabArgs accountSelectorTabArgs, int i, int i2, Composer composer, int i3) {
        SimplifiedWaitlistConfirmation(context, function0, tuples2, accountSelectorTabArgs, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SimplifiedWaitlistConfirmation(final Context eventContext, final Function0<Unit> function0, final Tuples2<? extends MediaSource, MediaItem> video, AccountSelectorTabArgs accountSelectorTabArgs, Composer composer, final int i, final int i2) {
        int i3;
        AccountSelectorTabArgs accountSelectorTabArgs2;
        final AccountSelectorTabArgs accountSelectorTabArgs3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Intrinsics.checkNotNullParameter(video, "video");
        Composer composerStartRestartGroup = composer.startRestartGroup(2113644803);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventContext) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(video) ? 256 : 128;
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
                    ComposerKt.traceEventStart(2113644803, i3, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmation (SimplifiedWaitlistConfirmationComposable.kt:67)");
                }
                AccountSelectorTabArgs accountSelectorTabArgs5 = accountSelectorTabArgs4;
                BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1050806971, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt.SimplifiedWaitlistConfirmation.1
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
                            ComposerKt.traceEventStart(1050806971, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmation.<anonymous> (SimplifiedWaitlistConfirmationComposable.kt:69)");
                        }
                        ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_CONFIRMATION, null, null, null, 14, null), null, eventContext, null, null, 53, null)), null, null, null, null, 0, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(201745290, true, new AnonymousClass1(accountSelectorTabArgs4, function0, video, eventContext), composer2, 54), composer2, 805306368, 446);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: SimplifiedWaitlistConfirmationComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ AccountSelectorTabArgs $accountSelectorTabArgs;
                        final /* synthetic */ Context $eventContext;
                        final /* synthetic */ Function0<Unit> $onClose;
                        final /* synthetic */ Tuples2<MediaSource, MediaItem> $video;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(AccountSelectorTabArgs accountSelectorTabArgs, Function0<Unit> function0, Tuples2<? extends MediaSource, MediaItem> tuples2, Context context) {
                            this.$accountSelectorTabArgs = accountSelectorTabArgs;
                            this.$onClose = function0;
                            this.$video = tuples2;
                            this.$eventContext = context;
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
                                ComposerKt.traceEventStart(201745290, i2, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmation.<anonymous>.<anonymous> (SimplifiedWaitlistConfirmationComposable.kt:78)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                            Brush.Companion companion2 = Brush.INSTANCE;
                            Color colorM6701boximpl = Color.m6701boximpl(Color2.Color(4279045389L));
                            Color colorM6701boximpl2 = Color.m6701boximpl(Color2.Color(4279045389L));
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            Modifier modifierPadding = PaddingKt.padding(Background3.background$default(modifierFillMaxSize$default, Brush.Companion.m6682verticalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl, colorM6701boximpl2, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), paddingValues);
                            AccountSelectorTabArgs accountSelectorTabArgs = this.$accountSelectorTabArgs;
                            final Function0<Unit> function0 = this.$onClose;
                            final Tuples2<MediaSource, MediaItem> tuples2 = this.$video;
                            final Context context = this.$eventContext;
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
                            composer.startReplaceGroup(-1214087391);
                            if (accountSelectorTabArgs != null) {
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(accountSelectorTabArgs.getInitialSpacerHeight())), composer, 0);
                            }
                            composer.endReplaceGroup();
                            Modifier modifierAlign = boxScopeInstance.align(companion, companion3.getBottomCenter());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierAlign);
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
                            EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.spring$default(0.2f, 50.0f, null, 4, null), 0.0f, 2, null);
                            ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.spring$default(0.2f, 50.0f, null, 4, null), 0.0f, 2, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(tuples2);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return SimplifiedWaitlistConfirmationComposable3.C127041.AnonymousClass1.invoke$lambda$6$lambda$4$lambda$1$lambda$0(tuples2, (ExoPlayer) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            AspectRatioAwareExoPlayer.AspectRatioAwareExoPlayer(1, null, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (Function1) objRememberedValue, composer, 3462, 2);
                            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion3.getBottomCenter()), 0.0f, 1, null), C2002Dp.m7995constructorimpl(120));
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return SimplifiedWaitlistConfirmationComposable3.C127041.AnonymousClass1.invoke$lambda$6$lambda$4$lambda$3$lambda$2((DrawScope) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BoxKt.Box(DrawModifierKt.drawBehind(modifierM5156height3ABfNKs, (Function1) objRememberedValue2), composer, 0);
                            composer.endNode();
                            Modifier modifierAlign2 = boxScopeInstance.align(companion, companion3.getTopCenter());
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getCenterHorizontally(), composer, 48);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierAlign2);
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
                            float f = 0;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(SimplifiedWaitlistConfirmationComposable.INSTANCE.getLambda$1321077313$feature_credit_card_externalDebug(), null, ComposableLambda3.rememberComposableLambda(568138605, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$1$2$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                                    invoke(bentoAppBarScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i4) {
                                    int i5;
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i4 & 6) == 0) {
                                        i5 = i4 | ((i4 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2);
                                    } else {
                                        i5 = i4;
                                    }
                                    if ((i5 & 19) == 18 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(568138605, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SimplifiedWaitlistConfirmationComposable.kt:151)");
                                    }
                                    if (function0 != null) {
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_CONFIRMATION, null, null, null, 14, null), UserInteractionEventData.Action.DISMISS, context, new Component(Component.ComponentType.CLOSE_BUTTON, null, null, 6, null), null, 33, null), false, false, false, true, false, null, 110, null), false, 0L, function0, composer2, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 6);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), null, null, true, false, null, null, 0L, WindowInsetsKt.m5184WindowInsetsa9UjIt4(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f)), composer, 196998, 0, 986);
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_rh_gold_card_logo_alternative), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), 0.0f, C2002Dp.m7995constructorimpl(40), 0.0f, 0.0f, 13, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE)), C2002Dp.m7995constructorimpl(21)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), 0, 2, null), composer, 24624, 40);
                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), SimplifiedWaitlistConfirmationComposable3.SIMPLIFIED_WAITLIST_CONFIRMATION_TITLE_TEST_TAG);
                            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_confirmation_title, composer, 0);
                            int i4 = C12201R.font.itc_garamond_std_book_condensed;
                            FontWeight.Companion companion5 = FontWeight.INSTANCE;
                            TextStyle textStyle = new TextStyle(0L, TextUnit2.getSp(44), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i4, companion5.getNormal(), 0, 0, 12, null)), (String) null, TextUnit2.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(35.2d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
                            TextAlign.Companion companion6 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle, composer, 0, 0, 8124);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_confirmation_subtitle, composer, 0), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), SimplifiedWaitlistConfirmationComposable3.SIMPLIFIED_WAITLIST_CONFIRMATION_SUBTITLE_TEST_TAG), null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextL(), composer, 0, 0, 8124);
                            composer.endNode();
                            AnimatedVisibilityKt.AnimatedVisibility(function0 != null, boxScopeInstance.align(companion, companion3.getBottomCenter()), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(776375660, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$1$3

                                /* compiled from: SimplifiedWaitlistConfirmationComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$1$3$1, reason: invalid class name */
                                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ Context $eventContext;
                                    final /* synthetic */ Function0<Unit> $onClose;

                                    AnonymousClass1(Context context, Function0<Unit> function0) {
                                        this.$eventContext = context;
                                        this.$onClose = function0;
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
                                            ComposerKt.traceEventStart(1430339134, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SimplifiedWaitlistConfirmationComposable.kt:215)");
                                        }
                                        Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer, 6, 0), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_CONFIRMATION, null, null, null, 14, null), UserInteractionEventData.Action.CONTINUE, this.$eventContext, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 33, null), false, false, false, true, false, null, 110, null), SimplifiedWaitlistConfirmationComposable3.SIMPLIFIED_WAITLIST_CONFIRMATION_CTA_TEST_TAG);
                                        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged = composer.changed(this.$onClose);
                                        final Function0<Unit> function0 = this.$onClose;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ac: CONSTRUCTOR (r5v3 'objRememberedValue' java.lang.Object) = (r4v2 'function0' kotlin.jvm.functions.Function0<kotlin.Unit> A[DONT_INLINE]) A[MD:(kotlin.jvm.functions.Function0):void (m)] (LINE:230) call: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$1$3$1$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function0):void type: CONSTRUCTOR in method: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$1$3.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes2.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$1$3$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 25 more
                                                */
                                            /*
                                                Method dump skipped, instructions count: 212
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.creditcard.p091ui.waitlist.screens.SimplifiedWaitlistConfirmationComposable5.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                            if (function0 != null) {
                                                function0.invoke();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                        invoke(animatedVisibilityScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(776375660, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SimplifiedWaitlistConfirmationComposable.kt:214)");
                                        }
                                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1430339134, true, new AnonymousClass1(context, function0), composer2, 54), composer2, 805306368, 510);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), composer, 196608, 28);
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
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663686, 250);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    accountSelectorTabArgs3 = accountSelectorTabArgs5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    accountSelectorTabArgs3 = accountSelectorTabArgs2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SimplifiedWaitlistConfirmationComposable3.SimplifiedWaitlistConfirmation$lambda$0(eventContext, function0, video, accountSelectorTabArgs3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                AccountSelectorTabArgs accountSelectorTabArgs52 = accountSelectorTabArgs4;
                BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1050806971, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt.SimplifiedWaitlistConfirmation.1
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
                            ComposerKt.traceEventStart(1050806971, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmation.<anonymous> (SimplifiedWaitlistConfirmationComposable.kt:69)");
                        }
                        ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_CONFIRMATION, null, null, null, 14, null), null, eventContext, null, null, 53, null)), null, null, null, null, 0, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(201745290, true, new AnonymousClass1(accountSelectorTabArgs4, function0, video, eventContext), composer2, 54), composer2, 805306368, 446);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: SimplifiedWaitlistConfirmationComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ AccountSelectorTabArgs $accountSelectorTabArgs;
                        final /* synthetic */ Context $eventContext;
                        final /* synthetic */ Function0<Unit> $onClose;
                        final /* synthetic */ Tuples2<MediaSource, MediaItem> $video;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(AccountSelectorTabArgs accountSelectorTabArgs, Function0<Unit> function0, Tuples2<? extends MediaSource, MediaItem> tuples2, Context context) {
                            this.$accountSelectorTabArgs = accountSelectorTabArgs;
                            this.$onClose = function0;
                            this.$video = tuples2;
                            this.$eventContext = context;
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
                                ComposerKt.traceEventStart(201745290, i2, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmation.<anonymous>.<anonymous> (SimplifiedWaitlistConfirmationComposable.kt:78)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                            Brush.Companion companion2 = Brush.INSTANCE;
                            Color colorM6701boximpl = Color.m6701boximpl(Color2.Color(4279045389L));
                            Color colorM6701boximpl2 = Color.m6701boximpl(Color2.Color(4279045389L));
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            Modifier modifierPadding = PaddingKt.padding(Background3.background$default(modifierFillMaxSize$default, Brush.Companion.m6682verticalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl, colorM6701boximpl2, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), paddingValues);
                            AccountSelectorTabArgs accountSelectorTabArgs = this.$accountSelectorTabArgs;
                            final Function0<Unit> function0 = this.$onClose;
                            final Tuples2 tuples2 = this.$video;
                            final Context context = this.$eventContext;
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
                            composer.startReplaceGroup(-1214087391);
                            if (accountSelectorTabArgs != null) {
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(accountSelectorTabArgs.getInitialSpacerHeight())), composer, 0);
                            }
                            composer.endReplaceGroup();
                            Modifier modifierAlign = boxScopeInstance.align(companion, companion3.getBottomCenter());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierAlign);
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
                            EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.spring$default(0.2f, 50.0f, null, 4, null), 0.0f, 2, null);
                            ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.spring$default(0.2f, 50.0f, null, 4, null), 0.0f, 2, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(tuples2);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return SimplifiedWaitlistConfirmationComposable3.C127041.AnonymousClass1.invoke$lambda$6$lambda$4$lambda$1$lambda$0(tuples2, (ExoPlayer) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            AspectRatioAwareExoPlayer.AspectRatioAwareExoPlayer(1, null, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (Function1) objRememberedValue, composer, 3462, 2);
                            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion3.getBottomCenter()), 0.0f, 1, null), C2002Dp.m7995constructorimpl(120));
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return SimplifiedWaitlistConfirmationComposable3.C127041.AnonymousClass1.invoke$lambda$6$lambda$4$lambda$3$lambda$2((DrawScope) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BoxKt.Box(DrawModifierKt.drawBehind(modifierM5156height3ABfNKs, (Function1) objRememberedValue2), composer, 0);
                            composer.endNode();
                            Modifier modifierAlign2 = boxScopeInstance.align(companion, companion3.getTopCenter());
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getCenterHorizontally(), composer, 48);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierAlign2);
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
                            float f = 0;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(SimplifiedWaitlistConfirmationComposable.INSTANCE.getLambda$1321077313$feature_credit_card_externalDebug(), null, ComposableLambda3.rememberComposableLambda(568138605, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$1$2$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                                    invoke(bentoAppBarScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i4) {
                                    int i5;
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i4 & 6) == 0) {
                                        i5 = i4 | ((i4 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2);
                                    } else {
                                        i5 = i4;
                                    }
                                    if ((i5 & 19) == 18 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(568138605, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SimplifiedWaitlistConfirmationComposable.kt:151)");
                                    }
                                    if (function0 != null) {
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_CONFIRMATION, null, null, null, 14, null), UserInteractionEventData.Action.DISMISS, context, new Component(Component.ComponentType.CLOSE_BUTTON, null, null, 6, null), null, 33, null), false, false, false, true, false, null, 110, null), false, 0L, function0, composer2, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 6);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), null, null, true, false, null, null, 0L, WindowInsetsKt.m5184WindowInsetsa9UjIt4(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f)), composer, 196998, 0, 986);
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_rh_gold_card_logo_alternative), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), 0.0f, C2002Dp.m7995constructorimpl(40), 0.0f, 0.0f, 13, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE)), C2002Dp.m7995constructorimpl(21)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), 0, 2, null), composer, 24624, 40);
                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), SimplifiedWaitlistConfirmationComposable3.SIMPLIFIED_WAITLIST_CONFIRMATION_TITLE_TEST_TAG);
                            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_confirmation_title, composer, 0);
                            int i4 = C12201R.font.itc_garamond_std_book_condensed;
                            FontWeight.Companion companion5 = FontWeight.INSTANCE;
                            TextStyle textStyle = new TextStyle(0L, TextUnit2.getSp(44), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i4, companion5.getNormal(), 0, 0, 12, null)), (String) null, TextUnit2.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(35.2d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
                            TextAlign.Companion companion6 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle, composer, 0, 0, 8124);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_confirmation_subtitle, composer, 0), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), SimplifiedWaitlistConfirmationComposable3.SIMPLIFIED_WAITLIST_CONFIRMATION_SUBTITLE_TEST_TAG), null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextL(), composer, 0, 0, 8124);
                            composer.endNode();
                            AnimatedVisibilityKt.AnimatedVisibility(function0 != null, boxScopeInstance.align(companion, companion3.getBottomCenter()), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(776375660, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$1$3

                                /* compiled from: SimplifiedWaitlistConfirmationComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$1$3$1, reason: invalid class name */
                                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ Context $eventContext;
                                    final /* synthetic */ Function0<Unit> $onClose;

                                    AnonymousClass1(Context context, Function0<Unit> function0) {
                                        this.$eventContext = context;
                                        this.$onClose = function0;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ac: CONSTRUCTOR (r5v3 'objRememberedValue' java.lang.Object) = (r4v2 'function0' kotlin.jvm.functions.Function0<kotlin.Unit> A[DONT_INLINE]) A[MD:(kotlin.jvm.functions.Function0):void (m)] (LINE:230) call: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$1$3$1$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function0):void type: CONSTRUCTOR in method: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$1$3.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes2.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmationComposableKt$SimplifiedWaitlistConfirmation$1$1$1$3$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 20 more
                                        */
                                    public final void invoke(androidx.compose.runtime.Composer r26, int r27) {
                                        /*
                                            Method dump skipped, instructions count: 212
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.creditcard.p091ui.waitlist.screens.SimplifiedWaitlistConfirmationComposable5.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                        if (function0 != null) {
                                            function0.invoke();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                    invoke(animatedVisibilityScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(776375660, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.SimplifiedWaitlistConfirmation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SimplifiedWaitlistConfirmationComposable.kt:214)");
                                    }
                                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1430339134, true, new AnonymousClass1(context, function0), composer2, 54), composer2, 805306368, 510);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, 196608, 28);
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
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663686, 250);
                if (ComposerKt.isTraceInProgress()) {
                }
                accountSelectorTabArgs3 = accountSelectorTabArgs52;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
    }

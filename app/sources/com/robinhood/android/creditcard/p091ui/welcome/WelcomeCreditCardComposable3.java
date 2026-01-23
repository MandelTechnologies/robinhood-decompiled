package com.robinhood.android.creditcard.p091ui.welcome;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.FabPosition;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.view.ComponentActivity;
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.welcome.WelcomeCreditCardComposable3;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.AnimationExoPlayer2;
import com.robinhood.compose.common.AnimationExoPlayerConfig;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost;
import com.robinhood.utils.p409ui.edge2edge.LocalEdgeToEdgeHost;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WelcomeCreditCardComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"WelcomeCreditCard", "", "onSignupClick", "Lkotlin/Function0;", "onLoginClick", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "VIDEO_FILE", "", "WELCOME_CREDIT_CARD_SIGN_UP_CTA_TEST_TAG", "WELCOME_CREDIT_CARD_LOGIN_CTA_TEST_TAG", "WELCOME_CREDIT_CARD_TITLE_TEST_TAG", "WELCOME_CREDIT_CARD_SUBTITLE_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class WelcomeCreditCardComposable3 {
    private static final String VIDEO_FILE = "asset:///gold_card_mystery.mov";
    public static final String WELCOME_CREDIT_CARD_LOGIN_CTA_TEST_TAG = "welcome-credit-card-login-cta-test-tag";
    public static final String WELCOME_CREDIT_CARD_SIGN_UP_CTA_TEST_TAG = "welcome-credit-card-sign-up-cta-test-tag";
    public static final String WELCOME_CREDIT_CARD_SUBTITLE_TEST_TAG = "welcome-credit-card-subtitle-test-tag";
    public static final String WELCOME_CREDIT_CARD_TITLE_TEST_TAG = "welcome-credit-card-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WelcomeCreditCard$lambda$3(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        WelcomeCreditCard(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void WelcomeCreditCard(final Function0<Unit> onSignupClick, final Function0<Unit> onLoginClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onSignupClick, "onSignupClick");
        Intrinsics.checkNotNullParameter(onLoginClick, "onLoginClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1845127870);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onSignupClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onLoginClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1845127870, i2, -1, "com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCard (WelcomeCreditCardComposable.kt:60)");
            }
            final EdgeToEdgeHost edgeToEdgeHost = (EdgeToEdgeHost) composerStartRestartGroup.consume(LocalEdgeToEdgeHost.getLocalEdgeToEdgeHost());
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(edgeToEdgeHost);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WelcomeCreditCardComposable3.WelcomeCreditCard$lambda$2$lambda$1(edgeToEdgeHost, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
            final ComponentActivity componentActivity = objConsume instanceof ComponentActivity ? (ComponentActivity) objConsume : null;
            final long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            composer2 = composerStartRestartGroup;
            BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1119768070, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardComposableKt.WelcomeCreditCard.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1119768070, i3, -1, "com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCard.<anonymous> (WelcomeCreditCardComposable.kt:72)");
                    }
                    long jM6716getBlack0d7_KjU = Color.INSTANCE.m6716getBlack0d7_KjU();
                    final ComponentActivity componentActivity2 = componentActivity;
                    final long j = jM21371getBg0d7_KjU;
                    final Function0<Unit> function0 = onLoginClick;
                    final Function0<Unit> function02 = onSignupClick;
                    final Context context2 = context;
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, 0L, 0L, 0L, jM6716getBlack0d7_KjU, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(601845336, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardComposableKt.WelcomeCreditCard.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* compiled from: WelcomeCreditCardComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardComposableKt$WelcomeCreditCard$2$1$4, reason: invalid class name */
                        static final class AnonymousClass4 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ Context $context;

                            AnonymousClass4(Context context) {
                                this.$context = context;
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
                                    ComposerKt.traceEventStart(39854249, i2, -1, "com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCard.<anonymous>.<anonymous>.<anonymous> (WelcomeCreditCardComposable.kt:131)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                final Context context = this.$context;
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                AnimationExoPlayerConfig animationExoPlayerConfig = new AnimationExoPlayerConfig(1, 4);
                                Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(24), 0.0f, 0.0f, 13, null), companion2.getBottomCenter());
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(context);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardComposableKt$WelcomeCreditCard$2$1$4$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return WelcomeCreditCardComposable3.C127552.AnonymousClass1.AnonymousClass4.invoke$lambda$6$lambda$1$lambda$0(context, (ExoPlayer) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                AnimationExoPlayer2.AnimationExoPlayer(animationExoPlayerConfig, modifierAlign, false, 0, null, null, (Function1) objRememberedValue, composer, AnimationExoPlayerConfig.$stable, 60);
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues);
                                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierPadding);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), 0.0f, C2002Dp.m7995constructorimpl(40), 0.0f, 0.0f, 13, null);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i3 = BentoTheme.$stable;
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierM5146paddingqDBjuR0$default, bentoTheme.getSpacing(composer, i3).m21591getLargeD9Ej5fM(), 0.0f, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer, 48);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                Modifier modifierTestTag = TestTag3.testTag(companion, WelcomeCreditCardComposable3.WELCOME_CREDIT_CARD_TITLE_TEST_TAG);
                                String strStringResource = StringResources_androidKt.stringResource(C12201R.string.welcome_title, composer, 0);
                                TextStyle bookCoverCapsuleSmall = bentoTheme.getTypography(composer, i3).getBookCoverCapsuleSmall();
                                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bookCoverCapsuleSmall, composer, 48, 0, 8124);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), composer, 0);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.welcome_subtitle, composer, 0), TestTag3.testTag(companion, WelcomeCreditCardComposable3.WELCOME_CREDIT_CARD_SUBTITLE_TEST_TAG), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 48, 0, 8124);
                                composer.endNode();
                                composer.endNode();
                                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardComposableKt$WelcomeCreditCard$2$1$4$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return WelcomeCreditCardComposable3.C127552.AnonymousClass1.AnonymousClass4.invoke$lambda$6$lambda$5$lambda$4((DrawScope) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                BoxKt.Box(DrawModifierKt.drawBehind(modifierM5156height3ABfNKs, (Function1) objRememberedValue2), composer, 0);
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
                            public static final Unit invoke$lambda$6$lambda$1$lambda$0(Context context, ExoPlayer AnimationExoPlayer) {
                                Intrinsics.checkNotNullParameter(AnimationExoPlayer, "$this$AnimationExoPlayer");
                                AnimationExoPlayer.setMediaSource(AnimationExoPlayer2.mp4MediaSourceFromAssets(Uri.parse(WelcomeCreditCardComposable3.VIDEO_FILE), context));
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$5$lambda$4(DrawScope drawBehind) {
                                Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                                Brush.Companion companion = Brush.INSTANCE;
                                Float fValueOf = Float.valueOf(0.0f);
                                BentoColor bentoColor = BentoColor.INSTANCE;
                                DrawScope.m6957drawRectAsUm42w$default(drawBehind, Brush.Companion.m6683verticalGradient8A3gB4$default(companion, new Tuples2[]{new Tuples2(fValueOf, Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoColor.m21143getCCGoldFG0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), new Tuples2(Float.valueOf(1.0f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoColor.m21143getCCGoldFG0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null)))}, 0.0f, 0.0f, 0, 14, (Object) null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                                return Unit.INSTANCE;
                            }
                        }

                        public final void invoke(Composer composer4, int i4) {
                            if ((i4 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(601845336, i4, -1, "com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCard.<anonymous>.<anonymous> (WelcomeCreditCardComposable.kt:73)");
                            }
                            Unit unit2 = Unit.INSTANCE;
                            composer4.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = composer4.changedInstance(componentActivity2) | composer4.changed(j);
                            ComponentActivity componentActivity3 = componentActivity2;
                            long j2 = j;
                            Object objRememberedValue2 = composer4.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new WelcomeCreditCardComposable4(componentActivity3, j2, null);
                                composer4.updateRememberedValue(objRememberedValue2);
                            }
                            composer4.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer4, 6);
                            Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_ONBOARDING_LANDING, null, null, null, 14, null), null, null, null, null, 61, null));
                            long jM21371getBg0d7_KjU2 = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21371getBg0d7_KjU();
                            int iM5856getCenterERTFSPs = FabPosition.INSTANCE.m5856getCenterERTFSPs();
                            final Function0<Unit> function03 = function0;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-2027560428, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardComposableKt.WelcomeCreditCard.2.1.2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i5) {
                                    if ((i5 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2027560428, i5, -1, "com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCard.<anonymous>.<anonymous>.<anonymous> (WelcomeCreditCardComposable.kt:87)");
                                    }
                                    Function2<Composer, Integer, Unit> function2M12907getLambda$570432953$feature_credit_card_externalDebug = WelcomeCreditCardComposable.INSTANCE.m12907getLambda$570432953$feature_credit_card_externalDebug();
                                    final Function0<Unit> function04 = function03;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M12907getLambda$570432953$feature_credit_card_externalDebug, null, null, ComposableLambda3.rememberComposableLambda(681656498, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardComposableKt.WelcomeCreditCard.2.1.2.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer6, Integer num) {
                                            invoke(row5, composer6, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Row5 BentoAppBar, Composer composer6, int i6) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i6 & 17) == 16 && composer6.getSkipping()) {
                                                composer6.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(681656498, i6, -1, "com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeCreditCardComposable.kt:90)");
                                            }
                                            Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer6, 6, 1), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_ONBOARDING_LANDING, null, null, null, 14, null), UserInteractionEventData.Action.VIEW_LOGIN, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 41, null), false, false, false, true, false, null, 110, null), WelcomeCreditCardComposable3.WELCOME_CREDIT_CARD_LOGIN_CTA_TEST_TAG);
                                            BentoTextButton2.m20715BentoTextButtonPIknLig(function04, StringResources_androidKt.stringResource(C12201R.string.welcome_login, composer6, 0), modifierTestTag, null, null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer6, BentoTheme.$stable).m21425getFg0d7_KjU()), composer6, 0, 56);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer5, 54), null, false, false, null, null, 0L, null, composer5, 3078, 0, 2038);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54);
                            final Function0<Unit> function04 = function02;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions, composableLambdaRememberComposableLambda, null, null, ComposableLambda3.rememberComposableLambda(-1277256591, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardComposableKt.WelcomeCreditCard.2.1.3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i5) {
                                    if ((i5 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1277256591, i5, -1, "com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCard.<anonymous>.<anonymous>.<anonymous> (WelcomeCreditCardComposable.kt:110)");
                                    }
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i6 = BentoTheme.$stable;
                                    long jM21371getBg0d7_KjU3 = bentoTheme.getColors(composer5, i6).m21371getBg0d7_KjU();
                                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer5, i6).m21425getFg0d7_KjU();
                                    final Function0<Unit> function05 = function04;
                                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(jM21371getBg0d7_KjU3, 0L, 0L, 0L, jM21425getFg0d7_KjU, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-876064445, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardComposableKt.WelcomeCreditCard.2.1.3.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                            invoke(composer6, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer6, int i7) {
                                            if ((i7 & 3) == 2 && composer6.getSkipping()) {
                                                composer6.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-876064445, i7, -1, "com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeCreditCardComposable.kt:111)");
                                            }
                                            Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer6, 6, 1), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_ONBOARDING_LANDING, null, null, null, 14, null), UserInteractionEventData.Action.SIGN_UP, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 41, null), false, false, false, true, false, null, 110, null), WelcomeCreditCardComposable3.WELCOME_CREDIT_CARD_SIGN_UP_CTA_TEST_TAG);
                                            BentoButtonKt.m20586BentoButtonEikTQX8(function05, StringResources_androidKt.stringResource(C11048R.string.general_label_sign_up, composer6, 0), modifierTestTag, null, null, false, false, null, null, null, null, false, null, composer6, 0, 0, 8184);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer5, 54), composer5, 805306368, 494);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), iM5856getCenterERTFSPs, jM21371getBg0d7_KjU2, 0L, null, ComposableLambda3.rememberComposableLambda(39854249, true, new AnonymousClass4(context2), composer4, 54), composer4, 805330992, WaitlistAnimationConstants.LEFT_YAW_START);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 805330944, 495);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 100663686, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WelcomeCreditCardComposable3.WelcomeCreditCard$lambda$3(onSignupClick, onLoginClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult WelcomeCreditCard$lambda$2$lambda$1(final EdgeToEdgeHost edgeToEdgeHost, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        if (edgeToEdgeHost != null) {
            edgeToEdgeHost.overrideSystemBarsStyle(false);
        }
        return new DisposableEffectResult() { // from class: com.robinhood.android.creditcard.ui.welcome.WelcomeCreditCardComposableKt$WelcomeCreditCard$lambda$2$lambda$1$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                EdgeToEdgeHost edgeToEdgeHost2 = edgeToEdgeHost;
                if (edgeToEdgeHost2 != null) {
                    edgeToEdgeHost2.resetStatusBarStyleOverride();
                }
            }
        };
    }
}

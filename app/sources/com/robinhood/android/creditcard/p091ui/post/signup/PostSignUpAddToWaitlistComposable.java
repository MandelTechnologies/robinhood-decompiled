package com.robinhood.android.creditcard.p091ui.post.signup;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.creditcard.p091ui.post.signup.PostSignUpAddToWaitlistComposable;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PostSignUpAddToWaitlistComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"PostSignUpAddToWaitlist", "", "loading", "", "joinWaitlist", "Lkotlin/Function0;", "launchFullWaitlistFlow", "skipAddToWaitlist", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PostSignUpAddToWaitlistComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostSignUpAddToWaitlist$lambda$1(boolean z, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PostSignUpAddToWaitlist(z, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PostSignUpAddToWaitlist(final boolean z, final Function0<Unit> joinWaitlist, final Function0<Unit> launchFullWaitlistFlow, final Function0<Unit> skipAddToWaitlist, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(joinWaitlist, "joinWaitlist");
        Intrinsics.checkNotNullParameter(launchFullWaitlistFlow, "launchFullWaitlistFlow");
        Intrinsics.checkNotNullParameter(skipAddToWaitlist, "skipAddToWaitlist");
        Composer composerStartRestartGroup = composer.startRestartGroup(82612025);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(joinWaitlist) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(launchFullWaitlistFlow) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(skipAddToWaitlist) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(82612025, i3, -1, "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlist (PostSignUpAddToWaitlistComposable.kt:53)");
                }
                TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextAnnotation(), 0L, 0L, null, null, null, null, null, TextUnit2.getSp(1), null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777087, null);
                EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new PostSignUpAddToWaitlistComposable2(null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_POST_SIGNUP_INTRO, null, null, null, 14, null), null, null, null, null, 61, null));
                Color.Companion companion = Color.INSTANCE;
                long jM6725getTransparent0d7_KjU = companion.m6725getTransparent0d7_KjU();
                long jM6725getTransparent0d7_KjU2 = companion.m6725getTransparent0d7_KjU();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1940777032, true, new C126292(textStyleM7655copyp1EtxEg$default, current, launchFullWaitlistFlow, joinWaitlist, z2, skipAddToWaitlist), composerStartRestartGroup, 54);
                Modifier modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions, null, null, null, null, 0, jM6725getTransparent0d7_KjU, jM6725getTransparent0d7_KjU2, null, composableLambdaRememberComposableLambda, composer2, 819462144, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PostSignUpAddToWaitlistComposable.PostSignUpAddToWaitlist$lambda$1(z, joinWaitlist, launchFullWaitlistFlow, skipAddToWaitlist, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            TextStyle textStyleM7655copyp1EtxEg$default2 = TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextAnnotation(), 0L, 0L, null, null, null, null, null, TextUnit2.getSp(1), null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777087, null);
            EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            Modifier modifierLogScreenTransitions2 = ModifiersKt.logScreenTransitions(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_POST_SIGNUP_INTRO, null, null, null, 14, null), null, null, null, null, 61, null));
            Color.Companion companion2 = Color.INSTANCE;
            long jM6725getTransparent0d7_KjU3 = companion2.m6725getTransparent0d7_KjU();
            long jM6725getTransparent0d7_KjU22 = companion2.m6725getTransparent0d7_KjU();
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1940777032, true, new C126292(textStyleM7655copyp1EtxEg$default2, current2, launchFullWaitlistFlow, joinWaitlist, z2, skipAddToWaitlist), composerStartRestartGroup, 54);
            Modifier modifier42 = modifier2;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions2, null, null, null, null, 0, jM6725getTransparent0d7_KjU3, jM6725getTransparent0d7_KjU22, null, composableLambdaRememberComposableLambda2, composer2, 819462144, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: PostSignUpAddToWaitlistComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistComposableKt$PostSignUpAddToWaitlist$2 */
    static final class C126292 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Function0<Unit> $joinWaitlist;
        final /* synthetic */ Function0<Unit> $launchFullWaitlistFlow;
        final /* synthetic */ boolean $loading;
        final /* synthetic */ Function0<Unit> $skipAddToWaitlist;
        final /* synthetic */ TextStyle $textStyle;

        C126292(TextStyle textStyle, EventLogger eventLogger, Function0<Unit> function0, Function0<Unit> function02, boolean z, Function0<Unit> function03) {
            this.$textStyle = textStyle;
            this.$eventLogger = eventLogger;
            this.$launchFullWaitlistFlow = function0;
            this.$joinWaitlist = function02;
            this.$loading = z;
            this.$skipAddToWaitlist = function03;
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
                ComposerKt.traceEventStart(1940777032, i2, -1, "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlist.<anonymous> (PostSignUpAddToWaitlistComposable.kt:72)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null));
            TextStyle textStyle = this.$textStyle;
            final EventLogger eventLogger = this.$eventLogger;
            final Function0<Unit> function0 = this.$launchFullWaitlistFlow;
            final Function0<Unit> function02 = this.$joinWaitlist;
            boolean z = this.$loading;
            final Function0<Unit> function03 = this.$skipAddToWaitlist;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierNavigationBarsPadding);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Brush.Companion companion4 = Brush.INSTANCE;
            BentoColor bentoColor = BentoColor.INSTANCE;
            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(Background3.background$default(modifierFillMaxWidth$default, Brush.Companion.m6682verticalGradient8A3gB4$default(companion4, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(bentoColor.m21140getCCGoldBG20d7_KjU()), Color.m6701boximpl(bentoColor.m21139getCCGoldBG0d7_KjU())}), 0.0f, Float.POSITIVE_INFINITY, 0, 8, (Object) null), null, 0.0f, 6, null));
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierStatusBarsPadding, 0.0f, bentoTheme.getSpacing(composer, i3).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), 0.0f, C2002Dp.m7995constructorimpl(40), 0.0f, 0.0f, 13, null), C2002Dp.m7995constructorimpl(EnumC7081g.f2776x87e624cb)), C2002Dp.m7995constructorimpl(31));
            AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_rh_gold_card_logo_alternative), null, null, null, 0, null, composer, 0, 62);
            ContentScale.Companion companion5 = ContentScale.INSTANCE;
            ContentScale fit = companion5.getFit();
            ColorFilter.Companion companion6 = ColorFilter.INSTANCE;
            ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, modifierM5156height3ABfNKs, (Alignment) null, fit, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(companion6, bentoColor.m21143getCCGoldFG0d7_KjU(), 0, 2, null), composer, 24624, 40);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.gold_card), null, null, null, 0, null, composer, 0, 62), (String) null, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), (Alignment) null, companion5.getFillWidth(), 0.0f, (ColorFilter) null, composer, 24624, 104);
            Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getBottomCenter());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer, modifierAlign);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceAround(), companion2.getBottom(), composer, 54);
            int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor6);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.post_sign_up_add_to_waitlist_material, composer, 0);
            FontWeight.Companion companion7 = FontWeight.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoColor.m21143getCCGoldFG0d7_KjU()), null, companion7.getBold(), null, null, 0, false, 0, 0, null, 0, textStyle, composer, 24576, 0, 8170);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.post_sign_up_add_to_waitlist_steel, composer, 0), null, Color.m6701boximpl(bentoColor.m21143getCCGoldFG0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8186);
            composer.endNode();
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash7 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifier2.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor7 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor7);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl7 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl7, measurePolicyColumnMeasurePolicy4, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl7, currentCompositionLocalMap7, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                composerM6388constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                composerM6388constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            Updater.m6390setimpl(composerM6388constructorimpl7, modifierMaterializeModifier7, companion3.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.post_sign_up_add_to_waitlist_weight, composer, 0), null, Color.m6701boximpl(bentoColor.m21143getCCGoldFG0d7_KjU()), null, companion7.getBold(), null, null, 0, false, 0, 0, null, 0, textStyle, composer, 24576, 0, 8170);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.post_sign_up_add_to_waitlist_grams, composer, 0), null, Color.m6701boximpl(bentoColor.m21143getCCGoldFG0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8186);
            composer.endNode();
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_visa_signature), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(34)), C2002Dp.m7995constructorimpl(54)), (Alignment) null, companion5.getFit(), 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(companion6, bentoColor.m21143getCCGoldFG0d7_KjU(), 0, 2, null), composer, 25008, 40);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            composer.endNode();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Color.Companion companion8 = Color.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, companion8.m6727getWhite0d7_KjU(), null, 2, null), 0.0f, composer, 6, 1), paddingValues);
            MeasurePolicy measurePolicyColumnMeasurePolicy5 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion2.getCenterHorizontally(), composer, 54);
            int currentCompositeKeyHash8 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifier2.materializeModifier(composer, modifierPadding);
            Function0<ComposeUiNode> constructor8 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor8);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl8 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl8, measurePolicyColumnMeasurePolicy5, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl8, currentCompositionLocalMap8, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                composerM6388constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                composerM6388constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
            }
            Updater.m6390setimpl(composerM6388constructorimpl8, modifierMaterializeModifier8, companion3.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.post_sign_up_add_to_waitlist_title, composer, 0), null, Color.m6701boximpl(companion8.m6716getBlack0d7_KjU()), null, companion7.getSemiBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleLarge(), composer, 24960, 0, 8170);
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.post_sign_up_add_to_waitlist_subtitle, composer, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(C12201R.string.post_sign_up_add_to_waitlist_subtitle_link_text, composer, 0);
            long jM6716getBlack0d7_KjU = companion8.m6716getBlack0d7_KjU();
            TextStyle textM = bentoTheme.getTypography(composer, i3).getTextM();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(eventLogger) | composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistComposableKt$PostSignUpAddToWaitlist$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostSignUpAddToWaitlistComposable.C126292.invoke$lambda$13$lambda$12$lambda$7$lambda$6(eventLogger, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource2, strStringResource3, (Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default2, jM6716getBlack0d7_KjU, 0L, textM, 0, composer, 24576, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(eventLogger) | composer.changed(function02);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistComposableKt$PostSignUpAddToWaitlist$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostSignUpAddToWaitlistComposable.C126292.invoke$lambda$13$lambda$12$lambda$9$lambda$8(eventLogger, function02);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function04 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            String strStringResource4 = StringResources_androidKt.stringResource(C12201R.string.post_sign_up_add_to_waitlist_primary_cta, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composer.changedInstance(eventLogger) | composer.changed(function03);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistComposableKt$PostSignUpAddToWaitlist$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostSignUpAddToWaitlistComposable.C126292.invoke$lambda$13$lambda$12$lambda$11$lambda$10(eventLogger, function03);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function04, strStringResource4, z, null, false, (Function0) objRememberedValue3, StringResources_androidKt.stringResource(C12201R.string.post_sign_up_add_to_waitlist_secondary_cta, composer, 0), false, null, false, composer, 0, 0, 58943);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12$lambda$7$lambda$6(EventLogger eventLogger, Function0 function0) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, loggingUtils.getCcScreen(), new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null), null, null, false, 57, null);
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12$lambda$9$lambda$8(EventLogger eventLogger, Function0 function0) {
            loggingUtils.logContinue$default(eventLogger, null, 1, null);
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12$lambda$11$lambda$10(EventLogger eventLogger, Function0 function0) {
            loggingUtils.logDismiss$default(eventLogger, null, 1, null);
            function0.invoke();
            return Unit.INSTANCE;
        }
    }
}

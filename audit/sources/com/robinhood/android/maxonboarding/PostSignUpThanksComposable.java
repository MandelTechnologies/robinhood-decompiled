package com.robinhood.android.maxonboarding;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.maxonboarding.PostSignUpThanksComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PostSignUpThanksComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"PostSignUpThanksComposable", "", "forceDarkMode", "", "modifier", "Landroidx/compose/ui/Modifier;", "onCtaClicked", "Lkotlin/Function0;", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-lib-max-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.maxonboarding.PostSignUpThanksComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class PostSignUpThanksComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostSignUpThanksComposable$lambda$0(boolean z, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        PostSignUpThanksComposable(z, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
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
    public static final void PostSignUpThanksComposable(final boolean z, Modifier modifier, final Function0<Unit> onCtaClicked, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCtaClicked, "onCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1943854990);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
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
                i3 |= composerStartRestartGroup.changedInstance(onCtaClicked) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1943854990, i3, -1, "com.robinhood.android.maxonboarding.PostSignUpThanksComposable (PostSignUpThanksComposable.kt:33)");
                }
                Modifier modifier5 = modifier4;
                BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1209957418, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.maxonboarding.PostSignUpThanksComposableKt.PostSignUpThanksComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: PostSignUpThanksComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.maxonboarding.PostSignUpThanksComposableKt$PostSignUpThanksComposable$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ boolean $forceDarkMode;
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Function0<Unit> $onCtaClicked;

                        AnonymousClass2(Modifier modifier, boolean z, Function0<Unit> function0) {
                            this.$modifier = modifier;
                            this.$forceDarkMode = z;
                            this.$onCtaClicked = function0;
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
                                ComposerKt.traceEventStart(708635509, i, -1, "com.robinhood.android.maxonboarding.PostSignUpThanksComposable.<anonymous>.<anonymous> (PostSignUpThanksComposable.kt:49)");
                            }
                            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(this.$modifier, this.$forceDarkMode ? BentoColor.INSTANCE.m21220getDayJet0d7_KjU() : BentoColor.INSTANCE.m21170getDayBiomeDark0d7_KjU(), null, 2, null), 0.0f, 1, null));
                            final Function0<Unit> function0 = this.$onCtaClicked;
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierNavigationBarsPadding);
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
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composer, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
                            Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer, 0);
                            ImageKt.Image(PainterResources_androidKt.painterResource(C11048R.drawable.svg_icon_thanks, composer, 0), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer, 0);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion3, null, false, 3, null), 0.0f, 1, null);
                            TextStyle bookCoverCapsuleSmall = bentoTheme.getTypography(composer, i2).getBookCoverCapsuleSmall();
                            String strStringResource = StringResources_androidKt.stringResource(C21613R.string.post_sign_up_thanks_title, composer, 0);
                            TextAlign.Companion companion4 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bookCoverCapsuleSmall, composer, 48, 0, 8124);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21613R.string.post_sign_up_thanks_subtitle, composer, 0), SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion3, null, false, 3, null), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 48, 0, 8124);
                            Spacer2.Spacer(Column5.weight$default(column6, companion3, 0.5f, false, 2, null), composer, 0);
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 7, null), 0.0f, 1, null);
                            String strStringResource2 = StringResources_androidKt.stringResource(C21613R.string.post_sign_up_primary_cta, composer, 0);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(function0);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.maxonboarding.PostSignUpThanksComposableKt$PostSignUpThanksComposable$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PostSignUpThanksComposable.C216121.AnonymousClass2.invoke$lambda$3$lambda$2$lambda$1$lambda$0(function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierFillMaxWidth$default2, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                            composer.endNode();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(Function0 function0) {
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1209957418, i5, -1, "com.robinhood.android.maxonboarding.PostSignUpThanksComposable.<anonymous> (PostSignUpThanksComposable.kt:36)");
                        }
                        SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer2, 0, 1);
                        Unit unit = Unit.INSTANCE;
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChanged = composer2.changed(systemUiControllerRememberSystemUiController) | composer2.changed(z);
                        boolean z2 = z;
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PostSignUpThanksComposable2(systemUiControllerRememberSystemUiController, z2, null);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 6);
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(708635509, true, new AnonymousClass2(modifier4, z, onCtaClicked), composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.maxonboarding.PostSignUpThanksComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PostSignUpThanksComposable.PostSignUpThanksComposable$lambda$0(z, modifier3, onCtaClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifier52 = modifier4;
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1209957418, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.maxonboarding.PostSignUpThanksComposableKt.PostSignUpThanksComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: PostSignUpThanksComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.maxonboarding.PostSignUpThanksComposableKt$PostSignUpThanksComposable$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ boolean $forceDarkMode;
                    final /* synthetic */ Modifier $modifier;
                    final /* synthetic */ Function0<Unit> $onCtaClicked;

                    AnonymousClass2(Modifier modifier, boolean z, Function0<Unit> function0) {
                        this.$modifier = modifier;
                        this.$forceDarkMode = z;
                        this.$onCtaClicked = function0;
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
                            ComposerKt.traceEventStart(708635509, i, -1, "com.robinhood.android.maxonboarding.PostSignUpThanksComposable.<anonymous>.<anonymous> (PostSignUpThanksComposable.kt:49)");
                        }
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(this.$modifier, this.$forceDarkMode ? BentoColor.INSTANCE.m21220getDayJet0d7_KjU() : BentoColor.INSTANCE.m21170getDayBiomeDark0d7_KjU(), null, 2, null), 0.0f, 1, null));
                        final Function0 function0 = this.$onCtaClicked;
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierNavigationBarsPadding);
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
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composer, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
                        Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer, 0);
                        ImageKt.Image(PainterResources_androidKt.painterResource(C11048R.drawable.svg_icon_thanks, composer, 0), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer, 0);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion3, null, false, 3, null), 0.0f, 1, null);
                        TextStyle bookCoverCapsuleSmall = bentoTheme.getTypography(composer, i2).getBookCoverCapsuleSmall();
                        String strStringResource = StringResources_androidKt.stringResource(C21613R.string.post_sign_up_thanks_title, composer, 0);
                        TextAlign.Companion companion4 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bookCoverCapsuleSmall, composer, 48, 0, 8124);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21613R.string.post_sign_up_thanks_subtitle, composer, 0), SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion3, null, false, 3, null), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 48, 0, 8124);
                        Spacer2.Spacer(Column5.weight$default(column6, companion3, 0.5f, false, 2, null), composer, 0);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 7, null), 0.0f, 1, null);
                        String strStringResource2 = StringResources_androidKt.stringResource(C21613R.string.post_sign_up_primary_cta, composer, 0);
                        composer.startReplaceGroup(5004770);
                        boolean zChanged = composer.changed(function0);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.maxonboarding.PostSignUpThanksComposableKt$PostSignUpThanksComposable$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PostSignUpThanksComposable.C216121.AnonymousClass2.invoke$lambda$3$lambda$2$lambda$1$lambda$0(function0);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierFillMaxWidth$default2, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                        composer.endNode();
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(Function0 function0) {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1209957418, i5, -1, "com.robinhood.android.maxonboarding.PostSignUpThanksComposable.<anonymous> (PostSignUpThanksComposable.kt:36)");
                    }
                    SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer2, 0, 1);
                    Unit unit = Unit.INSTANCE;
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged = composer2.changed(systemUiControllerRememberSystemUiController) | composer2.changed(z);
                    boolean z2 = z;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new PostSignUpThanksComposable2(systemUiControllerRememberSystemUiController, z2, null);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 6);
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(708635509, true, new AnonymousClass2(modifier4, z, onCtaClicked), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}

package com.robinhood.shared.crypto.transfer.enrollment.resolution;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler;
import androidx.view.compose.BackHandler5;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionComposable5;
import com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EnrollmentResolutionComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u008a\u0084\u0002"}, m3636d2 = {"EnrollmentResolutionContent", "", "state", "Lcom/robinhood/shared/crypto/transfer/enrollment/resolution/EnrollmentResolutionState;", "onDoneClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/crypto/transfer/enrollment/resolution/EnrollmentResolutionState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewCompleted", "(Landroidx/compose/runtime/Composer;I)V", "TopBar", "infoUrl", "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EnrollmentResolutionComposable5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnrollmentResolutionContent$lambda$2(EnrollmentResolutionState enrollmentResolutionState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EnrollmentResolutionContent(enrollmentResolutionState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCompleted$lambda$3(int i, Composer composer, int i2) {
        PreviewCompleted(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBar$lambda$4(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TopBar(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void EnrollmentResolutionContent(final EnrollmentResolutionState state, final Function0<Unit> onDoneClick, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDoneClick, "onDoneClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1956667430);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDoneClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1956667430, i3, -1, "com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionContent (EnrollmentResolutionComposable.kt:47)");
            }
            OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
            final OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(onBackPressedDispatcher);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EnrollmentResolutionComposable5.EnrollmentResolutionContent$lambda$1$lambda$0(onBackPressedDispatcher);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandler.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1222650033, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionComposableKt.EnrollmentResolutionContent.2
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
                        ComposerKt.traceEventStart(1222650033, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionContent.<anonymous> (EnrollmentResolutionComposable.kt:53)");
                    }
                    Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier, null, 1, null);
                    final EnrollmentResolutionState enrollmentResolutionState = state;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1741465205, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionComposableKt.EnrollmentResolutionContent.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1741465205, i6, -1, "com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionContent.<anonymous>.<anonymous> (EnrollmentResolutionComposable.kt:56)");
                            }
                            EnrollmentResolutionComposable5.TopBar(enrollmentResolutionState.getInfoUrl(), null, composer3, 0, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final Function0<Unit> function0 = onDoneClick;
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-493579594, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionComposableKt.EnrollmentResolutionContent.2.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-493579594, i6, -1, "com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionContent.<anonymous>.<anonymous> (EnrollmentResolutionComposable.kt:111)");
                            }
                            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer3, 0), PaddingKt.m5146paddingqDBjuR0$default(WindowInsetsPadding_androidKt.navigationBarsPadding(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null)), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final EnrollmentResolutionState enrollmentResolutionState2 = state;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1480752640, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionComposableKt.EnrollmentResolutionContent.2.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        private static final LottieComposition invoke$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
                            return lottieCompositionResult.getValue();
                        }

                        public final void invoke(PaddingValues contentPadding, Composer composer3, int i6) {
                            int i7;
                            BentoTheme bentoTheme;
                            int i8;
                            LottieCompositionSpec lottieCompositionSpecM9176boximpl;
                            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                            if ((i6 & 6) == 0) {
                                i7 = i6 | (composer3.changed(contentPadding) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1480752640, i7, -1, "com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionContent.<anonymous>.<anonymous> (EnrollmentResolutionComposable.kt:59)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), contentPadding);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierPadding, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM());
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                            EnrollmentResolutionState enrollmentResolutionState3 = enrollmentResolutionState2;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5143paddingVpY3zN4);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String title = enrollmentResolutionState3.getTitle();
                            TextStyle bookCoverCapsuleSmall = bentoTheme2.getTypography(composer3, i9).getBookCoverCapsuleSmall();
                            TextAlign.Companion companion4 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(title, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bookCoverCapsuleSmall, composer3, 48, 0, 8124);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(8)), composer3, 6);
                            BentoText2.m20747BentoText38GnDrw(enrollmentResolutionState3.getSubtitle(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i9).getTextM(), composer3, 48, 0, 8124);
                            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                            EnrollmentResolutionState.LottieAsset lottieAsset = enrollmentResolutionState3.getLottieAsset();
                            if (lottieAsset instanceof EnrollmentResolutionState.LottieAsset.Raw) {
                                composer3.startReplaceGroup(-463736336);
                                bentoTheme = bentoTheme2;
                                i8 = i9;
                                EnrollmentResolutionState.LottieAsset.Raw raw = (EnrollmentResolutionState.LottieAsset.Raw) lottieAsset;
                                int iM9171constructorimpl = LottieCompositionSpec.RawRes.m9171constructorimpl(bentoTheme.getColors(composer3, i8).getIsDay() ? raw.getLight() : raw.getDark());
                                composer3.endReplaceGroup();
                                lottieCompositionSpecM9176boximpl = LottieCompositionSpec.RawRes.m9170boximpl(iM9171constructorimpl);
                            } else {
                                bentoTheme = bentoTheme2;
                                i8 = i9;
                                if (!(lottieAsset instanceof EnrollmentResolutionState.LottieAsset.Url)) {
                                    composer3.startReplaceGroup(-1400435877);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(-463464156);
                                EnrollmentResolutionState.LottieAsset.Url url = (EnrollmentResolutionState.LottieAsset.Url) lottieAsset;
                                String strM9177constructorimpl = LottieCompositionSpec.Url.m9177constructorimpl((bentoTheme.getColors(composer3, i8).getIsDay() ? url.getLight() : url.getDark()).getUrl().getUrl());
                                composer3.endReplaceGroup();
                                lottieCompositionSpecM9176boximpl = LottieCompositionSpec.Url.m9176boximpl(strM9177constructorimpl);
                            }
                            LottieAnimation2.LottieAnimation(invoke$lambda$1$lambda$0(rememberLottieComposition.rememberLottieComposition(lottieCompositionSpecM9176boximpl, null, null, null, null, null, composer3, 0, 62)), column6.align(PaddingKt.m5144paddingVpY3zN4$default(AspectRatio3.aspectRatio$default(companion, 1.0f, false, 2, null), 0.0f, bentoTheme.getSpacing(composer3, i8).m21596getXxlargeD9Ej5fM(), 1, null), companion2.getCenterHorizontally()), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer3, 0, 0, 0, 2097148);
                            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306800, 504);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EnrollmentResolutionComposable5.EnrollmentResolutionContent$lambda$2(state, onDoneClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnrollmentResolutionContent$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    private static final void PreviewCompleted(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1812519506);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1812519506, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.resolution.PreviewCompleted (EnrollmentResolutionComposable.kt:126)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, EnrollmentResolutionComposable.INSTANCE.m25014getLambda$847450214$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EnrollmentResolutionComposable5.PreviewCompleted$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopBar(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1557362067);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1557362067, i3, -1, "com.robinhood.shared.crypto.transfer.enrollment.resolution.TopBar (EnrollmentResolutionComposable.kt:148)");
                }
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                EnrollmentResolutionComposable enrollmentResolutionComposable = EnrollmentResolutionComposable.INSTANCE;
                int i5 = (i3 & 112) | 200070;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(enrollmentResolutionComposable.getLambda$218417344$feature_crypto_transfer_externalDebug(), modifier3, enrollmentResolutionComposable.getLambda$788159764$feature_crypto_transfer_externalDebug(), ComposableLambda3.rememberComposableLambda(1936215221, true, new C380041(context, str), composerStartRestartGroup, 54), null, true, false, null, null, 0L, null, composer2, i5, 0, 2000);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EnrollmentResolutionComposable5.TopBar$lambda$4(str, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            EnrollmentResolutionComposable enrollmentResolutionComposable2 = EnrollmentResolutionComposable.INSTANCE;
            int i52 = (i3 & 112) | 200070;
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(enrollmentResolutionComposable2.getLambda$218417344$feature_crypto_transfer_externalDebug(), modifier3, enrollmentResolutionComposable2.getLambda$788159764$feature_crypto_transfer_externalDebug(), ComposableLambda3.rememberComposableLambda(1936215221, true, new C380041(context2, str), composerStartRestartGroup, 54), null, true, false, null, null, 0L, null, composer2, i52, 0, 2000);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: EnrollmentResolutionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionComposableKt$TopBar$1 */
    static final class C380041 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $infoUrl;

        C380041(Context context, String str) {
            this.$context = context;
            this.$infoUrl = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1936215221, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.resolution.TopBar.<anonymous> (EnrollmentResolutionComposable.kt:154)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.QUESTION_24);
            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_enrollment_menu_transfer_info, composer, 0);
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$context) | composer.changed(this.$infoUrl);
            final Context context = this.$context;
            final String str = this.$infoUrl;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionComposableKt$TopBar$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EnrollmentResolutionComposable5.C380041.invoke$lambda$1$lambda$0(context, str);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21425getFg0d7_KjU, modifierM5144paddingVpY3zN4$default, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Context context, String str) {
            WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
            return Unit.INSTANCE;
        }
    }
}

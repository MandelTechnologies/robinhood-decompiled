package com.robinhood.android.transfers.limits.p267ui;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.transfers.limits.p267ui.LimitsHubDetailsComposable;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.api.bonfire.transfer.limitsv1.details.ApiLimitResetDetails;
import com.robinhood.models.api.bonfire.transfer.limitsv1.details.ApiLimitsHubDetailsResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LimitsHubDetailsComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"LimitsHubDetailComposable", "", "viewState", "Lcom/robinhood/android/transfers/limits/ui/LimitsHubDetailsViewState;", "inlineLinkTextOnClick", "Lkotlin/Function1;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/details/ApiLimitResetDetails;", "(Lcom/robinhood/android/transfers/limits/ui/LimitsHubDetailsViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "LimitsHubDetailsLoadingView", "", "LimitsHubDetailsContent", "feature-transfer-limits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.limits.ui.LimitsHubDetailsComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class LimitsHubDetailsComposable {
    public static final String LimitsHubDetailsContent = "limitsHubDetailContent";
    public static final String LimitsHubDetailsLoadingView = "limitsHubDetailsLoadingView";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LimitsHubDetailComposable$lambda$0(LimitsHubDetailsViewState limitsHubDetailsViewState, Function1 function1, int i, Composer composer, int i2) {
        LimitsHubDetailComposable(limitsHubDetailsViewState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LimitsHubDetailComposable(final LimitsHubDetailsViewState viewState, final Function1<? super ApiLimitResetDetails, Unit> inlineLinkTextOnClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(inlineLinkTextOnClick, "inlineLinkTextOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(693968655);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(inlineLinkTextOnClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(693968655, i2, -1, "com.robinhood.android.transfers.limits.ui.LimitsHubDetailComposable (LimitsHubDetailsComposable.kt:22)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1454779494, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.limits.ui.LimitsHubDetailsComposableKt.LimitsHubDetailComposable.1
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
                        ComposerKt.traceEventStart(-1454779494, i3, -1, "com.robinhood.android.transfers.limits.ui.LimitsHubDetailComposable.<anonymous> (LimitsHubDetailsComposable.kt:24)");
                    }
                    ScaffoldKt.m5625Scaffold27mzLpw(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(2004767704, true, new AnonymousClass1(viewState, inlineLinkTextOnClick), composer2, 54), composer2, 0, 12582912, 98303);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: LimitsHubDetailsComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.transfers.limits.ui.LimitsHubDetailsComposableKt$LimitsHubDetailComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ Function1<ApiLimitResetDetails, Unit> $inlineLinkTextOnClick;
                    final /* synthetic */ LimitsHubDetailsViewState $viewState;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(LimitsHubDetailsViewState limitsHubDetailsViewState, Function1<? super ApiLimitResetDetails, Unit> function1) {
                        this.$viewState = limitsHubDetailsViewState;
                        this.$inlineLinkTextOnClick = function1;
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
                            ComposerKt.traceEventStart(2004767704, i2, -1, "com.robinhood.android.transfers.limits.ui.LimitsHubDetailComposable.<anonymous>.<anonymous> (LimitsHubDetailsComposable.kt:27)");
                        }
                        if (this.$viewState.isLoading()) {
                            composer.startReplaceGroup(-1780485442);
                            LoadingScreenComposablesKt.ListLoadingScreenComposable(TestTag3.testTag(Modifier.INSTANCE, LimitsHubDetailsComposable.LimitsHubDetailsLoadingView), true, false, 8, composer, 3126, 4);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(-1780213262);
                            final ApiLimitsHubDetailsResponse response = this.$viewState.getResponse();
                            if (response != null) {
                                final Function1<ApiLimitResetDetails, Unit> function1 = this.$inlineLinkTextOnClick;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(TestTag3.testTag(SizeKt.fillMaxHeight$default(PaddingKt.padding(companion, paddingValues), 0.0f, 1, null), LimitsHubDetailsComposable.LimitsHubDetailsContent), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
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
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i3 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(response.getScreen_title(), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), composer, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged = composer.changed(function1) | composer.changedInstance(response);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.limits.ui.LimitsHubDetailsComposableKt$LimitsHubDetailComposable$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return LimitsHubDetailsComposable.C303921.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$1$lambda$0(function1, response);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                LimitsHubDetailsSubtitleComposable.LimitsHubDetailsSubtitleComposable((Function0) objRememberedValue, response.getScreen_subtitle(), composer, 0);
                                LimitsHubDetailsSectionsComposable.LimitsHubDetailsSectionsComposable(response.getSections(), composer, 0);
                                composer.endNode();
                                Unit unit = Unit.INSTANCE;
                            }
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(Function1 function1, ApiLimitsHubDetailsResponse apiLimitsHubDetailsResponse) {
                        function1.invoke(apiLimitsHubDetailsResponse.getLimit_reset_details());
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.limits.ui.LimitsHubDetailsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LimitsHubDetailsComposable.LimitsHubDetailComposable$lambda$0(viewState, inlineLinkTextOnClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

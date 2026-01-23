package com.robinhood.android.internalassettransfers.presubmissionwarn;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: InternalAssetTransferPreSubmissionWarn.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"LazyListTitleKey", "", "LazyListSpaceKey", "InternalAssetTransferPreSubmissionWarn", "", "viewState", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/InternalAssetTransferPreSubmissionWarnViewState;", "callbacks", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/InternalAssetTransferPreSubmissionWarnCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/internalassettransfers/presubmissionwarn/InternalAssetTransferPreSubmissionWarnViewState;Lcom/robinhood/android/internalassettransfers/presubmissionwarn/InternalAssetTransferPreSubmissionWarnCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InternalAssetTransferPreSubmissionWarnToolbar", "(Lcom/robinhood/android/internalassettransfers/presubmissionwarn/InternalAssetTransferPreSubmissionWarnCallbacks;Landroidx/compose/runtime/Composer;I)V", "InternalAssetTransferPreSubmissionWarnContent", "(Lcom/robinhood/android/internalassettransfers/presubmissionwarn/InternalAssetTransferPreSubmissionWarnViewState;Landroidx/compose/runtime/Composer;I)V", "InternalAssetTransferPreSubmissionWarnItem", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PresubmissionChecksAlertSheet;", "(ILcom/robinhood/android/internalassettransfers/presubmissionwarn/PresubmissionChecksAlertSheet;Landroidx/compose/runtime/Composer;I)V", "InternalAssetTransferPreSubmissionWarnBottomButton", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferPreSubmissionWarn7 {
    private static final String LazyListSpaceKey = "SpaceKey";
    private static final String LazyListTitleKey = "TitleKey";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferPreSubmissionWarn$lambda$0(InternalAssetTransferPreSubmissionWarnViewState internalAssetTransferPreSubmissionWarnViewState, InternalAssetTransferPreSubmissionWarn6 internalAssetTransferPreSubmissionWarn6, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InternalAssetTransferPreSubmissionWarn(internalAssetTransferPreSubmissionWarnViewState, internalAssetTransferPreSubmissionWarn6, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferPreSubmissionWarnBottomButton$lambda$10(InternalAssetTransferPreSubmissionWarn6 internalAssetTransferPreSubmissionWarn6, int i, Composer composer, int i2) {
        InternalAssetTransferPreSubmissionWarnBottomButton(internalAssetTransferPreSubmissionWarn6, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferPreSubmissionWarnContent$lambda$6(InternalAssetTransferPreSubmissionWarnViewState internalAssetTransferPreSubmissionWarnViewState, int i, Composer composer, int i2) {
        InternalAssetTransferPreSubmissionWarnContent(internalAssetTransferPreSubmissionWarnViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferPreSubmissionWarnItem$lambda$7(int i, PresubmissionChecksAlertSheet presubmissionChecksAlertSheet, int i2, Composer composer, int i3) {
        InternalAssetTransferPreSubmissionWarnItem(i, presubmissionChecksAlertSheet, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferPreSubmissionWarnToolbar$lambda$2(InternalAssetTransferPreSubmissionWarn6 internalAssetTransferPreSubmissionWarn6, int i, Composer composer, int i2) {
        InternalAssetTransferPreSubmissionWarnToolbar(internalAssetTransferPreSubmissionWarn6, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalAssetTransferPreSubmissionWarn(final InternalAssetTransferPreSubmissionWarnViewState viewState, final InternalAssetTransferPreSubmissionWarn6 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1546626491);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1546626491, i3, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarn (InternalAssetTransferPreSubmissionWarn.kt:46)");
                }
                int i5 = ((i3 >> 6) & 14) | 805306416;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(34038273, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt.InternalAssetTransferPreSubmissionWarn.1
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
                            ComposerKt.traceEventStart(34038273, i6, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarn.<anonymous> (InternalAssetTransferPreSubmissionWarn.kt:50)");
                        }
                        InternalAssetTransferPreSubmissionWarn7.InternalAssetTransferPreSubmissionWarnToolbar(callbacks, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(-555440234, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt.InternalAssetTransferPreSubmissionWarn.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-555440234, i6, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarn.<anonymous> (InternalAssetTransferPreSubmissionWarn.kt:53)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                        final InternalAssetTransferPreSubmissionWarn6 internalAssetTransferPreSubmissionWarn6 = callbacks;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(444100289, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt.InternalAssetTransferPreSubmissionWarn.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer4, Integer num) {
                                invoke(bentoButtonBar3, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(444100289, i7, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarn.<anonymous>.<anonymous> (InternalAssetTransferPreSubmissionWarn.kt:62)");
                                }
                                InternalAssetTransferPreSubmissionWarn7.InternalAssetTransferPreSubmissionWarnBottomButton(internalAssetTransferPreSubmissionWarn6, composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final InternalAssetTransferPreSubmissionWarnViewState internalAssetTransferPreSubmissionWarnViewState = viewState;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierPadding, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(210258862, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt.InternalAssetTransferPreSubmissionWarn.2.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                invoke(boxScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(210258862, i7, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarn.<anonymous>.<anonymous> (InternalAssetTransferPreSubmissionWarn.kt:57)");
                                }
                                InternalAssetTransferPreSubmissionWarn7.InternalAssetTransferPreSubmissionWarnContent(internalAssetTransferPreSubmissionWarnViewState, composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i5, 444);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternalAssetTransferPreSubmissionWarn7.InternalAssetTransferPreSubmissionWarn$lambda$0(viewState, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = ((i3 >> 6) & 14) | 805306416;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(34038273, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt.InternalAssetTransferPreSubmissionWarn.1
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
                        ComposerKt.traceEventStart(34038273, i6, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarn.<anonymous> (InternalAssetTransferPreSubmissionWarn.kt:50)");
                    }
                    InternalAssetTransferPreSubmissionWarn7.InternalAssetTransferPreSubmissionWarnToolbar(callbacks, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(-555440234, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt.InternalAssetTransferPreSubmissionWarn.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i6 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-555440234, i6, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarn.<anonymous> (InternalAssetTransferPreSubmissionWarn.kt:53)");
                    }
                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                    final InternalAssetTransferPreSubmissionWarn6 internalAssetTransferPreSubmissionWarn6 = callbacks;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(444100289, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt.InternalAssetTransferPreSubmissionWarn.2.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer4, Integer num) {
                            invoke(bentoButtonBar3, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(444100289, i7, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarn.<anonymous>.<anonymous> (InternalAssetTransferPreSubmissionWarn.kt:62)");
                            }
                            InternalAssetTransferPreSubmissionWarn7.InternalAssetTransferPreSubmissionWarnBottomButton(internalAssetTransferPreSubmissionWarn6, composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54);
                    final InternalAssetTransferPreSubmissionWarnViewState internalAssetTransferPreSubmissionWarnViewState = viewState;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierPadding, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(210258862, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt.InternalAssetTransferPreSubmissionWarn.2.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                            invoke(boxScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(210258862, i7, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarn.<anonymous>.<anonymous> (InternalAssetTransferPreSubmissionWarn.kt:57)");
                            }
                            InternalAssetTransferPreSubmissionWarn7.InternalAssetTransferPreSubmissionWarnContent(internalAssetTransferPreSubmissionWarnViewState, composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 3504, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, i52, 444);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InternalAssetTransferPreSubmissionWarnToolbar(final InternalAssetTransferPreSubmissionWarn6 internalAssetTransferPreSubmissionWarn6, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1453235322);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(internalAssetTransferPreSubmissionWarn6) : composerStartRestartGroup.changedInstance(internalAssetTransferPreSubmissionWarn6) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1453235322, i2, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnToolbar (InternalAssetTransferPreSubmissionWarn.kt:73)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            InternalAssetTransferPreSubmissionWarn internalAssetTransferPreSubmissionWarn = InternalAssetTransferPreSubmissionWarn.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(internalAssetTransferPreSubmissionWarn.m2102x256d3894(), null, ComposableLambda3.rememberComposableLambda(634722479, true, new InternalAssetTransferPreSubmissionWarn8(internalAssetTransferPreSubmissionWarn6), composerStartRestartGroup, 54), null, internalAssetTransferPreSubmissionWarn.m2103x67159b7f(), false, false, null, Color.m6701boximpl(jM21371getBg0d7_KjU), 0L, null, composerStartRestartGroup, 24966, 0, 1770);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferPreSubmissionWarn7.InternalAssetTransferPreSubmissionWarnToolbar$lambda$2(internalAssetTransferPreSubmissionWarn6, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InternalAssetTransferPreSubmissionWarnContent(final InternalAssetTransferPreSubmissionWarnViewState internalAssetTransferPreSubmissionWarnViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-906711318);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(internalAssetTransferPreSubmissionWarnViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-906711318, i2, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnContent (InternalAssetTransferPreSubmissionWarn.kt:92)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InternalAssetTransferPreSubmissionWarn7.InternalAssetTransferPreSubmissionWarnContent$lambda$5$lambda$4(internalAssetTransferPreSubmissionWarnViewState, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierFillMaxWidth$default, null, paddingValuesM5139PaddingValuesa9UjIt4$default, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 6, 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferPreSubmissionWarn7.InternalAssetTransferPreSubmissionWarnContent$lambda$6(internalAssetTransferPreSubmissionWarnViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferPreSubmissionWarnContent$lambda$5$lambda$4(InternalAssetTransferPreSubmissionWarnViewState internalAssetTransferPreSubmissionWarnViewState, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        InternalAssetTransferPreSubmissionWarn internalAssetTransferPreSubmissionWarn = InternalAssetTransferPreSubmissionWarn.INSTANCE;
        LazyListScope.item$default(LazyColumn, LazyListTitleKey, null, internalAssetTransferPreSubmissionWarn.m2104x4e231e0e(), 2, null);
        LazyListScope.item$default(LazyColumn, LazyListSpaceKey, null, internalAssetTransferPreSubmissionWarn.m2101xb3b94bd2(), 2, null);
        final ImmutableList<PresubmissionChecksAlertSheet> alerts = internalAssetTransferPreSubmissionWarnViewState.getAlerts();
        LazyColumn.items(alerts.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt$InternalAssetTransferPreSubmissionWarnContent$lambda$5$lambda$4$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                alerts.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt$InternalAssetTransferPreSubmissionWarnContent$lambda$5$lambda$4$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                Object obj = alerts.get(i);
                int i4 = i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                composer.startReplaceGroup(798184813);
                InternalAssetTransferPreSubmissionWarn7.InternalAssetTransferPreSubmissionWarnItem(i, (PresubmissionChecksAlertSheet) obj, composer, (i4 >> 3) & 14);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InternalAssetTransferPreSubmissionWarnItem(final int i, final PresubmissionChecksAlertSheet presubmissionChecksAlertSheet, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(997111675);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(presubmissionChecksAlertSheet) : composerStartRestartGroup.changedInstance(presubmissionChecksAlertSheet) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(997111675, i3, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnItem (InternalAssetTransferPreSubmissionWarn.kt:126)");
            }
            BentoValuePropRow3.m21026BentoValuePropRowWithMarkdownOrRichtextFV1VA1c(StringResource2.getString(presubmissionChecksAlertSheet.getTitle(), composerStartRestartGroup, StringResource.$stable), ComposableLambda3.rememberComposableLambda(1533022460, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt.InternalAssetTransferPreSubmissionWarnItem.1
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
                        ComposerKt.traceEventStart(1533022460, i4, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnItem.<anonymous> (InternalAssetTransferPreSubmissionWarn.kt:130)");
                    }
                    BentoMarkdownText2.BentoMarkdownText(StringResource2.getString(presubmissionChecksAlertSheet.getSubtitleMarkdown(), composer2, StringResource.$stable), (Modifier) null, MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer2, BentoMarkdownText.$stable), null, null, null, null, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), null, null, 0L, null, TextAlign.INSTANCE.m7924getStarte0LSkKk(), null, 1519, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), new BentoValuePropRow2.Number(i + 1), BentoValuePropRow.Center, null, null, composerStartRestartGroup, (BentoValuePropRow2.Number.$stable << 6) | 3120, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferPreSubmissionWarn7.InternalAssetTransferPreSubmissionWarnItem$lambda$7(i, presubmissionChecksAlertSheet, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InternalAssetTransferPreSubmissionWarnBottomButton(final InternalAssetTransferPreSubmissionWarn6 internalAssetTransferPreSubmissionWarn6, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-667173926);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(internalAssetTransferPreSubmissionWarn6) : composerStartRestartGroup.changedInstance(internalAssetTransferPreSubmissionWarn6) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-667173926, i2, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnBottomButton (InternalAssetTransferPreSubmissionWarn.kt:146)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM());
            boolean z = false;
            String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_pre_submission_warn_button_text, composerStartRestartGroup, 0);
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU();
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(internalAssetTransferPreSubmissionWarn6))) {
                z = true;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferPreSubmissionWarn7.m2105xb947dbd3(internalAssetTransferPreSubmissionWarn6);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU), null, null, false, null, composer2, 0, 0, 7800);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferPreSubmissionWarn7.InternalAssetTransferPreSubmissionWarnBottomButton$lambda$10(internalAssetTransferPreSubmissionWarn6, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InternalAssetTransferPreSubmissionWarnBottomButton$lambda$9$lambda$8 */
    public static final Unit m2105xb947dbd3(InternalAssetTransferPreSubmissionWarn6 internalAssetTransferPreSubmissionWarn6) {
        internalAssetTransferPreSubmissionWarn6.onBottomBarButtonClicked();
        return Unit.INSTANCE;
    }
}

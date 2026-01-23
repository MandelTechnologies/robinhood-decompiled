package com.robinhood.android.advisory.withdrawal;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalViewState;
import com.robinhood.android.advisory.withdrawal.FullWithdrawalSummary;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: AdvisoryFullWithdrawalScreen.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0018\u001a\u001f\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u001e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u000fX\u008a\u0084\u0002"}, m3636d2 = {"FullWithdrawalErrorTag", "", "WithdrawItemBottomSheet", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary$BottomSheetData;", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary$BottomSheetData;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WithdrawItem", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary$Item;", "showBottomDivider", "", "boldValue", "(Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary$Item;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V", "AdvisoryFullWithdrawalContent", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary;", "submitting", "callbacks", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalScreenCallbacks;", "(Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary;ZLcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FullWithdrawalPlaceholder", "(Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AdvisoryFullWithdrawalScreen", "state", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState;", "(Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState;Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-full-withdrawal_externalDebug", "showingBottomSheet", "showFooterDivider"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryFullWithdrawalScreenKt {
    public static final String FullWithdrawalErrorTag = "advisory_full_withdrawal_error";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryFullWithdrawalContent$lambda$24(FullWithdrawalSummary fullWithdrawalSummary, boolean z, AdvisoryFullWithdrawalScreenCallbacks advisoryFullWithdrawalScreenCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvisoryFullWithdrawalContent(fullWithdrawalSummary, z, advisoryFullWithdrawalScreenCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryFullWithdrawalScreen$lambda$27(AdvisoryFullWithdrawalViewState advisoryFullWithdrawalViewState, AdvisoryFullWithdrawalScreenCallbacks advisoryFullWithdrawalScreenCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvisoryFullWithdrawalScreen(advisoryFullWithdrawalViewState, advisoryFullWithdrawalScreenCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FullWithdrawalPlaceholder$lambda$26(AdvisoryFullWithdrawalScreenCallbacks advisoryFullWithdrawalScreenCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FullWithdrawalPlaceholder(advisoryFullWithdrawalScreenCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WithdrawItem$lambda$13(FullWithdrawalSummary.Item item, Modifier modifier, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        WithdrawItem(item, modifier, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WithdrawItemBottomSheet$lambda$3(FullWithdrawalSummary.BottomSheetData bottomSheetData, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        WithdrawItemBottomSheet(bottomSheetData, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void WithdrawItemBottomSheet(final FullWithdrawalSummary.BottomSheetData bottomSheetData, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final SheetState sheetStateRememberModalBottomSheetState;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1246645265);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(bottomSheetData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1246645265, i3, -1, "com.robinhood.android.advisory.withdrawal.WithdrawItemBottomSheet (AdvisoryFullWithdrawalScreen.kt:72)");
                }
                sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AdvisoryFullWithdrawalScreenKt.WithdrawItemBottomSheet$lambda$2$lambda$1(coroutineScope, sheetStateRememberModalBottomSheetState, function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final Function0 function02 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1593615834, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt.WithdrawItemBottomSheet.1
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
                            ComposerKt.traceEventStart(-1593615834, i5, -1, "com.robinhood.android.advisory.withdrawal.WithdrawItemBottomSheet.<anonymous> (AdvisoryFullWithdrawalScreen.kt:86)");
                        }
                        final Function0<Unit> function03 = function0;
                        final SheetState sheetState = sheetStateRememberModalBottomSheetState;
                        final Modifier modifier5 = modifier4;
                        final FullWithdrawalSummary.BottomSheetData bottomSheetData2 = bottomSheetData;
                        final Function0<Unit> function04 = function02;
                        BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(568502728, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt.WithdrawItemBottomSheet.1.1
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
                                    ComposerKt.traceEventStart(568502728, i6, -1, "com.robinhood.android.advisory.withdrawal.WithdrawItemBottomSheet.<anonymous>.<anonymous> (AdvisoryFullWithdrawalScreen.kt:87)");
                                }
                                Function0<Unit> function05 = function03;
                                SheetState sheetState2 = sheetState;
                                Modifier modifier6 = modifier5;
                                final FullWithdrawalSummary.BottomSheetData bottomSheetData3 = bottomSheetData2;
                                final Function0<Unit> function06 = function04;
                                GenericActionHandlerKt.SduiModalBottomSheet(function05, sheetState2, modifier6, ComposableLambda3.rememberComposableLambda(390449692, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt.WithdrawItemBottomSheet.1.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer4, Integer num) {
                                        invoke(column5, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Column5 SduiModalBottomSheet, Composer composer4, int i7) {
                                        Intrinsics.checkNotNullParameter(SduiModalBottomSheet, "$this$SduiModalBottomSheet");
                                        if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(390449692, i7, -1, "com.robinhood.android.advisory.withdrawal.WithdrawItemBottomSheet.<anonymous>.<anonymous>.<anonymous> (AdvisoryFullWithdrawalScreen.kt:92)");
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i8 = BentoTheme.$stable;
                                        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(ScrollKt.verticalScroll$default(Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer4, i8).m21371getBg0d7_KjU(), null, 2, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), bentoTheme.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM());
                                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM());
                                        FullWithdrawalSummary.BottomSheetData bottomSheetData4 = bottomSheetData3;
                                        Function0<Unit> function07 = function06;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer4, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        String title = bottomSheetData4.getTitle();
                                        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer4, i8).getDisplayCapsuleMedium();
                                        TextAlign.Companion companion4 = TextAlign.INSTANCE;
                                        BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer4, 0, 0, 8126);
                                        BentoText2.m20747BentoText38GnDrw(bottomSheetData4.getContent(), null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16318);
                                        BentoButtonKt.m20586BentoButtonEikTQX8(function07, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer4, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composer4, 384, 0, 8184);
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryFullWithdrawalScreenKt.WithdrawItemBottomSheet$lambda$3(bottomSheetData, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            coroutineScope = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvisoryFullWithdrawalScreenKt.WithdrawItemBottomSheet$lambda$2$lambda$1(coroutineScope, sheetStateRememberModalBottomSheetState, function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                final Function0<Unit> function022 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1593615834, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt.WithdrawItemBottomSheet.1
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
                            ComposerKt.traceEventStart(-1593615834, i5, -1, "com.robinhood.android.advisory.withdrawal.WithdrawItemBottomSheet.<anonymous> (AdvisoryFullWithdrawalScreen.kt:86)");
                        }
                        final Function0<Unit> function03 = function0;
                        final SheetState sheetState = sheetStateRememberModalBottomSheetState;
                        final Modifier modifier5 = modifier4;
                        final FullWithdrawalSummary.BottomSheetData bottomSheetData2 = bottomSheetData;
                        final Function0<Unit> function04 = function022;
                        BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(568502728, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt.WithdrawItemBottomSheet.1.1
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
                                    ComposerKt.traceEventStart(568502728, i6, -1, "com.robinhood.android.advisory.withdrawal.WithdrawItemBottomSheet.<anonymous>.<anonymous> (AdvisoryFullWithdrawalScreen.kt:87)");
                                }
                                Function0<Unit> function05 = function03;
                                SheetState sheetState2 = sheetState;
                                Modifier modifier6 = modifier5;
                                final FullWithdrawalSummary.BottomSheetData bottomSheetData3 = bottomSheetData2;
                                final Function0<Unit> function06 = function04;
                                GenericActionHandlerKt.SduiModalBottomSheet(function05, sheetState2, modifier6, ComposableLambda3.rememberComposableLambda(390449692, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt.WithdrawItemBottomSheet.1.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer4, Integer num) {
                                        invoke(column5, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Column5 SduiModalBottomSheet, Composer composer4, int i7) {
                                        Intrinsics.checkNotNullParameter(SduiModalBottomSheet, "$this$SduiModalBottomSheet");
                                        if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(390449692, i7, -1, "com.robinhood.android.advisory.withdrawal.WithdrawItemBottomSheet.<anonymous>.<anonymous>.<anonymous> (AdvisoryFullWithdrawalScreen.kt:92)");
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i8 = BentoTheme.$stable;
                                        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(ScrollKt.verticalScroll$default(Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer4, i8).m21371getBg0d7_KjU(), null, 2, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), bentoTheme.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM());
                                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM());
                                        FullWithdrawalSummary.BottomSheetData bottomSheetData4 = bottomSheetData3;
                                        Function0<Unit> function07 = function06;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer4, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        String title = bottomSheetData4.getTitle();
                                        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer4, i8).getDisplayCapsuleMedium();
                                        TextAlign.Companion companion4 = TextAlign.INSTANCE;
                                        BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer4, 0, 0, 8126);
                                        BentoText2.m20747BentoText38GnDrw(bottomSheetData4.getContent(), null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16318);
                                        BentoButtonKt.m20586BentoButtonEikTQX8(function07, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer4, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composer4, 384, 0, 8184);
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WithdrawItemBottomSheet$lambda$2$lambda$1(CoroutineScope coroutineScope, SheetState sheetState, final Function0 function0) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C9513x60274632(sheetState, null), 3, null).invokeOnCompletion(new Function1() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryFullWithdrawalScreenKt.WithdrawItemBottomSheet$lambda$2$lambda$1$lambda$0(function0, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WithdrawItemBottomSheet$lambda$2$lambda$1$lambda$0(Function0 function0, Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final boolean AdvisoryFullWithdrawalContent$lambda$16(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean WithdrawItem$lambda$5(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WithdrawItem(FullWithdrawalSummary.Item item, Modifier modifier, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        final FullWithdrawalSummary.Item item2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objRememberedValue;
        Composer.Companion companion;
        Function0 function0;
        final SnapshotState snapshotState;
        AnnotatedString.Builder builder;
        int iPushStyle;
        final Modifier modifier3;
        final boolean z7;
        final boolean z8;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-632242076);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            item2 = item;
        } else if ((i & 6) == 0) {
            item2 = item;
            i3 = (composerStartRestartGroup.changed(item2) ? 4 : 2) | i;
        } else {
            item2 = item;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        z5 = i4 == 0 ? false : z3;
                        z6 = i5 == 0 ? false : z4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632242076, i3, -1, "com.robinhood.android.advisory.withdrawal.WithdrawItem (AdvisoryFullWithdrawalScreen.kt:128)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        function0 = null;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        String title = item2.getTitle();
                        builder = new AnnotatedString.Builder(0, 1, null);
                        iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, !z6 ? FontWeight.INSTANCE.getBold() : null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                        try {
                            builder.append(item2.getValue());
                            Unit unit = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                            BentoBaseRowState.Meta.SingleLine singleLine = new BentoBaseRowState.Meta.SingleLine(builder.toAnnotatedString());
                            composerStartRestartGroup.startReplaceGroup(-1994221835);
                            if (item2.getBottomSheet() != null) {
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AdvisoryFullWithdrawalScreenKt.WithdrawItem$lambda$10$lambda$9(snapshotState);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                function0 = (Function0) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifier2, null, title, null, null, singleLine, null, z5, false, false, 0L, function0, composerStartRestartGroup, ((i3 >> 3) & 14) | (BentoBaseRowState.Meta.SingleLine.$stable << 15) | ((i3 << 15) & 29360128), 0, 1882);
                            Modifier modifier4 = modifier2;
                            composerStartRestartGroup = composerStartRestartGroup;
                            if (WithdrawItem$lambda$5(snapshotState) && item2.getBottomSheet() != null) {
                                FullWithdrawalSummary.BottomSheetData bottomSheet = item2.getBottomSheet();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AdvisoryFullWithdrawalScreenKt.WithdrawItem$lambda$12$lambda$11(snapshotState);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                WithdrawItemBottomSheet(bottomSheet, (Function0) objRememberedValue2, null, composerStartRestartGroup, 48, 4);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z7 = z5;
                            z8 = z6;
                        } catch (Throwable th) {
                            builder.pop(iPushStyle);
                            throw th;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z7 = z3;
                        z8 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AdvisoryFullWithdrawalScreenKt.WithdrawItem$lambda$13(item2, modifier3, z7, z8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                z4 = z2;
                if ((i3 & 1171) == 1170) {
                    if (i6 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    function0 = null;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    String title2 = item2.getTitle();
                    builder = new AnnotatedString.Builder(0, 1, null);
                    iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, !z6 ? FontWeight.INSTANCE.getBold() : null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                    builder.append(item2.getValue());
                    Unit unit2 = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    BentoBaseRowState.Meta.SingleLine singleLine2 = new BentoBaseRowState.Meta.SingleLine(builder.toAnnotatedString());
                    composerStartRestartGroup.startReplaceGroup(-1994221835);
                    if (item2.getBottomSheet() != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifier2, null, title2, null, null, singleLine2, null, z5, false, false, 0L, function0, composerStartRestartGroup, ((i3 >> 3) & 14) | (BentoBaseRowState.Meta.SingleLine.$stable << 15) | ((i3 << 15) & 29360128), 0, 1882);
                    Modifier modifier42 = modifier2;
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (WithdrawItem$lambda$5(snapshotState)) {
                        FullWithdrawalSummary.BottomSheetData bottomSheet2 = item2.getBottomSheet();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        WithdrawItemBottomSheet(bottomSheet2, (Function0) objRememberedValue2, null, composerStartRestartGroup, 48, 4);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    z7 = z5;
                    z8 = z6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            z4 = z2;
            if ((i3 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z4 = z2;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void WithdrawItem$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WithdrawItem$lambda$10$lambda$9(SnapshotState snapshotState) {
        WithdrawItem$lambda$6(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WithdrawItem$lambda$12$lambda$11(SnapshotState snapshotState) {
        WithdrawItem$lambda$6(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisoryFullWithdrawalContent(final FullWithdrawalSummary fullWithdrawalSummary, final boolean z, AdvisoryFullWithdrawalScreenCallbacks advisoryFullWithdrawalScreenCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Modifier modifier3;
        Composer composer2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        float f;
        boolean z2;
        Object objRememberedValue3;
        Composer composer3;
        AdvisoryFullWithdrawalScreenCallbacks advisoryFullWithdrawalScreenCallbacks2;
        boolean z3;
        Object objRememberedValue4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-11266785);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(fullWithdrawalSummary) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(advisoryFullWithdrawalScreenCallbacks) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    advisoryFullWithdrawalScreenCallbacks2 = advisoryFullWithdrawalScreenCallbacks;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-11266785, i3, -1, "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalContent (AdvisoryFullWithdrawalScreen.kt:170)");
                    }
                    final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(AdvisoryFullWithdrawalScreenKt.AdvisoryFullWithdrawalContent$lambda$15$lambda$14(lazyListStateRememberLazyListState));
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierWeight$default = Column5.weight$default(column6, companion4, 1.0f, false, 2, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = androidx.compose.foundation.layout.PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 1, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(fullWithdrawalSummary);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AdvisoryFullWithdrawalScreenKt.AdvisoryFullWithdrawalContent$lambda$23$lambda$19$lambda$18(fullWithdrawalSummary, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i6 = i3;
                    modifier3 = modifier4;
                    LazyDslKt.LazyColumn(modifierWeight$default, null, paddingValuesM5137PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 506);
                    composer2 = composerStartRestartGroup;
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer2, i5).m21373getBg30d7_KjU(), !AdvisoryFullWithdrawalContent$lambda$16(snapshotState4) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composer2, 0, 5);
                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion4, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM());
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM()), companion2.getStart(), composer2, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.useNode();
                    } else {
                        composer2.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    composer2.startReplaceGroup(233120576);
                    if (StringsKt.isBlank(fullWithdrawalSummary.getDisclosure())) {
                        String disclosure = fullWithdrawalSummary.getDisclosure();
                        int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), 7, null);
                        TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7919getCentere0LSkKk);
                        f = 0.0f;
                        BentoText2.m20747BentoText38GnDrw(disclosure, modifierM5146paddingqDBjuR0$default, null, null, null, null, textAlignM7912boximpl, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16316);
                        composer2 = composer2;
                    } else {
                        f = 0.0f;
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    int i7 = i6 & 896;
                    z2 = i7 != 256;
                    objRememberedValue3 = composer2.rememberedValue();
                    if (!z2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new C9507xa8d32df(advisoryFullWithdrawalScreenCallbacks);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    composer3 = composer2;
                    advisoryFullWithdrawalScreenCallbacks2 = advisoryFullWithdrawalScreenCallbacks;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue3), StringResources_androidKt.stringResource(C9517R.string.withdraw_and_close_account_cta, composer2, 0), SizeKt.fillMaxWidth$default(companion4, f, 1, null), null, BentoButtons.Type.Primary, false, z, null, null, null, null, false, null, composer3, ((i6 << 15) & 3670016) | 24960, 0, 8104);
                    composer3.startReplaceGroup(5004770);
                    z3 = i7 != 256;
                    objRememberedValue4 = composer3.rememberedValue();
                    if (!z3 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new C9508xa8d36a0(advisoryFullWithdrawalScreenCallbacks2);
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    composer3.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue4), StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composer3, 0), SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer3, 24960, 0, 8168);
                    composerStartRestartGroup = composer3;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final AdvisoryFullWithdrawalScreenCallbacks advisoryFullWithdrawalScreenCallbacks3 = advisoryFullWithdrawalScreenCallbacks2;
                    final Modifier modifier5 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AdvisoryFullWithdrawalScreenKt.AdvisoryFullWithdrawalContent$lambda$24(fullWithdrawalSummary, z, advisoryFullWithdrawalScreenCallbacks3, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    Modifier modifierWeight$default2 = Column5.weight$default(column62, companion42, 1.0f, false, 2, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default2 = androidx.compose.foundation.layout.PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 1, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(fullWithdrawalSummary);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AdvisoryFullWithdrawalScreenKt.AdvisoryFullWithdrawalContent$lambda$23$lambda$19$lambda$18(fullWithdrawalSummary, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        int i62 = i3;
                        modifier3 = modifier4;
                        LazyDslKt.LazyColumn(modifierWeight$default2, null, paddingValuesM5137PaddingValuesYgX7TsA$default2, false, null, null, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 506);
                        composer2 = composerStartRestartGroup;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composer2, i52).m21373getBg30d7_KjU(), !AdvisoryFullWithdrawalContent$lambda$16(snapshotState42) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composer2, 0, 5);
                        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs2 = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion42, bentoTheme2.getSpacing(composer2, i52).m21590getDefaultD9Ej5fM());
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer2, i52).m21593getSmallD9Ej5fM()), companion22.getStart(), composer2, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierM21618defaultFillMaxWidthPadding3ABfNKs2);
                        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                            composer2.startReplaceGroup(233120576);
                            if (StringsKt.isBlank(fullWithdrawalSummary.getDisclosure())) {
                            }
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(5004770);
                            int i72 = i62 & 896;
                            if (i72 != 256) {
                            }
                            objRememberedValue3 = composer2.rememberedValue();
                            if (!z2) {
                                objRememberedValue3 = new C9507xa8d32df(advisoryFullWithdrawalScreenCallbacks);
                                composer2.updateRememberedValue(objRememberedValue3);
                                composer2.endReplaceGroup();
                                composer3 = composer2;
                                advisoryFullWithdrawalScreenCallbacks2 = advisoryFullWithdrawalScreenCallbacks;
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue3), StringResources_androidKt.stringResource(C9517R.string.withdraw_and_close_account_cta, composer2, 0), SizeKt.fillMaxWidth$default(companion42, f, 1, null), null, BentoButtons.Type.Primary, false, z, null, null, null, null, false, null, composer3, ((i62 << 15) & 3670016) | 24960, 0, 8104);
                                composer3.startReplaceGroup(5004770);
                                if (i72 != 256) {
                                }
                                objRememberedValue4 = composer3.rememberedValue();
                                if (!z3) {
                                    objRememberedValue4 = new C9508xa8d36a0(advisoryFullWithdrawalScreenCallbacks2);
                                    composer3.updateRememberedValue(objRememberedValue4);
                                    composer3.endReplaceGroup();
                                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue4), StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composer3, 0), SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer3, 24960, 0, 8168);
                                    composerStartRestartGroup = composer3;
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AdvisoryFullWithdrawalContent$lambda$15$lambda$14(LazyListState lazyListState) {
        return !TopBarScrollState3.isScrolledToTheEnd(lazyListState) && TopBarScrollState3.getCanBeScrolled(lazyListState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryFullWithdrawalContent$lambda$23$lambda$19$lambda$18(final FullWithdrawalSummary fullWithdrawalSummary, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1830878540, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$AdvisoryFullWithdrawalContent$1$1$1$1
            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1830878540, i, -1, "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryFullWithdrawalScreen.kt:188)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
                FullWithdrawalSummary fullWithdrawalSummary2 = fullWithdrawalSummary;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default);
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
                BentoText2.m20747BentoText38GnDrw(fullWithdrawalSummary2.getTitle(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 48, 0, 8188);
                BentoText2.m20747BentoText38GnDrw(fullWithdrawalSummary2.getSubtitle(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 48, 0, 16380);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }
        }), 3, null);
        final List<FullWithdrawalSummary.Item> breakdown = fullWithdrawalSummary.getBreakdown();
        LazyColumn.items(breakdown.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$AdvisoryFullWithdrawalContent$lambda$23$lambda$19$lambda$18$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                breakdown.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$AdvisoryFullWithdrawalContent$lambda$23$lambda$19$lambda$18$$inlined$itemsIndexed$default$3
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
                FullWithdrawalSummary.Item item = (FullWithdrawalSummary.Item) breakdown.get(i);
                composer.startReplaceGroup(1522786961);
                AdvisoryFullWithdrawalScreenKt.WithdrawItem(item, null, i == fullWithdrawalSummary.getBreakdown().size() - 1, false, composer, 0, 10);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (fullWithdrawalSummary.getAmountReceived() != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(10600505, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$AdvisoryFullWithdrawalContent$1$1$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(10600505, i, -1, "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryFullWithdrawalScreen.kt:214)");
                    }
                    AdvisoryFullWithdrawalScreenKt.WithdrawItem(fullWithdrawalSummary.getAmountReceived(), null, false, true, composer, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078 A[LOOP:0: B:37:0x0076->B:38:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FullWithdrawalPlaceholder(final AdvisoryFullWithdrawalScreenCallbacks advisoryFullWithdrawalScreenCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1614075586);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(advisoryFullWithdrawalScreenCallbacks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1614075586, i3, -1, "com.robinhood.android.advisory.withdrawal.FullWithdrawalPlaceholder (AdvisoryFullWithdrawalScreen.kt:264)");
                }
                FullWithdrawalSummary.Item item = new FullWithdrawalSummary.Item("---- ---------- ----", "--------", null);
                ArrayList arrayList = new ArrayList(2);
                for (i4 = 0; i4 < 2; i4++) {
                    arrayList.add(item);
                }
                int i6 = i3 << 6;
                modifier3 = modifier4;
                AdvisoryFullWithdrawalContent(new FullWithdrawalSummary("-------------- ---- ------ ----- ---------- -----", "------------ ----------- ------------- -------------------- ------------ ------ -------- ----", arrayList, item, "---------------------- ------------------ -------------------- ------------------ ---------"), false, advisoryFullWithdrawalScreenCallbacks, modifier3, composerStartRestartGroup, (i6 & 7168) | (i6 & 896) | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryFullWithdrawalScreenKt.FullWithdrawalPlaceholder$lambda$26(advisoryFullWithdrawalScreenCallbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            FullWithdrawalSummary.Item item2 = new FullWithdrawalSummary.Item("---- ---------- ----", "--------", null);
            ArrayList arrayList2 = new ArrayList(2);
            while (i4 < 2) {
            }
            int i62 = i3 << 6;
            modifier3 = modifier4;
            AdvisoryFullWithdrawalContent(new FullWithdrawalSummary("-------------- ---- ------ ----- ---------- -----", "------------ ----------- ------------- -------------------- ------------ ------ -------- ----", arrayList2, item2, "---------------------- ------------------ -------------------- ------------------ ---------"), false, advisoryFullWithdrawalScreenCallbacks, modifier3, composerStartRestartGroup, (i62 & 7168) | (i62 & 896) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void AdvisoryFullWithdrawalScreen(final AdvisoryFullWithdrawalViewState state, final AdvisoryFullWithdrawalScreenCallbacks callbacks, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1940128325);
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
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
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
                ComposerKt.traceEventStart(1940128325, i3, -1, "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreen (AdvisoryFullWithdrawalScreen.kt:290)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1804555472, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt.AdvisoryFullWithdrawalScreen.1
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
                        ComposerKt.traceEventStart(1804555472, i5, -1, "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreen.<anonymous> (AdvisoryFullWithdrawalScreen.kt:292)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                    Modifier modifier2 = modifier;
                    final AdvisoryFullWithdrawalScreenCallbacks advisoryFullWithdrawalScreenCallbacks = callbacks;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-437269868, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt.AdvisoryFullWithdrawalScreen.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-437269868, i7, -1, "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreen.<anonymous>.<anonymous> (AdvisoryFullWithdrawalScreen.kt:297)");
                            }
                            Function2<Composer, Integer, Unit> function2M1737xb4fec220 = ComposableSingletons$AdvisoryFullWithdrawalScreenKt.INSTANCE.m1737xb4fec220();
                            final AdvisoryFullWithdrawalScreenCallbacks advisoryFullWithdrawalScreenCallbacks2 = advisoryFullWithdrawalScreenCallbacks;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M1737xb4fec220, null, ComposableLambda3.rememberComposableLambda(-1919961707, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt.AdvisoryFullWithdrawalScreen.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i8 & 6) == 0) {
                                        i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1919961707, i8, -1, "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreen.<anonymous>.<anonymous>.<anonymous> (AdvisoryFullWithdrawalScreen.kt:300)");
                                    }
                                    AdvisoryFullWithdrawalScreenCallbacks advisoryFullWithdrawalScreenCallbacks3 = advisoryFullWithdrawalScreenCallbacks2;
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChanged = composer4.changed(advisoryFullWithdrawalScreenCallbacks3);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new C9510x3a4d749c(advisoryFullWithdrawalScreenCallbacks3);
                                        composer4.updateRememberedValue(objRememberedValue);
                                    }
                                    composer4.endReplaceGroup();
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue), composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final AdvisoryFullWithdrawalViewState advisoryFullWithdrawalViewState = state;
                    final AdvisoryFullWithdrawalScreenCallbacks advisoryFullWithdrawalScreenCallbacks2 = callbacks;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(1661349919, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt.AdvisoryFullWithdrawalScreen.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final PaddingValues paddingValues, Composer composer3, int i7) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i7 & 6) == 0) {
                                i7 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1661349919, i7, -1, "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreen.<anonymous>.<anonymous> (AdvisoryFullWithdrawalScreen.kt:307)");
                            }
                            final AdvisoryFullWithdrawalViewState advisoryFullWithdrawalViewState2 = advisoryFullWithdrawalViewState;
                            final AdvisoryFullWithdrawalScreenCallbacks advisoryFullWithdrawalScreenCallbacks3 = advisoryFullWithdrawalScreenCallbacks2;
                            LocalShowPlaceholder.Loadable(advisoryFullWithdrawalViewState2 instanceof AdvisoryFullWithdrawalViewState.Loading, null, null, ComposableLambda3.rememberComposableLambda(842529935, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt.AdvisoryFullWithdrawalScreen.1.2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i8) {
                                    if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(842529935, i8, -1, "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreen.<anonymous>.<anonymous>.<anonymous> (AdvisoryFullWithdrawalScreen.kt:310)");
                                    }
                                    AdvisoryFullWithdrawalViewState advisoryFullWithdrawalViewState3 = advisoryFullWithdrawalViewState2;
                                    if (advisoryFullWithdrawalViewState3 instanceof AdvisoryFullWithdrawalViewState.Loaded) {
                                        composer4.startReplaceGroup(20523488);
                                        AdvisoryFullWithdrawalScreenKt.AdvisoryFullWithdrawalContent(((AdvisoryFullWithdrawalViewState.Loaded) advisoryFullWithdrawalViewState2).getSummary(), ((AdvisoryFullWithdrawalViewState.Loaded) advisoryFullWithdrawalViewState2).getSubmitting(), advisoryFullWithdrawalScreenCallbacks3, androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                        composer4.endReplaceGroup();
                                    } else if (Intrinsics.areEqual(advisoryFullWithdrawalViewState3, AdvisoryFullWithdrawalViewState.InitializationError.INSTANCE)) {
                                        composer4.startReplaceGroup(20936160);
                                        Modifier modifierTestTag = TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), AdvisoryFullWithdrawalScreenKt.FullWithdrawalErrorTag);
                                        AdvisoryFullWithdrawalScreenCallbacks advisoryFullWithdrawalScreenCallbacks4 = advisoryFullWithdrawalScreenCallbacks3;
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChanged = composer4.changed(advisoryFullWithdrawalScreenCallbacks4);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new C9511x6f33afdd(advisoryFullWithdrawalScreenCallbacks4);
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        composer4.endReplaceGroup();
                                        ErrorScreenComposable.ErrorScreenComposable(modifierTestTag, (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composer4, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                        composer4.endReplaceGroup();
                                    } else {
                                        if (!Intrinsics.areEqual(advisoryFullWithdrawalViewState3, AdvisoryFullWithdrawalViewState.Loading.INSTANCE)) {
                                            composer4.startReplaceGroup(-2077549692);
                                            composer4.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer4.startReplaceGroup(21333332);
                                        AdvisoryFullWithdrawalScreenKt.FullWithdrawalPlaceholder(advisoryFullWithdrawalScreenCallbacks3, androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                        composer4.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306416, 316);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryFullWithdrawalScreenKt.AdvisoryFullWithdrawalScreen$lambda$27(state, callbacks, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

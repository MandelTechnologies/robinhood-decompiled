package com.truelayer.payments.p419ui.screens.confirmation.mandate;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.Divider5;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheet_androidKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.core.domain.payments.Beneficiary;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.EncircledProviderImage4;
import com.truelayer.payments.p419ui.components.ModalBottomSheetKt;
import com.truelayer.payments.p419ui.screens.confirmation.MandateConfirmationViewData;
import com.truelayer.payments.p419ui.theme.ModifiersKt;
import com.truelayer.payments.p419ui.theme.Spacing;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.datetime.Converters4;
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.format.FormatStyle;

/* compiled from: MandateDetailsDialog.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\u001a\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¨\u0006\u0011"}, m3636d2 = {"MandateDetailsDialog", "", "viewData", "Lcom/truelayer/payments/ui/screens/confirmation/MandateConfirmationViewData;", "onDismissRequest", "Lkotlin/Function0;", "(Lcom/truelayer/payments/ui/screens/confirmation/MandateConfirmationViewData;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "MandateDetailsDialogContent", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lcom/truelayer/payments/ui/screens/confirmation/MandateConfirmationViewData;Landroidx/compose/runtime/Composer;II)V", "MandateDetailsViewDialogFooter", "(Lcom/truelayer/payments/ui/screens/confirmation/MandateConfirmationViewData;Landroidx/compose/runtime/Composer;I)V", "MandateDetailsViewDialogHeader", "formatSortCode", "", "sortCode", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsDialogKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class MandateDetailsDialog {
    public static final void MandateDetailsDialog(final MandateConfirmationViewData viewData, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        Composer composerStartRestartGroup = composer.startRestartGroup(1880774793);
        if ((i2 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsDialogKt.MandateDetailsDialog.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        final Function0<Unit> function02 = function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880774793, i, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsDialog (MandateDetailsDialog.kt:41)");
        }
        ModalBottomSheetKt.ModalBottomSheet(null, function02, ModalBottomSheet_androidKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2), ComposableLambda3.composableLambda(composerStartRestartGroup, -2049335200, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsDialogKt.MandateDetailsDialog.2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2049335200, i3, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsDialog.<anonymous> (MandateDetailsDialog.kt:47)");
                    }
                    MandateDetailsDialog.MandateDetailsDialogContent(PaddingKt.m5144paddingVpY3zN4$default(WindowInsetsPadding6.windowInsetsPadding(Modifier.INSTANCE, WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer2, 8)), Spacing.INSTANCE.m27174getLARGED9Ej5fM(), 0.0f, 2, null), viewData, composer2, 64, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, (i & 112) | 3072, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsDialogKt.MandateDetailsDialog.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    MandateDetailsDialog.MandateDetailsDialog(viewData, function02, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void MandateDetailsDialogContent(Modifier modifier, final MandateConfirmationViewData viewData, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        Composer composerStartRestartGroup = composer.startRestartGroup(2080485491);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2080485491, i, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsDialogContent (MandateDetailsDialog.kt:60)");
        }
        final List<String> listBuildMandateLimitsList = MandateHelpers.buildMandateLimitsList(viewData.getCurrency(), viewData.getMandate(), composerStartRestartGroup, 72);
        Modifier modifierVerticalScroll$default = ModifiersKt.verticalScroll$default(modifier2, null, false, null, false, 15, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Column6 column6 = Column6.INSTANCE;
        MandateDetailsViewDialogHeader(viewData, composerStartRestartGroup, 8);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Spacing spacing = Spacing.INSTANCE;
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, spacing.m27174getLARGED9Ej5fM()), composerStartRestartGroup, 6);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i3 = MaterialTheme.$stable;
        final Modifier modifier3 = modifier2;
        SurfaceKt.m5967SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), materialTheme.getShapes(composerStartRestartGroup, i3).getExtraSmall(), materialTheme.getColorScheme(composerStartRestartGroup, i3).getSurfaceVariant(), 0L, 0.0f, 0.0f, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1102278012, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsDialogKt$MandateDetailsDialogContent$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1102278012, i4, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsDialogContent.<anonymous>.<anonymous> (MandateDetailsDialog.kt:75)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Spacing spacing2 = Spacing.INSTANCE;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, spacing2.m27174getLARGED9Ej5fM(), 0.0f, 2, null), 0.0f, spacing2.m27174getLARGED9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MandateConfirmationViewData mandateConfirmationViewData = viewData;
                    List<String> list = listBuildMandateLimitsList;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM5146paddingqDBjuR0$default);
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Column6 column62 = Column6.INSTANCE;
                    int i5 = 1;
                    TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.mandate_details_can_collect_maximum_of, new Object[]{mandateConfirmationViewData.getMerchantName()}, composer2, 64), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge(), composer2, 0, 0, 65534);
                    Composer composer3 = composer2;
                    composer3.startReplaceableGroup(-452813302);
                    for (String str : list) {
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Spacing.INSTANCE.m27177getREGULARD9Ej5fM(), i5, null);
                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                        int i6 = MaterialTheme.$stable;
                        TextKt.m6028Text4IGK_g(str, modifierM5144paddingVpY3zN4$default, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i6).getBodyMedium(), composer2, 48, 0, 65532);
                        composer2.startReplaceableGroup(1451083330);
                        if (!Intrinsics.areEqual(CollectionsKt.last((List) list), str)) {
                            Divider5.m5851HorizontalDivider9IZ8Weo(null, 0.0f, Color.m6705copywmQWz5c$default(materialTheme2.getColorScheme(composer2, i6).getOnSurface(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 0, 3);
                        }
                        composer2.endReplaceableGroup();
                        composer3 = composer2;
                        i5 = 1;
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12582918, 120);
        MandateDetailsViewDialogFooter(viewData, composerStartRestartGroup, 8);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, spacing.m27180getXXLARGED9Ej5fM()), composerStartRestartGroup, 6);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsDialogKt.MandateDetailsDialogContent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    MandateDetailsDialog.MandateDetailsDialogContent(modifier3, viewData, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MandateDetailsViewDialogFooter(final MandateConfirmationViewData mandateConfirmationViewData, Composer composer, final int i) {
        Instant javaInstant;
        Instant javaInstant2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1619864683);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1619864683, i, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewDialogFooter (MandateDetailsDialog.kt:107)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, Spacing.INSTANCE.m27177getREGULARD9Ej5fM()), composerStartRestartGroup, 6);
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withZone(ZoneId.systemDefault());
        kotlinx.datetime.Instant validFrom = mandateConfirmationViewData.getMandate().getValidFrom();
        String strStringResource = (validFrom == null || (javaInstant2 = Converters4.toJavaInstant(validFrom)) == null) ? null : dateTimeFormatterWithZone.format(javaInstant2);
        kotlinx.datetime.Instant validTo = mandateConfirmationViewData.getMandate().getValidTo();
        String strStringResource2 = (validTo == null || (javaInstant = Converters4.toJavaInstant(validTo)) == null) ? null : dateTimeFormatterWithZone.format(javaInstant);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        int i2 = C42830R.string.mandate_valid_from_until;
        composerStartRestartGroup.startReplaceableGroup(-1814937352);
        if (strStringResource == null) {
            strStringResource = StringResources_androidKt.stringResource(C42830R.string.mandate_start_from_today, composerStartRestartGroup, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1814937271);
        if (strStringResource2 == null) {
            strStringResource2 = StringResources_androidKt.stringResource(C42830R.string.mandate_up_until_cancelled, composerStartRestartGroup, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(i2, new Object[]{strStringResource, strStringResource2}, composerStartRestartGroup, 64), modifierFillMaxWidth$default, 0L, 0L, null, null, null, 0L, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), composerStartRestartGroup, 48, 0, 65020);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsDialogKt.MandateDetailsViewDialogFooter.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    MandateDetailsDialog.MandateDetailsViewDialogFooter(mandateConfirmationViewData, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final String formatSortCode(String sortCode) {
        Intrinsics.checkNotNullParameter(sortCode, "sortCode");
        return sortCode.length() == 6 ? CollectionsKt.joinToString$default(StringsKt.chunked(sortCode, 2), "-", null, null, 0, null, null, 62, null) : sortCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MandateDetailsViewDialogHeader(final MandateConfirmationViewData mandateConfirmationViewData, Composer composer, final int i) {
        String str;
        String iban;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String accountHolderName;
        String paymentReference;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1758761699);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1758761699, i, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewDialogHeader (MandateDetailsDialog.kt:135)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        Arrangement arrangement = Arrangement.INSTANCE;
        Spacing spacing = Spacing.INSTANCE;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(spacing.m27178getSMALLD9Ej5fM());
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
        if (composerStartRestartGroup.getApplier() == null) {
            Composables.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Column6 column6 = Column6.INSTANCE;
        Beneficiary beneficiary = mandateConfirmationViewData.getBeneficiary();
        if (!(beneficiary instanceof Beneficiary.ExternalAccount) && !(beneficiary instanceof Beneficiary.MerchantAccount)) {
            throw new NoWhenBranchMatchedException();
        }
        Beneficiary.AccountIdentifier accountIdentifier = beneficiary.getAccountIdentifier();
        if (accountIdentifier instanceof Beneficiary.AccountIdentifier.SortCodeAccountNumber) {
            Beneficiary.AccountIdentifier.SortCodeAccountNumber sortCodeAccountNumber = (Beneficiary.AccountIdentifier.SortCodeAccountNumber) accountIdentifier;
            iban = formatSortCode(sortCodeAccountNumber.getSortCode()) + " • " + sortCodeAccountNumber.getAccountNumber();
        } else {
            if (!(accountIdentifier instanceof Beneficiary.AccountIdentifier.Iban)) {
                if (accountIdentifier != null) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement.m5089spacedBy0680j_4(spacing.m27178getSMALLD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, centerVertically, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                Row6 row6 = Row6.INSTANCE;
                EncircledProviderImage4.m27039EncircledProviderImageRfXq3Jk(null, C2002Dp.m7995constructorimpl(32), mandateConfirmationViewData.getProviderExtendedIconUrl(), mandateConfirmationViewData.getProviderIconUrl(), null, null, composerStartRestartGroup, 48, 49);
                accountHolderName = mandateConfirmationViewData.getBeneficiary().getAccountHolderName();
                if (accountHolderName == null) {
                    accountHolderName = "";
                }
                String str2 = accountHolderName;
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i2 = MaterialTheme.$stable;
                TextKt.m6028Text4IGK_g(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i2).getTitleMedium(), composerStartRestartGroup, 0, 0, 65534);
                Composer composer3 = composerStartRestartGroup;
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.startReplaceableGroup(949583055);
                if (str != null) {
                    TextKt.m6028Text4IGK_g(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i2).getBodyLarge(), composer3, 0, 0, 65534);
                    composer3 = composer3;
                }
                composer3.endReplaceableGroup();
                paymentReference = mandateConfirmationViewData.getPaymentReference();
                composer3.startReplaceableGroup(-339625257);
                if (paymentReference != null) {
                    composer2 = composer3;
                } else {
                    composer2 = composer3;
                    TextKt.m6028Text4IGK_g(paymentReference, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i2).getBodyLarge(), composer2, 0, 0, 65534);
                }
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsDialogKt.MandateDetailsViewDialogHeader.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i3) {
                            MandateDetailsDialog.MandateDetailsViewDialogHeader(mandateConfirmationViewData, composer4, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                        }
                    });
                    return;
                }
                return;
            }
            iban = ((Beneficiary.AccountIdentifier.Iban) accountIdentifier).getIban();
        }
        str = iban;
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_422 = arrangement.m5089spacedBy0680j_4(spacing.m27178getSMALLD9Ej5fM());
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_422, centerVertically2, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion);
        if (composerStartRestartGroup.getApplier() == null) {
        }
        composerStartRestartGroup.startReusableNode();
        if (!composerStartRestartGroup.getInserting()) {
        }
        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion3.getSetResolvedCompositionLocals());
        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (!composerM6388constructorimpl.getInserting()) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf22.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Row6 row62 = Row6.INSTANCE;
        EncircledProviderImage4.m27039EncircledProviderImageRfXq3Jk(null, C2002Dp.m7995constructorimpl(32), mandateConfirmationViewData.getProviderExtendedIconUrl(), mandateConfirmationViewData.getProviderIconUrl(), null, null, composerStartRestartGroup, 48, 49);
        accountHolderName = mandateConfirmationViewData.getBeneficiary().getAccountHolderName();
        if (accountHolderName == null) {
        }
        String str22 = accountHolderName;
        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
        int i22 = MaterialTheme.$stable;
        TextKt.m6028Text4IGK_g(str22, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composerStartRestartGroup, i22).getTitleMedium(), composerStartRestartGroup, 0, 0, 65534);
        Composer composer32 = composerStartRestartGroup;
        composer32.endReplaceableGroup();
        composer32.endNode();
        composer32.endReplaceableGroup();
        composer32.endReplaceableGroup();
        composer32.startReplaceableGroup(949583055);
        if (str != null) {
        }
        composer32.endReplaceableGroup();
        paymentReference = mandateConfirmationViewData.getPaymentReference();
        composer32.startReplaceableGroup(-339625257);
        if (paymentReference != null) {
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}

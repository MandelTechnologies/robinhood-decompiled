package com.truelayer.payments.p419ui.screens.providerselection.components;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.Bolt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.window.DialogProperties;
import androidx.compose.p011ui.window.SecureFlagPolicy;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.EncircledProviderImage4;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.truelayer.payments.p419ui.theme.Theme5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SaveAccountDetailsDialog.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"SaveAccountDetailsDialog", "", "viewData", "Lcom/truelayer/payments/ui/screens/providerselection/components/SaveAccountDetailsDialogViewData;", "onAccept", "Lkotlin/Function0;", "onDecline", "(Lcom/truelayer/payments/ui/screens/providerselection/components/SaveAccountDetailsDialogViewData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "providerImageUrl", "", "providerExtendedImageUrl", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/common/Currency;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SaveAccountDetailsDialogPreview", "(Landroidx/compose/runtime/Composer;I)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialogKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SaveAccountDetailsDialog6 {
    public static final void SaveAccountDetailsDialog(final SaveAccountDetailsDialogViewData viewData, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1826817770);
        if ((i2 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialogKt.SaveAccountDetailsDialog.1
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
        final Function0<Unit> function03 = function0;
        if ((i2 & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialogKt.SaveAccountDetailsDialog.2
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
        final Function0<Unit> function04 = function02;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1826817770, i, -1, "com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialog (SaveAccountDetailsDialog.kt:42)");
        }
        int i3 = i << 6;
        SaveAccountDetailsDialog(viewData.getProviderImageUrl(), viewData.getProviderExtendedImageUrl(), viewData.getCurrency(), function03, function04, composerStartRestartGroup, (i3 & 7168) | 512 | (i3 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialogKt.SaveAccountDetailsDialog.3
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
                    SaveAccountDetailsDialog6.SaveAccountDetailsDialog(viewData, function03, function04, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void SaveAccountDetailsDialog(final String providerImageUrl, final String str, final Currency currency, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(providerImageUrl, "providerImageUrl");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Composer composerStartRestartGroup = composer.startRestartGroup(-397934962);
        final Function0<Unit> function03 = (i2 & 8) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialogKt.SaveAccountDetailsDialog.4
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        final Function0<Unit> function04 = (i2 & 16) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialogKt.SaveAccountDetailsDialog.5
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function02;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-397934962, i, -1, "com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialog (SaveAccountDetailsDialog.kt:57)");
        }
        AndroidAlertDialog_androidKt.m5698AlertDialogOix01E0(function04, ComposableLambda3.composableLambda(composerStartRestartGroup, 397408982, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialogKt.SaveAccountDetailsDialog.6
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
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(397408982, i3, -1, "com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialog.<anonymous> (SaveAccountDetailsDialog.kt:102)");
                    }
                    ButtonKt.TextButton(function03, null, false, null, null, null, null, null, null, SaveAccountDetailsDialog.INSTANCE.m27119getLambda1$payments_ui_release(), composer2, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1883712936, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialogKt.SaveAccountDetailsDialog.7
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
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1883712936, i3, -1, "com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialog.<anonymous> (SaveAccountDetailsDialog.kt:107)");
                    }
                    ButtonKt.TextButton(function04, null, false, null, null, null, null, null, null, SaveAccountDetailsDialog.INSTANCE.m27120getLambda2$payments_ui_release(), composer2, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), ComposableLambda3.composableLambda(composerStartRestartGroup, -876790247, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialogKt.SaveAccountDetailsDialog.8
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
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-876790247, i3, -1, "com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialog.<anonymous> (SaveAccountDetailsDialog.kt:60)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(46));
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment bottomEnd = companion2.getBottomEnd();
                    String str2 = str;
                    String str3 = providerImageUrl;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomEnd, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5169size3ABfNKs);
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, C2002Dp.m7995constructorimpl(3));
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM5142padding3ABfNKs);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    EncircledProviderImage4.m27039EncircledProviderImageRfXq3Jk(null, C2002Dp.m7995constructorimpl(40), str2, str3, null, null, composer2, 48, 49);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(20));
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    IconKt.m5872Iconww6aTOc(Bolt.getBolt(Icons.Filled.INSTANCE), (String) null, PaddingKt.m5142padding3ABfNKs(Background3.m4871backgroundbw27NRU(modifierM5169size3ABfNKs2, materialTheme.getColorScheme(composer2, i4).getSecondaryContainer(), RoundedCornerShape2.getCircleShape()), C2002Dp.m7995constructorimpl(1)), materialTheme.getColorScheme(composer2, i4).getPrimary(), composer2, 48, 0);
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
        }), SaveAccountDetailsDialog.INSTANCE.m27121getLambda3$payments_ui_release(), ComposableLambda3.composableLambda(composerStartRestartGroup, 1137055131, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialogKt.SaveAccountDetailsDialog.9
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                String strStringResource;
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1137055131, i3, -1, "com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialog.<anonymous> (SaveAccountDetailsDialog.kt:90)");
                    }
                    Currency currency2 = currency;
                    composer2.startReplaceableGroup(-483455358);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Column6 column6 = Column6.INSTANCE;
                    TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.save_account_details_dialog_message_paragraph_1, composer2, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, Spacing.INSTANCE.m27177getREGULARD9Ej5fM()), composer2, 6);
                    Currency.Defaults defaults = Currency.Defaults.INSTANCE;
                    if (Intrinsics.areEqual(currency2, defaults.getGBP())) {
                        composer2.startReplaceableGroup(494850623);
                        strStringResource = StringResources_androidKt.stringResource(C42830R.string.save_account_details_dialog_message_paragraph_2_gbp, composer2, 0);
                        composer2.endReplaceableGroup();
                    } else if (Intrinsics.areEqual(currency2, defaults.getEUR())) {
                        composer2.startReplaceableGroup(494850750);
                        strStringResource = StringResources_androidKt.stringResource(C42830R.string.save_account_details_dialog_message_paragraph_2_eur, composer2, 0);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(494850860);
                        strStringResource = StringResources_androidKt.stringResource(C42830R.string.save_account_details_dialog_message_paragraph_2_eur, composer2, 0);
                        composer2.endReplaceableGroup();
                    }
                    TextKt.m6028Text4IGK_g(strStringResource, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
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
        }), null, 0L, 0L, 0L, 0L, 0.0f, new DialogProperties(false, false, (SecureFlagPolicy) null, 4, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i >> 12) & 14) | 1797168, 3072, 8068);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialogKt.SaveAccountDetailsDialog.10
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
                    SaveAccountDetailsDialog6.SaveAccountDetailsDialog(providerImageUrl, str, currency, function03, function04, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void SaveAccountDetailsDialogPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(340376303);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(340376303, i, -1, "com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialogPreview (SaveAccountDetailsDialog.kt:127)");
            }
            Theme5.Theme(null, false, null, SaveAccountDetailsDialog.INSTANCE.m27122getLambda4$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.SaveAccountDetailsDialogKt.SaveAccountDetailsDialogPreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    SaveAccountDetailsDialog6.SaveAccountDetailsDialogPreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

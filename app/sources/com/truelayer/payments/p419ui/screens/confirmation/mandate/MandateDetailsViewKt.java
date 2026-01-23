package com.truelayer.payments.p419ui.screens.confirmation.mandate;

import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialTheme2;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.OutlinedButton3;
import com.truelayer.payments.p419ui.components.ResponsiveContainer;
import com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData;
import com.truelayer.payments.p419ui.screens.confirmation.MandateConfirmationViewData;
import com.truelayer.payments.p419ui.screens.confirmation.components.ProviderToMerchantIcons3;
import com.truelayer.payments.p419ui.screens.confirmation.components.TextWithIcon;
import com.truelayer.payments.p419ui.theme.Spacing;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.Converters4;
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.format.FormatStyle;

/* compiled from: MandateDetailsView.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u001aX\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0012X\u008a\u008e\u0002"}, m3636d2 = {"MandateDetailsView", "", "viewData", "Lcom/truelayer/payments/ui/screens/confirmation/MandateConfirmationViewData;", "modifier", "Landroidx/compose/ui/Modifier;", "providerImageSize", "Landroidx/compose/ui/unit/Dp;", "joinerImageWidth", "onSecureLinkClicked", "Lkotlin/Function0;", "onDetailsDialogOpened", "MandateDetailsView-1yyLQnY", "(Lcom/truelayer/payments/ui/screens/confirmation/MandateConfirmationViewData;Landroidx/compose/ui/Modifier;FFLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "MandateDetailsViewPreview", "(Landroidx/compose/runtime/Composer;I)V", "payments-ui_release", "mandateDetailsExpanded", "", "explanationDialogExpanded"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class MandateDetailsViewKt {
    /* renamed from: MandateDetailsView-1yyLQnY, reason: not valid java name */
    public static final void m27100MandateDetailsView1yyLQnY(final MandateConfirmationViewData viewData, Modifier modifier, float f, float f2, Function0<Unit> function0, Function0<Unit> function02, Composer composer, int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1682771326);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        float fM7995constructorimpl = (i2 & 4) != 0 ? C2002Dp.m7995constructorimpl(64) : f;
        float fM7995constructorimpl2 = (i2 & 8) != 0 ? C2002Dp.m7995constructorimpl(144) : f2;
        Function0<Unit> function03 = (i2 & 16) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewKt$MandateDetailsView$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        Function0<Unit> function04 = (i2 & 32) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewKt$MandateDetailsView$2
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
            i3 = i;
            ComposerKt.traceEventStart(-1682771326, i3, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsView (MandateDetailsView.kt:49)");
        } else {
            i3 = i;
        }
        Modifier modifierSemantics = SemanticsModifier6.semantics(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewKt$MandateDetailsView$3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        });
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSemantics);
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
        final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(new Object[]{viewData}, (Saver) null, (String) null, (Function0) new Function0<SnapshotState<Boolean>>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewKt$MandateDetailsView$4$mandateDetailsExpanded$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SnapshotState<Boolean> invoke() {
                return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            }
        }, composerStartRestartGroup, 3080, 6);
        final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(new Object[]{viewData}, (Saver) null, (String) null, (Function0) new Function0<SnapshotState<Boolean>>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewKt$MandateDetailsView$4$explanationDialogExpanded$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SnapshotState<Boolean> invoke() {
                return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            }
        }, composerStartRestartGroup, 3080, 6);
        final Modifier modifier3 = modifier2;
        final float f3 = fM7995constructorimpl2;
        final Function0<Unit> function05 = function03;
        final float f4 = fM7995constructorimpl;
        ResponsiveContainer.ResponsiveContainer(null, null, ResponsiveContainer.confirmationBodyBreakpoints(modifier2), ComposableLambda3.composableLambda(composerStartRestartGroup, -1400949706, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewKt$MandateDetailsView$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier4, Composer composer2, Integer num) throws Resources.NotFoundException {
                invoke(modifier4, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Modifier it, Composer composer2, int i4) throws Resources.NotFoundException {
                int i5;
                Instant javaInstant;
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i4 & 14) == 0) {
                    i5 = i4 | (composer2.changed(it) ? 4 : 2);
                } else {
                    i5 = i4;
                }
                if ((i5 & 91) != 18 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1400949706, i5, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsView.<anonymous>.<anonymous> (MandateDetailsView.kt:60)");
                    }
                    Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                    MandateConfirmationViewData mandateConfirmationViewData = viewData;
                    float f5 = f4;
                    float f6 = f3;
                    Modifier modifier4 = modifier3;
                    final SnapshotState<Boolean> snapshotState3 = snapshotState;
                    final SnapshotState<Boolean> snapshotState4 = snapshotState2;
                    final Function0<Unit> function06 = function05;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(it);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    String strStringResource = StringResources_androidKt.stringResource(C42830R.string.mandate_heading, new Object[]{mandateConfirmationViewData.getProviderName(), mandateConfirmationViewData.getMerchantName()}, composer2, 64);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i6 = MaterialTheme.$stable;
                    TextStyle bodyLarge = materialTheme.getTypography(composer2, i6).getBodyLarge();
                    TextAlign.Companion companion4 = TextAlign.INSTANCE;
                    TextKt.m6028Text4IGK_g(strStringResource, modifierFillMaxWidth$default, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7655copyp1EtxEg$default(bodyLarge, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion4.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 48, 0, 65532);
                    Spacing spacing = Spacing.INSTANCE;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(spacing.m27174getLARGED9Ej5fM() + spacing.m27177getREGULARD9Ej5fM())), composer2, 6);
                    URL merchantIconUrl = mandateConfirmationViewData.getMerchantIconUrl();
                    if (merchantIconUrl == null) {
                        merchantIconUrl = ConfirmationViewData.INSTANCE.getFallbackIconUrl();
                    }
                    String string2 = merchantIconUrl.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    ProviderToMerchantIcons3.m27094ProviderToMerchantIconsnbWgWpA(column62, string2, mandateConfirmationViewData.getProviderIconUrl(), mandateConfirmationViewData.getProviderExtendedIconUrl(), mandateConfirmationViewData.isMerchantRegulated(), f5, f6, composer2, 6, 0);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, spacing.m27179getXLARGED9Ej5fM()), composer2, 6);
                    SurfaceKt.m5967SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), materialTheme.getShapes(composer2, i6).getExtraSmall(), materialTheme.getColorScheme(composer2, i6).getSurfaceVariant(), 0L, 0.0f, 0.0f, null, ComposableLambda3.composableLambda(composer2, -27785657, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewKt$MandateDetailsView$4$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-27785657, i7, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MandateDetailsView.kt:94)");
                                }
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Spacing.INSTANCE.m27177getREGULARD9Ej5fM());
                                Alignment.Companion companion6 = Alignment.INSTANCE;
                                Alignment.Horizontal centerHorizontally3 = companion6.getCenterHorizontally();
                                final SnapshotState<Boolean> snapshotState5 = snapshotState4;
                                final Function0<Unit> function07 = function06;
                                composer3.startReplaceableGroup(-483455358);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally3, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM5142padding3ABfNKs);
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion7.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                Column6 column63 = Column6.INSTANCE;
                                composer3.startReplaceableGroup(-483455358);
                                MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion5);
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor4);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy4, companion7.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                TextWithIcon.m27095TextWithIcon1sVaVRk(StringResources_androidKt.stringResource(C42830R.string.mandate_cancel_anytime, composer3, 0), null, null, 0L, null, null, 0L, composer3, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                composer3.startReplaceableGroup(72103149);
                                Object objRememberedValue = composer3.rememberedValue();
                                Composer.Companion companion8 = Composer.INSTANCE;
                                if (objRememberedValue == companion8.getEmpty()) {
                                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                                composer3.endReplaceableGroup();
                                composer3.startReplaceableGroup(72103278);
                                boolean zChanged = composer3.changed(snapshotState5) | composer3.changed(function07);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue2 == companion8.getEmpty()) {
                                    objRememberedValue2 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewKt$MandateDetailsView$4$1$1$1$1$1$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            MandateDetailsViewKt.MandateDetailsView_1yyLQnY$lambda$6$lambda$3(snapshotState5, true);
                                            function07.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                TextWithIcon.m27095TextWithIcon1sVaVRk(StringResources_androidKt.stringResource(C42830R.string.mandate_secure_and_authorised, composer3, 0), ClickableKt.m4891clickableO2vRcR0$default(companion5, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), null, 0L, null, null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSecondary(), composer3, 0, 60);
                                TextWithIcon.m27095TextWithIcon1sVaVRk(StringResources_androidKt.stringResource(C42830R.string.mandate_connect_once, composer3, 0), null, null, 0L, null, null, 0L, composer3, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 12582912, 120);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, spacing.m27174getLARGED9Ej5fM()), composer2, 6);
                    DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withZone(ZoneId.systemDefault());
                    kotlinx.datetime.Instant validTo = mandateConfirmationViewData.getMandate().getValidTo();
                    String strStringResource2 = (validTo == null || (javaInstant = Converters4.toJavaInstant(validTo)) == null) ? null : dateTimeFormatterWithZone.format(javaInstant);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    int i7 = C42830R.string.mandate_constraints_short_description;
                    String merchantName = mandateConfirmationViewData.getMerchantName();
                    String amount = mandateConfirmationViewData.getCurrency().formatAmount(mandateConfirmationViewData.getMandate().getMaximumIndividualAmount());
                    composer2.startReplaceableGroup(1657485965);
                    if (strStringResource2 == null) {
                        strStringResource2 = StringResources_androidKt.stringResource(C42830R.string.mandate_up_until_cancelled, composer2, 0);
                    }
                    composer2.endReplaceableGroup();
                    TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(i7, new Object[]{merchantName, amount, strStringResource2}, composer2, 64), modifierFillMaxWidth$default2, 0L, 0L, null, null, null, 0L, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i6).getBodyLarge(), composer2, 48, 0, 65020);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, spacing.m27179getXLARGED9Ej5fM()), composer2, 6);
                    composer2.startReplaceableGroup(1657486290);
                    boolean zChanged = composer2.changed(snapshotState3);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewKt$MandateDetailsView$4$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                MandateDetailsViewKt.MandateDetailsView_1yyLQnY$lambda$6$lambda$1(snapshotState3, true);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    OutlinedButton3.OutlinedButton(null, false, (Function0) objRememberedValue, ComposableSingletons$MandateDetailsViewKt.INSTANCE.m27097getLambda1$payments_ui_release(), composer2, 3072, 3);
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
        }), composerStartRestartGroup, 3072, 3);
        composerStartRestartGroup.startReplaceableGroup(8749737);
        if (MandateDetailsView_1yyLQnY$lambda$6$lambda$0(snapshotState)) {
            function04.invoke();
            composerStartRestartGroup.startReplaceableGroup(8749849);
            boolean zChanged = composerStartRestartGroup.changed(snapshotState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewKt$MandateDetailsView$4$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        MandateDetailsViewKt.MandateDetailsView_1yyLQnY$lambda$6$lambda$1(snapshotState, false);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MandateDetailsDialog.MandateDetailsDialog(viewData, (Function0) objRememberedValue, composerStartRestartGroup, 8, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1441843258);
        if (MandateDetailsView_1yyLQnY$lambda$6$lambda$2(snapshotState2)) {
            composerStartRestartGroup.startReplaceableGroup(8749981);
            boolean zChanged2 = composerStartRestartGroup.changed(snapshotState2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewKt$MandateDetailsView$4$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        MandateDetailsViewKt.MandateDetailsView_1yyLQnY$lambda$6$lambda$3(snapshotState2, false);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MandateExplanationDialog3.MandateExplanationDialog((Function0) objRememberedValue2, composerStartRestartGroup, 0, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0<Unit> function06 = function04;
            final int i4 = i3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewKt$MandateDetailsView$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    MandateDetailsViewKt.m27100MandateDetailsView1yyLQnY(viewData, modifier3, f4, f3, function05, function06, composer2, RecomposeScopeImpl4.updateChangedFlags(i4 | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MandateDetailsView_1yyLQnY$lambda$6$lambda$1(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MandateDetailsView_1yyLQnY$lambda$6$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    public static final void MandateDetailsViewPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-243648961);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-243648961, i, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewPreview (MandateDetailsView.kt:164)");
            }
            MaterialTheme2.MaterialTheme(null, null, null, ComposableSingletons$MandateDetailsViewKt.INSTANCE.m27098getLambda2$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateDetailsViewKt.MandateDetailsViewPreview.1
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
                    MandateDetailsViewKt.MandateDetailsViewPreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final boolean MandateDetailsView_1yyLQnY$lambda$6$lambda$0(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean MandateDetailsView_1yyLQnY$lambda$6$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}

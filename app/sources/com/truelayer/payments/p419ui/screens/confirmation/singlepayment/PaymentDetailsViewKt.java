package com.truelayer.payments.p419ui.screens.confirmation.singlepayment;

import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
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
import com.robinhood.iso.countrycode.CountryCode;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.OutlinedButton3;
import com.truelayer.payments.p419ui.components.ResponsiveContainer;
import com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData;
import com.truelayer.payments.p419ui.screens.confirmation.PaymentConfirmationViewData;
import com.truelayer.payments.p419ui.screens.confirmation.components.ProviderToMerchantIcons3;
import com.truelayer.payments.p419ui.theme.Spacing;
import java.net.URL;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaymentDetailsView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\u001aR\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002"}, m3636d2 = {"PaymentDetailsView", "", "viewData", "Lcom/truelayer/payments/ui/screens/confirmation/PaymentConfirmationViewData;", "modifier", "Landroidx/compose/ui/Modifier;", "paymentUseCase", "Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData$PaymentUseCase;", "providerImageSize", "Landroidx/compose/ui/unit/Dp;", "joinerImageWidth", "onHowDoesThisWorkClicked", "Lkotlin/Function0;", "PaymentDetailsView-nSlTg7c", "(Lcom/truelayer/payments/ui/screens/confirmation/PaymentConfirmationViewData;Landroidx/compose/ui/Modifier;Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData$PaymentUseCase;FFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "getUseCaseDetailsText", "", "merchantName", "(Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData$PaymentUseCase;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "getUseCaseText", "(Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData$PaymentUseCase;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "payments-ui_release", "howItWorksExpanded", ""}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PaymentDetailsViewKt {

    /* compiled from: PaymentDetailsView.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfirmationViewData.PaymentUseCase.values().length];
            try {
                iArr[ConfirmationViewData.PaymentUseCase.SinglePayment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConfirmationViewData.PaymentUseCase.SignUpPlus.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: PaymentDetailsView-nSlTg7c, reason: not valid java name */
    public static final void m27103PaymentDetailsViewnSlTg7c(final PaymentConfirmationViewData viewData, Modifier modifier, ConfirmationViewData.PaymentUseCase paymentUseCase, float f, float f2, Function0<Unit> function0, Composer composer, int i, final int i2) {
        int i3;
        String howItWorks;
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        Composer composerStartRestartGroup = composer.startRestartGroup(1865698205);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        ConfirmationViewData.PaymentUseCase paymentUseCase2 = (i2 & 4) != 0 ? ConfirmationViewData.PaymentUseCase.SinglePayment : paymentUseCase;
        float fM7995constructorimpl = (i2 & 8) != 0 ? C2002Dp.m7995constructorimpl(64) : f;
        float fM7995constructorimpl2 = (i2 & 16) != 0 ? C2002Dp.m7995constructorimpl(144) : f2;
        Function0<Unit> function02 = (i2 & 32) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.singlepayment.PaymentDetailsViewKt$PaymentDetailsView$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        if (ComposerKt.isTraceInProgress()) {
            i3 = i;
            ComposerKt.traceEventStart(1865698205, i3, -1, "com.truelayer.payments.ui.screens.confirmation.singlepayment.PaymentDetailsView (PaymentDetailsView.kt:41)");
        } else {
            i3 = i;
        }
        Modifier modifierSemantics = SemanticsModifier6.semantics(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.singlepayment.PaymentDetailsViewKt$PaymentDetailsView$2
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
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
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
        composerStartRestartGroup.startReplaceableGroup(1467343837);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        final ConfirmationViewData.PaymentUseCase paymentUseCase3 = paymentUseCase2;
        final float f3 = fM7995constructorimpl;
        final float f4 = fM7995constructorimpl2;
        final Function0<Unit> function03 = function02;
        ResponsiveContainer.ResponsiveContainer(null, null, ResponsiveContainer.confirmationBodyBreakpoints(Modifier.INSTANCE), ComposableLambda3.composableLambda(composerStartRestartGroup, -1429360279, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.singlepayment.PaymentDetailsViewKt$PaymentDetailsView$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) throws Resources.NotFoundException {
                invoke(modifier3, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Modifier it, Composer composer2, int i4) throws Resources.NotFoundException {
                int i5;
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i4 & 14) == 0) {
                    i5 = i4 | (composer2.changed(it) ? 4 : 2);
                } else {
                    i5 = i4;
                }
                if ((i5 & 91) == 18 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1429360279, i5, -1, "com.truelayer.payments.ui.screens.confirmation.singlepayment.PaymentDetailsView.<anonymous>.<anonymous> (PaymentDetailsView.kt:52)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(it, 0.0f, 1, null);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally2 = companion3.getCenterHorizontally();
                ConfirmationViewData.PaymentUseCase paymentUseCase4 = paymentUseCase3;
                PaymentConfirmationViewData paymentConfirmationViewData = viewData;
                float f5 = f3;
                float f6 = f4;
                final Function0<Unit> function04 = function03;
                final SnapshotState<Boolean> snapshotState2 = snapshotState;
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                Column6 column62 = Column6.INSTANCE;
                String useCaseDetailsText = PaymentDetailsViewKt.getUseCaseDetailsText(paymentUseCase4, paymentConfirmationViewData.getMerchantName(), composer2, 0);
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i6 = MaterialTheme.$stable;
                TextStyle bodyLarge = materialTheme.getTypography(composer2, i6).getBodyLarge();
                TextAlign.Companion companion5 = TextAlign.INSTANCE;
                TextKt.m6028Text4IGK_g(useCaseDetailsText, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7655copyp1EtxEg$default(bodyLarge, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion5.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 0, 0, 65534);
                Modifier.Companion companion6 = Modifier.INSTANCE;
                Spacing spacing = Spacing.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, spacing.m27179getXLARGED9Ej5fM()), composer2, 6);
                URL merchantIconUrl = paymentConfirmationViewData.getMerchantIconUrl();
                if (merchantIconUrl == null) {
                    merchantIconUrl = ConfirmationViewData.INSTANCE.getFallbackIconUrl();
                }
                String string2 = merchantIconUrl.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                ProviderToMerchantIcons3.m27094ProviderToMerchantIconsnbWgWpA(column62, string2, paymentConfirmationViewData.getProviderIconUrl(), paymentConfirmationViewData.getProviderExtendedIconUrl(), paymentConfirmationViewData.isMerchantRegulated(), f5, f6, composer2, 6, 0);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, C2002Dp.m7995constructorimpl(spacing.m27174getLARGED9Ej5fM() + spacing.m27177getREGULARD9Ej5fM())), composer2, 6);
                Modifier modifierSemantics2 = SemanticsModifier6.semantics(companion6, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.singlepayment.PaymentDetailsViewKt$PaymentDetailsView$3$1$1$1
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
                Alignment.Horizontal centerHorizontally3 = companion3.getCenterHorizontally();
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally3, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierSemantics2);
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                TextKt.m6028Text4IGK_g(PaymentDetailsViewKt.getUseCaseText(paymentUseCase4, composer2, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7655copyp1EtxEg$default(materialTheme.getTypography(composer2, i6).getBodyLarge(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion5.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 0, 0, 65534);
                TextKt.m6028Text4IGK_g(paymentConfirmationViewData.getMerchantName(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7655copyp1EtxEg$default(materialTheme.getTypography(composer2, i6).getBodyLarge(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion5.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 0, 0, 65534);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, spacing.m27175getMEDIUMD9Ej5fM()), composer2, 6);
                TextKt.m6028Text4IGK_g(paymentConfirmationViewData.getCurrency().formatAmount(paymentConfirmationViewData.getAmount()), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7655copyp1EtxEg$default(materialTheme.getTypography(composer2, i6).getTitleLarge(), 0L, TextUnit2.getSp(24), FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion5.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744441, null), composer2, 0, 0, 65534);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, spacing.m27174getLARGED9Ej5fM()), composer2, 6);
                composer2.startReplaceableGroup(563841772);
                boolean zChanged = composer2.changed(function04);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.singlepayment.PaymentDetailsViewKt$PaymentDetailsView$3$1$1$3$1
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
                            PaymentDetailsViewKt.PaymentDetailsView_nSlTg7c$lambda$5$lambda$2(snapshotState2, true);
                            function04.invoke();
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                OutlinedButton3.OutlinedButton(null, false, (Function0) objRememberedValue2, ComposableSingletons$PaymentDetailsViewKt.INSTANCE.m27102getLambda1$payments_ui_release(), composer2, 3072, 3);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 3072, 3);
        composerStartRestartGroup.startReplaceableGroup(1082704124);
        if (PaymentDetailsView_nSlTg7c$lambda$5$lambda$1(snapshotState)) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[paymentUseCase3.ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceableGroup(1467346602);
                Legals legals = viewData.getLegals();
                howItWorks = legals != null ? legals.getHowItWorks() : null;
                composerStartRestartGroup.startReplaceableGroup(1467346655);
                if (howItWorks == null) {
                    howItWorks = StringResources_androidKt.stringResource(Intrinsics.areEqual(viewData.getProviderCountryCode(), CountryCode.COUNTRY_CODE_GB) ? C42830R.string.payment_use_case_send_how_it_works_details_uk : C42830R.string.payment_use_case_send_how_it_works_details_eu, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1467347017);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.singlepayment.PaymentDetailsViewKt$PaymentDetailsView$3$2$1
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
                            PaymentDetailsViewKt.PaymentDetailsView_nSlTg7c$lambda$5$lambda$2(snapshotState, false);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                PaymentExplanationDialog.PaymentExplanationDialog(howItWorks, (Function0) objRememberedValue2, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i4 == 2) {
                composerStartRestartGroup.startReplaceableGroup(1467347179);
                Legals legals2 = viewData.getLegals();
                howItWorks = legals2 != null ? legals2.getHowItWorks() : null;
                composerStartRestartGroup.startReplaceableGroup(1467347235);
                if (howItWorks == null) {
                    howItWorks = StringResources_androidKt.stringResource(C42830R.string.payment_use_case_signup_plus_how_it_works_details, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1467347364);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.singlepayment.PaymentDetailsViewKt$PaymentDetailsView$3$3$1
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
                            PaymentDetailsViewKt.PaymentDetailsView_nSlTg7c$lambda$5$lambda$2(snapshotState, false);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                SignupPlusExplanationDialog.SignupPlusExplanationDialog(howItWorks, (Function0) objRememberedValue3, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(1467347454);
                composerStartRestartGroup.endReplaceableGroup();
            }
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
            final Modifier modifier3 = modifier2;
            final int i5 = i3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.singlepayment.PaymentDetailsViewKt$PaymentDetailsView$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    PaymentDetailsViewKt.m27103PaymentDetailsViewnSlTg7c(viewData, modifier3, paymentUseCase3, f3, f4, function03, composer2, RecomposeScopeImpl4.updateChangedFlags(i5 | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PaymentDetailsView_nSlTg7c$lambda$5$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getUseCaseDetailsText(ConfirmationViewData.PaymentUseCase paymentUseCase, String str, Composer composer, int i) throws Resources.NotFoundException {
        String strStringResource;
        composer.startReplaceableGroup(2029424221);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029424221, i, -1, "com.truelayer.payments.ui.screens.confirmation.singlepayment.getUseCaseDetailsText (PaymentDetailsView.kt:145)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[paymentUseCase.ordinal()];
        if (i2 == 1) {
            composer.startReplaceableGroup(346566640);
            strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_use_case_send_details, composer, 0);
            composer.endReplaceableGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceableGroup(346560610);
                composer.endReplaceableGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceableGroup(346566753);
            strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_use_case_signup_plus_details, new Object[]{str}, composer, 64);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getUseCaseText(ConfirmationViewData.PaymentUseCase paymentUseCase, Composer composer, int i) {
        composer.startReplaceableGroup(1860148196);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1860148196, i, -1, "com.truelayer.payments.ui.screens.confirmation.singlepayment.getUseCaseText (PaymentDetailsView.kt:152)");
        }
        if (paymentUseCase == ConfirmationViewData.PaymentUseCase.SinglePayment || paymentUseCase == ConfirmationViewData.PaymentUseCase.SignUpPlus) {
            String strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_use_case_send_title, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return strStringResource;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean PaymentDetailsView_nSlTg7c$lambda$5$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}

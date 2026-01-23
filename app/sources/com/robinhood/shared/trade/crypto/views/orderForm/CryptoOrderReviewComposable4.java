package com.robinhood.shared.trade.crypto.views.orderForm;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderComposable4;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresComposable3;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRow3;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoOrderReviewComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017\"\u001c\u0010\n\u001a\u00020\u000b8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u001c\u0010\u0010\u001a\u00020\u000b8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f\"\u001c\u0010\u0013\u001a\u00020\u000b8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0018"}, m3636d2 = {"CryptoOrderReviewComposable", "", "state", "Lcom/robinhood/shared/trade/crypto/views/orderForm/CryptoOrderReviewComposableState;", "onTap", "Lkotlin/Function1;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/trade/crypto/views/orderForm/CryptoOrderReviewComposableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_ORDER_REVIEW_COMPOSABLE_HEADER_TEST_TAG", "", "getCRYPTO_ORDER_REVIEW_COMPOSABLE_HEADER_TEST_TAG$annotations", "()V", "getCRYPTO_ORDER_REVIEW_COMPOSABLE_HEADER_TEST_TAG", "()Ljava/lang/String;", "CRYPTO_ORDER_REVIEW_COMPOSABLE_REVIEW_ROW_TEST_TAG", "getCRYPTO_ORDER_REVIEW_COMPOSABLE_REVIEW_ROW_TEST_TAG$annotations", "getCRYPTO_ORDER_REVIEW_COMPOSABLE_REVIEW_ROW_TEST_TAG", "CRYPTO_ORDER_REVIEW_COMPOSABLE_REVIEW_MESSAGE_AND_DISCLOSURES_TEST_TAG", "getCRYPTO_ORDER_REVIEW_COMPOSABLE_REVIEW_MESSAGE_AND_DISCLOSURES_TEST_TAG$annotations", "getCRYPTO_ORDER_REVIEW_COMPOSABLE_REVIEW_MESSAGE_AND_DISCLOSURES_TEST_TAG", "CryptoOrderReviewComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.views.orderForm.CryptoOrderReviewComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderReviewComposable4 {
    private static final String CRYPTO_ORDER_REVIEW_COMPOSABLE_HEADER_TEST_TAG = "crypto_order_review_composable_header_test_tag";

    /* renamed from: CRYPTO_ORDER_REVIEW_COMPOSABLE_REVIEW_MESSAGE_AND_DISCLOSURES_TEST_TAG */
    private static final String f6298xa5a1fb13 = "crypto_order_review_composable_review_message_and_disclosures_test_tag";
    private static final String CRYPTO_ORDER_REVIEW_COMPOSABLE_REVIEW_ROW_TEST_TAG = "crypto_order_review_composable_review_row_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderReviewComposable$lambda$2(CryptoOrderReviewComposableState cryptoOrderReviewComposableState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoOrderReviewComposable(cryptoOrderReviewComposableState, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderReviewComposablePreview$lambda$3(int i, Composer composer, int i2) {
        CryptoOrderReviewComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCRYPTO_ORDER_REVIEW_COMPOSABLE_HEADER_TEST_TAG$annotations() {
    }

    /* renamed from: getCRYPTO_ORDER_REVIEW_COMPOSABLE_REVIEW_MESSAGE_AND_DISCLOSURES_TEST_TAG$annotations */
    public static /* synthetic */ void m2940x8ee2a8e9() {
    }

    /* renamed from: getCRYPTO_ORDER_REVIEW_COMPOSABLE_REVIEW_ROW_TEST_TAG$annotations */
    public static /* synthetic */ void m2941xd9749c55() {
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoOrderReviewComposable(final CryptoOrderReviewComposableState state, final Function1<? super CryptoOrderReviewRowState.TapAction, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function1<? super CryptoOrderReviewRowState.TapAction, Unit> onTap = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        Composer composerStartRestartGroup = composer.startRestartGroup(2007624532);
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
            i3 |= composerStartRestartGroup.changedInstance(onTap) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2007624532, i4, -1, "com.robinhood.shared.trade.crypto.views.orderForm.CryptoOrderReviewComposable (CryptoOrderReviewComposable.kt:40)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxSize$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 7, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composer2 = composerStartRestartGroup;
                CryptoOrderHeaderComposable4.CryptoOrderHeaderComposable(state.getHeaderState(), TestTag3.testTag(companion2, CRYPTO_ORDER_REVIEW_COMPOSABLE_HEADER_TEST_TAG), null, composer2, CryptoOrderHeaderState.$stable | 48, 4);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM()), composer2, 0);
                composer2.startReplaceGroup(676297023);
                int i7 = 0;
                for (CryptoOrderReviewRowState cryptoOrderReviewRowState : state.getOrderReviewRowStates()) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Composer composer3 = composer2;
                    CryptoOrderReviewRow3.CryptoOrderReviewRow(cryptoOrderReviewRowState, TestTag3.testTag(Modifier.INSTANCE, CRYPTO_ORDER_REVIEW_COMPOSABLE_REVIEW_ROW_TEST_TAG + i7), onTap, composer3, ((i4 << 3) & 896) | CryptoOrderReviewRowState.$stable, 0);
                    onTap = function1;
                    composer2 = composer3;
                    i7 = i8;
                }
                composer2.endReplaceGroup();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer2, 0);
                CryptoOrderReviewMessageAndDisclosuresComposable3.CryptoOrderReviewMessageAndDisclosuresComposable(state.getReviewMessageAndDisclosuresState(), TestTag3.testTag(companion3, f6298xa5a1fb13), composer2, CryptoOrderReviewMessageAndDisclosuresState.$stable | 48, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.views.orderForm.CryptoOrderReviewComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoOrderReviewComposable4.CryptoOrderReviewComposable$lambda$2(state, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxSize$default2, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 7, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                composer2 = composerStartRestartGroup;
                CryptoOrderHeaderComposable4.CryptoOrderHeaderComposable(state.getHeaderState(), TestTag3.testTag(companion22, CRYPTO_ORDER_REVIEW_COMPOSABLE_HEADER_TEST_TAG), null, composer2, CryptoOrderHeaderState.$stable | 48, 4);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composer2, i62).m21592getMediumD9Ej5fM()), composer2, 0);
                composer2.startReplaceGroup(676297023);
                int i72 = 0;
                while (r8.hasNext()) {
                }
                composer2.endReplaceGroup();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column62, companion32, 1.0f, false, 2, null), composer2, 0);
                CryptoOrderReviewMessageAndDisclosuresComposable3.CryptoOrderReviewMessageAndDisclosuresComposable(state.getReviewMessageAndDisclosuresState(), TestTag3.testTag(companion32, f6298xa5a1fb13), composer2, CryptoOrderReviewMessageAndDisclosuresState.$stable | 48, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final String getCRYPTO_ORDER_REVIEW_COMPOSABLE_HEADER_TEST_TAG() {
        return CRYPTO_ORDER_REVIEW_COMPOSABLE_HEADER_TEST_TAG;
    }

    public static final String getCRYPTO_ORDER_REVIEW_COMPOSABLE_REVIEW_ROW_TEST_TAG() {
        return CRYPTO_ORDER_REVIEW_COMPOSABLE_REVIEW_ROW_TEST_TAG;
    }

    /* renamed from: getCRYPTO_ORDER_REVIEW_COMPOSABLE_REVIEW_MESSAGE_AND_DISCLOSURES_TEST_TAG */
    public static final String m2939x12b281e9() {
        return f6298xa5a1fb13;
    }

    private static final void CryptoOrderReviewComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1855853379);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1855853379, i, -1, "com.robinhood.shared.trade.crypto.views.orderForm.CryptoOrderReviewComposablePreview (CryptoOrderReviewComposable.kt:82)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), CryptoOrderReviewComposable.INSTANCE.getLambda$166778499$feature_trade_crypto_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.views.orderForm.CryptoOrderReviewComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoOrderReviewComposable4.CryptoOrderReviewComposablePreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

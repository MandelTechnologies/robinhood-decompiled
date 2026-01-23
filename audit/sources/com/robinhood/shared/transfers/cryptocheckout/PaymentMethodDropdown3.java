package com.robinhood.shared.transfers.cryptocheckout;

import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodDropdown.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"PaymentMethodDropdownComposable", "", "state", "Lcom/robinhood/shared/transfers/cryptocheckout/PaymentMethodDropdownState;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "(Lcom/robinhood/shared/transfers/cryptocheckout/PaymentMethodDropdownState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "lib-crypto-checkout_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.transfers.cryptocheckout.PaymentMethodDropdownKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class PaymentMethodDropdown3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodDropdownComposable$lambda$0(PaymentMethodDropdownState paymentMethodDropdownState, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        PaymentMethodDropdownComposable(paymentMethodDropdownState, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$1(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentMethodDropdownComposable(final PaymentMethodDropdownState state, Modifier modifier, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1691359066);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
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
                i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1691359066, i3, -1, "com.robinhood.shared.transfers.cryptocheckout.PaymentMethodDropdownComposable (PaymentMethodDropdown.kt:27)");
                }
                int i5 = i3;
                CardDefaults cardDefaults = CardDefaults.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                int i7 = ((i5 >> 6) & 14) | 100663296 | (i5 & 112);
                Modifier modifier5 = modifier4;
                CardKt.Card(onClick, modifier5, false, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), cardDefaults.m5729cardColorsro_MJ88(bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14), null, null, null, ComposableLambda3.rememberComposableLambda(614670213, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.transfers.cryptocheckout.PaymentMethodDropdownKt.PaymentMethodDropdownComposable.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) throws Resources.NotFoundException {
                        invoke(column5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 Card, Composer composer3, int i8) throws Resources.NotFoundException {
                        String textAsString;
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i8 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(614670213, i8, -1, "com.robinhood.shared.transfers.cryptocheckout.PaymentMethodDropdownComposable.<anonymous> (PaymentMethodDropdown.kt:36)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme2.getSpacing(composer3, i9).m21593getSmallD9Ej5fM());
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        PaymentMethodDropdownState paymentMethodDropdownState = state;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoIcon2.m20644BentoIconFU0evQE(paymentMethodDropdownState.getIcon(), null, bentoTheme2.getColors(composer3, i9).m21425getFg0d7_KjU(), null, null, false, composer3, BentoIcon4.Size24.$stable | 48, 56);
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer3, i9).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                        if (paymentMethodDropdownState.getSecondaryText() != null) {
                            composer3.startReplaceGroup(-1284166122);
                            StringResource primaryText = paymentMethodDropdownState.getPrimaryText();
                            int i10 = StringResource.$stable;
                            textAsString = ((Object) StringResources6.getText(primaryText, composer3, i10)) + " · " + ((Object) StringResources6.getText(paymentMethodDropdownState.getSecondaryText(), composer3, i10));
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1284055018);
                            textAsString = StringResources6.getTextAsString(paymentMethodDropdownState.getPrimaryText(), composer3, StringResource.$stable);
                            composer3.endReplaceGroup();
                        }
                        BentoText2.m20747BentoText38GnDrw(textAsString, modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(bentoTheme2.getColors(composer3, i9).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16376);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_DOWN_12), null, bentoTheme2.getColors(composer3, i9).m21425getFg0d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, i7, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.transfers.cryptocheckout.PaymentMethodDropdownKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PaymentMethodDropdown3.PaymentMethodDropdownComposable$lambda$0(state, modifier3, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            int i52 = i3;
            CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            int i72 = ((i52 >> 6) & 14) | 100663296 | (i52 & 112);
            Modifier modifier52 = modifier4;
            CardKt.Card(onClick, modifier52, false, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), cardDefaults2.m5729cardColorsro_MJ88(bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14), null, null, null, ComposableLambda3.rememberComposableLambda(614670213, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.transfers.cryptocheckout.PaymentMethodDropdownKt.PaymentMethodDropdownComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) throws Resources.NotFoundException {
                    invoke(column5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Column5 Card, Composer composer3, int i8) throws Resources.NotFoundException {
                    String textAsString;
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i8 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(614670213, i8, -1, "com.robinhood.shared.transfers.cryptocheckout.PaymentMethodDropdownComposable.<anonymous> (PaymentMethodDropdown.kt:36)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme22.getSpacing(composer3, i9).m21593getSmallD9Ej5fM());
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    PaymentMethodDropdownState paymentMethodDropdownState = state;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoIcon2.m20644BentoIconFU0evQE(paymentMethodDropdownState.getIcon(), null, bentoTheme22.getColors(composer3, i9).m21425getFg0d7_KjU(), null, null, false, composer3, BentoIcon4.Size24.$stable | 48, 56);
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme22.getSpacing(composer3, i9).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                    if (paymentMethodDropdownState.getSecondaryText() != null) {
                        composer3.startReplaceGroup(-1284166122);
                        StringResource primaryText = paymentMethodDropdownState.getPrimaryText();
                        int i10 = StringResource.$stable;
                        textAsString = ((Object) StringResources6.getText(primaryText, composer3, i10)) + " · " + ((Object) StringResources6.getText(paymentMethodDropdownState.getSecondaryText(), composer3, i10));
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1284055018);
                        textAsString = StringResources6.getTextAsString(paymentMethodDropdownState.getPrimaryText(), composer3, StringResource.$stable);
                        composer3.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(textAsString, modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(bentoTheme22.getColors(composer3, i9).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16376);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_DOWN_12), null, bentoTheme22.getColors(composer3, i9).m21425getFg0d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i72, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1994001265);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1994001265, i, -1, "com.robinhood.shared.transfers.cryptocheckout.Preview (PaymentMethodDropdown.kt:65)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, PaymentMethodDropdown.INSTANCE.m26353getLambda$748323031$lib_crypto_checkout_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.transfers.cryptocheckout.PaymentMethodDropdownKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodDropdown3.Preview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

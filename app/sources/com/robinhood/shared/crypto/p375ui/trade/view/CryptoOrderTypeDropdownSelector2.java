package com.robinhood.shared.crypto.p375ui.trade.view;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.shared.crypto.p375ui.C38572R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoOrderTypeDropdownSelector.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderTypeDropdownSelectorKt$CryptoOrderTypeDropdownSelector$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoOrderTypeDropdownSelector2 implements Function3<Column5, Composer, Integer, Unit> {
    final /* synthetic */ Function1<CryptoOrderType, Unit> $onTypeSelected;
    final /* synthetic */ CryptoOrderTypeDropdownSelectorState $state;

    /* JADX WARN: Multi-variable type inference failed */
    CryptoOrderTypeDropdownSelector2(CryptoOrderTypeDropdownSelectorState cryptoOrderTypeDropdownSelectorState, Function1<? super CryptoOrderType, Unit> function1) {
        this.$state = cryptoOrderTypeDropdownSelectorState;
        this.$onTypeSelected = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
        invoke(column5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, CryptoOrderType cryptoOrderType) {
        function1.invoke(cryptoOrderType);
        return Unit.INSTANCE;
    }

    public final void invoke(Column5 DropdownMenu, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        if ((i & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1084043970, i, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderTypeDropdownSelector.<anonymous> (CryptoOrderTypeDropdownSelector.kt:45)");
        }
        ImmutableList<CryptoOrderType> types = this.$state.getTypes();
        final Function1<CryptoOrderType, Unit> function1 = this.$onTypeSelected;
        final CryptoOrderTypeDropdownSelectorState cryptoOrderTypeDropdownSelectorState = this.$state;
        final int i2 = 0;
        for (CryptoOrderType cryptoOrderType : types) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final CryptoOrderType cryptoOrderType2 = cryptoOrderType;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ROW, cryptoOrderType2.getServerValue(), null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.ORDER_TYPE_PICKER, null, null, 6, null), null, null, null, null, 30, null), 15, null), false, false, false, true, false, null, 110, null);
            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1341899570, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderTypeDropdownSelectorKt$CryptoOrderTypeDropdownSelector$1$1$1

                /* compiled from: CryptoOrderTypeDropdownSelector.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderTypeDropdownSelectorKt$CryptoOrderTypeDropdownSelector$1$1$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[CryptoOrderType.values().length];
                        try {
                            iArr[CryptoOrderType.MARKET.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[CryptoOrderType.LIMIT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    int i5;
                    BentoTheme bentoTheme;
                    int i6;
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1341899570, i4, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderTypeDropdownSelector.<anonymous>.<anonymous>.<anonymous> (CryptoOrderTypeDropdownSelector.kt:64)");
                    }
                    int i7 = i2;
                    CryptoOrderTypeDropdownSelectorState cryptoOrderTypeDropdownSelectorState2 = cryptoOrderTypeDropdownSelectorState;
                    CryptoOrderType cryptoOrderType3 = cryptoOrderType2;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
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
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    float fM21590getDefaultD9Ej5fM = bentoTheme2.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM();
                    float fM21590getDefaultD9Ej5fM2 = bentoTheme2.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM();
                    composer3.startReplaceGroup(-1822882921);
                    float fM21593getSmallD9Ej5fM = i7 == 0 ? bentoTheme2.getSpacing(composer3, i8).m21593getSmallD9Ej5fM() : C2002Dp.m7995constructorimpl(12);
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1822879765);
                    float fM21593getSmallD9Ej5fM2 = i7 == CollectionsKt.getLastIndex(cryptoOrderTypeDropdownSelectorState2.getTypes()) ? bentoTheme2.getSpacing(composer3, i8).m21593getSmallD9Ej5fM() : C2002Dp.m7995constructorimpl(12);
                    composer3.endReplaceGroup();
                    Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierFillMaxWidth$default, fM21590getDefaultD9Ej5fM, fM21593getSmallD9Ej5fM, fM21590getDefaultD9Ej5fM2, fM21593getSmallD9Ej5fM2);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer3, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5145paddingqDBjuR0);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Modifier modifierWeight$default = Row5.weight$default(Row6.INSTANCE, companion, 1.0f, false, 2, null);
                    long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer3, i8).m21425getFg0d7_KjU();
                    int i9 = WhenMappings.$EnumSwitchMapping$0[cryptoOrderType3.ordinal()];
                    if (i9 == 1) {
                        i5 = C38572R.string.crypto_order_type_market_label;
                    } else if (i9 == 2) {
                        i5 = C38572R.string.crypto_order_type_limit_label;
                    } else if (i9 == 3) {
                        i5 = C38572R.string.crypto_order_type_stop_loss_label;
                    } else {
                        if (i9 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i5 = C38572R.string.crypto_order_type_stop_limit_label;
                    }
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i5, composer3, 0), modifierWeight$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16376);
                    composer3.startReplaceGroup(-1045306320);
                    if (cryptoOrderTypeDropdownSelectorState2.getSelectedType() == cryptoOrderType3) {
                        bentoTheme = bentoTheme2;
                        i6 = i8;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CHECKMARK_16), null, bentoTheme.getColors(composer3, i6).m21456getPositive0d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                    } else {
                        bentoTheme = bentoTheme2;
                        i6 = i8;
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    composer3.startReplaceGroup(-1822832651);
                    if (i7 != CollectionsKt.getLastIndex(cryptoOrderTypeDropdownSelectorState2.getTypes())) {
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer3, i6).m21427getFg30d7_KjU(), 0.0f, composer3, 0, 5);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54);
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged = composer2.changed(function1) | composer2.changed(cryptoOrderType2.ordinal());
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderTypeDropdownSelectorKt$CryptoOrderTypeDropdownSelector$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoOrderTypeDropdownSelector2.invoke$lambda$2$lambda$1$lambda$0(function1, cryptoOrderType2);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) objRememberedValue, modifierAutoLogEvents$default, null, null, false, null, paddingValuesM5137PaddingValuesYgX7TsA$default, null, composer2, 12582918, 376);
            composer2 = composer;
            i2 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
